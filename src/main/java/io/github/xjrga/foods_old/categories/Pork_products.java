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
public class Pork_products extends Abstract_category {

    public Pork_products() {
        add(get_pork_fresh_loin_tenderloin_separable_lean_only_raw());
        add(get_pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted());
        add(get_pork_ground_96_lean_4_fat_raw());
        add(get_pork_ground_96_lean_4_fat_cooked_pan_broiled());
        set_name("Pork Products");
    }

    public Interface_food get_pork_fresh_loin_tenderloin_separable_lean_only_raw() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Pork, fresh, loin, tenderloin, separable lean only, raw");
        mutable.set_food_label("pork_fresh_loin_tenderloin_separable_lean_only_raw");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00800);
        mutable.set_calcium(5.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(65.00000);
        mutable.set_choline(80.80000);
        mutable.set_complete_protein(20.95000);
        mutable.set_copper(0.09000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(2.17000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(109.00000);
        mutable.set_iron(0.98000);
        mutable.set_linoleic_acid(0.29000);
        mutable.set_magnesium(27.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(0.79000);
        mutable.set_niacin(6.68000);
        mutable.set_pantothenic_acid(0.84000);
        mutable.set_phosphorus(247.00000);
        mutable.set_polyunsaturated_fat(0.36000);
        mutable.set_potassium(399.00000);
        mutable.set_protein(20.95000);
        mutable.set_riboflavin(0.34000);
        mutable.set_saturated_fat(0.69000);
        mutable.set_selenium(30.80000);
        mutable.set_sodium(53.00000);
        mutable.set_thiamin(0.99000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.51000);
        mutable.set_vitamin_b6(0.77000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.20000);
        mutable.set_vitamin_e(0.22000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(76.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.89000);
        return new Food(mutable);
    }

    public Interface_food get_pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Pork, fresh, loin, tenderloin, separable lean only, cooked, roasted");
        mutable.set_food_label("pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.01000);
        mutable.set_calcium(6.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(73.00000);
        mutable.set_choline(88.90000);
        mutable.set_complete_protein(26.17000);
        mutable.set_copper(0.11000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(3.51000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(143.00000);
        mutable.set_iron(1.15000);
        mutable.set_linoleic_acid(0.41000);
        mutable.set_magnesium(29.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(1.33000);
        mutable.set_niacin(7.43000);
        mutable.set_pantothenic_acid(1.01000);
        mutable.set_phosphorus(267.00000);
        mutable.set_polyunsaturated_fat(0.50000);
        mutable.set_potassium(421.00000);
        mutable.set_protein(26.17000);
        mutable.set_riboflavin(0.38000);
        mutable.set_saturated_fat(1.19000);
        mutable.set_selenium(38.20000);
        mutable.set_sodium(57.00000);
        mutable.set_thiamin(0.95000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.57000);
        mutable.set_vitamin_b6(0.73000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.20000);
        mutable.set_vitamin_e(0.08000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(69.45000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(2.42000);
        return new Food(mutable);
    }

    public Interface_food get_pork_ground_96_lean_4_fat_raw() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Pork, ground, 96% lean / 4% fat, raw");
        mutable.set_food_label("pork_ground_96_lean_4_fat_raw");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.02000);
        mutable.set_calcium(15.00000);
        mutable.set_carbohydrate_by_difference(0.21000);
        mutable.set_cholesterol(59.00000);
        mutable.set_choline(71.70000);
        mutable.set_complete_protein(21.10000);
        mutable.set_copper(0.03000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00700);
        mutable.set_epa(0.00300);
        mutable.set_fat(4.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(2.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(121.00000);
        mutable.set_iron(0.86000);
        mutable.set_linoleic_acid(0.53000);
        mutable.set_magnesium(19.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(1.89000);
        mutable.set_niacin(7.91000);
        mutable.set_pantothenic_acid(0.64000);
        mutable.set_phosphorus(190.00000);
        mutable.set_polyunsaturated_fat(0.66000);
        mutable.set_potassium(310.00000);
        mutable.set_protein(21.10000);
        mutable.set_riboflavin(0.36000);
        mutable.set_saturated_fat(1.42000);
        mutable.set_selenium(34.80000);
        mutable.set_sodium(67.00000);
        mutable.set_thiamin(0.41000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.64000);
        mutable.set_vitamin_b6(0.66000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.10000);
        mutable.set_vitamin_e(0.29000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(73.62000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.93000);
        return new Food(mutable);
    }

    public Interface_food get_pork_ground_96_lean_4_fat_cooked_pan_broiled() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Pork, ground, 96% lean / 4% fat, cooked, pan-broiled");
        mutable.set_food_label("pork_ground_96_lean_4_fat_cooked_pan_broiled");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.02000);
        mutable.set_calcium(20.00000);
        mutable.set_carbohydrate_by_difference(0.57000);
        mutable.set_cholesterol(85.00000);
        mutable.set_choline(95.20000);
        mutable.set_complete_protein(31.69000);
        mutable.set_copper(0.03000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00300);
        mutable.set_epa(0.00200);
        mutable.set_fat(6.20000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(3.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(185.00000);
        mutable.set_iron(1.11000);
        mutable.set_linoleic_acid(0.66000);
        mutable.set_magnesium(25.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(2.36000);
        mutable.set_niacin(10.29000);
        mutable.set_pantothenic_acid(0.84000);
        mutable.set_phosphorus(261.00000);
        mutable.set_polyunsaturated_fat(0.81000);
        mutable.set_potassium(415.00000);
        mutable.set_protein(31.69000);
        mutable.set_riboflavin(0.43000);
        mutable.set_saturated_fat(1.86000);
        mutable.set_selenium(49.10000);
        mutable.set_sodium(88.00000);
        mutable.set_thiamin(0.43000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.83000);
        mutable.set_vitamin_b6(0.62000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.20000);
        mutable.set_vitamin_e(0.40000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(60.08000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(2.59000);
        return new Food(mutable);
    }
}
