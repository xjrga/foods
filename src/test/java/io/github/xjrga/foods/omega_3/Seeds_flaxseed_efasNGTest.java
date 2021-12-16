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
package io.github.xjrga.foods.omega_3;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Seeds_flaxseed_efasNGTest {

    private static Seeds_flaxseed_efas food;

    public Seeds_flaxseed_efasNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        food = new Seeds_flaxseed_efas();
    }

    //food_name
    @Test(enabled = true)
    public void test_food_name() {
        assertEquals(food.get_food_name(), "Seeds, flaxseed (EFAs)");
    }

    //food_label
    @Test(enabled = true)
    public void test_food_label() {
        assertEquals(food.get_food_label(), "seeds_flaxseed_efas");
    }

    //Alcohol, ethyl (g)
    @Test(enabled = true)
    public void test_alcohol() {
        assertEquals(food.get_alcohol(), 0.0, 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test(enabled = true)
    public void test_alpha_linolenic_acid() {
        assertEquals(food.get_alpha_linolenic_acid(), 24.4528, 0.00001);
    }

    //calcium
    @Test(enabled = true)
    public void test_calcium() {
        assertEquals(food.get_calcium(), 255.0, 0.00001);
    }

    //carbohydrate_by_difference
    @Test(enabled = true)
    public void test_carbohydrate_by_difference() {
        assertEquals(food.get_carbohydrate_by_difference(), 28.88, 0.00001);
    }

    //cholesterol
    @Test(enabled = true)
    public void test_cholesterol() {
        assertEquals(food.get_cholesterol(), 0.0, 0.00001);
    }

    //choline
    @Test(enabled = true)
    public void test_choline() {
        assertEquals(food.get_choline(), 78.7, 0.00001);
    }

    //complete_protein
    @Test(enabled = true)
    public void test_complete_protein() {
        assertEquals(food.get_complete_protein(), 0.0, 0.00001);
    }

    //copper
    @Test(enabled = true)
    public void test_copper() {
        assertEquals(food.get_copper(), 1.22, 0.00001);
    }

    //cost
    @Test(enabled = true)
    public void test_cost() {
        assertEquals(food.get_cost(), 0.0, 0.00001);
    }

    //dha
    @Test(enabled = true)
    public void test_dha() {
        assertEquals(food.get_dha(), 0.0, 0.00001);
    }

    //epa
    @Test(enabled = true)
    public void test_epa() {
        assertEquals(food.get_epa(), 0.0, 0.00001);
    }

    //fat
    @Test(enabled = true)
    public void test_fat() {
        assertEquals(food.get_fat(), 42.16, 0.00001);
    }

    //fiber
    @Test(enabled = true)
    public void test_fiber() {
        assertEquals(food.get_fiber(), 27.3, 0.00001);
    }

    //fluoride
    @Test(enabled = true)
    public void test_fluoride() {
        assertEquals(food.get_fluoride(), 0.0, 0.00001);
    }

    //folate
    @Test(enabled = true)
    public void test_folate() {
        assertEquals(food.get_folate(), 87.0, 0.00001);
    }

    //glycemic_index
    @Test(enabled = true)
    public void test_glycemic_index() {
        assertEquals(food.get_glycemic_index(), 0.0, 0.00001);
    }

    //energy_gross
    @Test(enabled = true)
    public void test_energy_gross() {
        assertEquals(food.get_energy_gross(), 534.0, 0.00001);
    }

    //iron
    @Test(enabled = true)
    public void test_iron() {
        assertEquals(food.get_iron(), 5.73, 0.00001);
    }

    //linoleic_acid
    @Test(enabled = true)
    public void test_linoleic_acid() {
        assertEquals(food.get_linoleic_acid(), 6.02888, 0.00001);
    }

    //magnesium
    @Test(enabled = true)
    public void test_magnesium() {
        assertEquals(food.get_magnesium(), 392.0, 0.00001);
    }

    //manganese
    @Test(enabled = true)
    public void test_manganese() {
        assertEquals(food.get_manganese(), 2.48, 0.00001);
    }

    //monounsaturated_fat
    @Test(enabled = true)
    public void test_monounsaturated_fat() {
        assertEquals(food.get_monounsaturated_fat(), 7.52, 0.00001);
    }

    //niacin
    @Test(enabled = true)
    public void test_niacin() {
        assertEquals(food.get_niacin(), 3.08, 0.00001);
    }

    //pantothenic_acid
    @Test(enabled = true)
    public void test_pantothenic_acid() {
        assertEquals(food.get_pantothenic_acid(), 0.98, 0.00001);
    }

    //phosphorus
    @Test(enabled = true)
    public void test_phosphorus() {
        assertEquals(food.get_phosphorus(), 642.0, 0.00001);
    }

    //polyunsaturated_fat
    @Test(enabled = true)
    public void test_polyunsaturated_fat() {
        assertEquals(food.get_polyunsaturated_fat(), 28.73, 0.00001);
    }

    //potassium
    @Test(enabled = true)
    public void test_potassium() {
        assertEquals(food.get_potassium(), 813.0, 0.00001);
    }

    //protein
    @Test(enabled = true)
    public void test_protein() {
        assertEquals(food.get_protein(), 18.29, 0.00001);
    }

    //riboflavin
    @Test(enabled = true)
    public void test_riboflavin() {
        assertEquals(food.get_riboflavin(), 0.16, 0.00001);
    }

    //saturated_fat
    @Test(enabled = true)
    public void test_saturated_fat() {
        assertEquals(food.get_saturated_fat(), 3.66, 0.00001);
    }

    //selenium
    @Test(enabled = true)
    public void test_selenium() {
        assertEquals(food.get_selenium(), 25.4, 0.00001);
    }

    //sodium
    @Test(enabled = true)
    public void test_sodium() {
        assertEquals(food.get_sodium(), 30.0, 0.00001);
    }

    //thiamin
    @Test(enabled = true)
    public void test_thiamin() {
        assertEquals(food.get_thiamin(), 1.64, 0.00001);
    }

    //vitamin_a
    @Test(enabled = true)
    public void test_vitamin_a() {
        assertEquals(food.get_vitamin_a(), 0.0, 0.00001);
    }

    //vitamin_b12
    @Test(enabled = true)
    public void test_vitamin_b12() {
        assertEquals(food.get_vitamin_b12(), 0.0, 0.00001);
    }

    //vitamin_b6
    @Test(enabled = true)
    public void test_vitamin_b6() {
        assertEquals(food.get_vitamin_b6(), 0.47, 0.00001);
    }

    //vitamin_c
    @Test(enabled = true)
    public void test_vitamin_c() {
        assertEquals(food.get_vitamin_c(), 0.6, 0.00001);
    }

    //vitamin_d
    @Test(enabled = true)
    public void test_vitamin_d() {
        assertEquals(food.get_vitamin_d(), 0.0, 0.00001);
    }

    //vitamin_e
    @Test(enabled = true)
    public void test_vitamin_e() {
        assertEquals(food.get_vitamin_e(), 0.31, 0.00001);
    }

    //vitamin_k
    @Test(enabled = true)
    public void test_vitamin_k() {
        assertEquals(food.get_vitamin_k(), 4.3, 0.00001);
    }

    //water
    @Test(enabled = true)
    public void test_water() {
        assertEquals(food.get_water(), 6.96, 0.00001);
    }

    //weight
    @Test(enabled = true)
    public void test_weight() {
        assertEquals(food.get_weight(), 100.0, 0.00001);
    }

    //zinc
    @Test(enabled = true)
    public void test_zinc() {
        assertEquals(food.get_zinc(), 4.34, 0.00001);
    }

    //glycemic load
    @Test(enabled = true)
    public void test_glycemic_load() {
        assertEquals(food.get_glycemic_load(), 0.0, 0.00001);
    }

    //energy_alcohol
    @Test(enabled = true)
    public void test_energy_alcohol() {
        assertEquals(food.get_energy_alcohol(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test(enabled = true)
    public void test_energy_digestible_carbohydrate() {
        assertEquals(food.get_energy_digestible_carbohydrate(), 6.31999, 0.00001);
    }

    //energy_digestible_carbohydrate_coefficient
    @Test(enabled = true)
    public void test_energy_digestible_carbohydrate_coefficient() {
        assertEquals(food.get_energy_digestible_carbohydrate_coefficient(), 0.06319, 0.00001);
    }

    //energy_digestible
    @Test(enabled = true)
    public void test_energy_digestible() {
        assertEquals(food.get_energy_digestible(), 458.91999, 0.00001);
    }

    //energy_fat
    @Test(enabled = true)
    public void test_energy_fat() {
        assertEquals(food.get_energy_fat(), 379.43999, 0.00001);
    }

    //energy_no_protein
    @Test(enabled = true)
    public void test_energy_no_protein() {
        assertEquals(food.get_energy_no_protein(), 385.75999, 0.00001);
    }

    //energy_protein
    @Test(enabled = true)
    public void test_energy_protein() {
        assertEquals(food.get_energy_protein(), 73.16, 0.00001);
    }

    //
    @Test(enabled = true)
    public void test_energy_gross_coefficient() {
        assertEquals(food.get_energy_gross_coefficient(), 5.34, 0.00001);
    }

    //
    @Test(enabled = true)
    public void test_protein_coefficient() {
        assertEquals(food.get_protein_coefficient(), 0.18289, 0.00001);
    }

    //
    @Test(enabled = true)
    public void test_carbohydrate_by_difference_coefficient() {
        assertEquals(food.get_carbohydrate_by_difference_coefficient(), 0.2888, 0.00001);
    }

    //
    @Test(enabled = true)
    public void test_fiber_coefficient() {
        assertEquals(food.get_fiber_coefficient(), 0.273, 0.00001);
    }

    //fat_coefficient
    @Test(enabled = true)
    public void test_fat_coefficient() {
        assertEquals(food.get_fat_coefficient(), 0.4216, 0.00001);
    }

    //alcohol_coefficient
    @Test(enabled = true)
    public void test_alcohol_coefficient() {
        assertEquals(food.get_alcohol_coefficient(), 0.0, 0.00001);
    }

    //digestible_carbohydrate_coefficient
    @Test(enabled = true)
    public void test_digestible_carbohydrate_coefficient() {
        assertEquals(food.get_digestible_carbohydrate_coefficient(), 0.01579, 0.00001);
    }

    //cholesterol_coefficient
    @Test(enabled = true)
    public void test_cholesterol_coefficient() {
        assertEquals(food.get_cholesterol_coefficient(), 0.0, 0.00001);
    }

    //monounsaturated_fat_coefficient
    @Test(enabled = true)
    public void test_monounsaturated_fat_coefficient() {
        assertEquals(food.get_monounsaturated_fat_coefficient(), 0.07519, 0.00001);
    }

    //polyunsaturated_fat_coefficient
    @Test(enabled = true)
    public void test_polyunsaturated_fat_coefficient() {
        assertEquals(food.get_polyunsaturated_fat_coefficient(), 0.2873, 0.00001);
    }

    //saturated_fat_coefficient
    @Test(enabled = true)
    public void test_saturated_fat_coefficient() {
        assertEquals(food.get_saturated_fat_coefficient(), 0.0366, 0.00001);
    }

    //complete_protein_coefficient
    @Test(enabled = true)
    public void test_complete_protein_coefficient() {
        assertEquals(food.get_complete_protein_coefficient(), 0.0, 0.00001);
    }

    //calcium_coefficient
    @Test(enabled = true)
    public void test_calcium_coefficient() {
        assertEquals(food.get_calcium_coefficient(), 2.55, 0.00001);
    }

    //copper_coefficient
    @Test(enabled = true)
    public void test_copper_coefficient() {
        assertEquals(food.get_copper_coefficient(), 0.01219, 0.00001);
    }

    //fluoride_coefficient
    @Test(enabled = true)
    public void test_fluoride_coefficient() {
        assertEquals(food.get_fluoride_coefficient(), 0.0, 0.00001);
    }

    //iron_coefficient
    @Test(enabled = true)
    public void test_iron_coefficient() {
        assertEquals(food.get_iron_coefficient(), 0.05730, 0.00001);
    }

    //magnesium_coefficient
    @Test(enabled = true)
    public void test_magnesium_coefficient() {
        assertEquals(food.get_magnesium_coefficient(), 3.92, 0.00001);
    }

    //manganese_coefficient
    @Test(enabled = true)
    public void test_manganese_coefficient() {
        assertEquals(food.get_manganese_coefficient(), 0.0248, 0.00001);
    }

    //phosphorus_coefficient
    @Test(enabled = true)
    public void test_phosphorus_coefficient() {
        assertEquals(food.get_phosphorus_coefficient(), 6.42, 0.00001);
    }

    //potassium_coefficient
    @Test(enabled = true)
    public void test_potassium_coefficient() {
        assertEquals(food.get_potassium_coefficient(), 8.13, 0.00001);
    }

    //selenium_coefficient
    @Test(enabled = true)
    public void test_selenium_coefficient() {
        assertEquals(food.get_selenium_coefficient(), 0.254, 0.00001);
    }

    //sodium_coefficient
    @Test(enabled = true)
    public void test_sodium_coefficient() {
        assertEquals(food.get_sodium_coefficient(), 0.3, 0.00001);
    }

    //zinc_coefficient
    @Test(enabled = true)
    public void test_zinc_coefficient() {
        assertEquals(food.get_zinc_coefficient(), 0.0434, 0.00001);
    }

    //folate_coefficient
    @Test(enabled = true)
    public void test_folate_coefficient() {
        assertEquals(food.get_folate_coefficient(), 0.87, 0.00001);
    }

    //niacin_coefficient
    @Test(enabled = true)
    public void test_niacin_coefficient() {
        assertEquals(food.get_niacin_coefficient(), 0.0308, 0.00001);
    }

    //pantothenic_acid_coefficient
    @Test(enabled = true)
    public void test_pantothenic_acid_coefficient() {
        assertEquals(food.get_pantothenic_acid_coefficient(), 0.0098, 0.00001);
    }

    //riboflavin_coefficient
    @Test(enabled = true)
    public void test_riboflavin_coefficient() {
        assertEquals(food.get_riboflavin_coefficient(), 0.0016, 0.00001);
    }

    //thiamin_coefficient
    @Test(enabled = true)
    public void test_thiamin_coefficient() {
        assertEquals(food.get_thiamin_coefficient(), 0.01639, 0.00001);
    }

    //vitamin_a_coefficient
    @Test(enabled = true)
    public void test_vitamin_a_coefficient() {
        assertEquals(food.get_vitamin_a_coefficient(), 0.0, 0.00001);
    }

    //vitamin_b12_coefficient
    @Test(enabled = true)
    public void test_vitamin_b12_coefficient() {
        assertEquals(food.get_vitamin_b12_coefficient(), 0.0, 0.00001);
    }

    //vitamin_b6_coefficient
    @Test(enabled = true)
    public void test_vitamin_b6_coefficient() {
        assertEquals(food.get_vitamin_b6_coefficient(), 0.00469, 0.00001);
    }

    //vitamin_c_coefficient
    @Test(enabled = true)
    public void test_vitamin_c_coefficient() {
        assertEquals(food.get_vitamin_c_coefficient(), 0.006, 0.00001);
    }

    //vitamin_d_coefficient
    @Test(enabled = true)
    public void test_vitamin_d_coefficient() {
        assertEquals(food.get_vitamin_d_coefficient(), 0.0, 0.00001);
    }

    //vitamin_e_coefficient
    @Test(enabled = true)
    public void test_vitamin_e_coefficient() {
        assertEquals(food.get_vitamin_e_coefficient(), 0.0031, 0.00001);
    }

    //vitamin_k_coefficient
    @Test(enabled = true)
    public void test_vitamin_k_coefficient() {
        assertEquals(food.get_vitamin_k_coefficient(), 0.043, 0.00001);
    }

    //choline_coefficient
    @Test(enabled = true)
    public void test_choline_coefficient() {
        assertEquals(food.get_choline_coefficient(), 0.787, 0.00001);
    }

    //glycemic_load_coefficient
    @Test(enabled = true)
    public void test_glycemic_load_coefficient() {
        assertEquals(food.get_glycemic_load_coefficient(), 0.0, 0.00001);
    }

    //alphalinolenic_acid_coefficient
    @Test(enabled = true)
    public void test_alphalinolenic_acid_coefficient() {
        assertEquals(food.get_alphalinolenic_acid_coefficient(), 0.24452, 0.00001);
    }

    //linoleic_acid_coefficient
    @Test(enabled = true)
    public void test_linoleic_acid_coefficient() {
        assertEquals(food.get_linoleic_acid_coefficient(), 0.060288, 0.00001);
    }

    //dha_coefficient
    @Test(enabled = true)
    public void test_dha_coefficient() {
        assertEquals(food.get_dha_coefficient(), 0.0, 0.00001);
    }

    //epa_coefficient
    @Test(enabled = true)
    public void test_epa_coefficient() {
        assertEquals(food.get_epa_coefficient(), 0.0, 0.00001);
    }

    //water_coefficient
    @Test(enabled = true)
    public void test_water_coefficient() {
        assertEquals(food.get_water_coefficient(), 0.0696, 0.00001);
    }

    //cost_coefficient
    @Test(enabled = true)
    public void test_cost_coefficient() {
        assertEquals(food.get_cost_coefficient(), 0.0, 0.00001);
    }

    //energy_alcohol_coefficient
    @Test(enabled = true)
    public void test_energy_alcohol_coefficient() {
        assertEquals(food.get_energy_alcohol_coefficient(), 0.0, 0.00001);
    }

    //energy_digestible_coefficient
    @Test(enabled = true)
    public void test_energy_digestible_coefficient() {
        assertEquals(food.get_energy_digestible_coefficient(), 4.58919, 0.00001);
    }

    //energy_fat_coefficient
    @Test(enabled = true)
    public void test_energy_fat_coefficient() {
        assertEquals(food.get_energy_fat_coefficient(), 3.79439, 0.00001);
    }

    //energy_no_protein_coefficient
    @Test(enabled = true)
    public void test_energy_no_protein_coefficient() {
        assertEquals(food.get_energy_no_protein_coefficient(), 3.85759, 0.00001);
    }

    //energy_protein_coefficient
    @Test(enabled = true)
    public void test_energy_protein_coefficient() {
        assertEquals(food.get_energy_protein_coefficient(), 0.73159, 0.00001);
    }

    //digestible_carbohydrate
    @Test(enabled = true)
    public void test_digestible_carbohydrate() {
        assertEquals(food.get_digestible_carbohydrate(), 1.57999, 0.00001);
    }

}
