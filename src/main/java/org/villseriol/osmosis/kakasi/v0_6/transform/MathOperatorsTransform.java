// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import java.util.ArrayList;
import java.util.List;

import org.villseriol.osmosis.kakasi.v0_6.utils.Transform;

import com.ibm.icu.text.ReplaceableString;
import com.ibm.icu.text.Transliterator;


// https://www.unicodepedia.com/groups/mathematical-operators/
public class MathOperatorsTransform implements Transform {
    private static final Transliterator TRANSLITERATOR;

    static {
        List<String> rules = new ArrayList<>();

        // Restrict the transliterator to the Mathematical Operators block only
        rules.add("::[\\u2200-\\u22FF];");

        // Quantifiers / basic set theory
        rules.add("∀ > 'forall';"); // 2200 FOR ALL
        rules.add("∁ > '^c';"); // 2201 COMPLEMENT
        rules.add("∂ > 'd';"); // 2202 PARTIAL DIFFERENTIAL
        rules.add("∃ > 'exists';"); // 2203 THERE EXISTS
        rules.add("∄ > '!exists';"); // 2204 THERE DOES NOT EXIST
        rules.add("∅ > '{}';"); // 2205 EMPTY SET
        rules.add("∆ > 'delta';"); // 2206 INCREMENT
        rules.add("∇ > 'nabla';"); // 2207 NABLA
        rules.add("∈ > 'in';"); // 2208 ELEMENT OF
        rules.add("∉ > '!in';"); // 2209 NOT AN ELEMENT OF
        rules.add("∊ > 'in';"); // 220A SMALL ELEMENT OF (dup)
        rules.add("∋ > 'ni';"); // 220B CONTAINS AS MEMBER
        rules.add("∌ > '!ni';"); // 220C DOES NOT CONTAIN AS MEMBER
        rules.add("∍ > 'ni';"); // 220D SMALL CONTAINS AS MEMBER (dup)
        rules.add("∎ > 'QED';"); // 220E END OF PROOF

        // Products / sums
        rules.add("∏ > 'prod';"); // 220F N-ARY PRODUCT
        rules.add("∐ > 'coprod';"); // 2210 N-ARY COPRODUCT
        rules.add("∑ > 'sum';"); // 2211 N-ARY SUMMATION

        // Basic arithmetic operators
        rules.add("− > '-';"); // 2212 MINUS SIGN
        rules.add("∓ > '-+';"); // 2213 MINUS-OR-PLUS SIGN
        rules.add("∔ > '.+';"); // 2214 DOT PLUS
        rules.add("∕ > '/';"); // 2215 DIVISION SLASH
        rules.add("∖ > '\\';"); // 2216 SET MINUS -> literal backslash
        rules.add("∗ > '*';"); // 2217 ASTERISK OPERATOR
        rules.add("∘ > 'o';"); // 2218 RING OPERATOR
        rules.add("∙ > '.';"); // 2219 BULLET OPERATOR

        // Roots
        rules.add("√ > 'sqrt';"); // 221A SQUARE ROOT
        rules.add("∛ > 'cbrt';"); // 221B CUBE ROOT
        rules.add("∜ > '4rt';"); // 221C FOURTH ROOT

        // Proportion / infinity / angles
        rules.add("∝ > 'prop';"); // 221D PROPORTIONAL TO
        rules.add("∞ > 'inf';"); // 221E INFINITY
        rules.add("∟ > '_|';"); // 221F RIGHT ANGLE
        rules.add("∠ > 'ang';"); // 2220 ANGLE
        rules.add("∡ > 'ang';"); // 2221 MEASURED ANGLE (dup)
        rules.add("∢ > 'ang';"); // 2222 SPHERICAL ANGLE (dup)

        // Divides / parallel
        rules.add("∣ > '|';"); // 2223 DIVIDES
        rules.add("∤ > '!|';"); // 2224 DOES NOT DIVIDE
        rules.add("∥ > '||';"); // 2225 PARALLEL TO
        rules.add("∦ > '!||';"); // 2226 NOT PARALLEL TO

        // Logic / set operators
        rules.add("∧ > '&&';"); // 2227 LOGICAL AND
        rules.add("∨ > '||';"); // 2228 LOGICAL OR (dup with parallel-to,
                                // flagged)
        rules.add("∩ > 'cap';"); // 2229 INTERSECTION
        rules.add("∪ > 'cup';"); // 222A UNION

        // Integrals
        rules.add("∫ > 'INT';"); // 222B INTEGRAL
        rules.add("∬ > 'INT2';"); // 222C DOUBLE INTEGRAL
        rules.add("∭ > 'INT3';"); // 222D TRIPLE INTEGRAL
        rules.add("∮ > 'OINT';"); // 222E CONTOUR INTEGRAL
        rules.add("∯ > 'OINT2';"); // 222F SURFACE INTEGRAL
        rules.add("∰ > 'OINT3';"); // 2230 VOLUME INTEGRAL
        rules.add("∱ > 'CWINT';"); // 2231 CLOCKWISE INTEGRAL
        rules.add("∲ > 'CWOINT';"); // 2232 CLOCKWISE CONTOUR INTEGRAL
        rules.add("∳ > 'ACWOINT';"); // 2233 ANTICLOCKWISE CONTOUR INTEGRAL

        // Therefore / because / ratio
        rules.add("∴ > 'therefore';"); // 2234 THEREFORE
        rules.add("∵ > 'because';"); // 2235 BECAUSE
        rules.add("∶ > ':';"); // 2236 RATIO
        rules.add("∷ > '::';"); // 2237 PROPORTION
        rules.add("∸ > '.-';"); // 2238 DOT MINUS
        rules.add("∹ > '-:';"); // 2239 EXCESS (arbitrary)
        rules.add("∺ > '::';"); // 223A GEOMETRIC PROPORTION (dup)
        rules.add("∻ > '~';"); // 223B HOMOTHETIC (dup with tilde family)

        // Tilde family (largely collapsed onto '~' variants — see closing note)
        rules.add("∼ > '~';"); // 223C TILDE OPERATOR
        rules.add("∽ > '~';"); // 223D REVERSED TILDE (dup)
        rules.add("∾ > '~';"); // 223E INVERTED LAZY S (dup)
        rules.add("∿ > '~';"); // 223F SINE WAVE (dup)
        rules.add("≀ > 'wr';"); // 2240 WREATH PRODUCT
        rules.add("≁ > '!~';"); // 2241 NOT TILDE
        rules.add("≂ > '~=';"); // 2242 MINUS TILDE (dup, arbitrary)
        rules.add("≃ > '~=';"); // 2243 ASYMPTOTICALLY EQUAL TO
        rules.add("≄ > '!~=';"); // 2244 NOT ASYMPTOTICALLY EQUAL TO
        rules.add("≅ > '=~';"); // 2245 APPROXIMATELY EQUAL TO (congruent)
        rules.add("≆ > '~=!';"); // 2246 APPROX BUT NOT ACTUALLY EQUAL
                                 // (arbitrary)
        rules.add("≇ > '!~=';"); // 2247 NEITHER APPROX NOR ACTUALLY EQUAL (dup)
        rules.add("≈ > '~~';"); // 2248 ALMOST EQUAL TO
        rules.add("≉ > '!~~';"); // 2249 NOT ALMOST EQUAL TO
        rules.add("≊ > '~~=';"); // 224A ALMOST EQUAL OR EQUAL TO (arbitrary)
        rules.add("≋ > '~~~';"); // 224B TRIPLE TILDE
        rules.add("≌ > '~~';"); // 224C ALL EQUAL TO (dup)
        rules.add("≍ > '=~';"); // 224D EQUIVALENT TO (dup with congruent,
                                // flagged)
        rules.add("≎ > '=~~';"); // 224E GEOMETRICALLY EQUIVALENT TO (dup,
                                 // arbitrary)
        rules.add("≏ > '=.';"); // 224F DIFFERENCE BETWEEN (arbitrary)
        rules.add("≐ > '~=';"); // 2250 APPROACHES THE LIMIT (dup)
        rules.add("≑ > '~=';"); // 2251 GEOMETRICALLY EQUAL TO (dup)
        rules.add("≒ > '~=.';"); // 2252 APPROX EQUAL TO OR IMAGE OF (dup,
                                 // arbitrary)
        rules.add("≓ > '.~=';"); // 2253 IMAGE OF OR APPROX EQUAL TO (dup,
                                 // arbitrary)
        rules.add("≔ > ':=';"); // 2254 COLON EQUALS
        rules.add("≕ > '=:';"); // 2255 EQUALS COLON
        rules.add("≖ > 'o=';"); // 2256 RING IN EQUAL TO (arbitrary)
        rules.add("≗ > 'o=';"); // 2257 RING EQUAL TO (dup)
        rules.add("≘ > '^=';"); // 2258 CORRESPONDS TO (arbitrary)
        rules.add("≙ > '~=';"); // 2259 ESTIMATES (dup)
        rules.add("≚ > '^=';"); // 225A EQUIANGULAR TO (dup)
        rules.add("≛ > '*=';"); // 225B STAR EQUALS (arbitrary)
        rules.add("≜ > ':=';"); // 225C DELTA EQUAL TO (dup, "defined as")
        rules.add("≝ > ':=';"); // 225D EQUAL TO BY DEFINITION (dup)
        rules.add("≞ > '^=';"); // 225E MEASURED BY (dup)
        rules.add("≟ > '?=';"); // 225F QUESTIONED EQUAL TO

        // Equality / comparison — the well-known, unambiguous ones
        rules.add("≠ > '!=';"); // 2260 NOT EQUAL TO
        rules.add("≡ > '===';"); // 2261 IDENTICAL TO
        rules.add("≢ > '!==';"); // 2262 NOT IDENTICAL TO
        rules.add("≣ > '====';"); // 2263 STRICTLY EQUIVALENT TO (arbitrary
                                  // extension)
        rules.add("≤ > '<=';"); // 2264 LESS-THAN OR EQUAL TO
        rules.add("≥ > '>=';"); // 2265 GREATER-THAN OR EQUAL TO
        rules.add("≦ > '<=';"); // 2266 LESS-THAN OVER EQUAL TO (dup)
        rules.add("≧ > '>=';"); // 2267 GREATER-THAN OVER EQUAL TO (dup)
        rules.add("≨ > '<!=';"); // 2268 LESS-THAN BUT NOT EQUAL TO (arbitrary)
        rules.add("≩ > '>!=';"); // 2269 GREATER-THAN BUT NOT EQUAL TO
                                 // (arbitrary)
        rules.add("≪ > '<<';"); // 226A MUCH LESS-THAN
        rules.add("≫ > '>>';"); // 226B MUCH GREATER-THAN
        rules.add("≬ > '><';"); // 226C BETWEEN (arbitrary)
        rules.add("≭ > '!=~';"); // 226D NOT EQUIVALENT TO (arbitrary)
        rules.add("≮ > '!<';"); // 226E NOT LESS-THAN
        rules.add("≯ > '!>';"); // 226F NOT GREATER-THAN
        rules.add("≰ > '!<=';"); // 2270 NEITHER LESS-THAN NOR EQUAL TO
        rules.add("≱ > '!>=';"); // 2271 NEITHER GREATER-THAN NOR EQUAL TO
        rules.add("≲ > '<~';"); // 2272 LESS-THAN OR EQUIVALENT TO
        rules.add("≳ > '>~';"); // 2273 GREATER-THAN OR EQUIVALENT TO
        rules.add("≴ > '!<~';"); // 2274 NEITHER LESS-THAN NOR EQUIVALENT TO
        rules.add("≵ > '!>~';"); // 2275 NEITHER GREATER-THAN NOR EQUIVALENT TO
        rules.add("≶ > '<>';"); // 2276 LESS-THAN OR GREATER-THAN (arbitrary;
                                // note: '<>' reads as "not equal" in some SQL
                                // dialects — flagged)
        rules.add("≷ > '><';"); // 2277 GREATER-THAN OR LESS-THAN (dup with ≬)
        rules.add("≸ > '!<>';"); // 2278 NEITHER LESS-THAN NOR GREATER-THAN
                                 // (arbitrary)
        rules.add("≹ > '!><';"); // 2279 NEITHER GREATER-THAN NOR LESS-THAN
                                 // (dup, arbitrary)

        // Precedes / succeeds / subset family
        rules.add("≺ > 'prec';"); // 227A PRECEDES
        rules.add("≻ > 'succ';"); // 227B SUCCEEDS
        rules.add("≼ > 'prec=';"); // 227C PRECEDES OR EQUAL TO
        rules.add("≽ > 'succ=';"); // 227D SUCCEEDS OR EQUAL TO
        rules.add("≾ > 'prec~';"); // 227E PRECEDES OR EQUIVALENT TO
        rules.add("≿ > 'succ~';"); // 227F SUCCEEDS OR EQUIVALENT TO
        rules.add("⊀ > '!prec';"); // 2280 DOES NOT PRECEDE
        rules.add("⊁ > '!succ';"); // 2281 DOES NOT SUCCEED
        rules.add("⊂ > 'sub';"); // 2282 SUBSET OF
        rules.add("⊃ > 'sup';"); // 2283 SUPERSET OF
        rules.add("⊄ > '!sub';"); // 2284 NOT A SUBSET OF
        rules.add("⊅ > '!sup';"); // 2285 NOT A SUPERSET OF
        rules.add("⊆ > 'sub=';"); // 2286 SUBSET OF OR EQUAL TO
        rules.add("⊇ > 'sup=';"); // 2287 SUPERSET OF OR EQUAL TO
        rules.add("⊈ > '!sub=';"); // 2288 NEITHER A SUBSET OF NOR EQUAL TO
        rules.add("⊉ > '!sup=';"); // 2289 NEITHER A SUPERSET OF NOR EQUAL TO
        rules.add("⊊ > 'sub!=';"); // 228A SUBSET OF WITH NOT EQUAL TO
        rules.add("⊋ > 'sup!=';"); // 228B SUPERSET OF WITH NOT EQUAL TO

        // Multiset
        rules.add("⊌ > 'mset';"); // 228C MULTISET (arbitrary)
        rules.add("⊍ > 'mset*';"); // 228D MULTISET MULTIPLICATION (arbitrary)
        rules.add("⊎ > 'cup+';"); // 228E MULTISET UNION (arbitrary)

        // Square relations (lattice theory)
        rules.add("⊏ > 'sqsub';"); // 228F SQUARE IMAGE OF
        rules.add("⊐ > 'sqsup';"); // 2290 SQUARE ORIGINAL OF
        rules.add("⊑ > 'sqsub=';"); // 2291 SQUARE IMAGE OF OR EQUAL TO
        rules.add("⊒ > 'sqsup=';"); // 2292 SQUARE ORIGINAL OF OR EQUAL TO
        rules.add("⊓ > 'sqcap';"); // 2293 SQUARE CAP
        rules.add("⊔ > 'sqcup';"); // 2294 SQUARE CUP

        // Circled operators
        rules.add("⊕ > '(+)';"); // 2295 CIRCLED PLUS
        rules.add("⊖ > '(-)';"); // 2296 CIRCLED MINUS
        rules.add("⊗ > '(x)';"); // 2297 CIRCLED TIMES
        rules.add("⊘ > '(/)';"); // 2298 CIRCLED DIVISION SLASH
        rules.add("⊙ > '(.)';"); // 2299 CIRCLED DOT OPERATOR
        rules.add("⊚ > '(o)';"); // 229A CIRCLED RING OPERATOR
        rules.add("⊛ > '(*)';"); // 229B CIRCLED ASTERISK OPERATOR
        rules.add("⊜ > '(=)';"); // 229C CIRCLED EQUALS
        rules.add("⊝ > '(-)';"); // 229D CIRCLED DASH (dup)

        // Squared operators
        rules.add("⊞ > '[+]';"); // 229E SQUARED PLUS
        rules.add("⊟ > '[-]';"); // 229F SQUARED MINUS
        rules.add("⊠ > '[x]';"); // 22A0 SQUARED TIMES
        rules.add("⊡ > '[.]';"); // 22A1 SQUARED DOT OPERATOR

        // Turnstiles / logic entailment
        rules.add("⊢ > '|-';"); // 22A2 RIGHT TACK (proves)
        rules.add("⊣ > '-|';"); // 22A3 LEFT TACK
        rules.add("⊤ > 'T';"); // 22A4 DOWN TACK (top, arbitrary)
        rules.add("⊥ > '_|_';"); // 22A5 UP TACK (bottom)
        rules.add("⊦ > '|-';"); // 22A6 ASSERTION (dup)
        rules.add("⊧ > '|=';"); // 22A7 MODELS
        rules.add("⊨ > '|=';"); // 22A8 TRUE (dup with models, flagged)
        rules.add("⊩ > '|-';"); // 22A9 FORCES (dup)
        rules.add("⊪ > '|||-';"); // 22AA TRIPLE VERTICAL BAR RIGHT TURNSTILE
                                  // (arbitrary)
        rules.add("⊫ > '||=';"); // 22AB DOUBLE VERTICAL BAR DOUBLE RIGHT
                                 // TURNSTILE (arbitrary)
        rules.add("⊬ > '!|-';"); // 22AC DOES NOT PROVE
        rules.add("⊭ > '!|=';"); // 22AD NOT TRUE
        rules.add("⊮ > '!|-';"); // 22AE DOES NOT FORCE (dup)
        rules.add("⊯ > '!||=';"); // 22AF NEGATED DOUBLE VERTICAL BAR DOUBLE
                                  // RIGHT TURNSTILE (dup)

        // Order relations / normal subgroup
        rules.add("⊰ > 'prec.';"); // 22B0 PRECEDES UNDER RELATION (arbitrary)
        rules.add("⊱ > 'succ.';"); // 22B1 SUCCEEDS UNDER RELATION (arbitrary)
        rules.add("⊲ > '<|';"); // 22B2 NORMAL SUBGROUP OF
        rules.add("⊳ > '|>';"); // 22B3 CONTAINS AS NORMAL SUBGROUP
        rules.add("⊴ > '<|=';"); // 22B4 NORMAL SUBGROUP OF OR EQUAL TO
        rules.add("⊵ > '|>=';"); // 22B5 CONTAINS AS NORMAL SUBGROUP OR EQUAL TO
        rules.add("⊶ > 'o-';"); // 22B6 ORIGINAL OF (arbitrary)
        rules.add("⊷ > '-o';"); // 22B7 IMAGE OF (arbitrary)
        rules.add("⊸ > '-o';"); // 22B8 MULTIMAP (dup)
        rules.add("⊹ > '^+';"); // 22B9 HERMITIAN CONJUGATE MATRIX (arbitrary)
        rules.add("⊺ > '^T';"); // 22BA INTERCALATE (arbitrary, "transpose")
        rules.add("⊻ > 'xor';"); // 22BB XOR
        rules.add("⊼ > 'nand';"); // 22BC NAND
        rules.add("⊽ > 'nor';"); // 22BD NOR
        rules.add("⊾ > 'rt.ang';"); // 22BE RIGHT ANGLE WITH ARC (arbitrary)
        rules.add("⊿ > 'tri';"); // 22BF RIGHT TRIANGLE (arbitrary)

        // N-ary logic / set operators
        rules.add("⋀ > '&&';"); // 22C0 N-ARY LOGICAL AND (dup with ∧)
        rules.add("⋁ > '||';"); // 22C1 N-ARY LOGICAL OR (dup with ∨/∥)
        rules.add("⋂ > 'cap';"); // 22C2 N-ARY INTERSECTION (dup with ∩)
        rules.add("⋃ > 'cup';"); // 22C3 N-ARY UNION (dup with ∪)
        rules.add("⋄ > 'diam';"); // 22C4 DIAMOND OPERATOR
        rules.add("⋅ > '.';"); // 22C5 DOT OPERATOR
        rules.add("⋆ > '*';"); // 22C6 STAR OPERATOR (dup with asterisk
                               // operator)
        rules.add("⋇ > './';"); // 22C7 DIVISION TIMES (arbitrary)
        rules.add("⋈ > 'bowtie';"); // 22C8 BOWTIE
        rules.add("⋉ > '|x';"); // 22C9 LEFT NORMAL FACTOR SEMIDIRECT PRODUCT
                                // (arbitrary)
        rules.add("⋊ > 'x|';"); // 22CA RIGHT NORMAL FACTOR SEMIDIRECT PRODUCT
                                // (arbitrary)
        rules.add("⋋ > '|x';"); // 22CB LEFT SEMIDIRECT PRODUCT (dup)
        rules.add("⋌ > 'x|';"); // 22CC RIGHT SEMIDIRECT PRODUCT (dup)
        rules.add("⋍ > '~=';"); // 22CD REVERSED TILDE EQUALS (dup)
        rules.add("⋎ > 'or.';"); // 22CE CURLY LOGICAL OR (arbitrary)
        rules.add("⋏ > 'and.';"); // 22CF CURLY LOGICAL AND (arbitrary)

        // Double subset/superset
        rules.add("⋐ > 'sub2';"); // 22D0 DOUBLE SUBSET
        rules.add("⋑ > 'sup2';"); // 22D1 DOUBLE SUPERSET
        rules.add("⋒ > 'cap2';"); // 22D2 DOUBLE INTERSECTION
        rules.add("⋓ > 'cup2';"); // 22D3 DOUBLE UNION

        rules.add("⋔ > 'pitchfork';"); // 22D4 PITCHFORK
        rules.add("⋕ > '=||';"); // 22D5 EQUAL AND PARALLEL TO (arbitrary)

        // Dotted / very-much comparisons
        rules.add("⋖ > '<.';"); // 22D6 LESS-THAN WITH DOT
        rules.add("⋗ > '>.';"); // 22D7 GREATER-THAN WITH DOT
        rules.add("⋘ > '<<<';"); // 22D8 VERY MUCH LESS-THAN
        rules.add("⋙ > '>>>';"); // 22D9 VERY MUCH GREATER-THAN

        // Combined comparisons
        rules.add("⋚ > '<=>';"); // 22DA LESS-THAN EQUAL TO OR GREATER-THAN
                                 // (arbitrary)
        rules.add("⋛ > '>=<';"); // 22DB GREATER-THAN EQUAL TO OR LESS-THAN
                                 // (arbitrary)
        rules.add("⋜ > '=<';"); // 22DC EQUAL TO OR LESS-THAN
        rules.add("⋝ > '=>';"); // 22DD EQUAL TO OR GREATER-THAN
        rules.add("⋞ > '=prec';"); // 22DE EQUAL TO OR PRECEDES (arbitrary)
        rules.add("⋟ > '=succ';"); // 22DF EQUAL TO OR SUCCEEDS (arbitrary)

        // Negated precede/succeed/square-order
        rules.add("⋠ > '!prec=';"); // 22E0 DOES NOT PRECEDE OR EQUAL
        rules.add("⋡ > '!succ=';"); // 22E1 DOES NOT SUCCEED OR EQUAL
        rules.add("⋢ > '!sqsub=';"); // 22E2 NOT SQUARE IMAGE OF OR EQUAL TO
        rules.add("⋣ > '!sqsup=';"); // 22E3 NOT SQUARE ORIGINAL OF OR EQUAL TO
        rules.add("⋤ > 'sqsub!=';"); // 22E4 SQUARE IMAGE OF OR NOT EQUAL TO
        rules.add("⋥ > 'sqsup!=';"); // 22E5 SQUARE ORIGINAL OF OR NOT EQUAL TO

        // Not-equivalent variants
        rules.add("⋦ > '<!~';"); // 22E6 LESS-THAN BUT NOT EQUIVALENT TO
        rules.add("⋧ > '>!~';"); // 22E7 GREATER-THAN BUT NOT EQUIVALENT TO
        rules.add("⋨ > 'prec!~';"); // 22E8 PRECEDES BUT NOT EQUIVALENT TO
        rules.add("⋩ > 'succ!~';"); // 22E9 SUCCEEDS BUT NOT EQUIVALENT TO

        // Not normal subgroup
        rules.add("⋪ > '!<|';"); // 22EA NOT NORMAL SUBGROUP OF
        rules.add("⋫ > '!|>';"); // 22EB DOES NOT CONTAIN AS NORMAL SUBGROUP
        rules.add("⋬ > '!<|=';"); // 22EC NOT NORMAL SUBGROUP OF OR EQUAL TO
        rules.add("⋭ > '!|>=';"); // 22ED DOES NOT CONTAIN AS NORMAL SUBGROUP OR
                                  // EQUAL

        // Ellipses (orientation not truly representable — approximated)
        rules.add("⋮ > ':';"); // 22EE VERTICAL ELLIPSIS (arbitrary)
        rules.add("⋯ > '...';"); // 22EF MIDLINE HORIZONTAL ELLIPSIS
        rules.add("⋰ > '..\\'';"); // 22F0 UP RIGHT DIAGONAL ELLIPSIS
                                   // (arbitrary)
        rules.add("⋱ > '\\'..';"); // 22F1 DOWN RIGHT DIAGONAL ELLIPSIS
                                   // (arbitrary)

        // Element-of / contains variants (decorated forms — collapsed heavily)
        rules.add("⋲ > 'in-';"); // 22F2 ELEMENT OF WITH LONG HORIZONTAL STROKE
                                 // (arbitrary)
        rules.add("⋳ > 'in|';"); // 22F3 ELEMENT OF WITH VERTICAL BAR AT END OF
                                 // HORIZONTAL STROKE (arbitrary)
        rules.add("⋴ > 'in|';"); // 22F4 SMALL ELEMENT OF WITH VERTICAL BAR AT
                                 // END OF HORIZONTAL STROKE (dup)
        rules.add("⋵ > 'in.';"); // 22F5 ELEMENT OF WITH DOT ABOVE (arbitrary)
        rules.add("⋶ > 'in-';"); // 22F6 ELEMENT OF WITH OVERBAR (dup)
        rules.add("⋷ > 'in-';"); // 22F7 SMALL ELEMENT OF WITH OVERBAR (dup)
        rules.add("⋸ > 'in_';"); // 22F8 ELEMENT OF WITH UNDERBAR (arbitrary)
        rules.add("⋹ > 'in=';"); // 22F9 ELEMENT OF WITH TWO HORIZONTAL STROKES
                                 // (arbitrary)
        rules.add("⋺ > 'ni-';"); // 22FA CONTAINS WITH LONG HORIZONTAL STROKE
                                 // (arbitrary)
        rules.add("⋻ > 'ni|';"); // 22FB CONTAINS WITH VERTICAL BAR AT END OF
                                 // HORIZONTAL STROKE (arbitrary)
        rules.add("⋼ > 'ni|';"); // 22FC SMALL CONTAINS WITH VERTICAL BAR AT END
                                 // OF HORIZONTAL STROKE (dup)
        rules.add("⋽ > 'ni-';"); // 22FD CONTAINS WITH OVERBAR (dup)
        rules.add("⋾ > 'ni-';"); // 22FE SMALL CONTAINS WITH OVERBAR (dup)
        rules.add("⋿ > 'bag';"); // 22FF Z NOTATION BAG MEMBERSHIP (arbitrary)

        TRANSLITERATOR = Transliterator.createFromRules("MathOperators-BasicLatin", String.join("\n", rules),
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
