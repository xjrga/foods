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

import io.github.xjrga.foods.data.Finfish_and_shellfish_products;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_multiplier_using_food_enum_object_Test {

    private static Food_multiplier multiplier;

    public Food_multiplier_using_food_enum_object_Test() {
    }

    @BeforeClass
    public static void one_time_setup() {
        multiplier = new Food_multiplier(Finfish_and_shellfish_products.Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone, 100.0);
    }

    //food_name
    @Test
    public void test_food_name() {
        assertEquals(multiplier.get_food_name(), "Fish, sardine, Atlantic, canned in oil, drained solids with bone");
    }

    //food_label
    @Test
    public void test_food_label() {
        assertEquals(multiplier.get_food_label(), "Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone");
    }

    //Alcohol, ethyl (g)
    @Test
    public void test_alcohol() {
        assertEquals(multiplier.get_alcohol(), 0.0, 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test
    public void test_alpha_linolenic_acid() {
        assertEquals(multiplier.get_alpha_linolenic_acid(), 0.0, 0.00001);
    }

    //calcium
    @Test
    public void test_calcium() {
        assertEquals(multiplier.get_calcium(), 382.0, 0.00001);
    }

    //carbohydrate_by_difference
    @Test
    public void test_carbohydrate_by_difference() {
        assertEquals(multiplier.get_carbohydrate_by_difference(), 0.0, 0.00001);
    }

    //cholesterol
    @Test
    public void test_cholesterol() {
        assertEquals(multiplier.get_cholesterol(), 142.0, 0.00001);
    }

    //choline
    @Test
    public void test_choline() {
        assertEquals(multiplier.get_choline(), 75.00, 0.00001);
    }

    //complete_protein
    @Test
    public void test_complete_protein() {
        assertEquals(multiplier.get_complete_protein(), 24.62, 0.00001);
    }

    //copper
    @Test
    public void test_copper() {
        assertEquals(multiplier.get_copper(), 0.18, 0.00001);
    }

    //cost
    @Test
    public void test_cost() {
        assertEquals(multiplier.get_cost(), 0.0, 0.00001);
    }

    //dha
    @Test
    public void test_dha() {
        assertEquals(multiplier.get_dha(), 0.50, 0.00001);
    }

    //epa
    @Test
    public void test_epa() {
        assertEquals(multiplier.get_epa(), 0.47, 0.00001);
    }

    //fat
    @Test
    public void test_fat() {
        assertEquals(multiplier.get_fat(), 11.45, 0.00001);
    }

    //fiber
    @Test
    public void test_fiber() {
        assertEquals(multiplier.get_fiber(), 0.0, 0.00001);
    }

    //fluoride
    @Test
    public void test_fluoride() {
        assertEquals(multiplier.get_fluoride(), 0.0, 0.00001);
    }

    //folate
    @Test
    public void test_folate() {
        assertEquals(multiplier.get_folate(), 10.0, 0.00001);
    }

    //glycemic_index
    @Test
    public void test_glycemic_index() {
        assertEquals(multiplier.get_glycemic_index(), 0.0, 0.00001);
    }

    //energy_gross
    @Test
    public void test_energy_gross() {
        assertEquals(multiplier.get_energy_gross(), 208.0, 0.00001);
    }

    //iron
    @Test
    public void test_iron() {
        assertEquals(multiplier.get_iron(), 2.92, 0.00001);
    }

    //linoleic_acid
    @Test
    public void test_linoleic_acid() {
        assertEquals(multiplier.get_linoleic_acid(), 0.0, 0.00001);
    }

    //magnesium
    @Test
    public void test_magnesium() {
        assertEquals(multiplier.get_magnesium(), 39.0, 0.00001);
    }

    //manganese
    @Test
    public void test_manganese() {
        assertEquals(multiplier.get_manganese(), 0.10, 0.00001);
    }

    //monounsaturated_fat
    @Test
    public void test_monounsaturated_fat() {
        assertEquals(multiplier.get_monounsaturated_fat(), 3.86, 0.00001);
    }

    //niacin
    @Test
    public void test_niacin() {
        assertEquals(multiplier.get_niacin(), 5.24, 0.00001);
    }

    //pantothenic_acid
    @Test
    public void test_pantothenic_acid() {
        assertEquals(multiplier.get_pantothenic_acid(), 0.64, 0.00001);
    }

    //phosphorus
    @Test
    public void test_phosphorus() {
        assertEquals(multiplier.get_phosphorus(), 490.0, 0.00001);
    }

    //polyunsaturated_fat
    @Test
    public void test_polyunsaturated_fat() {
        assertEquals(multiplier.get_polyunsaturated_fat(), 5.14, 0.00001);
    }

    //potassium
    @Test
    public void test_potassium() {
        assertEquals(multiplier.get_potassium(), 397.0, 0.00001);
    }

    //protein
    @Test
    public void test_protein() {
        assertEquals(multiplier.get_protein(), 24.62, 0.00001);
    }

    //riboflavin
    @Test
    public void test_riboflavin() {
        assertEquals(multiplier.get_riboflavin(), 0.22, 0.00001);
    }

    //saturated_fat
    @Test
    public void test_saturated_fat() {
        assertEquals(multiplier.get_saturated_fat(), 1.52, 0.00001);
    }

    //selenium
    @Test
    public void test_selenium() {
        assertEquals(multiplier.get_selenium(), 52.70, 0.00001);
    }

    //sodium
    @Test
    public void test_sodium() {
        assertEquals(multiplier.get_sodium(), 307.0, 0.00001);
    }

    //thiamin
    @Test
    public void test_thiamin() {
        assertEquals(multiplier.get_thiamin(), 0.08, 0.00001);
    }

    //vitamin_a
    @Test
    public void test_vitamin_a() {
        assertEquals(multiplier.get_vitamin_a(), 32.0, 0.00001);
    }

    //vitamin_b12
    @Test
    public void test_vitamin_b12() {
        assertEquals(multiplier.get_vitamin_b12(), 8.94, 0.00001);
    }

    //vitamin_b6
    @Test
    public void test_vitamin_b6() {
        assertEquals(multiplier.get_vitamin_b6(), 0.16, 0.00001);
    }

    //vitamin_c
    @Test
    public void test_vitamin_c() {
        assertEquals(multiplier.get_vitamin_c(), 0.0, 0.00001);
    }

    //vitamin_d
    @Test
    public void test_vitamin_d() {
        assertEquals(multiplier.get_vitamin_d(), 4.8, 0.00001);
    }

    //vitamin_e
    @Test
    public void test_vitamin_e() {
        assertEquals(multiplier.get_vitamin_e(), 2.04, 0.00001);
    }

    //vitamin_k
    @Test
    public void test_vitamin_k() {
        assertEquals(multiplier.get_vitamin_k(), 2.60, 0.00001);
    }

    //water
    @Test
    public void test_water() {
        assertEquals(multiplier.get_water(), 59.61, 0.00001);
    }

    //weight
    @Test
    public void test_weight() {
        assertEquals(multiplier.get_weight(), 100.0, 0.00001);
    }

    //zinc
    @Test
    public void test_zinc() {
        assertEquals(multiplier.get_zinc(), 1.31, 0.00001);
    }

    //glycemic load
    @Test
    public void test_glycemic_load() {
        assertEquals(multiplier.get_glycemic_load(), 0.0, 0.00001);
    }

    //energy_alcohol
    @Test
    public void test_energy_alcohol() {
        assertEquals(multiplier.get_energy_alcohol(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test
    public void test_energy_digestible_carbohydrate() {
        assertEquals(multiplier.get_energy_digestible_carbohydrate(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate_coefficient
    @Test
    public void test_energy_digestible_carbohydrate_coefficient() {
        assertEquals(multiplier.get_energy_digestible_carbohydrate_coefficient(), 0.0, 0.00001);
    }

    //energy_digestible
    @Test
    public void test_energy_digestible() {
        assertEquals(multiplier.get_energy_digestible(), 201.53, 0.00001);
    }

    //energy_fat
    @Test
    public void test_energy_fat() {
        assertEquals(multiplier.get_energy_fat(), 103.05, 0.00001);
    }

    //energy_protein
    @Test
    public void test_energy_protein() {
        assertEquals(multiplier.get_energy_protein(), 98.48, 0.00001);
    }

    //
    @Test
    public void test_energy_gross_coefficient() {
        assertEquals(multiplier.get_energy_gross_coefficient(), 2.08, 0.00001);
    }

    //
    @Test
    public void test_protein_coefficient() {
        assertEquals(multiplier.get_protein_coefficient(), 0.2462, 0.00001);
    }

    //
    @Test
    public void test_carbohydrate_by_difference_coefficient() {
        assertEquals(multiplier.get_carbohydrate_by_difference_coefficient(), 0.0, 0.00001);
    }

    //
    @Test
    public void test_fiber_coefficient() {
        assertEquals(multiplier.get_fiber_coefficient(), 0.0, 0.00001);
    }

    //fat_coefficient
    @Test
    public void test_fat_coefficient() {
        assertEquals(multiplier.get_fat_coefficient(), .1145, 0.00001);
    }

    //alcohol_coefficient
    @Test
    public void test_alcohol_coefficient() {
        assertEquals(multiplier.get_alcohol_coefficient(), 0.0, 0.00001);
    }

    //digestible_carbohydrate_coefficient
    @Test
    public void test_digestible_carbohydrate_coefficient() {
        assertEquals(multiplier.get_digestible_carbohydrate_coefficient(), 0.0, 0.00001);
    }

    //cholesterol_coefficient
    @Test
    public void test_cholesterol_coefficient() {
        assertEquals(multiplier.get_cholesterol_coefficient(), 1.42, 0.00001);
    }

    //monounsaturated_fat_coefficient
    @Test
    public void test_monounsaturated_fat_coefficient() {
        assertEquals(multiplier.get_monounsaturated_fat_coefficient(), 0.0386, 0.00001);
    }

    //polyunsaturated_fat_coefficient
    @Test
    public void test_polyunsaturated_fat_coefficient() {
        assertEquals(multiplier.get_polyunsaturated_fat_coefficient(), 0.0514, 0.00001);
    }

    //saturated_fat_coefficient
    @Test
    public void test_saturated_fat_coefficient() {
        assertEquals(multiplier.get_saturated_fat_coefficient(), 0.0152, 0.00001);
    }

    //complete_protein_coefficient
    @Test
    public void test_complete_protein_coefficient() {
        assertEquals(multiplier.get_complete_protein_coefficient(), 0.2462, 0.00001);
    }

    //calcium_coefficient
    @Test
    public void test_calcium_coefficient() {
        assertEquals(multiplier.get_calcium_coefficient(), 3.82, 0.00001);
    }

    //copper_coefficient
    @Test
    public void test_copper_coefficient() {
        assertEquals(multiplier.get_copper_coefficient(), 0.0018, 0.00001);
    }

    //fluoride_coefficient
    @Test
    public void test_fluoride_coefficient() {
        assertEquals(multiplier.get_fluoride_coefficient(), 0.0, 0.00001);
    }

    //iron_coefficient
    @Test
    public void test_iron_coefficient() {
        assertEquals(multiplier.get_iron_coefficient(), 0.0292, 0.00001);
    }

    //magnesium_coefficient
    @Test
    public void test_magnesium_coefficient() {
        assertEquals(multiplier.get_magnesium_coefficient(), 0.39, 0.00001);
    }

    //manganese_coefficient
    @Test
    public void test_manganese_coefficient() {
        assertEquals(multiplier.get_manganese_coefficient(), 0.0010, 0.00001);
    }

    //phosphorus_coefficient
    @Test
    public void test_phosphorus_coefficient() {
        assertEquals(multiplier.get_phosphorus_coefficient(), 4.90, 0.00001);
    }

    //potassium_coefficient
    @Test
    public void test_potassium_coefficient() {
        assertEquals(multiplier.get_potassium_coefficient(), 3.97, 0.00001);
    }

    //selenium_coefficient
    @Test
    public void test_selenium_coefficient() {
        assertEquals(multiplier.get_selenium_coefficient(), 0.5270, 0.00001);
    }

    //sodium_coefficient
    @Test
    public void test_sodium_coefficient() {
        assertEquals(multiplier.get_sodium_coefficient(), 3.07, 0.00001);
    }

    //zinc_coefficient
    @Test
    public void test_zinc_coefficient() {
        assertEquals(multiplier.get_zinc_coefficient(), 0.0131, 0.00001);
    }

    //folate_coefficient
    @Test
    public void test_folate_coefficient() {
        assertEquals(multiplier.get_folate_coefficient(), 0.10, 0.00001);
    }

    //niacin_coefficient
    @Test
    public void test_niacin_coefficient() {
        assertEquals(multiplier.get_niacin_coefficient(), 0.0524, 0.00001);
    }

    //pantothenic_acid_coefficient
    @Test
    public void test_pantothenic_acid_coefficient() {
        assertEquals(multiplier.get_pantothenic_acid_coefficient(), 0.0064, 0.00001);
    }

    //riboflavin_coefficient
    @Test
    public void test_riboflavin_coefficient() {
        assertEquals(multiplier.get_riboflavin_coefficient(), 0.0022, 0.00001);
    }

    //thiamin_coefficient
    @Test
    public void test_thiamin_coefficient() {
        assertEquals(multiplier.get_thiamin_coefficient(), .0008, 0.00001);
    }

    //vitamin_a_coefficient
    @Test
    public void test_vitamin_a_coefficient() {
        assertEquals(multiplier.get_vitamin_a_coefficient(), 0.32, 0.00001);
    }

    //vitamin_b12_coefficient
    @Test
    public void test_vitamin_b12_coefficient() {
        assertEquals(multiplier.get_vitamin_b12_coefficient(), 0.0894, 0.00001);
    }

    //vitamin_b6_coefficient
    @Test
    public void test_vitamin_b6_coefficient() {
        assertEquals(multiplier.get_vitamin_b6_coefficient(), 0.0016, 0.00001);
    }

    //vitamin_c_coefficient
    @Test
    public void test_vitamin_c_coefficient() {
        assertEquals(multiplier.get_vitamin_c_coefficient(), 0.0, 0.00001);
    }

    //vitamin_d_coefficient
    @Test
    public void test_vitamin_d_coefficient() {
        assertEquals(multiplier.get_vitamin_d_coefficient(), 0.048, 0.00001);
    }

    //vitamin_e_coefficient
    @Test
    public void test_vitamin_e_coefficient() {
        assertEquals(multiplier.get_vitamin_e_coefficient(), 0.0204, 0.00001);
    }

    //vitamin_k_coefficient
    @Test
    public void test_vitamin_k_coefficient() {
        assertEquals(multiplier.get_vitamin_k_coefficient(), 0.0260, 0.00001);
    }

    //choline_coefficient
    @Test
    public void test_choline_coefficient() {
        assertEquals(multiplier.get_choline_coefficient(), 0.75, 0.00001);
    }

    //glycemic_load_coefficient
    @Test
    public void test_glycemic_load_coefficient() {
        assertEquals(multiplier.get_glycemic_load_coefficient(), 0.0, 0.00001);
    }

    //alphalinolenic_acid_coefficient
    @Test
    public void test_alpha_linolenic_acid_coefficient() {
        assertEquals(multiplier.get_alpha_linolenic_acid_coefficient(), 0.0, 0.00001);
    }

    //linoleic_acid_coefficient
    @Test
    public void test_linoleic_acid_coefficient() {
        assertEquals(multiplier.get_linoleic_acid_coefficient(), 0.0, 0.00001);
    }

    //dha_coefficient
    @Test
    public void test_dha_coefficient() {
        assertEquals(multiplier.get_dha_coefficient(), 0.0050, 0.00001);
    }

    //epa_coefficient
    @Test
    public void test_epa_coefficient() {
        assertEquals(multiplier.get_epa_coefficient(), 0.0047, 0.00001);
    }

    //water_coefficient
    @Test
    public void test_water_coefficient() {
        assertEquals(multiplier.get_water_coefficient(), 0.5961, 0.00001);
    }

    //cost_coefficient
    @Test
    public void test_cost_coefficient() {
        assertEquals(multiplier.get_cost_coefficient(), 0.0, 0.00001);
    }

    //energy_alcohol_coefficient
    @Test
    public void test_energy_alcohol_coefficient() {
        assertEquals(multiplier.get_energy_alcohol_coefficient(), 0.0, 0.00001);
    }

    //energy_digestible_coefficient
    @Test
    public void test_energy_digestible_coefficient() {
        assertEquals(multiplier.get_energy_digestible_coefficient(), 2.0153, 0.00001);
    }

    //energy_fat_coefficient
    @Test
    public void test_energy_fat_coefficient() {
        assertEquals(multiplier.get_energy_fat_coefficient(), 1.0305, 0.00001);
    }

    //energy_protein_coefficient
    @Test
    public void test_energy_protein_coefficient() {
        assertEquals(multiplier.get_energy_protein_coefficient(), .9848, 0.00001);
    }

    //digestible_carbohydrate
    @Test
    public void test_digestible_carbohydrate() {
        assertEquals(multiplier.get_digestible_carbohydrate(), 0.0, 0.00001);
    }

    //food_quotient
    @Test
    public void test_food_quotient() {
        assertEquals(multiplier.get_food_quotient(), 0.75886, 0.00001);
    }

    private static Food_mutable copy_sardine_values() {
        Finfish_and_shellfish_products f = Finfish_and_shellfish_products.Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone;
        Food_mutable food = new Food_mutable();
        food.set_food_name(f.get_food_name());
        food.set_food_label(f.get_food_label());
        food.set_weight(f.get_weight());
        food.set_complete_protein(f.get_complete_protein());
        food.set_cost(f.get_cost());
        food.set_glycemic_index(f.get_glycemic_index());
        food.set_protein(f.get_protein());
        food.set_fat(f.get_fat());
        food.set_carbohydrate_by_difference(f.get_carbohydrate_by_difference());
        food.set_energy_gross(f.get_energy_gross());
        food.set_alcohol(f.get_alcohol());
        food.set_water(f.get_water());
        food.set_fiber(f.get_fiber());
        food.set_calcium(f.get_calcium());
        food.set_iron(f.get_iron());
        food.set_magnesium(f.get_magnesium());
        food.set_phosphorus(f.get_phosphorus());
        food.set_potassium(f.get_potassium());
        food.set_sodium(f.get_sodium());
        food.set_zinc(f.get_zinc());
        food.set_copper(f.get_copper());
        food.set_fluoride(f.get_fluoride());
        food.set_manganese(f.get_manganese());
        food.set_selenium(f.get_selenium());
        food.set_vitamin_a(f.get_vitamin_a());
        food.set_vitamin_e(f.get_vitamin_e());
        food.set_vitamin_d(f.get_vitamin_d());
        food.set_vitamin_c(f.get_vitamin_c());
        food.set_thiamin(f.get_thiamin());
        food.set_riboflavin(f.get_riboflavin());
        food.set_niacin(f.get_niacin());
        food.set_pantothenic_acid(f.get_pantothenic_acid());
        food.set_vitamin_b6(f.get_vitamin_b6());
        food.set_vitamin_b12(f.get_vitamin_b12());
        food.set_choline(f.get_choline());
        food.set_vitamin_k(f.get_vitamin_k());
        food.set_folate(f.get_folate());
        food.set_cholesterol(f.get_cholesterol());
        food.set_saturated_fat(f.get_saturated_fat());
        food.set_dha(f.get_dha());
        food.set_epa(f.get_epa());
        food.set_monounsaturated_fat(f.get_monounsaturated_fat());
        food.set_polyunsaturated_fat(f.get_polyunsaturated_fat());
        food.set_linoleic_acid(f.get_linoleic_acid());
        food.set_alpha_linolenic_acid(f.get_alpha_linolenic_acid());
        food.set_protein_atwater_factor(f.get_protein_atwater_factor());
        food.set_carbohydrate_by_difference_atwater_factor(f.get_carbohydrate_by_difference_atwater_factor());
        food.set_fat_atwater_factor(f.get_fat_atwater_factor());
        food.set_alcohol_atwater_factor(f.get_alcohol_atwater_factor());
        return food;
    }

}
