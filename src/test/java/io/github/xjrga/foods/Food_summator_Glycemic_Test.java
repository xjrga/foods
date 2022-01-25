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
package io.github.xjrga.foods;

import io.github.xjrga.foods.data.Baked_products.Bread_pita_white_enriched;
import io.github.xjrga.foods.data.Baked_products.Bread_rye;
import io.github.xjrga.foods.data.Baked_products.Bread_white_wheat;
import io.github.xjrga.foods.data.Breakfast_cereals.Cereals_oats_regular_and_quick_not_fortified_dry;
import io.github.xjrga.foods.data.Breakfast_cereals.Cereals_ready_to_eat_kellogg_kelloggs_all_bran_original;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Barley_pearled_cooked;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Couscous_cooked;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Hominy_canned_white;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Hominy_canned_yellow;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Millet_cooked;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Pasta_cooked_enriched_without_added_salt;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Rice_brown_long_grain_cooked;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Rice_brown_medium_grain_cooked;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Rice_white_glutinous_unenriched_cooked;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Rice_white_long_grain_regular_enriched_cooked;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Rice_white_medium_grain_enriched_cooked;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta.Wild_rice_cooked;
import io.github.xjrga.foods.data.Dairy_and_egg_products.Milk_canned_condensed_sweetened;
import io.github.xjrga.foods.data.Dairy_and_egg_products.Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim;
import io.github.xjrga.foods.data.Dairy_and_egg_products.Yogurt_greek_plain_nonfat;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Apples_raw_with_skin;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Apricots_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Bananas_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Grapefruit_raw_pink_and_red_and_white_all_areas;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Grapes_red_or_green_european_type_such_as_thompson_seedless_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Mangos_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Melons_cantaloupe_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Orange_juice_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Oranges_raw_all_commercial_varieties;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Papayas_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Peaches_yellow_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Pears_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Pineapple_raw_all_varieties;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Plums_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Prickly_pears_raw;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Raisins_seedless;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Usda_commodity_peaches_canned_light_syrup_drained;
import io.github.xjrga.foods.data.Legumes_and_legume_products.Beans_kidney_red_mature_seeds_cooked_boiled_without_salt;
import io.github.xjrga.foods.data.Legumes_and_legume_products.Beans_pinto_mature_seeds_cooked_boiled_without_salt;
import io.github.xjrga.foods.data.Legumes_and_legume_products.Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids;
import io.github.xjrga.foods.data.Legumes_and_legume_products.Hummus_home_prepared;
import io.github.xjrga.foods.data.Legumes_and_legume_products.Lentils_mature_seeds_cooked_boiled_without_salt;
import io.github.xjrga.foods.data.Legumes_and_legume_products.Soybeans_mature_cooked_boiled_without_salt;
import io.github.xjrga.foods.data.Snacks.Pretzels_soft_unsalted;
import io.github.xjrga.foods.data.Snacks.Snacks_popcorn_air_popped_unsalted;
import io.github.xjrga.foods.data.Snacks.Snacks_pretzels_hard_plain_salted;
import io.github.xjrga.foods.data.Snacks.Snacks_tortilla_chips_light_baked_with_less_oil;
import io.github.xjrga.foods.data.Snacks.Snacks_tortilla_chips_low_fat_unsalted;
import io.github.xjrga.foods.data.Snacks.Snacks_tortilla_chips_unsalted_white_corn;
import io.github.xjrga.foods.data.Supplements.Glucose;
import io.github.xjrga.foods.data.Sweets.Honey;
import io.github.xjrga.foods.data.Sweets.Sugars_granulated;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Beets_canned_drained_solids;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Campbells_tomato_juice;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Carrot_juice_canned;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Carrots_cooked_boiled_drained_without_salt;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Carrots_raw;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Corn_sweet_white_cooked_boiled_drained_without_salt;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Corn_sweet_yellow_cooked_boiled_drained_without_salt;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Peas_green_cooked_boiled_drained_without_salt;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Potatoes_white_flesh_and_skin_baked;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Soybeans_green_cooked_boiled_drained_without_salt;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Sweet_potato_cooked_baked_in_skin_flesh_without_salt;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Yam_cooked_boiled_drained_or_baked_without_salt;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summator_Glycemic_Test {

    private static Interface_food summator;

    public Food_summator_Glycemic_Test() {
    }

    @BeforeClass
    public static void one_time_setup() {
        ArrayList<Interface_food> list_01 = new ArrayList();
        Interface_food apples = new Apples_raw_with_skin();
        Interface_food bananas = new Bananas_raw();
        Interface_food oats = new Cereals_oats_regular_and_quick_not_fortified_dry();
        Interface_food honey = new Honey();
        Food_multiplier m_apples = new Food_multiplier(apples, 500.0);
        Food_multiplier m_bananas = new Food_multiplier(bananas, 500.0);
        Food_multiplier m_oats = new Food_multiplier(oats, 500.0);
        Food_multiplier m_honey = new Food_multiplier(honey, 500.0);
        list_01.add(m_apples);
        list_01.add(m_bananas);
        list_01.add(m_oats);
        list_01.add(m_honey);
        summator = new Food_summator(list_01, "Total");
    }

    //food_name
    @Test
    public void test_food_name() {
        assertEquals("Total", summator.get_food_name());
    }

    //food_label
    @Test
    public void test_food_label() {
        assertEquals("Total", summator.get_food_label());
    }

    //Alcohol, ethyl (g)
    @Test
    public void test_alcohol() {
        assertEquals(0.0, summator.get_alcohol_in_grams(), 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test
    public void test_alpha_linolenic_acid() {
        assertEquals(0.0, summator.get_alpha_linolenic_acid_in_grams(), 0.00001);
    }

    //calcium
    @Test
    public void test_calcium() {
        assertEquals(345.00000, summator.get_calcium_in_milligrams(), 0.00001);
    }

    //carbohydrate_by_difference
    @Test
    public void test_carbohydrate_by_difference() {
        assertEquals(933.75000, summator.get_carbohydrate_by_difference_in_grams(), 0.00001);
    }

    //cholesterol
    @Test
    public void test_cholesterol() {
        assertEquals(0.0, summator.get_cholesterol_in_milligrams(), 0.00001);
    }

    //choline
    @Test
    public void test_choline() {
        assertEquals(279.00000, summator.get_choline_in_milligrams(), 0.00001);
    }

    //complete_protein
    @Test
    public void test_complete_protein() {
        assertEquals(0.0, summator.get_complete_protein_in_grams(), 0.00001);
    }

    //copper
    @Test
    public void test_copper() {
        assertEquals(2.66000, summator.get_copper_in_milligrams(), 0.00001);
    }

    //cost
    @Test
    public void test_cost() {
        assertEquals(0.0, summator.get_cost_in_dollars(), 0.00001);
    }

    //dha
    @Test
    public void test_dha() {
        assertEquals(0.0, summator.get_dha_in_grams(), 0.00001);
    }

    //epa
    @Test
    public void test_epa() {
        assertEquals(0.0, summator.get_epa_in_grams(), 0.00001);
    }

    //fat
    @Test
    public void test_fat() {
        assertEquals(35.10000, summator.get_fat_in_grams(), 0.00001);
    }

    //fiber
    @Test
    public void test_fiber() {
        assertEquals(76.50000, summator.get_fiber_in_grams(), 0.00001);
    }

    //fluoride
    @Test
    public void test_fluoride() {
        assertEquals(62.50000, summator.get_fluoride_in_micrograms(), 0.00001);
    }

    //folate
    @Test
    public void test_folate() {
        assertEquals(285.00000, summator.get_folate_in_micrograms(), 0.00001);
    }

    //glycemic_index
    @Test
    public void test_glycemic_index() {
        assertEquals(56.8740740740741, summator.get_glycemic_index(), 0.00001);
    }

    //energy_gross
    @Test
    public void test_energy_gross() {
        assertEquals(4120.00000, summator.get_energy_gross_in_kilocalories(), 0.00001);
    }

    //iron
    @Test
    public void test_iron() {
        assertEquals(25.25000, summator.get_iron_in_milligrams(), 0.00001);
    }

    //linoleic_acid
    @Test
    public void test_linoleic_acid() {
        assertEquals(0.0, summator.get_linoleic_acid_in_grams(), 0.00001);
    }

    //magnesium
    @Test
    public void test_magnesium() {
        assertEquals(860.00000, summator.get_magnesium_in_milligrams(), 0.00001);
    }

    //manganese
    @Test
    public void test_manganese() {
        assertEquals(20.07500, summator.get_manganese_in_milligrams(), 0.00001);
    }

    //monounsaturated_fat
    @Test
    public void test_monounsaturated_fat() {
        assertEquals(10.09500, summator.get_monounsaturated_fat_in_grams(), 0.00001);
    }

    //niacin
    @Test
    public void test_niacin() {
        assertEquals(10.01000, summator.get_niacin_in_milligrams(), 0.00001);
    }

    //pantothenic_acid
    @Test
    public void test_pantothenic_acid() {
        assertEquals(7.91500, summator.get_pantothenic_acid_in_milligrams(), 0.00001);
    }

    //phosphorus
    @Test
    public void test_phosphorus() {
        assertEquals(2235.00000, summator.get_phosphorus_in_milligrams(), 0.00001);
    }

    //polyunsaturated_fat
    @Test
    public void test_polyunsaturated_fat() {
        assertEquals(12.12000, summator.get_polyunsaturated_fat_in_grams(), 0.00001);
    }

    //potassium
    @Test
    public void test_potassium() {
        assertEquals(4395.00000, summator.get_potassium_in_milligrams(), 0.00001);
    }

    //protein
    @Test
    public void test_protein() {
        assertEquals(74.00000, summator.get_protein_in_grams(), 0.00001);
    }

    //riboflavin
    @Test
    public void test_riboflavin() {
        assertEquals(1.46000, summator.get_riboflavin_in_milligrams(), 0.00001);
    }

    //saturated_fat
    @Test
    public void test_saturated_fat() {
        assertEquals(6.25000, summator.get_saturated_fat_in_grams(), 0.00001);
    }

    //selenium
    @Test
    public void test_selenium() {
        assertEquals(153.50000, summator.get_selenium_in_micrograms(), 0.00001);
    }

    //sodium
    @Test
    public void test_sodium() {
        assertEquals(60.00000, summator.get_sodium_in_milligrams(), 0.00001);
    }

    //thiamin
    @Test
    public void test_thiamin() {
        assertEquals(2.54000, summator.get_thiamin_in_milligrams(), 0.00001);
    }

    //vitamin_a
    @Test
    public void test_vitamin_a() {
        assertEquals(30.00000, summator.get_vitamin_a_in_micrograms(), 0.00001);
    }

    //vitamin_b12
    @Test
    public void test_vitamin_b12() {
        assertEquals(0.0, summator.get_vitamin_b12_in_micrograms(), 0.00001);
    }

    //vitamin_b6
    @Test
    public void test_vitamin_b6() {
        assertEquals(2.66000, summator.get_vitamin_b6_in_milligrams(), 0.00001);
    }

    //vitamin_c
    @Test
    public void test_vitamin_c() {
        assertEquals(69.00000, summator.get_vitamin_c_in_milligrams(), 0.00001);
    }

    //vitamin_d
    @Test
    public void test_vitamin_d() {
        assertEquals(0.0, summator.get_vitamin_d_in_micrograms(), 0.00001);
    }

    //vitamin_e
    @Test
    public void test_vitamin_e() {
        assertEquals(3.50000, summator.get_vitamin_e_in_milligrams(), 0.00001);
    }

    //vitamin_k
    @Test
    public void test_vitamin_k() {
        assertEquals(23.50000, summator.get_vitamin_k_in_micrograms(), 0.00001);
    }

    //water
    @Test
    public void test_water() {
        assertEquals(942.05000, summator.get_water_in_grams(), 0.00001);
    }

    //weight
    @Test
    public void test_weight() {
        assertEquals(2000.0, summator.get_weight_in_grams(), 0.00001);
    }

    //zinc
    @Test
    public void test_zinc() {
        assertEquals(20.25000, summator.get_zinc_in_milligrams(), 0.00001);
    }

    //glycemic load
    @Test
    public void test_glycemic_load() {
        assertEquals(487.55300, summator.get_glycemic_load(), 0.00001);
    }

    //energy_alcohol
    @Test
    public void test_energy_alcohol() {
        assertEquals(0.0, summator.get_energy_alcohol_in_kilocalories(), 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test
    public void test_energy_digestible_carbohydrate() {
        assertEquals(3268.74000, summator.get_energy_digestible_carbohydrate_in_kilocalories(), 0.00001);
    }

    //energy_digestible
    @Test
    public void test_energy_digestible() {
        assertEquals(3817.74200, summator.get_energy_digestible_in_kilocalories(), 0.00001);
    }

    //energy_fat
    @Test
    public void test_energy_fat() {
        assertEquals(293.78700, summator.get_energy_fat_in_kilocalories(), 0.00001);
    }

    //energy_protein
    @Test
    public void test_energy_protein() {
        assertEquals(255.21500, summator.get_energy_protein_in_kilocalories(), 0.00001);
    }

    //digestible_carbohydrate
    @Test
    public void test_digestible_carbohydrate() {
        assertEquals(857.25000, summator.get_digestible_carbohydrate_in_grams(), 0.00001);
    }

    //food_quotient
    @Test
    public void test_food_quotient() {
        assertEquals(0.964982159611624, summator.get_food_quotient(), 0.00001);
    }
}

//Glycemic test set
//Interface_food food = new Apples_raw_with_skin();
//Interface_food food = new Apricots_raw();
//Interface_food food = new Bananas_raw();
//Interface_food food = new Barley_pearled_cooked();
//Interface_food food = new Beans_kidney_red_mature_seeds_cooked_boiled_without_salt();
//Interface_food food = new Beans_pinto_mature_seeds_cooked_boiled_without_salt();
//Interface_food food = new Beets_canned_drained_solids();
//Interface_food food = new Bread_pita_white_enriched();
//Interface_food food = new Bread_rye();
//Interface_food food = new Bread_white_wheat();
//Interface_food food = new Campbells_tomato_juice();
//Interface_food food = new Carrot_juice_canned();
//Interface_food food = new Carrots_cooked_boiled_drained_without_salt();
//Interface_food food = new Carrots_raw();
//Interface_food food = new Cereals_oats_regular_and_quick_not_fortified_dry();
//Interface_food food = new Cereals_ready_to_eat_kellogg_kelloggs_all_bran_original();
//Interface_food food = new Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids();
//Interface_food food = new Corn_sweet_white_cooked_boiled_drained_without_salt();
//Interface_food food = new Corn_sweet_yellow_cooked_boiled_drained_without_salt();
//Interface_food food = new Couscous_cooked();
//Interface_food food = new Glucose();
//Interface_food food = new Grapefruit_raw_pink_and_red_and_white_all_areas();
//Interface_food food = new Grapes_red_or_green_european_type_such_as_thompson_seedless_raw();
//Interface_food food = new Hominy_canned_white();
//Interface_food food = new Hominy_canned_yellow();
//Interface_food food = new Honey();
//Interface_food food = new Hummus_home_prepared();
//Interface_food food = new Lentils_mature_seeds_cooked_boiled_without_salt();
//Interface_food food = new Mangos_raw();
//Interface_food food = new Melons_cantaloupe_raw();
//Interface_food food = new Milk_canned_condensed_sweetened();
//Interface_food food = new Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim();
//Interface_food food = new Millet_cooked();
//Interface_food food = new Orange_juice_raw();
//Interface_food food = new Oranges_raw_all_commercial_varieties();
//Interface_food food = new Papayas_raw();
//Interface_food food = new Pasta_cooked_enriched_without_added_salt();
//Interface_food food = new Peaches_yellow_raw();
//Interface_food food = new Pears_raw();
//Interface_food food = new Peas_green_cooked_boiled_drained_without_salt();
//Interface_food food = new Pineapple_raw_all_varieties();
//Interface_food food = new Plums_raw();
//Interface_food food = new Potatoes_white_flesh_and_skin_baked();
//Interface_food food = new Pretzels_soft_unsalted();
//Interface_food food = new Prickly_pears_raw();
//Interface_food food = new Raisins_seedless();
//Interface_food food = new Rice_brown_long_grain_cooked();
//Interface_food food = new Rice_brown_medium_grain_cooked();
//Interface_food food = new Rice_white_glutinous_unenriched_cooked();
//Interface_food food = new Rice_white_long_grain_regular_enriched_cooked();
//Interface_food food = new Rice_white_medium_grain_enriched_cooked();
//Interface_food food = new Snacks_popcorn_air_popped_unsalted();
//Interface_food food = new Snacks_pretzels_hard_plain_salted();
//Interface_food food = new Snacks_tortilla_chips_light_baked_with_less_oil();
//Interface_food food = new Snacks_tortilla_chips_low_fat_unsalted();
//Interface_food food = new Snacks_tortilla_chips_unsalted_white_corn();
//Interface_food food = new Soybeans_green_cooked_boiled_drained_without_salt();
//Interface_food food = new Soybeans_mature_cooked_boiled_without_salt();
//Interface_food food = new Sugars_granulated();
//Interface_food food = new Sweet_potato_cooked_baked_in_skin_flesh_without_salt();
//Interface_food food = new Usda_commodity_peaches_canned_light_syrup_drained();
//Interface_food food = new Wild_rice_cooked();
//Interface_food food = new Yam_cooked_boiled_drained_or_baked_without_salt();
//Interface_food food = new Yogurt_greek_plain_nonfat();
