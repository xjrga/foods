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
package io.github.xjrga.foods_old.categories;

import io.github.xjrga.foods_old.Abstract_category;
import io.github.xjrga.foods_old.Food;
import io.github.xjrga.foods_old.Food_mutable;
import io.github.xjrga.foods_old.Interface_food;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Fast_foods extends Abstract_category {

    public Fast_foods() {
        add(get_subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato());
        add(get_subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato());
        add(get_subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato());
        set_name("Fast Foods");
    }

    public Interface_food get_subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("SUBWAY, turkey breast sub on white bread with lettuce and tomato");
        mutable.set_food_label("subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.08000);
        mutable.set_calcium(169.00000);
        mutable.set_carbohydrate_by_difference(22.42000);
        mutable.set_cholesterol(10.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.07000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00100);
        mutable.set_epa(0.00100);
        mutable.set_fat(2.31000);
        mutable.set_fiber(1.30000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(147.00000);
        mutable.set_iron(1.84000);
        mutable.set_linoleic_acid(0.90000);
        mutable.set_magnesium(23.00000);
        mutable.set_manganese(0.29000);
        mutable.set_monounsaturated_fat(0.52000);
        mutable.set_niacin(4.61000);
        mutable.set_pantothenic_acid(0.42000);
        mutable.set_phosphorus(122.00000);
        mutable.set_polyunsaturated_fat(1.03000);
        mutable.set_potassium(253.00000);
        mutable.set_protein(9.12000);
        mutable.set_riboflavin(0.22000);
        mutable.set_saturated_fat(0.47000);
        mutable.set_selenium(17.00000);
        mutable.set_sodium(317.00000);
        mutable.set_thiamin(0.27000);
        mutable.set_vitamin_a(2.00000);
        mutable.set_vitamin_b12(0.12000);
        mutable.set_vitamin_b6(0.17000);
        mutable.set_vitamin_c(1.20000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.28000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(64.33000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.66000);
        return new Food(mutable);
    }

    public Interface_food get_subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("SUBWAY, roast beef sub on white bread with lettuce and tomato");
        mutable.set_food_label("subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.06000);
        mutable.set_calcium(164.00000);
        mutable.set_carbohydrate_by_difference(20.34000);
        mutable.set_cholesterol(18.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.08000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00100);
        mutable.set_epa(0.00400);
        mutable.set_fat(2.73000);
        mutable.set_fiber(0.70000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(155.00000);
        mutable.set_iron(2.09000);
        mutable.set_linoleic_acid(0.60000);
        mutable.set_magnesium(20.00000);
        mutable.set_manganese(0.26000);
        mutable.set_monounsaturated_fat(0.78000);
        mutable.set_niacin(4.18000);
        mutable.set_pantothenic_acid(0.41000);
        mutable.set_phosphorus(118.00000);
        mutable.set_polyunsaturated_fat(0.71000);
        mutable.set_potassium(188.00000);
        mutable.set_protein(12.17000);
        mutable.set_riboflavin(0.25000);
        mutable.set_saturated_fat(0.97000);
        mutable.set_selenium(17.00000);
        mutable.set_sodium(329.00000);
        mutable.set_thiamin(0.23000);
        mutable.set_vitamin_a(6.00000);
        mutable.set_vitamin_b12(0.44000);
        mutable.set_vitamin_b6(0.27000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.29000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(63.08000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.50000);
        return new Food(mutable);
    }

    public Interface_food get_subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("SUBWAY, oven roasted chicken sub on white bread with lettuce and tomato");
        mutable.set_food_label("subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.06000);
        mutable.set_calcium(154.00000);
        mutable.set_carbohydrate_by_difference(21.35000);
        mutable.set_cholesterol(23.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.07000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00200);
        mutable.set_epa(0.00100);
        mutable.set_fat(3.15000);
        mutable.set_fiber(1.20000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(157.00000);
        mutable.set_iron(1.72000);
        mutable.set_linoleic_acid(0.83000);
        mutable.set_magnesium(22.00000);
        mutable.set_manganese(0.28000);
        mutable.set_monounsaturated_fat(0.93000);
        mutable.set_niacin(5.21000);
        mutable.set_pantothenic_acid(0.65000);
        mutable.set_phosphorus(145.00000);
        mutable.set_polyunsaturated_fat(0.95000);
        mutable.set_potassium(198.00000);
        mutable.set_protein(10.84000);
        mutable.set_riboflavin(0.23000);
        mutable.set_saturated_fat(0.72000);
        mutable.set_selenium(16.80000);
        mutable.set_sodium(268.00000);
        mutable.set_thiamin(1.15000);
        mutable.set_vitamin_a(5.00000);
        mutable.set_vitamin_b12(0.08000);
        mutable.set_vitamin_b6(0.25000);
        mutable.set_vitamin_c(1.20000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.42000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(63.15000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.66000);
        return new Food(mutable);
    }
}
