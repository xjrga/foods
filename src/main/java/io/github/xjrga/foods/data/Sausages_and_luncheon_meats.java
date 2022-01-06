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
public enum Sausages_and_luncheon_meats implements Interface_food {

    Ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added("Ham, sliced, pre-packaged, deli meat (96%fat free, water added)", 100.0, 16.85, 0.0, 0.0, 16.85, 4.04, 0.7, 107.0, 0.0, 74.84, 0.0, 5.0, 0.59, 19.0, 252.0, 463.0, 945.0, 1.51, 0.05, 0.0, 0.01, 31.6, 0.0, 0.29, 0.6, 0.0, 0.33, 0.26, 5.69, 0.69, 0.39, 0.36, 62.4, 0.0, 0.0, 41.0, 1.22, 0.002, 0.001, 1.61, 0.62, 0.5, 0.01, 4.0, 4.0, 9.0, 6.93),
    Oscar_mayer_chicken_breast_honey_glazed("OSCAR MAYER, Chicken Breast (honey glazed)", 100.0, 19.85, 0.0, 0.0, 19.85, 1.5, 4.3, 109.0, 0.0, 70.4, 0.0, 10.0, 1.13, 36.0, 289.0, 329.0, 1438.0, 0.7, 0.17, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 53.0, 0.39, 0.0, 0.0, 0.56, 0.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Frankfurter_beef_pork_and_turkey_fat_free("Frankfurter, beef, pork, and turkey, fat free", 100.0, 12.5, 0.0, 0.0, 12.5, 1.59, 11.21, 109.0, 0.0, 71.5, 0.0, 54.0, 1.78, 14.0, 132.0, 220.0, 880.0, 2.92, 0.11, 0.0, 0.0, 18.7, 0.0, 0.0, 0.1, 24.0, 0.16, 0.15, 3.46, 0.0, 0.18, 1.06, 74.9, 1.8, 6.0, 41.0, 0.5, 0.0, 0.0, 0.74, 0.35, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pastrami_beef_98_fat_free("Pastrami, beef, 98% fat-free", 100.0, 19.6, 0.0, 0.0, 19.6, 1.16, 1.54, 95.0, 0.0, 74.3, 0.0, 9.0, 2.78, 18.0, 150.0, 228.0, 1010.0, 4.26, 0.07, 0.0, 0.01, 10.4, 0.0, 0.0, 0.0, 34.6, 0.09, 0.17, 5.06, 0.3, 0.18, 1.76, 0.0, 0.0, 7.0, 47.0, 0.0, 0.0, 0.0, 0.56, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Chicken_breast_fat_free_mesquite_flavor_sliced("Chicken breast, fat-free, mesquite flavor, sliced", 100.0, 16.8, 0.0, 0.0, 16.8, 0.39, 2.25, 80.0, 0.0, 76.73, 0.0, 4.0, 0.3, 36.0, 256.0, 316.0, 1040.0, 0.6, 0.23, 0.0, 0.03, 6.1, 0.0, 0.0, 0.0, 0.0, 0.01, 0.02, 2.74, 0.19, 0.12, 0.07, 0.0, 0.0, 1.0, 36.0, 0.13, 0.0, 0.0, 0.16, 0.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Chicken_breast_oven_roasted_fat_free_sliced("Chicken breast, oven-roasted, fat-free, sliced", 100.0, 16.79, 0.0, 0.0, 16.79, 0.39, 2.17, 79.0, 0.0, 76.71, 0.0, 6.0, 0.32, 9.0, 60.0, 67.0, 1087.0, 0.3, 0.03, 0.0, 0.04, 7.6, 0.0, 0.0, 0.0, 0.0, 0.01, 0.02, 3.42, 0.24, 0.15, 0.09, 0.0, 0.0, 1.0, 36.0, 0.13, 0.002, 0.001, 0.12, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Turkey_breast_smoked_lemon_pepper_flavor_97_fat_free("Turkey, breast, smoked, lemon pepper flavor, 97% fat-free", 100.0, 20.9, 0.0, 0.0, 20.9, 0.69, 1.31, 95.0, 0.0, 73.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1160.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 48.0, 0.22, 0.0, 0.0, 0.25, 0.19, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged("Chicken breast, deli, rotisserie seasoned, sliced, prepackaged", 100.0, 17.4, 0.0, 0.0, 17.4, 1.86, 2.92, 98.0, 0.0, 74.47, 0.0, 11.0, 0.39, 26.0, 257.0, 360.0, 1032.0, 0.51, 0.02, 0.0, 0.01, 13.2, 2.0, 0.32, 0.1, 0.0, 0.04, 0.07, 9.05, 0.97, 0.44, 0.14, 44.2, 0.0, 7.0, 51.0, 0.56, 0.003, 0.001, 0.74, 0.45, 0.35, 0.01, 4.0, 4.0, 9.0, 6.93),;

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

    Sausages_and_luncheon_meats(
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
    public Double get_weight_in_grams() {
        return weight;
    }

    public Double get_weight_coefficient() {
        return weight / weight;
    }

    @Override
    public Double get_complete_protein_in_grams() {
        return complete_protein;
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return complete_protein / weight;
    }

    @Override
    public Double get_digestible_carbohydrate_in_grams() {
        return carbohydrate_by_difference - fiber;
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return get_digestible_carbohydrate_in_grams() / weight;
    }

    @Override
    public Double get_cost_in_dollars() {
        return cost;
    }

    @Override
    public Double get_cost_coefficient() {
        return cost / weight;
    }

    @Override
    public Double get_glycemic_load() {
        return get_digestible_carbohydrate_in_grams() * (get_glycemic_index() / 100);
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return get_glycemic_load() / weight;
    }

    @Override
    public Double get_energy_digestible_in_kilocalories() {
        return get_energy_protein_in_kilocalories() + get_energy_fat_in_kilocalories() + get_energy_digestible_carbohydrate_in_kilocalories() + get_energy_alcohol_in_kilocalories();
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return get_energy_digestible_in_kilocalories() / weight;
    }

    public Double get_energy_no_protein() {
        return get_energy_fat_in_kilocalories() + get_energy_digestible_carbohydrate_in_kilocalories() + get_energy_alcohol_in_kilocalories();
    }

    public Double get_energy_no_protein_coefficient() {
        return get_energy_no_protein() / weight;
    }

    @Override
    public Double get_energy_digestible_carbohydrate_in_kilocalories() {
        return get_digestible_carbohydrate_in_grams() * carbohydrate_by_difference_atwater_factor;
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return get_energy_digestible_carbohydrate_in_kilocalories() / weight;
    }

    @Override
    public Double get_energy_protein_in_kilocalories() {
        return protein * protein_atwater_factor;
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return get_energy_protein_in_kilocalories() / weight;
    }

    @Override
    public Double get_energy_fat_in_kilocalories() {
        return fat * fat_atwater_factor;
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return get_energy_fat_in_kilocalories() / weight;
    }

    @Override
    public Double get_energy_alcohol_in_kilocalories() {
        return alcohol * alcohol_atwater_factor;
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return get_energy_alcohol_in_kilocalories() / weight;
    }

    @Override
    public Double get_protein_in_grams() {
        return protein;
    }

    @Override
    public Double get_protein_coefficient() {
        return protein / weight;
    }

    @Override
    public Double get_fat_in_grams() {
        return fat;
    }

    @Override
    public Double get_fat_coefficient() {
        return fat / weight;
    }

    @Override
    public Double get_carbohydrate_by_difference_in_grams() {
        return carbohydrate_by_difference;
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return carbohydrate_by_difference / weight;
    }

    @Override
    public Double get_energy_gross_in_kilocalories() {
        return energy_gross;
    }

    @Override
    public Double get_energy_gross_coefficient_in_kilocalories() {
        return energy_gross / weight;
    }

    @Override
    public Double get_alcohol_in_grams() {
        return alcohol;
    }

    @Override
    public Double get_alcohol_coefficient() {
        return alcohol / weight;
    }

    @Override
    public Double get_water_in_grams() {
        return water;
    }

    @Override
    public Double get_water_coefficient() {
        return water / weight;
    }

    @Override
    public Double get_fiber_in_grams() {
        return fiber;
    }

    @Override
    public Double get_fiber_coefficient() {
        return fiber / weight;
    }

    @Override
    public Double get_calcium_in_milligrams() {
        return calcium;
    }

    @Override
    public Double get_calcium_coefficient() {
        return calcium / weight;
    }

    @Override
    public Double get_iron_in_milligrams() {
        return iron;
    }

    @Override
    public Double get_iron_coefficient() {
        return iron / weight;
    }

    @Override
    public Double get_magnesium_in_milligrams() {
        return magnesium;
    }

    @Override
    public Double get_magnesium_coefficient() {
        return magnesium / weight;
    }

    @Override
    public Double get_phosphorus_in_milligrams() {
        return phosphorus;
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return phosphorus / weight;
    }

    @Override
    public Double get_potassium_in_milligrams() {
        return potassium;
    }

    @Override
    public Double get_potassium_coefficient() {
        return potassium / weight;
    }

    @Override
    public Double get_sodium_in_milligrams() {
        return sodium;
    }

    @Override
    public Double get_sodium_coefficient() {
        return sodium / weight;
    }

    @Override
    public Double get_zinc_in_milligrams() {
        return zinc;
    }

    @Override
    public Double get_zinc_coefficient() {
        return zinc / weight;
    }

    @Override
    public Double get_copper_in_milligrams() {
        return copper;
    }

    @Override
    public Double get_copper_coefficient() {
        return copper / weight;
    }

    @Override
    public Double get_fluoride_in_micrograms() {
        return fluoride;
    }

    @Override
    public Double get_fluoride_coefficient() {
        return fluoride / weight;
    }

    @Override
    public Double get_manganese_in_milligrams() {
        return manganese;
    }

    @Override
    public Double get_manganese_coefficient() {
        return manganese / weight;
    }

    @Override
    public Double get_selenium_in_micrograms() {
        return selenium;
    }

    @Override
    public Double get_selenium_coefficient() {
        return selenium / weight;
    }

    @Override
    public Double get_vitamin_a_in_micrograms() {
        return vitamin_a;
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return vitamin_a / weight;
    }

    @Override
    public Double get_vitamin_e_in_milligrams() {
        return vitamin_e;
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return vitamin_e / weight;
    }

    @Override
    public Double get_vitamin_d_in_micrograms() {
        return vitamin_d;
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return vitamin_d / weight;
    }

    @Override
    public Double get_vitamin_c_in_milligrams() {
        return vitamin_c;
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return vitamin_c / weight;
    }

    @Override
    public Double get_thiamin_in_milligrams() {
        return thiamin;
    }

    @Override
    public Double get_thiamin_coefficient() {
        return thiamin / weight;
    }

    @Override
    public Double get_riboflavin_in_milligrams() {
        return riboflavin;
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return riboflavin / weight;
    }

    @Override
    public Double get_niacin_in_milligrams() {
        return niacin;
    }

    @Override
    public Double get_niacin_coefficient() {
        return niacin / weight;
    }

    @Override
    public Double get_pantothenic_acid_in_milligrams() {
        return pantothenic_acid;
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return pantothenic_acid / weight;
    }

    @Override
    public Double get_vitamin_b6_in_milligrams() {
        return vitamin_b6;
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return vitamin_b6 / weight;
    }

    @Override
    public Double get_vitamin_b12_in_micrograms() {
        return vitamin_b12;
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return vitamin_b12 / weight;
    }

    @Override
    public Double get_choline_in_milligrams() {
        return choline;
    }

    @Override
    public Double get_choline_coefficient() {
        return choline / weight;
    }

    @Override
    public Double get_vitamin_k_in_micrograms() {
        return vitamin_k;
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return vitamin_k / weight;
    }

    @Override
    public Double get_folate_in_micrograms() {
        return folate;
    }

    @Override
    public Double get_folate_coefficient() {
        return folate / weight;
    }

    @Override
    public Double get_cholesterol_in_milligrams() {
        return cholesterol;
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return cholesterol / weight;
    }

    @Override
    public Double get_saturated_fat_in_grams() {
        return saturated_fat;
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return saturated_fat / weight;
    }

    @Override
    public Double get_dha_in_grams() {
        return dha;
    }

    @Override
    public Double get_dha_coefficient() {
        return dha / weight;
    }

    @Override
    public Double get_epa_in_grams() {
        return epa;
    }

    @Override
    public Double get_epa_coefficient() {
        return epa / weight;
    }

    @Override
    public Double get_monounsaturated_fat_in_grams() {
        return monounsaturated_fat;
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return monounsaturated_fat / weight;
    }

    @Override
    public Double get_polyunsaturated_fat_in_grams() {
        return polyunsaturated_fat;
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return polyunsaturated_fat / weight;
    }

    @Override
    public Double get_linoleic_acid_in_grams() {
        return linoleic_acid;
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return linoleic_acid / weight;
    }

    @Override
    public Double get_alpha_linolenic_acid_in_grams() {
        return alpha_linolenic_acid;
    }

    @Override
    public Double get_alpha_linolenic_acid_coefficient() {
        return alpha_linolenic_acid / weight;
    }

    public static String get_category_name() {
        return "Sausages and Luncheon Meats";
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
        Double fq = get_energy_digestible_carbohydrate_in_kilocalories() / get_energy_digestible_in_kilocalories() * 1.00
                + get_energy_fat_in_kilocalories() / get_energy_digestible_in_kilocalories() * 0.71
                + get_energy_protein_in_kilocalories() / get_energy_digestible_in_kilocalories() * 0.81
                + get_energy_alcohol_in_kilocalories() / get_energy_digestible_in_kilocalories() * 0.667;
        return fq;
    }
}
