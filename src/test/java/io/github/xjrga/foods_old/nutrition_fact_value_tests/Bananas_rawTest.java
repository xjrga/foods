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
package io.github.xjrga.foods_old.nutrition_fact_value_tests;

import io.github.xjrga.foods_old.Chef;
import io.github.xjrga.foods_old.Interface_food;
import io.github.xjrga.foods_old.The_list;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Bananas_rawTest {

    private static Interface_food food;

    public Bananas_rawTest() {
    }

    @BeforeClass
    public static void one_time_setup() {
        Chef chef = new Chef();
        String food_name = The_list.FRUITS_AND_FRUIT_JUICES.Bananas_raw.get_name();
        food = chef.find_food(food_name);
    }

    //food_name
    @Test
    public void test_food_name() {
        assertEquals(food.get_food_name(), "Bananas, raw");
    }

    //food_label
    @Test
    public void test_food_label() {
        assertEquals(food.get_food_label(), "bananas_raw");
    }

    //Alcohol, ethyl (g)
    @Test
    public void test_alcohol() {
        assertEquals(food.get_alcohol(), 0.0, 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test
    public void test_alpha_linolenic_acid() {
        assertEquals(food.get_alpha_linolenic_acid(), 0.0, 0.00001);
    }

    //calcium
    @Test
    public void test_calcium() {
        assertEquals(food.get_calcium(), 5.0, 0.00001);
    }

    //carbohydrate_by_difference
    @Test
    public void test_carbohydrate_by_difference() {
        assertEquals(food.get_carbohydrate_by_difference(), 22.84, 0.00001);
    }

    //cholesterol
    @Test
    public void test_cholesterol() {
        assertEquals(food.get_cholesterol(), 0.0, 0.00001);
    }

    //choline
    @Test
    public void test_choline() {
        assertEquals(food.get_choline(), 9.8, 0.00001);
    }

    //complete_protein
    @Test
    public void test_complete_protein() {
        assertEquals(food.get_complete_protein(), 0.0, 0.00001);
    }

    //copper
    @Test
    public void test_copper() {
        assertEquals(food.get_copper(), 0.07, 0.00001);
    }

    //cost
    @Test
    public void test_cost() {
        assertEquals(food.get_cost(), 0.0, 0.00001);
    }

    //dha
    @Test
    public void test_dha() {
        assertEquals(food.get_dha(), 0.0, 0.00001);
    }

    //epa
    @Test
    public void test_epa() {
        assertEquals(food.get_epa(), 0.0, 0.00001);
    }

    //fat
    @Test
    public void test_fat() {
        assertEquals(food.get_fat(), 0.33, 0.00001);
    }

    //fiber
    @Test
    public void test_fiber() {
        assertEquals(food.get_fiber(), 2.6, 0.00001);
    }

    //fluoride
    @Test
    public void test_fluoride() {
        assertEquals(food.get_fluoride(), 2.2, 0.00001);
    }

    //folate
    @Test
    public void test_folate() {
        assertEquals(food.get_folate(), 20.0, 0.00001);
    }

    //glycemic_index
    @Test
    public void test_glycemic_index() {
        assertEquals(food.get_glycemic_index(), 52.0, 0.00001);
    }

    //energy_gross
    @Test
    public void test_energy_gross() {
        assertEquals(food.get_energy_gross(), 89.0, 0.00001);
    }

    //iron
    @Test
    public void test_iron() {
        assertEquals(food.get_iron(), 0.26, 0.00001);
    }

    //linoleic_acid
    @Test
    public void test_linoleic_acid() {
        assertEquals(food.get_linoleic_acid(), 0.0, 0.00001);
    }

    //magnesium
    @Test
    public void test_magnesium() {
        assertEquals(food.get_magnesium(), 27.0, 0.00001);
    }

    //manganese
    @Test
    public void test_manganese() {
        assertEquals(food.get_manganese(), 0.27, 0.00001);
    }

    //monounsaturated_fat
    @Test
    public void test_monounsaturated_fat() {
        assertEquals(food.get_monounsaturated_fat(), 0.03, 0.00001);
    }

    //niacin
    @Test
    public void test_niacin() {
        assertEquals(food.get_niacin(), 0.66, 0.00001);
    }

    //pantothenic_acid
    @Test
    public void test_pantothenic_acid() {
        assertEquals(food.get_pantothenic_acid(), 0.33, 0.00001);
    }

    //phosphorus
    @Test
    public void test_phosphorus() {
        assertEquals(food.get_phosphorus(), 22.0, 0.00001);
    }

    //polyunsaturated_fat
    @Test
    public void test_polyunsaturated_fat() {
        assertEquals(food.get_polyunsaturated_fat(), 0.07, 0.00001);
    }

    //potassium
    @Test
    public void test_potassium() {
        assertEquals(food.get_potassium(), 358.0, 0.00001);
    }

    //protein
    @Test
    public void test_protein() {
        assertEquals(food.get_protein(), 1.09, 0.00001);
    }

    //riboflavin
    @Test
    public void test_riboflavin() {
        assertEquals(food.get_riboflavin(), 0.07, 0.00001);
    }

    //saturated_fat
    @Test
    public void test_saturated_fat() {
        assertEquals(food.get_saturated_fat(), 0.11, 0.00001);
    }

    //selenium
    @Test
    public void test_selenium() {
        assertEquals(food.get_selenium(), 1.0, 0.00001);
    }

    //sodium
    @Test
    public void test_sodium() {
        assertEquals(food.get_sodium(), 1.0, 0.00001);
    }

    //thiamin
    @Test
    public void test_thiamin() {
        assertEquals(food.get_thiamin(), 0.03, 0.00001);
    }

    //vitamin_a
    @Test
    public void test_vitamin_a() {
        assertEquals(food.get_vitamin_a(), 3.0, 0.00001);
    }

    //vitamin_b12
    @Test
    public void test_vitamin_b12() {
        assertEquals(food.get_vitamin_b12(), 0.0, 0.00001);
    }

    //vitamin_b6
    @Test
    public void test_vitamin_b6() {
        assertEquals(food.get_vitamin_b6(), 0.36, 0.00001);
    }

    //vitamin_c
    @Test
    public void test_vitamin_c() {
        assertEquals(food.get_vitamin_c(), 8.7, 0.00001);
    }

    //vitamin_d
    @Test
    public void test_vitamin_d() {
        assertEquals(food.get_vitamin_d(), 0.0, 0.00001);
    }

    //vitamin_e
    @Test
    public void test_vitamin_e() {
        assertEquals(food.get_vitamin_e(), 0.1, 0.00001);
    }

    //vitamin_k
    @Test
    public void test_vitamin_k() {
        assertEquals(food.get_vitamin_k(), 0.5, 0.00001);
    }

    //water
    @Test
    public void test_water() {
        assertEquals(food.get_water(), 74.91, 0.00001);
    }

    //weight
    @Test
    public void test_weight() {
        assertEquals(food.get_weight(), 100.0, 0.00001);
    }

    //zinc
    @Test
    public void test_zinc() {
        assertEquals(food.get_zinc(), 0.15, 0.00001);
    }

    //glycemic load
    @Test
    public void test_glycemic_load() {
        assertEquals(food.get_glycemic_load(), 10.52479, 0.00001);
    }

    //energy_alcohol
    @Test
    public void test_energy_alcohol() {
        assertEquals(food.get_energy_alcohol(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test
    public void test_energy_digestible_carbohydrate() {
        assertEquals(food.get_energy_digestible_carbohydrate(), 80.96, 0.00001);
    }

    //energy_digestible_carbohydrate_coefficient
    @Test
    public void test_energy_digestible_carbohydrate_coefficient() {
        assertEquals(food.get_energy_digestible_carbohydrate_coefficient(), 0.8096, 0.00001);
    }

    //energy_digestible
    @Test
    public void test_energy_digestible() {
        assertEquals(food.get_energy_digestible(), 88.28999, 0.00001);
    }

    //energy_fat
    @Test
    public void test_energy_fat() {
        assertEquals(food.get_energy_fat(), 2.97, 0.00001);
    }

    //energy_protein
    @Test
    public void test_energy_protein() {
        assertEquals(food.get_energy_protein(), 4.36, 0.00001);
    }

    //
    @Test
    public void test_energy_gross_coefficient() {
        assertEquals(food.get_energy_gross_coefficient(), 0.89, 0.00001);
    }

    //
    @Test
    public void test_protein_coefficient() {
        assertEquals(food.get_protein_coefficient(), 0.0109, 0.00001);
    }

    //
    @Test
    public void test_carbohydrate_by_difference_coefficient() {
        assertEquals(food.get_carbohydrate_by_difference_coefficient(), 0.2284, 0.00001);
    }

    //
    @Test
    public void test_fiber_coefficient() {
        assertEquals(food.get_fiber_coefficient(), 0.02600, 0.00001);
    }

    //fat_coefficient
    @Test
    public void test_fat_coefficient() {
        assertEquals(food.get_fat_coefficient(), 0.0033, 0.00001);
    }

    //alcohol_coefficient
    @Test
    public void test_alcohol_coefficient() {
        assertEquals(food.get_alcohol_coefficient(), 0.0, 0.00001);
    }

    //digestible_carbohydrate_coefficient
    @Test
    public void test_digestible_carbohydrate_coefficient() {
        assertEquals(food.get_digestible_carbohydrate_coefficient(), 0.2024, 0.00001);
    }

    //cholesterol_coefficient
    @Test
    public void test_cholesterol_coefficient() {
        assertEquals(food.get_cholesterol_coefficient(), 0.0, 0.00001);
    }

    //monounsaturated_fat_coefficient
    @Test
    public void test_monounsaturated_fat_coefficient() {
        assertEquals(food.get_monounsaturated_fat_coefficient(), 0.0003, 0.00001);
    }

    //polyunsaturated_fat_coefficient
    @Test
    public void test_polyunsaturated_fat_coefficient() {
        assertEquals(food.get_polyunsaturated_fat_coefficient(), 0.0007, 0.00001);
    }

    //saturated_fat_coefficient
    @Test
    public void test_saturated_fat_coefficient() {
        assertEquals(food.get_saturated_fat_coefficient(), 0.0011, 0.00001);
    }

    //complete_protein_coefficient
    @Test
    public void test_complete_protein_coefficient() {
        assertEquals(food.get_complete_protein_coefficient(), 0.0, 0.00001);
    }

    //calcium_coefficient
    @Test
    public void test_calcium_coefficient() {
        assertEquals(food.get_calcium_coefficient(), 0.05, 0.00001);
    }

    //copper_coefficient
    @Test
    public void test_copper_coefficient() {
        assertEquals(food.get_copper_coefficient(), 0.0007, 0.00001);
    }

    //fluoride_coefficient
    @Test
    public void test_fluoride_coefficient() {
        assertEquals(food.get_fluoride_coefficient(), 0.02200, 0.00001);
    }

    //iron_coefficient
    @Test
    public void test_iron_coefficient() {
        assertEquals(food.get_iron_coefficient(), 0.0026, 0.00001);
    }

    //magnesium_coefficient
    @Test
    public void test_magnesium_coefficient() {
        assertEquals(food.get_magnesium_coefficient(), 0.27, 0.00001);
    }

    //manganese_coefficient
    @Test
    public void test_manganese_coefficient() {
        assertEquals(food.get_manganese_coefficient(), 0.0027, 0.00001);
    }

    //phosphorus_coefficient
    @Test
    public void test_phosphorus_coefficient() {
        assertEquals(food.get_phosphorus_coefficient(), 0.22, 0.00001);
    }

    //potassium_coefficient
    @Test
    public void test_potassium_coefficient() {
        assertEquals(food.get_potassium_coefficient(), 3.58, 0.00001);
    }

    //selenium_coefficient
    @Test
    public void test_selenium_coefficient() {
        assertEquals(food.get_selenium_coefficient(), 0.01, 0.00001);
    }

    //sodium_coefficient
    @Test
    public void test_sodium_coefficient() {
        assertEquals(food.get_sodium_coefficient(), 0.01, 0.00001);
    }

    //zinc_coefficient
    @Test
    public void test_zinc_coefficient() {
        assertEquals(food.get_zinc_coefficient(), 0.0015, 0.00001);
    }

    //folate_coefficient
    @Test
    public void test_folate_coefficient() {
        assertEquals(food.get_folate_coefficient(), 0.2, 0.00001);
    }

    //niacin_coefficient
    @Test
    public void test_niacin_coefficient() {
        assertEquals(food.get_niacin_coefficient(), 0.0066, 0.00001);
    }

    //pantothenic_acid_coefficient
    @Test
    public void test_pantothenic_acid_coefficient() {
        assertEquals(food.get_pantothenic_acid_coefficient(), 0.0033, 0.00001);
    }

    //riboflavin_coefficient
    @Test
    public void test_riboflavin_coefficient() {
        assertEquals(food.get_riboflavin_coefficient(), 0.0007, 0.00001);
    }

    //thiamin_coefficient
    @Test
    public void test_thiamin_coefficient() {
        assertEquals(food.get_thiamin_coefficient(), 0.0003, 0.00001);
    }

    //vitamin_a_coefficient
    @Test
    public void test_vitamin_a_coefficient() {
        assertEquals(food.get_vitamin_a_coefficient(), 0.03, 0.00001);
    }

    //vitamin_b12_coefficient
    @Test
    public void test_vitamin_b12_coefficient() {
        assertEquals(food.get_vitamin_b12_coefficient(), 0.0, 0.00001);
    }

    //vitamin_b6_coefficient
    @Test
    public void test_vitamin_b6_coefficient() {
        assertEquals(food.get_vitamin_b6_coefficient(), 0.0036, 0.00001);
    }

    //vitamin_c_coefficient
    @Test
    public void test_vitamin_c_coefficient() {
        assertEquals(food.get_vitamin_c_coefficient(), 0.087, 0.00001);
    }

    //vitamin_d_coefficient
    @Test
    public void test_vitamin_d_coefficient() {
        assertEquals(food.get_vitamin_d_coefficient(), 0.0, 0.00001);
    }

    //vitamin_e_coefficient
    @Test
    public void test_vitamin_e_coefficient() {
        assertEquals(food.get_vitamin_e_coefficient(), 0.001, 0.00001);
    }

    //vitamin_k_coefficient
    @Test
    public void test_vitamin_k_coefficient() {
        assertEquals(food.get_vitamin_k_coefficient(), 0.005, 0.00001);
    }

    //choline_coefficient
    @Test
    public void test_choline_coefficient() {
        assertEquals(food.get_choline_coefficient(), 0.098, 0.00001);
    }

    //glycemic_load_coefficient
    @Test
    public void test_glycemic_load_coefficient() {
        assertEquals(food.get_glycemic_load_coefficient(), 0.10524, 0.00001);
    }

    //alphalinolenic_acid_coefficient
    @Test
    public void test_alpha_linolenic_acid_coefficient() {
        assertEquals(food.get_alpha_linolenic_acid_coefficient(), 0.0, 0.00001);
    }

    //linoleic_acid_coefficient
    @Test
    public void test_linoleic_acid_coefficient() {
        assertEquals(food.get_linoleic_acid_coefficient(), 0.0, 0.00001);
    }

    //dha_coefficient
    @Test
    public void test_dha_coefficient() {
        assertEquals(food.get_dha_coefficient(), 0.0, 0.00001);
    }

    //epa_coefficient
    @Test
    public void test_epa_coefficient() {
        assertEquals(food.get_epa_coefficient(), 0.0, 0.00001);
    }

    //water_coefficient
    @Test
    public void test_water_coefficient() {
        assertEquals(food.get_water_coefficient(), 0.7491, 0.00001);
    }

    //cost_coefficient
    @Test
    public void test_cost_coefficient() {
        assertEquals(food.get_cost_coefficient(), 0.0, 0.00001);
    }

    //energy_alcohol_coefficient
    @Test
    public void test_energy_alcohol_coefficient() {
        assertEquals(food.get_energy_alcohol_coefficient(), 0.0, 0.00001);
    }

    //energy_digestible_coefficient
    @Test
    public void test_energy_digestible_coefficient() {
        assertEquals(food.get_energy_digestible_coefficient(), 0.88289, 0.00001);
    }

    //energy_fat_coefficient
    @Test
    public void test_energy_fat_coefficient() {
        assertEquals(food.get_energy_fat_coefficient(), 0.0297, 0.00001);
    }

    //energy_protein_coefficient
    @Test
    public void test_energy_protein_coefficient() {
        assertEquals(food.get_energy_protein_coefficient(), .0436, 0.00001);
    }

    //digestible_carbohydrate
    @Test
    public void test_digestible_carbohydrate() {
        assertEquals(food.get_digestible_carbohydrate(), 20.24, 0.00001);
    }

    //food_quotient
    @Test
    public void test_food_quotient() {
        assertEquals(food.get_food_quotient(), 0.98086, 0.00001);
    }

}
