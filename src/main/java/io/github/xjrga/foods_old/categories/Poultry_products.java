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
public class Poultry_products extends Abstract_category {

    public Poultry_products() {
        add(get_chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw());
        add(get_chicken_broilers_or_fryers_breast_meat_only_cooked_roasted());
        add(get_turkey_breast_from_whole_bird_non_enhanced_meat_only_raw());
        add(get_turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted());
        add(get_ground_turkey_fat_free_raw());
        set_name("Poultry Products");
    }

    public Interface_food get_chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Chicken, broiler or fryers, breast, skinless, boneless, meat only, raw");
        mutable.set_food_label("chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.01000);
        mutable.set_calcium(5.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(73.00000);
        mutable.set_choline(82.10000);
        mutable.set_complete_protein(22.50000);
        mutable.set_copper(0.03000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00400);
        mutable.set_epa(0.00300);
        mutable.set_fat(2.62000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(9.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(120.00000);
        mutable.set_iron(0.37000);
        mutable.set_linoleic_acid(0.31000);
        mutable.set_magnesium(28.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(0.68000);
        mutable.set_niacin(9.60000);
        mutable.set_pantothenic_acid(1.49000);
        mutable.set_phosphorus(213.00000);
        mutable.set_polyunsaturated_fat(0.42000);
        mutable.set_potassium(334.00000);
        mutable.set_protein(22.50000);
        mutable.set_riboflavin(0.17000);
        mutable.set_saturated_fat(0.56000);
        mutable.set_selenium(22.80000);
        mutable.set_sodium(45.00000);
        mutable.set_thiamin(0.09000);
        mutable.set_vitamin_a(9.00000);
        mutable.set_vitamin_b12(0.21000);
        mutable.set_vitamin_b6(0.81000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.56000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(73.90000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.68000);
        return new Food(mutable);
    }

    public Interface_food get_chicken_broilers_or_fryers_breast_meat_only_cooked_roasted() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Chicken, broilers or fryers, breast, meat only, cooked, roasted");
        mutable.set_food_label("chicken_broilers_or_fryers_breast_meat_only_cooked_roasted");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(15.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(85.00000);
        mutable.set_choline(85.30000);
        mutable.set_complete_protein(31.02000);
        mutable.set_copper(0.04000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.02000);
        mutable.set_epa(0.01000);
        mutable.set_fat(3.57000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(4.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(165.00000);
        mutable.set_iron(1.04000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(29.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(1.24000);
        mutable.set_niacin(13.71000);
        mutable.set_pantothenic_acid(0.96000);
        mutable.set_phosphorus(228.00000);
        mutable.set_polyunsaturated_fat(0.77000);
        mutable.set_potassium(256.00000);
        mutable.set_protein(31.02000);
        mutable.set_riboflavin(0.11000);
        mutable.set_saturated_fat(1.01000);
        mutable.set_selenium(27.60000);
        mutable.set_sodium(74.00000);
        mutable.set_thiamin(0.07000);
        mutable.set_vitamin_a(6.00000);
        mutable.set_vitamin_b12(0.34000);
        mutable.set_vitamin_b6(0.60000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.10000);
        mutable.set_vitamin_e(0.27000);
        mutable.set_vitamin_k(0.30000);
        mutable.set_water(65.26000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.00000);
        return new Food(mutable);
    }

    public Interface_food get_turkey_breast_from_whole_bird_non_enhanced_meat_only_raw() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Turkey, breast, from whole bird, non-enhanced, meat only, raw");
        mutable.set_food_label("turkey_breast_from_whole_bird_non_enhanced_meat_only_raw");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00900);
        mutable.set_calcium(11.00000);
        mutable.set_carbohydrate_by_difference(0.14000);
        mutable.set_cholesterol(57.00000);
        mutable.set_choline(61.30000);
        mutable.set_complete_protein(23.66000);
        mutable.set_copper(0.07000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00200);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.48000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(7.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(114.00000);
        mutable.set_iron(0.73000);
        mutable.set_linoleic_acid(0.19000);
        mutable.set_magnesium(28.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(0.26000);
        mutable.set_niacin(9.92000);
        mutable.set_pantothenic_acid(0.77000);
        mutable.set_phosphorus(201.00000);
        mutable.set_polyunsaturated_fat(0.25000);
        mutable.set_potassium(242.00000);
        mutable.set_protein(23.66000);
        mutable.set_riboflavin(0.14000);
        mutable.set_saturated_fat(0.28000);
        mutable.set_selenium(22.70000);
        mutable.set_sodium(113.00000);
        mutable.set_thiamin(0.04000);
        mutable.set_vitamin_a(6.00000);
        mutable.set_vitamin_b12(0.63000);
        mutable.set_vitamin_b6(0.81000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.10000);
        mutable.set_vitamin_e(0.06000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(74.89000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.28000);
        return new Food(mutable);
    }

    public Interface_food get_turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Turkey, breast, from whole bird, non-enhanced, meat only, roasted");
        mutable.set_food_label("turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.02000);
        mutable.set_calcium(9.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(80.00000);
        mutable.set_choline(84.40000);
        mutable.set_complete_protein(30.13000);
        mutable.set_copper(0.06000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00400);
        mutable.set_epa(0.00400);
        mutable.set_fat(2.08000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(9.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(147.00000);
        mutable.set_iron(0.71000);
        mutable.set_linoleic_acid(0.42000);
        mutable.set_magnesium(32.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(0.62000);
        mutable.set_niacin(11.75000);
        mutable.set_pantothenic_acid(0.90000);
        mutable.set_phosphorus(230.00000);
        mutable.set_polyunsaturated_fat(0.52000);
        mutable.set_potassium(249.00000);
        mutable.set_protein(30.13000);
        mutable.set_riboflavin(0.20000);
        mutable.set_saturated_fat(0.59000);
        mutable.set_selenium(30.20000);
        mutable.set_sodium(99.00000);
        mutable.set_thiamin(0.03000);
        mutable.set_vitamin_a(3.00000);
        mutable.set_vitamin_b12(0.39000);
        mutable.set_vitamin_b6(0.80000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.30000);
        mutable.set_vitamin_e(0.06000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(67.88000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.72000);
        return new Food(mutable);
    }

    public Interface_food get_ground_turkey_fat_free_raw() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Ground turkey, fat free, raw");
        mutable.set_food_label("ground_turkey_fat_free_raw");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.02000);
        mutable.set_calcium(3.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(55.00000);
        mutable.set_choline(47.90000);
        mutable.set_complete_protein(23.57000);
        mutable.set_copper(0.05000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00600);
        mutable.set_epa(0.00200);
        mutable.set_fat(1.95000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(8.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(112.00000);
        mutable.set_iron(0.77000);
        mutable.set_linoleic_acid(0.45000);
        mutable.set_magnesium(29.00000);
        mutable.set_manganese(0.00600);
        mutable.set_monounsaturated_fat(0.51000);
        mutable.set_niacin(9.70000);
        mutable.set_pantothenic_acid(0.88000);
        mutable.set_phosphorus(227.00000);
        mutable.set_polyunsaturated_fat(0.59000);
        mutable.set_potassium(295.00000);
        mutable.set_protein(23.57000);
        mutable.set_riboflavin(0.10000);
        mutable.set_saturated_fat(0.48000);
        mutable.set_selenium(22.10000);
        mutable.set_sodium(51.00000);
        mutable.set_thiamin(0.06000);
        mutable.set_vitamin_a(7.00000);
        mutable.set_vitamin_b12(0.51000);
        mutable.set_vitamin_b6(0.85000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.40000);
        mutable.set_vitamin_e(0.07000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(74.66000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.76000);
        return new Food(mutable);
    }
}
