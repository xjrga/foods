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
    public final Double get_weight() {
        return grams_of_food;
    }

    @Override
    public final Double get_energy_gross() {
        return food.get_energy_gross_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_gross_coefficient() {
        return food.get_energy_gross_coefficient();
    }

    @Override
    public final Double get_protein() {
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
    public final Double get_carbohydrate_by_difference() {
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
    public final Double get_fiber() {
        return food.get_fiber_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_fiber_coefficient() {
        return food.get_fiber_coefficient();
    }

    @Override
    public final Double get_fat() {
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
    public final Double get_alcohol() {
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
    public final Double get_digestible_carbohydrate() {
        return food.get_digestible_carbohydrate_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_digestible_carbohydrate_coefficient() {
        return food.get_digestible_carbohydrate_coefficient();
    }

    @Override
    public final Double get_cholesterol() {
        return food.get_cholesterol_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_cholesterol_coefficient() {
        return food.get_cholesterol_coefficient();
    }

    @Override
    public final Double get_monounsaturated_fat() {
        return food.get_monounsaturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_monounsaturated_fat_coefficient() {
        return food.get_monounsaturated_fat_coefficient();
    }

    @Override
    public final Double get_polyunsaturated_fat() {
        return food.get_polyunsaturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_polyunsaturated_fat_coefficient() {
        return food.get_polyunsaturated_fat_coefficient();
    }

    @Override
    public final Double get_saturated_fat() {
        return food.get_saturated_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_saturated_fat_coefficient() {
        return food.get_saturated_fat_coefficient();
    }

    @Override
    public final Double get_complete_protein() {
        return food.get_complete_protein_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_complete_protein_coefficient() {
        return food.get_complete_protein_coefficient();
    }

    @Override
    public final Double get_calcium() {
        return food.get_calcium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_calcium_coefficient() {
        return food.get_calcium_coefficient();
    }

    @Override
    public final Double get_copper() {
        return food.get_copper_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_copper_coefficient() {
        return food.get_copper_coefficient();
    }

    @Override
    public final Double get_fluoride() {
        return food.get_fluoride_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_fluoride_coefficient() {
        return food.get_fluoride_coefficient();
    }

    @Override
    public final Double get_iron() {
        return food.get_iron_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_iron_coefficient() {
        return food.get_iron_coefficient();
    }

    @Override
    public final Double get_magnesium() {
        return food.get_magnesium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_magnesium_coefficient() {
        return food.get_magnesium_coefficient();
    }

    @Override
    public final Double get_manganese() {
        return food.get_manganese_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_manganese_coefficient() {
        return food.get_manganese_coefficient();
    }

    @Override
    public final Double get_phosphorus() {
        return food.get_phosphorus_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_phosphorus_coefficient() {
        return food.get_phosphorus_coefficient();
    }

    @Override
    public final Double get_potassium() {
        return food.get_potassium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_potassium_coefficient() {
        return food.get_potassium_coefficient();
    }

    @Override
    public final Double get_selenium() {
        return food.get_selenium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_selenium_coefficient() {
        return food.get_selenium_coefficient();
    }

    @Override
    public final Double get_sodium() {
        return food.get_sodium_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_sodium_coefficient() {
        return food.get_sodium_coefficient();
    }

    @Override
    public final Double get_zinc() {
        return food.get_zinc_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_zinc_coefficient() {
        return food.get_zinc_coefficient();
    }

    @Override
    public final Double get_folate() {
        return food.get_folate_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_folate_coefficient() {
        return food.get_folate_coefficient();
    }

    @Override
    public final Double get_niacin() {
        return food.get_niacin_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_niacin_coefficient() {
        return food.get_niacin_coefficient();
    }

    @Override
    public final Double get_pantothenic_acid() {
        return food.get_pantothenic_acid_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_pantothenic_acid_coefficient() {
        return food.get_pantothenic_acid_coefficient();
    }

    @Override
    public final Double get_riboflavin() {
        return food.get_riboflavin_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_riboflavin_coefficient() {
        return food.get_riboflavin_coefficient();
    }

    @Override
    public final Double get_thiamin() {
        return food.get_thiamin_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_thiamin_coefficient() {
        return food.get_thiamin_coefficient();
    }

    @Override
    public final Double get_vitamin_a() {
        return food.get_vitamin_a_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_a_coefficient() {
        return food.get_vitamin_a_coefficient();
    }

    @Override
    public final Double get_vitamin_b12() {
        return food.get_vitamin_b12_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_b12_coefficient() {
        return food.get_vitamin_b12_coefficient();
    }

    @Override
    public final Double get_vitamin_b6() {
        return food.get_vitamin_b6_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_b6_coefficient() {
        return food.get_vitamin_b6_coefficient();
    }

    @Override
    public final Double get_vitamin_c() {
        return food.get_vitamin_c_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_c_coefficient() {
        return food.get_vitamin_c_coefficient();
    }

    @Override
    public final Double get_vitamin_d() {
        return food.get_vitamin_d_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_d_coefficient() {
        return food.get_vitamin_d_coefficient();
    }

    @Override
    public final Double get_vitamin_e() {
        return food.get_vitamin_e_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_e_coefficient() {
        return food.get_vitamin_e_coefficient();
    }

    @Override
    public final Double get_vitamin_k() {
        return food.get_vitamin_k_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_vitamin_k_coefficient() {
        return food.get_vitamin_k_coefficient();
    }

    @Override
    public final Double get_choline() {
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
    public final Double get_alpha_linolenic_acid() {
        return food.get_alpha_linolenic_acid_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_alpha_linolenic_acid_coefficient() {
        return food.get_alpha_linolenic_acid_coefficient();
    }

    @Override
    public final Double get_linoleic_acid() {
        return food.get_linoleic_acid_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_linoleic_acid_coefficient() {
        return food.get_linoleic_acid_coefficient();
    }

    @Override
    public final Double get_dha() {
        return food.get_dha_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_dha_coefficient() {
        return food.get_dha_coefficient();
    }

    @Override
    public final Double get_epa() {
        return food.get_epa_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_epa_coefficient() {
        return food.get_epa_coefficient();
    }

    @Override
    public final Double get_water() {
        return food.get_water_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_water_coefficient() {
        return food.get_water_coefficient();
    }

    @Override
    public final Double get_cost() {
        return food.get_cost_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_cost_coefficient() {
        return food.get_cost_coefficient();
    }

    @Override
    public final Double get_energy_alcohol() {
        return food.get_energy_alcohol_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_alcohol_coefficient() {
        return food.get_energy_alcohol_coefficient();
    }

    @Override
    public final Double get_energy_digestible_carbohydrate() {
        return food.get_energy_digestible_carbohydrate_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_digestible_carbohydrate_coefficient() {
        return food.get_energy_digestible_carbohydrate_coefficient();
    }

    @Override
    public final Double get_energy_digestible() {
        return food.get_energy_digestible_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_digestible_coefficient() {
        return food.get_energy_digestible_coefficient();
    }

    @Override
    public final Double get_energy_fat() {
        return food.get_energy_fat_coefficient() * grams_of_food;
    }

    @Override
    public final Double get_energy_fat_coefficient() {
        return food.get_energy_fat_coefficient();
    }

    @Override
    public final Double get_energy_protein() {
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
        if (!Objects.equals(this.get_alcohol(), other.get_alcohol())) {
            return false;
        }
        if (!Objects.equals(this.get_alpha_linolenic_acid(), other.get_alpha_linolenic_acid())) {
            return false;
        }
        if (!Objects.equals(this.get_calcium(), other.get_calcium())) {
            return false;
        }
        if (!Objects.equals(this.get_carbohydrate_by_difference(), other.get_carbohydrate_by_difference())) {
            return false;
        }
        if (!Objects.equals(this.get_cholesterol(), other.get_cholesterol())) {
            return false;
        }
        if (!Objects.equals(this.get_choline(), other.get_choline())) {
            return false;
        }
        if (!Objects.equals(this.get_complete_protein(), other.get_complete_protein())) {
            return false;
        }
        if (!Objects.equals(this.get_copper(), other.get_copper())) {
            return false;
        }
        if (!Objects.equals(this.get_cost(), other.get_cost())) {
            return false;
        }
        if (!Objects.equals(this.get_dha(), other.get_dha())) {
            return false;
        }
        if (!Objects.equals(this.get_digestible_carbohydrate(), other.get_digestible_carbohydrate())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_alcohol(), other.get_energy_alcohol())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_digestible(), other.get_energy_digestible())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_digestible_carbohydrate(), other.get_energy_digestible_carbohydrate())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_fat(), other.get_energy_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_gross(), other.get_energy_gross())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_protein(), other.get_energy_protein())) {
            return false;
        }
        if (!Objects.equals(this.get_epa(), other.get_epa())) {
            return false;
        }
        if (!Objects.equals(this.get_fat(), other.get_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_fiber(), other.get_fiber())) {
            return false;
        }
        if (!Objects.equals(this.get_fluoride(), other.get_fluoride())) {
            return false;
        }
        if (!Objects.equals(this.get_folate(), other.get_folate())) {
            return false;
        }
        if (!Objects.equals(this.get_iron(), other.get_iron())) {
            return false;
        }
        if (!Objects.equals(this.get_linoleic_acid(), other.get_linoleic_acid())) {
            return false;
        }
        if (!Objects.equals(this.get_magnesium(), other.get_magnesium())) {
            return false;
        }
        if (!Objects.equals(this.get_manganese(), other.get_manganese())) {
            return false;
        }
        if (!Objects.equals(this.get_monounsaturated_fat(), other.get_monounsaturated_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_niacin(), other.get_niacin())) {
            return false;
        }
        if (!Objects.equals(this.get_pantothenic_acid(), other.get_pantothenic_acid())) {
            return false;
        }
        if (!Objects.equals(this.get_phosphorus(), other.get_phosphorus())) {
            return false;
        }
        if (!Objects.equals(this.get_polyunsaturated_fat(), other.get_polyunsaturated_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_potassium(), other.get_potassium())) {
            return false;
        }
        if (!Objects.equals(this.get_protein(), other.get_protein())) {
            return false;
        }
        if (!Objects.equals(this.get_riboflavin(), other.get_riboflavin())) {
            return false;
        }
        if (!Objects.equals(this.get_saturated_fat(), other.get_saturated_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_selenium(), other.get_selenium())) {
            return false;
        }
        if (!Objects.equals(this.get_sodium(), other.get_sodium())) {
            return false;
        }
        if (!Objects.equals(this.get_thiamin(), other.get_thiamin())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_a(), other.get_vitamin_a())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_b6(), other.get_vitamin_b6())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_b12(), other.get_vitamin_b12())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_c(), other.get_vitamin_c())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_d(), other.get_vitamin_d())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_e(), other.get_vitamin_e())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_k(), other.get_vitamin_k())) {
            return false;
        }
        if (!Objects.equals(this.get_water(), other.get_water())) {
            return false;
        }
        if (!Objects.equals(this.get_weight(), other.get_weight())) {
            return false;
        }
        if (!Objects.equals(this.get_zinc(), other.get_zinc())) {
            return false;
        }
        return true;
    }

}
