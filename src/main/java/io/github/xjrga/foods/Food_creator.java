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
        mutable.set_weight(product.get_weight());
        mutable.set_complete_protein(product.get_complete_protein());
        mutable.set_cost(product.get_cost());
        mutable.set_glycemic_index(product.get_glycemic_index());
        mutable.set_protein(product.get_protein());
        mutable.set_fat(product.get_fat());
        mutable.set_carbohydrate_by_difference(product.get_carbohydrate_by_difference());
        mutable.set_energy_gross(product.get_energy_gross());
        mutable.set_alcohol(product.get_alcohol());
        mutable.set_water(product.get_water());
        mutable.set_fiber(product.get_fiber());
        mutable.set_calcium(product.get_calcium());
        mutable.set_iron(product.get_iron());
        mutable.set_magnesium(product.get_magnesium());
        mutable.set_phosphorus(product.get_phosphorus());
        mutable.set_potassium(product.get_potassium());
        mutable.set_sodium(product.get_sodium());
        mutable.set_zinc(product.get_zinc());
        mutable.set_copper(product.get_copper());
        mutable.set_fluoride(product.get_fluoride());
        mutable.set_manganese(product.get_manganese());
        mutable.set_selenium(product.get_selenium());
        mutable.set_vitamin_a(product.get_vitamin_a());
        mutable.set_vitamin_e(product.get_vitamin_e());
        mutable.set_vitamin_d(product.get_vitamin_d());
        mutable.set_vitamin_c(product.get_vitamin_c());
        mutable.set_thiamin(product.get_thiamin());
        mutable.set_riboflavin(product.get_riboflavin());
        mutable.set_niacin(product.get_niacin());
        mutable.set_pantothenic_acid(product.get_pantothenic_acid());
        mutable.set_vitamin_b6(product.get_vitamin_b6());
        mutable.set_vitamin_b12(product.get_vitamin_b12());
        mutable.set_choline(product.get_choline());
        mutable.set_vitamin_k(product.get_vitamin_k());
        mutable.set_folate(product.get_folate());
        mutable.set_cholesterol(product.get_cholesterol());
        mutable.set_saturated_fat(product.get_saturated_fat());
        mutable.set_dha(product.get_dha());
        mutable.set_epa(product.get_epa());
        mutable.set_monounsaturated_fat(product.get_monounsaturated_fat());
        mutable.set_polyunsaturated_fat(product.get_polyunsaturated_fat());
        mutable.set_linoleic_acid(product.get_linoleic_acid());
        mutable.set_alpha_linolenic_acid(product.get_alpha_linolenic_acid());
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
