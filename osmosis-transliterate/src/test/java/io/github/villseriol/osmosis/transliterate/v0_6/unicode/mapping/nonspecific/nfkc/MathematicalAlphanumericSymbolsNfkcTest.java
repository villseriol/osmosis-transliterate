// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.nfkc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.github.villseriol.osmosis.transliterate.v0_6.unicode.UnicodeRange;
import io.github.villseriol.osmosis.transliterate.v0_6.unicode.mapping.nonspecific.NfkcTransform;


public class MathematicalAlphanumericSymbolsNfkcTest {
    /** The transform under test. */
    private final NfkcTransform transform = new NfkcTransform(UnicodeRange.MATHEMATICAL_ALPHANUMERIC_SYMBOLS);

    @Test
    public void testMappedCharacters() {
        assertEquals("A", transform.action("𝐀")); // 1D400 MATHEMATICAL BOLD CAPITAL A
        assertEquals("B", transform.action("𝐁")); // 1D401 MATHEMATICAL BOLD CAPITAL B
        assertEquals("C", transform.action("𝐂")); // 1D402 MATHEMATICAL BOLD CAPITAL C
        assertEquals("D", transform.action("𝐃")); // 1D403 MATHEMATICAL BOLD CAPITAL D
        assertEquals("E", transform.action("𝐄")); // 1D404 MATHEMATICAL BOLD CAPITAL E
        assertEquals("F", transform.action("𝐅")); // 1D405 MATHEMATICAL BOLD CAPITAL F
        assertEquals("G", transform.action("𝐆")); // 1D406 MATHEMATICAL BOLD CAPITAL G
        assertEquals("H", transform.action("𝐇")); // 1D407 MATHEMATICAL BOLD CAPITAL H
        assertEquals("I", transform.action("𝐈")); // 1D408 MATHEMATICAL BOLD CAPITAL I
        assertEquals("J", transform.action("𝐉")); // 1D409 MATHEMATICAL BOLD CAPITAL J
        assertEquals("K", transform.action("𝐊")); // 1D40A MATHEMATICAL BOLD CAPITAL K
        assertEquals("L", transform.action("𝐋")); // 1D40B MATHEMATICAL BOLD CAPITAL L
        assertEquals("M", transform.action("𝐌")); // 1D40C MATHEMATICAL BOLD CAPITAL M
        assertEquals("N", transform.action("𝐍")); // 1D40D MATHEMATICAL BOLD CAPITAL N
        assertEquals("O", transform.action("𝐎")); // 1D40E MATHEMATICAL BOLD CAPITAL O
        assertEquals("P", transform.action("𝐏")); // 1D40F MATHEMATICAL BOLD CAPITAL P
        assertEquals("Q", transform.action("𝐐")); // 1D410 MATHEMATICAL BOLD CAPITAL Q
        assertEquals("R", transform.action("𝐑")); // 1D411 MATHEMATICAL BOLD CAPITAL R
        assertEquals("S", transform.action("𝐒")); // 1D412 MATHEMATICAL BOLD CAPITAL S
        assertEquals("T", transform.action("𝐓")); // 1D413 MATHEMATICAL BOLD CAPITAL T
        assertEquals("U", transform.action("𝐔")); // 1D414 MATHEMATICAL BOLD CAPITAL U
        assertEquals("V", transform.action("𝐕")); // 1D415 MATHEMATICAL BOLD CAPITAL V
        assertEquals("W", transform.action("𝐖")); // 1D416 MATHEMATICAL BOLD CAPITAL W
        assertEquals("X", transform.action("𝐗")); // 1D417 MATHEMATICAL BOLD CAPITAL X
        assertEquals("Y", transform.action("𝐘")); // 1D418 MATHEMATICAL BOLD CAPITAL Y
        assertEquals("Z", transform.action("𝐙")); // 1D419 MATHEMATICAL BOLD CAPITAL Z
        assertEquals("a", transform.action("𝐚")); // 1D41A MATHEMATICAL BOLD SMALL A
        assertEquals("b", transform.action("𝐛")); // 1D41B MATHEMATICAL BOLD SMALL B
        assertEquals("c", transform.action("𝐜")); // 1D41C MATHEMATICAL BOLD SMALL C
        assertEquals("d", transform.action("𝐝")); // 1D41D MATHEMATICAL BOLD SMALL D
        assertEquals("e", transform.action("𝐞")); // 1D41E MATHEMATICAL BOLD SMALL E
        assertEquals("f", transform.action("𝐟")); // 1D41F MATHEMATICAL BOLD SMALL F
        assertEquals("g", transform.action("𝐠")); // 1D420 MATHEMATICAL BOLD SMALL G
        assertEquals("h", transform.action("𝐡")); // 1D421 MATHEMATICAL BOLD SMALL H
        assertEquals("i", transform.action("𝐢")); // 1D422 MATHEMATICAL BOLD SMALL I
        assertEquals("j", transform.action("𝐣")); // 1D423 MATHEMATICAL BOLD SMALL J
        assertEquals("k", transform.action("𝐤")); // 1D424 MATHEMATICAL BOLD SMALL K
        assertEquals("l", transform.action("𝐥")); // 1D425 MATHEMATICAL BOLD SMALL L
        assertEquals("m", transform.action("𝐦")); // 1D426 MATHEMATICAL BOLD SMALL M
        assertEquals("n", transform.action("𝐧")); // 1D427 MATHEMATICAL BOLD SMALL N
        assertEquals("o", transform.action("𝐨")); // 1D428 MATHEMATICAL BOLD SMALL O
        assertEquals("p", transform.action("𝐩")); // 1D429 MATHEMATICAL BOLD SMALL P
        assertEquals("q", transform.action("𝐪")); // 1D42A MATHEMATICAL BOLD SMALL Q
        assertEquals("r", transform.action("𝐫")); // 1D42B MATHEMATICAL BOLD SMALL R
        assertEquals("s", transform.action("𝐬")); // 1D42C MATHEMATICAL BOLD SMALL S
        assertEquals("t", transform.action("𝐭")); // 1D42D MATHEMATICAL BOLD SMALL T
        assertEquals("u", transform.action("𝐮")); // 1D42E MATHEMATICAL BOLD SMALL U
        assertEquals("v", transform.action("𝐯")); // 1D42F MATHEMATICAL BOLD SMALL V
        assertEquals("w", transform.action("𝐰")); // 1D430 MATHEMATICAL BOLD SMALL W
        assertEquals("x", transform.action("𝐱")); // 1D431 MATHEMATICAL BOLD SMALL X
        assertEquals("y", transform.action("𝐲")); // 1D432 MATHEMATICAL BOLD SMALL Y
        assertEquals("z", transform.action("𝐳")); // 1D433 MATHEMATICAL BOLD SMALL Z
        assertEquals("A", transform.action("𝐴")); // 1D434 MATHEMATICAL ITALIC CAPITAL A
        assertEquals("B", transform.action("𝐵")); // 1D435 MATHEMATICAL ITALIC CAPITAL B
        assertEquals("C", transform.action("𝐶")); // 1D436 MATHEMATICAL ITALIC CAPITAL C
        assertEquals("D", transform.action("𝐷")); // 1D437 MATHEMATICAL ITALIC CAPITAL D
        assertEquals("E", transform.action("𝐸")); // 1D438 MATHEMATICAL ITALIC CAPITAL E
        assertEquals("F", transform.action("𝐹")); // 1D439 MATHEMATICAL ITALIC CAPITAL F
        assertEquals("G", transform.action("𝐺")); // 1D43A MATHEMATICAL ITALIC CAPITAL G
        assertEquals("H", transform.action("𝐻")); // 1D43B MATHEMATICAL ITALIC CAPITAL H
        assertEquals("I", transform.action("𝐼")); // 1D43C MATHEMATICAL ITALIC CAPITAL I
        assertEquals("J", transform.action("𝐽")); // 1D43D MATHEMATICAL ITALIC CAPITAL J
        assertEquals("K", transform.action("𝐾")); // 1D43E MATHEMATICAL ITALIC CAPITAL K
        assertEquals("L", transform.action("𝐿")); // 1D43F MATHEMATICAL ITALIC CAPITAL L
        assertEquals("M", transform.action("𝑀")); // 1D440 MATHEMATICAL ITALIC CAPITAL M
        assertEquals("N", transform.action("𝑁")); // 1D441 MATHEMATICAL ITALIC CAPITAL N
        assertEquals("O", transform.action("𝑂")); // 1D442 MATHEMATICAL ITALIC CAPITAL O
        assertEquals("P", transform.action("𝑃")); // 1D443 MATHEMATICAL ITALIC CAPITAL P
        assertEquals("Q", transform.action("𝑄")); // 1D444 MATHEMATICAL ITALIC CAPITAL Q
        assertEquals("R", transform.action("𝑅")); // 1D445 MATHEMATICAL ITALIC CAPITAL R
        assertEquals("S", transform.action("𝑆")); // 1D446 MATHEMATICAL ITALIC CAPITAL S
        assertEquals("T", transform.action("𝑇")); // 1D447 MATHEMATICAL ITALIC CAPITAL T
        assertEquals("U", transform.action("𝑈")); // 1D448 MATHEMATICAL ITALIC CAPITAL U
        assertEquals("V", transform.action("𝑉")); // 1D449 MATHEMATICAL ITALIC CAPITAL V
        assertEquals("W", transform.action("𝑊")); // 1D44A MATHEMATICAL ITALIC CAPITAL W
        assertEquals("X", transform.action("𝑋")); // 1D44B MATHEMATICAL ITALIC CAPITAL X
        assertEquals("Y", transform.action("𝑌")); // 1D44C MATHEMATICAL ITALIC CAPITAL Y
        assertEquals("Z", transform.action("𝑍")); // 1D44D MATHEMATICAL ITALIC CAPITAL Z
        assertEquals("a", transform.action("𝑎")); // 1D44E MATHEMATICAL ITALIC SMALL A
        assertEquals("b", transform.action("𝑏")); // 1D44F MATHEMATICAL ITALIC SMALL B
        assertEquals("c", transform.action("𝑐")); // 1D450 MATHEMATICAL ITALIC SMALL C
        assertEquals("d", transform.action("𝑑")); // 1D451 MATHEMATICAL ITALIC SMALL D
        assertEquals("e", transform.action("𝑒")); // 1D452 MATHEMATICAL ITALIC SMALL E
        assertEquals("f", transform.action("𝑓")); // 1D453 MATHEMATICAL ITALIC SMALL F
        assertEquals("g", transform.action("𝑔")); // 1D454 MATHEMATICAL ITALIC SMALL G
        assertEquals("i", transform.action("𝑖")); // 1D456 MATHEMATICAL ITALIC SMALL I
        assertEquals("j", transform.action("𝑗")); // 1D457 MATHEMATICAL ITALIC SMALL J
        assertEquals("k", transform.action("𝑘")); // 1D458 MATHEMATICAL ITALIC SMALL K
        assertEquals("l", transform.action("𝑙")); // 1D459 MATHEMATICAL ITALIC SMALL L
        assertEquals("m", transform.action("𝑚")); // 1D45A MATHEMATICAL ITALIC SMALL M
        assertEquals("n", transform.action("𝑛")); // 1D45B MATHEMATICAL ITALIC SMALL N
        assertEquals("o", transform.action("𝑜")); // 1D45C MATHEMATICAL ITALIC SMALL O
        assertEquals("p", transform.action("𝑝")); // 1D45D MATHEMATICAL ITALIC SMALL P
        assertEquals("q", transform.action("𝑞")); // 1D45E MATHEMATICAL ITALIC SMALL Q
        assertEquals("r", transform.action("𝑟")); // 1D45F MATHEMATICAL ITALIC SMALL R
        assertEquals("s", transform.action("𝑠")); // 1D460 MATHEMATICAL ITALIC SMALL S
        assertEquals("t", transform.action("𝑡")); // 1D461 MATHEMATICAL ITALIC SMALL T
        assertEquals("u", transform.action("𝑢")); // 1D462 MATHEMATICAL ITALIC SMALL U
        assertEquals("v", transform.action("𝑣")); // 1D463 MATHEMATICAL ITALIC SMALL V
        assertEquals("w", transform.action("𝑤")); // 1D464 MATHEMATICAL ITALIC SMALL W
        assertEquals("x", transform.action("𝑥")); // 1D465 MATHEMATICAL ITALIC SMALL X
        assertEquals("y", transform.action("𝑦")); // 1D466 MATHEMATICAL ITALIC SMALL Y
        assertEquals("z", transform.action("𝑧")); // 1D467 MATHEMATICAL ITALIC SMALL Z
        assertEquals("A", transform.action("𝑨")); // 1D468 MATHEMATICAL BOLD ITALIC CAPITAL A
        assertEquals("B", transform.action("𝑩")); // 1D469 MATHEMATICAL BOLD ITALIC CAPITAL B
        assertEquals("C", transform.action("𝑪")); // 1D46A MATHEMATICAL BOLD ITALIC CAPITAL C
        assertEquals("D", transform.action("𝑫")); // 1D46B MATHEMATICAL BOLD ITALIC CAPITAL D
        assertEquals("E", transform.action("𝑬")); // 1D46C MATHEMATICAL BOLD ITALIC CAPITAL E
        assertEquals("F", transform.action("𝑭")); // 1D46D MATHEMATICAL BOLD ITALIC CAPITAL F
        assertEquals("G", transform.action("𝑮")); // 1D46E MATHEMATICAL BOLD ITALIC CAPITAL G
        assertEquals("H", transform.action("𝑯")); // 1D46F MATHEMATICAL BOLD ITALIC CAPITAL H
        assertEquals("I", transform.action("𝑰")); // 1D470 MATHEMATICAL BOLD ITALIC CAPITAL I
        assertEquals("J", transform.action("𝑱")); // 1D471 MATHEMATICAL BOLD ITALIC CAPITAL J
        assertEquals("K", transform.action("𝑲")); // 1D472 MATHEMATICAL BOLD ITALIC CAPITAL K
        assertEquals("L", transform.action("𝑳")); // 1D473 MATHEMATICAL BOLD ITALIC CAPITAL L
        assertEquals("M", transform.action("𝑴")); // 1D474 MATHEMATICAL BOLD ITALIC CAPITAL M
        assertEquals("N", transform.action("𝑵")); // 1D475 MATHEMATICAL BOLD ITALIC CAPITAL N
        assertEquals("O", transform.action("𝑶")); // 1D476 MATHEMATICAL BOLD ITALIC CAPITAL O
        assertEquals("P", transform.action("𝑷")); // 1D477 MATHEMATICAL BOLD ITALIC CAPITAL P
        assertEquals("Q", transform.action("𝑸")); // 1D478 MATHEMATICAL BOLD ITALIC CAPITAL Q
        assertEquals("R", transform.action("𝑹")); // 1D479 MATHEMATICAL BOLD ITALIC CAPITAL R
        assertEquals("S", transform.action("𝑺")); // 1D47A MATHEMATICAL BOLD ITALIC CAPITAL S
        assertEquals("T", transform.action("𝑻")); // 1D47B MATHEMATICAL BOLD ITALIC CAPITAL T
        assertEquals("U", transform.action("𝑼")); // 1D47C MATHEMATICAL BOLD ITALIC CAPITAL U
        assertEquals("V", transform.action("𝑽")); // 1D47D MATHEMATICAL BOLD ITALIC CAPITAL V
        assertEquals("W", transform.action("𝑾")); // 1D47E MATHEMATICAL BOLD ITALIC CAPITAL W
        assertEquals("X", transform.action("𝑿")); // 1D47F MATHEMATICAL BOLD ITALIC CAPITAL X
        assertEquals("Y", transform.action("𝒀")); // 1D480 MATHEMATICAL BOLD ITALIC CAPITAL Y
        assertEquals("Z", transform.action("𝒁")); // 1D481 MATHEMATICAL BOLD ITALIC CAPITAL Z
        assertEquals("a", transform.action("𝒂")); // 1D482 MATHEMATICAL BOLD ITALIC SMALL A
        assertEquals("b", transform.action("𝒃")); // 1D483 MATHEMATICAL BOLD ITALIC SMALL B
        assertEquals("c", transform.action("𝒄")); // 1D484 MATHEMATICAL BOLD ITALIC SMALL C
        assertEquals("d", transform.action("𝒅")); // 1D485 MATHEMATICAL BOLD ITALIC SMALL D
        assertEquals("e", transform.action("𝒆")); // 1D486 MATHEMATICAL BOLD ITALIC SMALL E
        assertEquals("f", transform.action("𝒇")); // 1D487 MATHEMATICAL BOLD ITALIC SMALL F
        assertEquals("g", transform.action("𝒈")); // 1D488 MATHEMATICAL BOLD ITALIC SMALL G
        assertEquals("h", transform.action("𝒉")); // 1D489 MATHEMATICAL BOLD ITALIC SMALL H
        assertEquals("i", transform.action("𝒊")); // 1D48A MATHEMATICAL BOLD ITALIC SMALL I
        assertEquals("j", transform.action("𝒋")); // 1D48B MATHEMATICAL BOLD ITALIC SMALL J
        assertEquals("k", transform.action("𝒌")); // 1D48C MATHEMATICAL BOLD ITALIC SMALL K
        assertEquals("l", transform.action("𝒍")); // 1D48D MATHEMATICAL BOLD ITALIC SMALL L
        assertEquals("m", transform.action("𝒎")); // 1D48E MATHEMATICAL BOLD ITALIC SMALL M
        assertEquals("n", transform.action("𝒏")); // 1D48F MATHEMATICAL BOLD ITALIC SMALL N
        assertEquals("o", transform.action("𝒐")); // 1D490 MATHEMATICAL BOLD ITALIC SMALL O
        assertEquals("p", transform.action("𝒑")); // 1D491 MATHEMATICAL BOLD ITALIC SMALL P
        assertEquals("q", transform.action("𝒒")); // 1D492 MATHEMATICAL BOLD ITALIC SMALL Q
        assertEquals("r", transform.action("𝒓")); // 1D493 MATHEMATICAL BOLD ITALIC SMALL R
        assertEquals("s", transform.action("𝒔")); // 1D494 MATHEMATICAL BOLD ITALIC SMALL S
        assertEquals("t", transform.action("𝒕")); // 1D495 MATHEMATICAL BOLD ITALIC SMALL T
        assertEquals("u", transform.action("𝒖")); // 1D496 MATHEMATICAL BOLD ITALIC SMALL U
        assertEquals("v", transform.action("𝒗")); // 1D497 MATHEMATICAL BOLD ITALIC SMALL V
        assertEquals("w", transform.action("𝒘")); // 1D498 MATHEMATICAL BOLD ITALIC SMALL W
        assertEquals("x", transform.action("𝒙")); // 1D499 MATHEMATICAL BOLD ITALIC SMALL X
        assertEquals("y", transform.action("𝒚")); // 1D49A MATHEMATICAL BOLD ITALIC SMALL Y
        assertEquals("z", transform.action("𝒛")); // 1D49B MATHEMATICAL BOLD ITALIC SMALL Z
        assertEquals("A", transform.action("𝒜")); // 1D49C MATHEMATICAL SCRIPT CAPITAL A
        assertEquals("C", transform.action("𝒞")); // 1D49E MATHEMATICAL SCRIPT CAPITAL C
        assertEquals("D", transform.action("𝒟")); // 1D49F MATHEMATICAL SCRIPT CAPITAL D
        assertEquals("G", transform.action("𝒢")); // 1D4A2 MATHEMATICAL SCRIPT CAPITAL G
        assertEquals("J", transform.action("𝒥")); // 1D4A5 MATHEMATICAL SCRIPT CAPITAL J
        assertEquals("K", transform.action("𝒦")); // 1D4A6 MATHEMATICAL SCRIPT CAPITAL K
        assertEquals("N", transform.action("𝒩")); // 1D4A9 MATHEMATICAL SCRIPT CAPITAL N
        assertEquals("O", transform.action("𝒪")); // 1D4AA MATHEMATICAL SCRIPT CAPITAL O
        assertEquals("P", transform.action("𝒫")); // 1D4AB MATHEMATICAL SCRIPT CAPITAL P
        assertEquals("Q", transform.action("𝒬")); // 1D4AC MATHEMATICAL SCRIPT CAPITAL Q
        assertEquals("S", transform.action("𝒮")); // 1D4AE MATHEMATICAL SCRIPT CAPITAL S
        assertEquals("T", transform.action("𝒯")); // 1D4AF MATHEMATICAL SCRIPT CAPITAL T
        assertEquals("U", transform.action("𝒰")); // 1D4B0 MATHEMATICAL SCRIPT CAPITAL U
        assertEquals("V", transform.action("𝒱")); // 1D4B1 MATHEMATICAL SCRIPT CAPITAL V
        assertEquals("W", transform.action("𝒲")); // 1D4B2 MATHEMATICAL SCRIPT CAPITAL W
        assertEquals("X", transform.action("𝒳")); // 1D4B3 MATHEMATICAL SCRIPT CAPITAL X
        assertEquals("Y", transform.action("𝒴")); // 1D4B4 MATHEMATICAL SCRIPT CAPITAL Y
        assertEquals("Z", transform.action("𝒵")); // 1D4B5 MATHEMATICAL SCRIPT CAPITAL Z
        assertEquals("a", transform.action("𝒶")); // 1D4B6 MATHEMATICAL SCRIPT SMALL A
        assertEquals("b", transform.action("𝒷")); // 1D4B7 MATHEMATICAL SCRIPT SMALL B
        assertEquals("c", transform.action("𝒸")); // 1D4B8 MATHEMATICAL SCRIPT SMALL C
        assertEquals("d", transform.action("𝒹")); // 1D4B9 MATHEMATICAL SCRIPT SMALL D
        assertEquals("f", transform.action("𝒻")); // 1D4BB MATHEMATICAL SCRIPT SMALL F
        assertEquals("h", transform.action("𝒽")); // 1D4BD MATHEMATICAL SCRIPT SMALL H
        assertEquals("i", transform.action("𝒾")); // 1D4BE MATHEMATICAL SCRIPT SMALL I
        assertEquals("j", transform.action("𝒿")); // 1D4BF MATHEMATICAL SCRIPT SMALL J
        assertEquals("k", transform.action("𝓀")); // 1D4C0 MATHEMATICAL SCRIPT SMALL K
        assertEquals("l", transform.action("𝓁")); // 1D4C1 MATHEMATICAL SCRIPT SMALL L
        assertEquals("m", transform.action("𝓂")); // 1D4C2 MATHEMATICAL SCRIPT SMALL M
        assertEquals("n", transform.action("𝓃")); // 1D4C3 MATHEMATICAL SCRIPT SMALL N
        assertEquals("p", transform.action("𝓅")); // 1D4C5 MATHEMATICAL SCRIPT SMALL P
        assertEquals("q", transform.action("𝓆")); // 1D4C6 MATHEMATICAL SCRIPT SMALL Q
        assertEquals("r", transform.action("𝓇")); // 1D4C7 MATHEMATICAL SCRIPT SMALL R
        assertEquals("s", transform.action("𝓈")); // 1D4C8 MATHEMATICAL SCRIPT SMALL S
        assertEquals("t", transform.action("𝓉")); // 1D4C9 MATHEMATICAL SCRIPT SMALL T
        assertEquals("u", transform.action("𝓊")); // 1D4CA MATHEMATICAL SCRIPT SMALL U
        assertEquals("v", transform.action("𝓋")); // 1D4CB MATHEMATICAL SCRIPT SMALL V
        assertEquals("w", transform.action("𝓌")); // 1D4CC MATHEMATICAL SCRIPT SMALL W
        assertEquals("x", transform.action("𝓍")); // 1D4CD MATHEMATICAL SCRIPT SMALL X
        assertEquals("y", transform.action("𝓎")); // 1D4CE MATHEMATICAL SCRIPT SMALL Y
        assertEquals("z", transform.action("𝓏")); // 1D4CF MATHEMATICAL SCRIPT SMALL Z
        assertEquals("A", transform.action("𝓐")); // 1D4D0 MATHEMATICAL BOLD SCRIPT CAPITAL A
        assertEquals("B", transform.action("𝓑")); // 1D4D1 MATHEMATICAL BOLD SCRIPT CAPITAL B
        assertEquals("C", transform.action("𝓒")); // 1D4D2 MATHEMATICAL BOLD SCRIPT CAPITAL C
        assertEquals("D", transform.action("𝓓")); // 1D4D3 MATHEMATICAL BOLD SCRIPT CAPITAL D
        assertEquals("E", transform.action("𝓔")); // 1D4D4 MATHEMATICAL BOLD SCRIPT CAPITAL E
        assertEquals("F", transform.action("𝓕")); // 1D4D5 MATHEMATICAL BOLD SCRIPT CAPITAL F
        assertEquals("G", transform.action("𝓖")); // 1D4D6 MATHEMATICAL BOLD SCRIPT CAPITAL G
        assertEquals("H", transform.action("𝓗")); // 1D4D7 MATHEMATICAL BOLD SCRIPT CAPITAL H
        assertEquals("I", transform.action("𝓘")); // 1D4D8 MATHEMATICAL BOLD SCRIPT CAPITAL I
        assertEquals("J", transform.action("𝓙")); // 1D4D9 MATHEMATICAL BOLD SCRIPT CAPITAL J
        assertEquals("K", transform.action("𝓚")); // 1D4DA MATHEMATICAL BOLD SCRIPT CAPITAL K
        assertEquals("L", transform.action("𝓛")); // 1D4DB MATHEMATICAL BOLD SCRIPT CAPITAL L
        assertEquals("M", transform.action("𝓜")); // 1D4DC MATHEMATICAL BOLD SCRIPT CAPITAL M
        assertEquals("N", transform.action("𝓝")); // 1D4DD MATHEMATICAL BOLD SCRIPT CAPITAL N
        assertEquals("O", transform.action("𝓞")); // 1D4DE MATHEMATICAL BOLD SCRIPT CAPITAL O
        assertEquals("P", transform.action("𝓟")); // 1D4DF MATHEMATICAL BOLD SCRIPT CAPITAL P
        assertEquals("Q", transform.action("𝓠")); // 1D4E0 MATHEMATICAL BOLD SCRIPT CAPITAL Q
        assertEquals("R", transform.action("𝓡")); // 1D4E1 MATHEMATICAL BOLD SCRIPT CAPITAL R
        assertEquals("S", transform.action("𝓢")); // 1D4E2 MATHEMATICAL BOLD SCRIPT CAPITAL S
        assertEquals("T", transform.action("𝓣")); // 1D4E3 MATHEMATICAL BOLD SCRIPT CAPITAL T
        assertEquals("U", transform.action("𝓤")); // 1D4E4 MATHEMATICAL BOLD SCRIPT CAPITAL U
        assertEquals("V", transform.action("𝓥")); // 1D4E5 MATHEMATICAL BOLD SCRIPT CAPITAL V
        assertEquals("W", transform.action("𝓦")); // 1D4E6 MATHEMATICAL BOLD SCRIPT CAPITAL W
        assertEquals("X", transform.action("𝓧")); // 1D4E7 MATHEMATICAL BOLD SCRIPT CAPITAL X
        assertEquals("Y", transform.action("𝓨")); // 1D4E8 MATHEMATICAL BOLD SCRIPT CAPITAL Y
        assertEquals("Z", transform.action("𝓩")); // 1D4E9 MATHEMATICAL BOLD SCRIPT CAPITAL Z
        assertEquals("a", transform.action("𝓪")); // 1D4EA MATHEMATICAL BOLD SCRIPT SMALL A
        assertEquals("b", transform.action("𝓫")); // 1D4EB MATHEMATICAL BOLD SCRIPT SMALL B
        assertEquals("c", transform.action("𝓬")); // 1D4EC MATHEMATICAL BOLD SCRIPT SMALL C
        assertEquals("d", transform.action("𝓭")); // 1D4ED MATHEMATICAL BOLD SCRIPT SMALL D
        assertEquals("e", transform.action("𝓮")); // 1D4EE MATHEMATICAL BOLD SCRIPT SMALL E
        assertEquals("f", transform.action("𝓯")); // 1D4EF MATHEMATICAL BOLD SCRIPT SMALL F
        assertEquals("g", transform.action("𝓰")); // 1D4F0 MATHEMATICAL BOLD SCRIPT SMALL G
        assertEquals("h", transform.action("𝓱")); // 1D4F1 MATHEMATICAL BOLD SCRIPT SMALL H
        assertEquals("i", transform.action("𝓲")); // 1D4F2 MATHEMATICAL BOLD SCRIPT SMALL I
        assertEquals("j", transform.action("𝓳")); // 1D4F3 MATHEMATICAL BOLD SCRIPT SMALL J
        assertEquals("k", transform.action("𝓴")); // 1D4F4 MATHEMATICAL BOLD SCRIPT SMALL K
        assertEquals("l", transform.action("𝓵")); // 1D4F5 MATHEMATICAL BOLD SCRIPT SMALL L
        assertEquals("m", transform.action("𝓶")); // 1D4F6 MATHEMATICAL BOLD SCRIPT SMALL M
        assertEquals("n", transform.action("𝓷")); // 1D4F7 MATHEMATICAL BOLD SCRIPT SMALL N
        assertEquals("o", transform.action("𝓸")); // 1D4F8 MATHEMATICAL BOLD SCRIPT SMALL O
        assertEquals("p", transform.action("𝓹")); // 1D4F9 MATHEMATICAL BOLD SCRIPT SMALL P
        assertEquals("q", transform.action("𝓺")); // 1D4FA MATHEMATICAL BOLD SCRIPT SMALL Q
        assertEquals("r", transform.action("𝓻")); // 1D4FB MATHEMATICAL BOLD SCRIPT SMALL R
        assertEquals("s", transform.action("𝓼")); // 1D4FC MATHEMATICAL BOLD SCRIPT SMALL S
        assertEquals("t", transform.action("𝓽")); // 1D4FD MATHEMATICAL BOLD SCRIPT SMALL T
        assertEquals("u", transform.action("𝓾")); // 1D4FE MATHEMATICAL BOLD SCRIPT SMALL U
        assertEquals("v", transform.action("𝓿")); // 1D4FF MATHEMATICAL BOLD SCRIPT SMALL V
        assertEquals("w", transform.action("𝔀")); // 1D500 MATHEMATICAL BOLD SCRIPT SMALL W
        assertEquals("x", transform.action("𝔁")); // 1D501 MATHEMATICAL BOLD SCRIPT SMALL X
        assertEquals("y", transform.action("𝔂")); // 1D502 MATHEMATICAL BOLD SCRIPT SMALL Y
        assertEquals("z", transform.action("𝔃")); // 1D503 MATHEMATICAL BOLD SCRIPT SMALL Z
        assertEquals("A", transform.action("𝔄")); // 1D504 MATHEMATICAL FRAKTUR CAPITAL A
        assertEquals("B", transform.action("𝔅")); // 1D505 MATHEMATICAL FRAKTUR CAPITAL B
        assertEquals("D", transform.action("𝔇")); // 1D507 MATHEMATICAL FRAKTUR CAPITAL D
        assertEquals("E", transform.action("𝔈")); // 1D508 MATHEMATICAL FRAKTUR CAPITAL E
        assertEquals("F", transform.action("𝔉")); // 1D509 MATHEMATICAL FRAKTUR CAPITAL F
        assertEquals("G", transform.action("𝔊")); // 1D50A MATHEMATICAL FRAKTUR CAPITAL G
        assertEquals("J", transform.action("𝔍")); // 1D50D MATHEMATICAL FRAKTUR CAPITAL J
        assertEquals("K", transform.action("𝔎")); // 1D50E MATHEMATICAL FRAKTUR CAPITAL K
        assertEquals("L", transform.action("𝔏")); // 1D50F MATHEMATICAL FRAKTUR CAPITAL L
        assertEquals("M", transform.action("𝔐")); // 1D510 MATHEMATICAL FRAKTUR CAPITAL M
        assertEquals("N", transform.action("𝔑")); // 1D511 MATHEMATICAL FRAKTUR CAPITAL N
        assertEquals("O", transform.action("𝔒")); // 1D512 MATHEMATICAL FRAKTUR CAPITAL O
        assertEquals("P", transform.action("𝔓")); // 1D513 MATHEMATICAL FRAKTUR CAPITAL P
        assertEquals("Q", transform.action("𝔔")); // 1D514 MATHEMATICAL FRAKTUR CAPITAL Q
        assertEquals("S", transform.action("𝔖")); // 1D516 MATHEMATICAL FRAKTUR CAPITAL S
        assertEquals("T", transform.action("𝔗")); // 1D517 MATHEMATICAL FRAKTUR CAPITAL T
        assertEquals("U", transform.action("𝔘")); // 1D518 MATHEMATICAL FRAKTUR CAPITAL U
        assertEquals("V", transform.action("𝔙")); // 1D519 MATHEMATICAL FRAKTUR CAPITAL V
        assertEquals("W", transform.action("𝔚")); // 1D51A MATHEMATICAL FRAKTUR CAPITAL W
        assertEquals("X", transform.action("𝔛")); // 1D51B MATHEMATICAL FRAKTUR CAPITAL X
        assertEquals("Y", transform.action("𝔜")); // 1D51C MATHEMATICAL FRAKTUR CAPITAL Y
        assertEquals("a", transform.action("𝔞")); // 1D51E MATHEMATICAL FRAKTUR SMALL A
        assertEquals("b", transform.action("𝔟")); // 1D51F MATHEMATICAL FRAKTUR SMALL B
        assertEquals("c", transform.action("𝔠")); // 1D520 MATHEMATICAL FRAKTUR SMALL C
        assertEquals("d", transform.action("𝔡")); // 1D521 MATHEMATICAL FRAKTUR SMALL D
        assertEquals("e", transform.action("𝔢")); // 1D522 MATHEMATICAL FRAKTUR SMALL E
        assertEquals("f", transform.action("𝔣")); // 1D523 MATHEMATICAL FRAKTUR SMALL F
        assertEquals("g", transform.action("𝔤")); // 1D524 MATHEMATICAL FRAKTUR SMALL G
        assertEquals("h", transform.action("𝔥")); // 1D525 MATHEMATICAL FRAKTUR SMALL H
        assertEquals("i", transform.action("𝔦")); // 1D526 MATHEMATICAL FRAKTUR SMALL I
        assertEquals("j", transform.action("𝔧")); // 1D527 MATHEMATICAL FRAKTUR SMALL J
        assertEquals("k", transform.action("𝔨")); // 1D528 MATHEMATICAL FRAKTUR SMALL K
        assertEquals("l", transform.action("𝔩")); // 1D529 MATHEMATICAL FRAKTUR SMALL L
        assertEquals("m", transform.action("𝔪")); // 1D52A MATHEMATICAL FRAKTUR SMALL M
        assertEquals("n", transform.action("𝔫")); // 1D52B MATHEMATICAL FRAKTUR SMALL N
        assertEquals("o", transform.action("𝔬")); // 1D52C MATHEMATICAL FRAKTUR SMALL O
        assertEquals("p", transform.action("𝔭")); // 1D52D MATHEMATICAL FRAKTUR SMALL P
        assertEquals("q", transform.action("𝔮")); // 1D52E MATHEMATICAL FRAKTUR SMALL Q
        assertEquals("r", transform.action("𝔯")); // 1D52F MATHEMATICAL FRAKTUR SMALL R
        assertEquals("s", transform.action("𝔰")); // 1D530 MATHEMATICAL FRAKTUR SMALL S
        assertEquals("t", transform.action("𝔱")); // 1D531 MATHEMATICAL FRAKTUR SMALL T
        assertEquals("u", transform.action("𝔲")); // 1D532 MATHEMATICAL FRAKTUR SMALL U
        assertEquals("v", transform.action("𝔳")); // 1D533 MATHEMATICAL FRAKTUR SMALL V
        assertEquals("w", transform.action("𝔴")); // 1D534 MATHEMATICAL FRAKTUR SMALL W
        assertEquals("x", transform.action("𝔵")); // 1D535 MATHEMATICAL FRAKTUR SMALL X
        assertEquals("y", transform.action("𝔶")); // 1D536 MATHEMATICAL FRAKTUR SMALL Y
        assertEquals("z", transform.action("𝔷")); // 1D537 MATHEMATICAL FRAKTUR SMALL Z
        assertEquals("A", transform.action("𝔸")); // 1D538 MATHEMATICAL DOUBLE-STRUCK CAPITAL A
        assertEquals("B", transform.action("𝔹")); // 1D539 MATHEMATICAL DOUBLE-STRUCK CAPITAL B
        assertEquals("D", transform.action("𝔻")); // 1D53B MATHEMATICAL DOUBLE-STRUCK CAPITAL D
        assertEquals("E", transform.action("𝔼")); // 1D53C MATHEMATICAL DOUBLE-STRUCK CAPITAL E
        assertEquals("F", transform.action("𝔽")); // 1D53D MATHEMATICAL DOUBLE-STRUCK CAPITAL F
        assertEquals("G", transform.action("𝔾")); // 1D53E MATHEMATICAL DOUBLE-STRUCK CAPITAL G
        assertEquals("I", transform.action("𝕀")); // 1D540 MATHEMATICAL DOUBLE-STRUCK CAPITAL I
        assertEquals("J", transform.action("𝕁")); // 1D541 MATHEMATICAL DOUBLE-STRUCK CAPITAL J
        assertEquals("K", transform.action("𝕂")); // 1D542 MATHEMATICAL DOUBLE-STRUCK CAPITAL K
        assertEquals("L", transform.action("𝕃")); // 1D543 MATHEMATICAL DOUBLE-STRUCK CAPITAL L
        assertEquals("M", transform.action("𝕄")); // 1D544 MATHEMATICAL DOUBLE-STRUCK CAPITAL M
        assertEquals("O", transform.action("𝕆")); // 1D546 MATHEMATICAL DOUBLE-STRUCK CAPITAL O
        assertEquals("S", transform.action("𝕊")); // 1D54A MATHEMATICAL DOUBLE-STRUCK CAPITAL S
        assertEquals("T", transform.action("𝕋")); // 1D54B MATHEMATICAL DOUBLE-STRUCK CAPITAL T
        assertEquals("U", transform.action("𝕌")); // 1D54C MATHEMATICAL DOUBLE-STRUCK CAPITAL U
        assertEquals("V", transform.action("𝕍")); // 1D54D MATHEMATICAL DOUBLE-STRUCK CAPITAL V
        assertEquals("W", transform.action("𝕎")); // 1D54E MATHEMATICAL DOUBLE-STRUCK CAPITAL W
        assertEquals("X", transform.action("𝕏")); // 1D54F MATHEMATICAL DOUBLE-STRUCK CAPITAL X
        assertEquals("Y", transform.action("𝕐")); // 1D550 MATHEMATICAL DOUBLE-STRUCK CAPITAL Y
        assertEquals("a", transform.action("𝕒")); // 1D552 MATHEMATICAL DOUBLE-STRUCK SMALL A
        assertEquals("b", transform.action("𝕓")); // 1D553 MATHEMATICAL DOUBLE-STRUCK SMALL B
        assertEquals("c", transform.action("𝕔")); // 1D554 MATHEMATICAL DOUBLE-STRUCK SMALL C
        assertEquals("d", transform.action("𝕕")); // 1D555 MATHEMATICAL DOUBLE-STRUCK SMALL D
        assertEquals("e", transform.action("𝕖")); // 1D556 MATHEMATICAL DOUBLE-STRUCK SMALL E
        assertEquals("f", transform.action("𝕗")); // 1D557 MATHEMATICAL DOUBLE-STRUCK SMALL F
        assertEquals("g", transform.action("𝕘")); // 1D558 MATHEMATICAL DOUBLE-STRUCK SMALL G
        assertEquals("h", transform.action("𝕙")); // 1D559 MATHEMATICAL DOUBLE-STRUCK SMALL H
        assertEquals("i", transform.action("𝕚")); // 1D55A MATHEMATICAL DOUBLE-STRUCK SMALL I
        assertEquals("j", transform.action("𝕛")); // 1D55B MATHEMATICAL DOUBLE-STRUCK SMALL J
        assertEquals("k", transform.action("𝕜")); // 1D55C MATHEMATICAL DOUBLE-STRUCK SMALL K
        assertEquals("l", transform.action("𝕝")); // 1D55D MATHEMATICAL DOUBLE-STRUCK SMALL L
        assertEquals("m", transform.action("𝕞")); // 1D55E MATHEMATICAL DOUBLE-STRUCK SMALL M
        assertEquals("n", transform.action("𝕟")); // 1D55F MATHEMATICAL DOUBLE-STRUCK SMALL N
        assertEquals("o", transform.action("𝕠")); // 1D560 MATHEMATICAL DOUBLE-STRUCK SMALL O
        assertEquals("p", transform.action("𝕡")); // 1D561 MATHEMATICAL DOUBLE-STRUCK SMALL P
        assertEquals("q", transform.action("𝕢")); // 1D562 MATHEMATICAL DOUBLE-STRUCK SMALL Q
        assertEquals("r", transform.action("𝕣")); // 1D563 MATHEMATICAL DOUBLE-STRUCK SMALL R
        assertEquals("s", transform.action("𝕤")); // 1D564 MATHEMATICAL DOUBLE-STRUCK SMALL S
        assertEquals("t", transform.action("𝕥")); // 1D565 MATHEMATICAL DOUBLE-STRUCK SMALL T
        assertEquals("u", transform.action("𝕦")); // 1D566 MATHEMATICAL DOUBLE-STRUCK SMALL U
        assertEquals("v", transform.action("𝕧")); // 1D567 MATHEMATICAL DOUBLE-STRUCK SMALL V
        assertEquals("w", transform.action("𝕨")); // 1D568 MATHEMATICAL DOUBLE-STRUCK SMALL W
        assertEquals("x", transform.action("𝕩")); // 1D569 MATHEMATICAL DOUBLE-STRUCK SMALL X
        assertEquals("y", transform.action("𝕪")); // 1D56A MATHEMATICAL DOUBLE-STRUCK SMALL Y
        assertEquals("z", transform.action("𝕫")); // 1D56B MATHEMATICAL DOUBLE-STRUCK SMALL Z
        assertEquals("A", transform.action("𝕬")); // 1D56C MATHEMATICAL BOLD FRAKTUR CAPITAL A
        assertEquals("B", transform.action("𝕭")); // 1D56D MATHEMATICAL BOLD FRAKTUR CAPITAL B
        assertEquals("C", transform.action("𝕮")); // 1D56E MATHEMATICAL BOLD FRAKTUR CAPITAL C
        assertEquals("D", transform.action("𝕯")); // 1D56F MATHEMATICAL BOLD FRAKTUR CAPITAL D
        assertEquals("E", transform.action("𝕰")); // 1D570 MATHEMATICAL BOLD FRAKTUR CAPITAL E
        assertEquals("F", transform.action("𝕱")); // 1D571 MATHEMATICAL BOLD FRAKTUR CAPITAL F
        assertEquals("G", transform.action("𝕲")); // 1D572 MATHEMATICAL BOLD FRAKTUR CAPITAL G
        assertEquals("H", transform.action("𝕳")); // 1D573 MATHEMATICAL BOLD FRAKTUR CAPITAL H
        assertEquals("I", transform.action("𝕴")); // 1D574 MATHEMATICAL BOLD FRAKTUR CAPITAL I
        assertEquals("J", transform.action("𝕵")); // 1D575 MATHEMATICAL BOLD FRAKTUR CAPITAL J
        assertEquals("K", transform.action("𝕶")); // 1D576 MATHEMATICAL BOLD FRAKTUR CAPITAL K
        assertEquals("L", transform.action("𝕷")); // 1D577 MATHEMATICAL BOLD FRAKTUR CAPITAL L
        assertEquals("M", transform.action("𝕸")); // 1D578 MATHEMATICAL BOLD FRAKTUR CAPITAL M
        assertEquals("N", transform.action("𝕹")); // 1D579 MATHEMATICAL BOLD FRAKTUR CAPITAL N
        assertEquals("O", transform.action("𝕺")); // 1D57A MATHEMATICAL BOLD FRAKTUR CAPITAL O
        assertEquals("P", transform.action("𝕻")); // 1D57B MATHEMATICAL BOLD FRAKTUR CAPITAL P
        assertEquals("Q", transform.action("𝕼")); // 1D57C MATHEMATICAL BOLD FRAKTUR CAPITAL Q
        assertEquals("R", transform.action("𝕽")); // 1D57D MATHEMATICAL BOLD FRAKTUR CAPITAL R
        assertEquals("S", transform.action("𝕾")); // 1D57E MATHEMATICAL BOLD FRAKTUR CAPITAL S
        assertEquals("T", transform.action("𝕿")); // 1D57F MATHEMATICAL BOLD FRAKTUR CAPITAL T
        assertEquals("U", transform.action("𝖀")); // 1D580 MATHEMATICAL BOLD FRAKTUR CAPITAL U
        assertEquals("V", transform.action("𝖁")); // 1D581 MATHEMATICAL BOLD FRAKTUR CAPITAL V
        assertEquals("W", transform.action("𝖂")); // 1D582 MATHEMATICAL BOLD FRAKTUR CAPITAL W
        assertEquals("X", transform.action("𝖃")); // 1D583 MATHEMATICAL BOLD FRAKTUR CAPITAL X
        assertEquals("Y", transform.action("𝖄")); // 1D584 MATHEMATICAL BOLD FRAKTUR CAPITAL Y
        assertEquals("Z", transform.action("𝖅")); // 1D585 MATHEMATICAL BOLD FRAKTUR CAPITAL Z
        assertEquals("a", transform.action("𝖆")); // 1D586 MATHEMATICAL BOLD FRAKTUR SMALL A
        assertEquals("b", transform.action("𝖇")); // 1D587 MATHEMATICAL BOLD FRAKTUR SMALL B
        assertEquals("c", transform.action("𝖈")); // 1D588 MATHEMATICAL BOLD FRAKTUR SMALL C
        assertEquals("d", transform.action("𝖉")); // 1D589 MATHEMATICAL BOLD FRAKTUR SMALL D
        assertEquals("e", transform.action("𝖊")); // 1D58A MATHEMATICAL BOLD FRAKTUR SMALL E
        assertEquals("f", transform.action("𝖋")); // 1D58B MATHEMATICAL BOLD FRAKTUR SMALL F
        assertEquals("g", transform.action("𝖌")); // 1D58C MATHEMATICAL BOLD FRAKTUR SMALL G
        assertEquals("h", transform.action("𝖍")); // 1D58D MATHEMATICAL BOLD FRAKTUR SMALL H
        assertEquals("i", transform.action("𝖎")); // 1D58E MATHEMATICAL BOLD FRAKTUR SMALL I
        assertEquals("j", transform.action("𝖏")); // 1D58F MATHEMATICAL BOLD FRAKTUR SMALL J
        assertEquals("k", transform.action("𝖐")); // 1D590 MATHEMATICAL BOLD FRAKTUR SMALL K
        assertEquals("l", transform.action("𝖑")); // 1D591 MATHEMATICAL BOLD FRAKTUR SMALL L
        assertEquals("m", transform.action("𝖒")); // 1D592 MATHEMATICAL BOLD FRAKTUR SMALL M
        assertEquals("n", transform.action("𝖓")); // 1D593 MATHEMATICAL BOLD FRAKTUR SMALL N
        assertEquals("o", transform.action("𝖔")); // 1D594 MATHEMATICAL BOLD FRAKTUR SMALL O
        assertEquals("p", transform.action("𝖕")); // 1D595 MATHEMATICAL BOLD FRAKTUR SMALL P
        assertEquals("q", transform.action("𝖖")); // 1D596 MATHEMATICAL BOLD FRAKTUR SMALL Q
        assertEquals("r", transform.action("𝖗")); // 1D597 MATHEMATICAL BOLD FRAKTUR SMALL R
        assertEquals("s", transform.action("𝖘")); // 1D598 MATHEMATICAL BOLD FRAKTUR SMALL S
        assertEquals("t", transform.action("𝖙")); // 1D599 MATHEMATICAL BOLD FRAKTUR SMALL T
        assertEquals("u", transform.action("𝖚")); // 1D59A MATHEMATICAL BOLD FRAKTUR SMALL U
        assertEquals("v", transform.action("𝖛")); // 1D59B MATHEMATICAL BOLD FRAKTUR SMALL V
        assertEquals("w", transform.action("𝖜")); // 1D59C MATHEMATICAL BOLD FRAKTUR SMALL W
        assertEquals("x", transform.action("𝖝")); // 1D59D MATHEMATICAL BOLD FRAKTUR SMALL X
        assertEquals("y", transform.action("𝖞")); // 1D59E MATHEMATICAL BOLD FRAKTUR SMALL Y
        assertEquals("z", transform.action("𝖟")); // 1D59F MATHEMATICAL BOLD FRAKTUR SMALL Z
        assertEquals("A", transform.action("𝖠")); // 1D5A0 MATHEMATICAL SANS-SERIF CAPITAL A
        assertEquals("B", transform.action("𝖡")); // 1D5A1 MATHEMATICAL SANS-SERIF CAPITAL B
        assertEquals("C", transform.action("𝖢")); // 1D5A2 MATHEMATICAL SANS-SERIF CAPITAL C
        assertEquals("D", transform.action("𝖣")); // 1D5A3 MATHEMATICAL SANS-SERIF CAPITAL D
        assertEquals("E", transform.action("𝖤")); // 1D5A4 MATHEMATICAL SANS-SERIF CAPITAL E
        assertEquals("F", transform.action("𝖥")); // 1D5A5 MATHEMATICAL SANS-SERIF CAPITAL F
        assertEquals("G", transform.action("𝖦")); // 1D5A6 MATHEMATICAL SANS-SERIF CAPITAL G
        assertEquals("H", transform.action("𝖧")); // 1D5A7 MATHEMATICAL SANS-SERIF CAPITAL H
        assertEquals("I", transform.action("𝖨")); // 1D5A8 MATHEMATICAL SANS-SERIF CAPITAL I
        assertEquals("J", transform.action("𝖩")); // 1D5A9 MATHEMATICAL SANS-SERIF CAPITAL J
        assertEquals("K", transform.action("𝖪")); // 1D5AA MATHEMATICAL SANS-SERIF CAPITAL K
        assertEquals("L", transform.action("𝖫")); // 1D5AB MATHEMATICAL SANS-SERIF CAPITAL L
        assertEquals("M", transform.action("𝖬")); // 1D5AC MATHEMATICAL SANS-SERIF CAPITAL M
        assertEquals("N", transform.action("𝖭")); // 1D5AD MATHEMATICAL SANS-SERIF CAPITAL N
        assertEquals("O", transform.action("𝖮")); // 1D5AE MATHEMATICAL SANS-SERIF CAPITAL O
        assertEquals("P", transform.action("𝖯")); // 1D5AF MATHEMATICAL SANS-SERIF CAPITAL P
        assertEquals("Q", transform.action("𝖰")); // 1D5B0 MATHEMATICAL SANS-SERIF CAPITAL Q
        assertEquals("R", transform.action("𝖱")); // 1D5B1 MATHEMATICAL SANS-SERIF CAPITAL R
        assertEquals("S", transform.action("𝖲")); // 1D5B2 MATHEMATICAL SANS-SERIF CAPITAL S
        assertEquals("T", transform.action("𝖳")); // 1D5B3 MATHEMATICAL SANS-SERIF CAPITAL T
        assertEquals("U", transform.action("𝖴")); // 1D5B4 MATHEMATICAL SANS-SERIF CAPITAL U
        assertEquals("V", transform.action("𝖵")); // 1D5B5 MATHEMATICAL SANS-SERIF CAPITAL V
        assertEquals("W", transform.action("𝖶")); // 1D5B6 MATHEMATICAL SANS-SERIF CAPITAL W
        assertEquals("X", transform.action("𝖷")); // 1D5B7 MATHEMATICAL SANS-SERIF CAPITAL X
        assertEquals("Y", transform.action("𝖸")); // 1D5B8 MATHEMATICAL SANS-SERIF CAPITAL Y
        assertEquals("Z", transform.action("𝖹")); // 1D5B9 MATHEMATICAL SANS-SERIF CAPITAL Z
        assertEquals("a", transform.action("𝖺")); // 1D5BA MATHEMATICAL SANS-SERIF SMALL A
        assertEquals("b", transform.action("𝖻")); // 1D5BB MATHEMATICAL SANS-SERIF SMALL B
        assertEquals("c", transform.action("𝖼")); // 1D5BC MATHEMATICAL SANS-SERIF SMALL C
        assertEquals("d", transform.action("𝖽")); // 1D5BD MATHEMATICAL SANS-SERIF SMALL D
        assertEquals("e", transform.action("𝖾")); // 1D5BE MATHEMATICAL SANS-SERIF SMALL E
        assertEquals("f", transform.action("𝖿")); // 1D5BF MATHEMATICAL SANS-SERIF SMALL F
        assertEquals("g", transform.action("𝗀")); // 1D5C0 MATHEMATICAL SANS-SERIF SMALL G
        assertEquals("h", transform.action("𝗁")); // 1D5C1 MATHEMATICAL SANS-SERIF SMALL H
        assertEquals("i", transform.action("𝗂")); // 1D5C2 MATHEMATICAL SANS-SERIF SMALL I
        assertEquals("j", transform.action("𝗃")); // 1D5C3 MATHEMATICAL SANS-SERIF SMALL J
        assertEquals("k", transform.action("𝗄")); // 1D5C4 MATHEMATICAL SANS-SERIF SMALL K
        assertEquals("l", transform.action("𝗅")); // 1D5C5 MATHEMATICAL SANS-SERIF SMALL L
        assertEquals("m", transform.action("𝗆")); // 1D5C6 MATHEMATICAL SANS-SERIF SMALL M
        assertEquals("n", transform.action("𝗇")); // 1D5C7 MATHEMATICAL SANS-SERIF SMALL N
        assertEquals("o", transform.action("𝗈")); // 1D5C8 MATHEMATICAL SANS-SERIF SMALL O
        assertEquals("p", transform.action("𝗉")); // 1D5C9 MATHEMATICAL SANS-SERIF SMALL P
        assertEquals("q", transform.action("𝗊")); // 1D5CA MATHEMATICAL SANS-SERIF SMALL Q
        assertEquals("r", transform.action("𝗋")); // 1D5CB MATHEMATICAL SANS-SERIF SMALL R
        assertEquals("s", transform.action("𝗌")); // 1D5CC MATHEMATICAL SANS-SERIF SMALL S
        assertEquals("t", transform.action("𝗍")); // 1D5CD MATHEMATICAL SANS-SERIF SMALL T
        assertEquals("u", transform.action("𝗎")); // 1D5CE MATHEMATICAL SANS-SERIF SMALL U
        assertEquals("v", transform.action("𝗏")); // 1D5CF MATHEMATICAL SANS-SERIF SMALL V
        assertEquals("w", transform.action("𝗐")); // 1D5D0 MATHEMATICAL SANS-SERIF SMALL W
        assertEquals("x", transform.action("𝗑")); // 1D5D1 MATHEMATICAL SANS-SERIF SMALL X
        assertEquals("y", transform.action("𝗒")); // 1D5D2 MATHEMATICAL SANS-SERIF SMALL Y
        assertEquals("z", transform.action("𝗓")); // 1D5D3 MATHEMATICAL SANS-SERIF SMALL Z
        assertEquals("A", transform.action("𝗔")); // 1D5D4 MATHEMATICAL SANS-SERIF BOLD CAPITAL A
        assertEquals("B", transform.action("𝗕")); // 1D5D5 MATHEMATICAL SANS-SERIF BOLD CAPITAL B
        assertEquals("C", transform.action("𝗖")); // 1D5D6 MATHEMATICAL SANS-SERIF BOLD CAPITAL C
        assertEquals("D", transform.action("𝗗")); // 1D5D7 MATHEMATICAL SANS-SERIF BOLD CAPITAL D
        assertEquals("E", transform.action("𝗘")); // 1D5D8 MATHEMATICAL SANS-SERIF BOLD CAPITAL E
        assertEquals("F", transform.action("𝗙")); // 1D5D9 MATHEMATICAL SANS-SERIF BOLD CAPITAL F
        assertEquals("G", transform.action("𝗚")); // 1D5DA MATHEMATICAL SANS-SERIF BOLD CAPITAL G
        assertEquals("H", transform.action("𝗛")); // 1D5DB MATHEMATICAL SANS-SERIF BOLD CAPITAL H
        assertEquals("I", transform.action("𝗜")); // 1D5DC MATHEMATICAL SANS-SERIF BOLD CAPITAL I
        assertEquals("J", transform.action("𝗝")); // 1D5DD MATHEMATICAL SANS-SERIF BOLD CAPITAL J
        assertEquals("K", transform.action("𝗞")); // 1D5DE MATHEMATICAL SANS-SERIF BOLD CAPITAL K
        assertEquals("L", transform.action("𝗟")); // 1D5DF MATHEMATICAL SANS-SERIF BOLD CAPITAL L
        assertEquals("M", transform.action("𝗠")); // 1D5E0 MATHEMATICAL SANS-SERIF BOLD CAPITAL M
        assertEquals("N", transform.action("𝗡")); // 1D5E1 MATHEMATICAL SANS-SERIF BOLD CAPITAL N
        assertEquals("O", transform.action("𝗢")); // 1D5E2 MATHEMATICAL SANS-SERIF BOLD CAPITAL O
        assertEquals("P", transform.action("𝗣")); // 1D5E3 MATHEMATICAL SANS-SERIF BOLD CAPITAL P
        assertEquals("Q", transform.action("𝗤")); // 1D5E4 MATHEMATICAL SANS-SERIF BOLD CAPITAL Q
        assertEquals("R", transform.action("𝗥")); // 1D5E5 MATHEMATICAL SANS-SERIF BOLD CAPITAL R
        assertEquals("S", transform.action("𝗦")); // 1D5E6 MATHEMATICAL SANS-SERIF BOLD CAPITAL S
        assertEquals("T", transform.action("𝗧")); // 1D5E7 MATHEMATICAL SANS-SERIF BOLD CAPITAL T
        assertEquals("U", transform.action("𝗨")); // 1D5E8 MATHEMATICAL SANS-SERIF BOLD CAPITAL U
        assertEquals("V", transform.action("𝗩")); // 1D5E9 MATHEMATICAL SANS-SERIF BOLD CAPITAL V
        assertEquals("W", transform.action("𝗪")); // 1D5EA MATHEMATICAL SANS-SERIF BOLD CAPITAL W
        assertEquals("X", transform.action("𝗫")); // 1D5EB MATHEMATICAL SANS-SERIF BOLD CAPITAL X
        assertEquals("Y", transform.action("𝗬")); // 1D5EC MATHEMATICAL SANS-SERIF BOLD CAPITAL Y
        assertEquals("Z", transform.action("𝗭")); // 1D5ED MATHEMATICAL SANS-SERIF BOLD CAPITAL Z
        assertEquals("a", transform.action("𝗮")); // 1D5EE MATHEMATICAL SANS-SERIF BOLD SMALL A
        assertEquals("b", transform.action("𝗯")); // 1D5EF MATHEMATICAL SANS-SERIF BOLD SMALL B
        assertEquals("c", transform.action("𝗰")); // 1D5F0 MATHEMATICAL SANS-SERIF BOLD SMALL C
        assertEquals("d", transform.action("𝗱")); // 1D5F1 MATHEMATICAL SANS-SERIF BOLD SMALL D
        assertEquals("e", transform.action("𝗲")); // 1D5F2 MATHEMATICAL SANS-SERIF BOLD SMALL E
        assertEquals("f", transform.action("𝗳")); // 1D5F3 MATHEMATICAL SANS-SERIF BOLD SMALL F
        assertEquals("g", transform.action("𝗴")); // 1D5F4 MATHEMATICAL SANS-SERIF BOLD SMALL G
        assertEquals("h", transform.action("𝗵")); // 1D5F5 MATHEMATICAL SANS-SERIF BOLD SMALL H
        assertEquals("i", transform.action("𝗶")); // 1D5F6 MATHEMATICAL SANS-SERIF BOLD SMALL I
        assertEquals("j", transform.action("𝗷")); // 1D5F7 MATHEMATICAL SANS-SERIF BOLD SMALL J
        assertEquals("k", transform.action("𝗸")); // 1D5F8 MATHEMATICAL SANS-SERIF BOLD SMALL K
        assertEquals("l", transform.action("𝗹")); // 1D5F9 MATHEMATICAL SANS-SERIF BOLD SMALL L
        assertEquals("m", transform.action("𝗺")); // 1D5FA MATHEMATICAL SANS-SERIF BOLD SMALL M
        assertEquals("n", transform.action("𝗻")); // 1D5FB MATHEMATICAL SANS-SERIF BOLD SMALL N
        assertEquals("o", transform.action("𝗼")); // 1D5FC MATHEMATICAL SANS-SERIF BOLD SMALL O
        assertEquals("p", transform.action("𝗽")); // 1D5FD MATHEMATICAL SANS-SERIF BOLD SMALL P
        assertEquals("q", transform.action("𝗾")); // 1D5FE MATHEMATICAL SANS-SERIF BOLD SMALL Q
        assertEquals("r", transform.action("𝗿")); // 1D5FF MATHEMATICAL SANS-SERIF BOLD SMALL R
        assertEquals("s", transform.action("𝘀")); // 1D600 MATHEMATICAL SANS-SERIF BOLD SMALL S
        assertEquals("t", transform.action("𝘁")); // 1D601 MATHEMATICAL SANS-SERIF BOLD SMALL T
        assertEquals("u", transform.action("𝘂")); // 1D602 MATHEMATICAL SANS-SERIF BOLD SMALL U
        assertEquals("v", transform.action("𝘃")); // 1D603 MATHEMATICAL SANS-SERIF BOLD SMALL V
        assertEquals("w", transform.action("𝘄")); // 1D604 MATHEMATICAL SANS-SERIF BOLD SMALL W
        assertEquals("x", transform.action("𝘅")); // 1D605 MATHEMATICAL SANS-SERIF BOLD SMALL X
        assertEquals("y", transform.action("𝘆")); // 1D606 MATHEMATICAL SANS-SERIF BOLD SMALL Y
        assertEquals("z", transform.action("𝘇")); // 1D607 MATHEMATICAL SANS-SERIF BOLD SMALL Z
        assertEquals("A", transform.action("𝘈")); // 1D608 MATHEMATICAL SANS-SERIF ITALIC CAPITAL A
        assertEquals("B", transform.action("𝘉")); // 1D609 MATHEMATICAL SANS-SERIF ITALIC CAPITAL B
        assertEquals("C", transform.action("𝘊")); // 1D60A MATHEMATICAL SANS-SERIF ITALIC CAPITAL C
        assertEquals("D", transform.action("𝘋")); // 1D60B MATHEMATICAL SANS-SERIF ITALIC CAPITAL D
        assertEquals("E", transform.action("𝘌")); // 1D60C MATHEMATICAL SANS-SERIF ITALIC CAPITAL E
        assertEquals("F", transform.action("𝘍")); // 1D60D MATHEMATICAL SANS-SERIF ITALIC CAPITAL F
        assertEquals("G", transform.action("𝘎")); // 1D60E MATHEMATICAL SANS-SERIF ITALIC CAPITAL G
        assertEquals("H", transform.action("𝘏")); // 1D60F MATHEMATICAL SANS-SERIF ITALIC CAPITAL H
        assertEquals("I", transform.action("𝘐")); // 1D610 MATHEMATICAL SANS-SERIF ITALIC CAPITAL I
        assertEquals("J", transform.action("𝘑")); // 1D611 MATHEMATICAL SANS-SERIF ITALIC CAPITAL J
        assertEquals("K", transform.action("𝘒")); // 1D612 MATHEMATICAL SANS-SERIF ITALIC CAPITAL K
        assertEquals("L", transform.action("𝘓")); // 1D613 MATHEMATICAL SANS-SERIF ITALIC CAPITAL L
        assertEquals("M", transform.action("𝘔")); // 1D614 MATHEMATICAL SANS-SERIF ITALIC CAPITAL M
        assertEquals("N", transform.action("𝘕")); // 1D615 MATHEMATICAL SANS-SERIF ITALIC CAPITAL N
        assertEquals("O", transform.action("𝘖")); // 1D616 MATHEMATICAL SANS-SERIF ITALIC CAPITAL O
        assertEquals("P", transform.action("𝘗")); // 1D617 MATHEMATICAL SANS-SERIF ITALIC CAPITAL P
        assertEquals("Q", transform.action("𝘘")); // 1D618 MATHEMATICAL SANS-SERIF ITALIC CAPITAL Q
        assertEquals("R", transform.action("𝘙")); // 1D619 MATHEMATICAL SANS-SERIF ITALIC CAPITAL R
        assertEquals("S", transform.action("𝘚")); // 1D61A MATHEMATICAL SANS-SERIF ITALIC CAPITAL S
        assertEquals("T", transform.action("𝘛")); // 1D61B MATHEMATICAL SANS-SERIF ITALIC CAPITAL T
        assertEquals("U", transform.action("𝘜")); // 1D61C MATHEMATICAL SANS-SERIF ITALIC CAPITAL U
        assertEquals("V", transform.action("𝘝")); // 1D61D MATHEMATICAL SANS-SERIF ITALIC CAPITAL V
        assertEquals("W", transform.action("𝘞")); // 1D61E MATHEMATICAL SANS-SERIF ITALIC CAPITAL W
        assertEquals("X", transform.action("𝘟")); // 1D61F MATHEMATICAL SANS-SERIF ITALIC CAPITAL X
        assertEquals("Y", transform.action("𝘠")); // 1D620 MATHEMATICAL SANS-SERIF ITALIC CAPITAL Y
        assertEquals("Z", transform.action("𝘡")); // 1D621 MATHEMATICAL SANS-SERIF ITALIC CAPITAL Z
        assertEquals("a", transform.action("𝘢")); // 1D622 MATHEMATICAL SANS-SERIF ITALIC SMALL A
        assertEquals("b", transform.action("𝘣")); // 1D623 MATHEMATICAL SANS-SERIF ITALIC SMALL B
        assertEquals("c", transform.action("𝘤")); // 1D624 MATHEMATICAL SANS-SERIF ITALIC SMALL C
        assertEquals("d", transform.action("𝘥")); // 1D625 MATHEMATICAL SANS-SERIF ITALIC SMALL D
        assertEquals("e", transform.action("𝘦")); // 1D626 MATHEMATICAL SANS-SERIF ITALIC SMALL E
        assertEquals("f", transform.action("𝘧")); // 1D627 MATHEMATICAL SANS-SERIF ITALIC SMALL F
        assertEquals("g", transform.action("𝘨")); // 1D628 MATHEMATICAL SANS-SERIF ITALIC SMALL G
        assertEquals("h", transform.action("𝘩")); // 1D629 MATHEMATICAL SANS-SERIF ITALIC SMALL H
        assertEquals("i", transform.action("𝘪")); // 1D62A MATHEMATICAL SANS-SERIF ITALIC SMALL I
        assertEquals("j", transform.action("𝘫")); // 1D62B MATHEMATICAL SANS-SERIF ITALIC SMALL J
        assertEquals("k", transform.action("𝘬")); // 1D62C MATHEMATICAL SANS-SERIF ITALIC SMALL K
        assertEquals("l", transform.action("𝘭")); // 1D62D MATHEMATICAL SANS-SERIF ITALIC SMALL L
        assertEquals("m", transform.action("𝘮")); // 1D62E MATHEMATICAL SANS-SERIF ITALIC SMALL M
        assertEquals("n", transform.action("𝘯")); // 1D62F MATHEMATICAL SANS-SERIF ITALIC SMALL N
        assertEquals("o", transform.action("𝘰")); // 1D630 MATHEMATICAL SANS-SERIF ITALIC SMALL O
        assertEquals("p", transform.action("𝘱")); // 1D631 MATHEMATICAL SANS-SERIF ITALIC SMALL P
        assertEquals("q", transform.action("𝘲")); // 1D632 MATHEMATICAL SANS-SERIF ITALIC SMALL Q
        assertEquals("r", transform.action("𝘳")); // 1D633 MATHEMATICAL SANS-SERIF ITALIC SMALL R
        assertEquals("s", transform.action("𝘴")); // 1D634 MATHEMATICAL SANS-SERIF ITALIC SMALL S
        assertEquals("t", transform.action("𝘵")); // 1D635 MATHEMATICAL SANS-SERIF ITALIC SMALL T
        assertEquals("u", transform.action("𝘶")); // 1D636 MATHEMATICAL SANS-SERIF ITALIC SMALL U
        assertEquals("v", transform.action("𝘷")); // 1D637 MATHEMATICAL SANS-SERIF ITALIC SMALL V
        assertEquals("w", transform.action("𝘸")); // 1D638 MATHEMATICAL SANS-SERIF ITALIC SMALL W
        assertEquals("x", transform.action("𝘹")); // 1D639 MATHEMATICAL SANS-SERIF ITALIC SMALL X
        assertEquals("y", transform.action("𝘺")); // 1D63A MATHEMATICAL SANS-SERIF ITALIC SMALL Y
        assertEquals("z", transform.action("𝘻")); // 1D63B MATHEMATICAL SANS-SERIF ITALIC SMALL Z
        assertEquals("A", transform.action("𝘼")); // 1D63C MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL A
        assertEquals("B", transform.action("𝘽")); // 1D63D MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL B
        assertEquals("C", transform.action("𝘾")); // 1D63E MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL C
        assertEquals("D", transform.action("𝘿")); // 1D63F MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL D
        assertEquals("E", transform.action("𝙀")); // 1D640 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL E
        assertEquals("F", transform.action("𝙁")); // 1D641 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL F
        assertEquals("G", transform.action("𝙂")); // 1D642 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL G
        assertEquals("H", transform.action("𝙃")); // 1D643 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL H
        assertEquals("I", transform.action("𝙄")); // 1D644 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL I
        assertEquals("J", transform.action("𝙅")); // 1D645 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL J
        assertEquals("K", transform.action("𝙆")); // 1D646 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL K
        assertEquals("L", transform.action("𝙇")); // 1D647 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL L
        assertEquals("M", transform.action("𝙈")); // 1D648 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL M
        assertEquals("N", transform.action("𝙉")); // 1D649 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL N
        assertEquals("O", transform.action("𝙊")); // 1D64A MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL O
        assertEquals("P", transform.action("𝙋")); // 1D64B MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL P
        assertEquals("Q", transform.action("𝙌")); // 1D64C MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL Q
        assertEquals("R", transform.action("𝙍")); // 1D64D MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL R
        assertEquals("S", transform.action("𝙎")); // 1D64E MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL S
        assertEquals("T", transform.action("𝙏")); // 1D64F MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL T
        assertEquals("U", transform.action("𝙐")); // 1D650 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL U
        assertEquals("V", transform.action("𝙑")); // 1D651 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL V
        assertEquals("W", transform.action("𝙒")); // 1D652 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL W
        assertEquals("X", transform.action("𝙓")); // 1D653 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL X
        assertEquals("Y", transform.action("𝙔")); // 1D654 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL Y
        assertEquals("Z", transform.action("𝙕")); // 1D655 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL Z
        assertEquals("a", transform.action("𝙖")); // 1D656 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL A
        assertEquals("b", transform.action("𝙗")); // 1D657 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL B
        assertEquals("c", transform.action("𝙘")); // 1D658 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL C
        assertEquals("d", transform.action("𝙙")); // 1D659 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL D
        assertEquals("e", transform.action("𝙚")); // 1D65A MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL E
        assertEquals("f", transform.action("𝙛")); // 1D65B MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL F
        assertEquals("g", transform.action("𝙜")); // 1D65C MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL G
        assertEquals("h", transform.action("𝙝")); // 1D65D MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL H
        assertEquals("i", transform.action("𝙞")); // 1D65E MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL I
        assertEquals("j", transform.action("𝙟")); // 1D65F MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL J
        assertEquals("k", transform.action("𝙠")); // 1D660 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL K
        assertEquals("l", transform.action("𝙡")); // 1D661 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL L
        assertEquals("m", transform.action("𝙢")); // 1D662 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL M
        assertEquals("n", transform.action("𝙣")); // 1D663 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL N
        assertEquals("o", transform.action("𝙤")); // 1D664 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL O
        assertEquals("p", transform.action("𝙥")); // 1D665 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL P
        assertEquals("q", transform.action("𝙦")); // 1D666 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL Q
        assertEquals("r", transform.action("𝙧")); // 1D667 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL R
        assertEquals("s", transform.action("𝙨")); // 1D668 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL S
        assertEquals("t", transform.action("𝙩")); // 1D669 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL T
        assertEquals("u", transform.action("𝙪")); // 1D66A MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL U
        assertEquals("v", transform.action("𝙫")); // 1D66B MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL V
        assertEquals("w", transform.action("𝙬")); // 1D66C MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL W
        assertEquals("x", transform.action("𝙭")); // 1D66D MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL X
        assertEquals("y", transform.action("𝙮")); // 1D66E MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL Y
        assertEquals("z", transform.action("𝙯")); // 1D66F MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL Z
        assertEquals("A", transform.action("𝙰")); // 1D670 MATHEMATICAL MONOSPACE CAPITAL A
        assertEquals("B", transform.action("𝙱")); // 1D671 MATHEMATICAL MONOSPACE CAPITAL B
        assertEquals("C", transform.action("𝙲")); // 1D672 MATHEMATICAL MONOSPACE CAPITAL C
        assertEquals("D", transform.action("𝙳")); // 1D673 MATHEMATICAL MONOSPACE CAPITAL D
        assertEquals("E", transform.action("𝙴")); // 1D674 MATHEMATICAL MONOSPACE CAPITAL E
        assertEquals("F", transform.action("𝙵")); // 1D675 MATHEMATICAL MONOSPACE CAPITAL F
        assertEquals("G", transform.action("𝙶")); // 1D676 MATHEMATICAL MONOSPACE CAPITAL G
        assertEquals("H", transform.action("𝙷")); // 1D677 MATHEMATICAL MONOSPACE CAPITAL H
        assertEquals("I", transform.action("𝙸")); // 1D678 MATHEMATICAL MONOSPACE CAPITAL I
        assertEquals("J", transform.action("𝙹")); // 1D679 MATHEMATICAL MONOSPACE CAPITAL J
        assertEquals("K", transform.action("𝙺")); // 1D67A MATHEMATICAL MONOSPACE CAPITAL K
        assertEquals("L", transform.action("𝙻")); // 1D67B MATHEMATICAL MONOSPACE CAPITAL L
        assertEquals("M", transform.action("𝙼")); // 1D67C MATHEMATICAL MONOSPACE CAPITAL M
        assertEquals("N", transform.action("𝙽")); // 1D67D MATHEMATICAL MONOSPACE CAPITAL N
        assertEquals("O", transform.action("𝙾")); // 1D67E MATHEMATICAL MONOSPACE CAPITAL O
        assertEquals("P", transform.action("𝙿")); // 1D67F MATHEMATICAL MONOSPACE CAPITAL P
        assertEquals("Q", transform.action("𝚀")); // 1D680 MATHEMATICAL MONOSPACE CAPITAL Q
        assertEquals("R", transform.action("𝚁")); // 1D681 MATHEMATICAL MONOSPACE CAPITAL R
        assertEquals("S", transform.action("𝚂")); // 1D682 MATHEMATICAL MONOSPACE CAPITAL S
        assertEquals("T", transform.action("𝚃")); // 1D683 MATHEMATICAL MONOSPACE CAPITAL T
        assertEquals("U", transform.action("𝚄")); // 1D684 MATHEMATICAL MONOSPACE CAPITAL U
        assertEquals("V", transform.action("𝚅")); // 1D685 MATHEMATICAL MONOSPACE CAPITAL V
        assertEquals("W", transform.action("𝚆")); // 1D686 MATHEMATICAL MONOSPACE CAPITAL W
        assertEquals("X", transform.action("𝚇")); // 1D687 MATHEMATICAL MONOSPACE CAPITAL X
        assertEquals("Y", transform.action("𝚈")); // 1D688 MATHEMATICAL MONOSPACE CAPITAL Y
        assertEquals("Z", transform.action("𝚉")); // 1D689 MATHEMATICAL MONOSPACE CAPITAL Z
        assertEquals("a", transform.action("𝚊")); // 1D68A MATHEMATICAL MONOSPACE SMALL A
        assertEquals("b", transform.action("𝚋")); // 1D68B MATHEMATICAL MONOSPACE SMALL B
        assertEquals("c", transform.action("𝚌")); // 1D68C MATHEMATICAL MONOSPACE SMALL C
        assertEquals("d", transform.action("𝚍")); // 1D68D MATHEMATICAL MONOSPACE SMALL D
        assertEquals("e", transform.action("𝚎")); // 1D68E MATHEMATICAL MONOSPACE SMALL E
        assertEquals("f", transform.action("𝚏")); // 1D68F MATHEMATICAL MONOSPACE SMALL F
        assertEquals("g", transform.action("𝚐")); // 1D690 MATHEMATICAL MONOSPACE SMALL G
        assertEquals("h", transform.action("𝚑")); // 1D691 MATHEMATICAL MONOSPACE SMALL H
        assertEquals("i", transform.action("𝚒")); // 1D692 MATHEMATICAL MONOSPACE SMALL I
        assertEquals("j", transform.action("𝚓")); // 1D693 MATHEMATICAL MONOSPACE SMALL J
        assertEquals("k", transform.action("𝚔")); // 1D694 MATHEMATICAL MONOSPACE SMALL K
        assertEquals("l", transform.action("𝚕")); // 1D695 MATHEMATICAL MONOSPACE SMALL L
        assertEquals("m", transform.action("𝚖")); // 1D696 MATHEMATICAL MONOSPACE SMALL M
        assertEquals("n", transform.action("𝚗")); // 1D697 MATHEMATICAL MONOSPACE SMALL N
        assertEquals("o", transform.action("𝚘")); // 1D698 MATHEMATICAL MONOSPACE SMALL O
        assertEquals("p", transform.action("𝚙")); // 1D699 MATHEMATICAL MONOSPACE SMALL P
        assertEquals("q", transform.action("𝚚")); // 1D69A MATHEMATICAL MONOSPACE SMALL Q
        assertEquals("r", transform.action("𝚛")); // 1D69B MATHEMATICAL MONOSPACE SMALL R
        assertEquals("s", transform.action("𝚜")); // 1D69C MATHEMATICAL MONOSPACE SMALL S
        assertEquals("t", transform.action("𝚝")); // 1D69D MATHEMATICAL MONOSPACE SMALL T
        assertEquals("u", transform.action("𝚞")); // 1D69E MATHEMATICAL MONOSPACE SMALL U
        assertEquals("v", transform.action("𝚟")); // 1D69F MATHEMATICAL MONOSPACE SMALL V
        assertEquals("w", transform.action("𝚠")); // 1D6A0 MATHEMATICAL MONOSPACE SMALL W
        assertEquals("x", transform.action("𝚡")); // 1D6A1 MATHEMATICAL MONOSPACE SMALL X
        assertEquals("y", transform.action("𝚢")); // 1D6A2 MATHEMATICAL MONOSPACE SMALL Y
        assertEquals("z", transform.action("𝚣")); // 1D6A3 MATHEMATICAL MONOSPACE SMALL Z
        assertEquals("ı", transform.action("𝚤")); // 1D6A4 MATHEMATICAL ITALIC SMALL DOTLESS I
        assertEquals("ȷ", transform.action("𝚥")); // 1D6A5 MATHEMATICAL ITALIC SMALL DOTLESS J
        assertEquals("Α", transform.action("𝚨")); // 1D6A8 MATHEMATICAL BOLD CAPITAL ALPHA
        assertEquals("Β", transform.action("𝚩")); // 1D6A9 MATHEMATICAL BOLD CAPITAL BETA
        assertEquals("Γ", transform.action("𝚪")); // 1D6AA MATHEMATICAL BOLD CAPITAL GAMMA
        assertEquals("Δ", transform.action("𝚫")); // 1D6AB MATHEMATICAL BOLD CAPITAL DELTA
        assertEquals("Ε", transform.action("𝚬")); // 1D6AC MATHEMATICAL BOLD CAPITAL EPSILON
        assertEquals("Ζ", transform.action("𝚭")); // 1D6AD MATHEMATICAL BOLD CAPITAL ZETA
        assertEquals("Η", transform.action("𝚮")); // 1D6AE MATHEMATICAL BOLD CAPITAL ETA
        assertEquals("Θ", transform.action("𝚯")); // 1D6AF MATHEMATICAL BOLD CAPITAL THETA
        assertEquals("Ι", transform.action("𝚰")); // 1D6B0 MATHEMATICAL BOLD CAPITAL IOTA
        assertEquals("Κ", transform.action("𝚱")); // 1D6B1 MATHEMATICAL BOLD CAPITAL KAPPA
        assertEquals("Λ", transform.action("𝚲")); // 1D6B2 MATHEMATICAL BOLD CAPITAL LAMDA
        assertEquals("Μ", transform.action("𝚳")); // 1D6B3 MATHEMATICAL BOLD CAPITAL MU
        assertEquals("Ν", transform.action("𝚴")); // 1D6B4 MATHEMATICAL BOLD CAPITAL NU
        assertEquals("Ξ", transform.action("𝚵")); // 1D6B5 MATHEMATICAL BOLD CAPITAL XI
        assertEquals("Ο", transform.action("𝚶")); // 1D6B6 MATHEMATICAL BOLD CAPITAL OMICRON
        assertEquals("Π", transform.action("𝚷")); // 1D6B7 MATHEMATICAL BOLD CAPITAL PI
        assertEquals("Ρ", transform.action("𝚸")); // 1D6B8 MATHEMATICAL BOLD CAPITAL RHO
        assertEquals("Θ", transform.action("𝚹")); // 1D6B9 MATHEMATICAL BOLD CAPITAL THETA SYMBOL
        assertEquals("Σ", transform.action("𝚺")); // 1D6BA MATHEMATICAL BOLD CAPITAL SIGMA
        assertEquals("Τ", transform.action("𝚻")); // 1D6BB MATHEMATICAL BOLD CAPITAL TAU
        assertEquals("Υ", transform.action("𝚼")); // 1D6BC MATHEMATICAL BOLD CAPITAL UPSILON
        assertEquals("Φ", transform.action("𝚽")); // 1D6BD MATHEMATICAL BOLD CAPITAL PHI
        assertEquals("Χ", transform.action("𝚾")); // 1D6BE MATHEMATICAL BOLD CAPITAL CHI
        assertEquals("Ψ", transform.action("𝚿")); // 1D6BF MATHEMATICAL BOLD CAPITAL PSI
        assertEquals("Ω", transform.action("𝛀")); // 1D6C0 MATHEMATICAL BOLD CAPITAL OMEGA
        assertEquals("∇", transform.action("𝛁")); // 1D6C1 MATHEMATICAL BOLD NABLA
        assertEquals("α", transform.action("𝛂")); // 1D6C2 MATHEMATICAL BOLD SMALL ALPHA
        assertEquals("β", transform.action("𝛃")); // 1D6C3 MATHEMATICAL BOLD SMALL BETA
        assertEquals("γ", transform.action("𝛄")); // 1D6C4 MATHEMATICAL BOLD SMALL GAMMA
        assertEquals("δ", transform.action("𝛅")); // 1D6C5 MATHEMATICAL BOLD SMALL DELTA
        assertEquals("ε", transform.action("𝛆")); // 1D6C6 MATHEMATICAL BOLD SMALL EPSILON
        assertEquals("ζ", transform.action("𝛇")); // 1D6C7 MATHEMATICAL BOLD SMALL ZETA
        assertEquals("η", transform.action("𝛈")); // 1D6C8 MATHEMATICAL BOLD SMALL ETA
        assertEquals("θ", transform.action("𝛉")); // 1D6C9 MATHEMATICAL BOLD SMALL THETA
        assertEquals("ι", transform.action("𝛊")); // 1D6CA MATHEMATICAL BOLD SMALL IOTA
        assertEquals("κ", transform.action("𝛋")); // 1D6CB MATHEMATICAL BOLD SMALL KAPPA
        assertEquals("λ", transform.action("𝛌")); // 1D6CC MATHEMATICAL BOLD SMALL LAMDA
        assertEquals("μ", transform.action("𝛍")); // 1D6CD MATHEMATICAL BOLD SMALL MU
        assertEquals("ν", transform.action("𝛎")); // 1D6CE MATHEMATICAL BOLD SMALL NU
        assertEquals("ξ", transform.action("𝛏")); // 1D6CF MATHEMATICAL BOLD SMALL XI
        assertEquals("ο", transform.action("𝛐")); // 1D6D0 MATHEMATICAL BOLD SMALL OMICRON
        assertEquals("π", transform.action("𝛑")); // 1D6D1 MATHEMATICAL BOLD SMALL PI
        assertEquals("ρ", transform.action("𝛒")); // 1D6D2 MATHEMATICAL BOLD SMALL RHO
        assertEquals("ς", transform.action("𝛓")); // 1D6D3 MATHEMATICAL BOLD SMALL FINAL SIGMA
        assertEquals("σ", transform.action("𝛔")); // 1D6D4 MATHEMATICAL BOLD SMALL SIGMA
        assertEquals("τ", transform.action("𝛕")); // 1D6D5 MATHEMATICAL BOLD SMALL TAU
        assertEquals("υ", transform.action("𝛖")); // 1D6D6 MATHEMATICAL BOLD SMALL UPSILON
        assertEquals("φ", transform.action("𝛗")); // 1D6D7 MATHEMATICAL BOLD SMALL PHI
        assertEquals("χ", transform.action("𝛘")); // 1D6D8 MATHEMATICAL BOLD SMALL CHI
        assertEquals("ψ", transform.action("𝛙")); // 1D6D9 MATHEMATICAL BOLD SMALL PSI
        assertEquals("ω", transform.action("𝛚")); // 1D6DA MATHEMATICAL BOLD SMALL OMEGA
        assertEquals("∂", transform.action("𝛛")); // 1D6DB MATHEMATICAL BOLD PARTIAL DIFFERENTIAL
        assertEquals("ε", transform.action("𝛜")); // 1D6DC MATHEMATICAL BOLD EPSILON SYMBOL
        assertEquals("θ", transform.action("𝛝")); // 1D6DD MATHEMATICAL BOLD THETA SYMBOL
        assertEquals("κ", transform.action("𝛞")); // 1D6DE MATHEMATICAL BOLD KAPPA SYMBOL
        assertEquals("φ", transform.action("𝛟")); // 1D6DF MATHEMATICAL BOLD PHI SYMBOL
        assertEquals("ρ", transform.action("𝛠")); // 1D6E0 MATHEMATICAL BOLD RHO SYMBOL
        assertEquals("π", transform.action("𝛡")); // 1D6E1 MATHEMATICAL BOLD PI SYMBOL
        assertEquals("Α", transform.action("𝛢")); // 1D6E2 MATHEMATICAL ITALIC CAPITAL ALPHA
        assertEquals("Β", transform.action("𝛣")); // 1D6E3 MATHEMATICAL ITALIC CAPITAL BETA
        assertEquals("Γ", transform.action("𝛤")); // 1D6E4 MATHEMATICAL ITALIC CAPITAL GAMMA
        assertEquals("Δ", transform.action("𝛥")); // 1D6E5 MATHEMATICAL ITALIC CAPITAL DELTA
        assertEquals("Ε", transform.action("𝛦")); // 1D6E6 MATHEMATICAL ITALIC CAPITAL EPSILON
        assertEquals("Ζ", transform.action("𝛧")); // 1D6E7 MATHEMATICAL ITALIC CAPITAL ZETA
        assertEquals("Η", transform.action("𝛨")); // 1D6E8 MATHEMATICAL ITALIC CAPITAL ETA
        assertEquals("Θ", transform.action("𝛩")); // 1D6E9 MATHEMATICAL ITALIC CAPITAL THETA
        assertEquals("Ι", transform.action("𝛪")); // 1D6EA MATHEMATICAL ITALIC CAPITAL IOTA
        assertEquals("Κ", transform.action("𝛫")); // 1D6EB MATHEMATICAL ITALIC CAPITAL KAPPA
        assertEquals("Λ", transform.action("𝛬")); // 1D6EC MATHEMATICAL ITALIC CAPITAL LAMDA
        assertEquals("Μ", transform.action("𝛭")); // 1D6ED MATHEMATICAL ITALIC CAPITAL MU
        assertEquals("Ν", transform.action("𝛮")); // 1D6EE MATHEMATICAL ITALIC CAPITAL NU
        assertEquals("Ξ", transform.action("𝛯")); // 1D6EF MATHEMATICAL ITALIC CAPITAL XI
        assertEquals("Ο", transform.action("𝛰")); // 1D6F0 MATHEMATICAL ITALIC CAPITAL OMICRON
        assertEquals("Π", transform.action("𝛱")); // 1D6F1 MATHEMATICAL ITALIC CAPITAL PI
        assertEquals("Ρ", transform.action("𝛲")); // 1D6F2 MATHEMATICAL ITALIC CAPITAL RHO
        assertEquals("Θ", transform.action("𝛳")); // 1D6F3 MATHEMATICAL ITALIC CAPITAL THETA SYMBOL
        assertEquals("Σ", transform.action("𝛴")); // 1D6F4 MATHEMATICAL ITALIC CAPITAL SIGMA
        assertEquals("Τ", transform.action("𝛵")); // 1D6F5 MATHEMATICAL ITALIC CAPITAL TAU
        assertEquals("Υ", transform.action("𝛶")); // 1D6F6 MATHEMATICAL ITALIC CAPITAL UPSILON
        assertEquals("Φ", transform.action("𝛷")); // 1D6F7 MATHEMATICAL ITALIC CAPITAL PHI
        assertEquals("Χ", transform.action("𝛸")); // 1D6F8 MATHEMATICAL ITALIC CAPITAL CHI
        assertEquals("Ψ", transform.action("𝛹")); // 1D6F9 MATHEMATICAL ITALIC CAPITAL PSI
        assertEquals("Ω", transform.action("𝛺")); // 1D6FA MATHEMATICAL ITALIC CAPITAL OMEGA
        assertEquals("∇", transform.action("𝛻")); // 1D6FB MATHEMATICAL ITALIC NABLA
        assertEquals("α", transform.action("𝛼")); // 1D6FC MATHEMATICAL ITALIC SMALL ALPHA
        assertEquals("β", transform.action("𝛽")); // 1D6FD MATHEMATICAL ITALIC SMALL BETA
        assertEquals("γ", transform.action("𝛾")); // 1D6FE MATHEMATICAL ITALIC SMALL GAMMA
        assertEquals("δ", transform.action("𝛿")); // 1D6FF MATHEMATICAL ITALIC SMALL DELTA
        assertEquals("ε", transform.action("𝜀")); // 1D700 MATHEMATICAL ITALIC SMALL EPSILON
        assertEquals("ζ", transform.action("𝜁")); // 1D701 MATHEMATICAL ITALIC SMALL ZETA
        assertEquals("η", transform.action("𝜂")); // 1D702 MATHEMATICAL ITALIC SMALL ETA
        assertEquals("θ", transform.action("𝜃")); // 1D703 MATHEMATICAL ITALIC SMALL THETA
        assertEquals("ι", transform.action("𝜄")); // 1D704 MATHEMATICAL ITALIC SMALL IOTA
        assertEquals("κ", transform.action("𝜅")); // 1D705 MATHEMATICAL ITALIC SMALL KAPPA
        assertEquals("λ", transform.action("𝜆")); // 1D706 MATHEMATICAL ITALIC SMALL LAMDA
        assertEquals("μ", transform.action("𝜇")); // 1D707 MATHEMATICAL ITALIC SMALL MU
        assertEquals("ν", transform.action("𝜈")); // 1D708 MATHEMATICAL ITALIC SMALL NU
        assertEquals("ξ", transform.action("𝜉")); // 1D709 MATHEMATICAL ITALIC SMALL XI
        assertEquals("ο", transform.action("𝜊")); // 1D70A MATHEMATICAL ITALIC SMALL OMICRON
        assertEquals("π", transform.action("𝜋")); // 1D70B MATHEMATICAL ITALIC SMALL PI
        assertEquals("ρ", transform.action("𝜌")); // 1D70C MATHEMATICAL ITALIC SMALL RHO
        assertEquals("ς", transform.action("𝜍")); // 1D70D MATHEMATICAL ITALIC SMALL FINAL SIGMA
        assertEquals("σ", transform.action("𝜎")); // 1D70E MATHEMATICAL ITALIC SMALL SIGMA
        assertEquals("τ", transform.action("𝜏")); // 1D70F MATHEMATICAL ITALIC SMALL TAU
        assertEquals("υ", transform.action("𝜐")); // 1D710 MATHEMATICAL ITALIC SMALL UPSILON
        assertEquals("φ", transform.action("𝜑")); // 1D711 MATHEMATICAL ITALIC SMALL PHI
        assertEquals("χ", transform.action("𝜒")); // 1D712 MATHEMATICAL ITALIC SMALL CHI
        assertEquals("ψ", transform.action("𝜓")); // 1D713 MATHEMATICAL ITALIC SMALL PSI
        assertEquals("ω", transform.action("𝜔")); // 1D714 MATHEMATICAL ITALIC SMALL OMEGA
        assertEquals("∂", transform.action("𝜕")); // 1D715 MATHEMATICAL ITALIC PARTIAL DIFFERENTIAL
        assertEquals("ε", transform.action("𝜖")); // 1D716 MATHEMATICAL ITALIC EPSILON SYMBOL
        assertEquals("θ", transform.action("𝜗")); // 1D717 MATHEMATICAL ITALIC THETA SYMBOL
        assertEquals("κ", transform.action("𝜘")); // 1D718 MATHEMATICAL ITALIC KAPPA SYMBOL
        assertEquals("φ", transform.action("𝜙")); // 1D719 MATHEMATICAL ITALIC PHI SYMBOL
        assertEquals("ρ", transform.action("𝜚")); // 1D71A MATHEMATICAL ITALIC RHO SYMBOL
        assertEquals("π", transform.action("𝜛")); // 1D71B MATHEMATICAL ITALIC PI SYMBOL
        assertEquals("Α", transform.action("𝜜")); // 1D71C MATHEMATICAL BOLD ITALIC CAPITAL ALPHA
        assertEquals("Β", transform.action("𝜝")); // 1D71D MATHEMATICAL BOLD ITALIC CAPITAL BETA
        assertEquals("Γ", transform.action("𝜞")); // 1D71E MATHEMATICAL BOLD ITALIC CAPITAL GAMMA
        assertEquals("Δ", transform.action("𝜟")); // 1D71F MATHEMATICAL BOLD ITALIC CAPITAL DELTA
        assertEquals("Ε", transform.action("𝜠")); // 1D720 MATHEMATICAL BOLD ITALIC CAPITAL EPSILON
        assertEquals("Ζ", transform.action("𝜡")); // 1D721 MATHEMATICAL BOLD ITALIC CAPITAL ZETA
        assertEquals("Η", transform.action("𝜢")); // 1D722 MATHEMATICAL BOLD ITALIC CAPITAL ETA
        assertEquals("Θ", transform.action("𝜣")); // 1D723 MATHEMATICAL BOLD ITALIC CAPITAL THETA
        assertEquals("Ι", transform.action("𝜤")); // 1D724 MATHEMATICAL BOLD ITALIC CAPITAL IOTA
        assertEquals("Κ", transform.action("𝜥")); // 1D725 MATHEMATICAL BOLD ITALIC CAPITAL KAPPA
        assertEquals("Λ", transform.action("𝜦")); // 1D726 MATHEMATICAL BOLD ITALIC CAPITAL LAMDA
        assertEquals("Μ", transform.action("𝜧")); // 1D727 MATHEMATICAL BOLD ITALIC CAPITAL MU
        assertEquals("Ν", transform.action("𝜨")); // 1D728 MATHEMATICAL BOLD ITALIC CAPITAL NU
        assertEquals("Ξ", transform.action("𝜩")); // 1D729 MATHEMATICAL BOLD ITALIC CAPITAL XI
        assertEquals("Ο", transform.action("𝜪")); // 1D72A MATHEMATICAL BOLD ITALIC CAPITAL OMICRON
        assertEquals("Π", transform.action("𝜫")); // 1D72B MATHEMATICAL BOLD ITALIC CAPITAL PI
        assertEquals("Ρ", transform.action("𝜬")); // 1D72C MATHEMATICAL BOLD ITALIC CAPITAL RHO
        assertEquals("Θ", transform.action("𝜭")); // 1D72D MATHEMATICAL BOLD ITALIC CAPITAL THETA SYMBOL
        assertEquals("Σ", transform.action("𝜮")); // 1D72E MATHEMATICAL BOLD ITALIC CAPITAL SIGMA
        assertEquals("Τ", transform.action("𝜯")); // 1D72F MATHEMATICAL BOLD ITALIC CAPITAL TAU
        assertEquals("Υ", transform.action("𝜰")); // 1D730 MATHEMATICAL BOLD ITALIC CAPITAL UPSILON
        assertEquals("Φ", transform.action("𝜱")); // 1D731 MATHEMATICAL BOLD ITALIC CAPITAL PHI
        assertEquals("Χ", transform.action("𝜲")); // 1D732 MATHEMATICAL BOLD ITALIC CAPITAL CHI
        assertEquals("Ψ", transform.action("𝜳")); // 1D733 MATHEMATICAL BOLD ITALIC CAPITAL PSI
        assertEquals("Ω", transform.action("𝜴")); // 1D734 MATHEMATICAL BOLD ITALIC CAPITAL OMEGA
        assertEquals("∇", transform.action("𝜵")); // 1D735 MATHEMATICAL BOLD ITALIC NABLA
        assertEquals("α", transform.action("𝜶")); // 1D736 MATHEMATICAL BOLD ITALIC SMALL ALPHA
        assertEquals("β", transform.action("𝜷")); // 1D737 MATHEMATICAL BOLD ITALIC SMALL BETA
        assertEquals("γ", transform.action("𝜸")); // 1D738 MATHEMATICAL BOLD ITALIC SMALL GAMMA
        assertEquals("δ", transform.action("𝜹")); // 1D739 MATHEMATICAL BOLD ITALIC SMALL DELTA
        assertEquals("ε", transform.action("𝜺")); // 1D73A MATHEMATICAL BOLD ITALIC SMALL EPSILON
        assertEquals("ζ", transform.action("𝜻")); // 1D73B MATHEMATICAL BOLD ITALIC SMALL ZETA
        assertEquals("η", transform.action("𝜼")); // 1D73C MATHEMATICAL BOLD ITALIC SMALL ETA
        assertEquals("θ", transform.action("𝜽")); // 1D73D MATHEMATICAL BOLD ITALIC SMALL THETA
        assertEquals("ι", transform.action("𝜾")); // 1D73E MATHEMATICAL BOLD ITALIC SMALL IOTA
        assertEquals("κ", transform.action("𝜿")); // 1D73F MATHEMATICAL BOLD ITALIC SMALL KAPPA
        assertEquals("λ", transform.action("𝝀")); // 1D740 MATHEMATICAL BOLD ITALIC SMALL LAMDA
        assertEquals("μ", transform.action("𝝁")); // 1D741 MATHEMATICAL BOLD ITALIC SMALL MU
        assertEquals("ν", transform.action("𝝂")); // 1D742 MATHEMATICAL BOLD ITALIC SMALL NU
        assertEquals("ξ", transform.action("𝝃")); // 1D743 MATHEMATICAL BOLD ITALIC SMALL XI
        assertEquals("ο", transform.action("𝝄")); // 1D744 MATHEMATICAL BOLD ITALIC SMALL OMICRON
        assertEquals("π", transform.action("𝝅")); // 1D745 MATHEMATICAL BOLD ITALIC SMALL PI
        assertEquals("ρ", transform.action("𝝆")); // 1D746 MATHEMATICAL BOLD ITALIC SMALL RHO
        assertEquals("ς", transform.action("𝝇")); // 1D747 MATHEMATICAL BOLD ITALIC SMALL FINAL SIGMA
        assertEquals("σ", transform.action("𝝈")); // 1D748 MATHEMATICAL BOLD ITALIC SMALL SIGMA
        assertEquals("τ", transform.action("𝝉")); // 1D749 MATHEMATICAL BOLD ITALIC SMALL TAU
        assertEquals("υ", transform.action("𝝊")); // 1D74A MATHEMATICAL BOLD ITALIC SMALL UPSILON
        assertEquals("φ", transform.action("𝝋")); // 1D74B MATHEMATICAL BOLD ITALIC SMALL PHI
        assertEquals("χ", transform.action("𝝌")); // 1D74C MATHEMATICAL BOLD ITALIC SMALL CHI
        assertEquals("ψ", transform.action("𝝍")); // 1D74D MATHEMATICAL BOLD ITALIC SMALL PSI
        assertEquals("ω", transform.action("𝝎")); // 1D74E MATHEMATICAL BOLD ITALIC SMALL OMEGA
        assertEquals("∂", transform.action("𝝏")); // 1D74F MATHEMATICAL BOLD ITALIC PARTIAL DIFFERENTIAL
        assertEquals("ε", transform.action("𝝐")); // 1D750 MATHEMATICAL BOLD ITALIC EPSILON SYMBOL
        assertEquals("θ", transform.action("𝝑")); // 1D751 MATHEMATICAL BOLD ITALIC THETA SYMBOL
        assertEquals("κ", transform.action("𝝒")); // 1D752 MATHEMATICAL BOLD ITALIC KAPPA SYMBOL
        assertEquals("φ", transform.action("𝝓")); // 1D753 MATHEMATICAL BOLD ITALIC PHI SYMBOL
        assertEquals("ρ", transform.action("𝝔")); // 1D754 MATHEMATICAL BOLD ITALIC RHO SYMBOL
        assertEquals("π", transform.action("𝝕")); // 1D755 MATHEMATICAL BOLD ITALIC PI SYMBOL
        assertEquals("Α", transform.action("𝝖")); // 1D756 MATHEMATICAL SANS-SERIF BOLD CAPITAL ALPHA
        assertEquals("Β", transform.action("𝝗")); // 1D757 MATHEMATICAL SANS-SERIF BOLD CAPITAL BETA
        assertEquals("Γ", transform.action("𝝘")); // 1D758 MATHEMATICAL SANS-SERIF BOLD CAPITAL GAMMA
        assertEquals("Δ", transform.action("𝝙")); // 1D759 MATHEMATICAL SANS-SERIF BOLD CAPITAL DELTA
        assertEquals("Ε", transform.action("𝝚")); // 1D75A MATHEMATICAL SANS-SERIF BOLD CAPITAL EPSILON
        assertEquals("Ζ", transform.action("𝝛")); // 1D75B MATHEMATICAL SANS-SERIF BOLD CAPITAL ZETA
        assertEquals("Η", transform.action("𝝜")); // 1D75C MATHEMATICAL SANS-SERIF BOLD CAPITAL ETA
        assertEquals("Θ", transform.action("𝝝")); // 1D75D MATHEMATICAL SANS-SERIF BOLD CAPITAL THETA
        assertEquals("Ι", transform.action("𝝞")); // 1D75E MATHEMATICAL SANS-SERIF BOLD CAPITAL IOTA
        assertEquals("Κ", transform.action("𝝟")); // 1D75F MATHEMATICAL SANS-SERIF BOLD CAPITAL KAPPA
        assertEquals("Λ", transform.action("𝝠")); // 1D760 MATHEMATICAL SANS-SERIF BOLD CAPITAL LAMDA
        assertEquals("Μ", transform.action("𝝡")); // 1D761 MATHEMATICAL SANS-SERIF BOLD CAPITAL MU
        assertEquals("Ν", transform.action("𝝢")); // 1D762 MATHEMATICAL SANS-SERIF BOLD CAPITAL NU
        assertEquals("Ξ", transform.action("𝝣")); // 1D763 MATHEMATICAL SANS-SERIF BOLD CAPITAL XI
        assertEquals("Ο", transform.action("𝝤")); // 1D764 MATHEMATICAL SANS-SERIF BOLD CAPITAL OMICRON
        assertEquals("Π", transform.action("𝝥")); // 1D765 MATHEMATICAL SANS-SERIF BOLD CAPITAL PI
        assertEquals("Ρ", transform.action("𝝦")); // 1D766 MATHEMATICAL SANS-SERIF BOLD CAPITAL RHO
        assertEquals("Θ", transform.action("𝝧")); // 1D767 MATHEMATICAL SANS-SERIF BOLD CAPITAL THETA SYMBOL
        assertEquals("Σ", transform.action("𝝨")); // 1D768 MATHEMATICAL SANS-SERIF BOLD CAPITAL SIGMA
        assertEquals("Τ", transform.action("𝝩")); // 1D769 MATHEMATICAL SANS-SERIF BOLD CAPITAL TAU
        assertEquals("Υ", transform.action("𝝪")); // 1D76A MATHEMATICAL SANS-SERIF BOLD CAPITAL UPSILON
        assertEquals("Φ", transform.action("𝝫")); // 1D76B MATHEMATICAL SANS-SERIF BOLD CAPITAL PHI
        assertEquals("Χ", transform.action("𝝬")); // 1D76C MATHEMATICAL SANS-SERIF BOLD CAPITAL CHI
        assertEquals("Ψ", transform.action("𝝭")); // 1D76D MATHEMATICAL SANS-SERIF BOLD CAPITAL PSI
        assertEquals("Ω", transform.action("𝝮")); // 1D76E MATHEMATICAL SANS-SERIF BOLD CAPITAL OMEGA
        assertEquals("∇", transform.action("𝝯")); // 1D76F MATHEMATICAL SANS-SERIF BOLD NABLA
        assertEquals("α", transform.action("𝝰")); // 1D770 MATHEMATICAL SANS-SERIF BOLD SMALL ALPHA
        assertEquals("β", transform.action("𝝱")); // 1D771 MATHEMATICAL SANS-SERIF BOLD SMALL BETA
        assertEquals("γ", transform.action("𝝲")); // 1D772 MATHEMATICAL SANS-SERIF BOLD SMALL GAMMA
        assertEquals("δ", transform.action("𝝳")); // 1D773 MATHEMATICAL SANS-SERIF BOLD SMALL DELTA
        assertEquals("ε", transform.action("𝝴")); // 1D774 MATHEMATICAL SANS-SERIF BOLD SMALL EPSILON
        assertEquals("ζ", transform.action("𝝵")); // 1D775 MATHEMATICAL SANS-SERIF BOLD SMALL ZETA
        assertEquals("η", transform.action("𝝶")); // 1D776 MATHEMATICAL SANS-SERIF BOLD SMALL ETA
        assertEquals("θ", transform.action("𝝷")); // 1D777 MATHEMATICAL SANS-SERIF BOLD SMALL THETA
        assertEquals("ι", transform.action("𝝸")); // 1D778 MATHEMATICAL SANS-SERIF BOLD SMALL IOTA
        assertEquals("κ", transform.action("𝝹")); // 1D779 MATHEMATICAL SANS-SERIF BOLD SMALL KAPPA
        assertEquals("λ", transform.action("𝝺")); // 1D77A MATHEMATICAL SANS-SERIF BOLD SMALL LAMDA
        assertEquals("μ", transform.action("𝝻")); // 1D77B MATHEMATICAL SANS-SERIF BOLD SMALL MU
        assertEquals("ν", transform.action("𝝼")); // 1D77C MATHEMATICAL SANS-SERIF BOLD SMALL NU
        assertEquals("ξ", transform.action("𝝽")); // 1D77D MATHEMATICAL SANS-SERIF BOLD SMALL XI
        assertEquals("ο", transform.action("𝝾")); // 1D77E MATHEMATICAL SANS-SERIF BOLD SMALL OMICRON
        assertEquals("π", transform.action("𝝿")); // 1D77F MATHEMATICAL SANS-SERIF BOLD SMALL PI
        assertEquals("ρ", transform.action("𝞀")); // 1D780 MATHEMATICAL SANS-SERIF BOLD SMALL RHO
        assertEquals("ς", transform.action("𝞁")); // 1D781 MATHEMATICAL SANS-SERIF BOLD SMALL FINAL SIGMA
        assertEquals("σ", transform.action("𝞂")); // 1D782 MATHEMATICAL SANS-SERIF BOLD SMALL SIGMA
        assertEquals("τ", transform.action("𝞃")); // 1D783 MATHEMATICAL SANS-SERIF BOLD SMALL TAU
        assertEquals("υ", transform.action("𝞄")); // 1D784 MATHEMATICAL SANS-SERIF BOLD SMALL UPSILON
        assertEquals("φ", transform.action("𝞅")); // 1D785 MATHEMATICAL SANS-SERIF BOLD SMALL PHI
        assertEquals("χ", transform.action("𝞆")); // 1D786 MATHEMATICAL SANS-SERIF BOLD SMALL CHI
        assertEquals("ψ", transform.action("𝞇")); // 1D787 MATHEMATICAL SANS-SERIF BOLD SMALL PSI
        assertEquals("ω", transform.action("𝞈")); // 1D788 MATHEMATICAL SANS-SERIF BOLD SMALL OMEGA
        assertEquals("∂", transform.action("𝞉")); // 1D789 MATHEMATICAL SANS-SERIF BOLD PARTIAL DIFFERENTIAL
        assertEquals("ε", transform.action("𝞊")); // 1D78A MATHEMATICAL SANS-SERIF BOLD EPSILON SYMBOL
        assertEquals("θ", transform.action("𝞋")); // 1D78B MATHEMATICAL SANS-SERIF BOLD THETA SYMBOL
        assertEquals("κ", transform.action("𝞌")); // 1D78C MATHEMATICAL SANS-SERIF BOLD KAPPA SYMBOL
        assertEquals("φ", transform.action("𝞍")); // 1D78D MATHEMATICAL SANS-SERIF BOLD PHI SYMBOL
        assertEquals("ρ", transform.action("𝞎")); // 1D78E MATHEMATICAL SANS-SERIF BOLD RHO SYMBOL
        assertEquals("π", transform.action("𝞏")); // 1D78F MATHEMATICAL SANS-SERIF BOLD PI SYMBOL
        assertEquals("Α", transform.action("𝞐")); // 1D790 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL ALPHA
        assertEquals("Β", transform.action("𝞑")); // 1D791 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL BETA
        assertEquals("Γ", transform.action("𝞒")); // 1D792 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL GAMMA
        assertEquals("Δ", transform.action("𝞓")); // 1D793 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL DELTA
        assertEquals("Ε", transform.action("𝞔")); // 1D794 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL EPSILON
        assertEquals("Ζ", transform.action("𝞕")); // 1D795 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL ZETA
        assertEquals("Η", transform.action("𝞖")); // 1D796 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL ETA
        assertEquals("Θ", transform.action("𝞗")); // 1D797 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL THETA
        assertEquals("Ι", transform.action("𝞘")); // 1D798 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL IOTA
        assertEquals("Κ", transform.action("𝞙")); // 1D799 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL KAPPA
        assertEquals("Λ", transform.action("𝞚")); // 1D79A MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL LAMDA
        assertEquals("Μ", transform.action("𝞛")); // 1D79B MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL MU
        assertEquals("Ν", transform.action("𝞜")); // 1D79C MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL NU
        assertEquals("Ξ", transform.action("𝞝")); // 1D79D MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL XI
        assertEquals("Ο", transform.action("𝞞")); // 1D79E MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL OMICRON
        assertEquals("Π", transform.action("𝞟")); // 1D79F MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL PI
        assertEquals("Ρ", transform.action("𝞠")); // 1D7A0 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL RHO
        assertEquals("Θ", transform.action("𝞡")); // 1D7A1 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL THETA SYMBOL
        assertEquals("Σ", transform.action("𝞢")); // 1D7A2 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL SIGMA
        assertEquals("Τ", transform.action("𝞣")); // 1D7A3 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL TAU
        assertEquals("Υ", transform.action("𝞤")); // 1D7A4 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL UPSILON
        assertEquals("Φ", transform.action("𝞥")); // 1D7A5 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL PHI
        assertEquals("Χ", transform.action("𝞦")); // 1D7A6 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL CHI
        assertEquals("Ψ", transform.action("𝞧")); // 1D7A7 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL PSI
        assertEquals("Ω", transform.action("𝞨")); // 1D7A8 MATHEMATICAL SANS-SERIF BOLD ITALIC CAPITAL OMEGA
        assertEquals("∇", transform.action("𝞩")); // 1D7A9 MATHEMATICAL SANS-SERIF BOLD ITALIC NABLA
        assertEquals("α", transform.action("𝞪")); // 1D7AA MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL ALPHA
        assertEquals("β", transform.action("𝞫")); // 1D7AB MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL BETA
        assertEquals("γ", transform.action("𝞬")); // 1D7AC MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL GAMMA
        assertEquals("δ", transform.action("𝞭")); // 1D7AD MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL DELTA
        assertEquals("ε", transform.action("𝞮")); // 1D7AE MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL EPSILON
        assertEquals("ζ", transform.action("𝞯")); // 1D7AF MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL ZETA
        assertEquals("η", transform.action("𝞰")); // 1D7B0 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL ETA
        assertEquals("θ", transform.action("𝞱")); // 1D7B1 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL THETA
        assertEquals("ι", transform.action("𝞲")); // 1D7B2 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL IOTA
        assertEquals("κ", transform.action("𝞳")); // 1D7B3 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL KAPPA
        assertEquals("λ", transform.action("𝞴")); // 1D7B4 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL LAMDA
        assertEquals("μ", transform.action("𝞵")); // 1D7B5 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL MU
        assertEquals("ν", transform.action("𝞶")); // 1D7B6 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL NU
        assertEquals("ξ", transform.action("𝞷")); // 1D7B7 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL XI
        assertEquals("ο", transform.action("𝞸")); // 1D7B8 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL OMICRON
        assertEquals("π", transform.action("𝞹")); // 1D7B9 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL PI
        assertEquals("ρ", transform.action("𝞺")); // 1D7BA MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL RHO
        assertEquals("ς", transform.action("𝞻")); // 1D7BB MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL FINAL SIGMA
        assertEquals("σ", transform.action("𝞼")); // 1D7BC MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL SIGMA
        assertEquals("τ", transform.action("𝞽")); // 1D7BD MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL TAU
        assertEquals("υ", transform.action("𝞾")); // 1D7BE MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL UPSILON
        assertEquals("φ", transform.action("𝞿")); // 1D7BF MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL PHI
        assertEquals("χ", transform.action("𝟀")); // 1D7C0 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL CHI
        assertEquals("ψ", transform.action("𝟁")); // 1D7C1 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL PSI
        assertEquals("ω", transform.action("𝟂")); // 1D7C2 MATHEMATICAL SANS-SERIF BOLD ITALIC SMALL OMEGA
        assertEquals("∂", transform.action("𝟃")); // 1D7C3 MATHEMATICAL SANS-SERIF BOLD ITALIC PARTIAL DIFFERENTIAL
        assertEquals("ε", transform.action("𝟄")); // 1D7C4 MATHEMATICAL SANS-SERIF BOLD ITALIC EPSILON SYMBOL
        assertEquals("θ", transform.action("𝟅")); // 1D7C5 MATHEMATICAL SANS-SERIF BOLD ITALIC THETA SYMBOL
        assertEquals("κ", transform.action("𝟆")); // 1D7C6 MATHEMATICAL SANS-SERIF BOLD ITALIC KAPPA SYMBOL
        assertEquals("φ", transform.action("𝟇")); // 1D7C7 MATHEMATICAL SANS-SERIF BOLD ITALIC PHI SYMBOL
        assertEquals("ρ", transform.action("𝟈")); // 1D7C8 MATHEMATICAL SANS-SERIF BOLD ITALIC RHO SYMBOL
        assertEquals("π", transform.action("𝟉")); // 1D7C9 MATHEMATICAL SANS-SERIF BOLD ITALIC PI SYMBOL
        assertEquals("Ϝ", transform.action("𝟊")); // 1D7CA MATHEMATICAL BOLD CAPITAL DIGAMMA
        assertEquals("ϝ", transform.action("𝟋")); // 1D7CB MATHEMATICAL BOLD SMALL DIGAMMA
        assertEquals("0", transform.action("𝟎")); // 1D7CE MATHEMATICAL BOLD DIGIT ZERO
        assertEquals("1", transform.action("𝟏")); // 1D7CF MATHEMATICAL BOLD DIGIT ONE
        assertEquals("2", transform.action("𝟐")); // 1D7D0 MATHEMATICAL BOLD DIGIT TWO
        assertEquals("3", transform.action("𝟑")); // 1D7D1 MATHEMATICAL BOLD DIGIT THREE
        assertEquals("4", transform.action("𝟒")); // 1D7D2 MATHEMATICAL BOLD DIGIT FOUR
        assertEquals("5", transform.action("𝟓")); // 1D7D3 MATHEMATICAL BOLD DIGIT FIVE
        assertEquals("6", transform.action("𝟔")); // 1D7D4 MATHEMATICAL BOLD DIGIT SIX
        assertEquals("7", transform.action("𝟕")); // 1D7D5 MATHEMATICAL BOLD DIGIT SEVEN
        assertEquals("8", transform.action("𝟖")); // 1D7D6 MATHEMATICAL BOLD DIGIT EIGHT
        assertEquals("9", transform.action("𝟗")); // 1D7D7 MATHEMATICAL BOLD DIGIT NINE
        assertEquals("0", transform.action("𝟘")); // 1D7D8 MATHEMATICAL DOUBLE-STRUCK DIGIT ZERO
        assertEquals("1", transform.action("𝟙")); // 1D7D9 MATHEMATICAL DOUBLE-STRUCK DIGIT ONE
        assertEquals("2", transform.action("𝟚")); // 1D7DA MATHEMATICAL DOUBLE-STRUCK DIGIT TWO
        assertEquals("3", transform.action("𝟛")); // 1D7DB MATHEMATICAL DOUBLE-STRUCK DIGIT THREE
        assertEquals("4", transform.action("𝟜")); // 1D7DC MATHEMATICAL DOUBLE-STRUCK DIGIT FOUR
        assertEquals("5", transform.action("𝟝")); // 1D7DD MATHEMATICAL DOUBLE-STRUCK DIGIT FIVE
        assertEquals("6", transform.action("𝟞")); // 1D7DE MATHEMATICAL DOUBLE-STRUCK DIGIT SIX
        assertEquals("7", transform.action("𝟟")); // 1D7DF MATHEMATICAL DOUBLE-STRUCK DIGIT SEVEN
        assertEquals("8", transform.action("𝟠")); // 1D7E0 MATHEMATICAL DOUBLE-STRUCK DIGIT EIGHT
        assertEquals("9", transform.action("𝟡")); // 1D7E1 MATHEMATICAL DOUBLE-STRUCK DIGIT NINE
        assertEquals("0", transform.action("𝟢")); // 1D7E2 MATHEMATICAL SANS-SERIF DIGIT ZERO
        assertEquals("1", transform.action("𝟣")); // 1D7E3 MATHEMATICAL SANS-SERIF DIGIT ONE
        assertEquals("2", transform.action("𝟤")); // 1D7E4 MATHEMATICAL SANS-SERIF DIGIT TWO
        assertEquals("3", transform.action("𝟥")); // 1D7E5 MATHEMATICAL SANS-SERIF DIGIT THREE
        assertEquals("4", transform.action("𝟦")); // 1D7E6 MATHEMATICAL SANS-SERIF DIGIT FOUR
        assertEquals("5", transform.action("𝟧")); // 1D7E7 MATHEMATICAL SANS-SERIF DIGIT FIVE
        assertEquals("6", transform.action("𝟨")); // 1D7E8 MATHEMATICAL SANS-SERIF DIGIT SIX
        assertEquals("7", transform.action("𝟩")); // 1D7E9 MATHEMATICAL SANS-SERIF DIGIT SEVEN
        assertEquals("8", transform.action("𝟪")); // 1D7EA MATHEMATICAL SANS-SERIF DIGIT EIGHT
        assertEquals("9", transform.action("𝟫")); // 1D7EB MATHEMATICAL SANS-SERIF DIGIT NINE
        assertEquals("0", transform.action("𝟬")); // 1D7EC MATHEMATICAL SANS-SERIF BOLD DIGIT ZERO
        assertEquals("1", transform.action("𝟭")); // 1D7ED MATHEMATICAL SANS-SERIF BOLD DIGIT ONE
        assertEquals("2", transform.action("𝟮")); // 1D7EE MATHEMATICAL SANS-SERIF BOLD DIGIT TWO
        assertEquals("3", transform.action("𝟯")); // 1D7EF MATHEMATICAL SANS-SERIF BOLD DIGIT THREE
        assertEquals("4", transform.action("𝟰")); // 1D7F0 MATHEMATICAL SANS-SERIF BOLD DIGIT FOUR
        assertEquals("5", transform.action("𝟱")); // 1D7F1 MATHEMATICAL SANS-SERIF BOLD DIGIT FIVE
        assertEquals("6", transform.action("𝟲")); // 1D7F2 MATHEMATICAL SANS-SERIF BOLD DIGIT SIX
        assertEquals("7", transform.action("𝟳")); // 1D7F3 MATHEMATICAL SANS-SERIF BOLD DIGIT SEVEN
        assertEquals("8", transform.action("𝟴")); // 1D7F4 MATHEMATICAL SANS-SERIF BOLD DIGIT EIGHT
        assertEquals("9", transform.action("𝟵")); // 1D7F5 MATHEMATICAL SANS-SERIF BOLD DIGIT NINE
        assertEquals("0", transform.action("𝟶")); // 1D7F6 MATHEMATICAL MONOSPACE DIGIT ZERO
        assertEquals("1", transform.action("𝟷")); // 1D7F7 MATHEMATICAL MONOSPACE DIGIT ONE
        assertEquals("2", transform.action("𝟸")); // 1D7F8 MATHEMATICAL MONOSPACE DIGIT TWO
        assertEquals("3", transform.action("𝟹")); // 1D7F9 MATHEMATICAL MONOSPACE DIGIT THREE
        assertEquals("4", transform.action("𝟺")); // 1D7FA MATHEMATICAL MONOSPACE DIGIT FOUR
        assertEquals("5", transform.action("𝟻")); // 1D7FB MATHEMATICAL MONOSPACE DIGIT FIVE
        assertEquals("6", transform.action("𝟼")); // 1D7FC MATHEMATICAL MONOSPACE DIGIT SIX
        assertEquals("7", transform.action("𝟽")); // 1D7FD MATHEMATICAL MONOSPACE DIGIT SEVEN
        assertEquals("8", transform.action("𝟾")); // 1D7FE MATHEMATICAL MONOSPACE DIGIT EIGHT
        assertEquals("9", transform.action("𝟿")); // 1D7FF MATHEMATICAL MONOSPACE DIGIT NINE
    }


    @Test
    public void testUnmappedCharacters() {
        // Every assigned code point in this block has an NFKC compatibility mapping
    }
}
