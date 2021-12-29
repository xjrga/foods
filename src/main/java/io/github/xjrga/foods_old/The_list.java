/*
 * Copyright (C) 2021 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package io.github.xjrga.foods_old;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class The_list {

    public enum CATEGORIES {

        American_indian_alaska_native_foods("American Indian/Alaska Native Foods"),
        Baby_foods("Baby Foods"),
        Baked_products("Baked Products"),
        Beef_products("Beef Products"),
        Beverages("Beverages"),
        Breakfast_cereals("Breakfast Cereals"),
        Cereal_grains_and_pasta("Cereal Grains and Pasta"),
        dairy_and_egg_products("Dairy and Egg Products"),
        Fast_foods("Fast Foods"),
        Fats_and_oils("Fats and Oils"),
        Finfish_and_shellfish_products("Finfish and Shellfish Products"),
        Fruits_and_fruit_juices("Fruits and Fruit Juices"),
        Glycemic_index_test_set("Glycemic Index Test Set"),
        Legumes_and_legume_products("Legumes and Legume Products"),
        Nut_and_seed_products("Nut and Seed Products"),
        Omega3("Omega3"),
        Pork_products("Pork Products"),
        Poultry_products("Poultry Products"),
        Protein_powders("Protein Powders"),
        Sausages_and_luncheon_meats("Sausages and Luncheon Meats"),
        Snacks("Snacks"),
        Spices_and_herbs("Spices and Herbs"),
        Supplements("Supplements"),
        Sweets("Sweets"),
        Vegetables_and_vegetable_products("Vegetables and Vegetable Products"),;

        private final String name;

        CATEGORIES(String label
        ) {
            this.name = label;
        }

        public String get_name() {
            return name;
        }
    }

    public enum AMERICAN_INDIAN_ALASKA_NATIVE_FOODS {

        Blackberries_wild_raw_Alaska_Native("Blackberries, wild, raw (Alaska Native)"),
        Blueberries_wild_frozen_Alaska_Native("Blueberries, wild, frozen (Alaska Native)"),
        Blueberries_wild_raw_Alaska_Native("Blueberries, wild, raw (Alaska Native)"),
        Bread_blue_corn_somiviki_Hopi("Bread, blue corn, somiviki (Hopi)"),
        Chokecherries_raw_pitted_Northern_Plains_Indians("Chokecherries, raw, pitted (Northern Plains Indians)"),
        Chokecherries_raw_pitted_Shoshone_Bannock("Chokecherries, raw, pitted (Shoshone Bannock)"),
        Cranberries_wild_bush_raw_Alaska_Native("Cranberries, wild, bush, raw (Alaska Native)"),
        Fish_Salmon_Chum_raw_Alaska_Native("Fish, Salmon, Chum, raw (Alaska Native)"),
        Fish_salmon_coho_silver_raw_Alaska_Native("Fish, salmon, coho (silver), raw (Alaska Native)"),
        Fish_salmon_king_chinook_raw_Alaska_Native("Fish, salmon, king (chinook), raw (Alaska Native)"),
        Fish_salmon_sockeye_red_raw_Alaska_Native("Fish, salmon, sockeye (red), raw (Alaska Native)"),
        Plums_wild_Northern_Plains_Indians("Plums, wild (Northern Plains Indians)"),
        Prickly_pears_raw_Northern_Plains_Indians("Prickly pears, raw (Northern Plains Indians)"),
        Raspberries_wild_Northern_Plains_Indians("Raspberries, wild (Northern Plains Indians)"),
        Tortilla_blue_corn_Sakwavikaviki_Hopi("Tortilla, blue corn, Sakwavikaviki (Hopi)"),;

        private final String name;

        AMERICAN_INDIAN_ALASKA_NATIVE_FOODS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum BABY_FOODS {

        Babyfood_dessert_custard_pudding_vanilla_junior("Babyfood, dessert, custard pudding, vanilla, junior"),;

        private final String name;

        BABY_FOODS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum BAKED_PRODUCTS {

        Bagels_cinnamon_raisin("Bagels, cinnamon-raisin"),
        Bagels_multigrain("Bagels, multigrain"),
        Bagels_wheat("Bagels, wheat"),
        Bread_naan_plain_commercially_prepared_refrigerated("Bread, naan, plain, commercially prepared, refrigerated"),
        Bread_pita_white_enriched("Bread, pita, white, enriched"),
        Bread_pita_whole_wheat("Bread, pita, whole-wheat"),
        Bread_rye("Bread, rye"),
        Bread_white_wheat("Bread, white wheat"),;

        private final String name;

        BAKED_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum BEEF_PRODUCTS {

        Beef_ground_97_lean_meat_3_fat_raw("Beef, ground, 97% lean meat / 3% fat, raw"),
        Beef_loin_tenderloin_roast_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, loin, tenderloin roast, boneless, separable lean only, trimmed to 0' fat, all grades, raw"),
        Beef_loin_tenderloin_steak_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, loin, tenderloin steak, boneless, separable lean only, trimmed to 0' fat, all grades, raw"),
        Beef_loin_top_sirloin_petite_roast_filet_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, loin, top sirloin petite roast/filet, boneless, separable lean only, trimmed to 0' fat, all grades, raw"),
        Beef_round_bottom_round_roast_separable_lean_only_trimmed_to_1_8_fat_all_grades_raw("Beef, round, bottom round, roast, separable lean only, trimmed to 1/8' fat, all grades, raw"),
        Beef_round_eye_of_round_roast_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, eye of round roast, boneless, separable lean only, trimmed to 0' fat, all grades, raw"),
        Beef_round_eye_of_round_steak_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, eye of round steak, boneless, separable lean only, trimmed to 0' fat, all grades, raw"),
        Beef_round_tip_round_roast_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, tip round, roast, separable lean only, trimmed to 0' fat, all grades, raw"),
        Beef_round_tip_round_roast_separable_lean_only_trimmed_to_0_fat_choice_raw("Beef, round, tip round, roast, separable lean only, trimmed to 0' fat, choice, raw"),
        Beef_round_top_round_roast_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, top round roast, boneless, separable lean only, trimmed to 0' fat, all grades, raw"),
        Beef_round_top_round_steak_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, top round steak, boneless, separable lean only, trimmed to 0' fat, all grades, raw"),
        Beef_top_sirloin_steak_separable_lean_only_trimmed_to_1_8_fat_all_grades_raw("Beef, top sirloin, steak, separable lean only, trimmed to 1/8' fat, all grades, raw"),;

        private final String name;

        BEEF_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum BEVERAGES {

        Alcoholic_beverage_beer_light("Alcoholic beverage, beer, light"),
        Alcoholic_beverage_beer_regular_all("Alcoholic beverage, beer, regular, all"),
        Alcoholic_beverage_liqueur_coffee_53_proof("Alcoholic beverage, liqueur, coffee, 53 proof"),
        Alcoholic_beverage_wine_table_red("Alcoholic beverage, wine, table, red"),
        Alcoholic_beverage_wine_table_white("Alcoholic beverage, wine, table, white"),
        Beverages_ARIZONA_tea_ready_to_drink_lemon("Beverages, ARIZONA, tea, ready-to-drink, lemon"),
        Beverages_Carbonated_beverage_SPRITE_lemon_lime_without_caffeine("Beverages, Carbonated beverage, SPRITE, lemon-lime, without caffeine"),
        Beverages_tea_Oolong_brewed("Beverages, tea, Oolong, brewed"),
        Beverages_tea_black_brewed_prepared_with_tap_water("Beverages, tea, black, brewed, prepared with tap water"),
        Beverages_tea_green_brewed_regular("Beverages, tea, green, brewed, regular"),
        Coffee_brewed_prepared_with_tap_water("Coffee, brewed, prepared with tap water"),
        Water("Water"),;

        private final String name;

        BEVERAGES(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum BREAKFAST_CEREALS {

        Cereals_ready_to_eat_KELLOGG_KELLOGG_S_ALL_BRAN_Original("Cereals ready-to-eat, KELLOGG, KELLOGG'S ALL-BRAN Original"),
        Cereals_oats_regular_and_quick_not_fortified_dry("Cereals, oats, regular and quick, not fortified, dry"),;

        private final String name;

        BREAKFAST_CEREALS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum CEREAL_GRAINS_AND_PASTA {

        Amaranth_grain_cooked("Amaranth grain, cooked"),
        Amaranth_grain_uncooked("Amaranth grain, uncooked"),
        Barley_pearled_cooked("Barley, pearled, cooked"),
        Barley_pearled_raw("Barley, pearled, raw"),
        Corn_bran_crude("Corn bran, crude"),
        Corn_grain_white("Corn grain, white"),
        Corn_grain_yellow("Corn grain, yellow"),
        Couscous_cooked("Couscous, cooked"),
        Couscous_dry("Couscous, dry"),
        Hominy_canned_white("Hominy, canned, white"),
        Hominy_canned_yellow("Hominy, canned, yellow"),
        Millet_cooked("Millet, cooked"),
        Millet_raw("Millet, raw"),
        Oat_bran_cooked("Oat bran, cooked"),
        Oat_bran_raw("Oat bran, raw"),
        Oats("Oats"),
        Pasta_cooked_enriched_without_added_salt("Pasta, cooked, enriched, without added salt"),
        Pasta_dry_enriched("Pasta, dry, enriched"),
        Pasta_whole_wheat_dry("Pasta, whole-wheat, dry"),
        Quinoa_cooked("Quinoa, cooked"),
        Quinoa_uncooked("Quinoa, uncooked"),
        Rice_bran_crude("Rice bran, crude"),
        Rice_brown_long_grain_cooked("Rice, brown, long-grain, cooked"),
        Rice_brown_long_grain_raw("Rice, brown, long-grain, raw"),
        Rice_brown_medium_grain_cooked("Rice, brown, medium-grain, cooked"),
        Rice_brown_medium_grain_raw("Rice, brown, medium-grain, raw"),
        Rice_white_glutinous_unenriched_cooked("Rice, white, glutinous, unenriched, cooked"),
        Rice_white_glutinous_unenriched_uncooked("Rice, white, glutinous, unenriched, uncooked"),
        Rice_white_long_grain_regular_enriched_cooked("Rice, white, long-grain, regular, enriched, cooked"),
        Rice_white_long_grain_regular_raw_enriched("Rice, white, long-grain, regular, raw, enriched"),
        Rice_white_medium_grain_enriched_cooked("Rice, white, medium-grain, enriched, cooked"),
        Rice_white_medium_grain_raw_enriched("Rice, white, medium-grain, raw, enriched"),
        Rice_white_short_grain_enriched_cooked("Rice, white, short-grain, enriched, cooked"),
        Rice_white_short_grain_enriched_uncooked("Rice, white, short-grain, enriched, uncooked"),
        Rye_grain("Rye grain"),
        Sorghum_grain("Sorghum grain"),
        Triticale("Triticale"),
        Wheat_bran_crude("Wheat bran, crude"),
        Wheat_germ_crude("Wheat germ, crude"),
        Wheat_KAMUT_khorasan_cooked("Wheat, KAMUT khorasan, cooked"),
        Wheat_KAMUT_khorasan_uncooked("Wheat, KAMUT khorasan, uncooked"),
        Wild_rice_cooked("Wild rice, cooked"),
        Wild_rice_raw("Wild rice, raw"),;

        private final String name;

        CEREAL_GRAINS_AND_PASTA(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum DAIRY_AND_EGG_PRODUCTS {

        Cheese_cottage_lowfat_1_milkfat("Cheese, cottage, lowfat, 1% milkfat"),
        Cheese_cottage_lowfat_1_milkfat_no_sodium_added("Cheese, cottage, lowfat, 1% milkfat, no sodium added"),
        Cheese_cottage_lowfat_2_milkfat("Cheese, cottage, lowfat, 2% milkfat"),
        Cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd("Cheese, cottage, nonfat, uncreamed, dry, large or small curd"),
        Cheese_mozzarella_nonfat("Cheese, mozzarella, nonfat"),
        Cheese_provolone_reduced_fat("Cheese, provolone, reduced fat"),
        Cheese_swiss_low_fat("Cheese, swiss, low fat"),
        Egg_white_dried("Egg, white, dried"),
        Egg_white_raw_fresh("Egg, white, raw, fresh"),
        Egg_whole_cooked_hard_boiled("Egg, whole, cooked, hard-boiled"),
        Egg_whole_raw_fresh("Egg, whole, raw, fresh"),
        Milk_buttermilk_fluid_cultured_lowfat("Milk, buttermilk, fluid, cultured, lowfat"),
        Milk_buttermilk_fluid_cultured_reduced_fat("Milk, buttermilk, fluid, cultured, reduced fat"),
        Milk_canned_condensed_sweetened("Milk, canned, condensed, sweetened"),
        Milk_canned_evaporated_nonfat_with_added_vitamin_A_and_vitamin_D("Milk, canned, evaporated, nonfat, with added vitamin A and vitamin D"),
        Milk_canned_evaporated_with_added_vitamin_D_and_without_added_vitamin_A("Milk, canned, evaporated, with added vitamin D and without added vitamin A"),
        Milk_chocolate_fat_free_with_added_vitamin_A_and_vitamin_D("Milk, chocolate, fat free, with added vitamin A and vitamin D"),
        Milk_chocolate_lowfat_with_added_vitamin_A_and_vitamin_D("Milk, chocolate, lowfat, with added vitamin A and vitamin D"),
        Milk_dry_nonfat_instant_with_added_vitamin_A_and_vitamin_D("Milk, dry, nonfat, instant, with added vitamin A and vitamin D"),
        Milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_A_and_vitamin_D("Milk, lowfat, fluid, 1% milkfat, protein fortified, with added vitamin A and vitamin D"),
        Milk_lowfat_fluid_1_milkfat_with_added_vitamin_A_and_vitamin_D("Milk, lowfat, fluid, 1% milkfat, with added vitamin A and vitamin D"),
        Milk_nonfat_fluid_protein_fortified_with_added_vitamin_A_and_vitamin_D_fat_free_and_skim("Milk, nonfat, fluid, protein fortified, with added vitamin A and vitamin D (fat free and skim)"),
        Milk_nonfat_fluid_with_added_vitamin_A_and_vitamin_D_fat_free_or_skim("Milk, nonfat, fluid, with added vitamin A and vitamin D (fat free or skim)"),
        Milk_producer_fluid_3_7_milkfat("Milk, producer, fluid, 3.7% milkfat"),
        Milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_A_and_vitamin_D("Milk, reduced fat, fluid, 2% milkfat, with added vitamin A and vitamin D"),
        Milk_whole_3_25_milkfat_with_added_vitamin_D("Milk, whole, 3.25% milkfat, with added vitamin D"),
        Parmesan_cheese_topping_fat_free("Parmesan cheese topping, fat free"),
        Sour_cream_fat_free("Sour cream, fat free"),
        Yogurt_Greek_plain_nonfat("Yogurt, Greek, plain, nonfat"),
        Yogurt_plain_skim_milk_13_grams_protein_per_8_ounce("Yogurt, plain, skim milk, 13 grams protein per 8 ounce"),
        Yogurt_vanilla_non_fat("Yogurt, vanilla, non-fat"),;

        private final String name;

        DAIRY_AND_EGG_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum FAST_FOODS {

        SUBWAY_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato("SUBWAY, oven roasted chicken sub on white bread with lettuce and tomato"),
        SUBWAY_roast_beef_sub_on_white_bread_with_lettuce_and_tomato("SUBWAY, roast beef sub on white bread with lettuce and tomato"),
        SUBWAY_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato("SUBWAY, turkey breast sub on white bread with lettuce and tomato"),;

        private final String name;

        FAST_FOODS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum FATS_AND_OILS {

        Fish_oil_cod_liver("Fish oil, cod liver"),
        Fish_oil_herring("Fish oil, herring"),
        Fish_oil_menhaden("Fish oil, menhaden"),
        Fish_oil_salmon("Fish oil, salmon"),
        Fish_oil_sardine("Fish oil, sardine"),
        Mayonnaise_reduced_fat_with_olive_oil("Mayonnaise, reduced fat, with olive oil"),
        Oil_PAM_cooking_spray_original("Oil, PAM cooking spray, original"),
        Oil_almond("Oil, almond"),
        Oil_avocado("Oil, avocado"),
        Oil_canola("Oil, canola"),
        Oil_corn_and_canola("Oil, corn and canola"),
        Oil_corn_industrial_and_retail_all_purpose_salad_or_cooking("Oil, corn, industrial and retail, all purpose salad or cooking"),
        Oil_cottonseed_salad_or_cooking("Oil, cottonseed, salad or cooking"),
        Oil_flaxseed_cold_pressed("Oil, flaxseed, cold pressed"),
        Oil_grapeseed("Oil, grapeseed"),
        Oil_olive_salad_or_cooking("Oil, olive, salad or cooking"),
        Oil_peanut_salad_or_cooking("Oil, peanut, salad or cooking"),
        Oil_sesame_salad_or_cooking("Oil, sesame, salad or cooking"),
        Oil_soybean_lecithin("Oil, soybean lecithin"),
        Oil_soybean_salad_or_cooking("Oil, soybean, salad or cooking"),
        Oil_walnut("Oil, walnut"),
        Oil_wheat_germ("Oil, wheat germ"),;

        private final String name;

        FATS_AND_OILS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum FINFISH_AND_SHELLFISH_PRODUCTS {

        Crustaceans_shrimp_raw_not_previously_frozen("Crustaceans, shrimp, raw (not previously frozen)"),
        Fish_mahimahi_cooked_dry_heat("Fish, mahimahi, cooked, dry heat"),
        Fish_mahimahi_raw("Fish, mahimahi, raw"),
        Fish_salmon_Atlantic_farmed_cooked_dry_heat("Fish, salmon, Atlantic, farmed, cooked, dry heat"),
        Fish_salmon_Atlantic_farmed_raw("Fish, salmon, Atlantic, farmed, raw"),
        Fish_salmon_Atlantic_wild_cooked_dry_heat("Fish, salmon, Atlantic, wild, cooked, dry heat"),
        Fish_salmon_Atlantic_wild_raw("Fish, salmon, Atlantic, wild, raw"),
        Fish_salmon_pink_cooked_dry_heat("Fish, salmon, pink, cooked, dry heat"),
        Fish_salmon_pink_raw("Fish, salmon, pink, raw"),
        Fish_sardine_Atlantic_canned_in_oil_drained_solids_with_bone("Fish, sardine, Atlantic, canned in oil, drained solids with bone"),
        Fish_sardine_Pacific_canned_in_tomato_sauce_drained_solids_with_bone("Fish, sardine, Pacific, canned in tomato sauce, drained solids with bone"),
        Fish_tilapia_cooked_dry_heat("Fish, tilapia, cooked, dry heat"),
        Fish_tilapia_raw("Fish, tilapia, raw"),
        Fish_tuna_light_canned_in_oil_drained_solids("Fish, tuna, light, canned in oil, drained solids"),
        Fish_tuna_light_canned_in_water_drained_solids("Fish, tuna, light, canned in water, drained solids"),
        Fish_tuna_white_canned_in_oil_drained_solids("Fish, tuna, white, canned in oil, drained solids"),
        Fish_tuna_white_canned_in_water_drained_solids("Fish, tuna, white, canned in water, drained solids"),;

        private final String name;

        FINFISH_AND_SHELLFISH_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum FRUITS_AND_FRUIT_JUICES {

        Apples_raw_with_skin("Apples, raw, with skin"),
        Applesauce_canned_unsweetened_with_added_ascorbic_acid("Applesauce, canned, unsweetened, with added ascorbic acid"),
        Apricots_canned_heavy_syrup_drained("Apricots, canned, heavy syrup, drained"),
        Apricots_raw("Apricots, raw"),
        Avocados_raw_all_commercial_varieties("Avocados, raw, all commercial varieties"),
        Bananas_raw("Bananas, raw"),
        Blackberries_frozen_unsweetened("Blackberries, frozen, unsweetened"),
        Blackberries_raw("Blackberries, raw"),
        Blueberries_frozen_unsweetened("Blueberries, frozen, unsweetened"),
        Blueberries_raw("Blueberries, raw"),
        Cherries_sweet_canned_pitted_heavy_syrup_drained("Cherries, sweet, canned, pitted, heavy syrup, drained"),
        Cherries_sweet_raw("Cherries, sweet, raw"),
        Figs_dried_stewed("Figs, dried, stewed"),
        Figs_dried_uncooked("Figs, dried, uncooked"),
        Figs_raw("Figs, raw"),
        Fruit_cocktail_canned_heavy_syrup_drained("Fruit cocktail, canned, heavy syrup, drained"),
        Grapefruit_juice_pink_raw("Grapefruit juice, pink, raw"),
        Grapefruit_raw_pink_and_red_and_white_all_areas("Grapefruit, raw, pink and red and white, all areas"),
        Grapes_american_type_slip_skin_raw("Grapes, american type (slip skin), raw"),
        Grapes_muscadine_raw("Grapes, muscadine, raw"),
        Grapes_red_or_green_European_type_such_as_Thompson_seedless_raw("Grapes, red or green (European type, such as Thompson seedless), raw"),
        Guavas_common_raw("Guavas, common, raw"),
        Guavas_strawberry_raw("Guavas, strawberry, raw"),
        Kiwifruit_green_raw("Kiwifruit, green, raw"),
        Lemon_juice_raw("Lemon juice, raw"),
        Lemons_raw_without_peel("Lemons, raw, without peel"),
        Lime_juice_raw("Lime juice, raw"),
        Limes_raw("Limes, raw"),
        Mangos_raw("Mangos, raw"),
        Melons_cantaloupe_raw("Melons, cantaloupe, raw"),
        Melons_honeydew_raw("Melons, honeydew, raw"),
        Nectarines_raw("Nectarines, raw"),
        Olives_ripe_canned_jumbo_super_colossal("Olives, ripe, canned (jumbo-super colossal)"),
        Olives_ripe_canned_small_extra_large("Olives, ripe, canned (small-extra large)"),
        Orange_juice_raw("Orange juice, raw"),
        Oranges_raw_all_commercial_varieties("Oranges, raw, all commercial varieties"),
        Papayas_raw("Papayas, raw"),
        Peaches_yellow_raw("Peaches, yellow, raw"),
        Pears_asian_raw("Pears, asian, raw"),
        Pears_raw("Pears, raw"),
        Pineapple_raw_all_varieties("Pineapple, raw, all varieties"),
        Plums_raw("Plums, raw"),
        Pomegranate_juice_bottled("Pomegranate juice, bottled"),
        Pomegranates_raw("Pomegranates, raw"),
        Prickly_pears_raw("Prickly pears, raw"),
        Prune_juice_canned("Prune juice, canned"),
        Prune_puree("Prune puree"),
        Raisins_golden_seedless("Raisins, golden seedless"),
        Raisins_seedless("Raisins, seedless"),
        Raspberries_raw("Raspberries, raw"),
        Strawberries_frozen_unsweetened("Strawberries, frozen, unsweetened"),
        Strawberries_raw("Strawberries, raw"),
        Tamarinds_raw("Tamarinds, raw"),
        Tangerines_mandarin_oranges_raw("Tangerines, (mandarin oranges), raw"),
        USDA_Commodity_peaches_canned_light_syrup_drained("USDA Commodity peaches, canned, light syrup, drained"),
        USDA_Commodity_pears_canned_light_syrup_drained("USDA Commodity pears, canned, light syrup, drained"),
        Watermelon_raw("Watermelon, raw"),;

        private final String name;

        FRUITS_AND_FRUIT_JUICES(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum GLYCEMIC_INDEX_TEST_SET {

        Apples_raw_with_skin("Apples, raw, with skin"),
        Apricots_raw("Apricots, raw"),
        Bananas_raw("Bananas, raw"),
        Barley_pearled_cooked("Barley, pearled, cooked"),
        Beans_kidney_red_mature_seeds_cooked_boiled_without_salt("Beans, kidney, red, mature seeds, cooked, boiled, without salt"),
        Beans_pinto_mature_seeds_cooked_boiled_without_salt("Beans, pinto, mature seeds, cooked, boiled, without salt"),
        Beets_canned_drained_solids("Beets, canned, drained solids"),
        Bread_pita_white_enriched("Bread, pita, white, enriched"),
        Bread_rye("Bread, rye"),
        Bread_white_wheat("Bread, white wheat"),
        CAMPBELL_S_Tomato_juice("CAMPBELL'S, Tomato juice"),
        Carrot_juice_canned("Carrot juice, canned"),
        Carrots_cooked_boiled_drained_without_salt("Carrots, cooked, boiled, drained, without salt"),
        Carrots_raw("Carrots, raw"),
        Cereals_ready_to_eat_KELLOGG_KELLOGG_S_ALL_BRAN_Original("Cereals ready-to-eat, KELLOGG, KELLOGG'S ALL-BRAN Original"),
        Cereals_oats_regular_and_quick_not_fortified_dry("Cereals, oats, regular and quick, not fortified, dry"),
        Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids("Chickpeas (garbanzo beans, bengal gram), mature seeds, canned, drained solids"),
        Corn_sweet_white_cooked_boiled_drained_without_salt("Corn, sweet, white, cooked, boiled, drained, without salt"),
        Corn_sweet_yellow_cooked_boiled_drained_without_salt("Corn, sweet, yellow, cooked, boiled, drained, without salt"),
        Couscous_cooked("Couscous, cooked"),
        Glucose("Glucose"),
        Grapefruit_raw_pink_and_red_and_white_all_areas("Grapefruit, raw, pink and red and white, all areas"),
        Grapes_red_or_green_European_type_such_as_Thompson_seedless_raw("Grapes, red or green (European type, such as Thompson seedless), raw"),
        Hominy_canned_white("Hominy, canned, white"),
        Hominy_canned_yellow("Hominy, canned, yellow"),
        Honey("Honey"),
        Hummus_home_prepared("Hummus, home prepared"),
        Lentils_mature_seeds_cooked_boiled_without_salt("Lentils, mature seeds, cooked, boiled, without salt"),
        Mangos_raw("Mangos, raw"),
        Melons_cantaloupe_raw("Melons, cantaloupe, raw"),
        Milk_canned_condensed_sweetened("Milk, canned, condensed, sweetened"),
        Milk_nonfat_fluid_with_added_vitamin_A_and_vitamin_D_fat_free_or_skim("Milk, nonfat, fluid, with added vitamin A and vitamin D (fat free or skim)"),
        Millet_cooked("Millet, cooked"),
        Orange_juice_raw("Orange juice, raw"),
        Oranges_raw_all_commercial_varieties("Oranges, raw, all commercial varieties"),
        Papayas_raw("Papayas, raw"),
        Pasta_cooked_enriched_without_added_salt("Pasta, cooked, enriched, without added salt"),
        Peaches_yellow_raw("Peaches, yellow, raw"),
        Pears_raw("Pears, raw"),
        Peas_green_cooked_boiled_drained_without_salt("Peas, green, cooked, boiled, drained, without salt"),
        Pineapple_raw_all_varieties("Pineapple, raw, all varieties"),
        Plums_raw("Plums, raw"),
        Potatoes_white_flesh_and_skin_baked("Potatoes, white, flesh and skin, baked"),
        Pretzels_soft_unsalted("Pretzels, soft, unsalted"),
        Prickly_pears_raw("Prickly pears, raw"),
        Raisins_seedless("Raisins, seedless"),
        Rice_brown_long_grain_cooked("Rice, brown, long-grain, cooked"),
        Rice_brown_medium_grain_cooked("Rice, brown, medium-grain, cooked"),
        Rice_white_glutinous_unenriched_cooked("Rice, white, glutinous, unenriched, cooked"),
        Rice_white_long_grain_regular_enriched_cooked("Rice, white, long-grain, regular, enriched, cooked"),
        Rice_white_medium_grain_enriched_cooked("Rice, white, medium-grain, enriched, cooked"),
        Snacks_popcorn_air_popped_Unsalted("Snacks, popcorn, air-popped (Unsalted)"),
        Snacks_pretzels_hard_plain_salted("Snacks, pretzels, hard, plain, salted"),
        Snacks_tortilla_chips_light_baked_with_less_oil("Snacks, tortilla chips, light (baked with less oil)"),
        Snacks_tortilla_chips_low_fat_unsalted("Snacks, tortilla chips, low fat, unsalted"),
        Snacks_tortilla_chips_unsalted_white_corn("Snacks, tortilla chips, unsalted, white corn"),
        Soybeans_green_cooked_boiled_drained_without_salt("Soybeans, green, cooked, boiled, drained, without salt"),
        Soybeans_mature_cooked_boiled_without_salt("Soybeans, mature cooked, boiled, without salt"),
        Sugars_granulated("Sugars, granulated"),
        Sweet_potato_cooked_baked_in_skin_flesh_without_salt("Sweet potato, cooked, baked in skin, flesh, without salt"),
        USDA_Commodity_peaches_canned_light_syrup_drained("USDA Commodity peaches, canned, light syrup, drained"),
        Wild_rice_cooked("Wild rice, cooked"),
        Yam_cooked_boiled_drained_or_baked_without_salt("Yam, cooked, boiled, drained, or baked, without salt"),
        Yogurt_Greek_plain_nonfat("Yogurt, Greek, plain, nonfat"),;

        private final String name;

        GLYCEMIC_INDEX_TEST_SET(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum LEGUMES_AND_LEGUME_PRODUCTS {

        Beans_black_mature_seeds_cooked_boiled_without_salt("Beans, black, mature seeds, cooked, boiled, without salt"),
        Beans_black_mature_seeds_raw("Beans, black, mature seeds, raw"),
        Beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt("Beans, kidney, all types, mature seeds, cooked, boiled, without salt"),
        Beans_kidney_all_types_mature_seeds_raw("Beans, kidney, all types, mature seeds, raw"),
        Beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt("Beans, kidney, california red, mature seeds, cooked, boiled, without salt"),
        Beans_kidney_california_red_mature_seeds_raw("Beans, kidney, california red, mature seeds, raw"),
        Beans_kidney_red_mature_seeds_cooked_boiled_without_salt("Beans, kidney, red, mature seeds, cooked, boiled, without salt"),
        Beans_kidney_red_mature_seeds_raw("Beans, kidney, red, mature seeds, raw"),
        Beans_pinto_mature_seeds_cooked_boiled_without_salt("Beans, pinto, mature seeds, cooked, boiled, without salt"),
        Beans_pinto_mature_seeds_raw("Beans, pinto, mature seeds, raw"),
        Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids("Chickpeas (garbanzo beans, bengal gram), mature seeds, canned, drained solids"),
        Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt("Chickpeas (garbanzo beans, bengal gram), mature seeds, cooked, boiled, without salt"),
        Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw("Chickpeas (garbanzo beans, bengal gram), mature seeds, raw"),
        Hummus_home_prepared("Hummus, home prepared"),
        Lentils_mature_seeds_cooked_boiled_with_salt("Lentils, mature seeds, cooked, boiled, with salt"),
        Lentils_mature_seeds_cooked_boiled_without_salt("Lentils, mature seeds, cooked, boiled, without salt"),
        Lentils_raw("Lentils, raw"),
        Peanut_butter_chunk_style_with_salt("Peanut butter, chunk style, with salt"),
        Peanut_butter_chunk_style_without_salt("Peanut butter, chunk style, without salt"),
        Peanuts_all_types_dry_roasted_without_salt("Peanuts, all types, dry-roasted, without salt"),
        Peas_green_split_mature_seeds_raw("Peas, green, split, mature seeds, raw"),
        Peas_split_mature_seeds_cooked_boiled_without_salt("Peas, split, mature seeds, cooked, boiled, without salt"),
        Soy_meal_defatted_raw("Soy meal, defatted, raw"),
        Soy_protein_isolate("Soy protein isolate"),
        Soybeans_mature_cooked_boiled_without_salt("Soybeans, mature cooked, boiled, without salt"),
        Soybeans_mature_seeds_raw("Soybeans, mature seeds, raw"),;

        private final String name;

        LEGUMES_AND_LEGUME_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum NUT_AND_SEED_PRODUCTS {

        Nuts_almonds("Nuts, almonds"),
        Nuts_almonds_dry_roasted_without_salt_added("Nuts, almonds, dry roasted, without salt added"),
        Nuts_almonds_honey_roasted_unblanched("Nuts, almonds, honey roasted, unblanched"),
        Nuts_cashew_butter_plain_without_salt_added("Nuts, cashew butter, plain, without salt added"),
        Nuts_cashew_nuts_dry_roasted_without_salt_added("Nuts, cashew nuts, dry roasted, without salt added"),
        Nuts_cashew_nuts_raw("Nuts, cashew nuts, raw"),
        Nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added("Nuts, hazelnuts or filberts, dry roasted, without salt added"),
        Nuts_macadamia_nuts_dry_roasted_without_salt_added("Nuts, macadamia nuts, dry roasted, without salt added"),
        Nuts_macadamia_nuts_raw("Nuts, macadamia nuts, raw"),
        Nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_PLANTERS_pistachio_blend("Nuts, mixed nuts, dry roasted, with peanuts, salt added, PLANTERS pistachio blend"),
        Nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added("Nuts, mixed nuts, dry roasted, with peanuts, without salt added"),
        Nuts_pecans("Nuts, pecans"),
        Nuts_pecans_dry_roasted_without_salt_added("Nuts, pecans, dry roasted, without salt added"),
        Nuts_pistachio_nuts_dry_roasted_without_salt_added("Nuts, pistachio nuts, dry roasted, without salt added"),
        Nuts_pistachio_nuts_raw("Nuts, pistachio nuts, raw"),
        Nuts_walnuts_dry_roasted_with_salt_added("Nuts, walnuts, dry roasted, with salt added"),
        Nuts_walnuts_english("Nuts, walnuts, english"),
        Seeds_flaxseed("Seeds, flaxseed"),
        Seeds_flaxseed_EFAs("Seeds, flaxseed (EFAs)"),
        Seeds_sunflower_seed_kernels_dry_roasted_without_salt("Seeds, sunflower seed kernels, dry roasted, without salt"),
        Seeds_sunflower_seed_kernels_toasted_without_salt("Seeds, sunflower seed kernels, toasted, without salt"),;

        private final String name;

        NUT_AND_SEED_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum OMEGA3 {

        Fish_oil_cod_liver("Fish oil, cod liver"),
        Fish_oil_herring("Fish oil, herring"),
        Fish_oil_menhaden("Fish oil, menhaden"),
        Fish_oil_salmon("Fish oil, salmon"),
        Fish_oil_sardine("Fish oil, sardine"),
        Oil_flaxseed_cold_pressed("Oil, flaxseed, cold pressed"),
        Seeds_flaxseed_EFAs("Seeds, flaxseed (EFAs)"),;

        private final String name;

        OMEGA3(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum PORK_PRODUCTS {

        Pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted("Pork, fresh, loin, tenderloin, separable lean only, cooked, roasted"),
        Pork_fresh_loin_tenderloin_separable_lean_only_raw("Pork, fresh, loin, tenderloin, separable lean only, raw"),
        Pork_ground_96_lean_4_fat_cooked_pan_broiled("Pork, ground, 96% lean / 4% fat, cooked, pan-broiled"),
        Pork_ground_96_lean_4_fat_raw("Pork, ground, 96% lean / 4% fat, raw"),;

        private final String name;

        PORK_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum POULTRY_PRODUCTS {

        Chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw("Chicken, broiler or fryers, breast, skinless, boneless, meat only, raw"),
        Chicken_broilers_or_fryers_breast_meat_only_cooked_roasted("Chicken, broilers or fryers, breast, meat only, cooked, roasted"),
        Ground_turkey_fat_free_raw("Ground turkey, fat free, raw"),
        Turkey_breast_from_whole_bird_non_enhanced_meat_only_raw("Turkey, breast, from whole bird, non-enhanced, meat only, raw"),
        Turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted("Turkey, breast, from whole bird, non-enhanced, meat only, roasted"),;

        private final String name;

        POULTRY_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum PROTEIN_POWDERS {

        Egg_white_dried("Egg, white, dried"),
        Soy_protein_isolate("Soy protein isolate"),
        Whey_Protein_Concentrate("Whey Protein Concentrate"),;

        private final String name;

        PROTEIN_POWDERS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum SAUSAGES_AND_LUNCHEON_MEATS {

        Chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged("Chicken breast, deli, rotisserie seasoned, sliced, prepackaged"),
        Chicken_breast_fat_free_mesquite_flavor_sliced("Chicken breast, fat-free, mesquite flavor, sliced"),
        Chicken_breast_oven_roasted_fat_free_sliced("Chicken breast, oven-roasted, fat-free, sliced"),
        Frankfurter_beef_pork_and_turkey_fat_free("Frankfurter, beef, pork, and turkey, fat free"),
        Ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added("Ham, sliced, pre-packaged, deli meat (96%fat free, water added)"),
        OSCAR_MAYER_Chicken_Breast_honey_glazed("OSCAR MAYER, Chicken Breast (honey glazed)"),
        Pastrami_beef_98_fat_free("Pastrami, beef, 98% fat-free"),
        Turkey_breast_smoked_lemon_pepper_flavor_97_fat_free("Turkey, breast, smoked, lemon pepper flavor, 97% fat-free"),;

        private final String name;

        SAUSAGES_AND_LUNCHEON_MEATS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum SNACKS {

        Pretzels_soft_unsalted("Pretzels, soft, unsalted"),
        Snacks_pita_chips_salted("Snacks, pita chips, salted"),
        Snacks_popcorn_air_popped_Unsalted("Snacks, popcorn, air-popped (Unsalted)"),
        Snacks_popcorn_microwave_94_fat_free("Snacks, popcorn, microwave, 94% fat free"),
        Snacks_pretzels_hard_plain_salted("Snacks, pretzels, hard, plain, salted"),
        Snacks_rice_cakes_brown_rice_multigrain_unsalted("Snacks, rice cakes, brown rice, multigrain, unsalted"),
        Snacks_rice_cakes_brown_rice_plain_unsalted("Snacks, rice cakes, brown rice, plain, unsalted"),
        Snacks_sweet_potato_chips_unsalted("Snacks, sweet potato chips, unsalted"),
        Snacks_tortilla_chips_light_baked_with_less_oil("Snacks, tortilla chips, light (baked with less oil)"),
        Snacks_tortilla_chips_low_fat_unsalted("Snacks, tortilla chips, low fat, unsalted"),
        Snacks_tortilla_chips_unsalted_white_corn("Snacks, tortilla chips, unsalted, white corn"),
        Snacks_trail_mix_regular("Snacks, trail mix, regular"),
        Snacks_trail_mix_regular_unsalted("Snacks, trail mix, regular, unsalted"),;

        private final String name;

        SNACKS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum SPICES_AND_HERBS {

        Salt_table("Salt, table"),
        Spices_pepper_black("Spices, pepper, black"),
        Vinegar_balsamic("Vinegar, balsamic"),;

        private final String name;

        SPICES_AND_HERBS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum SUPPLEMENTS {

        Generic_Multivitamin("Generic Multivitamin"),
        Glucose("Glucose"),;

        private final String name;

        SUPPLEMENTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum SWEETS {

        Chewing_gum_sugarless("Chewing gum, sugarless"),
        Chocolate_dark_45_59_cacao_solids("Chocolate, dark, 45- 59% cacao solids"),
        Chocolate_dark_60_69_cacao_solids("Chocolate, dark, 60-69% cacao solids"),
        Chocolate_dark_70_85_cacao_solids("Chocolate, dark, 70-85% cacao solids"),
        Cocoa_dry_powder_unsweetened("Cocoa, dry powder, unsweetened"),
        Cocoa_dry_powder_unsweetened_HERSHEY_S_European_Style_Cocoa("Cocoa, dry powder, unsweetened, HERSHEY'S European Style Cocoa"),
        Cocoa_dry_powder_unsweetened_processed_with_alkali("Cocoa, dry powder, unsweetened, processed with alkali"),
        Honey("Honey"),
        Sugars_granulated("Sugars, granulated"),
        Sweetener_herbal_extract_powder_from_Stevia_leaf("Sweetener, herbal extract powder from Stevia leaf"),
        Sweeteners_tabletop_aspartame_EQUAL_packets("Sweeteners, tabletop, aspartame, EQUAL, packets"),
        Sweeteners_tabletop_saccharin_sodium_saccharin("Sweeteners, tabletop, saccharin (sodium saccharin)"),
        Sweeteners_tabletop_sucralose_SPLENDA_packets("Sweeteners, tabletop, sucralose, SPLENDA packets"),
        Syrups_sugar_free("Syrups, sugar free"),;

        private final String name;

        SWEETS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

    public enum VEGETABLES_AND_VEGETABLE_PRODUCTS {

        Asparagus_cooked_boiled_drained("Asparagus, cooked, boiled, drained"),
        Asparagus_raw("Asparagus, raw"),
        Beets_canned_drained_solids("Beets, canned, drained solids"),
        Beets_cooked_boiled_drained("Beets, cooked, boiled, drained"),
        Beets_raw("Beets, raw"),
        Broccoli_cooked_boiled_drained_without_salt("Broccoli, cooked, boiled, drained, without salt"),
        Broccoli_raw("Broccoli, raw"),
        CAMPBELL_S_Tomato_juice("CAMPBELL'S, Tomato juice"),
        CAMPBELL_S_Tomato_juice_low_sodium("CAMPBELL'S, Tomato juice, low sodium"),
        CAMPBELL_S_V8_100_Vegetable_Juice("CAMPBELL'S, V8 100% Vegetable Juice"),
        CAMPBELL_S_V8_Vegetable_Juice_Essential_Antioxidants_V8("CAMPBELL'S, V8 Vegetable Juice, Essential Antioxidants V8"),
        CAMPBELL_S_V8_Vegetable_Juice_Spicy_Hot_V8("CAMPBELL'S, V8 Vegetable Juice, Spicy Hot V8"),
        Cabbage_cooked_boiled_drained_without_salt("Cabbage, cooked, boiled, drained, without salt"),
        Cabbage_raw("Cabbage, raw"),
        Cabbage_red_cooked_boiled_drained_without_salt("Cabbage, red, cooked, boiled, drained, without salt"),
        Cabbage_red_raw("Cabbage, red, raw"),
        Carrot_juice_canned("Carrot juice, canned"),
        Carrots_baby_raw("Carrots, baby, raw"),
        Carrots_cooked_boiled_drained_without_salt("Carrots, cooked, boiled, drained, without salt"),
        Carrots_raw("Carrots, raw"),
        Catsup("Catsup"),
        Catsup_low_sodium("Catsup, low sodium"),
        Cauliflower_cooked_boiled_drained_without_salt("Cauliflower, cooked, boiled, drained, without salt"),
        Cauliflower_frozen_cooked_boiled_drained_without_salt("Cauliflower, frozen, cooked, boiled, drained, without salt"),
        Cauliflower_frozen_unprepared("Cauliflower, frozen, unprepared"),
        Cauliflower_raw("Cauliflower, raw"),
        Celery_cooked_boiled_drained_without_salt("Celery, cooked, boiled, drained, without salt"),
        Celery_raw("Celery, raw"),
        Coriander_cilantro_leaves_raw("Coriander (cilantro) leaves, raw"),
        Corn_sweet_white_cooked_boiled_drained_without_salt("Corn, sweet, white, cooked, boiled, drained, without salt"),
        Corn_sweet_white_raw("Corn, sweet, white, raw"),
        Corn_sweet_yellow_cooked_boiled_drained_without_salt("Corn, sweet, yellow, cooked, boiled, drained, without salt"),
        Corn_sweet_yellow_raw("Corn, sweet, yellow, raw"),
        Cucumber_peeled_raw("Cucumber, peeled, raw"),
        Cucumber_with_peel_raw("Cucumber, with peel, raw"),
        Edamame_frozen_prepared("Edamame, frozen, prepared"),
        Garlic_raw("Garlic, raw"),
        Ginger_root_raw("Ginger root, raw"),
        Kale_cooked_boiled_drained_without_salt("Kale, cooked, boiled, drained, without salt"),
        Kale_raw("Kale, raw"),
        Lettuce_cos_or_romaine_raw("Lettuce, cos or romaine, raw"),
        Lettuce_green_leaf_raw("Lettuce, green leaf, raw"),
        Lettuce_iceberg_includes_crisphead_types_raw("Lettuce, iceberg (includes crisphead types), raw"),
        Lettuce_red_leaf_raw("Lettuce, red leaf, raw"),
        Mushrooms_portabella_grilled("Mushrooms, portabella, grilled"),
        Mushrooms_portabella_raw("Mushrooms, portabella, raw"),
        Mushrooms_shiitake_raw("Mushrooms, shiitake, raw"),
        Mushrooms_shiitake_stir_fried("Mushrooms, shiitake, stir-fried"),
        Mushrooms_white_raw("Mushrooms, white, raw"),
        Mushrooms_white_stir_fried("Mushrooms, white, stir-fried"),
        Nopales_cooked_without_salt("Nopales, cooked, without salt"),
        Nopales_raw("Nopales, raw"),
        Okra_cooked_boiled_drained_without_salt("Okra, cooked, boiled, drained, without salt"),
        Okra_raw("Okra, raw"),
        Onions_cooked_boiled_drained_without_salt("Onions, cooked, boiled, drained, without salt"),
        Onions_raw("Onions, raw"),
        Peas_and_carrots_frozen_cooked_boiled_drained_without_salt("Peas and carrots, frozen, cooked, boiled, drained, without salt"),
        Peas_and_carrots_frozen_unprepared("Peas and carrots, frozen, unprepared"),
        Peas_green_cooked_boiled_drained_without_salt("Peas, green, cooked, boiled, drained, without salt"),
        Peas_green_frozen_cooked_boiled_drained_without_salt("Peas, green, frozen, cooked, boiled, drained, without salt"),
        Peas_green_frozen_unprepared("Peas, green, frozen, unprepared"),
        Peas_green_raw("Peas, green, raw"),
        Peppers_jalapeno_raw("Peppers, jalapeno, raw"),
        Peppers_serrano_raw("Peppers, serrano, raw"),
        Peppers_sweet_green_raw("Peppers, sweet, green, raw"),
        Peppers_sweet_red_raw("Peppers, sweet, red, raw"),
        Potatoes_baked_flesh_and_skin_without_salt("Potatoes, baked, flesh and skin, without salt"),
        Potatoes_boiled_cooked_in_skin_flesh_without_salt("Potatoes, boiled, cooked in skin, flesh, without salt"),
        Potatoes_flesh_and_skin_raw("Potatoes, flesh and skin, raw"),
        Potatoes_microwaved_cooked_in_skin_skin_without_salt("Potatoes, microwaved, cooked in skin, skin, without salt"),
        Potatoes_raw_skin("Potatoes, raw, skin"),
        Potatoes_red_flesh_and_skin_raw("Potatoes, red, flesh and skin, raw"),
        Potatoes_russet_flesh_and_skin_raw("Potatoes, russet, flesh and skin, raw"),
        Potatoes_white_flesh_and_skin_baked("Potatoes, white, flesh and skin, baked"),
        Potatoes_white_flesh_and_skin_raw("Potatoes, white, flesh and skin, raw"),
        Radishes_raw("Radishes, raw"),
        Soybeans_green_cooked_boiled_drained_without_salt("Soybeans, green, cooked, boiled, drained, without salt"),
        Soybeans_green_raw("Soybeans, green, raw"),
        Soybeans_mature_seeds_sprouted_cooked_steamed("Soybeans, mature seeds, sprouted, cooked, steamed"),
        Spinach_canned_regular_pack_drained_solids("Spinach, canned, regular pack, drained solids"),
        Spinach_cooked_boiled_drained_without_salt("Spinach, cooked, boiled, drained, without salt"),
        Spinach_raw("Spinach, raw"),
        Squash_summer_all_varieties_cooked_boiled_drained_without_salt("Squash, summer, all varieties, cooked, boiled, drained, without salt"),
        Squash_summer_all_varieties_raw("Squash, summer, all varieties, raw"),
        Squash_summer_zucchini_includes_skin_raw("Squash, summer, zucchini, includes skin, raw"),
        Squash_winter_all_varieties_raw("Squash, winter, all varieties, raw"),
        Sweet_potato_canned_syrup_pack_drained_solids("Sweet potato, canned, syrup pack, drained solids"),
        Sweet_potato_cooked_baked_in_skin_flesh_without_salt("Sweet potato, cooked, baked in skin, flesh, without salt"),
        Sweet_potato_raw_unprepared("Sweet potato, raw, unprepared"),
        Tomatillos_raw("Tomatillos, raw"),
        Tomato_products_canned_paste_without_salt_added("Tomato products, canned, paste, without salt added"),
        Tomato_products_canned_puree_without_salt_added("Tomato products, canned, puree, without salt added"),
        Tomato_products_canned_sauce("Tomato products, canned, sauce"),
        Tomatoes_red_ripe_raw_year_round_average("Tomatoes, red, ripe, raw, year round average"),
        Vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added("Vegetables, mixed (corn, lima beans, peas, green beans, carrots) canned, no salt added"),
        Vegetables_mixed_canned_drained_solids("Vegetables, mixed, canned, drained solids"),
        Vegetables_mixed_frozen_unprepared("Vegetables, mixed, frozen, unprepared"),
        Yam_cooked_boiled_drained_or_baked_without_salt("Yam, cooked, boiled, drained, or baked, without salt"),
        Yam_raw("Yam, raw"),
        Yambean_jicama_raw("Yambean (jicama), raw"),;

        private final String name;

        VEGETABLES_AND_VEGETABLE_PRODUCTS(String name) {
            this.name = name;
        }

        public String get_name() {
            return name;
        }
    }

}
