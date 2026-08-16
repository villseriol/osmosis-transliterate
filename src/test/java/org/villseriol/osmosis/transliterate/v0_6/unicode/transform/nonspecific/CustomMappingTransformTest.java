// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.transform.nonspecific;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class CustomMappingTransformTest {

    @Test
    public void testSingleCharacterReplacement() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();
        replacements.put("・", "·");

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        assertEquals("·", transform.action("・"));
    }


    @Test
    public void testMultipleValuesMapToSameReplacement() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();
        replacements.put("・", "·");
        replacements.put("･", "·");
        replacements.put("•", "·");

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        assertEquals("·", transform.action("・"));
        assertEquals("·", transform.action("･"));
        assertEquals("·", transform.action("•"));
    }


    @Test
    public void testMultiCharacterReplacement() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();
        replacements.put("》", "<<");
        replacements.put("〈", "<");

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        assertEquals("<<", transform.action("》"));
        assertEquals("<", transform.action("〈"));
    }


    @Test
    public void testEmptyReplacementValue() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();
        replacements.put("　", "");

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        assertEquals("", transform.action("　"));
    }


    @Test
    public void testUnmappedInputIsUnchanged() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();
        replacements.put("・", "·");

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        assertEquals("no matches here", transform.action("no matches here"));
    }


    @Test
    public void testMappedAndUnmappedCharactersMixed() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();
        replacements.put("・", "·");
        replacements.put("ʻ", "'");

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        assertEquals("東京·大阪'ガーデン", transform.action("東京・大阪ʻガーデン"));
    }


    @Test
    public void testEmptyMap() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        assertEquals("unchanged", transform.action("unchanged"));
    }


    @Test
    public void testEmptyInput() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();
        replacements.put("・", "·");

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        assertEquals("", transform.action(""));
    }


    @Test
    public void testActionOnStringBuffer() {
        Map<CharSequence, CharSequence> replacements = new HashMap<>();
        replacements.put("・", "·");
        replacements.put("〈", "<");

        CustomMappingTransform transform = new CustomMappingTransform(replacements);

        StringBuffer buffer = new StringBuffer("珈亜・ガーデン〈テスト〉");
        transform.action(buffer);

        assertEquals("珈亜·ガーデン<テスト〉", buffer.toString());
    }
}
