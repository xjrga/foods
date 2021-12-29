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
public enum Nut_and_seed_products implements Interface_food {

    Seeds_sunflower_seed_kernels_dry_roasted_without_salt("Seeds, sunflower seed kernels, dry roasted, without salt", 100.0, 0.0, 0.0, 0.0, 19.33, 49.8, 24.07, 582.0, 0.0, 1.2, 11.1, 70.0, 3.8, 129.0, 1155.0, 850.0, 3.0, 5.29, 1.83, 0.0, 2.11, 79.3, 0.0, 26.1, 0.0, 1.4, 0.1, 0.24, 7.04, 7.04, 0.8, 0.0, 55.1, 2.7, 237.0, 0.0, 5.21, 0.0, 0.0, 9.5, 32.88, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Seeds_sunflower_seed_kernels_toasted_without_salt("Seeds, sunflower seed kernels, toasted, without salt", 100.0, 0.0, 0.0, 0.0, 17.21, 56.8, 20.59, 619.0, 0.0, 1.0, 11.5, 57.0, 6.81, 129.0, 1158.0, 491.0, 3.0, 5.3, 1.83, 0.0, 2.11, 0.0, 0.0, 0.0, 0.0, 1.4, 0.32, 0.28, 4.19, 7.05, 0.8, 0.0, 0.0, 0.0, 238.0, 0.0, 5.95, 0.0, 0.0, 10.84, 37.5, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_almonds("Nuts, almonds", 100.0, 0.0, 0.0, 0.0, 21.15, 49.93, 21.55, 579.0, 0.0, 4.41, 12.5, 269.0, 3.71, 270.0, 481.0, 733.0, 1.0, 3.12, 1.03, 0.0, 2.17, 4.1, 0.0, 25.63, 0.0, 0.0, 0.2, 1.13, 3.61, 0.47, 0.13, 0.0, 52.1, 0.0, 44.0, 0.0, 3.8, 0.0, 0.0, 31.55, 12.32, 12.32, 0.003, 4.0, 4.0, 9.0, 6.93),
    Nuts_almonds_dry_roasted_without_salt_added("Nuts, almonds, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 20.96, 52.54, 21.01, 598.0, 0.0, 2.41, 10.9, 268.0, 3.73, 279.0, 471.0, 713.0, 3.0, 3.31, 1.09, 0.0, 2.23, 2.0, 0.0, 23.9, 0.0, 0.0, 0.07, 1.19, 3.63, 0.32, 0.13, 0.0, 52.1, 0.0, 55.0, 0.0, 4.09, 0.0, 0.0, 33.07, 12.95, 12.94, 0.006, 4.0, 4.0, 9.0, 6.93),
    Nuts_cashew_nuts_dry_roasted_without_salt_added("Nuts, cashew nuts, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 15.31, 46.35, 32.69, 574.0, 0.0, 1.7, 3.0, 45.0, 6.0, 260.0, 490.0, 565.0, 16.0, 5.6, 2.22, 0.0, 0.82, 11.7, 0.0, 0.92, 0.0, 0.0, 0.2, 0.2, 1.4, 1.21, 0.25, 0.0, 61.0, 34.7, 69.0, 0.0, 9.15, 0.0, 0.0, 27.31, 7.83, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_cashew_nuts_raw("Nuts, cashew nuts, raw", 100.0, 0.0, 0.0, 0.0, 18.22, 43.85, 30.19, 553.0, 0.0, 5.2, 3.3, 37.0, 6.68, 292.0, 593.0, 660.0, 12.0, 5.78, 2.19, 0.0, 1.65, 19.9, 0.0, 0.9, 0.0, 0.5, 0.42, 0.05, 1.06, 0.86, 0.41, 0.0, 0.0, 34.1, 25.0, 0.0, 7.78, 0.0, 0.0, 23.79, 7.84, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_cashew_butter_plain_without_salt_added("Nuts, cashew butter, plain, without salt added", 100.0, 0.0, 0.0, 0.0, 17.56, 49.41, 27.57, 587.0, 0.0, 2.96, 2.0, 43.0, 5.03, 258.0, 457.0, 546.0, 15.0, 5.16, 2.19, 0.0, 0.81, 11.5, 0.0, 0.0, 0.0, 0.0, 0.31, 0.18, 1.59, 1.2, 0.25, 0.0, 0.0, 0.0, 68.0, 0.0, 9.76, 0.0, 0.0, 29.12, 8.35, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added("Nuts, hazelnuts or filberts, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 15.03, 62.4, 17.6, 646.0, 0.0, 2.52, 9.4, 123.0, 4.38, 173.0, 310.0, 755.0, 0.0, 2.5, 1.75, 0.0, 5.55, 4.1, 3.0, 15.28, 0.0, 3.8, 0.33, 0.12, 2.05, 0.92, 0.62, 0.0, 0.0, 0.0, 88.0, 0.0, 4.51, 0.0, 0.0, 46.6, 8.46, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_macadamia_nuts_raw("Nuts, macadamia nuts, raw", 100.0, 0.0, 0.0, 0.0, 7.91, 75.77, 13.82, 718.0, 0.0, 1.36, 8.6, 85.0, 3.69, 130.0, 188.0, 368.0, 5.0, 1.3, 0.75, 0.0, 4.13, 3.6, 0.0, 0.54, 0.0, 1.2, 1.19, 0.16, 2.47, 0.75, 0.27, 0.0, 0.0, 0.0, 11.0, 0.0, 12.06, 0.0, 0.0, 58.87, 1.5, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_macadamia_nuts_dry_roasted_without_salt_added("Nuts, macadamia nuts, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 7.79, 76.08, 13.38, 718.0, 0.0, 1.61, 8.0, 70.0, 2.65, 118.0, 198.0, 363.0, 4.0, 1.29, 0.57, 0.0, 3.03, 11.7, 0.0, 0.57, 0.0, 0.7, 0.71, 0.08, 2.27, 0.6, 0.35, 0.0, 44.6, 0.0, 10.0, 0.0, 11.94, 0.0, 0.0, 59.27, 1.49, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added("Nuts, mixed nuts, dry roasted, with peanuts, without salt added", 100.0, 0.0, 0.0, 0.0, 19.5, 53.5, 22.42, 607.0, 0.0, 2.13, 6.4, 87.0, 3.73, 227.0, 438.0, 643.0, 4.0, 4.06, 1.52, 0.0, 2.61, 9.3, 0.0, 6.13, 0.0, 0.8, 0.3, 0.4, 6.22, 0.0, 0.36, 0.0, 59.2, 12.0, 60.0, 0.0, 8.01, 0.0, 0.009, 34.53, 9.85, 9.74, 0.08, 4.0, 4.0, 9.0, 6.93),
    Nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend("Nuts, mixed nuts, dry roasted, with peanuts, salt added, PLANTERS pistachio blend", 100.0, 0.0, 0.0, 0.0, 21.95, 49.3, 22.51, 580.0, 0.0, 2.91, 8.1, 129.0, 3.43, 209.0, 493.0, 758.0, 232.0, 3.42, 1.0, 0.0, 1.77, 11.0, 4.0, 5.65, 0.0, 0.0, 0.35, 0.57, 4.51, 0.0, 0.49, 0.0, 0.0, 0.0, 0.0, 0.0, 6.71, 0.0, 0.01, 27.61, 11.65, 11.53, 0.08, 4.0, 4.0, 9.0, 6.93),
    Nuts_pecans("Nuts, pecans", 100.0, 0.0, 0.0, 0.0, 9.17, 71.97, 13.86, 691.0, 0.0, 3.52, 9.6, 70.0, 2.53, 121.0, 277.0, 410.0, 0.0, 4.53, 1.2, 10.0, 4.5, 3.8, 3.0, 1.4, 0.0, 1.1, 0.66, 0.13, 1.16, 0.86, 0.21, 0.0, 40.5, 3.5, 22.0, 0.0, 6.18, 0.0, 0.0, 40.8, 21.61, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_pecans_dry_roasted_without_salt_added("Nuts, pecans, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 9.5, 74.27, 13.55, 710.0, 0.0, 1.12, 9.4, 72.0, 2.8, 132.0, 293.0, 424.0, 1.0, 5.07, 1.16, 0.0, 3.93, 4.0, 7.0, 1.3, 0.0, 0.7, 0.45, 0.1, 1.16, 0.7, 0.18, 0.0, 0.0, 0.0, 16.0, 0.0, 6.28, 0.0, 0.0, 43.95, 20.57, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_pistachio_nuts_raw("Nuts, pistachio nuts, raw", 100.0, 0.0, 0.0, 0.0, 20.16, 45.32, 27.17, 560.0, 0.0, 4.37, 10.6, 105.0, 3.92, 121.0, 490.0, 1025.0, 1.0, 2.2, 1.3, 3.4, 1.2, 7.0, 26.0, 2.86, 0.0, 5.6, 0.87, 0.16, 1.3, 0.52, 1.7, 0.0, 0.0, 0.0, 51.0, 0.0, 5.9, 0.0, 0.0, 23.25, 14.38, 14.09, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_pistachio_nuts_dry_roasted_without_salt_added("Nuts, pistachio nuts, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 21.05, 45.82, 28.28, 572.0, 0.0, 1.85, 10.3, 107.0, 4.03, 109.0, 469.0, 1007.0, 6.0, 2.34, 1.29, 0.0, 1.24, 10.0, 13.0, 2.17, 0.0, 3.0, 0.69, 0.23, 1.37, 0.51, 1.12, 0.0, 71.4, 13.2, 51.0, 0.0, 5.64, 0.0, 0.0, 24.53, 13.34, 13.12, 0.21, 4.0, 4.0, 9.0, 6.93),
    Nuts_walnuts_english("Nuts, walnuts, english", 100.0, 0.0, 0.0, 0.0, 15.23, 65.21, 13.71, 654.0, 0.0, 4.07, 6.7, 98.0, 2.91, 158.0, 346.0, 441.0, 2.0, 3.09, 1.58, 0.0, 3.41, 4.9, 1.0, 0.7, 0.0, 1.3, 0.34, 0.15, 1.12, 0.57, 0.53, 0.0, 39.2, 2.7, 98.0, 0.0, 6.12, 0.0, 0.0, 8.93, 47.17, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_walnuts_dry_roasted_with_salt_added("Nuts, walnuts, dry roasted, with salt added", 100.0, 0.0, 0.0, 0.0, 14.29, 60.71, 17.86, 643.0, 0.0, 4.39, 7.1, 71.0, 2.57, 151.0, 329.0, 459.0, 643.0, 2.98, 1.48, 0.0, 0.0, 5.0, 1.0, 0.9, 0.0, 1.4, 0.52, 0.29, 2.21, 0.0, 0.52, 0.0, 38.0, 3.3, 91.0, 0.0, 5.35, 0.0, 0.0, 8.37, 44.18, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nuts_almonds_honey_roasted_unblanched("Nuts, almonds, honey roasted, unblanched", 100.0, 0.0, 0.0, 0.0, 18.17, 49.9, 27.9, 594.0, 0.0, 1.7, 13.7, 263.0, 2.83, 240.0, 400.0, 560.0, 130.0, 2.6, 0.97, 0.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.7, 0.11, 0.95, 2.81, 0.25, 0.08, 0.0, 0.0, 0.0, 32.0, 0.0, 4.73, 0.0, 0.0, 32.4, 10.47, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Seeds_flaxseed("Seeds, flaxseed", 100.0, 0.0, 0.0, 0.0, 18.29, 42.16, 28.88, 534.0, 0.0, 6.96, 27.3, 255.0, 5.73, 392.0, 642.0, 813.0, 30.0, 4.34, 1.22, 0.0, 2.48, 25.4, 0.0, 0.31, 0.0, 0.6, 1.64, 0.16, 3.08, 0.98, 0.47, 0.0, 78.7, 4.3, 87.0, 0.0, 3.66, 0.0, 0.0, 7.52, 28.73, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Seeds_flaxseed_efas("Seeds, flaxseed (EFAs)", 100.0, 0.0, 0.0, 0.0, 18.29, 42.16, 28.88, 534.0, 0.0, 6.96, 27.3, 255.0, 5.73, 392.0, 642.0, 813.0, 30.0, 4.34, 1.22, 0.0, 2.48, 25.4, 0.0, 0.31, 0.0, 0.6, 1.64, 0.16, 3.08, 0.98, 0.47, 0.0, 78.7, 4.3, 87.0, 0.0, 3.66, 0.0, 0.0, 7.52, 28.73, 6.02888, 24.4528, 4.0, 4.0, 9.0, 6.93),;

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

    Nut_and_seed_products(
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
        return "Nut and Seed Products";
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
