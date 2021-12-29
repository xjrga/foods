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
public class Supplements extends Abstract_category {

    public Supplements() {
        add(get_glucose());
        add(get_generic_multivitamin());
        set_name("Supplements");
    }

    public Interface_food get_glucose() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Glucose");
        mutable.set_food_label("glucose");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(0.00000);
        mutable.set_carbohydrate_by_difference(100.00000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(0.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(100.00000);
        mutable.set_energy_gross(400.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(0.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(0.00000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(0.00000);
        mutable.set_polyunsaturated_fat(0.00000);
        mutable.set_potassium(0.00000);
        mutable.set_protein(0.00000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(0.00000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(0.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(0.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.00000);
        return new Food(mutable);
    }

    public Interface_food get_generic_multivitamin() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Generic Multivitamin");
        mutable.set_food_label("generic_multivitamin");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(220.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.50000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(0.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(680.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(0.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(50.00000);
        mutable.set_manganese(2.30000);
        mutable.set_monounsaturated_fat(0.00000);
        mutable.set_niacin(20.00000);
        mutable.set_pantothenic_acid(10.00000);
        mutable.set_phosphorus(20.00000);
        mutable.set_polyunsaturated_fat(0.00000);
        mutable.set_potassium(80.00000);
        mutable.set_protein(0.00000);
        mutable.set_riboflavin(1.70000);
        mutable.set_saturated_fat(0.00000);
        mutable.set_selenium(19.00000);
        mutable.set_sodium(0.00000);
        mutable.set_thiamin(1.50000);
        mutable.set_vitamin_a(750.00000);
        mutable.set_vitamin_b12(25.00000);
        mutable.set_vitamin_b6(3.00000);
        mutable.set_vitamin_c(60.00000);
        mutable.set_vitamin_d(25.00000);
        mutable.set_vitamin_e(50.00000);
        mutable.set_vitamin_k(30.00000);
        mutable.set_water(0.00000);
        mutable.set_weight(1.40000);
        mutable.set_zinc(11.00000);
        return new Food(mutable);
    }
}
