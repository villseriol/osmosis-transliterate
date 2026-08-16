// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/geometric-shapes/
public class GeometricShapesTransform implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Geometric Shapes block only
        rules.add("::[\\u25A0-\\u25FF];");

        // Squares & fills
        rules.add("■ > '#';");
        rules.add("□ > '[]';");
        rules.add("▢ > '[]';");
        rules.add("▣ > '[#]';");
        rules.add("▤ > '[-]';");
        rules.add("▥ > '[|]';");
        rules.add("▦ > '[+]';");
        rules.add("▧ > '[\\]';");
        rules.add("▨ > '[/]';");
        rules.add("▩ > '[x]';");
        rules.add("▪ > '-';");
        rules.add("▫ > '.';");
        rules.add("▬ > '#';");
        rules.add("▭ > '[]';");
        rules.add("▮ > '#';");
        rules.add("▯ > '[]';");
        rules.add("▰ > '#';");
        rules.add("▱ > '[]';");
        rules.add("◰ > '[]';");
        rules.add("◱ > '[]';");
        rules.add("◲ > '[]';");
        rules.add("◳ > '[]';");
        rules.add("◧ > '[';");
        rules.add("◨ > ']';");
        rules.add("◩ > '[\\';");
        rules.add("◪ > '\\]';");
        rules.add("◫ > '[|]';");
        rules.add("◻ > '[]';");
        rules.add("◼ > '#';");
        rules.add("◽ > '[]';");
        rules.add("◾ > '#';");

        // Triangles
        rules.add("▲ > '^';");
        rules.add("△ > '^';");
        rules.add("▴ > '^';");
        rules.add("▵ > '^';");
        rules.add("▶ > '>';");
        rules.add("▷ > '>';");
        rules.add("▸ > '>';");
        rules.add("▹ > '>';");
        rules.add("► > '>';");
        rules.add("▻ > '>';");
        rules.add("▼ > v;");
        rules.add("▽ > v;");
        rules.add("▾ > v;");
        rules.add("▿ > v;");
        rules.add("◀ > '<';");
        rules.add("◁ > '<';");
        rules.add("◂ > '<';");
        rules.add("◃ > '<';");
        rules.add("◄ > '<';");
        rules.add("◅ > '<';");
        rules.add("◢ > '>';");
        rules.add("◣ > '<';");
        rules.add("◤ > '<';");
        rules.add("◥ > '>';");
        rules.add("◸ > '<';");
        rules.add("◹ > '>';");
        rules.add("◺ > '<';");
        rules.add("◿ > '>';");
        rules.add("◬ > '^.';");
        rules.add("◭ > '^';");
        rules.add("◮ > '^';");

        // Diamonds
        rules.add("◆ > '<*>';");
        rules.add("◇ > '<>';");
        rules.add("◈ > '<o>';");
        rules.add("◊ > '<>';");

        // Circles & fills
        rules.add("○ > o;");
        rules.add("● > '*';");
        rules.add("◯ > o;");
        rules.add("◌ > o;");
        rules.add("◉ > '@';");
        rules.add("◎ > '@';");
        rules.add("◍ > '@';");
        rules.add("◘ > '*';");
        rules.add("◙ > o;");
        rules.add("◦ > '.';");

        // Half/quadrant circles & arcs (approximate — see notes)
        rules.add("◐ > o;");
        rules.add("◑ > o;");
        rules.add("◒ > o;");
        rules.add("◓ > o;");
        rules.add("◔ > o;");
        rules.add("◕ > o;");
        rules.add("◖ > '(';");
        rules.add("◗ > ')';");
        rules.add("◚ > o;");
        rules.add("◛ > o;");
        rules.add("◜ > '(';");
        rules.add("◝ > ')';");
        rules.add("◞ > ')';");
        rules.add("◟ > '(';");
        rules.add("◠ > '^';");
        rules.add("◡ > v;");
        rules.add("◴ > o;");
        rules.add("◵ > o;");
        rules.add("◶ > o;");
        rules.add("◷ > o;");

        TRANSLITERATOR = Transliterator.createFromRules("GeometricShapes-BasicLatin", String.join("\n", rules),
                Transliterator.FORWARD);
    }

    @Override
    public String action(String input) {
        return TRANSLITERATOR.transliterate(input);
    }


    @Override
    public void action(StringBuffer input) {
        TRANSLITERATOR.transliterate(new ReplaceableString(input));
    }
}
