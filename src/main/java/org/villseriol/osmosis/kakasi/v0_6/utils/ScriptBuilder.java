// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Supplier;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;
import org.villseriol.osmosis.kakasi.v0_6.KakasiPipelineContext;


public class ScriptBuilder {
    private static final String CLASSPATH_PREFIX = "classpath:";

    private final ScriptEvaluator scriptEvaluator;

    public ScriptBuilder() {
        super();

        scriptEvaluator = new ScriptEvaluator();
        scriptEvaluator.setReturnType(boolean.class);

        // @formatter:off
        scriptEvaluator.setParameters(new String[] {"ctx"}, new Class<?>[] {KakasiPipelineContext.class});
        // @formatter:on
    }


    public ScriptBuilder useFile(String path) {
        if (path.startsWith(CLASSPATH_PREFIX)) {
            String resourcePath = path.substring(CLASSPATH_PREFIX.length());

            try (InputStream in = ScriptBuilder.class.getResourceAsStream(resourcePath)) {
                if (in == null) {
                    throw new IllegalArgumentException("Classpath resource not found: " + resourcePath);
                }

                scriptEvaluator.cook(resourcePath, in);
            } catch (CompileException | IOException e) {
                throw new IllegalArgumentException("Failed to compile script from classpath: " + resourcePath, e);
            }

            return this;
        }

        Path filePath = Path.of(path);

        try (InputStream in = Files.newInputStream(filePath)) {
            scriptEvaluator.cook(filePath.getFileName().toString(), in);
        } catch (CompileException | IOException e) {
            throw new IllegalArgumentException("Failed to compile script from file: " + filePath, e);
        }

        return this;
    }


    public ScriptBuilder useExpression(String expression) {
        try {
            scriptEvaluator.cook(expression);
        } catch (CompileException e) {
            throw new IllegalArgumentException("Failed to compile script", e);
        }

        return this;
    }


    public Supplier<Boolean> build(KakasiPipelineContext ctx) {
        return () -> {
            try {
                // @formatter:off
                return (boolean) scriptEvaluator.evaluate(new Object[] {ctx});
                // @formatter:on
            } catch (InvocationTargetException e) {
                throw new IllegalStateException("Failed to evaluate script", e);
            }
        };
    }
}
