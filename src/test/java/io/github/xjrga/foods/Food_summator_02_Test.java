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

import io.github.xjrga.foods.data.Finfish_and_shellfish_products.Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone;
import io.github.xjrga.foods.data.Sweets.Honey;
import io.github.xjrga.foods.data.Dairy_and_egg_products.Yogurt_greek_plain_nonfat;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products.Tomato_products_canned_puree_without_salt_added;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summator_02_Test {

    private static Interface_food summator;

    public Food_summator_02_Test() {

    }

    @BeforeClass
    public static void one_time_setup() {
        //meal 01
        ArrayList<Interface_food> list_01 = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list_01.add(new Food_multiplier(honey, 1000.0));
        list_01.add(new Food_multiplier(yogurt, 1000.0));
        Interface_food summator_01 = new Food_summator(list_01, "Meal_01");
        //energy_alcohol:0.0
        //energy_digestible_carbohydrate:3024.9600000000005
        //energy_fat:0.0
        //energy_protein:10.08
        //energy_digestible:3035.0400000000004
        //energy_alcohol:0.0
        //energy_digestible_carbohydrate:144.00000000000003
        //energy_fat:35.1
        //energy_protein:407.59999999999997
        //energy_digestible:586.7
        //meal 02
        ArrayList<Interface_food> list_02 = new ArrayList();
        Interface_food sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        Interface_food tomato = new Tomato_products_canned_puree_without_salt_added();
        list_02.add(new Food_multiplier(sardine, 1000.0));
        list_02.add(new Food_multiplier(tomato, 1000.0));
        Interface_food summator_02 = new Food_summator(list_02, "Meal_02");
        //energy_alcohol:0.0
        //energy_digestible_carbohydrate:0.0
        //energy_fat:1030.4999999999998
        //energy_protein:1051.274
        //energy_digestible:2081.7739999999994
        //energy_alcohol:0.0
        //energy_digestible_carbohydrate:252.75600000000003
        //energy_fat:17.576999999999998
        //energy_protein:40.26
        //energy_digestible:310.593
        //total
        ArrayList<Interface_food> list_03 = new ArrayList();
        list_03.add(summator_01);
        list_03.add(summator_02);
        summator = new Food_summator(list_03, "Total");
        //energy_alcohol:0.0
        //energy_digestible_carbohydrate:3432.0000000000005
        //energy_fat:35.1
        //energy_protein:419.59999999999997
        //energy_digestible:3886.7000000000003<-

        //energy_alcohol:0.0
        //energy_digestible_carbohydrate:252.75600000000003
        //energy_fat:975.9419999999998
        //energy_protein:640.9879999999999
        //energy_digestible:1869.686<-
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
        assertEquals(0.01, summator.get_alpha_linolenic_acid_in_grams(), 0.00001);
    }

    //calcium
    @Test
    public void test_calcium() {
        assertEquals(5160.0, summator.get_calcium_in_milligrams(), 0.00001);
    }

    //carbohydrate_by_difference
    @Test
    public void test_carbohydrate_by_difference() {
        assertEquals(949.8, summator.get_carbohydrate_by_difference_in_grams(), 0.00001);
    }

    //cholesterol
    @Test
    public void test_cholesterol() {
        assertEquals(1470.0, summator.get_cholesterol_in_milligrams(), 0.00001);
    }

    //choline
    @Test
    public void test_choline() {
        assertEquals(1099.0, summator.get_choline_in_milligrams(), 0.00001);
    }

    //complete_protein
    @Test
    public void test_complete_protein() {
        assertEquals(348.09999, summator.get_complete_protein_in_grams(), 0.00001);
    }

    //copper
    @Test
    public void test_copper() {
        assertEquals(5.26, summator.get_copper_in_milligrams(), 0.00001);
    }

    //cost
    @Test
    public void test_cost() {
        assertEquals(0.0, summator.get_cost_in_dollars(), 0.00001);
    }

    //dha
    @Test
    public void test_dha() {
        assertEquals(5.09, summator.get_dha_in_grams(), 0.00001);
    }

    //epa
    @Test
    public void test_epa() {
        assertEquals(4.72999, summator.get_epa_in_grams(), 0.00001);
    }

    //fat
    @Test
    public void test_fat() {
        assertEquals(120.49999, summator.get_fat_in_grams(), 0.00001);
    }

    //fiber
    @Test
    public void test_fiber() {
        assertEquals(21.0, summator.get_fiber_in_grams(), 0.00001);
    }

    //fluoride
    @Test
    public void test_fluoride() {
        assertEquals(70.0, summator.get_fluoride_in_micrograms(), 0.00001);
    }

    //folate
    @Test
    public void test_folate() {
        assertEquals(300.0, summator.get_folate_in_micrograms(), 0.00001);
    }

    //glycemic_index
    @Test
    public void test_glycemic_index() {
        assertEquals(49.21834, summator.get_glycemic_index(), 0.00001);
    }

    //energy_gross
    @Test
    public void test_energy_gross() {
        assertEquals(6090.0, summator.get_energy_gross_in_kilocalories(), 0.00001);
    }

    //iron
    @Test
    public void test_iron() {
        assertEquals(51.9, summator.get_iron_in_milligrams(), 0.00001);
    }

    //linoleic_acid
    @Test
    public void test_linoleic_acid() {
        assertEquals(0.1, summator.get_linoleic_acid_in_grams(), 0.00001);
    }

    //magnesium
    @Test
    public void test_magnesium() {
        assertEquals(750.0, summator.get_magnesium_in_milligrams(), 0.00001);
    }

    //manganese
    @Test
    public void test_manganese() {
        assertEquals(3.66, summator.get_manganese_in_milligrams(), 0.00001);
    }

    //monounsaturated_fat
    @Test
    public void test_monounsaturated_fat() {
        assertEquals(39.53, summator.get_monounsaturated_fat_in_grams(), 0.00001);
    }

    //niacin
    @Test
    public void test_niacin() {
        assertEquals(70.4, summator.get_niacin_in_milligrams(), 0.00001);
    }

    //pantothenic_acid
    @Test
    public void test_pantothenic_acid() {
        assertEquals(14.81, summator.get_pantothenic_acid_in_milligrams(), 0.00001);
    }

    //phosphorus
    @Test
    public void test_phosphorus() {
        assertEquals(6690.0, summator.get_phosphorus_in_milligrams(), 0.00001);
    }

    //polyunsaturated_fat
    @Test
    public void test_polyunsaturated_fat() {
        assertEquals(52.45999, summator.get_polyunsaturated_fat_in_grams(), 0.00001);
    }

    //potassium
    @Test
    public void test_potassium() {
        assertEquals(10290.0, summator.get_potassium_in_milligrams(), 0.00001);
    }

    //protein
    @Test
    public void test_protein() {
        assertEquals(367.59999, summator.get_protein_in_grams(), 0.00001);
    }

    //riboflavin
    @Test
    public void test_riboflavin() {
        assertEquals(6.23, summator.get_riboflavin_in_milligrams(), 0.00001);
    }

    //saturated_fat
    @Test
    public void test_saturated_fat() {
        assertEquals(16.74, summator.get_saturated_fat_in_grams(), 0.00001);
    }

    //selenium
    @Test
    public void test_selenium() {
        assertEquals(639.0, summator.get_selenium_in_micrograms(), 0.00001);
    }

    //sodium
    @Test
    public void test_sodium() {
        assertEquals(3750.0, summator.get_sodium_in_milligrams(), 0.00001);
    }

    //thiamin
    @Test
    public void test_thiamin() {
        assertEquals(1.28, summator.get_thiamin_in_milligrams(), 0.00001);
    }

    //vitamin_a
    @Test
    public void test_vitamin_a() {
        assertEquals(590.0, summator.get_vitamin_a_in_micrograms(), 0.00001);
    }

    //vitamin_b12
    @Test
    public void test_vitamin_b12() {
        assertEquals(96.89999, summator.get_vitamin_b12_in_micrograms(), 0.00001);
    }

    //vitamin_b6
    @Test
    public void test_vitamin_b6() {
        assertEquals(3.8, summator.get_vitamin_b6_in_milligrams(), 0.00001);
    }

    //vitamin_c
    @Test
    public void test_vitamin_c() {
        assertEquals(111.0, summator.get_vitamin_c_in_milligrams(), 0.00001);
    }

    //vitamin_d
    @Test
    public void test_vitamin_d() {
        assertEquals(48.0, summator.get_vitamin_d_in_micrograms(), 0.00001);
    }

    //vitamin_e
    @Test
    public void test_vitamin_e() {
        assertEquals(40.2, summator.get_vitamin_e_in_milligrams(), 0.00001);
    }

    //vitamin_k
    @Test
    public void test_vitamin_k() {
        assertEquals(60.0, summator.get_vitamin_k_in_micrograms(), 0.00001);
    }

    //water
    @Test
    public void test_water() {
        assertEquals(2496.89999, summator.get_water_in_grams(), 0.00001);
    }

    //weight
    @Test
    public void test_weight() {
        assertEquals(4000.0, summator.get_weight_in_grams(), 0.00001);
    }

    //zinc
    @Test
    public void test_zinc() {
        assertEquals(24.1, summator.get_zinc_in_milligrams(), 0.00001);
    }

    //glycemic load
    @Test
    public void test_glycemic_load() {
        assertEquals(457.14, summator.get_glycemic_load(), 0.00001);
    }

    //energy_alcohol
    @Test
    public void test_energy_alcohol() {
        assertEquals(0.0, summator.get_energy_alcohol_in_kilocalories(), 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test
    public void test_energy_digestible_carbohydrate() {
        assertEquals(3421.71600, summator.get_energy_digestible_carbohydrate_in_kilocalories(), 0.00001);
    }

    //energy_digestible
    @Test
    public void test_energy_digestible() {
        assertEquals(6014.10700, summator.get_energy_digestible_in_kilocalories(), 0.00001);
    }

    //energy_fat
    @Test
    public void test_energy_fat() {
        assertEquals(1083.17700, summator.get_energy_fat_in_kilocalories(), 0.00001);
    }

    //energy_protein
    @Test
    public void test_energy_protein() {
        assertEquals(1509.21400, summator.get_energy_protein_in_kilocalories(), 0.00001);
    }

    //digestible_carbohydrate
    @Test
    public void test_digestible_carbohydrate() {
        assertEquals(928.80000, summator.get_digestible_carbohydrate_in_grams(), 0.00001);
    }

    //food_quotient
    @Test
    public void test_food_quotient() {
        assertEquals(0.90009, summator.get_food_quotient(), 0.00001);
    }
}
