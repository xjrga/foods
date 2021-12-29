/*
 * Copyright (C) 2022 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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
package io.github.xjrga.foods.data;

import io.github.xjrga.foods.Interface_food;

/**
 * Subset from USDA National Nutrient Database for Standard Reference, Release
 * 28
 *
 */
public enum Beef_products implements Interface_food {

    Beef_loin_top_sirloin_petite_roast_filet_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, loin, top sirloin petite roast/filet, boneless, separable lean only, trimmed to 0' fat, all grades, raw", 100.0, 23.04, 0.0, 0.0, 23.04, 3.98, 0.0, 128.0, 0.0, 72.67, 0.0, 5.0, 2.24, 25.0, 222.0, 395.0, 65.0, 5.2, 0.09, 0.0, 0.0, 26.3, 2.0, 0.0, 0.1, 0.0, 0.06, 0.18, 5.86, 0.0, 0.65, 2.9, 0.0, 1.5, 4.0, 69.0, 1.28, 0.0, 0.001, 1.7, 0.12, 0.08, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beef_round_top_round_steak_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, top round steak, boneless, separable lean only, trimmed to 0' fat, all grades, raw", 100.0, 23.59, 0.0, 0.0, 23.59, 2.94, 0.0, 121.0, 0.0, 72.96, 0.0, 13.0, 2.34, 12.0, 220.0, 313.0, 54.0, 3.7, 0.04, 0.0, 0.004, 22.2, 2.0, 0.23, 0.0, 0.0, 0.06, 0.23, 6.46, 0.35, 0.63, 1.64, 64.8, 1.5, 4.0, 62.0, 1.12, 0.001, 0.002, 1.29, 0.22, 0.13, 0.004, 4.0, 4.0, 9.0, 6.93),
    Beef_round_top_round_roast_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, top round roast, boneless, separable lean only, trimmed to 0' fat, all grades, raw", 100.0, 23.59, 0.0, 0.0, 23.59, 2.94, 0.0, 121.0, 0.0, 72.96, 0.0, 13.0, 2.34, 12.0, 220.0, 313.0, 54.0, 3.7, 0.04, 0.0, 0.004, 22.2, 2.0, 0.23, 0.0, 0.0, 0.06, 0.23, 6.46, 0.35, 0.63, 1.64, 64.8, 1.5, 4.0, 62.0, 1.12, 0.001, 0.002, 1.29, 0.22, 0.13, 0.004, 4.0, 4.0, 9.0, 6.93),
    Beef_round_eye_of_round_roast_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, eye of round roast, boneless, separable lean only, trimmed to 0' fat, all grades, raw", 100.0, 23.37, 0.0, 0.0, 23.37, 3.04, 0.0, 121.0, 0.0, 73.43, 0.0, 13.0, 1.45, 12.0, 222.0, 319.0, 53.0, 3.42, 0.04, 0.0, 0.001, 22.6, 1.0, 0.24, 0.0, 0.0, 0.06, 0.18, 6.72, 0.35, 0.64, 1.84, 64.2, 1.5, 4.0, 60.0, 1.08, 0.002, 0.004, 1.26, 0.23, 0.13, 0.006, 4.0, 4.0, 9.0, 6.93),
    Beef_round_eye_of_round_steak_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, eye of round steak, boneless, separable lean only, trimmed to 0' fat, all grades, raw", 100.0, 23.37, 0.0, 0.0, 23.37, 3.04, 0.0, 121.0, 0.0, 73.43, 0.0, 13.0, 1.45, 12.0, 222.0, 319.0, 53.0, 3.42, 0.04, 0.0, 0.001, 22.6, 2.0, 0.24, 0.0, 0.0, 0.06, 0.18, 6.72, 0.35, 0.64, 1.84, 64.2, 1.5, 4.0, 60.0, 1.08, 0.002, 0.004, 1.26, 0.23, 0.13, 0.006, 4.0, 4.0, 9.0, 6.93),
    Beef_loin_tenderloin_roast_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, loin, tenderloin roast, boneless, separable lean only, trimmed to 0' fat, all grades, raw", 100.0, 21.94, 0.0, 0.0, 21.94, 5.74, 0.0, 139.0, 0.0, 72.44, 0.0, 13.0, 2.5, 12.0, 215.0, 289.0, 44.0, 3.26, 0.06, 0.0, 0.007, 20.4, 2.0, 0.23, 0.1, 0.0, 0.05, 0.31, 4.75, 0.35, 0.61, 3.53, 55.4, 1.5, 4.0, 61.0, 1.95, 0.001, 0.003, 2.12, 0.42, 0.26, 0.01, 4.0, 4.0, 9.0, 6.93),
    Beef_loin_tenderloin_steak_boneless_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, loin, tenderloin steak, boneless, separable lean only, trimmed to 0' fat, all grades, raw", 100.0, 21.94, 0.0, 0.0, 21.94, 5.74, 0.0, 139.0, 0.0, 72.44, 0.0, 13.0, 2.5, 12.0, 215.0, 289.0, 44.0, 3.26, 0.06, 0.0, 0.007, 20.4, 2.0, 0.23, 0.1, 0.0, 0.05, 0.31, 4.75, 0.35, 0.61, 3.53, 55.4, 1.5, 4.0, 61.0, 1.95, 0.001, 0.003, 2.12, 0.42, 0.26, 0.01, 4.0, 4.0, 9.0, 6.93),
    Beef_ground_97_lean_meat_3_fat_raw("Beef, ground, 97% lean meat / 3% fat, raw", 100.0, 21.98, 0.0, 0.0, 21.98, 3.0, 0.0, 121.0, 0.0, 74.75, 0.0, 8.0, 2.44, 22.0, 203.0, 357.0, 66.0, 5.21, 0.08, 0.0, 0.01, 17.7, 4.0, 0.17, 0.1, 0.0, 0.04, 0.15, 5.66, 0.67, 0.4, 2.26, 72.8, 0.1, 4.0, 60.0, 1.48, 0.0, 0.0, 1.13, 0.22, 0.0, 0.02, 4.0, 4.0, 9.0, 6.93),
    Beef_round_bottom_round_roast_separable_lean_only_trimmed_to_1_8_fat_all_grades_raw("Beef, round, bottom round, roast, separable lean only, trimmed to 1/8' fat, all grades, raw", 100.0, 22.19, 0.0, 0.0, 22.19, 4.31, 0.0, 128.0, 0.0, 72.58, 0.0, 20.0, 1.92, 24.0, 214.0, 350.0, 59.0, 4.22, 0.09, 0.0, 0.01, 28.2, 0.0, 0.29, 0.0, 0.0, 0.09, 0.14, 6.66, 0.65, 0.65, 1.57, 92.7, 1.2, 13.0, 61.0, 1.47, 0.0, 0.0, 1.81, 0.18, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beef_top_sirloin_steak_separable_lean_only_trimmed_to_1_8_fat_all_grades_raw("Beef, top sirloin, steak, separable lean only, trimmed to 1/8' fat, all grades, raw", 100.0, 22.09, 0.0, 0.0, 22.09, 4.08, 0.0, 131.0, 0.0, 72.91, 0.0, 25.0, 1.61, 23.0, 207.0, 349.0, 56.0, 4.04, 0.07, 0.0, 0.01, 27.1, 0.0, 0.32, 0.1, 0.0, 0.06, 0.11, 6.84, 0.65, 0.61, 1.09, 92.3, 1.3, 13.0, 60.0, 1.5, 0.001, 0.002, 1.64, 0.19, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beef_round_tip_round_roast_separable_lean_only_trimmed_to_0_fat_all_grades_raw("Beef, round, tip round, roast, separable lean only, trimmed to 0' fat, all grades, raw", 100.0, 21.07, 0.0, 0.0, 21.07, 3.95, 0.0, 126.0, 0.0, 74.48, 0.0, 18.0, 1.77, 22.0, 198.0, 323.0, 54.0, 3.89, 0.09, 0.0, 0.01, 26.0, 0.0, 0.27, 0.0, 0.0, 0.08, 0.13, 6.21, 0.62, 0.61, 1.47, 88.0, 1.1, 12.0, 57.0, 1.37, 0.0, 0.0, 1.64, 0.2, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beef_round_tip_round_roast_separable_lean_only_trimmed_to_0_fat_choice_raw("Beef, round, tip round, roast, separable lean only, trimmed to 0' fat, choice, raw", 100.0, 20.76, 0.0, 0.0, 20.76, 4.55, 0.0, 130.0, 0.0, 73.98, 0.0, 18.0, 1.92, 23.0, 200.0, 318.0, 52.0, 3.87, 0.09, 0.0, 0.01, 25.8, 0.0, 0.28, 0.0, 0.0, 0.08, 0.14, 6.31, 0.61, 0.61, 1.73, 86.7, 1.1, 12.0, 58.0, 1.55, 0.0, 0.0, 1.85, 0.22, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),;

    private final String name;
    private final Double weight;
    private final Double complete_protein;
    private final Double cost;
    private final Double glycemic_index;
    private final Double protein;
    private final Double fat;
    private final Double carbohydrate_by_difference;
    private final Double energy_gross;
    private final Double alcohol;
    private final Double water;
    private final Double fiber;
    private final Double calcium;
    private final Double iron;
    private final Double magnesium;
    private final Double phosphorus;
    private final Double potassium;
    private final Double sodium;
    private final Double zinc;
    private final Double copper;
    private final Double fluoride;
    private final Double manganese;
    private final Double selenium;
    private final Double vitamin_a;
    private final Double vitamin_e;
    private final Double vitamin_d;
    private final Double vitamin_c;
    private final Double thiamin;
    private final Double riboflavin;
    private final Double niacin;
    private final Double pantothenic_acid;
    private final Double vitamin_b6;
    private final Double vitamin_b12;
    private final Double choline;
    private final Double vitamin_k;
    private final Double folate;
    private final Double cholesterol;
    private final Double saturated_fat;
    private final Double dha;
    private final Double epa;
    private final Double monounsaturated_fat;
    private final Double polyunsaturated_fat;
    private final Double linoleic_acid;
    private final Double alpha_linolenic_acid;
    private final Double protein_atwater_factor;
    private final Double carbohydrate_by_difference_atwater_factor;
    private final Double fat_atwater_factor;
    private final Double alcohol_atwater_factor;

    Beef_products(
            String name,
            Double weight,
            Double complete_protein,
            Double cost,
            Double glycemic_index,
            Double protein,
            Double fat,
            Double carbohydrate_by_difference,
            Double energy_gross,
            Double alcohol,
            Double water,
            Double fiber,
            Double calcium,
            Double iron,
            Double magnesium,
            Double phosphorus,
            Double potassium,
            Double sodium,
            Double zinc,
            Double copper,
            Double fluoride,
            Double manganese,
            Double selenium,
            Double vitamin_a,
            Double vitamin_e,
            Double vitamin_d,
            Double vitamin_c,
            Double thiamin,
            Double riboflavin,
            Double niacin,
            Double pantothenic_acid,
            Double vitamin_b6,
            Double vitamin_b12,
            Double choline,
            Double vitamin_k,
            Double folate,
            Double cholesterol,
            Double saturated_fat,
            Double dha,
            Double epa,
            Double monounsaturated_fat,
            Double polyunsaturated_fat,
            Double linoleic_acid,
            Double alpha_linolenic_acid,
            Double protein_atwater_factor,
            Double carbohydrate_by_difference_atwater_factor,
            Double fat_atwater_factor,
            Double alcohol_atwater_factor
    ) {
        this.name = name;
        this.weight = weight;
        this.complete_protein = complete_protein;
        this.cost = cost;
        this.glycemic_index = glycemic_index;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate_by_difference = carbohydrate_by_difference;
        this.energy_gross = energy_gross;
        this.alcohol = alcohol;
        this.water = water;
        this.fiber = fiber;
        this.calcium = calcium;
        this.iron = iron;
        this.magnesium = magnesium;
        this.phosphorus = phosphorus;
        this.potassium = potassium;
        this.sodium = sodium;
        this.zinc = zinc;
        this.copper = copper;
        this.fluoride = fluoride;
        this.manganese = manganese;
        this.selenium = selenium;
        this.vitamin_a = vitamin_a;
        this.vitamin_e = vitamin_e;
        this.vitamin_d = vitamin_d;
        this.vitamin_c = vitamin_c;
        this.thiamin = thiamin;
        this.riboflavin = riboflavin;
        this.niacin = niacin;
        this.pantothenic_acid = pantothenic_acid;
        this.vitamin_b6 = vitamin_b6;
        this.vitamin_b12 = vitamin_b12;
        this.choline = choline;
        this.vitamin_k = vitamin_k;
        this.folate = folate;
        this.cholesterol = cholesterol;
        this.saturated_fat = saturated_fat;
        this.dha = dha;
        this.epa = epa;
        this.monounsaturated_fat = monounsaturated_fat;
        this.polyunsaturated_fat = polyunsaturated_fat;
        this.linoleic_acid = linoleic_acid;
        this.alpha_linolenic_acid = alpha_linolenic_acid;
        this.protein_atwater_factor = protein_atwater_factor;
        this.carbohydrate_by_difference_atwater_factor = carbohydrate_by_difference_atwater_factor;
        this.fat_atwater_factor = fat_atwater_factor;
        this.alcohol_atwater_factor = alcohol_atwater_factor;
    }

    @Override
    public String get_food_label() {
        return this.name();
    }

    @Override
    public String get_food_name() {
        return name;
    }

    @Override
    public Double get_weight() {
        return weight;
    }

    public Double get_weight_coefficient() {
        return weight / weight;
    }

    @Override
    public Double get_complete_protein() {
        return complete_protein;
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return complete_protein / weight;
    }

    @Override
    public Double get_digestible_carbohydrate() {
        return carbohydrate_by_difference - fiber;
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return get_digestible_carbohydrate() / weight;
    }

    @Override
    public Double get_cost() {
        return cost;
    }

    @Override
    public Double get_cost_coefficient() {
        return cost / weight;
    }

    @Override
    public Double get_glycemic_load() {
        return get_digestible_carbohydrate() * (get_glycemic_index() / 100);
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return get_glycemic_load() / weight;
    }

    @Override
    public Double get_energy_digestible() {
        return get_energy_protein() + get_energy_fat() + get_energy_digestible_carbohydrate() + get_energy_alcohol();
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return get_energy_digestible() / weight;
    }

    public Double get_energy_no_protein() {
        return get_energy_fat() + get_energy_digestible_carbohydrate() + get_energy_alcohol();
    }

    public Double get_energy_no_protein_coefficient() {
        return get_energy_no_protein() / weight;
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return get_digestible_carbohydrate() * carbohydrate_by_difference_atwater_factor;
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return get_energy_digestible_carbohydrate() / weight;
    }

    @Override
    public Double get_energy_protein() {
        return protein * protein_atwater_factor;
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return get_energy_protein() / weight;
    }

    @Override
    public Double get_energy_fat() {
        return fat * fat_atwater_factor;
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return get_energy_fat() / weight;
    }

    @Override
    public Double get_energy_alcohol() {
        return alcohol * alcohol_atwater_factor;
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return get_energy_alcohol() / weight;
    }

    @Override
    public Double get_protein() {
        return protein;
    }

    @Override
    public Double get_protein_coefficient() {
        return protein / weight;
    }

    @Override
    public Double get_fat() {
        return fat;
    }

    @Override
    public Double get_fat_coefficient() {
        return fat / weight;
    }

    @Override
    public Double get_carbohydrate_by_difference() {
        return carbohydrate_by_difference;
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return carbohydrate_by_difference / weight;
    }

    @Override
    public Double get_energy_gross() {
        return energy_gross;
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return energy_gross / weight;
    }

    @Override
    public Double get_alcohol() {
        return alcohol;
    }

    @Override
    public Double get_alcohol_coefficient() {
        return alcohol / weight;
    }

    @Override
    public Double get_water() {
        return water;
    }

    @Override
    public Double get_water_coefficient() {
        return water / weight;
    }

    @Override
    public Double get_fiber() {
        return fiber;
    }

    @Override
    public Double get_fiber_coefficient() {
        return fiber / weight;
    }

    @Override
    public Double get_calcium() {
        return calcium;
    }

    @Override
    public Double get_calcium_coefficient() {
        return calcium / weight;
    }

    @Override
    public Double get_iron() {
        return iron;
    }

    @Override
    public Double get_iron_coefficient() {
        return iron / weight;
    }

    @Override
    public Double get_magnesium() {
        return magnesium;
    }

    @Override
    public Double get_magnesium_coefficient() {
        return magnesium / weight;
    }

    @Override
    public Double get_phosphorus() {
        return phosphorus;
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return phosphorus / weight;
    }

    @Override
    public Double get_potassium() {
        return potassium;
    }

    @Override
    public Double get_potassium_coefficient() {
        return potassium / weight;
    }

    @Override
    public Double get_sodium() {
        return sodium;
    }

    @Override
    public Double get_sodium_coefficient() {
        return sodium / weight;
    }

    @Override
    public Double get_zinc() {
        return zinc;
    }

    @Override
    public Double get_zinc_coefficient() {
        return zinc / weight;
    }

    @Override
    public Double get_copper() {
        return copper;
    }

    @Override
    public Double get_copper_coefficient() {
        return copper / weight;
    }

    @Override
    public Double get_fluoride() {
        return fluoride;
    }

    @Override
    public Double get_fluoride_coefficient() {
        return fluoride / weight;
    }

    @Override
    public Double get_manganese() {
        return manganese;
    }

    @Override
    public Double get_manganese_coefficient() {
        return manganese / weight;
    }

    @Override
    public Double get_selenium() {
        return selenium;
    }

    @Override
    public Double get_selenium_coefficient() {
        return selenium / weight;
    }

    @Override
    public Double get_vitamin_a() {
        return vitamin_a;
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return vitamin_a / weight;
    }

    @Override
    public Double get_vitamin_e() {
        return vitamin_e;
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return vitamin_e / weight;
    }

    @Override
    public Double get_vitamin_d() {
        return vitamin_d;
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return vitamin_d / weight;
    }

    @Override
    public Double get_vitamin_c() {
        return vitamin_c;
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return vitamin_c / weight;
    }

    @Override
    public Double get_thiamin() {
        return thiamin;
    }

    @Override
    public Double get_thiamin_coefficient() {
        return thiamin / weight;
    }

    @Override
    public Double get_riboflavin() {
        return riboflavin;
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return riboflavin / weight;
    }

    @Override
    public Double get_niacin() {
        return niacin;
    }

    @Override
    public Double get_niacin_coefficient() {
        return niacin / weight;
    }

    @Override
    public Double get_pantothenic_acid() {
        return pantothenic_acid;
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return pantothenic_acid / weight;
    }

    @Override
    public Double get_vitamin_b6() {
        return vitamin_b6;
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return vitamin_b6 / weight;
    }

    @Override
    public Double get_vitamin_b12() {
        return vitamin_b12;
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return vitamin_b12 / weight;
    }

    @Override
    public Double get_choline() {
        return choline;
    }

    @Override
    public Double get_choline_coefficient() {
        return choline / weight;
    }

    @Override
    public Double get_vitamin_k() {
        return vitamin_k;
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return vitamin_k / weight;
    }

    @Override
    public Double get_folate() {
        return folate;
    }

    @Override
    public Double get_folate_coefficient() {
        return folate / weight;
    }

    @Override
    public Double get_cholesterol() {
        return cholesterol;
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return cholesterol / weight;
    }

    @Override
    public Double get_saturated_fat() {
        return saturated_fat;
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return saturated_fat / weight;
    }

    @Override
    public Double get_dha() {
        return dha;
    }

    @Override
    public Double get_dha_coefficient() {
        return dha / weight;
    }

    @Override
    public Double get_epa() {
        return epa;
    }

    @Override
    public Double get_epa_coefficient() {
        return epa / weight;
    }

    @Override
    public Double get_monounsaturated_fat() {
        return monounsaturated_fat;
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return monounsaturated_fat / weight;
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return polyunsaturated_fat;
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return polyunsaturated_fat / weight;
    }

    @Override
    public Double get_linoleic_acid() {
        return linoleic_acid;
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return linoleic_acid / weight;
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return alpha_linolenic_acid;
    }

    @Override
    public Double get_alpha_linolenic_acid_coefficient() {
        return alpha_linolenic_acid / weight;
    }

    public static String get_category_name() {
        return "Beef Products";
    }

    @Override
    public String toString() {
        return get_food_name();
    }

    @Override
    public Double get_protein_atwater_factor() {
        return protein_atwater_factor;
    }

    @Override
    public Double get_carbohydrate_by_difference_atwater_factor() {
        return carbohydrate_by_difference_atwater_factor;
    }

    @Override
    public Double get_fat_atwater_factor() {
        return fat_atwater_factor;
    }

    @Override
    public Double get_alcohol_atwater_factor() {
        return alcohol_atwater_factor;
    }

    @Override
    public Double get_glycemic_index() {
        return glycemic_index;
    }

    @Override
    public Double get_food_quotient() {
        Double fq = get_energy_digestible_carbohydrate() / get_energy_digestible() * 1.00
                + get_energy_fat() / get_energy_digestible() * 0.71
                + get_energy_protein() / get_energy_digestible() * 0.81
                + get_energy_alcohol() / get_energy_digestible() * 0.667;
        return fq;
    }
}