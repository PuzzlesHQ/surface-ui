package dev.puzzleshq.surface.cereal.color;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;

public class Colors {

    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color GUYABANO = new Color(248, 248, 248);
    public static final Color CULTURED = new Color(245, 245, 245);
    public static final Color GAINSBORO = new Color(220, 220, 220);
    public static final Color LIGHT_SILVER = new Color(216, 216, 216);
    public static final Color ALUMINUM = new Color(214, 214, 214);
    public static final Color LIGHT_GRAY = new Color(211, 211, 211);
    public static final Color AMERICAN_SILVER = new Color(207, 207, 207);
    public static final Color CHINESE_SILVER = new Color(204, 204, 204);
    public static final Color ARGENT = new Color(192, 192, 192);
    public static final Color PHILIPPINE_SILVER = new Color(179, 179, 179);
    public static final Color SILVER_CHALICE = new Color(172, 172, 172);
    public static final Color QUICK_SILVER = new Color(166, 166, 166);
    public static final Color SPANISH_GRAY = new Color(152, 152, 152);
    public static final Color PHILIPPINE_GRAY = new Color(140, 140, 140);
    public static final Color TROLLEY_GREY = new Color(128, 128, 128);
    public static final Color SONIC_SILVER = new Color(117, 117, 117);
    public static final Color DIM_GRAY = new Color(105, 105, 105);
    public static final Color GRANITE_GRAY = new Color(103, 103, 103);
    public static final Color DAVYS_GREY = new Color(85, 85, 85);
    public static final Color JET = new Color(52, 52, 52);
    public static final Color DARK_CHARCOAL = new Color(51, 51, 51);
    public static final Color EERIE_BLACK = new Color(27, 27, 27);
    public static final Color CHINESE_BLACK = new Color(20, 20, 20);
    public static final Color VAMPIRE_BLACK = new Color(8, 8, 8);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color SNOW = new Color(255, 250, 250);
    public static final Color MISTY_ROSE = new Color(255, 228, 225);
    public static final Color LIGHT_RED = new Color(255, 204, 203);
    public static final Color LOTION_PINK = new Color(236, 207, 207);
    public static final Color BABY_PINK = new Color(244, 194, 194);
    public static final Color SPANISH_PINK = new Color(247, 191, 190);
    public static final Color MELANCHOLY = new Color(253, 188, 180);
    public static final Color DUST_STORM = new Color(229, 204, 201);
    public static final Color MELON = new Color(254, 186, 173);
    public static final Color ARAZOME_DYE_WASHED_OUT_CRIMSON = new Color(255, 179, 167);
    public static final Color LIGHT_SALMON_PINK = new Color(255, 153, 153);
    public static final Color AMERICAN_PINK = new Color(255, 152, 153);
    public static final Color PEACH_BURST = new Color(243, 153, 152);
    public static final Color VALSPAR_PAINT_COLOR_CORAL_REEF = new Color(246, 164, 148);
    public static final Color PALE_CHESTNUT = new Color(221, 173, 175);
    public static final Color TULIP = new Color(255, 135, 141);
    public static final Color PASTEL_PINK = new Color(222, 165, 164);
    public static final Color IKKONZOME_ONE_KIN = new Color(240, 143, 144);
    public static final Color TOKIHA_IRO_IBIS_WING_COLOR = new Color(245, 143, 132);
    public static final Color SALMON_ROSE = new Color(231, 150, 139);
    public static final Color SILVER_PINK = new Color(196, 174, 173);
    public static final Color CONGO_PINK = new Color(248, 131, 121);
    public static final Color LIGHT_CORAL = new Color(240, 128, 128);
    public static final Color SALMON = new Color(250, 128, 114);
    public static final Color CORAL_REEF = new Color(253, 124, 110);
    public static final Color BEGONIA = new Color(250, 110, 121);
    public static final Color PASTEL_RED = new Color(255, 105, 97);
    public static final Color BITTERSWEET = new Color(254, 111, 94);
    public static final Color AKEBONO_IRO_DAWN_COLOR = new Color(250, 123, 98);
    public static final Color TUSCANY = new Color(192, 153, 153);
    public static final Color NEW_YORK_PINK = new Color(215, 131, 127);
    public static final Color CANDY_PINK = new Color(228, 113, 122);
    public static final Color JINZAMOMI_THRICE_DYED_CRIMSON = new Color(247, 102, 90);
    public static final Color SUNSET_ORANGE = new Color(253, 94, 83);
    public static final Color ROSY_BROWN = new Color(188, 143, 143);
    public static final Color CRAYOLA_ORANGE_RED = new Color(255, 83, 73);
    public static final Color SANGO_IRO_CORAL_COLOR = new Color(248, 103, 79);
    public static final Color TOMATO = new Color(255, 99, 71);
    public static final Color TART_ORANGE = new Color(251, 77, 70);
    public static final Color OLD_ROSE = new Color(192, 128, 129);
    public static final Color SUNBURNT_CYCLOPS = new Color(255, 64, 76);
    public static final Color CORAL_RED = new Color(255, 64, 64);
    public static final Color OGRE_ODOR = new Color(253, 82, 64);
    public static final Color TERRA_COTTA = new Color(226, 114, 91);
    public static final Color ORANGE_SODA = new Color(250, 91, 61);
    public static final Color PORTLAND_ORANGE = new Color(255, 90, 54);
    public static final Color FIRE_OPAL = new Color(233, 92, 75);
    public static final Color FUZZY_WUZZY = new Color(204, 102, 102);
    public static final Color CARMINE_PINK = new Color(235, 76, 66);
    public static final Color SAKURANEZUMI_CHERRY_BLOSSOM_MOUSE = new Color(172, 129, 129);
    public static final Color INDIAN_RED = new Color(205, 92, 92);
    public static final Color BENIHI_BLOOD_RED = new Color(243, 83, 54);
    public static final Color VIVALDI_RED = new Color(239, 57, 57);
    public static final Color ORANGE_SODA_DARK = new Color(235, 89, 61);
    public static final Color JELLY_BEAN = new Color(218, 97, 78);
    public static final Color LYCHEE = new Color(220, 83, 73);
    public static final Color GOOGLE_CHROME_RED = new Color(222, 82, 70);
    public static final Color DEEP_CARMINE_PINK = new Color(239, 48, 56);
    public static final Color CINNABAR = new Color(227, 66, 52);
    public static final Color STRAWBERRY_DAIQUIRI = new Color(217, 70, 62);
    public static final Color COPPER_PENNY = new Color(173, 111, 105);
    public static final Color MIZUGAKI_WATER_PERSIMMON = new Color(181, 108, 96);
    public static final Color BURNISHED_BROWN = new Color(161, 122, 116);
    public static final Color ENGLISH_VERMILLION = new Color(204, 71, 75);
    public static final Color JASPER = new Color(215, 59, 62);
    public static final Color DARK_CORAL = new Color(205, 91, 69);
    public static final Color CEDAR_CHEST = new Color(201, 90, 73);
    public static final Color CG_RED = new Color(224, 60, 49);
    public static final Color RYB_RED = new Color(254, 39, 18);
    public static final Color BITTERSWEET_SHIMMER = new Color(191, 79, 81);
    public static final Color PERMANENT_GERANIUM_LAKE = new Color(225, 44, 44);
    public static final Color CHOSHUN_IRO_LONG_SPRING = new Color(185, 87, 84);
    public static final Color ELECTRIC_BROWN = new Color(181, 98, 87);
    public static final Color TERIGAKI_GLAZED_PERSIMMON = new Color(211, 78, 54);
    public static final Color STRAWBERRY_RED = new Color(200, 63, 73);
    public static final Color LUST = new Color(230, 32, 32);
    public static final Color VIVID_RED = new Color(247, 13, 26);
    public static final Color GIANTS_CLUB = new Color(176, 92, 82);
    public static final Color DEEP_CHESTNUT = new Color(185, 78, 72);
    public static final Color FERRARI_RED = new Color(255, 40, 0);
    public static final Color SCARLET = new Color(255, 36, 0);
    public static final Color CANDY_APPLE_RED = new Color(255, 8, 0);
    public static final Color RED = new Color(255, 0, 0);
    public static final Color SHOJOHI_RED_ORANGE = new Color(220, 48, 35);
    public static final Color MADDER_LAKE = new Color(204, 51, 54);
    public static final Color PERSIAN_RED = new Color(204, 51, 51);
    public static final Color COPPER_ROSE = new Color(153, 102, 102);
    public static final Color MAXIMUM_RED = new Color(217, 33, 33);
    public static final Color ROSE_VALE = new Color(171, 78, 82);
    public static final Color MIDDLE_RED_PURPLE = new Color(165, 83, 83);
    public static final Color DARK_CHESTNUT = new Color(152, 105, 96);
    public static final Color VERMILION = new Color(217, 56, 30);
    public static final Color REDWOOD = new Color(164, 90, 82);
    public static final Color ENGLISH_RED = new Color(171, 75, 82);
    public static final Color AMARANTH_RED = new Color(211, 33, 45);
    public static final Color AKE_BLOOD_SCARLET = new Color(207, 58, 36);
    public static final Color UMENEZUMI_PLUM_BLOSSOM_MOUSE = new Color(151, 100, 90);
    public static final Color FIRE_ENGINE_RED = new Color(206, 32, 41);
    public static final Color ROSE_TAUPE = new Color(144, 93, 93);
    public static final Color GOLDEN_GATE_BRIDGE_INTERNATIONAL_ORANGE = new Color(192, 54, 44);
    public static final Color AKABENI_DYE_PURE_CRIMSON = new Color(195, 39, 43);
    public static final Color KU_CRIMSON = new Color(232, 0, 13);
    public static final Color WILTED_BROWN = new Color(171, 76, 61);
    public static final Color SUOKO_SAPPANWOOD_INCENSE = new Color(162, 79, 70);
    public static final Color ELECTRIC_RED = new Color(230, 0, 0);
    public static final Color GINSHU_GREYED_RED = new Color(188, 45, 41);
    public static final Color NINTENDO_RED = new Color(228, 0, 15);
    public static final Color MEDIUM_CARMINE = new Color(175, 64, 53);
    public static final Color DARK_PASTEL_RED = new Color(194, 59, 34);
    public static final Color DEEP_TAUPE = new Color(126, 94, 96);
    public static final Color SWEET_BROWN = new Color(168, 55, 49);
    public static final Color RED_COLA = new Color(182, 32, 32);
    public static final Color ROSSO_CORSA = new Color(212, 0, 0);
    public static final Color FIREBRICK = new Color(178, 34, 34);
    public static final Color VERIZON_RED = new Color(205, 4, 11);
    public static final Color METALLIC_RED = new Color(166, 44, 43);
    public static final Color VENETIAN_RED = new Color(200, 8, 21);
    public static final Color SMOKY_TOPAZ = new Color(147, 61, 65);
    public static final Color HATOBANEZUMI_DOVE_FEATHER_GREY = new Color(117, 93, 91);
    public static final Color AUBURN = new Color(165, 42, 42);
    public static final Color CARNELIAN = new Color(179, 27, 27);
    public static final Color UPSDELL_RED = new Color(174, 32, 41);
    public static final Color EDOCHA_RED_BROWN = new Color(161, 61, 45);
    public static final Color CHINESE_BROWN = new Color(171, 56, 31);
    public static final Color CHESTNUT = new Color(149, 69, 53);
    public static final Color KAKISHIBU_IRO_PERSIMMON_JUICE_COLOR = new Color(147, 67, 55);
    public static final Color RAMBUTAN_RED = new Color(167, 33, 39);
    public static final Color BRANDY = new Color(135, 65, 63);
    public static final Color ENGINEERING_INTERNATIONAL_ORANGE = new Color(186, 22, 12);
    public static final Color TUSCAN_RED = new Color(124, 72, 72);
    public static final Color AMERICAN_BROWN = new Color(128, 64, 64);
    public static final Color BENIKABA_RED_BIRCH = new Color(157, 43, 34);
    public static final Color UE_RED = new Color(186, 0, 1);
    public static final Color TOMATO_SAUCE = new Color(178, 24, 7);
    public static final Color BENITOBI_RED_KITE = new Color(145, 50, 40);
    public static final Color KIRIUME_RED_BROWN = new Color(139, 53, 45);
    public static final Color ANIMAL_BLOOD = new Color(164, 19, 19);
    public static final Color BENGARA_IRO_DYESTALK_RED = new Color(145, 50, 37);
    public static final Color WENGE = new Color(100, 84, 82);
    public static final Color VIVID_AUBURN = new Color(146, 39, 36);
    public static final Color KOKIAKE_DEEP_SCARLET = new Color(123, 59, 58);
    public static final Color BOLE = new Color(121, 68, 59);
    public static final Color PAINITE = new Color(107, 73, 71);
    public static final Color SPARTAN_CRIMSON = new Color(158, 19, 22);
    public static final Color DEEP_COFFEE = new Color(112, 66, 65);
    public static final Color RUFOUS = new Color(168, 28, 7);
    public static final Color BURNT_UMBER = new Color(138, 51, 36);
    public static final Color LIVER = new Color(103, 76, 71);
    public static final Color ROSE_EBONY = new Color(103, 72, 70);
    public static final Color SHINSHU_RED = new Color(143, 29, 33);
    public static final Color GARNET = new Color(115, 54, 53);
    public static final Color DARK_CANDY_APPLE_RED = new Color(164, 0, 0);
    public static final Color STRAWBERRY_JAM = new Color(139, 23, 26);
    public static final Color OU_CRIMSON_RED = new Color(132, 22, 23);
    public static final Color CRIMSON_RED = new Color(153, 0, 0);
    public static final Color FALU_RED = new Color(128, 24, 24);
    public static final Color HIHADA_IRO_CYPRESS_BARK_COLOR = new Color(117, 46, 35);
    public static final Color BENIHIBATA_CYPRESS_BARK_RED = new Color(111, 48, 40);
    public static final Color SANGRIA = new Color(146, 0, 10);
    public static final Color BLOOD = new Color(138, 3, 3);
    public static final Color UP_MAROON = new Color(123, 17, 19);
    public static final Color PERSIAN_PLUM = new Color(112, 28, 28);
    public static final Color DARK_RED = new Color(139, 0, 0);
    public static final Color AZUKI_IRO_RED_BEAN_COLOR = new Color(103, 36, 34);
    public static final Color FUJISUSUTAKE_WISTERIA_AND_BURNT_BAMBOO = new Color(77, 59, 60);
    public static final Color DEEP_RED = new Color(133, 1, 1);
    public static final Color DOBUNEZUMI_BROWN_RAT_GREY = new Color(75, 60, 57);
    public static final Color DEEP_MAROON = new Color(130, 0, 0);
    public static final Color EBICHA_MAROON = new Color(94, 40, 36);
    public static final Color KUWAZOME_MULBERRY_DYE = new Color(89, 41, 44);
    public static final Color BARN_RED = new Color(124, 10, 2);
    public static final Color KURIKAWACHA_CHESTNUT_LEATHER_BROWN = new Color(96, 40, 30);
    public static final Color CAPUT_MORTUUM = new Color(89, 39, 32);
    public static final Color BROWN_COFFEE = new Color(74, 44, 42);
    public static final Color PHILIPPINE_BROWN = new Color(93, 25, 22);
    public static final Color ORGAN_BLOOD = new Color(99, 15, 15);
    public static final Color OLD_BURGUNDY = new Color(67, 48, 46);
    public static final Color BLACK_COFFEE = new Color(59, 47, 47);
    public static final Color BLOOD_RED = new Color(102, 0, 0);
    public static final Color KUROTOBI_BLACK_KITE = new Color(53, 30, 28);
    public static final Color DARK_SIENNA = new Color(60, 20, 20);
    public static final Color BULGARIAN_ROSE = new Color(72, 6, 7);
    public static final Color DARK_CHOCOLATE = new Color(73, 2, 6);
    public static final Color BLACK_BEAN = new Color(61, 12, 2);
    public static final Color LICORICE = new Color(26, 17, 16);
    public static final Color SAKURA_IRO_CHERRY_BLOSSOM_COLOR = new Color(252, 201, 185);
    public static final Color ZINNWALDITE = new Color(235, 194, 175);
    public static final Color VIVID_TANGERINE = new Color(255, 160, 137);
    public static final Color POPPY_PETAL = new Color(246, 160, 140);
    public static final Color LIGHT_SALMON = new Color(255, 160, 122);
    public static final Color SHISHI_IRO_MEAT_COLOR = new Color(249, 144, 111);
    public static final Color ATOMIC_TANGERINE = new Color(255, 153, 102);
    public static final Color DARK_SALMON = new Color(233, 150, 122);
    public static final Color AKASHIROTSURUBAMI_SAWTOOTH_OAK = new Color(236, 149, 108);
    public static final Color MIDDLE_RED = new Color(229, 142, 115);
    public static final Color ARAISHU_RINSED_OUT_RED = new Color(255, 121, 82);
    public static final Color CORAL = new Color(255, 127, 80);
    public static final Color AKAKO_IRO_RED_INCENSE_COLORED = new Color(240, 127, 94);
    public static final Color TOKIGARACHA_BREWED_MUSTARD_BROWN = new Color(230, 131, 100);
    public static final Color OUTRAGEOUS_ORANGE = new Color(255, 110, 74);
    public static final Color KOKIKUCHINASHI_RICH_GARDENIA = new Color(245, 127, 79);
    public static final Color MANGO_TANGO = new Color(255, 130, 67);
    public static final Color CRAYOLA_COPPER = new Color(218, 138, 103);
    public static final Color ARAIGAKI_WASHED_OUT_PERSIMMON = new Color(236, 130, 84);
    public static final Color MANDARIN = new Color(243, 122, 72);
    public static final Color BURNT_SIENNA = new Color(233, 116, 81);
    public static final Color SMASHED_PUMPKIN = new Color(255, 109, 58);
    public static final Color CRAYOLA_ORANGE = new Color(255, 117, 56);
    public static final Color CHINESE_ORANGE = new Color(243, 112, 66);
    public static final Color OTAN_OCHRE = new Color(255, 78, 32);
    public static final Color ORANGE_RED = new Color(255, 104, 31);
    public static final Color COPPER_RED = new Color(203, 109, 81);
    public static final Color BRAVE_ORANGE = new Color(255, 99, 28);
    public static final Color GIANTS_ORANGE = new Color(254, 90, 29);
    public static final Color SOHI_OVERDYED_RED_BROWN = new Color(227, 92, 56);
    public static final Color DEEP_CARROT_ORANGE = new Color(233, 105, 44);
    public static final Color MEDIUM_VERMILION = new Color(217, 96, 59);
    public static final Color MUDDY_BROWN = new Color(203, 102, 73);
    public static final Color CINEREOUS = new Color(152, 129, 123);
    public static final Color ORIOLES_ORANGE = new Color(251, 79, 20);
    public static final Color MICROSOFT_RED = new Color(240, 78, 31);
    public static final Color HALLOWEEN_ORANGE = new Color(235, 97, 35);
    public static final Color VIVID_VERMILION = new Color(229, 96, 36);
    public static final Color BLAST_OFF_BRONZE = new Color(165, 113, 100);
    public static final Color FLAME = new Color(226, 88, 34);
    public static final Color VIVID_RED_TANGELO = new Color(223, 97, 36);
    public static final Color ELECTRIC_ORANGE = new Color(255, 53, 3);
    public static final Color KURUMIZOME_WALNUT_DYED = new Color(159, 116, 98);
    public static final Color PANTONE_ORANGE = new Color(255, 88, 0);
    public static final Color MYSTIC_RED = new Color(255, 85, 0);
    public static final Color AEROSPACE_INTERNATIONAL_ORANGE = new Color(255, 79, 0);
    public static final Color COLOR_WHEEL_RED_ORANGE = new Color(255, 69, 0);
    public static final Color TAOBAO_ORANGE = new Color(255, 66, 0);
    public static final Color COQUELICOT = new Color(255, 56, 0);
    public static final Color WILLPOWER_ORANGE = new Color(253, 88, 0);
    public static final Color XIAOMI_ORANGE = new Color(253, 73, 0);
    public static final Color BROWN_SUGAR = new Color(175, 110, 77);
    public static final Color TANGELO = new Color(249, 77, 0);
    public static final Color KARACHA_SPICY_RED_BROWN = new Color(179, 92, 68);
    public static final Color CRAYOLA_BROWN = new Color(175, 89, 62);
    public static final Color ITALIAN_ROAST = new Color(144, 102, 82);
    public static final Color KABACHA_BIRCH_BROWN = new Color(177, 74, 48);
    public static final Color KABA_IRO_CATTAIL_COLOR = new Color(182, 73, 37);
    public static final Color SODENKARACHA_FADED_SPICY_RED_BROWN = new Color(155, 83, 63);
    public static final Color SPICY_MIX = new Color(139, 95, 77);
    public static final Color SINOPIA = new Color(203, 65, 11);
    public static final Color COCONUT = new Color(150, 90, 62);
    public static final Color TAISHA_IRO_RED_OCHRE_COLOR = new Color(159, 82, 51);
    public static final Color TONOCHA_POLISHED_BROWN = new Color(152, 85, 56);
    public static final Color CHOJICHA_CLOVE_BROWN = new Color(143, 88, 60);
    public static final Color BRICK_CHINESE_RED = new Color(170, 56, 30);
    public static final Color RUST = new Color(183, 65, 14);
    public static final Color SUNEZUMI_PLAIN_MOUSE = new Color(110, 95, 87);
    public static final Color SUZUMECHA_SPARROW_BROWN = new Color(140, 71, 54);
    public static final Color MAHOGANY = new Color(192, 64, 0);
    public static final Color METALLIC_BROWN = new Color(172, 67, 19);
    public static final Color LEMON_ICED_TEA = new Color(189, 48, 0);
    public static final Color SENCHA_IRO_GREEN_TEA_COLORED = new Color(130, 75, 53);
    public static final Color DEEP_DUMPLING = new Color(155, 53, 27);
    public static final Color KOBE = new Color(136, 45, 23);
    public static final Color CITRINE_BROWN = new Color(147, 55, 9);
    public static final Color BROWN = new Color(153, 51, 0);
    public static final Color SMOKEY_TOPAZ = new Color(131, 42, 13);
    public static final Color HORSES_DARK_LIVER = new Color(84, 61, 55);
    public static final Color ORGAN_LIVER = new Color(108, 46, 31);
    public static final Color ROYAL_BROWN = new Color(82, 59, 53);
    public static final Color KENYAN_COPPER = new Color(124, 28, 5);
    public static final Color KOROZEN_SUMAC_DYED = new Color(89, 43, 31);
    public static final Color MOMOSHIOCHA_BOILED_RED_BEAN_BROWN = new Color(84, 45, 36);
    public static final Color ACAJOU = new Color(76, 47, 39);
    public static final Color AISUMICHA_INDIGO_INK_BROWN = new Color(57, 52, 50);
    public static final Color SEAL_BROWN = new Color(89, 38, 11);
    public static final Color BINROJIZOME_BETEL_NUT_DYE = new Color(53, 41, 37);
    public static final Color FRENCH_PUCE = new Color(78, 22, 9);
    public static final Color KOGECHA_SCORCHED_BROWN = new Color(53, 31, 25);
    public static final Color KENPOZOME_LEGAL_DYE = new Color(46, 33, 27);
    public static final Color ROOT_BEER = new Color(41, 14, 5);
    public static final Color FLORAL_WHITE = new Color(255, 250, 240);
    public static final Color SEASHELL = new Color(255, 245, 238);
    public static final Color PENGUIN_WHITE = new Color(245, 243, 239);
    public static final Color OLD_LACE = new Color(253, 245, 230);
    public static final Color LINEN = new Color(250, 240, 230);
    public static final Color ISABELLINE = new Color(244, 240, 236);
    public static final Color PAPAYA_WHIP = new Color(255, 239, 213);
    public static final Color ANTIQUE_WHITE = new Color(250, 235, 215);
    public static final Color FLESH = new Color(255, 233, 209);
    public static final Color BLANCHED_ALMOND = new Color(255, 235, 205);
    public static final Color LUMBER = new Color(255, 228, 205);
    public static final Color UNBLEACHED_SILK = new Color(255, 221, 202);
    public static final Color PLATINUM = new Color(229, 228, 226);
    public static final Color CHAMPAGNE = new Color(247, 231, 206);
    public static final Color BISQUE = new Color(255, 228, 196);
    public static final Color CHAMPAGNE_PINK = new Color(241, 221, 207);
    public static final Color VERY_PALE_ORANGE = new Color(255, 223, 191);
    public static final Color ALMOND = new Color(239, 222, 205);
    public static final Color WHITE_COFFEE = new Color(230, 224, 212);
    public static final Color PEACH_PUFF = new Color(255, 218, 185);
    public static final Color PEACH = new Color(255, 229, 180);
    public static final Color SANDY_TAN = new Color(253, 217, 181);
    public static final Color LIGHT_ORANGE = new Color(254, 216, 177);
    public static final Color FELDSPAR = new Color(253, 213, 177);
    public static final Color TIMBERWOLF = new Color(219, 215, 210);
    public static final Color NAVAJO_WHITE = new Color(255, 222, 173);
    public static final Color APRICOT = new Color(251, 206, 177);
    public static final Color BONE = new Color(227, 218, 201);
    public static final Color WHEAT = new Color(245, 222, 179);
    public static final Color PEACH_YELLOW = new Color(250, 223, 173);
    public static final Color DEEP_PEACH = new Color(255, 203, 164);
    public static final Color DEEP_CHAMPAGNE = new Color(250, 214, 165);
    public static final Color DESERT_SAND = new Color(237, 201, 175);
    public static final Color CARAMEL = new Color(255, 213, 154);
    public static final Color PEACH_ORANGE = new Color(255, 204, 153);
    public static final Color DURIAN_WHITE = new Color(230, 208, 171);
    public static final Color MANILA = new Color(231, 201, 169);
    public static final Color MACARONI_AND_CHEESE = new Color(255, 189, 136);
    public static final Color DOUBAN_LIGHT_YELLOW = new Color(247, 197, 142);
    public static final Color PALE_SILVER = new Color(201, 192, 187);
    public static final Color TORINOKO_IRO_EGGSHELL_PAPER_COLORED = new Color(226, 190, 159);
    public static final Color TOPAZ = new Color(255, 200, 124);
    public static final Color DARK_VANILLA = new Color(209, 190, 168);
    public static final Color VERY_LIGHT_TANGELO = new Color(255, 176, 119);
    public static final Color ASAGI_LIGHT_YELLOW = new Color(247, 187, 125);
    public static final Color USUGAKI_PALE_PERSIMMON = new Color(252, 164, 116);
    public static final Color MELLOW_APRICOT = new Color(248, 184, 120);
    public static final Color CRAYOLA_GOLD = new Color(230, 190, 138);
    public static final Color SHAREGAKI_STYLISH_PERSIMMON = new Color(255, 162, 107);
    public static final Color TUMBLEWEED = new Color(222, 170, 136);
    public static final Color BURLYWOOD = new Color(222, 184, 135);
    public static final Color USUKO_PALE_INCENSE = new Color(255, 165, 101);
    public static final Color MIDDLE_YELLOW_RED = new Color(236, 177, 118);
    public static final Color TAN = new Color(210, 180, 140);
    public static final Color RAJAH = new Color(251, 171, 96);
    public static final Color KUCHINASHI_CAPE_JASMINE_OR_GARDENIA = new Color(255, 185, 90);
    public static final Color FAWN = new Color(229, 170, 112);
    public static final Color SANDY_BROWN = new Color(244, 164, 96);
    public static final Color UMEZOME_PLUM_DYED = new Color(250, 146, 88);
    public static final Color MOCHA = new Color(190, 164, 147);
    public static final Color MUSHIKURI_IRO_STEAMED_CHESTNUT_COLOR = new Color(211, 177, 125);
    public static final Color HANABA_IRO_OR_KAYOU_IRO_FLORAL_LEAF_COLORED = new Color(255, 185, 78);
    public static final Color CHICKADEE = new Color(255, 195, 77);
    public static final Color SHIRONEZUMI_WHITE_MOUSE = new Color(185, 161, 147);
    public static final Color LIGHT_FRENCH_BEIGE = new Color(200, 173, 127);
    public static final Color PASTEL_ORANGE = new Color(255, 179, 71);
    public static final Color CRAYOLA_TAN = new Color(217, 154, 108);
    public static final Color NEON_CARROT = new Color(255, 163, 67);
    public static final Color BIG_FOOT_FEET = new Color(232, 142, 90);
    public static final Color ANTIQUE_BRASS = new Color(205, 149, 117);
    public static final Color YELLOW_ORANGE = new Color(255, 174, 66);
    public static final Color EARTH_YELLOW = new Color(225, 169, 95);
    public static final Color TOMOROKOSHI_IRO_CORN_COLORED = new Color(250, 169, 69);
    public static final Color ROYAL_ORANGE = new Color(249, 146, 69);
    public static final Color SHIROTSURUBAMI_WHITE_OAK = new Color(206, 159, 111);
    public static final Color MAXIMUM_YELLOW_RED = new Color(242, 186, 73);
    public static final Color SUNRAY = new Color(227, 171, 87);
    public static final Color INDIAN_YELLOW = new Color(227, 168, 87);
    public static final Color PALE_TAUPE = new Color(188, 152, 126);
    public static final Color KANZO_IRO_DAYLILY_COLORED = new Color(255, 137, 54);
    public static final Color BROWN_YELLOW = new Color(204, 153, 102);
    public static final Color DEEP_SAFFRON = new Color(255, 153, 51);
    public static final Color BENIUKON_RED_BRONZE = new Color(251, 129, 54);
    public static final Color PERSIAN_ORANGE = new Color(217, 144, 88);
    public static final Color TAMAGO_IRO_EGG_COLORED = new Color(255, 166, 49);
    public static final Color RAW_SIENNA = new Color(214, 138, 89);
    public static final Color GRULLO = new Color(169, 154, 134);
    public static final Color SHIRACHA_WHITE_TEA_COLORED = new Color(196, 142, 105);
    public static final Color JASPER_ORANGE = new Color(222, 143, 78);
    public static final Color CAMEL = new Color(193, 154, 107);
    public static final Color RIKYUSHIRACHA_FADED_SEN_NO_RIKYUS_TEA = new Color(176, 146, 122);
    public static final Color KIKUCHIBA_GOLDEN_FALLEN_LEAVES = new Color(226, 156, 69);
    public static final Color STONE_TERRACE = new Color(160, 148, 132);
    public static final Color UKON_IRO_TURMERIC_COLORED = new Color(230, 155, 58);
    public static final Color LIGHT_TAUPE = new Color(179, 139, 109);
    public static final Color TOO_GAMBOGE = new Color(255, 182, 30);
    public static final Color CRAYOLA_BRIGHT_YELLOW = new Color(255, 170, 29);
    public static final Color TIGERS_EYE = new Color(224, 141, 60);
    public static final Color PRINCETON_ORANGE = new Color(245, 128, 37);
    public static final Color CADMIUM_ORANGE = new Color(237, 135, 45);
    public static final Color PUMPKIN = new Color(255, 117, 24);
    public static final Color VIVID_TANGELO = new Color(240, 116, 39);
    public static final Color DEER = new Color(186, 135, 89);
    public static final Color GINNEZUMI_SILVER_GREY = new Color(151, 134, 124);
    public static final Color DARK_TANGERINE = new Color(255, 168, 18);
    public static final Color ODO_IRO_OCHRE = new Color(190, 127, 81);
    public static final Color BEAVER = new Color(159, 129, 112);
    public static final Color BEER = new Color(242, 142, 28);
    public static final Color CARROT_ORANGE = new Color(237, 145, 33);
    public static final Color KUMQUAT = new Color(251, 153, 18);
    public static final Color PERU = new Color(205, 133, 63);
    public static final Color MAPLE_SYRUP = new Color(187, 147, 81);
    public static final Color MARIGOLD = new Color(234, 162, 33);
    public static final Color MIDDLE_GREY = new Color(139, 134, 128);
    public static final Color KUCHIBA_IRO_DECAYING_LEAVES_COLOR = new Color(213, 120, 53);
    public static final Color METALLIC_BRONZE = new Color(176, 141, 87);
    public static final Color COLOR_WHEEL_YELLOW_ORANGE = new Color(255, 149, 5);
    public static final Color CAFE_AU_LAIT = new Color(166, 123, 91);
    public static final Color CHROME_YELLOW = new Color(255, 167, 0);
    public static final Color CHEESE = new Color(255, 166, 0);
    public static final Color YAMABUKI_IRO_GOLDEN_YELLOW = new Color(255, 164, 0);
    public static final Color VIVID_ORANGE_PEEL = new Color(255, 160, 0);
    public static final Color ORANGE_PEEL = new Color(255, 159, 0);
    public static final Color WEEBLY_ORANGE = new Color(255, 154, 0);
    public static final Color VIVID_GAMBOGE = new Color(255, 153, 0);
    public static final Color DARK_ORANGE = new Color(255, 140, 0);
    public static final Color AMERICAN_ORANGE = new Color(255, 139, 0);
    public static final Color COLOR_WHEEL_ORANGE = new Color(255, 127, 0);
    public static final Color SAE_ECE_AMBER = new Color(255, 126, 0);
    public static final Color HEAT_WAVE = new Color(255, 122, 0);
    public static final Color SAFETY_ORANGE = new Color(255, 120, 0);
    public static final Color PHILIPPINE_ORANGE = new Color(255, 115, 0);
    public static final Color BLAZE_ORANGE_SAFETY_ORANGE = new Color(255, 103, 0);
    public static final Color ORANGE = new Color(255, 102, 0);
    public static final Color VIVID_ORANGE = new Color(255, 95, 0);
    public static final Color MAXIMUM_ORANGE = new Color(255, 91, 0);
    public static final Color CHINESE_BRONZE = new Color(205, 128, 50);
    public static final Color BRONZE = new Color(205, 127, 50);
    public static final Color HAJIZOME_SUMAC_DYED = new Color(224, 138, 30);
    public static final Color RYB_ORANGE = new Color(251, 153, 2);
    public static final Color KITSURUBAMI_GOLDEN_OAK = new Color(187, 129, 65);
    public static final Color CHAMOISEE = new Color(160, 120, 90);
    public static final Color UNIVERSITY_OF_TENNESSEE_ORANGE = new Color(247, 127, 0);
    public static final Color GAMBOGE = new Color(228, 155, 15);
    public static final Color KUWAZOME_MULBERRY_DYED = new Color(197, 127, 46);
    public static final Color TANGERINE = new Color(242, 133, 0);
    public static final Color CINNAMON = new Color(210, 105, 30);
    public static final Color OCHRE = new Color(204, 119, 34);
    public static final Color KOHAKU_IRO_AMBER = new Color(202, 105, 36);
    public static final Color DIRT = new Color(155, 118, 83);
    public static final Color LIVER_CHESTNUT = new Color(152, 116, 86);
    public static final Color KINCHA_GOLDEN_BROWN = new Color(198, 107, 39);
    public static final Color PERSIMMON = new Color(236, 88, 0);
    public static final Color PALE_BROWN = new Color(152, 118, 84);
    public static final Color COPPER = new Color(184, 115, 51);
    public static final Color YAMABUKICHA_GOLD_BROWN = new Color(203, 126, 31);
    public static final Color METALLIC_ORANGE = new Color(218, 104, 15);
    public static final Color DURIAN = new Color(176, 121, 57);
    public static final Color SPANISH_ORANGE = new Color(232, 97, 0);
    public static final Color SHADOW = new Color(138, 121, 93);
    public static final Color FULVOUS = new Color(228, 132, 0);
    public static final Color KIGARACHA_CHINESE_YELLOW_TEA_COLORED = new Color(183, 112, 45);
    public static final Color RUDDY_BROWN = new Color(187, 101, 40);
    public static final Color DARK_GOLD = new Color(170, 108, 57);
    public static final Color DOGS_LIVER = new Color(184, 109, 41);
    public static final Color TREE_BROWN_LOQUAT = new Color(171, 97, 52);
    public static final Color DARK_SILVER = new Color(113, 112, 110);
    public static final Color UNIVERSITY_OF_CALIFORNIA_GOLD = new Color(183, 135, 39);
    public static final Color AKU_IRO_LYE_COLORED = new Color(127, 107, 93);
    public static final Color CHOJIZOME_CLOVE_DYED = new Color(169, 98, 50);
    public static final Color HARVEST_GOLD = new Color(218, 145, 0);
    public static final Color RIKYUCHA_SEN_NO_RIKYUS_TEA = new Color(130, 107, 88);
    public static final Color DARK_BROWN_TANGELO = new Color(136, 101, 78);
    public static final Color PASTEL_BROWN = new Color(131, 105, 83);
    public static final Color ALLOY_ORANGE = new Color(196, 98, 16);
    public static final Color METALLIC_SUNBURST = new Color(156, 124, 56);
    public static final Color DIRTY_BROWN = new Color(181, 101, 30);
    public static final Color LIGHT_BROWN = new Color(181, 101, 29);
    public static final Color FRENCH_BISTRE = new Color(133, 109, 77);
    public static final Color MUSTARD_BROWN = new Color(205, 122, 0);
    public static final Color TAWNY_TENNE = new Color(205, 87, 0);
    public static final Color BURNT_ORANGE = new Color(204, 85, 0);
    public static final Color ASDA_ORANGE = new Color(200, 101, 0);
    public static final Color RAW_UMBER = new Color(130, 102, 68);
    public static final Color FUSHIZOME_BRUSHWOOD_DYED = new Color(140, 89, 57);
    public static final Color KIMIRUCHA_YELLOW_SEA_PINE_BROWN = new Color(137, 108, 57);
    public static final Color KITSUNE_IRO_FOX_COLOR = new Color(152, 86, 41);
    public static final Color NAMAKABE_IRO_THE_COLOR_OF_AN_UNDRIED_WALL = new Color(120, 94, 73);
    public static final Color MILK_CHOCOLATE = new Color(132, 86, 60);
    public static final Color COYOTE_BROWN = new Color(129, 97, 60);
    public static final Color HIGOSUSUTAKE_JAPANESE_IRIS_AND_SOOTY_BAMBOO = new Color(127, 93, 59);
    public static final Color ITALIAN_LEATHER = new Color(99, 90, 82);
    public static final Color PHILIPPINE_GOLD = new Color(177, 115, 4);
    public static final Color QUINCY = new Color(106, 84, 69);
    public static final Color GOLDEN_BROWN = new Color(153, 101, 21);
    public static final Color MUD = new Color(112, 84, 62);
    public static final Color UMBER = new Color(99, 81, 71);
    public static final Color AINEZUMI_MOUSY_INDIGO = new Color(92, 84, 78);
    public static final Color KINSUSUTAKE_GOLDEN_GREY_BAMBOO = new Color(125, 78, 45);
    public static final Color ROKOCHA_CONTEMPLATION_IN_A_TEA_GARDEN = new Color(102, 83, 67);
    public static final Color WINDSOR_TAN = new Color(167, 85, 2);
    public static final Color COFFEE = new Color(111, 78, 55);
    public static final Color IWAICHA_IWAI_BROWN = new Color(94, 85, 69);
    public static final Color SADDLE_BROWN = new Color(139, 69, 19);
    public static final Color RUSSET = new Color(128, 70, 27);
    public static final Color BROWN_GAMBOGE_ORANGE = new Color(153, 102, 0);
    public static final Color KYARA_IRO_ALOEWOOD_COLOR = new Color(106, 67, 45);
    public static final Color TRADITIONAL_BROWN = new Color(150, 75, 0);
    public static final Color ICED_TEA = new Color(146, 60, 1);
    public static final Color DARK_BRONZE = new Color(136, 84, 11);
    public static final Color AONIBI_DULL_BLUE = new Color(79, 73, 68);
    public static final Color BROWN_NOSE = new Color(107, 68, 35);
    public static final Color VAN_DYKE_BROWN = new Color(102, 66, 40);
    public static final Color DARK_BROWN = new Color(101, 67, 33);
    public static final Color SEPIA = new Color(112, 66, 20);
    public static final Color UGUISUCHA_NIGHTINGALE_BROWN = new Color(92, 72, 39);
    public static final Color SUSUTAKE_IRO_WEATHERED_BAMBOO = new Color(89, 58, 39);
    public static final Color MIRUCHA_SIMMERED_SEAWEED = new Color(76, 61, 48);
    public static final Color TRADITIONAL_CHOCOLATE = new Color(123, 63, 0);
    public static final Color UPS_BROWN_PULLMAN_BROWN = new Color(100, 65, 23);
    public static final Color DARK_LAVA = new Color(72, 60, 50);
    public static final Color EARTHTONE = new Color(93, 58, 26);
    public static final Color PHILIPPINE_BRONZE = new Color(110, 58, 7);
    public static final Color CAFE_NOIR = new Color(75, 54, 33);
    public static final Color VIOLIN_BROWN = new Color(103, 68, 3);
    public static final Color JACKO_BEAN = new Color(65, 54, 40);
    public static final Color SENSAICHA_THOUSAND_YEAR_OLD_BROWN = new Color(59, 52, 41);
    public static final Color PINEAPPLE = new Color(86, 60, 13);
    public static final Color COLA = new Color(60, 48, 36);
    public static final Color BISTRE = new Color(61, 43, 31);
    public static final Color SUMI_IRO_INK_COLOR = new Color(39, 34, 31);
    public static final Color KUROTSURUBAMI_BLACK_CHESTNUT_OAK = new Color(37, 35, 33);
    public static final Color AMERICAN_BRONZE = new Color(57, 24, 2);
    public static final Color ZINNWALDITE_BROWN = new Color(44, 22, 8);
    public static final Color KOKUSHOKU_BLACK = new Color(23, 20, 18);
    public static final Color SMOKY_BLACK = new Color(16, 12, 8);
    public static final Color LOTION = new Color(254, 253, 250);
    public static final Color COSMIC_LATTE = new Color(255, 248, 231);
    public static final Color CORNSILK = new Color(255, 248, 220);
    public static final Color ALABASTER = new Color(242, 240, 230);
    public static final Color EGGSHELL = new Color(240, 234, 214);
    public static final Color WHITE_CHOCOLATE = new Color(237, 230, 214);
    public static final Color BLOND = new Color(250, 240, 190);
    public static final Color LEMON_MERINGUE = new Color(246, 234, 190);
    public static final Color PEARL = new Color(234, 224, 200);
    public static final Color BANANA_MANIA = new Color(250, 231, 181);
    public static final Color DUTCH_WHITE = new Color(239, 223, 187);
    public static final Color COOKIES_AND_CREAM = new Color(238, 224, 177);
    public static final Color MEDIUM_CHAMPAGNE = new Color(243, 229, 171);
    public static final Color CRAYOLA_YELLOW = new Color(252, 232, 131);
    public static final Color KAMENOZOKI_INSIDE_OF_A_BOTTLE = new Color(198, 194, 182);
    public static final Color JASMINE = new Color(248, 222, 126);
    public static final Color BUFF = new Color(240, 220, 130);
    public static final Color FLAX = new Color(238, 220, 130);
    public static final Color SHANDY = new Color(255, 230, 112);
    public static final Color CRAYOLA_DANDELION = new Color(253, 219, 109);
    public static final Color CRAYOLA_ORANGE_YELLOW = new Color(248, 213, 104);
    public static final Color NAPLES_YELLOW = new Color(250, 218, 94);
    public static final Color MUSTARD = new Color(255, 219, 88);
    public static final Color ARYLIDE_YELLOW = new Color(233, 214, 107);
    public static final Color GARGOYLE_GAS = new Color(255, 223, 70);
    public static final Color GOOGLE_CHROME_YELLOW = new Color(255, 206, 68);
    public static final Color ECRU = new Color(194, 178, 128);
    public static final Color CRAYOLA_MAIZE = new Color(242, 198, 73);
    public static final Color LANZONES = new Color(224, 188, 91);
    public static final Color IRON = new Color(161, 157, 148);
    public static final Color SUNGLOW = new Color(255, 204, 51);
    public static final Color KIHADA_AMUR_CORK_TREE = new Color(243, 193, 58);
    public static final Color AOSHIROTSURUBAMI_PALE_OAK = new Color(187, 164, 109);
    public static final Color SAFFRON = new Color(244, 196, 48);
    public static final Color RIPE_MANGO = new Color(255, 195, 36);
    public static final Color SUNSET_YELLOW = new Color(255, 201, 34);
    public static final Color MEAT_BROWN = new Color(229, 183, 59);
    public static final Color KARIYASU_JAPANESE_TRIANDRA_GRASS = new Color(226, 177, 60);
    public static final Color VEGAS_GOLD = new Color(197, 179, 88);
    public static final Color ORANGE_YELLOW = new Color(245, 189, 31);
    public static final Color NANOHANACHA_RAPE_BLOSSOM_BROWN = new Color(227, 177, 48);
    public static final Color DEEP_LEMON = new Color(245, 199, 26);
    public static final Color MIKADO_YELLOW = new Color(255, 196, 12);
    public static final Color METALLIC_GOLD = new Color(212, 175, 55);
    public static final Color METALLIC_YELLOW = new Color(253, 204, 13);
    public static final Color JONQUIL = new Color(244, 202, 22);
    public static final Color OLD_GOLD = new Color(207, 181, 59);
    public static final Color AMERICAN_GOLD = new Color(211, 175, 55);
    public static final Color DURIAN_YELLOW = new Color(225, 189, 39);
    public static final Color TITANIUM = new Color(135, 134, 129);
    public static final Color SPANISH_YELLOW = new Color(246, 181, 17);
    public static final Color UROBILIN = new Color(225, 173, 33);
    public static final Color SATIN_SHEEN_GOLD = new Color(203, 161, 53);
    public static final Color SCHOOL_BUS_YELLOW = new Color(255, 216, 0);
    public static final Color GOLDEN = new Color(255, 215, 0);
    public static final Color CYBER_YELLOW = new Color(255, 211, 0);
    public static final Color TANGERINE_YELLOW = new Color(255, 204, 0);
    public static final Color AMBER = new Color(255, 191, 0);
    public static final Color SELECTIVE_YELLOW = new Color(255, 186, 0);
    public static final Color UCLA_GOLD = new Color(255, 179, 0);
    public static final Color CHINESE_YELLOW = new Color(255, 178, 0);
    public static final Color MANGO = new Color(253, 190, 2);
    public static final Color PHILIPPINE_YELLOW = new Color(254, 203, 0);
    public static final Color MICROSOFT_YELLOW = new Color(253, 185, 0);
    public static final Color GOLDEN_POPPY = new Color(252, 194, 0);
    public static final Color GOLDENROD = new Color(218, 165, 32);
    public static final Color AMERICAN_YELLOW = new Color(242, 180, 0);
    public static final Color OMINAESHI_PATRINIA_FLOWERS = new Color(217, 182, 17);
    public static final Color YANAGINEZUMI_WILLOW_GREY = new Color(129, 123, 105);
    public static final Color LEMON_CURRY = new Color(204, 160, 29);
    public static final Color YANAGICHA_WILLOW_TEA = new Color(156, 138, 77);
    public static final Color MUSTARD_YELLOW = new Color(225, 173, 1);
    public static final Color DARK_TAN = new Color(145, 129, 81);
    public static final Color AOKUCHIBA_PALE_FALLEN_LEAVES = new Color(170, 135, 54);
    public static final Color BAIKOCHA_BAIKO_BROWN = new Color(133, 124, 85);
    public static final Color GOLD_FOIL = new Color(189, 155, 22);
    public static final Color GOLD_FUSION = new Color(133, 117, 78);
    public static final Color HIWACHA_FINCH_BROWN = new Color(149, 123, 56);
    public static final Color CHINESE_GOLD = new Color(204, 153, 0);
    public static final Color KOKE_IRO_MOSS_COLOR = new Color(139, 125, 58);
    public static final Color DARK_GOLDENROD = new Color(184, 134, 11);
    public static final Color RIKYUNEZUMI_GREYISH_DARK_GREEN = new Color(101, 98, 85);
    public static final Color NATANEYU_IRO_RAPESEED_OIL_COLORED = new Color(161, 121, 23);
    public static final Color LIGHT_GOLD = new Color(178, 151, 0);
    public static final Color BISTRE_BROWN = new Color(150, 113, 23);
    public static final Color GOLD = new Color(165, 124, 0);
    public static final Color PORCUPINE = new Color(147, 105, 0);
    public static final Color FIELD_DRAB = new Color(108, 84, 30);
    public static final Color RIKANCHA_RIKAN_BROWN = new Color(83, 74, 50);
    public static final Color MIRU_IRO_CODIUM_FRAGILE_SEAWEED_COLOR = new Color(82, 75, 42);
    public static final Color AIKOBICHA_FLIRTATIOUS_INDIGO_TEA = new Color(71, 63, 45);
    public static final Color PULLMAN_GREEN = new Color(59, 51, 28);
    public static final Color COIN_DARK_BRONZE = new Color(81, 65, 0);
    public static final Color BLACK_CHOCOLATE = new Color(27, 24, 17);
    public static final Color BABY_POWDER = new Color(254, 254, 250);
    public static final Color IVORY = new Color(255, 255, 240);
    public static final Color LIGHT_YELLOW = new Color(255, 255, 224);
    public static final Color BEIGE = new Color(245, 245, 220);
    public static final Color CREAM = new Color(255, 253, 208);
    public static final Color LEMON_CHIFFON = new Color(255, 250, 205);
    public static final Color LIGHT_GOLDENROD_YELLOW = new Color(250, 250, 210);
    public static final Color CONDITIONER = new Color(255, 255, 204);
    public static final Color VERY_PALE_YELLOW = new Color(255, 255, 191);
    public static final Color DIRTY_WHITE = new Color(232, 228, 201);
    public static final Color PALE_SPRING_BUD = new Color(236, 235, 189);
    public static final Color CRAYOLA_LEMON_YELLOW = new Color(255, 255, 159);
    public static final Color CANARY = new Color(255, 255, 153);
    public static final Color PALE_GOLDENROD = new Color(238, 232, 170);
    public static final Color PASTEL_YELLOW = new Color(253, 253, 150);
    public static final Color PASTEL_GRAY = new Color(207, 207, 196);
    public static final Color FLAVESCENT = new Color(247, 233, 142);
    public static final Color CRAYOLA_GREEN_YELLOW = new Color(240, 232, 145);
    public static final Color LIGHT_KHAKI = new Color(240, 230, 140);
    public static final Color SUNNY = new Color(242, 242, 122);
    public static final Color LASER_LEMON = new Color(255, 255, 102);
    public static final Color ICTERINE = new Color(252, 247, 94);
    public static final Color DODIE_YELLOW = new Color(254, 246, 91);
    public static final Color CORN = new Color(251, 236, 93);
    public static final Color STRAW = new Color(228, 217, 111);
    public static final Color LEMON_YELLOW = new Color(255, 244, 79);
    public static final Color URAHAYANAGI_UNDERSIDE_OF_WILLOW_LEAVES = new Color(188, 181, 140);
    public static final Color SAGE = new Color(188, 184, 138);
    public static final Color MINION_YELLOW = new Color(245, 224, 80);
    public static final Color BANANA_YELLOW = new Color(255, 225, 53);
    public static final Color ELECTRIC_YELLOW = new Color(255, 255, 51);
    public static final Color MISTY_MOSS = new Color(187, 180, 119);
    public static final Color RYB_YELLOW = new Color(254, 254, 51);
    public static final Color MAXIMUM_YELLOW = new Color(250, 250, 55);
    public static final Color DAFFODIL = new Color(255, 255, 49);
    public static final Color POMELO_OLIVE = new Color(191, 189, 112);
    public static final Color SANDSTORM = new Color(236, 213, 64);
    public static final Color DARK_KHAKI = new Color(189, 183, 107);
    public static final Color MARGARINE = new Color(242, 217, 48);
    public static final Color DANDELION = new Color(240, 225, 48);
    public static final Color OLIVE_GREEN = new Color(181, 179, 92);
    public static final Color BATTLESHIP_GREY = new Color(132, 132, 130);
    public static final Color SPRINT_YELLOW = new Color(255, 221, 5);
    public static final Color VIVID_YELLOW = new Color(255, 227, 2);
    public static final Color SPONGE = new Color(253, 254, 3);
    public static final Color YELLOW = new Color(255, 255, 0);
    public static final Color LEMON = new Color(255, 247, 0);
    public static final Color CADMIUM_YELLOW = new Color(255, 246, 0);
    public static final Color YELLOW_ROSE = new Color(255, 240, 0);
    public static final Color CANARY_YELLOW = new Color(255, 239, 0);
    public static final Color MIDDLE_YELLOW = new Color(255, 235, 0);
    public static final Color GOLDEN_YELLOW = new Color(255, 223, 0);
    public static final Color SIZZLING_SUNRISE = new Color(255, 219, 0);
    public static final Color LEMON_GLACIER = new Color(253, 255, 0);
    public static final Color PANTONE_YELLOW = new Color(254, 223, 0);
    public static final Color AUREOLIN = new Color(253, 238, 0);
    public static final Color BRASS = new Color(181, 166, 66);
    public static final Color SAFETY_YELLOW = new Color(238, 210, 2);
    public static final Color MUNSELL_YELLOW = new Color(239, 204, 0);
    public static final Color TITANIUM_YELLOW = new Color(238, 230, 0);
    public static final Color CITRINE = new Color(228, 208, 10);
    public static final Color PERIDOT = new Color(230, 226, 0);
    public static final Color HIWA_IRO_GREENFINCH_COLOR = new Color(189, 169, 40);
    public static final Color OLD_MOSS_GREEN = new Color(134, 126, 54);
    public static final Color SPANISH_BISTRE = new Color(128, 117, 50);
    public static final Color DARK_YELLOW = new Color(155, 135, 12);
    public static final Color MUSTARD_GREEN = new Color(110, 110, 48);
    public static final Color YANAGISUSUTAKE_SOOTY_WILLOW_BAMBOO = new Color(77, 75, 58);
    public static final Color ANTIQUE_BRONZE = new Color(102, 93, 30);
    public static final Color HEART_GOLD = new Color(128, 128, 0);
    public static final Color BRONZE_YELLOW = new Color(115, 112, 0);
    public static final Color MILK = new Color(253, 255, 245);
    public static final Color POMELO_WHITE = new Color(249, 255, 227);
    public static final Color CALAMANSI = new Color(252, 255, 164);
    public static final Color GIN = new Color(216, 228, 188);
    public static final Color MINDARO = new Color(227, 249, 136);
    public static final Color KEY_LIME = new Color(232, 244, 140);
    public static final Color LIME_PULP = new Color(209, 225, 137);
    public static final Color CRAYOLA_YELLOW_GREEN = new Color(197, 227, 132);
    public static final Color MEDIUM_SPRING_BUD = new Color(201, 220, 135);
    public static final Color BORED_ACCENT_GREEN = new Color(221, 226, 106);
    public static final Color CHINESE_GREEN = new Color(208, 219, 97);
    public static final Color MAXIMUM_GREEN_YELLOW = new Color(217, 230, 80);
    public static final Color JUNE_BUD = new Color(189, 218, 87);
    public static final Color MIDDLE_GREEN_YELLOW = new Color(172, 191, 96);
    public static final Color WATERMELON_YELLOW = new Color(238, 255, 27);
    public static final Color PEAR = new Color(209, 226, 49);
    public static final Color ARCTIC_LIME = new Color(208, 255, 20);
    public static final Color ARTICHOKE = new Color(143, 151, 121);
    public static final Color MARGARITA = new Color(176, 194, 74);
    public static final Color LEMON_LIME = new Color(227, 255, 0);
    public static final Color TRADITIONAL_CHARTREUSE = new Color(223, 255, 0);
    public static final Color VOLT = new Color(206, 255, 0);
    public static final Color ELECTRIC_LIME = new Color(204, 255, 0);
    public static final Color BITTER_LIME = new Color(191, 255, 0);
    public static final Color YELLOW_GREEN = new Color(154, 205, 50);
    public static final Color SABISEIJI_RUSTY_CELADON = new Color(137, 138, 116);
    public static final Color SPRING_BUD = new Color(167, 252, 0);
    public static final Color YANAGIZOME_WILLOW_DYE = new Color(140, 158, 94);
    public static final Color MOSS_GREEN = new Color(138, 154, 91);
    public static final Color BITTER_LEMON = new Color(202, 224, 13);
    public static final Color POMELO = new Color(150, 165, 60);
    public static final Color VIVID_LIME_GREEN = new Color(166, 214, 8);
    public static final Color ACID_GREEN = new Color(176, 191, 26);
    public static final Color DARK_LEMON_LIME = new Color(139, 190, 27);
    public static final Color SHEEN_GREEN = new Color(143, 212, 0);
    public static final Color LIMERICK = new Color(157, 194, 9);
    public static final Color CITRON = new Color(159, 169, 31);
    public static final Color HIWAMOEGI_SISKIN_SPROUT_YELLOW = new Color(122, 148, 46);
    public static final Color MICROSOFT_GREEN = new Color(125, 183, 0);
    public static final Color APPLE_GREEN = new Color(141, 182, 0);
    public static final Color OITAKE_IRO_OLD_BAMBOO_COLOR = new Color(94, 100, 79);
    public static final Color AONI_BLUE_BLACK_CRAYFISH = new Color(82, 89, 59);
    public static final Color SOLDIER_GREEN = new Color(84, 90, 44);
    public static final Color AVOCADO = new Color(86, 130, 3);
    public static final Color DARK_MOSS_GREEN = new Color(74, 93, 35);
    public static final Color MATSUBA_IRO_PINE_NEEDLE_COLOR = new Color(69, 77, 50);
    public static final Color ONANDOCHA_STOREROOM_BROWN = new Color(61, 64, 53);
    public static final Color ARMY_GREEN = new Color(75, 83, 32);
    public static final Color BLACK_OLIVE = new Color(59, 60, 54);
    public static final Color HONEYDEW = new Color(240, 255, 240);
    public static final Color NYANZA = new Color(233, 255, 219);
    public static final Color CHINESE_WHITE = new Color(226, 229, 222);
    public static final Color TEA_GREEN = new Color(208, 240, 192);
    public static final Color MENTHOL = new Color(193, 249, 162);
    public static final Color MINT_GREEN = new Color(152, 255, 152);
    public static final Color PALE_GREEN = new Color(152, 251, 152);
    public static final Color CELADON = new Color(172, 225, 175);
    public static final Color LIGHT_MOSS_GREEN = new Color(173, 223, 173);
    public static final Color GRANNY_SMITH_APPLE = new Color(168, 228, 160);
    public static final Color TEAL_DEER = new Color(153, 230, 179);
    public static final Color LIGHT_GREEN = new Color(144, 238, 144);
    public static final Color ASH_GRAY = new Color(178, 190, 181);
    public static final Color SCREAMIN_GREEN = new Color(102, 255, 102);
    public static final Color CAMBRIDGE_BLUE = new Color(163, 193, 173);
    public static final Color SILVER_FOIL = new Color(175, 177, 174);
    public static final Color ETON_BLUE = new Color(150, 200, 162);
    public static final Color LAUREL_GREEN = new Color(169, 186, 157);
    public static final Color PASTEL_GREEN = new Color(119, 221, 119);
    public static final Color VERY_LIGHT_MALACHITE_GREEN = new Color(100, 233, 134);
    public static final Color BYAKUROKU_WHITISH_GREEN = new Color(165, 186, 147);
    public static final Color DARK_SEA_GREEN = new Color(143, 188, 143);
    public static final Color INCHWORM = new Color(178, 236, 93);
    public static final Color PISTACHIO = new Color(147, 197, 114);
    public static final Color FRENCH_LIME = new Color(158, 253, 56);
    public static final Color GREEN_YELLOW = new Color(173, 255, 47);
    public static final Color IGUANA_GREEN = new Color(113, 188, 120);
    public static final Color OLIVINE = new Color(154, 185, 115);
    public static final Color SPRING_FROST = new Color(135, 255, 42);
    public static final Color MANTIS = new Color(116, 195, 101);
    public static final Color GREEN_LIZARD = new Color(167, 244, 50);
    public static final Color KIWI = new Color(142, 229, 63);
    public static final Color DOLLAR_BILL = new Color(133, 187, 101);
    public static final Color EMERALD = new Color(80, 200, 120);
    public static final Color BUD_GREEN = new Color(123, 182, 97);
    public static final Color ASPARAGUS = new Color(135, 169, 107);
    public static final Color NEON_GREEN = new Color(57, 255, 20);
    public static final Color USUAO_PALE_BLUE = new Color(140, 156, 118);
    public static final Color DOLPHIN_GRAY = new Color(130, 142, 132);
    public static final Color USUMOEGI_PALE_YOUNG_GREEN_ONION = new Color(141, 178, 85);
    public static final Color OXLEY = new Color(109, 154, 121);
    public static final Color SHINY_SHAMROCK = new Color(95, 167, 120);
    public static final Color CRAYOLA_FOREST_GREEN = new Color(95, 167, 119);
    public static final Color ASDA_GREEN = new Color(125, 194, 66);
    public static final Color MANGO_GREEN = new Color(150, 255, 0);
    public static final Color BRIGHT_GREEN = new Color(102, 255, 0);
    public static final Color GREEN_SLIME = new Color(101, 255, 0);
    public static final Color CHLOROPHYLL_GREEN = new Color(74, 255, 0);
    public static final Color HARLEQUIN = new Color(63, 255, 0);
    public static final Color LIME_GREEN = new Color(50, 205, 50);
    public static final Color ELECTRIC_GREEN = new Color(0, 255, 0);
    public static final Color LAWN_GREEN = new Color(124, 252, 0);
    public static final Color APPLE = new Color(102, 180, 71);
    public static final Color XANADU = new Color(115, 134, 120);
    public static final Color RUSSIAN_GREEN = new Color(103, 146, 103);
    public static final Color SMOKE = new Color(115, 130, 118);
    public static final Color WAKATAKE_IRO_YOUNG_BAMBOO_COLOR = new Color(107, 147, 98);
    public static final Color MINATONEZUMI_HARBOR_RAT = new Color(117, 125, 117);
    public static final Color CAMOUFLAGE_GREEN = new Color(120, 134, 107);
    public static final Color AMERICAN_GREEN = new Color(52, 179, 52);
    public static final Color NICKEL = new Color(114, 116, 114);
    public static final Color WAGENINGEN_GREEN = new Color(52, 178, 51);
    public static final Color MALACHITE = new Color(11, 218, 81);
    public static final Color HARLEQUIN_GREEN = new Color(70, 203, 24);
    public static final Color RYB_GREEN = new Color(102, 176, 50);
    public static final Color MIDDLE_GREEN = new Color(77, 140, 87);
    public static final Color PALM_LEAF = new Color(111, 153, 64);
    public static final Color AXOLOTL = new Color(99, 119, 91);
    public static final Color KELLY_GREEN = new Color(76, 187, 23);
    public static final Color MAY_GREEN = new Color(76, 145, 65);
    public static final Color VINE_GREEN = new Color(56, 163, 42);
    public static final Color COLOR_WHEEL_YELLOW_GREEN = new Color(48, 178, 26);
    public static final Color VIVID_MALACHITE = new Color(0, 204, 51);
    public static final Color DOUBAN_GREEN = new Color(46, 150, 61);
    public static final Color DARK_PASTEL_GREEN = new Color(3, 192, 60);
    public static final Color MAXIMUM_GREEN = new Color(94, 140, 49);
    public static final Color TONOCHA_ALOESWOOD_BROWN = new Color(90, 100, 87);
    public static final Color FERN_GREEN = new Color(79, 121, 66);
    public static final Color ROKUSHO_PATINA = new Color(64, 122, 82);
    public static final Color MOEGI_FRESH_ONION = new Color(91, 137, 48);
    public static final Color EBONY = new Color(85, 93, 80);
    public static final Color SLIMY_GREEN = new Color(41, 150, 23);
    public static final Color FOREST_GREEN = new Color(34, 139, 34);
    public static final Color SAP_GREEN = new Color(80, 125, 42);
    public static final Color JAPANESE_LAUREL = new Color(47, 117, 50);
    public static final Color GRAY_ASPARAGUS = new Color(70, 89, 69);
    public static final Color DARK_OLIVE_GREEN = new Color(85, 107, 47);
    public static final Color TOKUSA_IRO_HORSETAIL_COLOR = new Color(61, 93, 66);
    public static final Color VERSE_GREEN = new Color(24, 136, 13);
    public static final Color NORTH_TEXAS_GREEN = new Color(5, 144, 51);
    public static final Color DEEP_MOSS_GREEN = new Color(53, 94, 59);
    public static final Color MUGHAL_GREEN = new Color(48, 96, 48);
    public static final Color INDIA_GREEN = new Color(19, 136, 8);
    public static final Color ISLAMIC_GREEN = new Color(0, 144, 0);
    public static final Color GREEN_COLA = new Color(76, 114, 29);
    public static final Color MIDORI_GREEN = new Color(42, 96, 59);
    public static final Color XBOX_GREEN = new Color(14, 122, 13);
    public static final Color RIFLE_GREEN = new Color(68, 76, 56);
    public static final Color NAPIER_GREEN = new Color(42, 128, 0);
    public static final Color GREEN = new Color(0, 128, 1);
    public static final Color ENGLISH_AO = new Color(0, 128, 0);
    public static final Color SABITETSUONANDO_RUSTY_STOREROOM = new Color(58, 64, 59);
    public static final Color SENSAIMIDORI_THOUSAND_YEAR_OLD_GREEN = new Color(55, 66, 49);
    public static final Color KOMBU_GREEN = new Color(53, 66, 48);
    public static final Color METALLIC_GREEN = new Color(41, 110, 1);
    public static final Color DEEP_GREEN = new Color(5, 102, 8);
    public static final Color CAL_POLY_POMONA_GREEN = new Color(30, 77, 43);
    public static final Color ROYAL_GREEN = new Color(19, 98, 7);
    public static final Color EMERALD_GREEN = new Color(4, 99, 7);
    public static final Color PAKISTAN_GREEN = new Color(0, 102, 0);
    public static final Color AIMIRUCHA_INDIGO_CODIUM_FRAGILE_SEAWEED_BROWN = new Color(46, 55, 46);
    public static final Color LINCOLN_GREEN = new Color(25, 89, 5);
    public static final Color BLACK_LEATHER_JACKET = new Color(37, 53, 41);
    public static final Color PINE_TREE = new Color(42, 47, 35);
    public static final Color MINT_CREAM = new Color(245, 255, 250);
    public static final Color ITALIAN_ICE = new Color(233, 246, 239);
    public static final Color AERO_BLUE = new Color(201, 255, 229);
    public static final Color MAGIC_MINT = new Color(170, 240, 209);
    public static final Color JET_STREAM = new Color(187, 208, 201);
    public static final Color SEA_FOAM_GREEN = new Color(159, 226, 191);
    public static final Color AQUAMARINE = new Color(127, 255, 212);
    public static final Color TURQUOISE_GREEN = new Color(160, 214, 180);
    public static final Color PALE_ROBIN_EGG_BLUE = new Color(150, 222, 209);
    public static final Color OPAL = new Color(168, 195, 188);
    public static final Color MIDDLE_BLUE_GREEN = new Color(141, 217, 204);
    public static final Color PEARL_AQUA = new Color(136, 216, 192);
    public static final Color MEDIUM_AQUAMARINE = new Color(102, 221, 170);
    public static final Color MORNING_BLUE = new Color(141, 163, 153);
    public static final Color SEIJI_IRO_CELADON_COLOR = new Color(129, 156, 139);
    public static final Color GREEN_SHEEN = new Color(110, 174, 161);
    public static final Color EUCALYPTUS = new Color(68, 215, 168);
    public static final Color MIZUASAGI_PALE_GREEN_ONION = new Color(116, 159, 141);
    public static final Color UFO_GREEN = new Color(60, 208, 112);
    public static final Color OCEAN_GREEN = new Color(72, 191, 145);
    public static final Color BLUE_LAGOON = new Color(76, 183, 165);
    public static final Color POLISHED_PINE = new Color(93, 164, 147);
    public static final Color CRAYOLA_SEA_GREEN = new Color(0, 255, 205);
    public static final Color GUPPIE_GREEN = new Color(0, 255, 127);
    public static final Color MEDIUM_SPRING_GREEN = new Color(0, 250, 154);
    public static final Color MINT = new Color(62, 180, 137);
    public static final Color MEDIUM_SEA_GREEN = new Color(60, 179, 113);
    public static final Color MOUNTAIN_MEADOW = new Color(48, 186, 143);
    public static final Color SABIASAGI_RUSTED_LIGHT_BLUE = new Color(106, 127, 122);
    public static final Color ZOMP = new Color(57, 167, 142);
    public static final Color WINTERGREEN_DREAM = new Color(86, 136, 125);
    public static final Color JUNGLE_GREEN = new Color(41, 171, 135);
    public static final Color CARIBBEAN_GREEN = new Color(0, 204, 153);
    public static final Color CRAYOLA_GREEN = new Color(28, 172, 120);
    public static final Color HOOKERS_GREEN = new Color(73, 121, 107);
    public static final Color DEEP_AQUAMARINE = new Color(64, 130, 109);
    public static final Color ILLUMINATING_EMERALD = new Color(49, 145, 119);
    public static final Color GOOGLE_CHROME_GREEN = new Color(26, 162, 96);
    public static final Color SEA_GREEN = new Color(46, 139, 87);
    public static final Color AMAZON = new Color(59, 122, 87);
    public static final Color PANTONE_GREEN = new Color(0, 173, 67);
    public static final Color GO_GREEN = new Color(0, 171, 102);
    public static final Color FELDGRAU = new Color(77, 93, 83);
    public static final Color MUNSELL_GREEN = new Color(0, 168, 119);
    public static final Color SESAME_STREET_GREEN = new Color(0, 168, 112);
    public static final Color JADE = new Color(0, 168, 107);
    public static final Color PIGMENT_GREEN = new Color(0, 165, 80);
    public static final Color SEIHEKI_BLUE_GREEN = new Color(58, 105, 96);
    public static final Color NCS_GREEN = new Color(0, 159, 107);
    public static final Color SHAMROCK_GREEN = new Color(0, 158, 96);
    public static final Color PAOLO_VERONESE_GREEN = new Color(0, 155, 125);
    public static final Color POKER_GREEN = new Color(53, 101, 77);
    public static final Color GREEN_CYAN = new Color(0, 153, 102);
    public static final Color SPANISH_GREEN = new Color(0, 145, 80);
    public static final Color DEEP_GREEN_CYAN_TURQUOISE = new Color(14, 124, 97);
    public static final Color DARK_SPRING_GREEN = new Color(23, 114, 69);
    public static final Color PHILIPPINE_GREEN = new Color(0, 133, 67);
    public static final Color GENERIC_VIRIDIAN = new Color(0, 127, 102);
    public static final Color SPANISH_VIRIDIAN = new Color(0, 127, 92);
    public static final Color TROPICAL_RAIN_FOREST = new Color(0, 117, 94);
    public static final Color MUSHIAO_INSECT_SCREEN = new Color(45, 68, 54);
    public static final Color DARTMOUTH_GREEN = new Color(0, 112, 60);
    public static final Color CADMIUM_GREEN = new Color(0, 107, 60);
    public static final Color BANGLADESH_GREEN = new Color(0, 106, 78);
    public static final Color BIRODO_VELVET = new Color(34, 70, 52);
    public static final Color BRUNSWICK_GREEN = new Color(27, 77, 62);
    public static final Color AOTAKE_IRO_GREEN_BAMBOO_COLOR = new Color(0, 100, 66);
    public static final Color TETSU_IRO_IRON_COLOR = new Color(43, 55, 51);
    public static final Color MSU_GREEN = new Color(24, 69, 59);
    public static final Color CASTLETON_GREEN = new Color(0, 86, 63);
    public static final Color COLOR_WHEEL_BLUE_GREEN = new Color(6, 78, 64);
    public static final Color MEDIUM_JUNGLE_GREEN = new Color(28, 53, 45);
    public static final Color PHTHALO_GREEN = new Color(18, 53, 36);
    public static final Color TRADITIONAL_FOREST_GREEN = new Color(1, 68, 33);
    public static final Color BRITISH_RACING_GREEN = new Color(0, 66, 37);
    public static final Color DARK_JUNGLE_GREEN = new Color(26, 36, 33);
    public static final Color SACRAMENTO_STATE_GREEN = new Color(4, 57, 39);
    public static final Color DARK_GREEN = new Color(1, 50, 32);
    public static final Color AZURE_MIST = new Color(240, 255, 255);
    public static final Color BUBBLES = new Color(231, 254, 255);
    public static final Color AIJIRO_INDIGO_WHITE = new Color(235, 246, 247);
    public static final Color LIGHT_CYAN = new Color(224, 255, 255);
    public static final Color WATER = new Color(212, 241, 249);
    public static final Color DIAMOND = new Color(185, 242, 255);
    public static final Color CELESTE = new Color(178, 255, 255);
    public static final Color ALUMINUM_FOIL = new Color(210, 217, 219);
    public static final Color COLUMBIA_BLUE = new Color(196, 216, 226);
    public static final Color FRESH_AIR = new Color(166, 231, 255);
    public static final Color WINTER_WIZARD = new Color(160, 230, 255);
    public static final Color PALE_TURQUOISE = new Color(175, 238, 238);
    public static final Color WATERSPOUT = new Color(164, 244, 249);
    public static final Color BLIZZARD_BLUE = new Color(172, 229, 238);
    public static final Color POWDER_BLUE = new Color(176, 224, 230);
    public static final Color LIGHT_BLUE = new Color(173, 216, 230);
    public static final Color NON_PHOTO_BLUE = new Color(164, 221, 237);
    public static final Color CRYSTAL = new Color(167, 216, 222);
    public static final Color SILVER_SAND = new Color(191, 193, 194);
    public static final Color PALE_CYAN = new Color(135, 211, 248);
    public static final Color PASTEL_BLUE = new Color(174, 198, 207);
    public static final Color CORNFLOWER = new Color(147, 204, 234);
    public static final Color ELECTRIC_BLUE = new Color(125, 249, 255);
    public static final Color BABY_BLUE = new Color(137, 207, 240);
    public static final Color SKY_BLUE = new Color(135, 206, 235);
    public static final Color MEDIUM_SKY_BLUE = new Color(128, 218, 235);
    public static final Color MIDDLE_BLUE = new Color(126, 212, 230);
    public static final Color DARK_SKY_BLUE = new Color(140, 190, 214);
    public static final Color CRAYOLA_SKY_BLUE = new Color(118, 215, 234);
    public static final Color PEWTER_BLUE = new Color(139, 168, 183);
    public static final Color MOONSTONE_BLUE = new Color(115, 169, 194);
    public static final Color DELICATE_GIRL_BLUE = new Color(106, 178, 202);
    public static final Color MIZU_IRO_AQUA_BLUE_COLOR = new Color(134, 171, 165);
    public static final Color PICTON_BLUE = new Color(69, 177, 232);
    public static final Color BAYSIDE = new Color(95, 201, 191);
    public static final Color TURQUOISE = new Color(64, 224, 208);
    public static final Color SEA_SERPENT = new Color(75, 199, 207);
    public static final Color MEDIUM_TURQUOISE = new Color(72, 209, 204);
    public static final Color CRYSTAL_BLUE = new Color(104, 160, 176);
    public static final Color MAXIMUM_BLUE = new Color(71, 171, 204);
    public static final Color LOTION_BLUE = new Color(21, 242, 253);
    public static final Color SPIRO_DISCO_BALL = new Color(15, 192, 252);
    public static final Color FLUORESCENT_BLUE = new Color(21, 244, 238);
    public static final Color TWITTER_BLUE = new Color(38, 167, 222);
    public static final Color DESATURATED_CYAN = new Color(102, 153, 153);
    public static final Color CADET_BLUE = new Color(95, 158, 160);
    public static final Color AQUA = new Color(0, 255, 255);
    public static final Color TURQUOISE_BLUE = new Color(0, 255, 239);
    public static final Color VIVID_SKY_BLUE = new Color(0, 204, 255);
    public static final Color CAPRI = new Color(0, 191, 255);
    public static final Color MOONSTONE = new Color(58, 168, 193);
    public static final Color BLUE_BOLT = new Color(0, 185, 251);
    public static final Color SORA_IRO_SKY_BLUE_COLOR = new Color(77, 143, 172);
    public static final Color CARIBBEAN_BLUE = new Color(26, 193, 221);
    public static final Color VERDIGRIS = new Color(67, 179, 174);
    public static final Color BLUE_RASPBERRY = new Color(12, 191, 233);
    public static final Color BATTERY_CHARGED_BLUE = new Color(29, 172, 214);
    public static final Color DOUBAN_BLUE = new Color(36, 150, 205);
    public static final Color BRIGHT_TURQUOISE = new Color(8, 232, 222);
    public static final Color MAXIMUM_BLUE_GREEN = new Color(48, 191, 191);
    public static final Color AUROMETALSAURUS = new Color(110, 127, 128);
    public static final Color BALL_BLUE = new Color(33, 171, 205);
    public static final Color VIVID_CERULEAN = new Color(0, 170, 238);
    public static final Color MICROSOFT_BLUE = new Color(0, 162, 237);
    public static final Color PROCESS_CYAN = new Color(0, 183, 235);
    public static final Color STEEL_TEAL = new Color(95, 138, 139);
    public static final Color KEPPEL = new Color(58, 176, 158);
    public static final Color PACIFIC_BLUE = new Color(28, 169, 201);
    public static final Color ASAGI_IRO_LIGHT_BLUE_COLOR = new Color(72, 146, 155);
    public static final Color HAWAII_BLUE = new Color(0, 195, 227);
    public static final Color CYAN_CORNFLOWER_BLUE = new Color(24, 139, 194);
    public static final Color RICH_ELECTRIC_BLUE = new Color(8, 146, 208);
    public static final Color JELLY_BEAN_BLUE = new Color(68, 121, 142);
    public static final Color LIGHT_SEA_GREEN = new Color(32, 178, 170);
    public static final Color DARK_TURQUOISE = new Color(0, 206, 209);
    public static final Color TURQUOISE_SURF = new Color(0, 197, 205);
    public static final Color ROBIN_EGG_BLUE = new Color(0, 204, 204);
    public static final Color BLUE_GREEN = new Color(13, 152, 186);
    public static final Color CADET = new Color(83, 104, 114);
    public static final Color TIFFANY_BLUE = new Color(10, 186, 181);
    public static final Color TEAL_BLUE = new Color(54, 117, 136);
    public static final Color NCS_BLUE = new Color(0, 135, 189);
    public static final Color CHIGUSA_IRO_THOUSAND_HERB_COLOR = new Color(49, 117, 137);
    public static final Color STORMCLOUD = new Color(79, 102, 106);
    public static final Color MASUHANA_IRO_OPPOSITE_FLOWER_COLOR = new Color(77, 100, 108);
    public static final Color STAR_COMMAND_BLUE = new Color(0, 123, 184);
    public static final Color DEEP_SPACE_SPARKLE = new Color(74, 100, 108);
    public static final Color BONDI_BLUE = new Color(0, 149, 182);
    public static final Color CELADON_GREEN = new Color(47, 132, 124);
    public static final Color BOY_RED = new Color(14, 156, 165);
    public static final Color MING = new Color(54, 116, 125);
    public static final Color MUNSELL_BLUE = new Color(0, 147, 175);
    public static final Color MYRTLE_GREEN = new Color(49, 120, 115);
    public static final Color CELADON_BLUE = new Color(0, 123, 167);
    public static final Color PERSIAN_GREEN = new Color(0, 166, 147);
    public static final Color CG_BLUE = new Color(0, 122, 165);
    public static final Color SABIONANDO_RUSTY_STORAGE = new Color(69, 88, 89);
    public static final Color HANAASAGI_LIGHT_BLUE_FLOWER = new Color(29, 105, 124);
    public static final Color VIRIDIAN_GREEN = new Color(0, 150, 152);
    public static final Color METALLIC_SEAWEED = new Color(10, 126, 140);
    public static final Color SEA_BLUE = new Color(0, 105, 148);
    public static final Color BLUE_SAPPHIRE = new Color(18, 97, 128);
    public static final Color OMESHIONANDO_KIMONO_STORAGE = new Color(61, 76, 81);
    public static final Color OUTER_SPACE = new Color(65, 74, 76);
    public static final Color DARK_CYAN = new Color(0, 139, 139);
    public static final Color NOSHIMEHANA_IRO_IRON_HEAD_FLOWER_COLOR = new Color(52, 77, 86);
    public static final Color OMESHICHA_SILK_CREPE_BROWN = new Color(53, 78, 75);
    public static final Color TEAL_GREEN = new Color(0, 130, 127);
    public static final Color TEAL = new Color(0, 128, 128);
    public static final Color SHINBASHI_IRO_NEW_BRIDGE = new Color(0, 108, 127);
    public static final Color DARK_SLATE_GRAY = new Color(47, 79, 79);
    public static final Color PINE_GREEN = new Color(1, 121, 111);
    public static final Color ONANDO_IRO_ONANDO_COLOR = new Color(54, 65, 65);
    public static final Color SKOBELOFF = new Color(0, 116, 116);
    public static final Color ONYX = new Color(53, 56, 57);
    public static final Color JAPANESE_INDIGO = new Color(38, 67, 72);
    public static final Color HANADA_LIGHT_BLUE_SILK = new Color(4, 79, 103);
    public static final Color CRAYOLA_OUTER_SPACE = new Color(45, 56, 58);
    public static final Color GUNMETAL = new Color(42, 52, 57);
    public static final Color TETSUONANDO_IRON_STORAGE = new Color(43, 55, 54);
    public static final Color KORAINANDO_GORYEO_STOREROOM = new Color(32, 56, 56);
    public static final Color EAGLE_GREEN_MIDNIGHT_GREEN = new Color(0, 73, 83);
    public static final Color CHARLESTON_GREEN = new Color(35, 43, 43);
    public static final Color DEEP_JUNGLE_GREEN = new Color(0, 75, 73);
    public static final Color WARM_BLACK = new Color(0, 66, 66);
    public static final Color RICH_BLACK = new Color(0, 64, 64);
    public static final Color ALICE_BLUE = new Color(240, 248, 255);
    public static final Color ANTI_FLASH_WHITE = new Color(242, 243, 244);
    public static final Color AZUREISH_WHITE = new Color(219, 233, 244);
    public static final Color BEAU_BLUE = new Color(188, 212, 230);
    public static final Color PALE_CORNFLOWER_BLUE = new Color(171, 205, 239);
    public static final Color BABY_BLUE_EYES = new Color(161, 202, 241);
    public static final Color LIGHT_STEEL_BLUE = new Color(176, 196, 222);
    public static final Color LIGHT_SKY_BLUE = new Color(135, 206, 250);
    public static final Color PALE_CERULEAN = new Color(155, 196, 226);
    public static final Color PARAKEET_BLUE = new Color(126, 182, 255);
    public static final Color JORDY_BLUE = new Color(138, 185, 241);
    public static final Color FRENCH_SKY_BLUE = new Color(119, 181, 254);
    public static final Color VERY_LIGHT_AZURE = new Color(116, 187, 251);
    public static final Color MAYA_BLUE = new Color(115, 194, 251);
    public static final Color CRAYOLA_CADET_BLUE = new Color(169, 178, 195);
    public static final Color LIGHT_COBALT_BLUE = new Color(136, 172, 224);
    public static final Color AERO = new Color(124, 185, 232);
    public static final Color VISTA_BLUE = new Color(124, 158, 217);
    public static final Color CORNFLOWER_BLUE = new Color(100, 149, 237);
    public static final Color BLUE_JEANS = new Color(93, 173, 236);
    public static final Color LITTLE_BOY_BLUE = new Color(108, 160, 220);
    public static final Color BLUEBERRY = new Color(79, 134, 247);
    public static final Color ICEBERG = new Color(113, 166, 210);
    public static final Color DARK_PASTEL_BLUE = new Color(119, 158, 203);
    public static final Color CADET_GREY = new Color(145, 163, 176);
    public static final Color GOOGLE_CHROME_BLUE = new Color(76, 139, 245);
    public static final Color UNITED_NATIONS_BLUE = new Color(91, 146, 229);
    public static final Color AIR_SUPERIORITY_BLUE = new Color(114, 160, 193);
    public static final Color BLUE_GRAY = new Color(102, 153, 204);
    public static final Color BRILLIANT_AZURE = new Color(51, 153, 255);
    public static final Color CERULEAN_FROST = new Color(109, 155, 195);
    public static final Color CAROLINA_BLUE = new Color(86, 160, 211);
    public static final Color WELDON_BLUE = new Color(124, 152, 171);
    public static final Color CRAYOLA_BLUE = new Color(31, 117, 254);
    public static final Color DODGER_BLUE = new Color(30, 144, 255);
    public static final Color SHADOW_BLUE = new Color(119, 139, 165);
    public static final Color TUFTS_BLUE = new Color(62, 142, 222);
    public static final Color CELESTIAL_BLUE = new Color(73, 151, 208);
    public static final Color BLEU_DE_FRANCE = new Color(49, 140, 231);
    public static final Color SILVER_LAKE_BLUE = new Color(93, 137, 186);
    public static final Color GLAUCOUS = new Color(96, 130, 182);
    public static final Color BUTTON_BLUE = new Color(36, 160, 237);
    public static final Color LIGHT_SLATE_GRAY = new Color(119, 136, 153);
    public static final Color WEEBLY_BLUE = new Color(31, 142, 237);
    public static final Color GUNJO_IRO_ULTRAMARINE_COLOR = new Color(93, 140, 174);
    public static final Color RAF_AIR_FORCE_BLUE = new Color(93, 138, 168);
    public static final Color CYAN_BLUE_AZURE = new Color(70, 130, 191);
    public static final Color CYAN_AZURE = new Color(78, 130, 180);
    public static final Color SLATE_GRAY = new Color(112, 128, 144);
    public static final Color AZURE = new Color(0, 127, 255);
    public static final Color BRANDEIS_BLUE = new Color(0, 112, 255);
    public static final Color STEEL_BLUE = new Color(70, 130, 180);
    public static final Color BLUE_YONDER = new Color(80, 114, 167);
    public static final Color FLICKR_BLUE = new Color(33, 107, 214);
    public static final Color CELTIC_BLUE = new Color(36, 107, 206);
    public static final Color BLUE_DARK = new Color(45, 104, 196);
    public static final Color CRAYOLA_GREEN_BLUE = new Color(40, 135, 200);
    public static final Color BRIGHT_NAVY_BLUE = new Color(25, 116, 210);
    public static final Color UCLA_BLUE = new Color(83, 104, 149);
    public static final Color BLUE_COLA = new Color(0, 136, 220);
    public static final Color QUEEN_BLUE = new Color(67, 107, 149);
    public static final Color MICROSOFT_EDGE_BLUE = new Color(0, 120, 215);
    public static final Color DENIM = new Color(21, 96, 189);
    public static final Color BLUE = new Color(0, 115, 207);
    public static final Color DARK_ELECTRIC_BLUE = new Color(83, 104, 120);
    public static final Color SAPPHIRE = new Color(15, 82, 186);
    public static final Color GREEN_BLUE = new Color(17, 100, 180);
    public static final Color CYAN_COBALT_BLUE = new Color(40, 88, 156);
    public static final Color BLACK_CORAL = new Color(84, 98, 111);
    public static final Color BDAZZLED_BLUE = new Color(46, 88, 148);
    public static final Color LAPIS_LAZULI = new Color(38, 97, 156);
    public static final Color YINMN_BLUE = new Color(46, 80, 144);
    public static final Color OCEAN_BOAT_BLUE = new Color(0, 119, 190);
    public static final Color PANASONIC_BLUE = new Color(0, 64, 190);
    public static final Color FRENCH_BLUE = new Color(0, 114, 187);
    public static final Color ABSOLUTE_ZERO = new Color(0, 72, 186);
    public static final Color SPANISH_BLUE = new Color(0, 112, 184);
    public static final Color LINKEDIN_BLUE = new Color(0, 114, 177);
    public static final Color HONOLULU_BLUE = new Color(0, 109, 176);
    public static final Color METALLIC_BLUE = new Color(50, 82, 123);
    public static final Color COBALT_BLUE = new Color(0, 71, 171);
    public static final Color ROYAL_AZURE = new Color(0, 56, 168);
    public static final Color RURI_IRO_LAPIS_LAZULI_COLOR = new Color(31, 71, 136);
    public static final Color PHILIPPINE_BLUE = new Color(0, 56, 167);
    public static final Color MEDIUM_PERSIAN_BLUE = new Color(0, 103, 165);
    public static final Color YALE_BLUE = new Color(15, 77, 146);
    public static final Color MEDIUM_ELECTRIC_BLUE = new Color(3, 80, 150);
    public static final Color DARK_POWDER_BLUE = new Color(0, 51, 153);
    public static final Color USAFA_BLUE = new Color(0, 79, 152);
    public static final Color USAF_AIR_FORCE_BLUE = new Color(0, 48, 143);
    public static final Color MIDNIGHT_BLUE = new Color(0, 70, 140);
    public static final Color DARK_CERULEAN = new Color(8, 69, 126);
    public static final Color CHARCOAL = new Color(54, 69, 79);
    public static final Color KONJO_IRO_PRUSSIAN_BLUE_COLOR = new Color(0, 49, 113);
    public static final Color TARDIS_BLUE = new Color(0, 59, 111);
    public static final Color ATENEO_BLUE = new Color(0, 58, 108);
    public static final Color TEAL_DARK_IMPERIAL_BLUE = new Color(0, 65, 106);
    public static final Color DARK_MIDNIGHT_BLUE = new Color(0, 51, 102);
    public static final Color DARK_ROYAL_BLUE = new Color(0, 35, 102);
    public static final Color COOL_BLACK = new Color(0, 46, 99);
    public static final Color YANKEES_BLUE = new Color(28, 40, 65);
    public static final Color PRUSSIAN_BLUE = new Color(0, 49, 83);
    public static final Color DARK_GUNMETAL = new Color(31, 38, 42);
    public static final Color OXFORD_BLUE = new Color(0, 33, 71);
    public static final Color GHOST_WHITE = new Color(248, 248, 255);
    public static final Color LAVENDER_MIST = new Color(230, 230, 250);
    public static final Color COCONUT_WHITE = new Color(233, 237, 246);
    public static final Color BRIGHT_GRAY = new Color(235, 236, 240);
    public static final Color LAVENDER_BLUE = new Color(204, 204, 255);
    public static final Color VODKA = new Color(191, 192, 238);
    public static final Color CRAYOLA_PERIWINKLE = new Color(195, 205, 230);
    public static final Color LIGHT_PERIWINKLE = new Color(197, 203, 225);
    public static final Color MAXIMUM_BLUE_PURPLE = new Color(172, 172, 230);
    public static final Color WILD_BLUE_YONDER = new Color(162, 173, 208);
    public static final Color BLUE_BELL = new Color(162, 162, 208);
    public static final Color VERY_LIGHT_BLUE = new Color(102, 102, 255);
    public static final Color CEIL = new Color(146, 161, 207);
    public static final Color CHROME_ALUMINUM = new Color(168, 169, 173);
    public static final Color MANATEE = new Color(151, 154, 170);
    public static final Color COOL_GREY = new Color(140, 146, 172);
    public static final Color ULTRAMARINE_BLUE = new Color(65, 102, 245);
    public static final Color LIGHT_ROYAL_BLUE = new Color(65, 105, 225);
    public static final Color ROMAN_SILVER = new Color(131, 137, 150);
    public static final Color HAN_BLUE = new Color(68, 108, 207);
    public static final Color BLUEBONNET = new Color(28, 28, 240);
    public static final Color PALATINATE_BLUE = new Color(39, 59, 226);
    public static final Color RYB_BLUE = new Color(2, 71, 254);
    public static final Color DARK_BLUE_GRAY = new Color(102, 102, 153);
    public static final Color LIBERTY = new Color(84, 90, 167);
    public static final Color CERULEAN_BLUE = new Color(42, 82, 190);
    public static final Color NEW_CAR = new Color(33, 79, 198);
    public static final Color VIOLET_BLUE = new Color(50, 74, 178);
    public static final Color DENIM_BLUE = new Color(34, 67, 182);
    public static final Color PERSIAN_BLUE = new Color(28, 57, 187);
    public static final Color FACEBOOK_BLUE = new Color(57, 86, 156);
    public static final Color PURPLE_NAVY = new Color(78, 81, 128);
    public static final Color MEDIUM_BLUE = new Color(0, 0, 205);
    public static final Color PIGMENT_BLUE = new Color(51, 51, 153);
    public static final Color CHINESE_BLUE = new Color(54, 81, 148);
    public static final Color INDEPENDENCE = new Color(76, 81, 109);
    public static final Color EGYPTIAN_BLUE = new Color(16, 52, 166);
    public static final Color COSMIC_COBALT = new Color(46, 45, 136);
    public static final Color DARK_CORNFLOWER_BLUE = new Color(38, 66, 139);
    public static final Color SAMSUNG_BLUE = new Color(18, 39, 158);
    public static final Color UA_BLUE = new Color(0, 51, 170);
    public static final Color AMERICAN_BLUE = new Color(59, 59, 109);
    public static final Color PANTONE_BLUE = new Color(0, 24, 168);
    public static final Color ZAFFRE = new Color(0, 20, 168);
    public static final Color CADMIUM_BLUE = new Color(10, 17, 149);
    public static final Color STPATRICKS_BLUE = new Color(35, 41, 122);
    public static final Color DUKE_BLUE = new Color(0, 0, 156);
    public static final Color INDIGO_DYE = new Color(9, 31, 146);
    public static final Color DEEP_KOAMARU = new Color(51, 51, 102);
    public static final Color IMPERIAL_BLUE = new Color(0, 35, 149);
    public static final Color DARK_BLUE = new Color(0, 0, 139);
    public static final Color RAINBOW_INDIGO = new Color(35, 48, 103);
    public static final Color PHTHALO_BLUE = new Color(0, 15, 137);
    public static final Color RESOLUTION_BLUE = new Color(0, 35, 135);
    public static final Color NAVY_BLUE = new Color(0, 0, 128);
    public static final Color CATALINA_BLUE = new Color(6, 42, 120);
    public static final Color DARK_IMPERIAL_BLUE = new Color(0, 20, 126);
    public static final Color SPACE_CADET = new Color(29, 41, 81);
    public static final Color RURIKON_DARK_BLUE_LAPIS_LAZULI = new Color(27, 41, 75);
    public static final Color DARK_NAVY = new Color(2, 7, 93);
    public static final Color KONKIKYO_NAVY_BLUE_BELLFLOWER = new Color(25, 31, 69);
    public static final Color KON_DARK_BLUE = new Color(25, 34, 54);
    public static final Color ELDERBERRY = new Color(23, 24, 43);
    public static final Color CETACEAN_BLUE = new Color(0, 20, 64);
    public static final Color KACHI_IRO_COARSE_WOOL_COLOR = new Color(24, 27, 38);
    public static final Color MAGNOLIA = new Color(248, 244, 255);
    public static final Color PALE_LAVENDER = new Color(220, 208, 255);
    public static final Color SOAP = new Color(206, 200, 239);
    public static final Color MAUVE = new Color(224, 176, 255);
    public static final Color LANGUID_LAVENDER = new Color(214, 202, 221);
    public static final Color PALE_VIOLET = new Color(204, 153, 255);
    public static final Color LAVENDER_GRAY = new Color(196, 195, 208);
    public static final Color BRIGHT_LAVENDER = new Color(191, 148, 228);
    public static final Color LIGHT_PASTEL_PURPLE = new Color(177, 156, 217);
    public static final Color LENURPLE = new Color(186, 147, 216);
    public static final Color FLORAL_LAVENDER = new Color(181, 126, 220);
    public static final Color VIOLETS_ARE_BLUE = new Color(131, 102, 244);
    public static final Color METALLIC_SILVER = new Color(170, 169, 173);
    public static final Color MEDIUM_SLATE_BLUE = new Color(123, 104, 238);
    public static final Color MEDIUM_PURPLE = new Color(147, 112, 219);
    public static final Color DARK_PASTEL_PURPLE = new Color(150, 111, 214);
    public static final Color LAVENDER_INDIGO = new Color(148, 87, 235);
    public static final Color UBE = new Color(136, 120, 195);
    public static final Color RICH_LAVENDER = new Color(167, 107, 207);
    public static final Color CRAYOLA_VIOLET_BLUE = new Color(118, 110, 200);
    public static final Color AMETHYST = new Color(153, 102, 204);
    public static final Color LAVENDER_PURPLE = new Color(150, 123, 182);
    public static final Color MIDDLE_BLUE_PURPLE = new Color(139, 114, 190);
    public static final Color PURPLE_MOUNTAIN_MAJESTY = new Color(150, 120, 182);
    public static final Color TOOLBOX = new Color(116, 108, 192);
    public static final Color MAJORELLE_BLUE = new Color(96, 80, 220);
    public static final Color SLATE_BLUE = new Color(106, 90, 205);
    public static final Color CRAYOLA_BLUE_VIOLET = new Color(115, 102, 189);
    public static final Color IRIS = new Color(90, 79, 207);
    public static final Color BENIMIDORI_STAINED_RED = new Color(120, 119, 155);
    public static final Color HAN_PURPLE = new Color(82, 24, 250);
    public static final Color DEEP_LILAC = new Color(153, 85, 187);
    public static final Color FUJI_IRO_WISTERIA_COLOR = new Color(137, 114, 158);
    public static final Color BLUE_VIOLET = new Color(138, 43, 226);
    public static final Color RHYTHM = new Color(119, 118, 150);
    public static final Color VIVID_VIOLET = new Color(159, 0, 255);
    public static final Color ELECTRIC_VIOLET = new Color(143, 0, 255);
    public static final Color COLOR_WHEEL_VIOLET = new Color(127, 0, 255);
    public static final Color ELECTRIC_INDIGO = new Color(111, 0, 255);
    public static final Color ELECTRIC_ULTRAMARINE = new Color(63, 0, 255);
    public static final Color DARK_ORCHID = new Color(153, 50, 204);
    public static final Color ROYAL_PURPLE = new Color(120, 81, 169);
    public static final Color FUJIMURASAKI_WISTERIA_PURPLE = new Color(135, 95, 154);
    public static final Color PLUMP_PURPLE = new Color(89, 70, 178);
    public static final Color OCEAN_BLUE = new Color(79, 66, 181);
    public static final Color FUJINEZUMI_MOUSY_WISTERIA = new Color(118, 105, 128);
    public static final Color DARK_LAVENDER = new Color(115, 79, 150);
    public static final Color INTERDIMENSIONAL_BLUE = new Color(54, 12, 204);
    public static final Color GRAPE = new Color(111, 45, 168);
    public static final Color FRENCH_VIOLET = new Color(136, 6, 206);
    public static final Color PURPLE_HEART = new Color(105, 53, 156);
    public static final Color REBECCA_PURPLE = new Color(102, 51, 153);
    public static final Color DARK_SLATE_BLUE = new Color(72, 61, 139);
    public static final Color BLUE_MAGENTA_VIOLET = new Color(85, 53, 146);
    public static final Color BENIKAKEHANA_IRO_SAFFLOWER_COLOR = new Color(90, 79, 116);
    public static final Color CYBER_GRAPE = new Color(88, 66, 124);
    public static final Color FUTAAI_DARK_INDIGO = new Color(97, 78, 110);
    public static final Color PURPLE = new Color(106, 13, 173);
    public static final Color KSU_PURPLE = new Color(81, 40, 136);
    public static final Color REGALIA = new Color(82, 45, 128);
    public static final Color SPANISH_VIOLET = new Color(76, 40, 130);
    public static final Color AMERICAN_VIOLET = new Color(85, 27, 140);
    public static final Color NEON_BLUE = new Color(27, 3, 163);
    public static final Color METALLIC_VIOLET = new Color(91, 10, 145);
    public static final Color COLOR_WHEEL_BLUE_VIOLET = new Color(77, 26, 127);
    public static final Color PIXIE_POWDER = new Color(57, 18, 133);
    public static final Color JACARTA = new Color(61, 50, 93);
    public static final Color PERSIAN_INDIGO = new Color(50, 18, 122);
    public static final Color INDIGO = new Color(75, 0, 130);
    public static final Color DEEP_VIOLET = new Color(51, 0, 102);
    public static final Color RUSSIAN_VIOLET = new Color(50, 23, 77);
    public static final Color PANTONE_PALE_PURPLE = new Color(250, 230, 250);
    public static final Color PINK_LACE = new Color(255, 221, 244);
    public static final Color SHAMPOO = new Color(255, 207, 241);
    public static final Color BRILLIANT_LAVENDER = new Color(244, 187, 255);
    public static final Color RICH_BRILLIANT_LAVENDER = new Color(241, 167, 254);
    public static final Color LAVENDER_ROSE = new Color(251, 160, 227);
    public static final Color CRAYOLA_THISTLE = new Color(235, 176, 215);
    public static final Color THISTLE = new Color(216, 191, 216);
    public static final Color LIGHT_ORCHID = new Color(230, 168, 215);
    public static final Color PINK_LAVENDER = new Color(216, 178, 209);
    public static final Color BRIGHT_UBE = new Color(209, 159, 232);
    public static final Color TROPICAL_VIOLET = new Color(205, 164, 222);
    public static final Color BRIGHT_LILAC = new Color(216, 145, 239);
    public static final Color LIGHT_MAGENTA = new Color(255, 128, 255);
    public static final Color CRAYOLA_ORCHID = new Color(226, 156, 210);
    public static final Color LIGHT_FUCHSIA_PINK = new Color(249, 132, 239);
    public static final Color PALE_MAGENTA = new Color(249, 132, 229);
    public static final Color MEDIUM_LAVENDER_MAGENTA = new Color(221, 160, 221);
    public static final Color WISTERIA = new Color(201, 160, 220);
    public static final Color FUCHSIA_PINK = new Color(255, 119, 255);
    public static final Color HELIOTROPE = new Color(223, 115, 255);
    public static final Color PINK_FLAMINGO = new Color(252, 116, 253);
    public static final Color LAVENDER_MAGENTA = new Color(238, 130, 238);
    public static final Color CRAYOLA_SHOCKING_PINK = new Color(255, 111, 255);
    public static final Color LIGHT_MEDIUM_ORCHID = new Color(211, 155, 203);
    public static final Color LILAC = new Color(200, 162, 200);
    public static final Color ROSE_PINK = new Color(255, 102, 204);
    public static final Color LIGHT_GRAYISH_MAGENTA = new Color(204, 153, 204);
    public static final Color PASTEL_VIOLET = new Color(203, 153, 201);
    public static final Color LIGHT_DEEP_PINK = new Color(255, 92, 205);
    public static final Color PASTEL_PURPLE = new Color(179, 158, 181);
    public static final Color PURPLE_PIZZAZZ = new Color(254, 78, 218);
    public static final Color ORCHID = new Color(218, 112, 214);
    public static final Color DEEP_MAUVE = new Color(212, 115, 212);
    public static final Color LILAC_LUSTER = new Color(174, 152, 170);
    public static final Color GLOSSY_GRAPE = new Color(171, 146, 179);
    public static final Color AFRICAN_VIOLET = new Color(178, 132, 190);
    public static final Color HELIOTROPE_GRAY = new Color(170, 152, 169);
    public static final Color SKY_MAGENTA = new Color(207, 113, 175);
    public static final Color OPERA_MAUVE = new Color(183, 132, 167);
    public static final Color RICH_LILAC = new Color(182, 102, 210);
    public static final Color RAZZLE_DAZZLE_ROSE = new Color(255, 51, 204);
    public static final Color DEEP_AMETHYST = new Color(156, 138, 164);
    public static final Color MEDIUM_ORCHID = new Color(186, 85, 211);
    public static final Color USU_IRO_THIN_COLOR = new Color(168, 124, 160);
    public static final Color PEARLY_PURPLE = new Color(183, 104, 162);
    public static final Color HOT_MAGENTA = new Color(255, 29, 206);
    public static final Color DEEP_FUCHSIA = new Color(193, 84, 193);
    public static final Color ROSE_QUARTZ_PINK = new Color(189, 85, 156);
    public static final Color TAUPE_GRAY = new Color(139, 133, 137);
    public static final Color SHOCKING_PINK = new Color(252, 15, 192);
    public static final Color SHION_IRO_TATARIAN_ASTER_COLOR = new Color(151, 110, 154);
    public static final Color PURPLE_PLUM = new Color(156, 81, 182);
    public static final Color FUCHSIA = new Color(255, 0, 255);
    public static final Color PHLOX = new Color(223, 0, 255);
    public static final Color STEEL_PINK = new Color(204, 51, 204);
    public static final Color VIVID_ORCHID = new Color(204, 0, 255);
    public static final Color ELECTRIC_PURPLE = new Color(191, 0, 255);
    public static final Color PURPUREUS = new Color(154, 78, 174);
    public static final Color FASHION_FUCHSIA = new Color(244, 0, 161);
    public static final Color BYZANTINE = new Color(189, 51, 164);
    public static final Color VIVID_MULBERRY = new Color(184, 12, 227);
    public static final Color FRENCH_LILAC = new Color(134, 96, 142);
    public static final Color ANTIQUE_FUCHSIA = new Color(145, 92, 131);
    public static final Color HASHITA_IRO_HALF_COLOR = new Color(141, 96, 140);
    public static final Color FANDANGO = new Color(181, 51, 137);
    public static final Color CHINESE_VIOLET = new Color(133, 96, 136);
    public static final Color OLD_LAVENDER = new Color(121, 104, 120);
    public static final Color RAZZMIC_BERRY = new Color(141, 78, 133);
    public static final Color RUM = new Color(113, 102, 117);
    public static final Color CADMIUM_VIOLET = new Color(127, 62, 152);
    public static final Color CRAYOLA_VIOLET = new Color(150, 61, 127);
    public static final Color DARK_VIOLET = new Color(148, 0, 211);
    public static final Color PLUM = new Color(142, 69, 133);
    public static final Color DEEP_MAGENTA = new Color(204, 0, 204);
    public static final Color MUNSELL_PURPLE = new Color(159, 0, 197);
    public static final Color HELIOTROPE_MAGENTA = new Color(170, 0, 187);
    public static final Color MAXIMUM_PURPLE = new Color(115, 51, 128);
    public static final Color EMINENCE = new Color(108, 48, 130);
    public static final Color RYB_VIOLET = new Color(134, 1, 175);
    public static final Color AYAME_IRO_IRIS_COLOR = new Color(118, 53, 104);
    public static final Color KIKYO_IRO_BELLFLOWER_COLOR = new Color(93, 63, 106);
    public static final Color CHINESE_PURPLE = new Color(114, 11, 152);
    public static final Color FLIRT = new Color(162, 0, 109);
    public static final Color IMPERIAL = new Color(96, 47, 107);
    public static final Color BYZANTIUM = new Color(112, 41, 99);
    public static final Color QUARTZ = new Color(81, 72, 79);
    public static final Color ENGLISH_VIOLET = new Color(86, 60, 92);
    public static final Color MIDNIGHT = new Color(112, 38, 112);
    public static final Color DARK_BYZANTIUM = new Color(93, 57, 84);
    public static final Color PALATINATE_PURPLE = new Color(104, 40, 96);
    public static final Color PURPLE_TAUPE = new Color(80, 64, 77);
    public static final Color JAPANESE_VIOLET = new Color(91, 50, 86);
    public static final Color DARK_MAGENTA = new Color(139, 0, 139);
    public static final Color MARDI_GRAS = new Color(136, 0, 133);
    public static final Color PHILIPPINE_VIOLET = new Color(129, 0, 127);
    public static final Color PATRIARCH = new Color(128, 0, 128);
    public static final Color MURASAKI_PURPLE = new Color(79, 40, 75);
    public static final Color AMERICAN_PURPLE = new Color(67, 28, 83);
    public static final Color KAKITSUBATA_RABBIT_EAR_IRIS = new Color(73, 30, 60);
    public static final Color KOKIMURASAKI_DEEP_PURPLE = new Color(58, 36, 59);
    public static final Color DARK_PURPLE = new Color(48, 25, 52);
    public static final Color SHIKON_BLUE_VIOLET = new Color(43, 32, 40);
    public static final Color RAISIN_BLACK = new Color(36, 33, 36);
    public static final Color CLASSIC_ROSE = new Color(251, 204, 231);
    public static final Color LIGHT_HOT_PINK = new Color(255, 179, 222);
    public static final Color PALE_MAGENTA_PINK = new Color(255, 153, 204);
    public static final Color PINK_PEARL = new Color(231, 172, 207);
    public static final Color KOBI = new Color(231, 159, 196);
    public static final Color PRINCESS_PERFUME = new Color(255, 133, 207);
    public static final Color PERSIAN_PINK = new Color(247, 127, 190);
    public static final Color HOT_PINK = new Color(255, 105, 180);
    public static final Color MIDDLE_PURPLE = new Color(217, 130, 181);
    public static final Color WILD_ORCHID = new Color(212, 112, 162);
    public static final Color WILD_STRAWBERRY = new Color(255, 67, 164);
    public static final Color ROSE_BONBON = new Color(249, 66, 158);
    public static final Color SUPER_PINK = new Color(207, 107, 169);
    public static final Color RASPBERRY_PINK = new Color(226, 80, 152);
    public static final Color BARBIE_PINK = new Color(233, 65, 150);
    public static final Color PERSIAN_ROSE = new Color(254, 40, 162);
    public static final Color STRONG_BOY_PINK = new Color(233, 57, 158);
    public static final Color FROSTBITE = new Color(233, 54, 167);
    public static final Color ROYAL_PINK = new Color(231, 56, 149);
    public static final Color PANTONE_PINK = new Color(215, 72, 148);
    public static final Color CRAYOLA_MULBERRY = new Color(200, 80, 155);
    public static final Color PHILIPPINE_PINK = new Color(250, 26, 142);
    public static final Color DEEP_PINK = new Color(255, 20, 147);
    public static final Color MOUNTBATTEN_PINK = new Color(153, 122, 141);
    public static final Color MULBERRY = new Color(197, 75, 140);
    public static final Color DEEP_CERISE = new Color(218, 50, 135);
    public static final Color SMITTEN = new Color(200, 65, 134);
    public static final Color CRAYOLA_RED_VIOLET = new Color(192, 68, 143);
    public static final Color PANTONE_BARBIE_PINK = new Color(224, 33, 138);
    public static final Color PROCESS_MAGENTA = new Color(255, 0, 144);
    public static final Color BRIGHT_PINK = new Color(255, 0, 127);
    public static final Color WINTER_SKY = new Color(255, 0, 124);
    public static final Color MAGENTA_PINK = new Color(204, 51, 139);
    public static final Color FLICKR_PINK = new Color(251, 0, 129);
    public static final Color VIVID_CERISE = new Color(218, 29, 129);
    public static final Color ROYAL_FUCHSIA = new Color(202, 44, 146);
    public static final Color MYSTIC_MAROON = new Color(173, 67, 121);
    public static final Color MEDIUM_RED_VIOLET = new Color(187, 51, 133);
    public static final Color DYE_MAGENTA = new Color(202, 31, 123);
    public static final Color MEXICAN_PINK = new Color(228, 0, 124);
    public static final Color RED_PURPLE = new Color(228, 0, 120);
    public static final Color MAGENTA_HAZE = new Color(159, 69, 118);
    public static final Color MAXIMUM_RED_PURPLE = new Color(166, 58, 121);
    public static final Color SUGAR_PLUM = new Color(145, 78, 117);
    public static final Color MEDIUM_VIOLET_RED = new Color(199, 21, 133);
    public static final Color TWILIGHT_LAVENDER = new Color(138, 73, 107);
    public static final Color AMARANTH_DEEP_PURPLE = new Color(159, 43, 104);
    public static final Color BOYSENBERRY = new Color(135, 50, 96);
    public static final Color JAZZBERRY_JAM = new Color(165, 11, 94);
    public static final Color DARK_RASPBERRY = new Color(135, 38, 87);
    public static final Color EGGPLANT = new Color(97, 64, 81);
    public static final Color HALAYA_UBE = new Color(102, 56, 84);
    public static final Color DARK_LIVER = new Color(83, 75, 79);
    public static final Color EBIZOME_VINE_GRAPE = new Color(109, 43, 80);
    public static final Color FRENCH_PLUM = new Color(129, 20, 83);
    public static final Color PANSY_PURPLE = new Color(120, 24, 74);
    public static final Color METSUSHI_DISAPPEARING_PURPLE = new Color(63, 49, 58);
    public static final Color SPANISH_PURPLE = new Color(102, 3, 60);
    public static final Color IMPERIAL_PURPLE = new Color(102, 2, 60);
    public static final Color KUROBENI_DARK_RED = new Color(35, 25, 30);
    public static final Color LAVENDER_BLUSH = new Color(255, 240, 245);
    public static final Color PIGGY_PINK = new Color(253, 221, 230);
    public static final Color MIMI_PINK = new Color(255, 218, 233);
    public static final Color COTTON_CANDY = new Color(255, 188, 217);
    public static final Color QUEEN_PINK = new Color(232, 204, 215);
    public static final Color LITTLE_GIRL_PINK = new Color(248, 185, 212);
    public static final Color ORCHID_PINK = new Color(242, 189, 205);
    public static final Color CAMEO_PINK = new Color(239, 187, 204);
    public static final Color LAVENDER_PINK = new Color(251, 174, 210);
    public static final Color CARNATION_PINK = new Color(255, 166, 201);
    public static final Color NADESHIKO_PINK = new Color(246, 173, 198);
    public static final Color METALLIC_PINK = new Color(237, 166, 196);
    public static final Color BAKER_MILLER_PINK = new Color(255, 145, 175);
    public static final Color PASTEL_MAGENTA = new Color(244, 154, 194);
    public static final Color HARMONIOUS_ROSE = new Color(242, 156, 183);
    public static final Color AMARANTH_PINK = new Color(241, 156, 187);
    public static final Color FLAMINGO_PINK = new Color(252, 142, 172);
    public static final Color TICKLE_ME_PINK = new Color(252, 137, 172);
    public static final Color VANILLA_ICE = new Color(243, 143, 169);
    public static final Color CHARM_PINK = new Color(230, 143, 172);
    public static final Color FRENCH_PINK = new Color(253, 108, 158);
    public static final Color CYCLAMEN = new Color(245, 111, 161);
    public static final Color LIGHT_CRIMSON = new Color(245, 105, 145);
    public static final Color STRAWBERRY = new Color(252, 90, 141);
    public static final Color PUCE = new Color(204, 136, 153);
    public static final Color BRILLIANT_ROSE = new Color(255, 85, 163);
    public static final Color CHINESE_PINK = new Color(222, 112, 161);
    public static final Color CHINA_PINK = new Color(222, 111, 161);
    public static final Color PALE_RED_VIOLET = new Color(219, 112, 147);
    public static final Color LIGHT_VIOLET_RED = new Color(247, 83, 148);
    public static final Color SASQUATCH_SOCKS = new Color(255, 70, 129);
    public static final Color CHARM = new Color(208, 116, 139);
    public static final Color FRENCH_ROSE = new Color(246, 74, 138);
    public static final Color FRENCH_FUCHSIA = new Color(253, 63, 146);
    public static final Color DARK_PINK = new Color(231, 84, 128);
    public static final Color BLUSH = new Color(222, 93, 131);
    public static final Color ENGLISH_LAVENDER = new Color(180, 131, 149);
    public static final Color BENIFUJI_RED_WISTERIA = new Color(187, 119, 150);
    public static final Color FANDANGO_PINK = new Color(222, 82, 133);
    public static final Color CINNAMON_SATIN = new Color(205, 96, 126);
    public static final Color MYSTIC = new Color(214, 82, 130);
    public static final Color CERISE_PINK = new Color(236, 59, 131);
    public static final Color ELECTRIC_PINK = new Color(246, 38, 129);
    public static final Color RUBER = new Color(206, 70, 118);
    public static final Color PANTONE_MAGENTA = new Color(208, 65, 126);
    public static final Color CERISE = new Color(222, 49, 99);
    public static final Color FUCHSIA_ROSE = new Color(199, 67, 117);
    public static final Color RAZZMATAZZ = new Color(227, 37, 107);
    public static final Color FUCHSIA_PURPLE = new Color(204, 57, 123);
    public static final Color TELEMAGENTA = new Color(207, 52, 118);
    public static final Color AMERICAN_ROSE = new Color(255, 3, 62);
    public static final Color VIVID_RASPBERRY = new Color(255, 0, 108);
    public static final Color FOLLY = new Color(255, 0, 79);
    public static final Color ELECTRIC_CRIMSON = new Color(255, 0, 63);
    public static final Color SPANISH_CRIMSON = new Color(229, 26, 76);
    public static final Color ROSE_DUST = new Color(158, 94, 111);
    public static final Color CHINA_ROSE = new Color(168, 81, 110);
    public static final Color IRRESISTIBLE = new Color(179, 68, 108);
    public static final Color MUNSELL_RED = new Color(242, 0, 60);
    public static final Color RUBY = new Color(224, 17, 95);
    public static final Color MAUVE_TAUPE = new Color(145, 95, 109);
    public static final Color DOGWOOD_ROSE = new Color(215, 24, 104);
    public static final Color RASPBERRY = new Color(227, 11, 93);
    public static final Color MEDIUM_RUBY = new Color(170, 64, 105);
    public static final Color BRIGHT_MAROON = new Color(195, 33, 72);
    public static final Color DEBIAN_RED = new Color(215, 10, 83);
    public static final Color ROSE_RED = new Color(194, 30, 86);
    public static final Color UA_RED = new Color(217, 0, 76);
    public static final Color BOTAN_TREE_PEONY = new Color(164, 52, 93);
    public static final Color MP_CARMINE = new Color(215, 0, 64);
    public static final Color UTAH_CRIMSON = new Color(211, 0, 63);
    public static final Color AMARANTH_PURPLE = new Color(171, 39, 79);
    public static final Color RUBINE_RED = new Color(209, 0, 86);
    public static final Color SPANISH_CARMINE = new Color(209, 0, 71);
    public static final Color PURPLE_ROYAL_RED = new Color(208, 0, 96);
    public static final Color UMEMURASAKI_PLUM_PURPLE = new Color(143, 65, 85);
    public static final Color PICTORIAL_CARMINE = new Color(195, 11, 78);
    public static final Color VIVID_CRIMSON = new Color(204, 0, 51);
    public static final Color FRENCH_WINE = new Color(172, 30, 68);
    public static final Color QUINACRIDONE_MAGENTA = new Color(142, 58, 89);
    public static final Color NCS_RED = new Color(196, 2, 51);
    public static final Color DEEP_RUBY = new Color(132, 63, 91);
    public static final Color BIG_DIP_ORUBY = new Color(156, 37, 66);
    public static final Color CRIMSON_GLORY = new Color(190, 0, 50);
    public static final Color ALABAMA_CRIMSON = new Color(175, 0, 42);
    public static final Color DEEP_TUSCAN_RED = new Color(102, 66, 77);
    public static final Color BUDONEZUMI_GRAPE_MOUSE = new Color(99, 66, 75);
    public static final Color VIOLET_RED = new Color(137, 20, 70);
    public static final Color PINK_RASPBERRY = new Color(152, 0, 54);
    public static final Color OLD_MAUVE = new Color(103, 49, 71);
    public static final Color ROSE_GARNET = new Color(150, 1, 69);
    public static final Color CLARET = new Color(127, 23, 52);
    public static final Color BURGUNDY = new Color(128, 0, 32);
    public static final Color BROWN_CHOCOLATE = new Color(95, 25, 51);
    public static final Color LIGHT_CHOCOLATE_COSMOS = new Color(85, 31, 47);
    public static final Color DARK_SCARLET = new Color(86, 3, 25);
    public static final Color CHOCOLATE_KISSES = new Color(60, 20, 33);
    public static final Color HERSHEYS_DARK_CHOCOLATE = new Color(60, 19, 33);
    public static final Color CHOCOLATE_BROWN = new Color(63, 0, 15);
    public static final Color PALE_PINK = new Color(250, 218, 221);
    public static final Color BUBBLE_GUM = new Color(255, 193, 204);
    public static final Color PINK = new Color(255, 192, 203);
    public static final Color CHERRY_BLOSSOM_PINK = new Color(255, 183, 197);
    public static final Color LIGHT_PINK = new Color(255, 182, 193);
    public static final Color SALMON_PINK = new Color(255, 145, 164);
    public static final Color SWEET_SIXTEEN = new Color(242, 158, 171);
    public static final Color FLOWER_GIRL = new Color(244, 152, 173);
    public static final Color MAUVELOUS = new Color(239, 152, 170);
    public static final Color PINK_SHERBET = new Color(247, 143, 167);
    public static final Color PARROT_PINK = new Color(217, 152, 160);
    public static final Color RUDDY_PINK = new Color(225, 142, 150);
    public static final Color BLACK_SHADOWS = new Color(191, 175, 178);
    public static final Color MOMO_IRO_PEACH_COLORED = new Color(244, 121, 131);
    public static final Color ULTRA_RED = new Color(252, 108, 133);
    public static final Color SHIMMERING_BLUSH = new Color(217, 134, 149);
    public static final Color BRINK_PINK = new Color(251, 96, 127);
    public static final Color FIERY_ROSE = new Color(255, 84, 112);
    public static final Color LIGHT_CARMINE_PINK = new Color(230, 103, 113);
    public static final Color INFRA_RED = new Color(255, 73, 108);
    public static final Color MAGIC_POTION = new Color(255, 68, 102);
    public static final Color NEON_FUCHSIA = new Color(254, 65, 100);
    public static final Color SIZZLING_RED = new Color(255, 56, 85);
    public static final Color RED_SALSA = new Color(253, 58, 74);
    public static final Color KOBAI_IRO_RED_PLUM_COLORED = new Color(219, 90, 107);
    public static final Color RADICAL_RED = new Color(255, 53, 94);
    public static final Color TURKISH_ROSE = new Color(181, 114, 129);
    public static final Color DESIRE = new Color(234, 60, 83);
    public static final Color ROSE_GOLD = new Color(183, 110, 121);
    public static final Color PARADISE_PINK = new Color(230, 62, 98);
    public static final Color AWESOME = new Color(255, 32, 82);
    public static final Color OPERA_RED = new Color(255, 27, 45);
    public static final Color DARK_TERRA_COTTA = new Color(204, 78, 92);
    public static final Color IMPERIAL_RED = new Color(237, 41, 57);
    public static final Color AMARANTH = new Color(229, 43, 80);
    public static final Color BAZAAR = new Color(152, 119, 123);
    public static final Color CRAYOLA_RED = new Color(238, 32, 77);
    public static final Color SPRINT_RED = new Color(236, 33, 49);
    public static final Color POPSTAR = new Color(190, 79, 98);
    public static final Color BRICK_RED = new Color(203, 65, 84);
    public static final Color TRACTOR_RED = new Color(253, 14, 53);
    public static final Color ALIZARIN_CRIMSON = new Color(227, 38, 54);
    public static final Color ROCKET_METALLIC = new Color(138, 127, 128);
    public static final Color RUSTY_RED = new Color(218, 44, 67);
    public static final Color DEEP_PUCE = new Color(169, 92, 104);
    public static final Color NAKABENI_DYE_MEDIUM_CRIMSON = new Color(201, 55, 86);
    public static final Color CARMINE_RED = new Color(255, 0, 56);
    public static final Color RUDDY = new Color(255, 0, 40);
    public static final Color DINGY_DUNGEON = new Color(197, 49, 81);
    public static final Color FRENCH_RASPBERRY = new Color(199, 44, 72);
    public static final Color CRIMSON = new Color(220, 20, 60);
    public static final Color MEDIUM_CANDY_APPLE_RED = new Color(226, 6, 44);
    public static final Color KARAKURENAI_FOREIGN_CRIMSON = new Color(201, 31, 55);
    public static final Color SPANISH_RED = new Color(230, 0, 38);
    public static final Color CADMIUM_RED = new Color(227, 0, 34);
    public static final Color STOP_RED = new Color(207, 20, 43);
    public static final Color CARDINAL = new Color(196, 30, 58);
    public static final Color LAVA = new Color(207, 16, 32);
    public static final Color PHILIPPINE_RED = new Color(206, 17, 39);
    public static final Color HUAWEI_RED = new Color(207, 10, 44);
    public static final Color RAMBUTAN = new Color(199, 18, 50);
    public static final Color CHINESE_RED = new Color(205, 7, 30);
    public static final Color AMERICAN_RED = new Color(179, 33, 52);
    public static final Color BLOOD_ORANGE = new Color(209, 0, 28);
    public static final Color DEEP_CARMINE = new Color(169, 32, 62);
    public static final Color CORDOVAN = new Color(137, 63, 69);
    public static final Color JAPANESE_CARMINE = new Color(157, 41, 51);
    public static final Color WINE_RED = new Color(177, 18, 38);
    public static final Color CADMIUM_PURPLE = new Color(182, 12, 38);
    public static final Color SOLID_PINK = new Color(137, 56, 67);
    public static final Color COLOR_WHEEL_RED_VIOLET = new Color(146, 43, 62);
    public static final Color VIVID_BURGUNDY = new Color(159, 29, 53);
    public static final Color YOUTUBE_RED = new Color(178, 7, 29);
    public static final Color ROYAL_RED = new Color(155, 28, 49);
    public static final Color RUBY_RED = new Color(155, 17, 30);
    public static final Color CATAWBA = new Color(112, 54, 66);
    public static final Color SUO_SAPPANWOOD = new Color(126, 38, 57);
    public static final Color PUCE_RED = new Color(114, 47, 55);
    public static final Color ANTIQUE_RUBY = new Color(132, 27, 45);
    public static final Color CARMINE = new Color(150, 0, 24);
    public static final Color DARK_PUCE = new Color(79, 58, 60);
    public static final Color RED_DEVIL = new Color(134, 1, 17);
    public static final Color MURASAKITOBI_PURPLE_KITE = new Color(81, 44, 49);
    public static final Color POMEGRANATE = new Color(102, 12, 33);
    public static final Color CHOCOLATE_COSMOS = new Color(88, 17, 26);
    public static final Color NISEMURASAKI_FAKE_PURPLE = new Color(67, 36, 42);
    public static final Color ROSEWOOD = new Color(101, 0, 11);
    public static final Color TEMPTRESS = new Color(60, 33, 38);
    public static final Color FIRE_BRICK = new Color(178, 34, 34);
    public static final Color PALE_VIOLET_RED = new Color(219, 112, 147);
    public static final Color MOCCASIN = new Color(255, 228, 181);
    public static final Color KHAKI = new Color(240, 230, 140);
    public static final Color LAVENDER = new Color(230, 230, 250);
    public static final Color VIOLET = new Color(238, 130, 238);
    public static final Color MAGENTA = new Color(255, 0, 255);
    public static final Color CHARTREUSE = new Color(127, 255, 0);
    public static final Color LIME = new Color(0, 255, 0);
    public static final Color OLIVE_DRAB = new Color(107, 142, 35);
    public static final Color OLIVE = new Color(128, 128, 0);
    public static final Color CYAN = new Color(0, 255, 255);
    public static final Color DEEP_SKY_BLUE = new Color(0, 191, 255);
    public static final Color ROYAL_BLUE = new Color(65, 105, 225);
    public static final Color NAVY = new Color(0, 0, 128);
    public static final Color BURLY_WOOD = new Color(222, 184, 135);
    public static final Color CHOCOLATE = new Color(210, 105, 30);
    public static final Color SIENNA = new Color(160, 82, 45);
    public static final Color MAROON = new Color(128, 0, 0);
    public static final Color HONEY_DEW = new Color(240, 255, 240);
    public static final Color WHITE_SMOKE = new Color(245, 245, 245);
    public static final Color SEA_SHELL = new Color(255, 245, 238);
    public static final Color SILVER = new Color(192, 192, 192);
    public static final Color DARK_GRAY = new Color(169, 169, 169);
    public static final Color GRAY = new Color(128, 128, 128);

