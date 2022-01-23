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

import io.github.xjrga.foods.data.Fruits_and_fruit_juices.Bananas_raw;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Nutrient_bananas_raw_Test {

    private static Interface_food food;

    public Nutrient_bananas_raw_Test() {
    }

    @BeforeClass
    public static void one_time_setup() {
        food = new Bananas_raw();
    }

    //food_name
    @Test
    public void test_food_name() {
        assertEquals("Bananas, raw", food.get_food_name());
    }

    //food_label
    @Test
    public void test_food_label() {
        assertEquals("Bananas_raw", food.get_food_label());
    }

    //Alcohol, ethyl (g)
    @Test
    public void test_alcohol() {
        assertEquals(0.0, food.get_alcohol_in_grams(), 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test
    public void test_alpha_linolenic_acid() {
        assertEquals(0.0, food.get_alpha_linolenic_acid_in_grams(), 0.00001);
    }

    //calcium
    @Test
    public void test_calcium() {
        assertEquals(5.0, food.get_calcium_in_milligrams(), 0.00001);
    }

    //carbohydrate_by_difference
    @Test
    public void test_carbohydrate_by_difference() {
        assertEquals(22.84, food.get_carbohydrate_by_difference_in_grams(), 0.00001);
    }

    //cholesterol
    @Test
    public void test_cholesterol() {
        assertEquals(0.0, food.get_cholesterol_in_milligrams(), 0.00001);
    }

    //choline
    @Test
    public void test_choline() {
        assertEquals(9.8, food.get_choline_in_milligrams(), 0.00001);
    }

    //complete_protein
    @Test
    public void test_complete_protein() {
        assertEquals(0.0, food.get_complete_protein_in_grams(), 0.00001);
    }

    //copper
    @Test
    public void test_copper() {
        assertEquals(0.078, food.get_copper_in_milligrams(), 0.00001);
    }

    //cost
    @Test
    public void test_cost() {
        assertEquals(0.0, food.get_cost_in_dollars(), 0.00001);
    }

    //dha
    @Test
    public void test_dha() {
        assertEquals(0.0, food.get_dha_in_grams(), 0.00001);
    }

    //epa
    @Test
    public void test_epa() {
        assertEquals(0.0, food.get_epa_in_grams(), 0.00001);
    }

    //fat
    @Test
    public void test_fat() {
        assertEquals(0.33, food.get_fat_in_grams(), 0.00001);
    }

    //fiber
    @Test
    public void test_fiber() {
        assertEquals(2.6, food.get_fiber_in_grams(), 0.00001);
    }

    //fluoride
    @Test
    public void test_fluoride() {
        assertEquals(2.2, food.get_fluoride_in_micrograms(), 0.00001);
    }

    //folate
    @Test
    public void test_folate() {
        assertEquals(20.0, food.get_folate_in_micrograms(), 0.00001);
    }

    //glycemic_index
    @Test
    public void test_glycemic_index() {
        assertEquals(52.0, food.get_glycemic_index(), 0.00001);
    }

    //energy_gross
    @Test
    public void test_energy_gross() {
        assertEquals(89.0, food.get_energy_gross_in_kilocalories(), 0.00001);
    }

    //iron
    @Test
    public void test_iron() {
        assertEquals(0.26, food.get_iron_in_milligrams(), 0.00001);
    }

    //linoleic_acid
    @Test
    public void test_linoleic_acid() {
        assertEquals(0.0, food.get_linoleic_acid_in_grams(), 0.00001);
    }

    //magnesium
    @Test
    public void test_magnesium() {
        assertEquals(27.0, food.get_magnesium_in_milligrams(), 0.00001);
    }

    //manganese
    @Test
    public void test_manganese() {
        assertEquals(0.27, food.get_manganese_in_milligrams(), 0.00001);
    }

    //monounsaturated_fat
    @Test
    public void test_monounsaturated_fat() {
        assertEquals(0.032, food.get_monounsaturated_fat_in_grams(), 0.00001);
    }

    //niacin
    @Test
    public void test_niacin() {
        assertEquals(0.665, food.get_niacin_in_milligrams(), 0.00001);
    }

    //pantothenic_acid
    @Test
    public void test_pantothenic_acid() {
        assertEquals(0.334, food.get_pantothenic_acid_in_milligrams(), 0.00001);
    }

    //phosphorus
    @Test
    public void test_phosphorus() {
        assertEquals(22.0, food.get_phosphorus_in_milligrams(), 0.00001);
    }

    //polyunsaturated_fat
    @Test
    public void test_polyunsaturated_fat() {
        assertEquals(0.073, food.get_polyunsaturated_fat_in_grams(), 0.00001);
    }

    //potassium
    @Test
    public void test_potassium() {
        assertEquals(358.0, food.get_potassium_in_milligrams(), 0.00001);
    }

    //protein
    @Test
    public void test_protein() {
        assertEquals(1.09, food.get_protein_in_grams(), 0.00001);
    }

    //riboflavin
    @Test
    public void test_riboflavin() {
        assertEquals(0.073, food.get_riboflavin_in_milligrams(), 0.00001);
    }

    //saturated_fat
    @Test
    public void test_saturated_fat() {
        assertEquals(0.112, food.get_saturated_fat_in_grams(), 0.00001);
    }

    //selenium
    @Test
    public void test_selenium() {
        assertEquals(1.0, food.get_selenium_in_micrograms(), 0.00001);
    }

    //sodium
    @Test
    public void test_sodium() {
        assertEquals(1.0, food.get_sodium_in_milligrams(), 0.00001);
    }

    //thiamin
    @Test
    public void test_thiamin() {
        assertEquals(0.031, food.get_thiamin_in_milligrams(), 0.00001);
    }

    //vitamin_a
    @Test
    public void test_vitamin_a() {
        assertEquals(3.0, food.get_vitamin_a_in_micrograms(), 0.00001);
    }

    //vitamin_b12
    @Test
    public void test_vitamin_b12() {
        assertEquals(0.0, food.get_vitamin_b12_in_micrograms(), 0.00001);
    }

    //vitamin_b6
    @Test
    public void test_vitamin_b6() {
        assertEquals(0.367, food.get_vitamin_b6_in_milligrams(), 0.00001);
    }

    //vitamin_c
    @Test
    public void test_vitamin_c() {
        assertEquals(8.7, food.get_vitamin_c_in_milligrams(), 0.00001);
    }

    //vitamin_d
    @Test
    public void test_vitamin_d() {
        assertEquals(0.0, food.get_vitamin_d_in_micrograms(), 0.00001);
    }

    //vitamin_e
    @Test
    public void test_vitamin_e() {
        assertEquals(0.1, food.get_vitamin_e_in_milligrams(), 0.00001);
    }

    //vitamin_k
    @Test
    public void test_vitamin_k() {
        assertEquals(0.5, food.get_vitamin_k_in_micrograms(), 0.00001);
    }

    //water
    @Test
    public void test_water() {
        assertEquals(74.91, food.get_water_in_grams(), 0.00001);
    }

    //weight
    @Test
    public void test_weight() {
        assertEquals(100.0, food.get_weight_in_grams(), 0.00001);
    }

    //zinc
    @Test
    public void test_zinc() {
        assertEquals(0.15, food.get_zinc_in_milligrams(), 0.00001);
    }

    //glycemic load
    @Test
    public void test_glycemic_load() {
        assertEquals(10.52479, food.get_glycemic_load(), 0.00001);
    }

    //energy_alcohol
    @Test
    public void test_energy_alcohol() {
        assertEquals(0.0, food.get_energy_alcohol_in_kilocalories(), 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test
    public void test_energy_digestible_carbohydrate() {
        assertEquals(72.86399, food.get_energy_digestible_carbohydrate_in_kilocalories(), 0.00001);
    }

    //energy_digestible_carbohydrate_coefficient
    @Test
    public void test_energy_digestible_carbohydrate_coefficient() {
        assertEquals(0.72864, food.get_energy_digestible_carbohydrate_coefficient(), 0.00001);
    }

    //energy_digestible
    @Test
    public void test_energy_digestible() {
        assertEquals(79.28849, food.get_energy_digestible_in_kilocalories(), 0.00001);
    }

    //energy_fat
    @Test
    public void test_energy_fat() {
        assertEquals(2.76209, food.get_energy_fat_in_kilocalories(), 0.00001);
    }

    //energy_protein
    @Test
    public void test_energy_protein() {
        assertEquals(3.66240, food.get_energy_protein_in_kilocalories(), 0.00001);
    }

    //
    @Test
    public void test_energy_gross_coefficient() {
        assertEquals(0.89, food.get_energy_gross_in_kilocalories_coefficient(), 0.00001);
    }

    //
    @Test
    public void test_protein_coefficient() {
        assertEquals(0.0109, food.get_protein_coefficient(), 0.00001);
    }

    //
    @Test
    public void test_carbohydrate_by_difference_coefficient() {
        assertEquals(0.2284, food.get_carbohydrate_by_difference_coefficient(), 0.00001);
    }

    //
    @Test
    public void test_fiber_coefficient() {
        assertEquals(0.02600, food.get_fiber_coefficient(), 0.00001);
    }

    //fat_coefficient
    @Test
    public void test_fat_coefficient() {
        assertEquals(0.0033, food.get_fat_coefficient(), 0.00001);
    }

    //alcohol_coefficient
    @Test
    public void test_alcohol_coefficient() {
        assertEquals(0.0, food.get_alcohol_coefficient(), 0.00001);
    }

    //digestible_carbohydrate_coefficient
    @Test
    public void test_digestible_carbohydrate_coefficient() {
        assertEquals(0.2024, food.get_digestible_carbohydrate_coefficient(), 0.00001);
    }

    //cholesterol_coefficient
    @Test
    public void test_cholesterol_coefficient() {
        assertEquals(0.0, food.get_cholesterol_coefficient(), 0.00001);
    }

    //monounsaturated_fat_coefficient
    @Test
    public void test_monounsaturated_fat_coefficient() {
        assertEquals(0.00032, food.get_monounsaturated_fat_coefficient(), 0.00001);
    }

    //polyunsaturated_fat_coefficient
    @Test
    public void test_polyunsaturated_fat_coefficient() {
        assertEquals(0.00073, food.get_polyunsaturated_fat_coefficient(), 0.00001);
    }

    //saturated_fat_coefficient
    @Test
    public void test_saturated_fat_coefficient() {
        assertEquals(0.00112, food.get_saturated_fat_coefficient(), 0.00001);
    }

    //complete_protein_coefficient
    @Test
    public void test_complete_protein_coefficient() {
        assertEquals(0.0, food.get_complete_protein_coefficient(), 0.00001);
    }

    //calcium_coefficient
    @Test
    public void test_calcium_coefficient() {
        assertEquals(0.05, food.get_calcium_coefficient(), 0.00001);
    }

    //copper_coefficient
    @Test
    public void test_copper_coefficient() {
        assertEquals(0.00078, food.get_copper_coefficient(), 0.00001);
    }

    //fluoride_coefficient
    @Test
    public void test_fluoride_coefficient() {
        assertEquals(0.02200, food.get_fluoride_coefficient(), 0.00001);
    }

    //iron_coefficient
    @Test
    public void test_iron_coefficient() {
        assertEquals(0.0026, food.get_iron_coefficient(), 0.00001);
    }

    //magnesium_coefficient
    @Test
    public void test_magnesium_coefficient() {
        assertEquals(0.27, food.get_magnesium_coefficient(), 0.00001);
    }

    //manganese_coefficient
    @Test
    public void test_manganese_coefficient() {
        assertEquals(0.0027, food.get_manganese_coefficient(), 0.00001);
    }

    //phosphorus_coefficient
    @Test
    public void test_phosphorus_coefficient() {
        assertEquals(0.22, food.get_phosphorus_coefficient(), 0.00001);
    }

    //potassium_coefficient
    @Test
    public void test_potassium_coefficient() {
        assertEquals(3.58, food.get_potassium_coefficient(), 0.00001);
    }

    //selenium_coefficient
    @Test
    public void test_selenium_coefficient() {
        assertEquals(0.01, food.get_selenium_coefficient(), 0.00001);
    }

    //sodium_coefficient
    @Test
    public void test_sodium_coefficient() {
        assertEquals(0.01, food.get_sodium_coefficient(), 0.00001);
    }

    //zinc_coefficient
    @Test
    public void test_zinc_coefficient() {
        assertEquals(0.0015, food.get_zinc_coefficient(), 0.00001);
    }

    //folate_coefficient
    @Test
    public void test_folate_coefficient() {
        assertEquals(0.2, food.get_folate_coefficient(), 0.00001);
    }

    //niacin_coefficient
    @Test
    public void test_niacin_coefficient() {
        assertEquals(0.00665, food.get_niacin_coefficient(), 0.00001);
    }

    //pantothenic_acid_coefficient
    @Test
    public void test_pantothenic_acid_coefficient() {
        assertEquals(0.00334, food.get_pantothenic_acid_coefficient(), 0.00001);
    }

    //riboflavin_coefficient
    @Test
    public void test_riboflavin_coefficient() {
        assertEquals(0.00073, food.get_riboflavin_coefficient(), 0.00001);
    }

    //thiamin_coefficient
    @Test
    public void test_thiamin_coefficient() {
        assertEquals(0.00031, food.get_thiamin_coefficient(), 0.00001);
    }

    //vitamin_a_coefficient
    @Test
    public void test_vitamin_a_coefficient() {
        assertEquals(0.03, food.get_vitamin_a_coefficient(), 0.00001);
    }

    //vitamin_b12_coefficient
    @Test
    public void test_vitamin_b12_coefficient() {
        assertEquals(0.0, food.get_vitamin_b12_coefficient(), 0.00001);
    }

    //vitamin_b6_coefficient
    @Test
    public void test_vitamin_b6_coefficient() {
        assertEquals(0.00367, food.get_vitamin_b6_coefficient(), 0.00001);
    }

    //vitamin_c_coefficient
    @Test
    public void test_vitamin_c_coefficient() {
        assertEquals(0.087, food.get_vitamin_c_coefficient(), 0.00001);
    }

    //vitamin_d_coefficient
    @Test
    public void test_vitamin_d_coefficient() {
        assertEquals(0.0, food.get_vitamin_d_coefficient(), 0.00001);
    }

    //vitamin_e_coefficient
    @Test
    public void test_vitamin_e_coefficient() {
        assertEquals(0.001, food.get_vitamin_e_coefficient(), 0.00001);
    }

    //vitamin_k_coefficient
    @Test
    public void test_vitamin_k_coefficient() {
        assertEquals(0.005, food.get_vitamin_k_coefficient(), 0.00001);
    }

    //choline_coefficient
    @Test
    public void test_choline_coefficient() {
        assertEquals(0.098, food.get_choline_coefficient(), 0.00001);
    }

    //glycemic_load_coefficient
    @Test
    public void test_glycemic_load_coefficient() {
        assertEquals(0.10524, food.get_glycemic_load_coefficient(), 0.00001);
    }

    //alphalinolenic_acid_coefficient
    @Test
    public void test_alpha_linolenic_acid_coefficient() {
        assertEquals(0.0, food.get_alpha_linolenic_acid_coefficient(), 0.00001);
    }

    //linoleic_acid_coefficient
    @Test
    public void test_linoleic_acid_coefficient() {
        assertEquals(0.0, food.get_linoleic_acid_coefficient(), 0.00001);
    }

    //dha_coefficient
    @Test
    public void test_dha_coefficient() {
        assertEquals(0.0, food.get_dha_coefficient(), 0.00001);
    }

    //epa_coefficient
    @Test
    public void test_epa_coefficient() {
        assertEquals(0.0, food.get_epa_coefficient(), 0.00001);
    }

    //water_coefficient
    @Test
    public void test_water_coefficient() {
        assertEquals(0.7491, food.get_water_coefficient(), 0.00001);
    }

    //cost_coefficient
    @Test
    public void test_cost_coefficient() {
        assertEquals(0.0, food.get_cost_coefficient(), 0.00001);
    }

    //energy_alcohol_coefficient
    @Test
    public void test_energy_alcohol_coefficient() {
        assertEquals(0.0, food.get_energy_alcohol_coefficient(), 0.00001);
    }

    //energy_digestible_coefficient
    @Test
    public void test_energy_digestible_coefficient() {
        assertEquals(0.79288, food.get_energy_digestible_coefficient(), 0.00001);
    }

    //energy_fat_coefficient
    @Test
    public void test_energy_fat_coefficient() {
        assertEquals(0.02762, food.get_energy_fat_coefficient(), 0.00001);
    }

    //energy_protein_coefficient
    @Test
    public void test_energy_protein_coefficient() {
        assertEquals(.03662, food.get_energy_protein_coefficient(), 0.00001);
    }

    //digestible_carbohydrate
    @Test
    public void test_digestible_carbohydrate() {
        assertEquals(20.24, food.get_digestible_carbohydrate_in_grams(), 0.00001);
    }

    //food_quotient
    @Test
    public void test_food_quotient() {
        assertEquals(0.98112, food.get_food_quotient(), 0.00001);
    }

}
