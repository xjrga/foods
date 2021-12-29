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
public class Baby_foods extends Abstract_category {

    public Baby_foods() {
        add(get_babyfood_dessert_custard_pudding_vanilla_junior());
        set_name("Baby Foods");
    }

    public Interface_food get_babyfood_dessert_custard_pudding_vanilla_junior() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Babyfood, dessert, custard pudding, vanilla, junior");
        mutable.set_food_label("babyfood_dessert_custard_pudding_vanilla_junior");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(54.00000);
        mutable.set_carbohydrate_by_difference(17.58000);
        mutable.set_cholesterol(38.00000);
        mutable.set_choline(29.90000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.01000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00300);
        mutable.set_epa(0.00000);
        mutable.set_fat(0.98000);
        mutable.set_fiber(0.20000);
        mutable.set_fluoride(4.00000);
        mutable.set_folate(6.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(86.00000);
        mutable.set_iron(0.22000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(5.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(0.36000);
        mutable.set_niacin(0.07000);
        mutable.set_pantothenic_acid(0.23000);
        mutable.set_phosphorus(55.00000);
        mutable.set_polyunsaturated_fat(0.12000);
        mutable.set_potassium(68.00000);
        mutable.set_protein(1.76000);
        mutable.set_riboflavin(0.05000);
        mutable.set_saturated_fat(0.32000);
        mutable.set_selenium(2.40000);
        mutable.set_sodium(26.00000);
        mutable.set_thiamin(0.01000);
        mutable.set_vitamin_a(13.00000);
        mutable.set_vitamin_b12(0.23000);
        mutable.set_vitamin_b6(0.03000);
        mutable.set_vitamin_c(0.40000);
        mutable.set_vitamin_d(0.50000);
        mutable.set_vitamin_e(0.09000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(79.31000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.30000);
        return new Food(mutable);
    }
}
