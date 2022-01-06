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

import java.util.Objects;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_multiplier implements Interface_food {

    private final Double grams_of_food;
    private final Interface_food food;

    public Food_multiplier(Interface_food food, Double grams) {
        this.food = food;
        grams_of_food = grams;
    }

    @Override
    public final String get_food_name() {
        return food.get_food_name();
    }

    @Override
    public final String get_food_label() {
        return food.get_food_label();
    }

    @Override
    public final Double get_weight_in_grams() {
        return grams_of_food;
    }

    @Override
    public final Double get_energy_gross_in_kilocalories() {
        return food.get_energy_gross_coefficient_in_kilocalories() * grams_of_food;
    }

    @Override
    public final Double get_energy_gross_coefficient_in_kilocalories() {
        return food.get_energy_gross_coefficient_in_kilocalories();
    }

    @Override
    public final Double get_protein_in_grams() {
        return food.get_protein_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_protein_coefficient() {
        return food.get_protein_coefficient();
    }

    @Override
    public final Double get_protein_atwater_factor() {
        return food.get_protein_atwater_factor();
    }

    @Override
    public final Double get_carbohydrate_by_difference_in_grams() {
        return food.get_carbohydrate_by_difference_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_carbohydrate_by_difference_coefficient() {
        return food.get_carbohydrate_by_difference_coefficient();
    }

    @Override
    public final Double get_carbohydrate_by_difference_atwater_factor() {
        return food.get_carbohydrate_by_difference_atwater_factor();
    }

    @Override
    public final Double get_fiber_in_grams() {
        return food.get_fiber_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_fiber_coefficient() {
        return food.get_fiber_coefficient();
    }

    @Override
    public final Double get_fat_in_grams() {
        return food.get_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_fat_coefficient() {
        return food.get_fat_coefficient();
    }

    @Override
    public final Double get_fat_atwater_factor() {
        return food.get_fat_atwater_factor();
    }

    @Override
    public final Double get_alcohol_in_grams() {
        return food.get_alcohol_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_alcohol_coefficient() {
        return food.get_alcohol_coefficient();
    }

    @Override
    public final Double get_alcohol_atwater_factor() {
        return food.get_alcohol_atwater_factor();
    }

    @Override
    public final Double get_digestible_carbohydrate_in_grams() {
        return food.get_digestible_carbohydrate_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_digestible_carbohydrate_coefficient() {
        return food.get_digestible_carbohydrate_coefficient();
    }

    @Override
    public final Double get_cholesterol_in_milligrams() {
        return food.get_cholesterol_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_cholesterol_coefficient() {
        return food.get_cholesterol_coefficient();
    }

    @Override
    public final Double get_monounsaturated_fat_in_grams() {
        return food.get_monounsaturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_monounsaturated_fat_coefficient() {
        return food.get_monounsaturated_fat_coefficient();
    }

    @Override
    public final Double get_polyunsaturated_fat_in_grams() {
        return food.get_polyunsaturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_polyunsaturated_fat_coefficient() {
        return food.get_polyunsaturated_fat_coefficient();
    }

    @Override
    public final Double get_saturated_fat_in_grams() {
        return food.get_saturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_saturated_fat_coefficient() {
        return food.get_saturated_fat_coefficient();
    }

    @Override
    public final Double get_complete_protein_in_grams() {
        return food.get_complete_protein_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_complete_protein_coefficient() {
        return food.get_complete_protein_coefficient();
    }

    @Override
    public final Double get_calcium_in_milligrams() {
        return food.get_calcium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_calcium_coefficient() {
        return food.get_calcium_coefficient();
    }

    @Override
    public final Double get_copper_in_milligrams() {
        return food.get_copper_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_copper_coefficient() {
        return food.get_copper_coefficient();
    }

    @Override
    public final Double get_fluoride_in_micrograms() {
        return food.get_fluoride_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_fluoride_coefficient() {
        return food.get_fluoride_coefficient();
    }

    @Override
    public final Double get_iron_in_milligrams() {
        return food.get_iron_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_iron_coefficient() {
        return food.get_iron_coefficient();
    }

    @Override
    public final Double get_magnesium_in_milligrams() {
        return food.get_magnesium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_magnesium_coefficient() {
        return food.get_magnesium_coefficient();
    }

    @Override
    public final Double get_manganese_in_milligrams() {
        return food.get_manganese_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_manganese_coefficient() {
        return food.get_manganese_coefficient();
    }

    @Override
    public final Double get_phosphorus_in_milligrams() {
        return food.get_phosphorus_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_phosphorus_coefficient() {
        return food.get_phosphorus_coefficient();
    }

    @Override
    public final Double get_potassium_in_milligrams() {
        return food.get_potassium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_potassium_coefficient() {
        return food.get_potassium_coefficient();
    }

    @Override
    public final Double get_selenium_in_micrograms() {
        return food.get_selenium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_selenium_coefficient() {
        return food.get_selenium_coefficient();
    }

    @Override
    public final Double get_sodium_in_milligrams() {
        return food.get_sodium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_sodium_coefficient() {
        return food.get_sodium_coefficient();
    }

    @Override
    public final Double get_zinc_in_milligrams() {
        return food.get_zinc_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_zinc_coefficient() {
        return food.get_zinc_coefficient();
    }

    @Override
    public final Double get_folate_in_micrograms() {
        return food.get_folate_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_folate_coefficient() {
        return food.get_folate_coefficient();
    }

    @Override
    public final Double get_niacin_in_milligrams() {
        return food.get_niacin_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_niacin_coefficient() {
        return food.get_niacin_coefficient();
    }

    @Override
    public final Double get_pantothenic_acid_in_milligrams() {
        return food.get_pantothenic_acid_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_pantothenic_acid_coefficient() {
        return food.get_pantothenic_acid_coefficient();
    }

    @Override
    public final Double get_riboflavin_in_milligrams() {
        return food.get_riboflavin_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_riboflavin_coefficient() {
        return food.get_riboflavin_coefficient();
    }

    @Override
    public final Double get_thiamin_in_milligrams() {
        return food.get_thiamin_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_thiamin_coefficient() {
        return food.get_thiamin_coefficient();
    }

    @Override
    public final Double get_vitamin_a_in_micrograms() {
        return food.get_vitamin_a_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_a_coefficient() {
        return food.get_vitamin_a_coefficient();
    }

    @Override
    public final Double get_vitamin_b12_in_micrograms() {
        return food.get_vitamin_b12_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_b12_coefficient() {
        return food.get_vitamin_b12_coefficient();
    }

    @Override
    public final Double get_vitamin_b6_in_milligrams() {
        return food.get_vitamin_b6_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_b6_coefficient() {
        return food.get_vitamin_b6_coefficient();
    }

    @Override
    public final Double get_vitamin_c_in_milligrams() {
        return food.get_vitamin_c_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_c_coefficient() {
        return food.get_vitamin_c_coefficient();
    }

    @Override
    public final Double get_vitamin_d_in_micrograms() {
        return food.get_vitamin_d_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_d_coefficient() {
        return food.get_vitamin_d_coefficient();
    }

    @Override
    public final Double get_vitamin_e_in_milligrams() {
        return food.get_vitamin_e_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_e_coefficient() {
        return food.get_vitamin_e_coefficient();
    }

    @Override
    public final Double get_vitamin_k_in_micrograms() {
        return food.get_vitamin_k_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_k_coefficient() {
        return food.get_vitamin_k_coefficient();
    }

    @Override
    public final Double get_choline_in_milligrams() {
        return food.get_choline_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_choline_coefficient() {
        return food.get_choline_coefficient();
    }

    @Override
    public final Double get_glycemic_index() {
        return food.get_glycemic_index();
    }

    @Override
    public final Double get_glycemic_load() {
        return food.get_glycemic_load_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_glycemic_load_coefficient() {
        return food.get_glycemic_load_coefficient();
    }

    @Override
    public final Double get_alpha_linolenic_acid_in_grams() {
        return food.get_alpha_linolenic_acid_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_alpha_linolenic_acid_coefficient() {
        return food.get_alpha_linolenic_acid_coefficient();
    }

    @Override
    public final Double get_linoleic_acid_in_grams() {
        return food.get_linoleic_acid_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_linoleic_acid_coefficient() {
        return food.get_linoleic_acid_coefficient();
    }

    @Override
    public final Double get_dha_in_grams() {
        return food.get_dha_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_dha_coefficient() {
        return food.get_dha_coefficient();
    }

    @Override
    public final Double get_epa_in_grams() {
        return food.get_epa_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_epa_coefficient() {
        return food.get_epa_coefficient();
    }

    @Override
    public final Double get_water_in_grams() {
        return food.get_water_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_water_coefficient() {
        return food.get_water_coefficient();
    }

    @Override
    public final Double get_cost_in_dollars() {
        return food.get_cost_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_cost_coefficient() {
        return food.get_cost_coefficient();
    }

    @Override
    public final Double get_energy_alcohol_in_kilocalories() {
        return food.get_energy_alcohol_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_alcohol_coefficient() {
        return food.get_energy_alcohol_coefficient();
    }

    @Override
    public final Double get_energy_digestible_carbohydrate_in_kilocalories() {
        return food.get_energy_digestible_carbohydrate_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_digestible_carbohydrate_coefficient() {
        return food.get_energy_digestible_carbohydrate_coefficient();
    }

    @Override
    public final Double get_energy_digestible_in_kilocalories() {
        return food.get_energy_digestible_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_digestible_coefficient() {
        return food.get_energy_digestible_coefficient();
    }

    @Override
    public final Double get_energy_fat_in_kilocalories() {
        return food.get_energy_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_fat_coefficient() {
        return food.get_energy_fat_coefficient();
    }

    @Override
    public final Double get_energy_protein_in_kilocalories() {
        return food.get_energy_protein_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_protein_coefficient() {
        return food.get_energy_protein_coefficient();
    }

    @Override
    public final Double get_food_quotient() {
        return food.get_food_quotient();
    }

    @Override
    public final String toString() {
        return get_food_name();
    }

    @Override
    public final int hashCode() {
        return get_food_name().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food_multiplier other = (Food_multiplier) obj;
        if (!Objects.equals(this.get_food_label(), other.get_food_label())) {
            return false;
        }
        if (!Objects.equals(this.get_food_name(), other.get_food_name())) {
            return false;
        }
        if (!Objects.equals(this.get_alcohol_in_grams(), other.get_alcohol_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_alpha_linolenic_acid_in_grams(), other.get_alpha_linolenic_acid_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_calcium_in_milligrams(), other.get_calcium_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_carbohydrate_by_difference_in_grams(), other.get_carbohydrate_by_difference_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_cholesterol_in_milligrams(), other.get_cholesterol_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_choline_in_milligrams(), other.get_choline_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_complete_protein_in_grams(), other.get_complete_protein_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_copper_in_milligrams(), other.get_copper_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_cost_in_dollars(), other.get_cost_in_dollars())) {
            return false;
        }
        if (!Objects.equals(this.get_dha_in_grams(), other.get_dha_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_digestible_carbohydrate_in_grams(), other.get_digestible_carbohydrate_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_alcohol_in_kilocalories(), other.get_energy_alcohol_in_kilocalories())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_digestible_in_kilocalories(), other.get_energy_digestible_in_kilocalories())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_digestible_carbohydrate_in_kilocalories(), other.get_energy_digestible_carbohydrate_in_kilocalories())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_fat_in_kilocalories(), other.get_energy_fat_in_kilocalories())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_gross_in_kilocalories(), other.get_energy_gross_in_kilocalories())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_protein_in_kilocalories(), other.get_energy_protein_in_kilocalories())) {
            return false;
        }
        if (!Objects.equals(this.get_epa_in_grams(), other.get_epa_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_fat_in_grams(), other.get_fat_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_fiber_in_grams(), other.get_fiber_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_fluoride_in_micrograms(), other.get_fluoride_in_micrograms())) {
            return false;
        }
        if (!Objects.equals(this.get_folate_in_micrograms(), other.get_folate_in_micrograms())) {
            return false;
        }
        if (!Objects.equals(this.get_iron_in_milligrams(), other.get_iron_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_linoleic_acid_in_grams(), other.get_linoleic_acid_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_magnesium_in_milligrams(), other.get_magnesium_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_manganese_in_milligrams(), other.get_manganese_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_monounsaturated_fat_in_grams(), other.get_monounsaturated_fat_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_niacin_in_milligrams(), other.get_niacin_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_pantothenic_acid_in_milligrams(), other.get_pantothenic_acid_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_phosphorus_in_milligrams(), other.get_phosphorus_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_polyunsaturated_fat_in_grams(), other.get_polyunsaturated_fat_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_potassium_in_milligrams(), other.get_potassium_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_protein_in_grams(), other.get_protein_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_riboflavin_in_milligrams(), other.get_riboflavin_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_saturated_fat_in_grams(), other.get_saturated_fat_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_selenium_in_micrograms(), other.get_selenium_in_micrograms())) {
            return false;
        }
        if (!Objects.equals(this.get_sodium_in_milligrams(), other.get_sodium_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_thiamin_in_milligrams(), other.get_thiamin_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_a_in_micrograms(), other.get_vitamin_a_in_micrograms())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_b6_in_milligrams(), other.get_vitamin_b6_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_b12_in_micrograms(), other.get_vitamin_b12_in_micrograms())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_c_in_milligrams(), other.get_vitamin_c_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_d_in_micrograms(), other.get_vitamin_d_in_micrograms())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_e_in_milligrams(), other.get_vitamin_e_in_milligrams())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_k_in_micrograms(), other.get_vitamin_k_in_micrograms())) {
            return false;
        }
        if (!Objects.equals(this.get_water_in_grams(), other.get_water_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_weight_in_grams(), other.get_weight_in_grams())) {
            return false;
        }
        if (!Objects.equals(this.get_zinc_in_milligrams(), other.get_zinc_in_milligrams())) {
            return false;
        }
        return true;
    }

}
