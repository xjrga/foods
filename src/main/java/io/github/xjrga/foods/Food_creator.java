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
public class Food_creator {

    public static Food_mutable make_food_mutable_from_food_enum(Interface_food product) {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name(product.get_food_name());
        mutable.set_food_label(product.get_food_label());
        mutable.set_weight_in_grams(product.get_weight_in_grams());
        mutable.set_complete_protein_in_grams(product.get_complete_protein_in_grams());
        mutable.set_cost_in_dollars(product.get_cost_in_dollars());
        mutable.set_glycemic_index(product.get_glycemic_index());
        mutable.set_protein_in_grams(product.get_protein_in_grams());
        mutable.set_fat(product.get_fat_in_grams());
        mutable.set_carbohydrate_by_difference(product.get_carbohydrate_by_difference_in_grams());
        mutable.set_energy_gross_in_kilocalories(product.get_energy_gross_in_kilocalories());
        mutable.set_alcohol_in_grams(product.get_alcohol_in_grams());
        mutable.set_water_in_grams(product.get_water_in_grams());
        mutable.set_fiber(product.get_fiber_in_grams());
        mutable.set_calcium_in_milligrams(product.get_calcium_in_milligrams());
        mutable.set_iron_in_milligrams(product.get_iron_in_milligrams());
        mutable.set_magnesium_in_milligrams(product.get_magnesium_in_milligrams());
        mutable.set_phosphorus_in_milligrams(product.get_phosphorus_in_milligrams());
        mutable.set_potassium_in_milligrams(product.get_potassium_in_milligrams());
        mutable.set_sodium_in_milligrams(product.get_sodium_in_milligrams());
        mutable.set_zinc_in_milligrams(product.get_zinc_in_milligrams());
        mutable.set_copper_in_milligrams(product.get_copper_in_milligrams());
        mutable.set_fluoride_in_micrograms(product.get_fluoride_in_micrograms());
        mutable.set_manganese_in_milligrams(product.get_manganese_in_milligrams());
        mutable.set_selenium_in_micrograms(product.get_selenium_in_micrograms());
        mutable.set_vitamin_a_in_micrograms(product.get_vitamin_a_in_micrograms());
        mutable.set_vitamin_e_in_milligrams(product.get_vitamin_e_in_milligrams());
        mutable.set_vitamin_d_in_micrograms(product.get_vitamin_d_in_micrograms());
        mutable.set_vitamin_c_in_milligrams(product.get_vitamin_c_in_milligrams());
        mutable.set_thiamin_in_milligrams(product.get_thiamin_in_milligrams());
        mutable.set_riboflavin_in_milligrams(product.get_riboflavin_in_milligrams());
        mutable.set_niacin_in_milligrams(product.get_niacin_in_milligrams());
        mutable.set_pantothenic_acid_in_milligrams(product.get_pantothenic_acid_in_milligrams());
        mutable.set_vitamin_b6_in_milligrams(product.get_vitamin_b6_in_milligrams());
        mutable.set_vitamin_b12_in_micrograms(product.get_vitamin_b12_in_micrograms());
        mutable.set_choline_in_milligrams(product.get_choline_in_milligrams());
        mutable.set_vitamin_k_in_micrograms(product.get_vitamin_k_in_micrograms());
        mutable.set_folate_in_micrograms(product.get_folate_in_micrograms());
        mutable.set_cholesterol_in_milligrams(product.get_cholesterol_in_milligrams());
        mutable.set_saturated_fat_in_grams(product.get_saturated_fat_in_grams());
        mutable.set_dha_in_grams(product.get_dha_in_grams());
        mutable.set_epa_in_grams(product.get_epa_in_grams());
        mutable.set_monounsaturated_fat_in_grams(product.get_monounsaturated_fat_in_grams());
        mutable.set_polyunsaturated_fat_in_grams(product.get_polyunsaturated_fat_in_grams());
        mutable.set_linoleic_acid_in_grams(product.get_linoleic_acid_in_grams());
        mutable.set_alpha_linolenic_acid_in_grams(product.get_alpha_linolenic_acid_in_grams());
        mutable.set_protein_atwater_factor(product.get_protein_atwater_factor());
        mutable.set_carbohydrate_by_difference_atwater_factor(product.get_carbohydrate_by_difference_atwater_factor());
        mutable.set_fat_atwater_factor(product.get_fat_atwater_factor());
        mutable.set_alcohol_atwater_factor(product.get_alcohol_atwater_factor());
        return mutable;
    }

    public static Food make_food_from_food_enum(Interface_food product) {
        return Food_creator.make_food_from_food_mutable(make_food_mutable_from_food_enum(product));
    }

    public static Food make_food_from_food_mutable(Food_mutable mutable) {
        return new Food(mutable);
    }
}

//io.github.xjrga.foods.
