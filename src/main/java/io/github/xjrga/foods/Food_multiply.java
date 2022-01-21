/*
 * Copyright (C) 2022 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_multiply extends Abstract_food {

    public Food_multiply(Abstract_food food, Double grams) {
        set_food_name(food.get_food_name());
        set_food_label(food.get_food_label());
        set_weight_in_grams(grams);
        set_energy_gross_in_kilocalories(food.get_energy_gross_in_kilocalories_coefficient() * grams);
        set_protein_in_grams(food.get_protein_coefficient() * grams);
        set_carbohydrate_by_difference_in_grams(food.get_carbohydrate_by_difference_coefficient() * grams);
        set_fiber_in_grams(food.get_fiber_coefficient() * grams);
        set_fat_in_grams(food.get_fat_coefficient() * grams);
        set_alcohol_in_grams(food.get_alcohol_coefficient() * grams);
        set_cholesterol_in_milligrams(food.get_cholesterol_coefficient() * grams);
        set_monounsaturated_fat_in_grams(food.get_monounsaturated_fat_coefficient() * grams);
        set_polyunsaturated_fat_in_grams(food.get_polyunsaturated_fat_coefficient() * grams);
        set_saturated_fat_in_grams(food.get_saturated_fat_coefficient() * grams);
        set_complete_protein_in_grams(food.get_complete_protein_coefficient() * grams);
        set_calcium_in_milligrams(food.get_calcium_coefficient() * grams);
        set_copper_in_milligrams(food.get_copper_coefficient() * grams);
        set_fluoride_in_micrograms(food.get_fluoride_coefficient() * grams);
        set_iron_in_milligrams(food.get_iron_coefficient() * grams);
        set_magnesium_in_milligrams(food.get_magnesium_coefficient() * grams);
        set_manganese_in_milligrams(food.get_manganese_coefficient() * grams);
        set_phosphorus_in_milligrams(food.get_phosphorus_coefficient() * grams);
        set_potassium_in_milligrams(food.get_potassium_coefficient() * grams);
        set_selenium_in_micrograms(food.get_selenium_coefficient() * grams);
        set_sodium_in_milligrams(food.get_sodium_coefficient() * grams);
        set_zinc_in_milligrams(food.get_zinc_coefficient() * grams);
        set_folate_in_micrograms(food.get_folate_coefficient() * grams);
        set_niacin_in_milligrams(food.get_niacin_coefficient() * grams);
        set_pantothenic_acid_in_milligrams(food.get_pantothenic_acid_coefficient() * grams);
        set_riboflavin_in_milligrams(food.get_riboflavin_coefficient() * grams);
        set_thiamin_in_milligrams(food.get_thiamin_coefficient() * grams);
        set_vitamin_a_in_micrograms(food.get_vitamin_a_coefficient() * grams);
        set_vitamin_b12_in_micrograms(food.get_vitamin_b12_coefficient() * grams);
        set_vitamin_b6_in_milligrams(food.get_vitamin_b6_coefficient() * grams);
        set_vitamin_c_in_milligrams(food.get_vitamin_c_coefficient() * grams);
        set_vitamin_d_in_micrograms(food.get_vitamin_d_coefficient() * grams);
        set_vitamin_e_in_milligrams(food.get_vitamin_e_coefficient() * grams);
        set_vitamin_k_in_micrograms(food.get_vitamin_k_coefficient() * grams);
        set_choline_in_milligrams(food.get_choline_coefficient() * grams);
        set_glycemic_index(food.get_glycemic_index());
        set_alpha_linolenic_acid_in_grams(food.get_alpha_linolenic_acid_coefficient() * grams);
        set_linoleic_acid_in_grams(food.get_linoleic_acid_coefficient() * grams);
        set_dha_in_grams(food.get_dha_coefficient() * grams);
        set_epa_in_grams(food.get_epa_coefficient() * grams);
        set_water_in_grams(food.get_water_coefficient() * grams);
        set_cost_in_dollars(food.get_cost_coefficient() * grams);
    }
}
