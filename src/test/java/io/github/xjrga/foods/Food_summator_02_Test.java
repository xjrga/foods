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

import io.github.xjrga.foods.data.finfish_and_shellfish_products.Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone;
import io.github.xjrga.foods.data.glycemic_index_test_set.Honey;
import io.github.xjrga.foods.data.glycemic_index_test_set.Yogurt_greek_plain_nonfat;
import io.github.xjrga.foods.data.vegetables_and_vegetable_products.Tomato_products_canned_puree_without_salt_added;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summator_02_Test {

    private static Food_summator summator;

    public Food_summator_02_Test() {

    }

    @BeforeClass
    public static void one_time_setup() {
        //meal 01
        ArrayList<Interface_food> list_01 = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        Food_multiplier honey_multiplier = new Food_multiplier(honey, 1000.0);
        Food_multiplier yogurt_multiplier = new Food_multiplier(yogurt, 1000.0);
        list_01.add(honey_multiplier);
        list_01.add(yogurt_multiplier);
        Food_summator summator_01 = new Food_summator(list_01, "Meal_01");
        //meal 02
        ArrayList<Interface_food> list_02 = new ArrayList();
        Interface_food sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        Interface_food tomato = new Tomato_products_canned_puree_without_salt_added();
        Food_multiplier sardine_multiplier = new Food_multiplier(sardine, 1000.0);
        Food_multiplier tomato_multiplier = new Food_multiplier(tomato, 1000.0);
        list_02.add(sardine_multiplier);
        list_02.add(tomato_multiplier);
        Food_summator summator_02 = new Food_summator(list_02, "Meal_02");
        //total
        ArrayList<Interface_food> list_03 = new ArrayList();
        list_03.add(summator_01);
        list_03.add(summator_02);
        summator = new Food_summator(list_03, "Total");
    }

    //food_name
    @Test
    public void test_food_name() {
        assertEquals(summator.get_food_name(), "Total");
    }

    //food_label
    @Test
    public void test_food_label() {
        assertEquals(summator.get_food_label(), "Total");
    }

    //Alcohol, ethyl (g)
    @Test
    public void test_alcohol() {
        assertEquals(summator.get_alcohol_in_grams(), 0.0, 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test
    public void test_alpha_linolenic_acid() {
        assertEquals(summator.get_alpha_linolenic_acid_in_grams(), 0.01, 0.00001);
    }

    //calcium
    @Test
    public void test_calcium() {
        assertEquals(summator.get_calcium_in_milligrams(), 5160.0, 0.00001);
    }

    //carbohydrate_by_difference
    @Test
    public void test_carbohydrate_by_difference() {
        assertEquals(summator.get_carbohydrate_by_difference_in_grams(), 949.8, 0.00001);
    }

    //cholesterol
    @Test
    public void test_cholesterol() {
        assertEquals(summator.get_cholesterol_in_milligrams(), 1470.0, 0.00001);
    }

    //choline
    @Test
    public void test_choline() {
        assertEquals(summator.get_choline_in_milligrams(), 1099.0, 0.00001);
    }

    //complete_protein
    @Test
    public void test_complete_protein() {
        assertEquals(summator.get_complete_protein_in_grams(), 348.09999, 0.00001);
    }

    //copper
    @Test
    public void test_copper() {
        assertEquals(summator.get_copper_in_milligrams(), 5.00000, 0.00001);
    }

    //cost
    @Test
    public void test_cost() {
        assertEquals(summator.get_cost_in_dollars(), 0.0, 0.00001);
    }

    //dha
    @Test
    public void test_dha() {
        assertEquals(summator.get_dha_in_grams(), 5.0, 0.00001);
    }

    //epa
    @Test
    public void test_epa() {
        assertEquals(summator.get_epa_in_grams(), 4.69999, 0.00001);
    }

    //fat
    @Test
    public void test_fat() {
        assertEquals(summator.get_fat_in_grams(), 120.49999, 0.00001);
    }

    //fiber
    @Test
    public void test_fiber() {
        assertEquals(summator.get_fiber_in_grams(), 21.0, 0.00001);
    }

    //fluoride
    @Test
    public void test_fluoride() {
        assertEquals(summator.get_fluoride_in_micrograms(), 70.0, 0.00001);
    }

    //folate
    @Test
    public void test_folate() {
        assertEquals(summator.get_folate_in_micrograms(), 300.0, 0.00001);
    }

    //glycemic_index
    @Test
    public void test_glycemic_index() {
        assertEquals(summator.get_glycemic_index(), 49.21834, 0.00001);
    }

    //energy_gross
    @Test
    public void test_energy_gross() {
        assertEquals(summator.get_energy_gross_in_kilocalories(), 6090.0, 0.00001);
    }

    //iron
    @Test
    public void test_iron() {
        assertEquals(summator.get_iron_in_milligrams(), 51.9, 0.00001);
    }

    //linoleic_acid
    @Test
    public void test_linoleic_acid() {
        assertEquals(summator.get_linoleic_acid_in_grams(), 0.1, 0.00001);
    }

    //magnesium
    @Test
    public void test_magnesium() {
        assertEquals(summator.get_magnesium_in_milligrams(), 750.0, 0.00001);
    }

    //manganese
    @Test
    public void test_manganese() {
        assertEquals(summator.get_manganese_in_milligrams(), 3.49, 0.00001);
    }

    //monounsaturated_fat
    @Test
    public void test_monounsaturated_fat() {
        assertEquals(summator.get_monounsaturated_fat_in_grams(), 39.39999, 0.00001);
    }

    //niacin
    @Test
    public void test_niacin() {
        assertEquals(summator.get_niacin_in_milligrams(), 70.2, 0.00001);
    }

    //pantothenic_acid
    @Test
    public void test_pantothenic_acid() {
        assertEquals(summator.get_pantothenic_acid_in_milligrams(), 14.70, 0.00001);
    }

    //phosphorus
    @Test
    public void test_phosphorus() {
        assertEquals(summator.get_phosphorus_in_milligrams(), 6690.0, 0.00001);
    }

    //polyunsaturated_fat
    @Test
    public void test_polyunsaturated_fat() {
        assertEquals(summator.get_polyunsaturated_fat_in_grams(), 52.29999, 0.00001);
    }

    //potassium
    @Test
    public void test_potassium() {
        assertEquals(summator.get_potassium_in_milligrams(), 10290.0, 0.00001);
    }

    //protein
    @Test
    public void test_protein() {
        assertEquals(summator.get_protein_in_grams(), 367.59999, 0.00001);
    }

    //riboflavin
    @Test
    public void test_riboflavin() {
        assertEquals(summator.get_riboflavin_in_milligrams(), 6.0, 0.00001);
    }

    //saturated_fat
    @Test
    public void test_saturated_fat() {
        assertEquals(summator.get_saturated_fat_in_grams(), 16.5, 0.00001);
    }

    //selenium
    @Test
    public void test_selenium() {
        assertEquals(summator.get_selenium_in_micrograms(), 639.0, 0.00001);
    }

    //sodium
    @Test
    public void test_sodium() {
        assertEquals(summator.get_sodium_in_milligrams(), 3750.0, 0.00001);
    }

    //thiamin
    @Test
    public void test_thiamin() {
        assertEquals(summator.get_thiamin_in_milligrams(), 1.2, 0.00001);
    }

    //vitamin_a
    @Test
    public void test_vitamin_a() {
        assertEquals(summator.get_vitamin_a_in_micrograms(), 590.0, 0.00001);
    }

    //vitamin_b12
    @Test
    public void test_vitamin_b12() {
        assertEquals(summator.get_vitamin_b12_in_micrograms(), 96.89999, 0.00001);
    }

    //vitamin_b6
    @Test
    public void test_vitamin_b6() {
        assertEquals(summator.get_vitamin_b6_in_milligrams(), 3.59999, 0.00001);
    }

    //vitamin_c
    @Test
    public void test_vitamin_c() {
        assertEquals(summator.get_vitamin_c_in_milligrams(), 111.0, 0.00001);
    }

    //vitamin_d
    @Test
    public void test_vitamin_d() {
        assertEquals(summator.get_vitamin_d_in_micrograms(), 48.0, 0.00001);
    }

    //vitamin_e
    @Test
    public void test_vitamin_e() {
        assertEquals(summator.get_vitamin_e_in_milligrams(), 40.2, 0.00001);
    }

    //vitamin_k
    @Test
    public void test_vitamin_k() {
        assertEquals(summator.get_vitamin_k_in_micrograms(), 60.0, 0.00001);
    }

    //water
    @Test
    public void test_water() {
        assertEquals(summator.get_water_in_grams(), 2496.89999, 0.00001);
    }

    //weight
    @Test
    public void test_weight() {
        assertEquals(summator.get_weight_in_grams(), 4000.0, 0.00001);
    }

    //zinc
    @Test
    public void test_zinc() {
        assertEquals(summator.get_zinc_in_milligrams(), 24.1, 0.00001);
    }

    //glycemic load
    @Test
    public void test_glycemic_load() {
        assertEquals(summator.get_glycemic_load(), 457.14, 0.00001);
    }

    //energy_alcohol
    @Test
    public void test_energy_alcohol() {
        assertEquals(summator.get_energy_alcohol_in_kilocalories(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test
    public void test_energy_digestible_carbohydrate() {
        assertEquals(summator.get_energy_digestible_carbohydrate_in_kilocalories(), 3715.2, 0.00001);
    }

    //energy_digestible
    @Test
    public void test_energy_digestible() {
        assertEquals(summator.get_energy_digestible_in_kilocalories(), 6270.1, 0.00001);
    }

    //energy_fat
    @Test
    public void test_energy_fat() {
        assertEquals(summator.get_energy_fat_in_kilocalories(), 1084.49999, 0.00001);
    }

    //energy_protein
    @Test
    public void test_energy_protein() {
        assertEquals(summator.get_energy_protein_in_kilocalories(), 1470.39999, 0.00001);
    }

    //digestible_carbohydrate
    @Test
    public void test_digestible_carbohydrate() {
        assertEquals(summator.get_digestible_carbohydrate_in_grams(), 928.8, 0.00001);
    }

    //food_quotient
    @Test
    public void test_food_quotient() {
        assertEquals(summator.get_food_quotient(), 0.90528, 0.00001);
    }
}
