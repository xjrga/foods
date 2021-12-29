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
public class Baked_products extends Abstract_category {

    public Baked_products() {
        add(get_bagels_cinnamon_raisin());
        add(get_bread_pita_white_enriched());
        add(get_bread_pita_whole_wheat());
        add(get_bread_rye());
        add(get_bread_white_wheat());
        add(get_bagels_wheat());
        add(get_bread_naan_plain_commercially_prepared_refrigerated());
        add(get_bagels_multigrain());
        set_name("Baked Products");
    }

    public Interface_food get_bagels_cinnamon_raisin() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Bagels, cinnamon-raisin");
        mutable.set_food_label("bagels_cinnamon_raisin");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(19.00000);
        mutable.set_carbohydrate_by_difference(55.20000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(14.60000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.16000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.70000);
        mutable.set_fiber(2.30000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(174.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(274.00000);
        mutable.set_iron(3.80000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(28.00000);
        mutable.set_manganese(0.87000);
        mutable.set_monounsaturated_fat(0.17000);
        mutable.set_niacin(3.08000);
        mutable.set_pantothenic_acid(0.50000);
        mutable.set_phosphorus(100.00000);
        mutable.set_polyunsaturated_fat(0.67000);
        mutable.set_potassium(148.00000);
        mutable.set_protein(9.80000);
        mutable.set_riboflavin(0.27000);
        mutable.set_saturated_fat(0.27000);
        mutable.set_selenium(31.00000);
        mutable.set_sodium(344.00000);
        mutable.set_thiamin(0.38000);
        mutable.set_vitamin_a(21.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.06000);
        mutable.set_vitamin_c(0.70000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.31000);
        mutable.set_vitamin_k(0.70000);
        mutable.set_water(32.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.13000);
        return new Food(mutable);
    }

    public Interface_food get_bread_pita_white_enriched() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Bread, pita, white, enriched");
        mutable.set_food_label("bread_pita_white_enriched");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(86.00000);
        mutable.set_carbohydrate_by_difference(55.70000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(14.60000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.16000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.20000);
        mutable.set_fiber(2.20000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(165.00000);
        mutable.set_glycemic_index(70.00000);
        mutable.set_energy_gross(275.00000);
        mutable.set_iron(2.62000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(26.00000);
        mutable.set_manganese(0.48000);
        mutable.set_monounsaturated_fat(0.10000);
        mutable.set_niacin(4.63000);
        mutable.set_pantothenic_acid(0.39000);
        mutable.set_phosphorus(97.00000);
        mutable.set_polyunsaturated_fat(0.53000);
        mutable.set_potassium(120.00000);
        mutable.set_protein(9.10000);
        mutable.set_riboflavin(0.32000);
        mutable.set_saturated_fat(0.16000);
        mutable.set_selenium(27.10000);
        mutable.set_sodium(536.00000);
        mutable.set_thiamin(0.59000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.03000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.30000);
        mutable.set_vitamin_k(0.20000);
        mutable.set_water(32.10000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.84000);
        return new Food(mutable);
    }

    public Interface_food get_bread_pita_whole_wheat() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Bread, pita, whole-wheat");
        mutable.set_food_label("bread_pita_whole_wheat");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(15.00000);
        mutable.set_carbohydrate_by_difference(55.89000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(26.50000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.29000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.71000);
        mutable.set_fiber(6.10000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(35.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(262.00000);
        mutable.set_iron(3.06000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(69.00000);
        mutable.set_manganese(1.74000);
        mutable.set_monounsaturated_fat(0.24000);
        mutable.set_niacin(2.84000);
        mutable.set_pantothenic_acid(0.83000);
        mutable.set_phosphorus(180.00000);
        mutable.set_polyunsaturated_fat(0.74000);
        mutable.set_potassium(170.00000);
        mutable.set_protein(9.80000);
        mutable.set_riboflavin(0.08000);
        mutable.set_saturated_fat(0.14000);
        mutable.set_selenium(44.00000);
        mutable.set_sodium(527.00000);
        mutable.set_thiamin(0.33000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.26000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.61000);
        mutable.set_vitamin_k(1.40000);
        mutable.set_water(30.60000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.52000);
        return new Food(mutable);
    }

    public Interface_food get_bread_rye() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Bread, rye");
        mutable.set_food_label("bread_rye");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(73.00000);
        mutable.set_carbohydrate_by_difference(48.30000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(14.60000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.18000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(3.30000);
        mutable.set_fiber(5.80000);
        mutable.set_fluoride(51.00000);
        mutable.set_folate(151.00000);
        mutable.set_glycemic_index(58.00000);
        mutable.set_energy_gross(259.00000);
        mutable.set_iron(2.83000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(40.00000);
        mutable.set_manganese(0.82000);
        mutable.set_monounsaturated_fat(1.31000);
        mutable.set_niacin(3.80000);
        mutable.set_pantothenic_acid(0.44000);
        mutable.set_phosphorus(125.00000);
        mutable.set_polyunsaturated_fat(0.79000);
        mutable.set_potassium(166.00000);
        mutable.set_protein(8.50000);
        mutable.set_riboflavin(0.33000);
        mutable.set_saturated_fat(0.62000);
        mutable.set_selenium(30.90000);
        mutable.set_sodium(603.00000);
        mutable.set_thiamin(0.43000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.07000);
        mutable.set_vitamin_c(0.40000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.33000);
        mutable.set_vitamin_k(1.20000);
        mutable.set_water(37.30000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.14000);
        return new Food(mutable);
    }

    public Interface_food get_bread_white_wheat() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Bread, white wheat");
        mutable.set_food_label("bread_white_wheat");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.08000);
        mutable.set_calcium(684.00000);
        mutable.set_carbohydrate_by_difference(43.91000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(8.10000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.14000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00300);
        mutable.set_fat(2.15000);
        mutable.set_fiber(9.20000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(162.00000);
        mutable.set_glycemic_index(70.00000);
        mutable.set_energy_gross(238.00000);
        mutable.set_iron(4.89000);
        mutable.set_linoleic_acid(0.87000);
        mutable.set_magnesium(26.00000);
        mutable.set_manganese(0.63000);
        mutable.set_monounsaturated_fat(0.39000);
        mutable.set_niacin(4.45000);
        mutable.set_pantothenic_acid(0.45000);
        mutable.set_phosphorus(103.00000);
        mutable.set_polyunsaturated_fat(0.97000);
        mutable.set_potassium(127.00000);
        mutable.set_protein(10.66000);
        mutable.set_riboflavin(0.25000);
        mutable.set_saturated_fat(0.63000);
        mutable.set_selenium(16.10000);
        mutable.set_sodium(478.00000);
        mutable.set_thiamin(0.51000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.08000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.38000);
        mutable.set_vitamin_k(7.70000);
        mutable.set_water(39.60000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.95000);
        return new Food(mutable);
    }

    public Interface_food get_bagels_wheat() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Bagels, wheat");
        mutable.set_food_label("bagels_wheat");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(20.00000);
        mutable.set_carbohydrate_by_difference(48.89000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(9.80000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.17000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.53000);
        mutable.set_fiber(4.10000);
        mutable.set_fluoride(24.10000);
        mutable.set_folate(108.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(250.00000);
        mutable.set_iron(2.76000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(51.00000);
        mutable.set_manganese(1.43000);
        mutable.set_monounsaturated_fat(0.29000);
        mutable.set_niacin(3.37000);
        mutable.set_pantothenic_acid(0.37000);
        mutable.set_phosphorus(142.00000);
        mutable.set_polyunsaturated_fat(0.93000);
        mutable.set_potassium(165.00000);
        mutable.set_protein(10.20000);
        mutable.set_riboflavin(0.20000);
        mutable.set_saturated_fat(0.00000);
        mutable.set_selenium(28.70000);
        mutable.set_sodium(439.00000);
        mutable.set_thiamin(0.40000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.14000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.32000);
        mutable.set_vitamin_k(1.50000);
        mutable.set_water(37.55000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.10000);
        return new Food(mutable);
    }

    public Interface_food get_bread_naan_plain_commercially_prepared_refrigerated() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Bread, naan, plain, commercially prepared, refrigerated");
        mutable.set_food_label("bread_naan_plain_commercially_prepared_refrigerated");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.27000);
        mutable.set_calcium(84.00000);
        mutable.set_carbohydrate_by_difference(50.43000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.12000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(5.65000);
        mutable.set_fiber(2.20000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(291.00000);
        mutable.set_iron(3.25000);
        mutable.set_linoleic_acid(1.78000);
        mutable.set_magnesium(27.00000);
        mutable.set_manganese(0.51000);
        mutable.set_monounsaturated_fat(1.80000);
        mutable.set_niacin(5.84000);
        mutable.set_pantothenic_acid(0.44000);
        mutable.set_phosphorus(100.00000);
        mutable.set_polyunsaturated_fat(2.09000);
        mutable.set_potassium(125.00000);
        mutable.set_protein(9.62000);
        mutable.set_riboflavin(0.51000);
        mutable.set_saturated_fat(1.39000);
        mutable.set_selenium(27.90000);
        mutable.set_sodium(465.00000);
        mutable.set_thiamin(0.78000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.09000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.79000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(32.60000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.81000);
        return new Food(mutable);
    }

    public Interface_food get_bagels_multigrain() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Bagels, multigrain");
        mutable.set_food_label("bagels_multigrain");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(124.00000);
        mutable.set_carbohydrate_by_difference(47.47000);
        mutable.set_cholesterol(6.00000);
        mutable.set_choline(16.10000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.23000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.24000);
        mutable.set_fiber(6.20000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(114.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(241.00000);
        mutable.set_iron(2.23000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(85.00000);
        mutable.set_manganese(1.79000);
        mutable.set_monounsaturated_fat(0.31000);
        mutable.set_niacin(4.26000);
        mutable.set_pantothenic_acid(0.51000);
        mutable.set_phosphorus(188.00000);
        mutable.set_polyunsaturated_fat(0.70000);
        mutable.set_potassium(204.00000);
        mutable.set_protein(9.90000);
        mutable.set_riboflavin(0.25000);
        mutable.set_saturated_fat(0.00000);
        mutable.set_selenium(26.90000);
        mutable.set_sodium(359.00000);
        mutable.set_thiamin(0.42000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.18000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.66000);
        mutable.set_vitamin_k(0.60000);
        mutable.set_water(39.40000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.52000);
        return new Food(mutable);
    }
}
