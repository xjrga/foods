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

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_multiplier implements Food {

    private Double grams_of_food;
    private final Food food;

    public Food_multiplier(Food food) {
        this.food = food;
        grams_of_food = 0.0;
    }

    public void set_food_quantity(Double grams) {
        grams_of_food = grams;
    }

    @Override
    public String get_food_name() {
        return food.get_food_name();
    }

    @Override
    public String get_food_label() {
        return food.get_food_label();
    }

    @Override
    public Double get_weight() {
        return grams_of_food;
    }

    @Override
    public Double get_energy_gross() {
        return food.get_energy_gross_coefficient() * grams_of_food;
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return food.get_energy_gross_coefficient();
    }

    @Override
    public Double get_protein() {
        return food.get_protein_coefficient() * grams_of_food;
    }

    @Override
    public Double get_protein_coefficient() {
        return food.get_protein_coefficient();
    }

    @Override
    public Double get_protein_atwater_factor() {
        return food.get_protein_atwater_factor();
    }

    @Override
    public Double get_carbohydrate_by_difference() {
        return food.get_carbohydrate_by_difference_coefficient() * grams_of_food;
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return food.get_carbohydrate_by_difference_coefficient();
    }

    @Override
    public Double get_carbohydrate_by_difference_atwater_factor() {
        return food.get_carbohydrate_by_difference_atwater_factor();
    }

    @Override
    public Double get_fiber() {
        return food.get_fiber_coefficient() * grams_of_food;
    }

    @Override
    public Double get_fiber_coefficient() {
        return food.get_fiber_coefficient();
    }

    @Override
    public Double get_fat() {
        return food.get_fat_coefficient() * grams_of_food;
    }

    @Override
    public Double get_fat_coefficient() {
        return food.get_fat_coefficient();
    }

    @Override
    public Double get_fat_atwater_factor() {
        return food.get_fat_atwater_factor();
    }

    @Override
    public Double get_alcohol() {
        return food.get_alcohol_coefficient() * grams_of_food;
    }

    @Override
    public Double get_alcohol_coefficient() {
        return food.get_alcohol_coefficient();
    }

    @Override
    public Double get_alcohol_atwater_factor() {
        return food.get_alcohol_atwater_factor();
    }

    @Override
    public Double get_digestible_carbohydrate() {
        return food.get_digestible_carbohydrate_coefficient() * grams_of_food;
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return food.get_digestible_carbohydrate_coefficient();
    }

    @Override
    public Double get_cholesterol() {
        return food.get_cholesterol_coefficient() * grams_of_food;
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return food.get_cholesterol_coefficient();
    }

    @Override
    public Double get_monounsaturated_fat() {
        return food.get_monounsaturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return food.get_monounsaturated_fat_coefficient();
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return food.get_polyunsaturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return food.get_polyunsaturated_fat_coefficient();
    }

    @Override
    public Double get_saturated_fat() {
        return food.get_saturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return food.get_saturated_fat_coefficient();
    }

    @Override
    public Double get_complete_protein() {
        return food.get_complete_protein_coefficient() * grams_of_food;
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return food.get_complete_protein_coefficient();
    }

    @Override
    public Double get_calcium() {
        return food.get_calcium_coefficient() * grams_of_food;
    }

    @Override
    public Double get_calcium_coefficient() {
        return food.get_calcium_coefficient();
    }

    @Override
    public Double get_copper() {
        return food.get_copper_coefficient() * grams_of_food;
    }

    @Override
    public Double get_copper_coefficient() {
        return food.get_copper_coefficient();
    }

    @Override
    public Double get_fluoride() {
        return food.get_fluoride_coefficient() * grams_of_food;
    }

    @Override
    public Double get_fluoride_coefficient() {
        return food.get_fluoride_coefficient();
    }

    @Override
    public Double get_iron() {
        return food.get_iron_coefficient() * grams_of_food;
    }

    @Override
    public Double get_iron_coefficient() {
        return food.get_iron_coefficient();
    }

    @Override
    public Double get_magnesium() {
        return food.get_magnesium_coefficient() * grams_of_food;
    }

    @Override
    public Double get_magnesium_coefficient() {
        return food.get_magnesium_coefficient();
    }

    @Override
    public Double get_manganese() {
        return food.get_manganese_coefficient() * grams_of_food;
    }

    @Override
    public Double get_manganese_coefficient() {
        return food.get_manganese_coefficient();
    }

    @Override
    public Double get_phosphorus() {
        return food.get_phosphorus_coefficient() * grams_of_food;
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return food.get_phosphorus_coefficient();
    }

    @Override
    public Double get_potassium() {
        return food.get_potassium_coefficient() * grams_of_food;
    }

    @Override
    public Double get_potassium_coefficient() {
        return food.get_potassium_coefficient();
    }

    @Override
    public Double get_selenium() {
        return food.get_selenium_coefficient() * grams_of_food;
    }

    @Override
    public Double get_selenium_coefficient() {
        return food.get_selenium_coefficient();
    }

    @Override
    public Double get_sodium() {
        return food.get_sodium_coefficient() * grams_of_food;
    }

    @Override
    public Double get_sodium_coefficient() {
        return food.get_sodium_coefficient();
    }

    @Override
    public Double get_zinc() {
        return food.get_zinc_coefficient() * grams_of_food;
    }

    @Override
    public Double get_zinc_coefficient() {
        return food.get_zinc_coefficient();
    }

    @Override
    public Double get_folate() {
        return food.get_folate_coefficient() * grams_of_food;
    }

    @Override
    public Double get_folate_coefficient() {
        return food.get_folate_coefficient();
    }

    @Override
    public Double get_niacin() {
        return food.get_niacin_coefficient() * grams_of_food;
    }

    @Override
    public Double get_niacin_coefficient() {
        return food.get_niacin_coefficient();
    }

    @Override
    public Double get_pantothenic_acid() {
        return food.get_pantothenic_acid_coefficient() * grams_of_food;
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return food.get_pantothenic_acid_coefficient();
    }

    @Override
    public Double get_riboflavin() {
        return food.get_riboflavin_coefficient() * grams_of_food;
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return food.get_riboflavin_coefficient();
    }

    @Override
    public Double get_thiamin() {
        return food.get_thiamin_coefficient() * grams_of_food;
    }

    @Override
    public Double get_thiamin_coefficient() {
        return food.get_thiamin_coefficient();
    }

    @Override
    public Double get_vitamin_a() {
        return food.get_vitamin_a_coefficient() * grams_of_food;
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return food.get_vitamin_a_coefficient();
    }

    @Override
    public Double get_vitamin_b12() {
        return food.get_vitamin_b12_coefficient() * grams_of_food;
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return food.get_vitamin_b12_coefficient();
    }

    @Override
    public Double get_vitamin_b6() {
        return food.get_vitamin_b6_coefficient() * grams_of_food;
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return food.get_vitamin_b6_coefficient();
    }

    @Override
    public Double get_vitamin_c() {
        return food.get_vitamin_c_coefficient() * grams_of_food;
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return food.get_vitamin_c_coefficient();
    }

    @Override
    public Double get_vitamin_d() {
        return food.get_vitamin_d_coefficient() * grams_of_food;
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return food.get_vitamin_d_coefficient();
    }

    @Override
    public Double get_vitamin_e() {
        return food.get_vitamin_e_coefficient() * grams_of_food;
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return food.get_vitamin_e_coefficient();
    }

    @Override
    public Double get_vitamin_k() {
        return food.get_vitamin_k_coefficient() * grams_of_food;
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return food.get_vitamin_k_coefficient();
    }

    @Override
    public Double get_choline() {
        return food.get_choline_coefficient() * grams_of_food;
    }

    @Override
    public Double get_choline_coefficient() {
        return food.get_choline_coefficient();
    }

    @Override
    public Double get_glycemic_index() {
        return food.get_glycemic_index();
    }

    @Override
    public Double get_glycemic_load() {
        return food.get_glycemic_load_coefficient() * grams_of_food;
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return food.get_glycemic_load_coefficient();
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return food.get_alphalinolenic_acid_coefficient() * grams_of_food;
    }

    @Override
    public Double get_alphalinolenic_acid_coefficient() {
        return food.get_alphalinolenic_acid_coefficient();
    }

    @Override
    public Double get_linoleic_acid() {
        return food.get_linoleic_acid_coefficient() * grams_of_food;
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return food.get_linoleic_acid_coefficient();
    }

    @Override
    public Double get_dha() {
        return food.get_dha_coefficient() * grams_of_food;
    }

    @Override
    public Double get_dha_coefficient() {
        return food.get_dha_coefficient();
    }

    @Override
    public Double get_epa() {
        return food.get_epa_coefficient() * grams_of_food;
    }

    @Override
    public Double get_epa_coefficient() {
        return food.get_epa_coefficient();
    }

    @Override
    public Double get_water() {
        return food.get_water_coefficient() * grams_of_food;
    }

    @Override
    public Double get_water_coefficient() {
        return food.get_water_coefficient();
    }

    @Override
    public Double get_cost() {
        return food.get_cost_coefficient() * grams_of_food;
    }

    @Override
    public Double get_cost_coefficient() {
        return food.get_cost_coefficient();
    }

    @Override
    public Double get_energy_alcohol() {
        return food.get_energy_alcohol_coefficient() * grams_of_food;
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return food.get_energy_alcohol_coefficient();
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return food.get_energy_digestible_carbohydrate_coefficient() * grams_of_food;
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return food.get_energy_digestible_carbohydrate_coefficient();
    }

    @Override
    public Double get_energy_digestible() {
        return food.get_energy_digestible_coefficient() * grams_of_food;
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return food.get_energy_digestible_coefficient();
    }

    @Override
    public Double get_energy_fat() {
        return food.get_energy_fat_coefficient() * grams_of_food;
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return food.get_energy_fat_coefficient();
    }

    @Override
    public Double get_energy_no_protein() {
        return food.get_energy_no_protein_coefficient() * grams_of_food;
    }

    @Override
    public Double get_energy_no_protein_coefficient() {
        return food.get_energy_no_protein_coefficient();
    }

    @Override
    public Double get_energy_protein() {
        return food.get_energy_protein_coefficient() * grams_of_food;
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return food.get_energy_protein_coefficient();
    }

}
