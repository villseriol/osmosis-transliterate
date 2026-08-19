// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.decorator;

import java.util.logging.Logger;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;


public class TransformLogDecorator extends TransformDecorator {
    private static final Logger LOG = Logger.getLogger(TransformLogDecorator.class.getName());

    public TransformLogDecorator(Unimap target) {
        super(target);
    }


    @Override
    public String action(String input) {
        String output = getTarget().action(input);

        LOG.fine(getTarget().getClass().getSimpleName() + ": '" + input + "' -> '" + output + "'");

        return output;
    }


    @Override
    public void action(StringBuffer input) {
        String before = input.toString();
        getTarget().action(input);

        LOG.fine(getTarget().getClass().getSimpleName() + ": '" + before + "' -> '" + input + "'");
    }
}
