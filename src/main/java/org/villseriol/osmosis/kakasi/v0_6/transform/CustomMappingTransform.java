// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import java.util.Map;

import org.apache.commons.text.translate.CharSequenceTranslator;
import org.apache.commons.text.translate.LookupTranslator;
import org.villseriol.osmosis.kakasi.v0_6.transform.decorators.Transform;


public class CustomMappingTransform implements Transform {
    private final CharSequenceTranslator translator;

    public CustomMappingTransform(final Map<CharSequence, CharSequence> replacements) {
        super();

        this.translator = new LookupTranslator(replacements);
    }


    @Override
    public String action(String input) {
        return translator.translate(input);
    }


    @Override
    public void action(StringBuffer input) {
        String result = translator.translate(input.toString());
        input.setLength(0);
        input.append(result);
    }

}
