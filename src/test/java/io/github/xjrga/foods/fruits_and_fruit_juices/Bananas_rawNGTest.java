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
package io.github.xjrga.foods.fruits_and_fruit_juices;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Bananas_rawNGTest {

    private static Bananas_raw food;

    public Bananas_rawNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        food = new Bananas_raw();
    }

    //food_name
    @Test(enabled = true)
    public void test_food_name() {
        assertEquals("Bananas, raw", food.get_food_name());
    }

    //food_label
    @Test(enabled = true)
    public void test_food_label() {
        assertEquals("Bananas_raw", food.get_food_label());
    }

    //Alcohol, ethyl (g)
    @Test(enabled = true)
    public void test_alcohol() {
        assertEquals(0.0, food.get_alcohol(), 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test(enabled = true)
    public void test_alpha_linolenic_acid() {
        assertEquals(0.0, food.get_alpha_linolenic_acid(), 0.00001);
    }

    //calcium
    @Test(enabled = true)
    public void test_calcium() {
        assertEquals(5.0, food.get_calcium(), 0.00001);
    }

    //carbohydrate_by_difference
    @Test(enabled = true)
    public void test_carbohydrate_by_difference() {
        assertEquals(22.84, food.get_carbohydrate_by_difference(), 0.00001);
    }

    //cholesterol
    @Test(enabled = true)
    public void test_cholesterol() {
        assertEquals(0.0, food.get_cholesterol(), 0.00001);
    }

    //choline
    @Test(enabled = true)
    public void test_choline() {
        assertEquals(9.8, food.get_choline(), 0.00001);
    }

    //complete_protein
    @Test(enabled = true)
    public void test_complete_protein() {
        assertEquals(0.0, food.get_complete_protein(), 0.00001);
    }

    //copper
    @Test(enabled = true)
    public void test_copper() {
        assertEquals(0.07, food.get_copper(), 0.00001);
    }

    //cost
    @Test(enabled = true)
    public void test_cost() {
        assertEquals(0.0, food.get_cost(), 0.00001);
    }

    //dha
    @Test(enabled = true)
    public void test_dha() {
        assertEquals(0.0, food.get_dha(), 0.00001);
    }

    //epa
    @Test(enabled = true)
    public void test_epa() {
        assertEquals(0.0, food.get_epa(), 0.00001);
    }

    //fat
    @Test(enabled = true)
    public void test_fat() {
        assertEquals(0.33, food.get_fat(), 0.00001);
    }

    //fiber
    @Test(enabled = true)
    public void test_fiber() {
        assertEquals(2.6, food.get_fiber(), 0.00001);
    }

    //fluoride
    @Test(enabled = true)
    public void test_fluoride() {
        assertEquals(2.2, food.get_fluoride(), 0.00001);
    }

    //folate
    @Test(enabled = true)
    public void test_folate() {
        assertEquals(20.0, food.get_folate(), 0.00001);
    }

    //glycemic_index
    @Test(enabled = true)
    public void test_glycemic_index() {
        assertEquals(52.0, food.get_glycemic_index(), 0.00001);
    }

    //energy_gross
    @Test(enabled = true)
    public void test_energy_gross() {
        assertEquals(89.0, food.get_energy_gross(), 0.00001);
    }

    //iron
    @Test(enabled = true)
    public void test_iron() {
        assertEquals(0.26, food.get_iron(), 0.00001);
    }

    //linoleic_acid
    @Test(enabled = true)
    public void test_linoleic_acid() {
        assertEquals(0.0, food.get_linoleic_acid(), 0.00001);
    }

    //magnesium
    @Test(enabled = true)
    public void test_magnesium() {
        assertEquals(27.0, food.get_magnesium(), 0.00001);
    }

    //manganese
    @Test(enabled = true)
    public void test_manganese() {
        assertEquals(0.27, food.get_manganese(), 0.00001);
    }

    //monounsaturated_fat
    @Test(enabled = true)
    public void test_monounsaturated_fat() {
        assertEquals(0.03, food.get_monounsaturated_fat(), 0.00001);
    }

    //niacin
    @Test(enabled = true)
    public void test_niacin() {
        assertEquals(0.66, food.get_niacin(), 0.00001);
    }

    //pantothenic_acid
    @Test(enabled = true)
    public void test_pantothenic_acid() {
        assertEquals(0.33, food.get_pantothenic_acid(), 0.00001);
    }

    //phosphorus
    @Test(enabled = true)
    public void test_phosphorus() {
        assertEquals(22.0, food.get_phosphorus(), 0.00001);
    }

    //polyunsaturated_fat
    @Test(enabled = true)
    public void test_polyunsaturated_fat() {
        assertEquals(0.07, food.get_polyunsaturated_fat(), 0.00001);
    }

    //potassium
    @Test(enabled = true)
    public void test_potassium() {
        assertEquals(358.0, food.get_potassium(), 0.00001);
    }

    //protein
    @Test(enabled = true)
    public void test_protein() {
        assertEquals(1.09, food.get_protein(), 0.00001);
    }

    //riboflavin
    @Test(enabled = true)
    public void test_riboflavin() {
        assertEquals(0.07, food.get_riboflavin(), 0.00001);
    }

    //saturated_fat
    @Test(enabled = true)
    public void test_saturated_fat() {
        assertEquals(0.11, food.get_saturated_fat(), 0.00001);
    }

    //selenium
    @Test(enabled = true)
    public void test_selenium() {
        assertEquals(1.0, food.get_selenium(), 0.00001);
    }

    //sodium
    @Test(enabled = true)
    public void test_sodium() {
        assertEquals(1.0, food.get_sodium(), 0.00001);
    }

    //thiamin
    @Test(enabled = true)
    public void test_thiamin() {
        assertEquals(0.03, food.get_thiamin(), 0.00001);
    }

    //vitamin_a
    @Test(enabled = true)
    public void test_vitamin_a() {
        assertEquals(3.0, food.get_vitamin_a(), 0.00001);
    }

    //vitamin_b12
    @Test(enabled = true)
    public void test_vitamin_b12() {
        assertEquals(0.0, food.get_vitamin_b12(), 0.00001);
    }

    //vitamin_b6
    @Test(enabled = true)
    public void test_vitamin_b6() {
        assertEquals(0.36, food.get_vitamin_b6(), 0.00001);
    }

    //vitamin_c
    @Test(enabled = true)
    public void test_vitamin_c() {
        assertEquals(8.7, food.get_vitamin_c(), 0.00001);
    }

    //vitamin_d
    @Test(enabled = true)
    public void test_vitamin_d() {
        assertEquals(0.0, food.get_vitamin_d(), 0.00001);
    }

    //vitamin_e
    @Test(enabled = true)
    public void test_vitamin_e() {
        assertEquals(0.1, food.get_vitamin_e(), 0.00001);
    }

    //vitamin_k
    @Test(enabled = true)
    public void test_vitamin_k() {
        assertEquals(0.5, food.get_vitamin_k(), 0.00001);
    }

    //water
    @Test(enabled = true)
    public void test_water() {
        assertEquals(74.91, food.get_water(), 0.00001);
    }

    //weight
    @Test(enabled = true)
    public void test_weight() {
        assertEquals(100.0, food.get_weight(), 0.00001);
    }

    //zinc
    @Test(enabled = true)
    public void test_zinc() {
        assertEquals(0.15, food.get_zinc(), 0.00001);
    }

    //glycemic load
    @Test(enabled = true)
    public void test_glycemic_load() {
        assertEquals(10.52479, food.get_glycemic_load(), 0.00001);
    }

    //energy_alcohol
    @Test(enabled = true)
    public void test_energy_alcohol() {
        assertEquals(0.0, food.get_energy_alcohol(), 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test(enabled = true)
    public void test_energy_digestible_carbohydrate() {
        assertEquals(80.96, food.get_energy_digestible_carbohydrate(), 0.00001);
    }

    //energy_digestible_carbohydrate_coefficient
    @Test(enabled = true)
    public void test_energy_digestible_carbohydrate_coefficient() {
        assertEquals(0.8096, food.get_energy_digestible_carbohydrate_coefficient(), 0.00001);
    }

    //energy_digestible
    @Test(enabled = true)
    public void test_energy_digestible() {
        assertEquals(88.28999, food.get_energy_digestible(), 0.00001);
    }

    //energy_fat
    @Test(enabled = true)
    public void test_energy_fat() {
        assertEquals(2.97, food.get_energy_fat(), 0.00001);
    }

    //energy_no_protein
    @Test(enabled = true)
    public void test_energy_no_protein() {
        assertEquals(83.92999, food.get_energy_no_protein(), 0.00001);
    }

    //energy_protein
    @Test(enabled = true)
    public void test_energy_protein() {
        assertEquals(4.36, food.get_energy_protein(), 0.00001);
    }

    //
    @Test(enabled = true)
    public void test_energy_gross_coefficient() {
        assertEquals(0.89, food.get_energy_gross_coefficient(), 0.00001);
    }

    //
    @Test(enabled = true)
    public void test_protein_coefficient() {
        assertEquals(0.0109, food.get_protein_coefficient(), 0.00001);
    }

    //
    @Test(enabled = true)
    public void test_carbohydrate_by_difference_coefficient() {
        assertEquals(0.2284, food.get_carbohydrate_by_difference_coefficient(), 0.00001);
    }

    //
    @Test(enabled = true)
    public void test_fiber_coefficient() {
        assertEquals(0.02600, food.get_fiber_coefficient(), 0.00001);
    }

    //fat_coefficient
    @Test(enabled = true)
    public void test_fat_coefficient() {
        assertEquals(0.0033, food.get_fat_coefficient(), 0.00001);
    }

    //alcohol_coefficient
    @Test(enabled = true)
    public void test_alcohol_coefficient() {
        assertEquals(0.0, food.get_alcohol_coefficient(), 0.00001);
    }

    //digestible_carbohydrate_coefficient
    @Test(enabled = true)
    public void test_digestible_carbohydrate_coefficient() {
        assertEquals(0.2024, food.get_digestible_carbohydrate_coefficient(), 0.00001);
    }

    //cholesterol_coefficient
    @Test(enabled = true)
    public void test_cholesterol_coefficient() {
        assertEquals(0.0, food.get_cholesterol_coefficient(), 0.00001);
    }

    //monounsaturated_fat_coefficient
    @Test(enabled = true)
    public void test_monounsaturated_fat_coefficient() {
        assertEquals(0.0003, food.get_monounsaturated_fat_coefficient(), 0.00001);
    }

    //polyunsaturated_fat_coefficient
    @Test(enabled = true)
    public void test_polyunsaturated_fat_coefficient() {
        assertEquals(0.0007, food.get_polyunsaturated_fat_coefficient(), 0.00001);
    }

    //saturated_fat_coefficient
    @Test(enabled = true)
    public void test_saturated_fat_coefficient() {
        assertEquals(0.0011, food.get_saturated_fat_coefficient(), 0.00001);
    }

    //complete_protein_coefficient
    @Test(enabled = true)
    public void test_complete_protein_coefficient() {
        assertEquals(0.0, food.get_complete_protein_coefficient(), 0.00001);
    }

    //calcium_coefficient
    @Test(enabled = true)
    public void test_calcium_coefficient() {
        assertEquals(0.05, food.get_calcium_coefficient(), 0.00001);
    }

    //copper_coefficient
    @Test(enabled = true)
    public void test_copper_coefficient() {
        assertEquals(0.0007, food.get_copper_coefficient(), 0.00001);
    }

    //fluoride_coefficient
    @Test(enabled = true)
    public void test_fluoride_coefficient() {
        assertEquals(0.02200, food.get_fluoride_coefficient(), 0.00001);
    }

    //iron_coefficient
    @Test(enabled = true)
    public void test_iron_coefficient() {
        assertEquals(0.0026, food.get_iron_coefficient(), 0.00001);
    }

    //magnesium_coefficient
    @Test(enabled = true)
    public void test_magnesium_coefficient() {
        assertEquals(0.27, food.get_magnesium_coefficient(), 0.00001);
    }

    //manganese_coefficient
    @Test(enabled = true)
    public void test_manganese_coefficient() {
        assertEquals(0.0027, food.get_manganese_coefficient(), 0.00001);
    }

    //phosphorus_coefficient
    @Test(enabled = true)
    public void test_phosphorus_coefficient() {
        assertEquals(0.22, food.get_phosphorus_coefficient(), 0.00001);
    }

    //potassium_coefficient
    @Test(enabled = true)
    public void test_potassium_coefficient() {
        assertEquals(3.58, food.get_potassium_coefficient(), 0.00001);
    }

    //selenium_coefficient
    @Test(enabled = true)
    public void test_selenium_coefficient() {
        assertEquals(0.01, food.get_selenium_coefficient(), 0.00001);
    }

    //sodium_coefficient
    @Test(enabled = true)
    public void test_sodium_coefficient() {
        assertEquals(0.01, food.get_sodium_coefficient(), 0.00001);
    }

    //zinc_coefficient
    @Test(enabled = true)
    public void test_zinc_coefficient() {
        assertEquals(0.0015, food.get_zinc_coefficient(), 0.00001);
    }

    //folate_coefficient
    @Test(enabled = true)
    public void test_folate_coefficient() {
        assertEquals(0.2, food.get_folate_coefficient(), 0.00001);
    }

    //niacin_coefficient
    @Test(enabled = true)
    public void test_niacin_coefficient() {
        assertEquals(0.0066, food.get_niacin_coefficient(), 0.00001);
    }

    //pantothenic_acid_coefficient
    @Test(enabled = true)
    public void test_pantothenic_acid_coefficient() {
        assertEquals(0.0033, food.get_pantothenic_acid_coefficient(), 0.00001);
    }

    //riboflavin_coefficient
    @Test(enabled = true)
    public void test_riboflavin_coefficient() {
        assertEquals(0.0007, food.get_riboflavin_coefficient(), 0.00001);
    }

    //thiamin_coefficient
    @Test(enabled = true)
    public void test_thiamin_coefficient() {
        assertEquals(0.0003, food.get_thiamin_coefficient(), 0.00001);
    }

    //vitamin_a_coefficient
    @Test(enabled = true)
    public void test_vitamin_a_coefficient() {
        assertEquals(0.03, food.get_vitamin_a_coefficient(), 0.00001);
    }

    //vitamin_b12_coefficient
    @Test(enabled = true)
    public void test_vitamin_b12_coefficient() {
        assertEquals(0.0, food.get_vitamin_b12_coefficient(), 0.00001);
    }

    //vitamin_b6_coefficient
    @Test(enabled = true)
    public void test_vitamin_b6_coefficient() {
        assertEquals(0.0036, food.get_vitamin_b6_coefficient(), 0.00001);
    }

    //vitamin_c_coefficient
    @Test(enabled = true)
    public void test_vitamin_c_coefficient() {
        assertEquals(0.087, food.get_vitamin_c_coefficient(), 0.00001);
    }

    //vitamin_d_coefficient
    @Test(enabled = true)
    public void test_vitamin_d_coefficient() {
        assertEquals(0.0, food.get_vitamin_d_coefficient(), 0.00001);
    }

    //vitamin_e_coefficient
    @Test(enabled = true)
    public void test_vitamin_e_coefficient() {
        assertEquals(0.001, food.get_vitamin_e_coefficient(), 0.00001);
    }

    //vitamin_k_coefficient
    @Test(enabled = true)
    public void test_vitamin_k_coefficient() {
        assertEquals(0.005, food.get_vitamin_k_coefficient(), 0.00001);
    }

    //choline_coefficient
    @Test(enabled = true)
    public void test_choline_coefficient() {
        assertEquals(0.098, food.get_choline_coefficient(), 0.00001);
    }

    //glycemic_load_coefficient
    @Test(enabled = true)
    public void test_glycemic_load_coefficient() {
        assertEquals(0.10524, food.get_glycemic_load_coefficient(), 0.00001);
    }

    //alphalinolenic_acid_coefficient
    @Test(enabled = true)
    public void test_alphalinolenic_acid_coefficient() {
        assertEquals(0.0, food.get_alphalinolenic_acid_coefficient(), 0.00001);
    }

    //linoleic_acid_coefficient
    @Test(enabled = true)
    public void test_linoleic_acid_coefficient() {
        assertEquals(0.0, food.get_linoleic_acid_coefficient(), 0.00001);
    }

    //dha_coefficient
    @Test(enabled = true)
    public void test_dha_coefficient() {
        assertEquals(0.0, food.get_dha_coefficient(), 0.00001);
    }

    //epa_coefficient
    @Test(enabled = true)
    public void test_epa_coefficient() {
        assertEquals(0.0, food.get_epa_coefficient(), 0.00001);
    }

    //water_coefficient
    @Test(enabled = true)
    public void test_water_coefficient() {
        assertEquals(0.7491, food.get_water_coefficient(), 0.00001);
    }

    //cost_coefficient
    @Test(enabled = true)
    public void test_cost_coefficient() {
        assertEquals(0.0, food.get_cost_coefficient(), 0.00001);
    }

    //energy_alcohol_coefficient
    @Test(enabled = true)
    public void test_energy_alcohol_coefficient() {
        assertEquals(0.0, food.get_energy_alcohol_coefficient(), 0.00001);
    }

    //energy_digestible_coefficient
    @Test(enabled = true)
    public void test_energy_digestible_coefficient() {
        assertEquals(0.88289, food.get_energy_digestible_coefficient(), 0.00001);
    }

    //energy_fat_coefficient
    @Test(enabled = true)
    public void test_energy_fat_coefficient() {
        assertEquals(0.0297, food.get_energy_fat_coefficient(), 0.00001);
    }

    //energy_no_protein_coefficient
    @Test(enabled = true)
    public void test_energy_no_protein_coefficient() {
        assertEquals(0.83929, food.get_energy_no_protein_coefficient(), 0.00001);
    }

    //energy_protein_coefficient
    @Test(enabled = true)
    public void test_energy_protein_coefficient() {
        assertEquals(.0436, food.get_energy_protein_coefficient(), 0.00001);
    }

    //digestible_carbohydrate
    @Test(enabled = true)
    public void test_digestible_carbohydrate() {
        assertEquals(20.24, food.get_digestible_carbohydrate(), 0.00001);
    }

}
