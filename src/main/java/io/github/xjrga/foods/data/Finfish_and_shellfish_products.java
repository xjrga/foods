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
public enum Finfish_and_shellfish_products implements Interface_food {

    Fish_mahimahi_raw("Fish, mahimahi, raw", 100.0, 18.5, 0.0, 0.0, 18.5, 0.7, 0.0, 85.0, 0.0, 77.55, 0.0, 15.0, 1.13, 30.0, 143.0, 416.0, 88.0, 0.46, 0.04, 0.0, 0.01, 36.5, 54.0, 0.0, 0.0, 0.0, 0.02, 0.07, 6.1, 0.75, 0.4, 0.6, 0.0, 0.0, 5.0, 73.0, 0.18, 0.08, 0.02, 0.12, 0.16, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_salmon_atlantic_wild_raw("Fish, salmon, Atlantic, wild, raw", 100.0, 19.84, 0.0, 0.0, 19.84, 6.34, 0.0, 142.0, 0.0, 68.5, 0.0, 12.0, 0.8, 29.0, 200.0, 490.0, 44.0, 0.64, 0.25, 0.0, 0.01, 36.5, 12.0, 0.0, 0.0, 0.0, 0.22, 0.38, 7.86, 1.66, 0.81, 3.18, 0.0, 0.0, 25.0, 55.0, 0.98, 1.11, 0.32, 2.1, 2.53, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_salmon_pink_raw("Fish, salmon, pink, raw", 100.0, 20.5, 0.0, 0.0, 20.5, 4.4, 0.0, 127.0, 0.0, 75.52, 0.0, 7.0, 0.38, 27.0, 261.0, 366.0, 75.0, 0.39, 0.06, 0.0, 0.01, 31.4, 35.0, 0.4, 10.9, 0.0, 0.08, 0.1, 7.99, 1.03, 0.61, 4.15, 94.6, 0.4, 4.0, 46.0, 0.81, 0.33, 0.18, 1.34, 0.81, 0.05, 0.04, 4.0, 4.0, 9.0, 6.93),
    Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone("Fish, sardine, Atlantic, canned in oil, drained solids with bone", 100.0, 24.62, 0.0, 0.0, 24.62, 11.45, 0.0, 208.0, 0.0, 59.61, 0.0, 382.0, 2.92, 39.0, 490.0, 397.0, 307.0, 1.31, 0.18, 0.0, 0.1, 52.7, 32.0, 2.04, 4.8, 0.0, 0.08, 0.22, 5.24, 0.64, 0.16, 8.94, 75.0, 2.6, 10.0, 142.0, 1.52, 0.5, 0.47, 3.86, 5.14, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone("Fish, sardine, Pacific, canned in tomato sauce, drained solids with bone", 100.0, 20.86, 0.0, 0.0, 20.86, 10.45, 0.54, 185.0, 0.0, 66.86, 0.1, 240.0, 2.3, 34.0, 366.0, 341.0, 414.0, 1.4, 0.27, 0.0, 0.2, 40.6, 34.0, 1.38, 4.8, 1.0, 0.04, 0.23, 4.2, 0.73, 0.12, 9.0, 76.0, 0.4, 24.0, 61.0, 2.68, 0.86, 0.53, 4.81, 2.11, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_tuna_light_canned_in_oil_drained_solids("Fish, tuna, light, canned in oil, drained solids", 100.0, 29.13, 0.0, 0.0, 29.13, 8.21, 0.0, 198.0, 0.0, 59.83, 0.0, 13.0, 1.39, 31.0, 311.0, 207.0, 416.0, 0.9, 0.07, 31.0, 0.01, 76.0, 23.0, 0.87, 6.7, 0.0, 0.03, 0.12, 12.4, 0.37, 0.11, 2.2, 29.3, 44.0, 5.0, 18.0, 1.53, 0.1, 0.02, 2.94, 2.88, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_tuna_light_canned_in_water_drained_solids("Fish, tuna, light, canned in water, drained solids", 100.0, 19.44, 0.0, 0.0, 19.44, 0.96, 0.0, 86.0, 0.0, 78.14, 0.0, 17.0, 1.63, 23.0, 139.0, 179.0, 247.0, 0.69, 0.05, 18.6, 0.01, 70.6, 17.0, 0.33, 1.2, 0.0, 0.03, 0.08, 10.13, 0.14, 0.31, 2.55, 29.3, 0.2, 4.0, 36.0, 0.21, 0.19, 0.02, 0.1, 0.27, 0.01, 0.002, 4.0, 4.0, 9.0, 6.93),
    Fish_tuna_white_canned_in_oil_drained_solids("Fish, tuna, white, canned in oil, drained solids", 100.0, 26.53, 0.0, 0.0, 26.53, 8.08, 0.0, 186.0, 0.0, 64.02, 0.0, 4.0, 0.65, 34.0, 267.0, 333.0, 396.0, 0.47, 0.13, 31.0, 0.01, 60.1, 5.0, 2.3, 0.0, 0.0, 0.01, 0.07, 11.69, 0.37, 0.43, 2.2, 0.0, 6.9, 5.0, 31.0, 1.28, 0.17, 0.06, 3.26, 2.97, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_tuna_white_canned_in_water_drained_solids("Fish, tuna, white, canned in water, drained solids", 100.0, 23.62, 0.0, 0.0, 23.62, 2.97, 0.0, 128.0, 0.0, 73.19, 0.0, 14.0, 0.97, 33.0, 217.0, 237.0, 377.0, 0.48, 0.03, 0.0, 0.01, 65.7, 6.0, 0.85, 2.0, 0.0, 0.008, 0.04, 5.79, 0.12, 0.21, 1.17, 29.3, 2.5, 2.0, 42.0, 0.79, 0.62, 0.23, 0.78, 1.1, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_mahimahi_cooked_dry_heat("Fish, mahimahi, cooked, dry heat", 100.0, 23.72, 0.0, 0.0, 23.72, 0.9, 0.0, 109.0, 0.0, 71.22, 0.0, 19.0, 1.45, 38.0, 183.0, 533.0, 113.0, 0.59, 0.05, 0.0, 0.01, 46.8, 62.0, 0.0, 0.0, 0.0, 0.02, 0.08, 7.42, 0.86, 0.46, 0.69, 0.0, 0.0, 6.0, 94.0, 0.24, 0.11, 0.02, 0.15, 0.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_salmon_atlantic_wild_cooked_dry_heat("Fish, salmon, Atlantic, wild, cooked, dry heat", 100.0, 25.44, 0.0, 0.0, 25.44, 8.13, 0.0, 182.0, 0.0, 59.62, 0.0, 15.0, 1.03, 37.0, 256.0, 628.0, 56.0, 0.82, 0.32, 0.0, 0.02, 46.8, 13.0, 0.0, 0.0, 0.0, 0.27, 0.48, 10.07, 1.92, 0.94, 3.05, 0.0, 0.0, 29.0, 71.0, 1.25, 1.42, 0.41, 2.69, 3.25, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_salmon_pink_cooked_dry_heat("Fish, salmon, pink, cooked, dry heat", 100.0, 24.58, 0.0, 0.0, 24.58, 5.28, 0.0, 153.0, 0.0, 70.65, 0.0, 8.0, 0.45, 32.0, 313.0, 439.0, 90.0, 0.46, 0.07, 0.0, 0.01, 37.6, 42.0, 0.48, 13.0, 0.0, 0.09, 0.12, 9.58, 1.23, 0.69, 4.73, 113.4, 0.5, 5.0, 55.0, 0.97, 0.39, 0.21, 1.61, 0.97, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_salmon_atlantic_farmed_raw("Fish, salmon, Atlantic, farmed, raw", 100.0, 20.42, 0.0, 0.0, 20.42, 13.42, 0.0, 208.0, 0.0, 64.89, 0.0, 9.0, 0.34, 27.0, 240.0, 363.0, 59.0, 0.36, 0.04, 0.0, 0.01, 24.0, 58.0, 3.55, 11.0, 3.9, 0.2, 0.15, 8.67, 1.54, 0.63, 3.23, 78.5, 0.5, 26.0, 55.0, 3.05, 1.1, 0.86, 3.77, 3.88, 0.0, 0.14, 4.0, 4.0, 9.0, 6.93),
    Fish_salmon_atlantic_farmed_cooked_dry_heat("Fish, salmon, Atlantic, farmed, cooked, dry heat", 100.0, 22.1, 0.0, 0.0, 22.1, 12.35, 0.0, 206.0, 0.0, 64.75, 0.0, 15.0, 0.34, 30.0, 252.0, 384.0, 61.0, 0.43, 0.04, 0.0, 0.01, 41.4, 69.0, 1.14, 13.1, 3.7, 0.34, 0.13, 8.04, 1.47, 0.64, 2.8, 90.5, 0.1, 34.0, 63.0, 2.39, 1.45, 0.69, 4.18, 4.55, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fish_tilapia_raw("Fish, tilapia, raw", 100.0, 20.08, 0.0, 0.0, 20.08, 1.7, 0.0, 96.0, 0.0, 78.08, 0.0, 10.0, 0.56, 27.0, 170.0, 302.0, 52.0, 0.33, 0.07, 0.0, 0.03, 41.8, 0.0, 0.4, 3.1, 0.0, 0.04, 0.06, 3.9, 0.48, 0.16, 1.58, 42.5, 1.4, 24.0, 50.0, 0.58, 0.08, 0.005, 0.49, 0.36, 0.0, 0.03, 4.0, 4.0, 9.0, 6.93),
    Fish_tilapia_cooked_dry_heat("Fish, tilapia, cooked, dry heat", 100.0, 26.15, 0.0, 0.0, 26.15, 2.65, 0.0, 128.0, 0.0, 71.59, 0.0, 14.0, 0.69, 34.0, 204.0, 380.0, 56.0, 0.41, 0.07, 0.0, 0.03, 54.4, 0.0, 0.79, 3.7, 0.0, 0.09, 0.07, 4.74, 0.66, 0.12, 1.86, 51.3, 0.9, 6.0, 57.0, 0.94, 0.13, 0.005, 0.95, 0.6, 0.0, 0.04, 4.0, 4.0, 9.0, 6.93),
    Crustaceans_shrimp_raw_not_previously_frozen("Crustaceans, shrimp, raw (not previously frozen)", 100.0, 20.1, 0.0, 0.0, 20.1, 0.51, 0.0, 85.0, 0.0, 78.45, 0.0, 64.0, 0.52, 35.0, 214.0, 264.0, 119.0, 1.34, 0.39, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 161.0, 0.1, 0.03, 0.03, 0.08, 0.15, 0.03, 0.002, 4.0, 4.0, 9.0, 6.93),;

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

    Finfish_and_shellfish_products(
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
        return "Finfish and Shellfish Products";
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
