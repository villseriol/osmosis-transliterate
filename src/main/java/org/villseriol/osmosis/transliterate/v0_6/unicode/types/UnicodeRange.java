// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.types;

/**
 * Represents a Unicode block (character range), as defined by the Unicode
 * Character Database "Blocks.txt".
 *
 * Each constant is defined as NAME(lower, upper), where lower and upper are the
 * inclusive first and last code points of the block.
 */
public enum UnicodeRange {
    /**
     * Basic Latin.
     *
     * https://www.unicodepedia.com/groups/basic-latin/
     */
    BASIC_LATIN(0x0, 0x7F),
    /**
     * Latin-1 Supplement.
     *
     * https://www.unicodepedia.com/groups/latin-1-supplement/
     */
    LATIN_1_SUPPLEMENT(0x80, 0xFF),
    /**
     * Latin Extended-A.
     *
     * https://www.unicodepedia.com/groups/latin-extended-a/
     */
    LATIN_EXTENDED_A(0x100, 0x17F),
    /**
     * Latin Extended-B.
     *
     * https://www.unicodepedia.com/groups/latin-extended-b/
     */
    LATIN_EXTENDED_B(0x180, 0x24F),
    /**
     * IPA Extensions.
     *
     * https://www.unicodepedia.com/groups/ipa-extensions/
     */
    IPA_EXTENSIONS(0x250, 0x2AF),
    /**
     * Spacing Modifier Letters.
     *
     * https://www.unicodepedia.com/groups/spacing-modifier-letters/
     */
    SPACING_MODIFIER_LETTERS(0x2B0, 0x2FF),
    /**
     * Combining Diacritical Marks.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks/
     */
    COMBINING_DIACRITICAL_MARKS(0x300, 0x36F),
    /**
     * Greek and Coptic.
     *
     * https://www.unicodepedia.com/groups/greek-and-coptic/
     */
    GREEK_AND_COPTIC(0x370, 0x3FF),
    /**
     * Cyrillic.
     *
     * https://www.unicodepedia.com/groups/cyrillic/
     */
    CYRILLIC(0x400, 0x4FF),
    /**
     * Cyrillic Supplement.
     *
     * https://www.unicodepedia.com/groups/cyrillic-supplement/
     */
    CYRILLIC_SUPPLEMENT(0x500, 0x527),
    /**
     * Armenian.
     *
     * https://www.unicodepedia.com/groups/armenian/
     */
    ARMENIAN(0x531, 0x58A),
    /**
     * Hebrew.
     *
     * https://www.unicodepedia.com/groups/hebrew/
     */
    HEBREW(0x591, 0x5F4),
    /**
     * Arabic.
     *
     * https://www.unicodepedia.com/groups/arabic/
     */
    ARABIC(0x600, 0x6FF),
    /**
     * Syriac.
     *
     * https://www.unicodepedia.com/groups/syriac/
     */
    SYRIAC(0x700, 0x74F),
    /**
     * Arabic Supplement.
     *
     * https://www.unicodepedia.com/groups/arabic-supplement/
     */
    ARABIC_SUPPLEMENT(0x750, 0x77F),
    /**
     * Thaana.
     *
     * https://www.unicodepedia.com/groups/thaana/
     */
    THAANA(0x780, 0x7B1),
    /**
     * NKo.
     *
     * https://www.unicodepedia.com/groups/nko/
     */
    NKO(0x7C0, 0x7FA),
    /**
     * Samaritan.
     *
     * https://www.unicodepedia.com/groups/samaritan/
     */
    SAMARITAN(0x800, 0x83E),
    /**
     * Mandaic.
     *
     * https://www.unicodepedia.com/groups/mandaic/
     */
    MANDAIC(0x840, 0x85E),
    /**
     * Devanagari.
     *
     * https://www.unicodepedia.com/groups/devanagari/
     */
    DEVANAGARI(0x900, 0x97F),
    /**
     * Bengali.
     *
     * https://www.unicodepedia.com/groups/bengali/
     */
    BENGALI(0x981, 0x9FB),
    /**
     * Gurmukhi.
     *
     * https://www.unicodepedia.com/groups/gurmukhi/
     */
    GURMUKHI(0xA01, 0xA75),
    /**
     * Gujarati.
     *
     * https://www.unicodepedia.com/groups/gujarati/
     */
    GUJARATI(0xA81, 0xAF1),
    /**
     * Oriya.
     *
     * https://www.unicodepedia.com/groups/oriya/
     */
    ORIYA(0xB01, 0xB77),
    /**
     * Tamil.
     *
     * https://www.unicodepedia.com/groups/tamil/
     */
    TAMIL(0xB82, 0xBFA),
    /**
     * Telugu.
     *
     * https://www.unicodepedia.com/groups/telugu/
     */
    TELUGU(0xC01, 0xC7F),
    /**
     * Kannada.
     *
     * https://www.unicodepedia.com/groups/kannada/
     */
    KANNADA(0xC82, 0xCF2),
    /**
     * Malayalam.
     *
     * https://www.unicodepedia.com/groups/malayalam/
     */
    MALAYALAM(0xD02, 0xD7F),
    /**
     * Sinhala.
     *
     * https://www.unicodepedia.com/groups/sinhala/
     */
    SINHALA(0xD82, 0xDF4),
    /**
     * Thai.
     *
     * https://www.unicodepedia.com/groups/thai/
     */
    THAI(0xE01, 0xE5B),
    /**
     * Lao.
     *
     * https://www.unicodepedia.com/groups/lao/
     */
    LAO(0xE81, 0xEDD),
    /**
     * Tibetan.
     *
     * https://www.unicodepedia.com/groups/tibetan/
     */
    TIBETAN(0xF00, 0xFDA),
    /**
     * Myanmar.
     *
     * https://www.unicodepedia.com/groups/myanmar/
     */
    MYANMAR(0x1000, 0x109F),
    /**
     * Georgian.
     *
     * https://www.unicodepedia.com/groups/georgian/
     */
    GEORGIAN(0x10A0, 0x10FC),
    /**
     * Hangul Jamo.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo/
     */
    HANGUL_JAMO(0x1100, 0x11FF),
    /**
     * Ethiopic.
     *
     * https://www.unicodepedia.com/groups/ethiopic/
     */
    ETHIOPIC(0x1200, 0x137C),
    /**
     * Ethiopic Supplement.
     *
     * https://www.unicodepedia.com/groups/ethiopic-supplement/
     */
    ETHIOPIC_SUPPLEMENT(0x1380, 0x1399),
    /**
     * Cherokee.
     *
     * https://www.unicodepedia.com/groups/cherokee/
     */
    CHEROKEE(0x13A0, 0x13F4),
    /**
     * Unified Canadian Aboriginal Syllabics.
     *
     * https://www.unicodepedia.com/groups/unified-canadian-aboriginal-syllabics/
     */
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS(0x1400, 0x167F),
    /**
     * Ogham.
     *
     * https://www.unicodepedia.com/groups/ogham/
     */
    OGHAM(0x1680, 0x169C),
    /**
     * Runic.
     *
     * https://www.unicodepedia.com/groups/runic/
     */
    RUNIC(0x16A0, 0x16F0),
    /**
     * Tagalog.
     *
     * https://www.unicodepedia.com/groups/tagalog/
     */
    TAGALOG(0x1700, 0x1714),
    /**
     * Hanunoo.
     *
     * https://www.unicodepedia.com/groups/hanunoo/
     */
    HANUNOO(0x1720, 0x1736),
    /**
     * Buhid.
     *
     * https://www.unicodepedia.com/groups/buhid/
     */
    BUHID(0x1740, 0x1753),
    /**
     * Tagbanwa.
     *
     * https://www.unicodepedia.com/groups/tagbanwa/
     */
    TAGBANWA(0x1760, 0x1773),
    /**
     * Khmer.
     *
     * https://www.unicodepedia.com/groups/khmer/
     */
    KHMER(0x1780, 0x17F9),
    /**
     * Mongolian.
     *
     * https://www.unicodepedia.com/groups/mongolian/
     */
    MONGOLIAN(0x1800, 0x18AA),
    /**
     * Unified Canadian Aboriginal Syllabics Extended.
     *
     * https://www.unicodepedia.com/groups/unified-canadian-aboriginal-syllabics-extended/
     */
    UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS_EXTENDED(0x18B0, 0x18F5),
    /**
     * Limbu.
     *
     * https://www.unicodepedia.com/groups/limbu/
     */
    LIMBU(0x1900, 0x194F),
    /**
     * Tai Le.
     *
     * https://www.unicodepedia.com/groups/tai-le/
     */
    TAI_LE(0x1950, 0x1974),
    /**
     * New Tai Lue.
     *
     * https://www.unicodepedia.com/groups/new-tai-lue/
     */
    NEW_TAI_LUE(0x1980, 0x19DF),
    /**
     * Khmer Symbols.
     *
     * https://www.unicodepedia.com/groups/khmer-symbols/
     */
    KHMER_SYMBOLS(0x19E0, 0x19FF),
    /**
     * Buginese.
     *
     * https://www.unicodepedia.com/groups/buginese/
     */
    BUGINESE(0x1A00, 0x1A1F),
    /**
     * Tai Tham.
     *
     * https://www.unicodepedia.com/groups/tai-tham/
     */
    TAI_THAM(0x1A20, 0x1AAD),
    /**
     * Balinese.
     *
     * https://www.unicodepedia.com/groups/balinese/
     */
    BALINESE(0x1B00, 0x1B7C),
    /**
     * Sundanese.
     *
     * https://www.unicodepedia.com/groups/sundanese/
     */
    SUNDANESE(0x1B80, 0x1BB9),
    /**
     * Batak.
     *
     * https://www.unicodepedia.com/groups/batak/
     */
    BATAK(0x1BC0, 0x1BFF),
    /**
     * Lepcha.
     *
     * https://www.unicodepedia.com/groups/lepcha/
     */
    LEPCHA(0x1C00, 0x1C4F),
    /**
     * Ol Chiki.
     *
     * https://www.unicodepedia.com/groups/ol-chiki/
     */
    OL_CHIKI(0x1C50, 0x1C7F),
    /**
     * Vedic Extensions.
     *
     * https://www.unicodepedia.com/groups/vedic-extensions/
     */
    VEDIC_EXTENSIONS(0x1CD0, 0x1CF2),
    /**
     * Phonetic Extensions.
     *
     * https://www.unicodepedia.com/groups/phonetic-extensions/
     */
    PHONETIC_EXTENSIONS(0x1D00, 0x1D7F),
    /**
     * Phonetic Extensions Supplement.
     *
     * https://www.unicodepedia.com/groups/phonetic-extensions-supplement/
     */
    PHONETIC_EXTENSIONS_SUPPLEMENT(0x1D80, 0x1DBF),
    /**
     * Combining Diacritical Marks Supplement.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks-supplement/
     */
    COMBINING_DIACRITICAL_MARKS_SUPPLEMENT(0x1DC0, 0x1DFF),
    /**
     * Latin Extended Additional.
     *
     * https://www.unicodepedia.com/groups/latin-extended-additional/
     */
    LATIN_EXTENDED_ADDITIONAL(0x1E00, 0x1EFF),
    /**
     * Greek Extended.
     *
     * https://www.unicodepedia.com/groups/greek-extended/
     */
    GREEK_EXTENDED(0x1F00, 0x1FFE),
    /**
     * General Punctuation.
     *
     * https://www.unicodepedia.com/groups/general-punctuation/
     */
    GENERAL_PUNCTUATION(0x2000, 0x206F),
    /**
     * Superscripts and Subscripts.
     *
     * https://www.unicodepedia.com/groups/superscripts-and-subscripts/
     */
    SUPERSCRIPTS_AND_SUBSCRIPTS(0x2070, 0x209C),
    /**
     * Currency Symbols.
     *
     * https://www.unicodepedia.com/groups/currency-symbols/
     */
    CURRENCY_SYMBOLS(0x20A0, 0x20B9),
    /**
     * Combining Diacritical Marks for Symbols.
     *
     * https://www.unicodepedia.com/groups/combining-diacritical-marks-for-symbols/
     */
    COMBINING_DIACRITICAL_MARKS_FOR_SYMBOLS(0x20D0, 0x20F0),
    /**
     * Letterlike Symbols.
     *
     * https://www.unicodepedia.com/groups/letterlike-symbols/
     */
    LETTERLIKE_SYMBOLS(0x2100, 0x214F),
    /**
     * Number Forms.
     *
     * https://www.unicodepedia.com/groups/number-forms/
     */
    NUMBER_FORMS(0x2150, 0x2189),
    /**
     * Arrows.
     *
     * https://www.unicodepedia.com/groups/arrows/
     */
    ARROWS(0x2190, 0x21FF),
    /**
     * Mathematical Operators.
     *
     * https://www.unicodepedia.com/groups/mathematical-operators/
     */
    MATHEMATICAL_OPERATORS(0x2200, 0x22FF),
    /**
     * Miscellaneous Technical.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-technical/
     */
    MISCELLANEOUS_TECHNICAL(0x2300, 0x23F3),
    /**
     * Control Pictures.
     *
     * https://www.unicodepedia.com/groups/control-pictures/
     */
    CONTROL_PICTURES(0x2400, 0x2426),
    /**
     * Optical Character Recognition.
     *
     * https://www.unicodepedia.com/groups/optical-character-recognition/
     */
    OPTICAL_CHARACTER_RECOGNITION(0x2440, 0x244A),
    /**
     * Enclosed Alphanumerics.
     *
     * https://www.unicodepedia.com/groups/enclosed-alphanumerics/
     */
    ENCLOSED_ALPHANUMERICS(0x2460, 0x24FF),
    /**
     * Box Drawing.
     *
     * https://www.unicodepedia.com/groups/box-drawing/
     */
    BOX_DRAWING(0x2500, 0x257F),
    /**
     * Block Elements.
     *
     * https://www.unicodepedia.com/groups/block-elements/
     */
    BLOCK_ELEMENTS(0x2580, 0x259F),
    /**
     * Geometric Shapes.
     *
     * https://www.unicodepedia.com/groups/geometric-shapes/
     */
    GEOMETRIC_SHAPES(0x25A0, 0x25FF),
    /**
     * Miscellaneous Symbols.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols/
     */
    MISCELLANEOUS_SYMBOLS(0x2600, 0x26FF),
    /**
     * Dingbats.
     *
     * https://www.unicodepedia.com/groups/dingbats/
     */
    DINGBATS(0x2701, 0x27BF),
    /**
     * Miscellaneous Mathematical Symbols-A.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-mathematical-symbols-a/
     */
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_A(0x27C0, 0x27EF),
    /**
     * Supplemental Arrows-A.
     *
     * https://www.unicodepedia.com/groups/supplemental-arrows-a/
     */
    SUPPLEMENTAL_ARROWS_A(0x27F0, 0x27FF),
    /**
     * Braille Patterns.
     *
     * https://www.unicodepedia.com/groups/braille-patterns/
     */
    BRAILLE_PATTERNS(0x2800, 0x28FF),
    /**
     * Supplemental Arrows-B.
     *
     * https://www.unicodepedia.com/groups/supplemental-arrows-b/
     */
    SUPPLEMENTAL_ARROWS_B(0x2900, 0x297F),
    /**
     * Miscellaneous Mathematical Symbols-B.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-mathematical-symbols-b/
     */
    MISCELLANEOUS_MATHEMATICAL_SYMBOLS_B(0x2980, 0x29FF),
    /**
     * Supplemental Mathematical Operators.
     *
     * https://www.unicodepedia.com/groups/supplemental-mathematical-operators/
     */
    SUPPLEMENTAL_MATHEMATICAL_OPERATORS(0x2A00, 0x2AFF),
    /**
     * Miscellaneous Symbols and Arrows.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols-and-arrows/
     */
    MISCELLANEOUS_SYMBOLS_AND_ARROWS(0x2B00, 0x2B59),
    /**
     * Glagolitic.
     *
     * https://www.unicodepedia.com/groups/glagolitic/
     */
    GLAGOLITIC(0x2C00, 0x2C5E),
    /**
     * Latin Extended-C.
     *
     * https://www.unicodepedia.com/groups/latin-extended-c/
     */
    LATIN_EXTENDED_C(0x2C60, 0x2C7F),
    /**
     * Coptic.
     *
     * https://www.unicodepedia.com/groups/coptic/
     */
    COPTIC(0x2C80, 0x2CFF),
    /**
     * Georgian Supplement.
     *
     * https://www.unicodepedia.com/groups/georgian-supplement/
     */
    GEORGIAN_SUPPLEMENT(0x2D00, 0x2D25),
    /**
     * Tifinagh.
     *
     * https://www.unicodepedia.com/groups/tifinagh/
     */
    TIFINAGH(0x2D30, 0x2D7F),
    /**
     * Ethiopic Extended.
     *
     * https://www.unicodepedia.com/groups/ethiopic-extended/
     */
    ETHIOPIC_EXTENDED(0x2D80, 0x2DDE),
    /**
     * Cyrillic Extended-A.
     *
     * https://www.unicodepedia.com/groups/cyrillic-extended-a/
     */
    CYRILLIC_EXTENDED_A(0x2DE0, 0x2DFF),
    /**
     * Supplemental Punctuation.
     *
     * https://www.unicodepedia.com/groups/supplemental-punctuation/
     */
    SUPPLEMENTAL_PUNCTUATION(0x2E00, 0x2E31),
    /**
     * CJK Radicals Supplement.
     *
     * https://www.unicodepedia.com/groups/cjk-radicals-supplement/
     */
    CJK_RADICALS_SUPPLEMENT(0x2E80, 0x2EF3),
    /**
     * Kangxi Radicals.
     *
     * https://www.unicodepedia.com/groups/kangxi-radicals/
     */
    KANGXI_RADICALS(0x2F00, 0x2FD5),
    /**
     * Ideographic Description Characters.
     *
     * https://www.unicodepedia.com/groups/ideographic-description-characters/
     */
    IDEOGRAPHIC_DESCRIPTION_CHARACTERS(0x2FF0, 0x2FFB),
    /**
     * CJK Symbols and Punctuation.
     *
     * https://www.unicodepedia.com/groups/cjk-symbols-and-punctuation/
     */
    CJK_SYMBOLS_AND_PUNCTUATION(0x3000, 0x303F),
    /**
     * Hiragana.
     *
     * https://www.unicodepedia.com/groups/hiragana/
     */
    HIRAGANA(0x3041, 0x309F),
    /**
     * Katakana.
     *
     * https://www.unicodepedia.com/groups/katakana/
     */
    KATAKANA(0x30A0, 0x30FF),
    /**
     * Bopomofo.
     *
     * https://www.unicodepedia.com/groups/bopomofo/
     */
    BOPOMOFO(0x3105, 0x312D),
    /**
     * Hangul Compatibility Jamo.
     *
     * https://www.unicodepedia.com/groups/hangul-compatibility-jamo/
     */
    HANGUL_COMPATIBILITY_JAMO(0x3131, 0x318E),
    /**
     * Kanbun.
     *
     * https://www.unicodepedia.com/groups/kanbun/
     */
    KANBUN(0x3190, 0x319F),
    /**
     * Bopomofo Extended.
     *
     * https://www.unicodepedia.com/groups/bopomofo-extended/
     */
    BOPOMOFO_EXTENDED(0x31A0, 0x31BA),
    /**
     * CJK Strokes.
     *
     * https://www.unicodepedia.com/groups/cjk-strokes/
     */
    CJK_STROKES(0x31C0, 0x31E3),
    /**
     * Katakana Phonetic Extensions.
     *
     * https://www.unicodepedia.com/groups/katakana-phonetic-extensions/
     */
    KATAKANA_PHONETIC_EXTENSIONS(0x31F0, 0x31FF),
    /**
     * Enclosed CJK Letters and Months.
     *
     * https://www.unicodepedia.com/groups/enclosed-cjk-letters-and-months/
     */
    ENCLOSED_CJK_LETTERS_AND_MONTHS(0x3200, 0x32FE),
    /**
     * CJK Compatibility.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility/
     */
    CJK_COMPATIBILITY(0x3300, 0x33FF),
    /**
     * CJK Unified Ideographs Extension A.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-a/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A(0x3400, 0x4DB5),
    /**
     * Yijing Hexagram Symbols.
     *
     * https://www.unicodepedia.com/groups/yijing-hexagram-symbols/
     */
    YIJING_HEXAGRAM_SYMBOLS(0x4DC0, 0x4DFF),
    /**
     * CJK Unified Ideographs.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs/
     */
    CJK_UNIFIED_IDEOGRAPHS(0x4E00, 0x9FCB),
    /**
     * Yi Syllables.
     *
     * https://www.unicodepedia.com/groups/yi-syllables/
     */
    YI_SYLLABLES(0xA000, 0xA48C),
    /**
     * Yi Radicals.
     *
     * https://www.unicodepedia.com/groups/yi-radicals/
     */
    YI_RADICALS(0xA490, 0xA4C6),
    /**
     * Lisu.
     *
     * https://www.unicodepedia.com/groups/lisu/
     */
    LISU(0xA4D0, 0xA4FF),
    /**
     * Vai.
     *
     * https://www.unicodepedia.com/groups/vai/
     */
    VAI(0xA500, 0xA62B),
    /**
     * Cyrillic Extended-B.
     *
     * https://www.unicodepedia.com/groups/cyrillic-extended-b/
     */
    CYRILLIC_EXTENDED_B(0xA640, 0xA697),
    /**
     * Bamum.
     *
     * https://www.unicodepedia.com/groups/bamum/
     */
    BAMUM(0xA6A0, 0xA6F7),
    /**
     * Modifier Tone Letters.
     *
     * https://www.unicodepedia.com/groups/modifier-tone-letters/
     */
    MODIFIER_TONE_LETTERS(0xA700, 0xA71F),
    /**
     * Latin Extended-D.
     *
     * https://www.unicodepedia.com/groups/latin-extended-d/
     */
    LATIN_EXTENDED_D(0xA720, 0xA7FF),
    /**
     * Syloti Nagri.
     *
     * https://www.unicodepedia.com/groups/syloti-nagri/
     */
    SYLOTI_NAGRI(0xA800, 0xA82B),
    /**
     * Common Indic Number Forms.
     *
     * https://www.unicodepedia.com/groups/common-indic-number-forms/
     */
    COMMON_INDIC_NUMBER_FORMS(0xA830, 0xA839),
    /**
     * Phags-pa.
     *
     * https://www.unicodepedia.com/groups/phags-pa/
     */
    PHAGS_PA(0xA840, 0xA877),
    /**
     * Saurashtra.
     *
     * https://www.unicodepedia.com/groups/saurashtra/
     */
    SAURASHTRA(0xA880, 0xA8D9),
    /**
     * Devanagari Extended.
     *
     * https://www.unicodepedia.com/groups/devanagari-extended/
     */
    DEVANAGARI_EXTENDED(0xA8E0, 0xA8FB),
    /**
     * Kayah Li.
     *
     * https://www.unicodepedia.com/groups/kayah-li/
     */
    KAYAH_LI(0xA900, 0xA92F),
    /**
     * Rejang.
     *
     * https://www.unicodepedia.com/groups/rejang/
     */
    REJANG(0xA930, 0xA95F),
    /**
     * Hangul Jamo Extended-A.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo-extended-a/
     */
    HANGUL_JAMO_EXTENDED_A(0xA960, 0xA97C),
    /**
     * Javanese.
     *
     * https://www.unicodepedia.com/groups/javanese/
     */
    JAVANESE(0xA980, 0xA9DF),
    /**
     * Cham.
     *
     * https://www.unicodepedia.com/groups/cham/
     */
    CHAM(0xAA00, 0xAA5F),
    /**
     * Myanmar Extended-A.
     *
     * https://www.unicodepedia.com/groups/myanmar-extended-a/
     */
    MYANMAR_EXTENDED_A(0xAA60, 0xAA7B),
    /**
     * Tai Viet.
     *
     * https://www.unicodepedia.com/groups/tai-viet/
     */
    TAI_VIET(0xAA80, 0xAADF),
    /**
     * Ethiopic Extended-A.
     *
     * https://www.unicodepedia.com/groups/ethiopic-extended-a/
     */
    ETHIOPIC_EXTENDED_A(0xAB01, 0xAB2E),
    /**
     * Meetei Mayek.
     *
     * https://www.unicodepedia.com/groups/meetei-mayek/
     */
    MEETEI_MAYEK(0xABC0, 0xABF9),
    /**
     * Hangul Syllables.
     *
     * https://www.unicodepedia.com/groups/hangul-syllables/
     */
    HANGUL_SYLLABLES(0xAC00, 0xD7A3),
    /**
     * Hangul Jamo Extended-B.
     *
     * https://www.unicodepedia.com/groups/hangul-jamo-extended-b/
     */
    HANGUL_JAMO_EXTENDED_B(0xD7B0, 0xD7FB),
    /**
     * High Surrogates.
     *
     * https://www.unicodepedia.com/groups/high-surrogates/
     */
    HIGH_SURROGATES(0xD800, 0xDB7F),
    /**
     * High Private Use Surrogates.
     *
     * https://www.unicodepedia.com/groups/high-private-use-surrogates/
     */
    HIGH_PRIVATE_USE_SURROGATES(0xDB80, 0xDBFF),
    /**
     * Low Surrogates.
     *
     * https://www.unicodepedia.com/groups/low-surrogates/
     */
    LOW_SURROGATES(0xDC00, 0xDFFF),
    /**
     * Private Use Area.
     *
     * https://www.unicodepedia.com/groups/private-use-area/
     */
    PRIVATE_USE_AREA(0xE000, 0xF8FF),
    /**
     * CJK Compatibility Ideographs.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-ideographs/
     */
    CJK_COMPATIBILITY_IDEOGRAPHS(0xF900, 0xFAD9),
    /**
     * Alphabetic Presentation Forms.
     *
     * https://www.unicodepedia.com/groups/alphabetic-presentation-forms/
     */
    ALPHABETIC_PRESENTATION_FORMS(0xFB00, 0xFB4F),
    /**
     * Arabic Presentation Forms-A.
     *
     * https://www.unicodepedia.com/groups/arabic-presentation-forms-a/
     */
    ARABIC_PRESENTATION_FORMS_A(0xFB50, 0xFDFD),
    /**
     * Variation Selectors.
     *
     * https://www.unicodepedia.com/groups/variation-selectors/
     */
    VARIATION_SELECTORS(0xFE00, 0xFE0F),
    /**
     * Vertical Forms.
     *
     * https://www.unicodepedia.com/groups/vertical-forms/
     */
    VERTICAL_FORMS(0xFE10, 0xFE19),
    /**
     * Combining Half Marks.
     *
     * https://www.unicodepedia.com/groups/combining-half-marks/
     */
    COMBINING_HALF_MARKS(0xFE20, 0xFE26),
    /**
     * CJK Compatibility Forms.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-forms/
     */
    CJK_COMPATIBILITY_FORMS(0xFE30, 0xFE4F),
    /**
     * Small Form Variants.
     *
     * https://www.unicodepedia.com/groups/small-form-variants/
     */
    SMALL_FORM_VARIANTS(0xFE50, 0xFE6B),
    /**
     * Arabic Presentation Forms-B.
     *
     * https://www.unicodepedia.com/groups/arabic-presentation-forms-b/
     */
    ARABIC_PRESENTATION_FORMS_B(0xFE70, 0xFEFF),
    /**
     * Halfwidth and Fullwidth Forms.
     *
     * https://www.unicodepedia.com/groups/halfwidth-and-fullwidth-forms/
     */
    HALFWIDTH_AND_FULLWIDTH_FORMS(0xFF01, 0xFFEE),
    /**
     * Specials.
     *
     * https://www.unicodepedia.com/groups/specials/
     */
    SPECIALS(0xFFF9, 0xFFFD),
    /**
     * Linear B Syllabary.
     *
     * https://www.unicodepedia.com/groups/linear-b-syllabary/
     */
    LINEAR_B_SYLLABARY(0x10000, 0x1005D),
    /**
     * Linear B Ideograms.
     *
     * https://www.unicodepedia.com/groups/linear-b-ideograms/
     */
    LINEAR_B_IDEOGRAMS(0x10080, 0x100FA),
    /**
     * Aegean Numbers.
     *
     * https://www.unicodepedia.com/groups/aegean-numbers/
     */
    AEGEAN_NUMBERS(0x10100, 0x1013F),
    /**
     * Ancient Greek Numbers.
     *
     * https://www.unicodepedia.com/groups/ancient-greek-numbers/
     */
    ANCIENT_GREEK_NUMBERS(0x10140, 0x1018A),
    /**
     * Ancient Symbols.
     *
     * https://www.unicodepedia.com/groups/ancient-symbols/
     */
    ANCIENT_SYMBOLS(0x10190, 0x1019B),
    /**
     * Phaistos Disc.
     *
     * https://www.unicodepedia.com/groups/phaistos-disc/
     */
    PHAISTOS_DISC(0x101D0, 0x101FD),
    /**
     * Lycian.
     *
     * https://www.unicodepedia.com/groups/lycian/
     */
    LYCIAN(0x10280, 0x1029C),
    /**
     * Carian.
     *
     * https://www.unicodepedia.com/groups/carian/
     */
    CARIAN(0x102A0, 0x102D0),
    /**
     * Old Italic.
     *
     * https://www.unicodepedia.com/groups/old-italic/
     */
    OLD_ITALIC(0x10300, 0x10323),
    /**
     * Gothic.
     *
     * https://www.unicodepedia.com/groups/gothic/
     */
    GOTHIC(0x10330, 0x1034A),
    /**
     * Ugaritic.
     *
     * https://www.unicodepedia.com/groups/ugaritic/
     */
    UGARITIC(0x10380, 0x1039F),
    /**
     * Old Persian.
     *
     * https://www.unicodepedia.com/groups/old-persian/
     */
    OLD_PERSIAN(0x103A0, 0x103D5),
    /**
     * Deseret.
     *
     * https://www.unicodepedia.com/groups/deseret/
     */
    DESERET(0x10400, 0x1044F),
    /**
     * Shavian.
     *
     * https://www.unicodepedia.com/groups/shavian/
     */
    SHAVIAN(0x10450, 0x1047F),
    /**
     * Osmanya.
     *
     * https://www.unicodepedia.com/groups/osmanya/
     */
    OSMANYA(0x10480, 0x104A9),
    /**
     * Cypriot Syllabary.
     *
     * https://www.unicodepedia.com/groups/cypriot-syllabary/
     */
    CYPRIOT_SYLLABARY(0x10800, 0x1083F),
    /**
     * Imperial Aramaic.
     *
     * https://www.unicodepedia.com/groups/imperial-aramaic/
     */
    IMPERIAL_ARAMAIC(0x10840, 0x1085F),
    /**
     * Phoenician.
     *
     * https://www.unicodepedia.com/groups/phoenician/
     */
    PHOENICIAN(0x10900, 0x1091F),
    /**
     * Lydian.
     *
     * https://www.unicodepedia.com/groups/lydian/
     */
    LYDIAN(0x10920, 0x1093F),
    /**
     * Kharoshthi.
     *
     * https://www.unicodepedia.com/groups/kharoshthi/
     */
    KHAROSHTHI(0x10A00, 0x10A58),
    /**
     * Old South Arabian.
     *
     * https://www.unicodepedia.com/groups/old-south-arabian/
     */
    OLD_SOUTH_ARABIAN(0x10A60, 0x10A7F),
    /**
     * Avestan.
     *
     * https://www.unicodepedia.com/groups/avestan/
     */
    AVESTAN(0x10B00, 0x10B3F),
    /**
     * Inscriptional Parthian.
     *
     * https://www.unicodepedia.com/groups/inscriptional-parthian/
     */
    INSCRIPTIONAL_PARTHIAN(0x10B40, 0x10B5F),
    /**
     * Inscriptional Pahlavi.
     *
     * https://www.unicodepedia.com/groups/inscriptional-pahlavi/
     */
    INSCRIPTIONAL_PAHLAVI(0x10B60, 0x10B7F),
    /**
     * Old Turkic.
     *
     * https://www.unicodepedia.com/groups/old-turkic/
     */
    OLD_TURKIC(0x10C00, 0x10C48),
    /**
     * Rumi Numeral Symbols.
     *
     * https://www.unicodepedia.com/groups/rumi-numeral-symbols/
     */
    RUMI_NUMERAL_SYMBOLS(0x10E60, 0x10E7E),
    /**
     * Brahmi.
     *
     * https://www.unicodepedia.com/groups/brahmi/
     */
    BRAHMI(0x11000, 0x1106F),
    /**
     * Kaithi.
     *
     * https://www.unicodepedia.com/groups/kaithi/
     */
    KAITHI(0x11080, 0x110C1),
    /**
     * Cuneiform.
     *
     * https://www.unicodepedia.com/groups/cuneiform/
     */
    CUNEIFORM(0x12000, 0x1236E),
    /**
     * Cuneiform Numbers and Punctuation.
     *
     * https://www.unicodepedia.com/groups/cuneiform-numbers-and-punctuation/
     */
    CUNEIFORM_NUMBERS_AND_PUNCTUATION(0x12400, 0x12473),
    /**
     * Egyptian Hieroglyphs.
     *
     * https://www.unicodepedia.com/groups/egyptian-hieroglyphs/
     */
    EGYPTIAN_HIEROGLYPHS(0x13000, 0x1342E),
    /**
     * Bamum Supplement.
     *
     * https://www.unicodepedia.com/groups/bamum-supplement/
     */
    BAMUM_SUPPLEMENT(0x16800, 0x16A38),
    /**
     * Kana Supplement.
     *
     * https://www.unicodepedia.com/groups/kana-supplement/
     */
    KANA_SUPPLEMENT(0x1B000, 0x1B001),
    /**
     * Byzantine Musical Symbols.
     *
     * https://www.unicodepedia.com/groups/byzantine-musical-symbols/
     */
    BYZANTINE_MUSICAL_SYMBOLS(0x1D000, 0x1D0F5),
    /**
     * Musical Symbols.
     *
     * https://www.unicodepedia.com/groups/musical-symbols/
     */
    MUSICAL_SYMBOLS(0x1D100, 0x1D1DD),
    /**
     * Ancient Greek Musical Notation.
     *
     * https://www.unicodepedia.com/groups/ancient-greek-musical-notation/
     */
    ANCIENT_GREEK_MUSICAL_NOTATION(0x1D200, 0x1D245),
    /**
     * Tai Xuan Jing Symbols.
     *
     * https://www.unicodepedia.com/groups/tai-xuan-jing-symbols/
     */
    TAI_XUAN_JING_SYMBOLS(0x1D300, 0x1D356),
    /**
     * Counting Rod Numerals.
     *
     * https://www.unicodepedia.com/groups/counting-rod-numerals/
     */
    COUNTING_ROD_NUMERALS(0x1D360, 0x1D371),
    /**
     * Mathematical Alphanumeric Symbols.
     *
     * https://www.unicodepedia.com/groups/mathematical-alphanumeric-symbols/
     */
    MATHEMATICAL_ALPHANUMERIC_SYMBOLS(0x1D400, 0x1D7FF),
    /**
     * Mahjong Tiles.
     *
     * https://www.unicodepedia.com/groups/mahjong-tiles/
     */
    MAHJONG_TILES(0x1F000, 0x1F02B),
    /**
     * Domino Tiles.
     *
     * https://www.unicodepedia.com/groups/domino-tiles/
     */
    DOMINO_TILES(0x1F030, 0x1F093),
    /**
     * Playing Cards.
     *
     * https://www.unicodepedia.com/groups/playing-cards/
     */
    PLAYING_CARDS(0x1F0A0, 0x1F0DF),
    /**
     * Enclosed Alphanumeric Supplement.
     *
     * https://www.unicodepedia.com/groups/enclosed-alphanumeric-supplement/
     */
    ENCLOSED_ALPHANUMERIC_SUPPLEMENT(0x1F100, 0x1F1FF),
    /**
     * Enclosed Ideographic Supplement.
     *
     * https://www.unicodepedia.com/groups/enclosed-ideographic-supplement/
     */
    ENCLOSED_IDEOGRAPHIC_SUPPLEMENT(0x1F200, 0x1F251),
    /**
     * Miscellaneous Symbols And Pictographs.
     *
     * https://www.unicodepedia.com/groups/miscellaneous-symbols-and-pictographs/
     */
    MISCELLANEOUS_SYMBOLS_AND_PICTOGRAPHS(0x1F300, 0x1F5FF),
    /**
     * Emoticons.
     *
     * https://www.unicodepedia.com/groups/emoticons/
     */
    EMOTICONS(0x1F601, 0x1F64F),
    /**
     * Transport And Map Symbols.
     *
     * https://www.unicodepedia.com/groups/transport-and-map-symbols/
     */
    TRANSPORT_AND_MAP_SYMBOLS(0x1F680, 0x1F6C5),
    /**
     * Alchemical Symbols.
     *
     * https://www.unicodepedia.com/groups/alchemical-symbols/
     */
    ALCHEMICAL_SYMBOLS(0x1F700, 0x1F773),
    /**
     * CJK Unified Ideographs Extension B.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-b/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B(0x20000, 0x2A6D6),
    /**
     * CJK Unified Ideographs Extension C.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-c/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C(0x2A700, 0x2B734),
    /**
     * CJK Unified Ideographs Extension D.
     *
     * https://www.unicodepedia.com/groups/cjk-unified-ideographs-extension-d/
     */
    CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D(0x2B740, 0x2B81D),
    /**
     * CJK Compatibility Ideographs Supplement.
     *
     * https://www.unicodepedia.com/groups/cjk-compatibility-ideographs-supplement/
     */
    CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT(0x2F800, 0x2FA1D),
    /**
     * Tags.
     *
     * https://www.unicodepedia.com/groups/tags/
     */
    TAGS(0xE0001, 0xE007F),
    /**
     * Variation Selectors Supplement.
     *
     * https://www.unicodepedia.com/groups/variation-selectors-supplement/
     */
    VARIATION_SELECTORS_SUPPLEMENT(0xE0100, 0xE01EF),
    /**
     * Supplementary Private Use Area-A.
     *
     * https://www.unicodepedia.com/groups/supplementary-private-use-area-a/
     */
    SUPPLEMENTARY_PRIVATE_USE_AREA_A(0xF0000, 0xFFFFD),
    /**
     * Supplementary Private Use Area-B.
     *
     * https://www.unicodepedia.com/groups/supplementary-private-use-area-b/
     */
    SUPPLEMENTARY_PRIVATE_USE_AREA_B(0x100000, 0x10FFFD);

    private final int lower;
    private final int upper;

    UnicodeRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }


    public int getLower() {
        return lower;
    }


    public int getUpper() {
        return upper;
    }
}
