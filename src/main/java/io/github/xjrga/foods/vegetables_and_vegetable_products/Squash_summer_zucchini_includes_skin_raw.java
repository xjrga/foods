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
package io.github.xjrga.foods.vegetables_and_vegetable_products;

import io.github.xjrga.foods.Food;
import io.github.xjrga.foods.Food_abstract;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Squash_summer_zucchini_includes_skin_raw implements Food {

    private final Squash_summer_zucchini_includes_skin_raw_mutable food;

    public Squash_summer_zucchini_includes_skin_raw() {
        food = new Squash_summer_zucchini_includes_skin_raw_mutable();
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
        return food.get_weight();
    }

    @Override
    public Double get_energy_gross() {
        return food.get_energy_gross();
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return food.get_energy_gross_coefficient();
    }

    @Override
    public Double get_protein() {
        return food.get_protein();
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
        return food.get_carbohydrate_by_difference();
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
        return food.get_fiber();
    }

    @Override
    public Double get_fiber_coefficient() {
        return food.get_fiber_coefficient();
    }

    @Override
    public Double get_fat() {
        return food.get_fat();
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
        return food.get_alcohol();
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
        return food.get_digestible_carbohydrate();
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return food.get_digestible_carbohydrate_coefficient();
    }

    @Override
    public Double get_cholesterol() {
        return food.get_cholesterol();
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return food.get_cholesterol_coefficient();
    }

    @Override
    public Double get_monounsaturated_fat() {
        return food.get_monounsaturated_fat();
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return food.get_monounsaturated_fat_coefficient();
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return food.get_polyunsaturated_fat();
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return food.get_polyunsaturated_fat_coefficient();
    }

    @Override
    public Double get_saturated_fat() {
        return food.get_saturated_fat();
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return food.get_saturated_fat_coefficient();
    }

    @Override
    public Double get_complete_protein() {
        return food.get_complete_protein();
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return food.get_complete_protein_coefficient();
    }

    @Override
    public Double get_calcium() {
        return food.get_calcium();
    }

    @Override
    public Double get_calcium_coefficient() {
        return food.get_calcium_coefficient();
    }

    @Override
    public Double get_copper() {
        return food.get_copper();
    }

    @Override
    public Double get_copper_coefficient() {
        return food.get_copper_coefficient();
    }

    @Override
    public Double get_fluoride() {
        return food.get_fluoride();
    }

    @Override
    public Double get_fluoride_coefficient() {
        return food.get_fluoride_coefficient();
    }

    @Override
    public Double get_iron() {
        return food.get_iron();
    }

    @Override
    public Double get_iron_coefficient() {
        return food.get_iron_coefficient();
    }

    @Override
    public Double get_magnesium() {
        return food.get_magnesium();
    }

    @Override
    public Double get_magnesium_coefficient() {
        return food.get_magnesium_coefficient();
    }

    @Override
    public Double get_manganese() {
        return food.get_manganese();
    }

    @Override
    public Double get_manganese_coefficient() {
        return food.get_manganese_coefficient();
    }

    @Override
    public Double get_phosphorus() {
        return food.get_phosphorus();
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return food.get_phosphorus_coefficient();
    }

    @Override
    public Double get_potassium() {
        return food.get_potassium();
    }

    @Override
    public Double get_potassium_coefficient() {
        return food.get_potassium_coefficient();
    }

    @Override
    public Double get_selenium() {
        return food.get_selenium();
    }

    @Override
    public Double get_selenium_coefficient() {
        return food.get_selenium_coefficient();
    }

    @Override
    public Double get_sodium() {
        return food.get_sodium();
    }

    @Override
    public Double get_sodium_coefficient() {
        return food.get_sodium_coefficient();
    }

    @Override
    public Double get_zinc() {
        return food.get_zinc();
    }

    @Override
    public Double get_zinc_coefficient() {
        return food.get_zinc_coefficient();
    }

    @Override
    public Double get_folate() {
        return food.get_folate();
    }

    @Override
    public Double get_folate_coefficient() {
        return food.get_folate_coefficient();
    }

    @Override
    public Double get_niacin() {
        return food.get_niacin();
    }

    @Override
    public Double get_niacin_coefficient() {
        return food.get_niacin_coefficient();
    }

    @Override
    public Double get_pantothenic_acid() {
        return food.get_pantothenic_acid();
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return food.get_pantothenic_acid_coefficient();
    }

    @Override
    public Double get_riboflavin() {
        return food.get_riboflavin();
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return food.get_riboflavin_coefficient();
    }

    @Override
    public Double get_thiamin() {
        return food.get_thiamin();
    }

    @Override
    public Double get_thiamin_coefficient() {
        return food.get_thiamin_coefficient();
    }

    @Override
    public Double get_vitamin_a() {
        return food.get_vitamin_a();
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return food.get_vitamin_a_coefficient();
    }

    @Override
    public Double get_vitamin_b12() {
        return food.get_vitamin_b12();
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return food.get_vitamin_b12_coefficient();
    }

    @Override
    public Double get_vitamin_b6() {
        return food.get_vitamin_b6();
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return food.get_vitamin_b6_coefficient();
    }

    @Override
    public Double get_vitamin_c() {
        return food.get_vitamin_c();
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return food.get_vitamin_c_coefficient();
    }

    @Override
    public Double get_vitamin_d() {
        return food.get_vitamin_d();
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return food.get_vitamin_d_coefficient();
    }

    @Override
    public Double get_vitamin_e() {
        return food.get_vitamin_e();
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return food.get_vitamin_e_coefficient();
    }

    @Override
    public Double get_vitamin_k() {
        return food.get_vitamin_k();
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return food.get_vitamin_k_coefficient();
    }

    @Override
    public Double get_choline() {
        return food.get_choline();
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
        return food.get_glycemic_load();
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return food.get_glycemic_load_coefficient();
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return food.get_alpha_linolenic_acid();
    }

    @Override
    public Double get_alphalinolenic_acid_coefficient() {
        return food.get_alphalinolenic_acid_coefficient();
    }

    @Override
    public Double get_linoleic_acid() {
        return food.get_linoleic_acid();
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return food.get_linoleic_acid_coefficient();
    }

    @Override
    public Double get_dha() {
        return food.get_dha();
    }

    @Override
    public Double get_dha_coefficient() {
        return food.get_dha_coefficient();
    }

    @Override
    public Double get_epa() {
        return food.get_epa();
    }

    @Override
    public Double get_epa_coefficient() {
        return food.get_epa_coefficient();
    }

    @Override
    public Double get_water() {
        return food.get_water();
    }

    @Override
    public Double get_water_coefficient() {
        return food.get_water_coefficient();
    }

    @Override
    public Double get_cost() {
        return food.get_cost();
    }

    @Override
    public Double get_cost_coefficient() {
        return food.get_cost_coefficient();
    }

    @Override
    public Double get_energy_alcohol() {
        return food.get_energy_alcohol();
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return food.get_energy_alcohol_coefficient();
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return food.get_energy_digestible_carbohydrate();
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return food.get_energy_digestible_carbohydrate_coefficient();
    }

    @Override
    public Double get_energy_digestible() {
        return food.get_energy_digestible();
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return food.get_energy_digestible_coefficient();
    }

    @Override
    public Double get_energy_fat() {
        return food.get_energy_fat();
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return food.get_energy_fat_coefficient();
    }

    @Override
    public Double get_energy_no_protein() {
        return food.get_energy_no_protein();
    }

    @Override
    public Double get_energy_no_protein_coefficient() {
        return food.get_energy_no_protein_coefficient();
    }

    @Override
    public Double get_energy_protein() {
        return food.get_energy_protein();
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return food.get_energy_protein_coefficient();
    }

    @Override
    public Double get_food_quotient() {
        return food.get_food_quotient();
    }

    @Override
    public String toString() {
        return food.get_food_name();
    }

    @Override
    public int hashCode() {
        return food.hashCode();
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
        return equals(obj);
    }

    private class Squash_summer_zucchini_includes_skin_raw_mutable extends Food_abstract {

        /**
         * Constructs a food item
         */
        public Squash_summer_zucchini_includes_skin_raw_mutable() {
            set_food_name("Squash, summer, zucchini, includes skin, raw");
            set_food_label("squash_summer_zucchini_includes_skin_raw");
            set_alcohol(0.00000);
            set_alpha_linolenic_acid(0.06000);
            set_calcium(16.00000);
            set_carbohydrate_by_difference(3.11000);
            set_cholesterol(0.00000);
            set_choline(9.50000);
            set_complete_protein(0.00000);
            set_copper(0.05000);
            set_cost(0.00000);
            set_dha(0.00000);
            set_epa(0.00000);
            set_fat(0.32000);
            set_fiber(1.00000);
            set_fluoride(0.00000);
            set_folate(24.00000);
            set_glycemic_index(0.00000);
            set_gross_energy(17.00000);
            set_iron(0.37000);
            set_linoleic_acid(0.03000);
            set_magnesium(18.00000);
            set_manganese(0.17000);
            set_monounsaturated_fat(0.01000);
            set_niacin(0.45000);
            set_pantothenic_acid(0.20000);
            set_phosphorus(38.00000);
            set_polyunsaturated_fat(0.09000);
            set_potassium(261.00000);
            set_protein(1.21000);
            set_riboflavin(0.09000);
            set_saturated_fat(0.08000);
            set_selenium(0.20000);
            set_sodium(8.00000);
            set_thiamin(0.04000);
            set_vitamin_a(10.00000);
            set_vitamin_b12(0.00000);
            set_vitamin_b6(0.16000);
            set_vitamin_c(17.90000);
            set_vitamin_d(0.00000);
            set_vitamin_e(0.12000);
            set_vitamin_k(4.30000);
            set_water(94.79000);
            set_weight(100.00000);
            set_zinc(0.32000);

        }

    }

}
