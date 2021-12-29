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
public class Spices_and_herbs extends Abstract_category {

    public Spices_and_herbs() {
        add(get_spices_pepper_black());
        add(get_salt_table());
        add(get_vinegar_balsamic());
        set_name("Spices and Herbs");
    }

    public Interface_food get_spices_pepper_black() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Spices, pepper, black");
        mutable.set_food_label("spices_pepper_black");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.15000);
        mutable.set_calcium(443.00000);
        mutable.set_carbohydrate_by_difference(63.95000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(11.30000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(1.33000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(3.26000);
        mutable.set_fiber(25.30000);
        mutable.set_fluoride(34.20000);
        mutable.set_folate(17.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(251.00000);
        mutable.set_iron(9.71000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(171.00000);
        mutable.set_manganese(12.75000);
        mutable.set_monounsaturated_fat(0.73000);
        mutable.set_niacin(1.14000);
        mutable.set_pantothenic_acid(1.39000);
        mutable.set_phosphorus(158.00000);
        mutable.set_polyunsaturated_fat(0.99000);
        mutable.set_potassium(1329.00000);
        mutable.set_protein(10.39000);
        mutable.set_riboflavin(0.18000);
        mutable.set_saturated_fat(1.39000);
        mutable.set_selenium(4.90000);
        mutable.set_sodium(20.00000);
        mutable.set_thiamin(0.10000);
        mutable.set_vitamin_a(27.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.29000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(1.04000);
        mutable.set_vitamin_k(163.70000);
        mutable.set_water(12.46000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.19000);
        return new Food(mutable);
    }

    public Interface_food get_salt_table() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Salt, table");
        mutable.set_food_label("salt_table");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(24.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.03000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(0.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(2.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(0.00000);
        mutable.set_iron(0.33000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(1.00000);
        mutable.set_manganese(0.10000);
        mutable.set_monounsaturated_fat(0.00000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(0.00000);
        mutable.set_polyunsaturated_fat(0.00000);
        mutable.set_potassium(8.00000);
        mutable.set_protein(0.00000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(0.00000);
        mutable.set_selenium(0.10000);
        mutable.set_sodium(38758.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(0.20000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.10000);
        return new Food(mutable);
    }

    public Interface_food get_vinegar_balsamic() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Vinegar, balsamic");
        mutable.set_food_label("vinegar_balsamic");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(27.00000);
        mutable.set_carbohydrate_by_difference(17.03000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.02000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(0.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(88.00000);
        mutable.set_iron(0.72000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(12.00000);
        mutable.set_manganese(0.13000);
        mutable.set_monounsaturated_fat(0.00000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(19.00000);
        mutable.set_polyunsaturated_fat(0.00000);
        mutable.set_potassium(112.00000);
        mutable.set_protein(0.49000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(0.00000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(23.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(76.45000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.08000);
        return new Food(mutable);
    }
}
