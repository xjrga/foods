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
public class Sausages_and_luncheon_meats extends Abstract_category {

    public Sausages_and_luncheon_meats() {
        add(get_ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added());
        add(get_oscar_mayer_chicken_breast_honey_glazed());
        add(get_frankfurter_beef_pork_and_turkey_fat_free());
        add(get_pastrami_beef_98_fat_free());
        add(get_chicken_breast_fat_free_mesquite_flavor_sliced());
        add(get_chicken_breast_oven_roasted_fat_free_sliced());
        add(get_turkey_breast_smoked_lemon_pepper_flavor_97_fat_free());
        add(get_chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged());
        set_name("Sausages and Luncheon Meats");
    }

    public Interface_food get_ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Ham, sliced, pre-packaged, deli meat (96%fat free, water added)");
        mutable.set_food_label("ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.01000);
        mutable.set_calcium(5.00000);
        mutable.set_carbohydrate_by_difference(0.70000);
        mutable.set_cholesterol(41.00000);
        mutable.set_choline(62.40000);
        mutable.set_complete_protein(16.85000);
        mutable.set_copper(0.05000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00200);
        mutable.set_epa(0.00100);
        mutable.set_fat(4.04000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(107.00000);
        mutable.set_iron(0.59000);
        mutable.set_linoleic_acid(0.50000);
        mutable.set_magnesium(19.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(1.61000);
        mutable.set_niacin(5.69000);
        mutable.set_pantothenic_acid(0.69000);
        mutable.set_phosphorus(252.00000);
        mutable.set_polyunsaturated_fat(0.62000);
        mutable.set_potassium(463.00000);
        mutable.set_protein(16.85000);
        mutable.set_riboflavin(0.26000);
        mutable.set_saturated_fat(1.22000);
        mutable.set_selenium(31.60000);
        mutable.set_sodium(945.00000);
        mutable.set_thiamin(0.33000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.36000);
        mutable.set_vitamin_b6(0.39000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.60000);
        mutable.set_vitamin_e(0.29000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(74.84000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.51000);
        return new Food(mutable);
    }

    public Interface_food get_oscar_mayer_chicken_breast_honey_glazed() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("OSCAR MAYER, Chicken Breast (honey glazed)");
        mutable.set_food_label("oscar_mayer_chicken_breast_honey_glazed");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(10.00000);
        mutable.set_carbohydrate_by_difference(4.30000);
        mutable.set_cholesterol(53.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(19.85000);
        mutable.set_copper(0.17000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.50000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(4.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(109.00000);
        mutable.set_iron(1.13000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(36.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(0.56000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(289.00000);
        mutable.set_polyunsaturated_fat(0.21000);
        mutable.set_potassium(329.00000);
        mutable.set_protein(19.85000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(0.39000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(1438.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(70.40000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.70000);
        return new Food(mutable);
    }

    public Interface_food get_frankfurter_beef_pork_and_turkey_fat_free() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Frankfurter, beef, pork, and turkey, fat free");
        mutable.set_food_label("frankfurter_beef_pork_and_turkey_fat_free");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(54.00000);
        mutable.set_carbohydrate_by_difference(11.21000);
        mutable.set_cholesterol(41.00000);
        mutable.set_choline(74.90000);
        mutable.set_complete_protein(12.50000);
        mutable.set_copper(0.11000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.59000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(6.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(109.00000);
        mutable.set_iron(1.78000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(14.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(0.74000);
        mutable.set_niacin(3.46000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(132.00000);
        mutable.set_polyunsaturated_fat(0.35000);
        mutable.set_potassium(220.00000);
        mutable.set_protein(12.50000);
        mutable.set_riboflavin(0.15000);
        mutable.set_saturated_fat(0.50000);
        mutable.set_selenium(18.70000);
        mutable.set_sodium(880.00000);
        mutable.set_thiamin(0.16000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(1.06000);
        mutable.set_vitamin_b6(0.18000);
        mutable.set_vitamin_c(24.00000);
        mutable.set_vitamin_d(0.10000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(1.80000);
        mutable.set_water(71.50000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(2.92000);
        return new Food(mutable);
    }

    public Interface_food get_pastrami_beef_98_fat_free() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Pastrami, beef, 98% fat-free");
        mutable.set_food_label("pastrami_beef_98_fat_free");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(9.00000);
        mutable.set_carbohydrate_by_difference(1.54000);
        mutable.set_cholesterol(47.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(19.60000);
        mutable.set_copper(0.07000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(1.16000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(7.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(95.00000);
        mutable.set_iron(2.78000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(18.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(0.56000);
        mutable.set_niacin(5.06000);
        mutable.set_pantothenic_acid(0.30000);
        mutable.set_phosphorus(150.00000);
        mutable.set_polyunsaturated_fat(0.04000);
        mutable.set_potassium(228.00000);
        mutable.set_protein(19.60000);
        mutable.set_riboflavin(0.17000);
        mutable.set_saturated_fat(0.00000);
        mutable.set_selenium(10.40000);
        mutable.set_sodium(1010.00000);
        mutable.set_thiamin(0.09000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(1.76000);
        mutable.set_vitamin_b6(0.18000);
        mutable.set_vitamin_c(34.60000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(74.30000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(4.26000);
        return new Food(mutable);
    }

    public Interface_food get_chicken_breast_fat_free_mesquite_flavor_sliced() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Chicken breast, fat-free, mesquite flavor, sliced");
        mutable.set_food_label("chicken_breast_fat_free_mesquite_flavor_sliced");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(4.00000);
        mutable.set_carbohydrate_by_difference(2.25000);
        mutable.set_cholesterol(36.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(16.80000);
        mutable.set_copper(0.23000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(0.39000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(1.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(80.00000);
        mutable.set_iron(0.30000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(36.00000);
        mutable.set_manganese(0.03000);
        mutable.set_monounsaturated_fat(0.16000);
        mutable.set_niacin(2.74000);
        mutable.set_pantothenic_acid(0.19000);
        mutable.set_phosphorus(256.00000);
        mutable.set_polyunsaturated_fat(0.06000);
        mutable.set_potassium(316.00000);
        mutable.set_protein(16.80000);
        mutable.set_riboflavin(0.02000);
        mutable.set_saturated_fat(0.13000);
        mutable.set_selenium(6.10000);
        mutable.set_sodium(1040.00000);
        mutable.set_thiamin(0.01000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.07000);
        mutable.set_vitamin_b6(0.12000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(76.73000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.60000);
        return new Food(mutable);
    }

    public Interface_food get_chicken_breast_oven_roasted_fat_free_sliced() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Chicken breast, oven-roasted, fat-free, sliced");
        mutable.set_food_label("chicken_breast_oven_roasted_fat_free_sliced");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(6.00000);
        mutable.set_carbohydrate_by_difference(2.17000);
        mutable.set_cholesterol(36.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(16.79000);
        mutable.set_copper(0.03000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00200);
        mutable.set_epa(0.00100);
        mutable.set_fat(0.39000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(1.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(79.00000);
        mutable.set_iron(0.32000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(9.00000);
        mutable.set_manganese(0.04000);
        mutable.set_monounsaturated_fat(0.12000);
        mutable.set_niacin(3.42000);
        mutable.set_pantothenic_acid(0.24000);
        mutable.set_phosphorus(60.00000);
        mutable.set_polyunsaturated_fat(0.07000);
        mutable.set_potassium(67.00000);
        mutable.set_protein(16.79000);
        mutable.set_riboflavin(0.02000);
        mutable.set_saturated_fat(0.13000);
        mutable.set_selenium(7.60000);
        mutable.set_sodium(1087.00000);
        mutable.set_thiamin(0.01000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.09000);
        mutable.set_vitamin_b6(0.15000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(76.71000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.30000);
        return new Food(mutable);
    }

    public Interface_food get_turkey_breast_smoked_lemon_pepper_flavor_97_fat_free() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Turkey, breast, smoked, lemon pepper flavor, 97% fat-free");
        mutable.set_food_label("turkey_breast_smoked_lemon_pepper_flavor_97_fat_free");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(0.00000);
        mutable.set_carbohydrate_by_difference(1.31000);
        mutable.set_cholesterol(48.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(20.90000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(0.69000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(95.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(0.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(0.25000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(0.00000);
        mutable.set_polyunsaturated_fat(0.19000);
        mutable.set_potassium(0.00000);
        mutable.set_protein(20.90000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(0.22000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(1160.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(73.50000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.00000);
        return new Food(mutable);
    }

    public Interface_food get_chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Chicken breast, deli, rotisserie seasoned, sliced, prepackaged");
        mutable.set_food_label("chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.01000);
        mutable.set_calcium(11.00000);
        mutable.set_carbohydrate_by_difference(2.92000);
        mutable.set_cholesterol(51.00000);
        mutable.set_choline(44.20000);
        mutable.set_complete_protein(17.40000);
        mutable.set_copper(0.02000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00300);
        mutable.set_epa(0.00100);
        mutable.set_fat(1.86000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(7.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(98.00000);
        mutable.set_iron(0.39000);
        mutable.set_linoleic_acid(0.35000);
        mutable.set_magnesium(26.00000);
        mutable.set_manganese(0.01000);
        mutable.set_monounsaturated_fat(0.74000);
        mutable.set_niacin(9.05000);
        mutable.set_pantothenic_acid(0.97000);
        mutable.set_phosphorus(257.00000);
        mutable.set_polyunsaturated_fat(0.45000);
        mutable.set_potassium(360.00000);
        mutable.set_protein(17.40000);
        mutable.set_riboflavin(0.07000);
        mutable.set_saturated_fat(0.56000);
        mutable.set_selenium(13.20000);
        mutable.set_sodium(1032.00000);
        mutable.set_thiamin(0.04000);
        mutable.set_vitamin_a(2.00000);
        mutable.set_vitamin_b12(0.14000);
        mutable.set_vitamin_b6(0.44000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.10000);
        mutable.set_vitamin_e(0.32000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(74.47000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.51000);
        return new Food(mutable);
    }
}
