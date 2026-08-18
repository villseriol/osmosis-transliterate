// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GreekAndCopticMapperTest extends GreekMapperTest {

    @Test
    public void testMappedCharacters() {
        assertEquals("i", transform.action("ͺ"));
        assertEquals("´", transform.action("΄"));
        assertEquals("A", transform.action("Ά"));
        assertEquals("E", transform.action("Έ"));
        assertEquals("E", transform.action("Ή"));
        assertEquals("I", transform.action("Ί"));
        assertEquals("O", transform.action("Ό"));
        assertEquals("Y", transform.action("Ύ"));
        assertEquals("O", transform.action("Ώ"));
        assertEquals("i", transform.action("ΐ"));
        assertEquals("A", transform.action("Α"));
        assertEquals("B", transform.action("Β"));
        assertEquals("G", transform.action("Γ"));
        assertEquals("D", transform.action("Δ"));
        assertEquals("E", transform.action("Ε"));
        assertEquals("Z", transform.action("Ζ"));
        assertEquals("E", transform.action("Η"));
        assertEquals("TH", transform.action("Θ"));
        assertEquals("I", transform.action("Ι"));
        assertEquals("K", transform.action("Κ"));
        assertEquals("L", transform.action("Λ"));
        assertEquals("M", transform.action("Μ"));
        assertEquals("N", transform.action("Ν"));
        assertEquals("X", transform.action("Ξ"));
        assertEquals("O", transform.action("Ο"));
        assertEquals("P", transform.action("Π"));
        assertEquals("R", transform.action("Ρ"));
        assertEquals("S", transform.action("Σ"));
        assertEquals("T", transform.action("Τ"));
        assertEquals("Y", transform.action("Υ"));
        assertEquals("PH", transform.action("Φ"));
        assertEquals("CH", transform.action("Χ"));
        assertEquals("PS", transform.action("Ψ"));
        assertEquals("O", transform.action("Ω"));
        assertEquals("I", transform.action("Ϊ"));
        assertEquals("Y", transform.action("Ϋ"));
        assertEquals("a", transform.action("ά"));
        assertEquals("e", transform.action("έ"));
        assertEquals("e", transform.action("ή"));
        assertEquals("i", transform.action("ί"));
        assertEquals("y", transform.action("ΰ"));
        assertEquals("a", transform.action("α"));
        assertEquals("b", transform.action("β"));
        assertEquals("g", transform.action("γ"));
        assertEquals("d", transform.action("δ"));
        assertEquals("e", transform.action("ε"));
        assertEquals("z", transform.action("ζ"));
        assertEquals("e", transform.action("η"));
        assertEquals("th", transform.action("θ"));
        assertEquals("i", transform.action("ι"));
        assertEquals("k", transform.action("κ"));
        assertEquals("l", transform.action("λ"));
        assertEquals("m", transform.action("μ"));
        assertEquals("n", transform.action("ν"));
        assertEquals("x", transform.action("ξ"));
        assertEquals("o", transform.action("ο"));
        assertEquals("p", transform.action("π"));
        assertEquals("r", transform.action("ρ"));
        assertEquals("s", transform.action("ς"));
        assertEquals("s", transform.action("σ"));
        assertEquals("t", transform.action("τ"));
        assertEquals("y", transform.action("υ"));
        assertEquals("ph", transform.action("φ"));
        assertEquals("ch", transform.action("χ"));
        assertEquals("ps", transform.action("ψ"));
        assertEquals("o", transform.action("ω"));
        assertEquals("i", transform.action("ϊ"));
        assertEquals("y", transform.action("ϋ"));
        assertEquals("o", transform.action("ό"));
        assertEquals("y", transform.action("ύ"));
        assertEquals("o", transform.action("ώ"));
        assertEquals("b", transform.action("ϐ"));
        assertEquals("th", transform.action("ϑ"));
        assertEquals("Y", transform.action("ϒ"));
        assertEquals("Y", transform.action("ϓ"));
        assertEquals("Y", transform.action("ϔ"));
        assertEquals("ph", transform.action("ϕ"));
        assertEquals("p", transform.action("ϖ"));
        assertEquals("k", transform.action("ϰ"));
        assertEquals("r", transform.action("ϱ"));
        assertEquals("s", transform.action("ϲ"));
        assertEquals("j", transform.action("ϳ"));
        assertEquals("TH", transform.action("ϴ"));
        assertEquals("e", transform.action("ϵ"));
        assertEquals("S", transform.action("Ϸ"));
        assertEquals("s", transform.action("ϸ"));
        assertEquals("S", transform.action("Ϲ"));
        assertEquals("S", transform.action("Ϻ"));
        assertEquals("s", transform.action("ϻ"));
    }


    @Test
    public void testUnmappedCharacters() {
        assertEquals("Ͱ", transform.action("Ͱ"));
        assertEquals("ͱ", transform.action("ͱ"));
        assertEquals("Ͳ", transform.action("Ͳ"));
        assertEquals("ͳ", transform.action("ͳ"));
        assertEquals("͵", transform.action("͵"));
        assertEquals("Ͷ", transform.action("Ͷ"));
        assertEquals("ͷ", transform.action("ͷ"));
        assertEquals("ͻ", transform.action("ͻ"));
        assertEquals("ͼ", transform.action("ͼ"));
        assertEquals("ͽ", transform.action("ͽ"));
        assertEquals("Ϳ", transform.action("Ϳ"));
        assertEquals("Ϗ", transform.action("Ϗ"));
        assertEquals("ϗ", transform.action("ϗ"));
        assertEquals("Ϙ", transform.action("Ϙ"));
        assertEquals("ϙ", transform.action("ϙ"));
        assertEquals("Ϛ", transform.action("Ϛ"));
        assertEquals("ϛ", transform.action("ϛ"));
        assertEquals("Ϝ", transform.action("Ϝ"));
        assertEquals("ϝ", transform.action("ϝ"));
        assertEquals("Ϟ", transform.action("Ϟ"));
        assertEquals("ϟ", transform.action("ϟ"));
        assertEquals("Ϡ", transform.action("Ϡ"));
        assertEquals("ϡ", transform.action("ϡ"));
        assertEquals("϶", transform.action("϶"));
        assertEquals("ϼ", transform.action("ϼ"));
        assertEquals("Ͻ", transform.action("Ͻ"));
        assertEquals("Ͼ", transform.action("Ͼ"));
        assertEquals("Ͽ", transform.action("Ͽ"));
    }
}