    public static Color getColor(String name) {
        try {
            Field colorField = Colors.class.getField(name.toUpperCase().replaceAll("-", "_"));
            return (Color) colorField.get(name);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return null;
        }
    }

    public static Color getColorOrDefault(String name, Color color) {
        try {
            Field colorField = Colors.class.getField(name.toUpperCase().replaceAll("-", "_"));
            return (Color) colorField.get(name);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return color;
        }
    }

//    public static void main(String[] args) {
//        String colors = """
//IndianRed	#CD5C5C	rgb(205, 92, 92)
//LightCoral	#F08080	rgb(240, 128, 128)
//Salmon	#FA8072	rgb(250, 128, 114)
//DarkSalmon	#E9967A	rgb(233, 150, 122)
//LightSalmon	#FFA07A	rgb(255, 160, 122)
//Crimson	#DC143C	rgb(220, 20, 60)
//Red	#FF0000	rgb(255, 0, 0)
//FireBrick	#B22222	rgb(178, 34, 34)
//DarkRed	#8B0000	rgb(139, 0, 0)
//
//Pink	#FFC0CB	rgb(255, 192, 203)
//LightPink	#FFB6C1	rgb(255, 182, 193)
//HotPink	#FF69B4	rgb(255, 105, 180)
//DeepPink	#FF1493	rgb(255, 20, 147)
//MediumVioletRed	#C71585	rgb(199, 21, 133)
//PaleVioletRed	#DB7093	rgb(219, 112, 147)
//
//LightSalmon	#FFA07A	rgb(255, 160, 122)
//Coral	#FF7F50	rgb(255, 127, 80)
//Tomato	#FF6347	rgb(255, 99, 71)
//OrangeRed	#FF4500	rgb(255, 69, 0)
//DarkOrange	#FF8C00	rgb(255, 140, 0)
//Orange	#FFA500	rgb(255, 165, 0)
//
//Gold	#FFD700	rgb(255, 215, 0)
//Yellow	#FFFF00	rgb(255, 255, 0)
//LightYellow	#FFFFE0	rgb(255, 255, 224)
//LemonChiffon	#FFFACD	rgb(255, 250, 205)
//LightGoldenrodYellow	#FAFAD2	rgb(250, 250, 210)
//PapayaWhip	#FFEFD5	rgb(255, 239, 213)
//Moccasin	#FFE4B5	rgb(255, 228, 181)
//PeachPuff	#FFDAB9	rgb(255, 218, 185)
//PaleGoldenrod	#EEE8AA	rgb(238, 232, 170)
//Khaki	#F0E68C	rgb(240, 230, 140)
//DarkKhaki	#BDB76B	rgb(189, 183, 107)
//
//Lavender	#E6E6FA	rgb(230, 230, 250)
//Thistle	#D8BFD8	rgb(216, 191, 216)
//Plum	#DDA0DD	rgb(221, 160, 221)
//Violet	#EE82EE	rgb(238, 130, 238)
//Orchid	#DA70D6	rgb(218, 112, 214)
//Fuchsia	#FF00FF	rgb(255, 0, 255)
//Magenta	#FF00FF	rgb(255, 0, 255)
//MediumOrchid	#BA55D3	rgb(186, 85, 211)
//MediumPurple	#9370DB	rgb(147, 112, 219)
//RebeccaPurple	#663399	rgb(102, 51, 153)
//BlueViolet	#8A2BE2	rgb(138, 43, 226)
//DarkViolet	#9400D3	rgb(148, 0, 211)
//DarkOrchid	#9932CC	rgb(153, 50, 204)
//DarkMagenta	#8B008B	rgb(139, 0, 139)
//Purple	#800080	rgb(128, 0, 128)
//Indigo	#4B0082	rgb(75, 0, 130)
//SlateBlue	#6A5ACD	rgb(106, 90, 205)
//DarkSlateBlue	#483D8B	rgb(72, 61, 139)
//MediumSlateBlue	#7B68EE	rgb(123, 104, 238)
//
//GreenYellow	#ADFF2F	rgb(173, 255, 47)
//Chartreuse	#7FFF00	rgb(127, 255, 0)
//LawnGreen	#7CFC00	rgb(124, 252, 0)
//Lime	#00FF00	rgb(0, 255, 0)
//LimeGreen	#32CD32	rgb(50, 205, 50)
//PaleGreen	#98FB98	rgb(152, 251, 152)
//LightGreen	#90EE90	rgb(144, 238, 144)
//MediumSpringGreen	#00FA9A	rgb(0, 250, 154)
//SpringGreen	#00FF7F	rgb(0, 255, 127)
//MediumSeaGreen	#3CB371	rgb(60, 179, 113)
//SeaGreen	#2E8B57	rgb(46, 139, 87)
//ForestGreen	#228B22	rgb(34, 139, 34)
//Green	#008000	rgb(0, 128, 0)
//DarkGreen	#006400	rgb(0, 100, 0)
//YellowGreen	#9ACD32	rgb(154, 205, 50)
//OliveDrab	#6B8E23	rgb(107, 142, 35)
//Olive	#808000	rgb(128, 128, 0)
//DarkOliveGreen	#556B2F	rgb(85, 107, 47)
//MediumAquamarine	#66CDAA	rgb(102, 205, 170)
//DarkSeaGreen	#8FBC8B	rgb(143, 188, 139)
//LightSeaGreen	#20B2AA	rgb(32, 178, 170)
//DarkCyan	#008B8B	rgb(0, 139, 139)
//Teal	#008080	rgb(0, 128, 128)
//
//Aqua	#00FFFF	rgb(0, 255, 255)
//Cyan	#00FFFF	rgb(0, 255, 255)
//LightCyan	#E0FFFF	rgb(224, 255, 255)
//PaleTurquoise	#AFEEEE	rgb(175, 238, 238)
//Aquamarine	#7FFFD4	rgb(127, 255, 212)
//Turquoise	#40E0D0	rgb(64, 224, 208)
//MediumTurquoise	#48D1CC	rgb(72, 209, 204)
//DarkTurquoise	#00CED1	rgb(0, 206, 209)
//CadetBlue	#5F9EA0	rgb(95, 158, 160)
//SteelBlue	#4682B4	rgb(70, 130, 180)
//LightSteelBlue	#B0C4DE	rgb(176, 196, 222)
//PowderBlue	#B0E0E6	rgb(176, 224, 230)
//LightBlue	#ADD8E6	rgb(173, 216, 230)
//SkyBlue	#87CEEB	rgb(135, 206, 235)
//LightSkyBlue	#87CEFA	rgb(135, 206, 250)
//DeepSkyBlue	#00BFFF	rgb(0, 191, 255)
//DodgerBlue	#1E90FF	rgb(30, 144, 255)
//CornflowerBlue	#6495ED	rgb(100, 149, 237)
//MediumSlateBlue	#7B68EE	rgb(123, 104, 238)
//RoyalBlue	#4169E1	rgb(65, 105, 225)
//Blue	#0000FF	rgb(0, 0, 255)
//MediumBlue	#0000CD	rgb(0, 0, 205)
//DarkBlue	#00008B	rgb(0, 0, 139)
//Navy	#000080	rgb(0, 0, 128)
//MidnightBlue	#191970	rgb(25, 25, 112)
//
//Cornsilk	#FFF8DC	rgb(255, 248, 220)
//BlanchedAlmond	#FFEBCD	rgb(255, 235, 205)
//Bisque	#FFE4C4	rgb(255, 228, 196)
//NavajoWhite	#FFDEAD	rgb(255, 222, 173)
//Wheat	#F5DEB3	rgb(245, 222, 179)
//BurlyWood	#DEB887	rgb(222, 184, 135)
//Tan	#D2B48C	rgb(210, 180, 140)
//RosyBrown	#BC8F8F	rgb(188, 143, 143)
//SandyBrown	#F4A460	rgb(244, 164, 96)
//Goldenrod	#DAA520	rgb(218, 165, 32)
//DarkGoldenrod	#B8860B	rgb(184, 134, 11)
//Peru	#CD853F	rgb(205, 133, 63)
//Chocolate	#D2691E	rgb(210, 105, 30)
//SaddleBrown	#8B4513	rgb(139, 69, 19)
//Sienna	#A0522D	rgb(160, 82, 45)
//Brown	#A52A2A	rgb(165, 42, 42)
//Maroon	#800000	rgb(128, 0, 0)
//
//White	#FFFFFF	rgb(255, 255, 255)
//Snow	#FFFAFA	rgb(255, 250, 250)
//HoneyDew	#F0FFF0	rgb(240, 255, 240)
//MintCream	#F5FFFA	rgb(245, 255, 250)
//Azure	#F0FFFF	rgb(240, 255, 255)
//AliceBlue	#F0F8FF	rgb(240, 248, 255)
//GhostWhite	#F8F8FF	rgb(248, 248, 255)
//WhiteSmoke	#F5F5F5	rgb(245, 245, 245)
//SeaShell	#FFF5EE	rgb(255, 245, 238)
//Beige	#F5F5DC	rgb(245, 245, 220)
//OldLace	#FDF5E6	rgb(253, 245, 230)
//FloralWhite	#FFFAF0	rgb(255, 250, 240)
//Ivory	#FFFFF0	rgb(255, 255, 240)
//AntiqueWhite	#FAEBD7	rgb(250, 235, 215)
//Linen	#FAF0E6	rgb(250, 240, 230)
//LavenderBlush	#FFF0F5	rgb(255, 240, 245)
//MistyRose	#FFE4E1	rgb(255, 228, 225)
//
//Gainsboro	#DCDCDC	rgb(220, 220, 220)
//LightGray	#D3D3D3	rgb(211, 211, 211)
//Silver	#C0C0C0	rgb(192, 192, 192)
//DarkGray	#A9A9A9	rgb(169, 169, 169)
//Gray	#808080	rgb(128, 128, 128)
//DimGray	#696969	rgb(105, 105, 105)
//LightSlateGray	#778899	rgb(119, 136, 153)
//SlateGray	#708090	rgb(112, 128, 144)
//DarkSlateGray	#2F4F4F	rgb(47, 79, 79)
//Black	#000000	rgb(0, 0, 0)
//                """;
//        String[] split = colors.replaceAll("	", "").replaceAll(" {8}", "").split("\n");
//        for (String s : split) {
//            String line = s.toLowerCase().replaceAll("#[0-9a-f]{6}", "").replaceAll("rgb", "");
//            if (line.isEmpty()) {
//                System.out.println();
//                continue;
//            }
//            System.out.println("Colors.COLOR_MAP.put(\"" + line.replace("(", "\", new Color(") + ");");
//        }
//
//        System.out.println("_______________________________________________________________");
//
//        for (String s : split) {
//            String line = s.replaceAll("#[0-9A-F]{6}", "").replaceAll("rgb", "");
//            if (line.isEmpty()) {
//                System.out.println();
//                continue;
//            }
//            System.out.println("public static final Color " + line.replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase().replace("(", " = new Color(") + ";");
//        }
//
//        System.out.println("_______________________________________________________________");
//
          //https://gist.github.com/M-O-Z-G/c1deb7d4430cf469ad80c818759c0c75
//        RawAssetLoader.RawFileHandle file = RawAssetLoader.getClassPathAsset(ResourceLocation.of("cereal", "color.styl"));
//
//        // Use Scanner to read the file line by line
//        try (Scanner scanner = new Scanner(file.getString())) {
//            StringBuilder input = new StringBuilder();
//
//            // Read the entire content of the file into a single String
//            while (scanner.hasNextLine()) {
//                input.append(scanner.nextLine()).append("\n");
//            }
//
//            // Process the color data
//            processColorData(input.toString());
//            processColorData2(input.toString());
//        }

//    }

//    public static void processColorData(String input) {
//        // Regular expression to match color name and hex code in the stylus format
//        Pattern colorPattern = Pattern.compile("\\s*([a-zA-Z_-]+)\\s*:\\s*#([0-9A-Fa-f]{6})\\s*,?");
//        Matcher matcher = colorPattern.matcher(input);
//
//        // Iterate through matches and process
//        while (matcher.find()) {
//            String name = matcher.group(1);  // Color name (e.g., "white")
//            String hex = matcher.group(2);  // Hex code (e.g., "FFFFFF")
//
//            // Convert hex to RGB
//            try {
//                java.awt.Color color = java.awt.Color.decode("#" + hex);
//                int r = color.getRed();
//                int g = color.getGreen();
//                int b = color.getBlue();
//
//                // Output in the format you want (Java Color format)
//                if (name.contains("--")) {
//                    String[] split = name.split("--");
//                    System.out.printf("Colors.COLOR_MAP.put(\"%s\", Color.%s);%n", (split[1] + "_" + split[0]).toLowerCase().replaceAll("-", "_"), (split[1] + "_" + split[0]).toUpperCase().replaceAll("-", "_"));
//                } else {
//                    System.out.printf("Colors.COLOR_MAP.put(\"%s\", Color.%s);%n", name.toLowerCase().replaceAll("-", "_"), name.toUpperCase().replaceAll("-", "_"));
//                }
//            } catch (NumberFormatException e) {
//                System.err.println("Invalid hex color: " + hex);
//            }
//        }
//    }
//
//    public static void processColorData2(String input) {
//        // Regular expression to match color name and hex code in the stylus format
//        Pattern colorPattern = Pattern.compile("\\s*([a-zA-Z_-]+)\\s*:\\s*#([0-9A-Fa-f]{6})\\s*,?");
//        Matcher matcher = colorPattern.matcher(input);
//
//        // Iterate through matches and process
//        while (matcher.find()) {
//            String name = matcher.group(1);  // Color name (e.g., "white")
//            String hex = matcher.group(2);  // Hex code (e.g., "FFFFFF")
//
//            // Convert hex to RGB
//            try {
//                java.awt.Color color = java.awt.Color.decode("#" + hex);
//                int r = color.getRed();
//                int g = color.getGreen();
//                int b = color.getBlue();
//
//                // Output in the format you want (Java Color format)
//                if (name.contains("--")) {
//                    String[] split = name.split("--");
//                    System.out.printf("public static final Color %s = new Color(%d, %d, %d);\n", (split[1] + "_" + split[0]).toUpperCase().replaceAll("-", "_"), r, g, b);
//                } else {
//                    System.out.printf("public static final Color %s = new Color(%d, %d, %d);\n", name.toUpperCase().replaceAll("-", "_"), r, g, b);
//                }
//            } catch (NumberFormatException e) {
//                System.err.println("Invalid hex color: " + hex);
//            }
//        }
//    }



}
