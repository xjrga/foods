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
public class Breakfast_cereals extends Abstract_category {

    public Breakfast_cereals() {
        add(get_cereals_ready_to_eat_kellogg_kellogg_s_all_bran_original());
        add(get_cereals_oats_regular_and_quick_not_fortified_dry());
        set_name("Breakfast Cereals");
    }

    public Interface_food get_cereals_ready_to_eat_kellogg_kellogg_s_all_bran_original() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Cereals ready-to-eat, KELLOGG, KELLOGG'S ALL-BRAN Original");
        mutable.set_food_label("cereals_ready_to_eat_kellogg_kellogg_s_all_bran_original");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(389.00000);
        mutable.set_carbohydrate_by_difference(74.24000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(49.40000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(1.04000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(4.90000);
        mutable.set_fiber(29.30000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(2198.00000);
        mutable.set_glycemic_index(34.00000);
        mutable.set_energy_gross(259.00000);
        mutable.set_iron(17.60000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(362.00000);
        mutable.set_manganese(7.41000);
        mutable.set_monounsaturated_fat(0.89000);
        mutable.set_niacin(14.80000);
        mutable.set_pantothenic_acid(1.06000);
        mutable.set_phosphorus(1150.00000);
        mutable.set_polyunsaturated_fat(2.00000);
        mutable.set_potassium(1020.00000);
        mutable.set_protein(13.14000);
        mutable.set_riboflavin(2.71000);
        mutable.set_saturated_fat(1.10000);
        mutable.set_selenium(9.40000);
        mutable.set_sodium(258.00000);
        mutable.set_thiamin(2.27000);
        mutable.set_vitamin_a(522.00000);
        mutable.set_vitamin_b12(18.80000);
        mutable.set_vitamin_b6(12.00000);
        mutable.set_vitamin_c(20.00000);
        mutable.set_vitamin_d(4.30000);
        mutable.set_vitamin_e(1.19000);
        mutable.set_vitamin_k(5.20000);
        mutable.set_water(2.12000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(12.40000);
        return new Food(mutable);
    }

    public Interface_food get_cereals_oats_regular_and_quick_not_fortified_dry() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Cereals, oats, regular and quick, not fortified, dry");
        mutable.set_food_label("cereals_oats_regular_and_quick_not_fortified_dry");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(52.00000);
        mutable.set_carbohydrate_by_difference(67.70000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(40.40000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.39000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(6.52000);
        mutable.set_fiber(10.10000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(32.00000);
        mutable.set_glycemic_index(65.00000);
        mutable.set_energy_gross(379.00000);
        mutable.set_iron(4.25000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(138.00000);
        mutable.set_manganese(3.63000);
        mutable.set_monounsaturated_fat(1.98000);
        mutable.set_niacin(1.12000);
        mutable.set_pantothenic_acid(1.12000);
        mutable.set_phosphorus(410.00000);
        mutable.set_polyunsaturated_fat(2.30000);
        mutable.set_potassium(362.00000);
        mutable.set_protein(13.15000);
        mutable.set_riboflavin(0.15000);
        mutable.set_saturated_fat(1.11000);
        mutable.set_selenium(28.90000);
        mutable.set_sodium(6.00000);
        mutable.set_thiamin(0.46000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.10000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.42000);
        mutable.set_vitamin_k(2.00000);
        mutable.set_water(10.84000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(3.64000);
        return new Food(mutable);
    }
}
