// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.mapping.characterset;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.transliterate.v0_6.unicode.Icu4jUtils;
import org.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import org.villseriol.osmosis.transliterate.v0_6.unicode.Unimap;
import org.villseriol.osmosis.transliterate.v0_6.unicode.reflection.UnicodeRanges;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


@UnicodeRanges(UnicodeRange.ENCLOSED_ALPHANUMERIC_SUPPLEMENT)
public class EnclosedAlphanumericSupplementMapper implements Unimap {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        rules.add("🄀 > '0.';");
        rules.add("🄁 > '0,';");
        rules.add("🄂 > '1,';");
        rules.add("🄃 > '2,';");
        rules.add("🄄 > '3,';");
        rules.add("🄅 > '4,';");
        rules.add("🄆 > '5,';");
        rules.add("🄇 > '6,';");
        rules.add("🄈 > '7,';");
        rules.add("🄉 > '8,';");
        rules.add("🄊 > '9,';");
        rules.add("🄋 > '(0)';");
        rules.add("🄌 > '(0)';");
        rules.add("🄍 > ' ';");
        rules.add("🄎 > ' ';");
        rules.add("🄏 > ' ';");
        rules.add("🄐 > '(A)';");
        rules.add("🄑 > '(B)';");
        rules.add("🄒 > '(C)';");
        rules.add("🄓 > '(D)';");
        rules.add("🄔 > '(E)';");
        rules.add("🄕 > '(F)';");
        rules.add("🄖 > '(G)';");
        rules.add("🄗 > '(H)';");
        rules.add("🄘 > '(I)';");
        rules.add("🄙 > '(J)';");
        rules.add("🄚 > '(K)';");
        rules.add("🄛 > '(L)';");
        rules.add("🄜 > '(M)';");
        rules.add("🄝 > '(N)';");
        rules.add("🄞 > '(O)';");
        rules.add("🄟 > '(P)';");
        rules.add("🄠 > '(Q)';");
        rules.add("🄡 > '(R)';");
        rules.add("🄢 > '(S)';");
        rules.add("🄣 > '(T)';");
        rules.add("🄤 > '(U)';");
        rules.add("🄥 > '(V)';");
        rules.add("🄦 > '(W)';");
        rules.add("🄧 > '(X)';");
        rules.add("🄨 > '(Y)';");
        rules.add("🄩 > '(Z)';");
        rules.add("🄪 > '[S]';");
        rules.add("🄫 > '©';");
        rules.add("🄬 > '®';");
        rules.add("🄭 > '(CD)';");
        rules.add("🄮 > '(WZ)';");
        rules.add("🄯 > '(C)';");
        rules.add("🄰 > '[A]';");
        rules.add("🄱 > '[B]';");
        rules.add("🄲 > '[C]';");
        rules.add("🄳 > '[D]';");
        rules.add("🄴 > '[E]';");
        rules.add("🄵 > '[F]';");
        rules.add("🄶 > '[G]';");
        rules.add("🄷 > '[H]';");
        rules.add("🄸 > '[I]';");
        rules.add("🄹 > '[J]';");
        rules.add("🄺 > '[K]';");
        rules.add("🄻 > '[L]';");
        rules.add("🄼 > '[M]';");
        rules.add("🄽 > '[N]';");
        rules.add("🄾 > '[O]';");
        rules.add("🄿 > '[P]';");
        rules.add("🅀 > '[Q]';");
        rules.add("🅁 > '[R]';");
        rules.add("🅂 > '[S]';");
        rules.add("🅃 > '[T]';");
        rules.add("🅄 > '[U]';");
        rules.add("🅅 > '[V]';");
        rules.add("🅆 > '[W]';");
        rules.add("🅇 > '[X]';");
        rules.add("🅈 > '[Y]';");
        rules.add("🅉 > '[Z]';");
        rules.add("🅊 > '[HV]';");
        rules.add("🅋 > '[MV]';");
        rules.add("🅌 > '[SD]';");
        rules.add("🅍 > '[SS]';");
        rules.add("🅎 > '[PPV]';");
        rules.add("🅏 > '[WC]';");
        rules.add("🅐 > '(A)';");
        rules.add("🅑 > '(B)';");
        rules.add("🅒 > '(C)';");
        rules.add("🅓 > '(D)';");
        rules.add("🅔 > '(E)';");
        rules.add("🅕 > '(F)';");
        rules.add("🅖 > '(G)';");
        rules.add("🅗 > '(H)';");
        rules.add("🅘 > '(I)';");
        rules.add("🅙 > '(J)';");
        rules.add("🅚 > '(K)';");
        rules.add("🅛 > '(L)';");
        rules.add("🅜 > '(M)';");
        rules.add("🅝 > '(N)';");
        rules.add("🅞 > '(O)';");
        rules.add("🅟 > '(P)';");
        rules.add("🅠 > '(Q)';");
        rules.add("🅡 > '(R)';");
        rules.add("🅢 > '(S)';");
        rules.add("🅣 > '(T)';");
        rules.add("🅤 > '(U)';");
        rules.add("🅥 > '(V)';");
        rules.add("🅦 > '(W)';");
        rules.add("🅧 > '(X)';");
        rules.add("🅨 > '(Y)';");
        rules.add("🅩 > '(Z)';");
        rules.add("🅪 > 'MC';");
        rules.add("🅫 > 'MD';");
        rules.add("🅬 > 'MR';");
        rules.add("🅭 > ' ';");
        rules.add("🅮 > ' ';");
        rules.add("🅯 > ' ';");
        rules.add("🅰 > '[A]';");
        rules.add("🅱 > '[B]';");
        rules.add("🅲 > '[C]';");
        rules.add("🅳 > '[D]';");
        rules.add("🅴 > '[E]';");
        rules.add("🅵 > '[F]';");
        rules.add("🅶 > '[G]';");
        rules.add("🅷 > '[H]';");
        rules.add("🅸 > '[I]';");
        rules.add("🅹 > '[J]';");
        rules.add("🅺 > '[K]';");
        rules.add("🅻 > '[L]';");
        rules.add("🅼 > '[M]';");
        rules.add("🅽 > '[N]';");
        rules.add("🅾 > '[O]';");
        rules.add("🅿 > '[P]';");
        rules.add("🆀 > '[Q]';");
        rules.add("🆁 > '[R]';");
        rules.add("🆂 > '[S]';");
        rules.add("🆃 > '[T]';");
        rules.add("🆄 > '[U]';");
        rules.add("🆅 > '[V]';");
        rules.add("🆆 > '[W]';");
        rules.add("🆇 > '[X]';");
        rules.add("🆈 > '[Y]';");
        rules.add("🆉 > '[Z]';");
        rules.add("🆊 > '[P]';");
        rules.add("🆋 > '[IC]';");
        rules.add("🆌 > '[PA]';");
        rules.add("🆍 > '[SA]';");
        rules.add("🆎 > '[AB]';");
        rules.add("🆏 > '[WC]';");
        rules.add("🆐 > '[DJ]';");
        rules.add("🆑 > '[CL]';");
        rules.add("🆒 > '[COOL]';");
        rules.add("🆓 > '[FREE]';");
        rules.add("🆔 > '[ID]';");
        rules.add("🆕 > '[NEW]';");
        rules.add("🆖 > '[NG]';");
        rules.add("🆗 > '[OK]';");
        rules.add("🆘 > '[SOS]';");
        rules.add("🆙 > '[UP!]';");
        rules.add("🆚 > '[VS]';");
        rules.add("🆛 > '[3D]';");
        rules.add("🆜 > '[2ND SCREEN]';");
        rules.add("🆝 > '[2K]';");
        rules.add("🆞 > '[4K]';");
        rules.add("🆟 > '[8K]';");
        rules.add("🆠 > '[5.1]';");
        rules.add("🆡 > '[7.1]';");
        rules.add("🆢 > '[22.2]';");
        rules.add("🆣 > '[60P]';");
        rules.add("🆤 > '[120P]';");
        rules.add("🆥 > '[d]';");
        rules.add("🆦 > '[HC]';");
        rules.add("🆧 > '[HDR]';");
        rules.add("🆨 > '[HI-RES]';");
        rules.add("🆩 > '[LOSSLESS]';");
        rules.add("🆪 > '[SHV]';");
        rules.add("🆫 > '[UHD]';");
        rules.add("🆬 > '[VOD]';");
        rules.add("🆭 > '(M)';");
        rules.add("🇦 > 'A';");
        rules.add("🇧 > 'B';");
        rules.add("🇨 > 'C';");
        rules.add("🇩 > 'D';");
        rules.add("🇪 > 'E';");
        rules.add("🇫 > 'F';");
        rules.add("🇬 > 'G';");
        rules.add("🇭 > 'H';");
        rules.add("🇮 > 'I';");
        rules.add("🇯 > 'J';");
        rules.add("🇰 > 'K';");
        rules.add("🇱 > 'L';");
        rules.add("🇲 > 'M';");
        rules.add("🇳 > 'N';");
        rules.add("🇴 > 'O';");
        rules.add("🇵 > 'P';");
        rules.add("🇶 > 'Q';");
        rules.add("🇷 > 'R';");
        rules.add("🇸 > 'S';");
        rules.add("🇹 > 'T';");
        rules.add("🇺 > 'U';");
        rules.add("🇻 > 'V';");
        rules.add("🇼 > 'W';");
        rules.add("🇽 > 'X';");
        rules.add("🇾 > 'Y';");
        rules.add("🇿 > 'Z';");

        String rule = Icu4jUtils.createIcu4jRule(EnclosedAlphanumericSupplementMapper.class, rules);

        TRANSLITERATOR = Transliterator.createFromRules("EnclosedAlphanumericSupplement-Normalized", rule,
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
