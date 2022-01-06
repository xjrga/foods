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
public enum Legumes_and_legume_products implements Interface_food {

    Beans_black_mature_seeds_raw("Beans, black, mature seeds, raw", 100.0, 0.0, 0.0, 0.0, 21.6, 1.42, 62.36, 341.0, 0.0, 11.02, 15.5, 123.0, 5.02, 171.0, 352.0, 1483.0, 5.0, 3.65, 0.84, 0.0, 1.06, 3.2, 0.0, 0.21, 0.0, 0.0, 0.9, 0.19, 1.95, 0.89, 0.28, 0.0, 66.4, 5.6, 444.0, 0.0, 0.36, 0.0, 0.0, 0.12, 0.61, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_black_mature_seeds_cooked_boiled_without_salt("Beans, black, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 0.0, 8.86, 0.54, 23.71, 132.0, 0.0, 65.74, 8.7, 27.0, 2.1, 70.0, 140.0, 355.0, 1.0, 1.12, 0.2, 0.0, 0.44, 1.2, 0.0, 0.87, 0.0, 0.0, 0.24, 0.05, 0.5, 0.24, 0.06, 0.0, 32.6, 3.3, 149.0, 0.0, 0.13, 0.0, 0.0, 0.04, 0.23, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_kidney_all_types_mature_seeds_raw("Beans, kidney, all types, mature seeds, raw", 100.0, 0.0, 0.0, 0.0, 23.58, 0.83, 60.01, 333.0, 0.0, 11.75, 24.9, 143.0, 8.2, 140.0, 407.0, 1406.0, 24.0, 2.79, 0.95, 0.0, 1.02, 3.2, 0.0, 0.22, 0.0, 4.5, 0.52, 0.21, 2.06, 0.78, 0.39, 0.0, 0.0, 19.0, 394.0, 0.0, 0.12, 0.0, 0.0, 0.06, 0.45, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt("Beans, kidney, all types, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 0.0, 8.67, 0.5, 22.8, 127.0, 0.0, 66.94, 6.4, 35.0, 2.22, 42.0, 138.0, 405.0, 1.0, 1.0, 0.21, 0.0, 0.43, 1.1, 0.0, 0.03, 0.0, 1.2, 0.16, 0.05, 0.57, 0.22, 0.12, 0.0, 30.5, 8.4, 130.0, 0.0, 0.07, 0.0, 0.0, 0.03, 0.27, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_kidney_california_red_mature_seeds_raw("Beans, kidney, california red, mature seeds, raw", 100.0, 0.0, 0.0, 0.0, 24.37, 0.25, 59.8, 330.0, 0.0, 11.75, 24.9, 195.0, 9.35, 160.0, 405.0, 1490.0, 11.0, 2.55, 1.1, 0.0, 1.0, 3.2, 0.0, 0.0, 0.0, 4.5, 0.52, 0.21, 2.06, 0.78, 0.39, 0.0, 0.0, 0.0, 394.0, 0.0, 0.03, 0.0, 0.0, 0.01, 0.13, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt("Beans, kidney, california red, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 0.0, 9.13, 0.09, 22.41, 124.0, 0.0, 66.93, 9.3, 66.0, 2.98, 48.0, 137.0, 419.0, 4.0, 0.86, 0.28, 0.0, 0.31, 1.2, 0.0, 0.0, 0.0, 1.2, 0.12, 0.06, 0.54, 0.21, 0.1, 0.0, 0.0, 0.0, 74.0, 0.0, 0.01, 0.0, 0.0, 0.007, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_kidney_red_mature_seeds_raw("Beans, kidney, red, mature seeds, raw", 100.0, 0.0, 0.0, 0.0, 22.53, 1.06, 61.29, 337.0, 0.0, 11.75, 15.2, 83.0, 6.69, 138.0, 406.0, 1359.0, 12.0, 2.79, 0.69, 2.2, 1.11, 3.2, 0.0, 0.21, 0.0, 4.5, 0.6, 0.21, 2.11, 0.78, 0.39, 0.0, 65.9, 5.6, 394.0, 0.0, 0.15, 0.0, 0.0, 0.08, 0.58, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_kidney_red_mature_seeds_cooked_boiled_without_salt("Beans, kidney, red, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 28.0, 8.67, 0.5, 22.8, 127.0, 0.0, 66.94, 7.4, 28.0, 2.94, 45.0, 142.0, 403.0, 2.0, 1.07, 0.24, 0.0, 0.47, 1.2, 0.0, 0.03, 0.0, 1.2, 0.16, 0.05, 0.57, 0.22, 0.12, 0.0, 30.5, 8.4, 130.0, 0.0, 0.07, 0.0, 0.0, 0.03, 0.27, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_pinto_mature_seeds_raw("Beans, pinto, mature seeds, raw", 100.0, 0.0, 0.0, 0.0, 21.42, 1.23, 62.55, 347.0, 0.0, 11.33, 15.5, 113.0, 5.07, 176.0, 411.0, 1393.0, 12.0, 2.28, 0.89, 0.0, 1.14, 27.9, 0.0, 0.21, 0.0, 6.3, 0.71, 0.21, 1.17, 0.78, 0.47, 0.0, 66.2, 5.6, 525.0, 0.0, 0.23, 0.0, 0.0, 0.22, 0.4, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_pinto_mature_seeds_cooked_boiled_without_salt("Beans, pinto, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 45.0, 9.01, 0.65, 26.22, 143.0, 0.0, 62.95, 9.0, 46.0, 2.09, 50.0, 147.0, 436.0, 1.0, 0.98, 0.21, 2.2, 0.45, 6.2, 0.0, 0.94, 0.0, 0.8, 0.19, 0.06, 0.31, 0.21, 0.22, 0.0, 35.3, 3.5, 172.0, 0.0, 0.13, 0.0, 0.0, 0.13, 0.23, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw("Chickpeas (garbanzo beans, bengal gram), mature seeds, raw", 100.0, 0.0, 0.0, 0.0, 20.47, 6.04, 62.95, 378.0, 0.0, 7.68, 12.2, 57.0, 4.31, 79.0, 252.0, 718.0, 24.0, 2.76, 0.65, 0.0, 21.3, 0.0, 3.0, 0.82, 0.0, 4.0, 0.47, 0.21, 1.54, 1.58, 0.53, 0.0, 99.3, 9.0, 557.0, 0.0, 0.6, 0.0, 0.0, 1.37, 2.73, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt("Chickpeas (garbanzo beans, bengal gram), mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 0.0, 8.86, 2.59, 27.42, 164.0, 0.0, 60.21, 7.6, 49.0, 2.89, 48.0, 168.0, 291.0, 7.0, 1.53, 0.35, 0.0, 1.03, 3.7, 1.0, 0.35, 0.0, 1.3, 0.11, 0.06, 0.52, 0.28, 0.13, 0.0, 42.8, 4.0, 172.0, 0.0, 0.26, 0.0, 0.0, 0.58, 1.15, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Lentils_raw("Lentils, raw", 100.0, 0.0, 0.0, 0.0, 24.63, 1.06, 63.35, 352.0, 0.0, 8.26, 10.7, 35.0, 6.51, 47.0, 281.0, 677.0, 6.0, 3.27, 0.75, 0.0, 1.39, 0.1, 2.0, 0.49, 0.0, 4.5, 0.87, 0.21, 2.6, 2.14, 0.54, 0.0, 96.4, 5.0, 479.0, 0.0, 0.15, 0.0, 0.0, 0.19, 0.52, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Lentils_mature_seeds_cooked_boiled_without_salt("Lentils, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 29.0, 9.02, 0.38, 20.13, 116.0, 0.0, 69.64, 7.9, 19.0, 3.33, 36.0, 180.0, 369.0, 2.0, 1.27, 0.25, 0.0, 0.49, 2.8, 0.0, 0.11, 0.0, 1.5, 0.16, 0.07, 1.06, 0.63, 0.17, 0.0, 32.7, 1.7, 181.0, 0.0, 0.05, 0.0, 0.0, 0.06, 0.17, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Peas_green_split_mature_seeds_raw("Peas, green, split, mature seeds, raw", 100.0, 0.0, 0.0, 0.0, 23.82, 1.16, 63.74, 352.0, 0.0, 8.62, 25.5, 37.0, 4.82, 49.0, 321.0, 823.0, 15.0, 3.55, 0.81, 0.0, 1.22, 4.1, 7.0, 0.09, 0.0, 1.8, 0.72, 0.21, 2.88, 1.75, 0.17, 0.0, 95.5, 14.5, 274.0, 0.0, 0.16, 0.0, 0.0, 0.24, 0.49, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Peas_split_mature_seeds_cooked_boiled_without_salt("Peas, split, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 0.0, 8.34, 0.39, 21.1, 118.0, 0.0, 69.49, 8.3, 14.0, 1.29, 36.0, 99.0, 362.0, 2.0, 1.0, 0.18, 0.0, 0.39, 0.6, 0.0, 0.03, 0.0, 0.4, 0.19, 0.05, 0.89, 0.59, 0.04, 0.0, 32.8, 5.0, 65.0, 0.0, 0.05, 0.0, 0.0, 0.08, 0.16, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Peanut_butter_chunk_style_with_salt("Peanut butter, chunk style, with salt", 100.0, 0.0, 0.0, 0.0, 24.06, 49.94, 21.57, 589.0, 0.0, 1.14, 8.0, 45.0, 1.9, 160.0, 319.0, 745.0, 486.0, 2.79, 0.57, 3.1, 1.8, 8.2, 0.0, 6.3, 0.0, 0.0, 0.1, 0.11, 13.69, 1.11, 0.41, 0.0, 61.3, 0.5, 92.0, 0.0, 7.6, 0.0, 0.0, 23.12, 13.93, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Soybeans_mature_seeds_raw("Soybeans, mature seeds, raw", 100.0, 0.0, 0.0, 0.0, 36.49, 19.94, 30.16, 446.0, 0.0, 8.54, 9.3, 277.0, 15.7, 280.0, 704.0, 1797.0, 2.0, 4.89, 1.65, 0.0, 2.51, 17.8, 1.0, 0.85, 0.0, 6.0, 0.87, 0.87, 1.62, 0.79, 0.37, 0.0, 115.9, 47.0, 375.0, 0.0, 2.88, 0.0, 0.0, 4.4, 11.25, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Soybeans_mature_cooked_boiled_without_salt("Soybeans, mature cooked, boiled, without salt", 100.0, 0.0, 0.0, 14.0, 18.21, 8.97, 8.36, 172.0, 0.0, 62.55, 6.0, 102.0, 5.14, 86.0, 245.0, 515.0, 1.0, 1.15, 0.4, 0.0, 0.82, 7.3, 0.0, 0.35, 0.0, 1.7, 0.15, 0.28, 0.39, 0.17, 0.23, 0.0, 47.5, 19.2, 54.0, 0.0, 1.29, 0.0, 0.0, 1.98, 5.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Soy_meal_defatted_raw("Soy meal, defatted, raw", 100.0, 0.0, 0.0, 0.0, 49.2, 2.39, 35.89, 337.0, 0.0, 6.94, 0.0, 244.0, 13.7, 306.0, 701.0, 2490.0, 3.0, 5.06, 2.0, 0.0, 3.8, 3.3, 2.0, 0.0, 0.0, 0.0, 0.69, 0.25, 2.58, 1.97, 0.56, 0.0, 0.0, 0.0, 303.0, 0.0, 0.26, 0.0, 0.0, 0.4, 1.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Soy_protein_isolate("Soy protein isolate", 100.0, 0.0, 0.0, 0.0, 88.32, 3.39, 0.0, 335.0, 0.0, 4.98, 0.0, 178.0, 14.5, 39.0, 776.0, 81.0, 1005.0, 4.03, 1.59, 0.0, 1.49, 0.8, 0.0, 0.0, 0.0, 0.0, 0.17, 0.1, 1.43, 0.06, 0.1, 0.0, 190.9, 0.0, 176.0, 0.0, 0.42, 0.0, 0.0, 0.64, 1.64, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Hummus_home_prepared("Hummus, home prepared", 100.0, 0.0, 0.0, 6.0, 4.86, 8.59, 20.12, 177.0, 0.0, 64.87, 4.0, 49.0, 1.56, 29.0, 110.0, 173.0, 242.0, 1.09, 0.22, 0.0, 0.56, 2.4, 0.0, 0.75, 0.0, 7.9, 0.08, 0.05, 0.39, 0.28, 0.39, 0.0, 27.8, 3.0, 59.0, 0.0, 1.14, 0.0, 0.0, 4.86, 2.1, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids("Chickpeas (garbanzo beans, bengal gram), mature seeds, canned, drained solids", 100.0, 0.0, 0.0, 40.0, 7.05, 2.77, 22.53, 139.0, 0.0, 66.72, 6.4, 45.0, 1.07, 26.0, 85.0, 126.0, 246.0, 0.63, 0.25, 0.0, 0.84, 3.1, 1.0, 0.29, 0.0, 0.1, 0.02, 0.01, 0.14, 0.0, 0.11, 0.0, 0.0, 3.4, 48.0, 0.0, 0.21, 0.0, 0.0, 0.48, 0.96, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Lentils_mature_seeds_cooked_boiled_with_salt("Lentils, mature seeds, cooked, boiled, with salt", 100.0, 0.0, 0.0, 0.0, 9.02, 0.38, 19.54, 114.0, 0.0, 69.64, 7.9, 19.0, 3.33, 36.0, 180.0, 369.0, 238.0, 1.27, 0.25, 0.0, 0.49, 2.8, 0.0, 0.11, 0.0, 1.5, 0.16, 0.07, 1.06, 0.63, 0.17, 0.0, 32.7, 1.7, 181.0, 0.0, 0.05, 0.0, 0.0, 0.06, 0.17, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Peanuts_all_types_dry_roasted_without_salt("Peanuts, all types, dry-roasted, without salt", 100.0, 0.0, 0.0, 0.0, 24.35, 49.66, 21.26, 587.0, 0.0, 1.81, 8.4, 58.0, 1.58, 178.0, 363.0, 634.0, 6.0, 2.77, 0.42, 0.0, 1.78, 9.3, 0.0, 4.93, 0.0, 0.0, 0.15, 0.19, 14.35, 1.01, 0.46, 0.0, 64.6, 0.0, 97.0, 0.0, 7.72, 0.0, 0.0, 26.18, 9.77, 9.69, 0.02, 4.0, 4.0, 9.0, 6.93),
    Peanut_butter_chunk_style_without_salt("Peanut butter, chunk style, without salt", 100.0, 0.0, 0.0, 0.0, 24.06, 49.94, 21.57, 589.0, 0.0, 1.14, 8.0, 45.0, 1.9, 160.0, 319.0, 745.0, 17.0, 2.79, 0.57, 3.1, 1.8, 8.2, 0.0, 6.3, 0.0, 0.0, 0.1, 0.11, 13.69, 1.11, 0.41, 0.0, 61.3, 0.5, 92.0, 0.0, 7.6, 0.0, 0.0, 23.12, 13.93, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),;

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

    Legumes_and_legume_products(
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
        return "Legumes and Legume Products";
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
