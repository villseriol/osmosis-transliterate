// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/enclosed-alphanumeric-supplement/
public class EnclosedAlphanumericSupplementMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Enclosed Alphanumeric Supplement
        // block
        rules.add(Icu4jUtils.toIcuFilterRule(UnicodeRange.ENCLOSED_ALPHANUMERIC_SUPPLEMENT));

        // Enclosed Alphanumeric Supplement block mappings
        rules.add("🄀 > '0.';"); // 1F100 DIGIT ZERO FULL STOP
        rules.add("🄁 > '0,';"); // 1F101 DIGIT ZERO COMMA
        rules.add("🄂 > '1,';"); // 1F102 DIGIT ONE COMMA
        rules.add("🄃 > '2,';"); // 1F103 DIGIT TWO COMMA
        rules.add("🄄 > '3,';"); // 1F104 DIGIT THREE COMMA
        rules.add("🄅 > '4,';"); // 1F105 DIGIT FOUR COMMA
        rules.add("🄆 > '5,';"); // 1F106 DIGIT FIVE COMMA
        rules.add("🄇 > '6,';"); // 1F107 DIGIT SIX COMMA
        rules.add("🄈 > '7,';"); // 1F108 DIGIT SEVEN COMMA
        rules.add("🄉 > '8,';"); // 1F109 DIGIT EIGHT COMMA
        rules.add("🄊 > '9,';"); // 1F10A DIGIT NINE COMMA
        rules.add("🄋 > '(0)';"); // 1F10B DINGBAT CIRCLED SANS-SERIF DIGIT ZERO
        rules.add("🄌 > '(0)';"); // 1F10C DINGBAT NEGATIVE CIRCLED SANS-SERIF
                                  // DIGIT ZERO
        rules.add("🄍 > ' ';"); // 1F10D CIRCLED ZERO WITH SLASH
        rules.add("🄎 > ' ';"); // 1F10E CIRCLED ANTICLOCKWISE ARROW
        rules.add("🄏 > ' ';"); // 1F10F CIRCLED DOLLAR SIGN WITH OVERLAID
                                // BACKSLASH
        rules.add("🄐 > '(A)';"); // 1F110 PARENTHESIZED LATIN CAPITAL LETTER A
        rules.add("🄑 > '(B)';"); // 1F111 PARENTHESIZED LATIN CAPITAL LETTER B
        rules.add("🄒 > '(C)';"); // 1F112 PARENTHESIZED LATIN CAPITAL LETTER C
        rules.add("🄓 > '(D)';"); // 1F113 PARENTHESIZED LATIN CAPITAL LETTER D
        rules.add("🄔 > '(E)';"); // 1F114 PARENTHESIZED LATIN CAPITAL LETTER E
        rules.add("🄕 > '(F)';"); // 1F115 PARENTHESIZED LATIN CAPITAL LETTER F
        rules.add("🄖 > '(G)';"); // 1F116 PARENTHESIZED LATIN CAPITAL LETTER G
        rules.add("🄗 > '(H)';"); // 1F117 PARENTHESIZED LATIN CAPITAL LETTER H
        rules.add("🄘 > '(I)';"); // 1F118 PARENTHESIZED LATIN CAPITAL LETTER I
        rules.add("🄙 > '(J)';"); // 1F119 PARENTHESIZED LATIN CAPITAL LETTER J
        rules.add("🄚 > '(K)';"); // 1F11A PARENTHESIZED LATIN CAPITAL LETTER K
        rules.add("🄛 > '(L)';"); // 1F11B PARENTHESIZED LATIN CAPITAL LETTER L
        rules.add("🄜 > '(M)';"); // 1F11C PARENTHESIZED LATIN CAPITAL LETTER M
        rules.add("🄝 > '(N)';"); // 1F11D PARENTHESIZED LATIN CAPITAL LETTER N
        rules.add("🄞 > '(O)';"); // 1F11E PARENTHESIZED LATIN CAPITAL LETTER O
        rules.add("🄟 > '(P)';"); // 1F11F PARENTHESIZED LATIN CAPITAL LETTER P
        rules.add("🄠 > '(Q)';"); // 1F120 PARENTHESIZED LATIN CAPITAL LETTER Q
        rules.add("🄡 > '(R)';"); // 1F121 PARENTHESIZED LATIN CAPITAL LETTER R
        rules.add("🄢 > '(S)';"); // 1F122 PARENTHESIZED LATIN CAPITAL LETTER S
        rules.add("🄣 > '(T)';"); // 1F123 PARENTHESIZED LATIN CAPITAL LETTER T
        rules.add("🄤 > '(U)';"); // 1F124 PARENTHESIZED LATIN CAPITAL LETTER U
        rules.add("🄥 > '(V)';"); // 1F125 PARENTHESIZED LATIN CAPITAL LETTER V
        rules.add("🄦 > '(W)';"); // 1F126 PARENTHESIZED LATIN CAPITAL LETTER W
        rules.add("🄧 > '(X)';"); // 1F127 PARENTHESIZED LATIN CAPITAL LETTER X
        rules.add("🄨 > '(Y)';"); // 1F128 PARENTHESIZED LATIN CAPITAL LETTER Y
        rules.add("🄩 > '(Z)';"); // 1F129 PARENTHESIZED LATIN CAPITAL LETTER Z
        rules.add("🄪 > '[S]';"); // 1F12A TORTOISE SHELL BRACKETED LATIN
                                  // CAPITAL LETTER S
        rules.add("🄫 > '©';"); // 1F12B CIRCLED ITALIC LATIN CAPITAL LETTER C
        rules.add("🄬 > '®';"); // 1F12C CIRCLED ITALIC LATIN CAPITAL LETTER R
        rules.add("🄭 > '(CD)';"); // 1F12D CIRCLED CD
        rules.add("🄮 > '(WZ)';"); // 1F12E CIRCLED WZ
        rules.add("🄯 > '(C)';"); // 1F12F COPYLEFT SYMBOL
        rules.add("🄰 > '[A]';"); // 1F130 SQUARED LATIN CAPITAL LETTER A
        rules.add("🄱 > '[B]';"); // 1F131 SQUARED LATIN CAPITAL LETTER B
        rules.add("🄲 > '[C]';"); // 1F132 SQUARED LATIN CAPITAL LETTER C
        rules.add("🄳 > '[D]';"); // 1F133 SQUARED LATIN CAPITAL LETTER D
        rules.add("🄴 > '[E]';"); // 1F134 SQUARED LATIN CAPITAL LETTER E
        rules.add("🄵 > '[F]';"); // 1F135 SQUARED LATIN CAPITAL LETTER F
        rules.add("🄶 > '[G]';"); // 1F136 SQUARED LATIN CAPITAL LETTER G
        rules.add("🄷 > '[H]';"); // 1F137 SQUARED LATIN CAPITAL LETTER H
        rules.add("🄸 > '[I]';"); // 1F138 SQUARED LATIN CAPITAL LETTER I
        rules.add("🄹 > '[J]';"); // 1F139 SQUARED LATIN CAPITAL LETTER J
        rules.add("🄺 > '[K]';"); // 1F13A SQUARED LATIN CAPITAL LETTER K
        rules.add("🄻 > '[L]';"); // 1F13B SQUARED LATIN CAPITAL LETTER L
        rules.add("🄼 > '[M]';"); // 1F13C SQUARED LATIN CAPITAL LETTER M
        rules.add("🄽 > '[N]';"); // 1F13D SQUARED LATIN CAPITAL LETTER N
        rules.add("🄾 > '[O]';"); // 1F13E SQUARED LATIN CAPITAL LETTER O
        rules.add("🄿 > '[P]';"); // 1F13F SQUARED LATIN CAPITAL LETTER P
        rules.add("🅀 > '[Q]';"); // 1F140 SQUARED LATIN CAPITAL LETTER Q
        rules.add("🅁 > '[R]';"); // 1F141 SQUARED LATIN CAPITAL LETTER R
        rules.add("🅂 > '[S]';"); // 1F142 SQUARED LATIN CAPITAL LETTER S
        rules.add("🅃 > '[T]';"); // 1F143 SQUARED LATIN CAPITAL LETTER T
        rules.add("🅄 > '[U]';"); // 1F144 SQUARED LATIN CAPITAL LETTER U
        rules.add("🅅 > '[V]';"); // 1F145 SQUARED LATIN CAPITAL LETTER V
        rules.add("🅆 > '[W]';"); // 1F146 SQUARED LATIN CAPITAL LETTER W
        rules.add("🅇 > '[X]';"); // 1F147 SQUARED LATIN CAPITAL LETTER X
        rules.add("🅈 > '[Y]';"); // 1F148 SQUARED LATIN CAPITAL LETTER Y
        rules.add("🅉 > '[Z]';"); // 1F149 SQUARED LATIN CAPITAL LETTER Z
        rules.add("🅊 > '[HV]';"); // 1F14A SQUARED HV
        rules.add("🅋 > '[MV]';"); // 1F14B SQUARED MV
        rules.add("🅌 > '[SD]';"); // 1F14C SQUARED SD
        rules.add("🅍 > '[SS]';"); // 1F14D SQUARED SS
        rules.add("🅎 > '[PPV]';"); // 1F14E SQUARED PPV
        rules.add("🅏 > '[WC]';"); // 1F14F SQUARED WC
        rules.add("🅐 > '(A)';"); // 1F150 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // A
        rules.add("🅑 > '(B)';"); // 1F151 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // B
        rules.add("🅒 > '(C)';"); // 1F152 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // C
        rules.add("🅓 > '(D)';"); // 1F153 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // D
        rules.add("🅔 > '(E)';"); // 1F154 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // E
        rules.add("🅕 > '(F)';"); // 1F155 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // F
        rules.add("🅖 > '(G)';"); // 1F156 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // G
        rules.add("🅗 > '(H)';"); // 1F157 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // H
        rules.add("🅘 > '(I)';"); // 1F158 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // I
        rules.add("🅙 > '(J)';"); // 1F159 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // J
        rules.add("🅚 > '(K)';"); // 1F15A NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // K
        rules.add("🅛 > '(L)';"); // 1F15B NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // L
        rules.add("🅜 > '(M)';"); // 1F15C NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // M
        rules.add("🅝 > '(N)';"); // 1F15D NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // N
        rules.add("🅞 > '(O)';"); // 1F15E NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // O
        rules.add("🅟 > '(P)';"); // 1F15F NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // P
        rules.add("🅠 > '(Q)';"); // 1F160 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // Q
        rules.add("🅡 > '(R)';"); // 1F161 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // R
        rules.add("🅢 > '(S)';"); // 1F162 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // S
        rules.add("🅣 > '(T)';"); // 1F163 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // T
        rules.add("🅤 > '(U)';"); // 1F164 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // U
        rules.add("🅥 > '(V)';"); // 1F165 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // V
        rules.add("🅦 > '(W)';"); // 1F166 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // W
        rules.add("🅧 > '(X)';"); // 1F167 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // X
        rules.add("🅨 > '(Y)';"); // 1F168 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // Y
        rules.add("🅩 > '(Z)';"); // 1F169 NEGATIVE CIRCLED LATIN CAPITAL LETTER
                                  // Z
        rules.add("🅪 > 'MC';"); // 1F16A RAISED MC SIGN
        rules.add("🅫 > 'MD';"); // 1F16B RAISED MD SIGN
        rules.add("🅬 > 'MR';"); // 1F16C RAISED MR SIGN
        rules.add("🅭 > ' ';"); // 1F16D CIRCLED CC
        rules.add("🅮 > ' ';"); // 1F16E CIRCLED C WITH OVERLAID BACKSLASH
        rules.add("🅯 > ' ';"); // 1F16F CIRCLED HUMAN FIGURE
        rules.add("🅰 > '[A]';"); // 1F170 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // A
        rules.add("🅱 > '[B]';"); // 1F171 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // B
        rules.add("🅲 > '[C]';"); // 1F172 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // C
        rules.add("🅳 > '[D]';"); // 1F173 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // D
        rules.add("🅴 > '[E]';"); // 1F174 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // E
        rules.add("🅵 > '[F]';"); // 1F175 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // F
        rules.add("🅶 > '[G]';"); // 1F176 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // G
        rules.add("🅷 > '[H]';"); // 1F177 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // H
        rules.add("🅸 > '[I]';"); // 1F178 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // I
        rules.add("🅹 > '[J]';"); // 1F179 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // J
        rules.add("🅺 > '[K]';"); // 1F17A NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // K
        rules.add("🅻 > '[L]';"); // 1F17B NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // L
        rules.add("🅼 > '[M]';"); // 1F17C NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // M
        rules.add("🅽 > '[N]';"); // 1F17D NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // N
        rules.add("🅾 > '[O]';"); // 1F17E NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // O
        rules.add("🅿 > '[P]';"); // 1F17F NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // P
        rules.add("🆀 > '[Q]';"); // 1F180 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // Q
        rules.add("🆁 > '[R]';"); // 1F181 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // R
        rules.add("🆂 > '[S]';"); // 1F182 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // S
        rules.add("🆃 > '[T]';"); // 1F183 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // T
        rules.add("🆄 > '[U]';"); // 1F184 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // U
        rules.add("🆅 > '[V]';"); // 1F185 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // V
        rules.add("🆆 > '[W]';"); // 1F186 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // W
        rules.add("🆇 > '[X]';"); // 1F187 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // X
        rules.add("🆈 > '[Y]';"); // 1F188 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // Y
        rules.add("🆉 > '[Z]';"); // 1F189 NEGATIVE SQUARED LATIN CAPITAL LETTER
                                  // Z
        rules.add("🆊 > '[P]';"); // 1F18A CROSSED NEGATIVE SQUARED LATIN
                                  // CAPITAL LETTER P
        rules.add("🆋 > '[IC]';"); // 1F18B NEGATIVE SQUARED IC
        rules.add("🆌 > '[PA]';"); // 1F18C NEGATIVE SQUARED PA
        rules.add("🆍 > '[SA]';"); // 1F18D NEGATIVE SQUARED SA
        rules.add("🆎 > '[AB]';"); // 1F18E NEGATIVE SQUARED AB
        rules.add("🆏 > '[WC]';"); // 1F18F NEGATIVE SQUARED WC
        rules.add("🆐 > '[DJ]';"); // 1F190 SQUARE DJ
        rules.add("🆑 > '[CL]';"); // 1F191 SQUARED CL
        rules.add("🆒 > '[COOL]';"); // 1F192 SQUARED COOL
        rules.add("🆓 > '[FREE]';"); // 1F193 SQUARED FREE
        rules.add("🆔 > '[ID]';"); // 1F194 SQUARED ID
        rules.add("🆕 > '[NEW]';"); // 1F195 SQUARED NEW
        rules.add("🆖 > '[NG]';"); // 1F196 SQUARED NG
        rules.add("🆗 > '[OK]';"); // 1F197 SQUARED OK
        rules.add("🆘 > '[SOS]';"); // 1F198 SQUARED SOS
        rules.add("🆙 > '[UP!]';"); // 1F199 SQUARED UP WITH EXCLAMATION MARK
        rules.add("🆚 > '[VS]';"); // 1F19A SQUARED VS
        rules.add("🆛 > '[3D]';"); // 1F19B SQUARED THREE D
        rules.add("🆜 > '[2ND SCREEN]';"); // 1F19C SQUARED SECOND SCREEN
        rules.add("🆝 > '[2K]';"); // 1F19D SQUARED TWO K
        rules.add("🆞 > '[4K]';"); // 1F19E SQUARED FOUR K
        rules.add("🆟 > '[8K]';"); // 1F19F SQUARED EIGHT K
        rules.add("🆠 > '[5.1]';"); // 1F1A0 SQUARED FIVE POINT ONE
        rules.add("🆡 > '[7.1]';"); // 1F1A1 SQUARED SEVEN POINT ONE
        rules.add("🆢 > '[22.2]';"); // 1F1A2 SQUARED TWENTY-TWO POINT TWO
        rules.add("🆣 > '[60P]';"); // 1F1A3 SQUARED SIXTY P
        rules.add("🆤 > '[120P]';"); // 1F1A4 SQUARED ONE HUNDRED TWENTY P
        rules.add("🆥 > '[d]';"); // 1F1A5 SQUARED LATIN SMALL LETTER D
        rules.add("🆦 > '[HC]';"); // 1F1A6 SQUARED HC
        rules.add("🆧 > '[HDR]';"); // 1F1A7 SQUARED HDR
        rules.add("🆨 > '[HI-RES]';"); // 1F1A8 SQUARED HI-RES
        rules.add("🆩 > '[LOSSLESS]';"); // 1F1A9 SQUARED LOSSLESS
        rules.add("🆪 > '[SHV]';"); // 1F1AA SQUARED SHV
        rules.add("🆫 > '[UHD]';"); // 1F1AB SQUARED UHD
        rules.add("🆬 > '[VOD]';"); // 1F1AC SQUARED VOD
        rules.add("🆭 > '(M)';"); // 1F1AD MASK WORK SYMBOL
        rules.add("🇦 > 'A';"); // 1F1E6 REGIONAL INDICATOR SYMBOL LETTER A
        rules.add("🇧 > 'B';"); // 1F1E7 REGIONAL INDICATOR SYMBOL LETTER B
        rules.add("🇨 > 'C';"); // 1F1E8 REGIONAL INDICATOR SYMBOL LETTER C
        rules.add("🇩 > 'D';"); // 1F1E9 REGIONAL INDICATOR SYMBOL LETTER D
        rules.add("🇪 > 'E';"); // 1F1EA REGIONAL INDICATOR SYMBOL LETTER E
        rules.add("🇫 > 'F';"); // 1F1EB REGIONAL INDICATOR SYMBOL LETTER F
        rules.add("🇬 > 'G';"); // 1F1EC REGIONAL INDICATOR SYMBOL LETTER G
        rules.add("🇭 > 'H';"); // 1F1ED REGIONAL INDICATOR SYMBOL LETTER H
        rules.add("🇮 > 'I';"); // 1F1EE REGIONAL INDICATOR SYMBOL LETTER I
        rules.add("🇯 > 'J';"); // 1F1EF REGIONAL INDICATOR SYMBOL LETTER J
        rules.add("🇰 > 'K';"); // 1F1F0 REGIONAL INDICATOR SYMBOL LETTER K
        rules.add("🇱 > 'L';"); // 1F1F1 REGIONAL INDICATOR SYMBOL LETTER L
        rules.add("🇲 > 'M';"); // 1F1F2 REGIONAL INDICATOR SYMBOL LETTER M
        rules.add("🇳 > 'N';"); // 1F1F3 REGIONAL INDICATOR SYMBOL LETTER N
        rules.add("🇴 > 'O';"); // 1F1F4 REGIONAL INDICATOR SYMBOL LETTER O
        rules.add("🇵 > 'P';"); // 1F1F5 REGIONAL INDICATOR SYMBOL LETTER P
        rules.add("🇶 > 'Q';"); // 1F1F6 REGIONAL INDICATOR SYMBOL LETTER Q
        rules.add("🇷 > 'R';"); // 1F1F7 REGIONAL INDICATOR SYMBOL LETTER R
        rules.add("🇸 > 'S';"); // 1F1F8 REGIONAL INDICATOR SYMBOL LETTER S
        rules.add("🇹 > 'T';"); // 1F1F9 REGIONAL INDICATOR SYMBOL LETTER T
        rules.add("🇺 > 'U';"); // 1F1FA REGIONAL INDICATOR SYMBOL LETTER U
        rules.add("🇻 > 'V';"); // 1F1FB REGIONAL INDICATOR SYMBOL LETTER V
        rules.add("🇼 > 'W';"); // 1F1FC REGIONAL INDICATOR SYMBOL LETTER W
        rules.add("🇽 > 'X';"); // 1F1FD REGIONAL INDICATOR SYMBOL LETTER X
        rules.add("🇾 > 'Y';"); // 1F1FE REGIONAL INDICATOR SYMBOL LETTER Y
        rules.add("🇿 > 'Z';"); // 1F1FF REGIONAL INDICATOR SYMBOL LETTER Z

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedAlphanumericSupplement-Normalized",
                String.join("\n", rules), Transliterator.FORWARD);
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
