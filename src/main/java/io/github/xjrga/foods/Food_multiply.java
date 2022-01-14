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
public class Food_multiply {

    private final Abstract_food meal;

    public Food_multiply(Abstract_food food, Double grams) {
        Food_data mutable = new Food_data();
        mutable.set_food_name(food.get_food_name());
        mutable.set_food_label(food.get_food_label());
        mutable.set_weight_in_grams(grams);
        mutable.set_energy_gross_in_kilocalories(food.get_energy_gross_coefficient_in_kilocalories() * grams);
        mutable.set_protein_in_grams(food.get_protein_coefficient() * grams);
        mutable.set_carbohydrate_by_difference_in_grams(food.get_carbohydrate_by_difference_coefficient() * grams);
        mutable.set_fiber_in_grams(food.get_fiber_coefficient() * grams);
        mutable.set_fat_in_grams(food.get_fat_coefficient() * grams);
        mutable.set_alcohol_in_grams(food.get_alcohol_coefficient() * grams);
        mutable.set_cholesterol_in_milligrams(food.get_cholesterol_coefficient() * grams);
        mutable.set_monounsaturated_fat_in_grams(food.get_monounsaturated_fat_coefficient() * grams);
        mutable.set_polyunsaturated_fat_in_grams(food.get_polyunsaturated_fat_coefficient() * grams);
        mutable.set_saturated_fat_in_grams(food.get_saturated_fat_coefficient() * grams);
        mutable.set_complete_protein_in_grams(food.get_complete_protein_coefficient() * grams);
        mutable.set_calcium_in_milligrams(food.get_calcium_coefficient() * grams);
        mutable.set_copper_in_milligrams(food.get_copper_coefficient() * grams);
        mutable.set_fluoride_in_micrograms(food.get_fluoride_coefficient() * grams);
        mutable.set_iron_in_milligrams(food.get_iron_coefficient() * grams);
        mutable.set_magnesium_in_milligrams(food.get_magnesium_coefficient() * grams);
        mutable.set_manganese_in_milligrams(food.get_manganese_coefficient() * grams);
        mutable.set_phosphorus_in_milligrams(food.get_phosphorus_coefficient() * grams);
        mutable.set_potassium_in_milligrams(food.get_potassium_coefficient() * grams);
        mutable.set_selenium_in_micrograms(food.get_selenium_coefficient() * grams);
        mutable.set_sodium_in_milligrams(food.get_sodium_coefficient() * grams);
        mutable.set_zinc_in_milligrams(food.get_zinc_coefficient() * grams);
        mutable.set_folate_in_micrograms(food.get_folate_coefficient() * grams);
        mutable.set_niacin_in_milligrams(food.get_niacin_coefficient() * grams);
        mutable.set_pantothenic_acid_in_milligrams(food.get_pantothenic_acid_coefficient() * grams);
        mutable.set_riboflavin_in_milligrams(food.get_riboflavin_coefficient() * grams);
        mutable.set_thiamin_in_milligrams(food.get_thiamin_coefficient() * grams);
        mutable.set_vitamin_a_in_micrograms(food.get_vitamin_a_coefficient() * grams);
        mutable.set_vitamin_b12_in_micrograms(food.get_vitamin_b12_coefficient() * grams);
        mutable.set_vitamin_b6_in_milligrams(food.get_vitamin_b6_coefficient() * grams);
        mutable.set_vitamin_c_in_milligrams(food.get_vitamin_c_coefficient() * grams);
        mutable.set_vitamin_d_in_micrograms(food.get_vitamin_d_coefficient() * grams);
        mutable.set_vitamin_e_in_milligrams(food.get_vitamin_e_coefficient() * grams);
        mutable.set_vitamin_k_in_micrograms(food.get_vitamin_k_coefficient() * grams);
        mutable.set_choline_in_milligrams(food.get_choline_coefficient() * grams);
        mutable.set_glycemic_index(food.get_glycemic_index());
        mutable.set_alpha_linolenic_acid_in_grams(food.get_alpha_linolenic_acid_coefficient() * grams);
        mutable.set_linoleic_acid_in_grams(food.get_linoleic_acid_coefficient() * grams);
        mutable.set_dha_in_grams(food.get_dha_coefficient() * grams);
        mutable.set_epa_in_grams(food.get_epa_coefficient() * grams);
        mutable.set_water_in_grams(food.get_water_coefficient() * grams);
        mutable.set_cost_in_dollars(food.get_cost_coefficient() * grams);
        mutable.set_energy_alcohol_in_kilocalories(food.get_energy_alcohol_coefficient() * grams);
        mutable.set_energy_digestible_carbohydrate_in_kilocalories(food.get_digestible_carbohydrate_coefficient() * grams);
        mutable.set_energy_digestible_in_kilocalories(food.get_energy_digestible_coefficient() * grams);
        mutable.set_energy_fat_in_kilocalories(food.get_energy_fat_coefficient() * grams);
        mutable.set_energy_protein_in_kilocalories(food.get_energy_protein_coefficient() * grams);
        meal = new Concrete_food(mutable);
    }

    public Abstract_food get_meal() {
        return meal;
    }
}
