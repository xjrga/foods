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
public enum Glycemic_index_test_set implements Interface_food {

    Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim("Milk, nonfat, fluid, with added vitamin A and vitamin D (fat free or skim)", 100.0, 3.37, 0.0, 32.0, 3.37, 0.08, 4.96, 34.0, 0.0, 90.84, 0.0, 122.0, 0.03, 11.0, 101.0, 156.0, 42.0, 0.42, 0.01, 3.1, 0.003, 3.1, 61.0, 0.01, 1.2, 0.0, 0.04, 0.18, 0.09, 0.35, 0.03, 0.5, 15.6, 0.0, 5.0, 2.0, 0.05, 0.0, 0.0, 0.02, 0.003, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_canned_condensed_sweetened("Milk, canned, condensed, sweetened", 100.0, 7.91, 0.0, 61.0, 7.91, 8.7, 54.4, 321.0, 0.0, 27.16, 0.0, 284.0, 0.19, 26.0, 253.0, 371.0, 127.0, 0.94, 0.01, 0.0, 0.006, 14.8, 74.0, 0.16, 0.2, 2.6, 0.09, 0.41, 0.21, 0.75, 0.05, 0.44, 89.1, 0.6, 11.0, 34.0, 5.48, 0.0, 0.0, 2.42, 0.33, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Yogurt_greek_plain_nonfat("Yogurt, Greek, plain, nonfat", 100.0, 10.19, 0.0, 14.0, 10.19, 0.39, 3.6, 59.0, 0.0, 85.1, 0.0, 110.0, 0.07, 11.0, 135.0, 141.0, 36.0, 0.52, 0.01, 0.0, 0.009, 9.7, 1.0, 0.01, 0.0, 0.0, 0.02, 0.27, 0.2, 0.33, 0.06, 0.75, 15.1, 0.0, 7.0, 5.0, 0.11, 0.0, 0.0, 0.05, 0.01, 0.01, 0.001, 4.0, 4.0, 9.0, 6.93),
    Cereals_ready_to_eat_kellogg_kellogg_s_all_bran_original("Cereals ready-to-eat, KELLOGG, KELLOGG'S ALL-BRAN Original", 100.0, 0.0, 0.0, 34.0, 13.14, 4.9, 74.24, 259.0, 0.0, 2.12, 29.3, 389.0, 17.6, 362.0, 1150.0, 1020.0, 258.0, 12.4, 1.04, 0.0, 7.41, 9.4, 522.0, 1.19, 4.3, 20.0, 2.27, 2.71, 14.8, 1.06, 12.0, 18.8, 49.4, 5.2, 2198.0, 0.0, 1.1, 0.0, 0.0, 0.89, 2.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Cereals_oats_regular_and_quick_not_fortified_dry("Cereals, oats, regular and quick, not fortified, dry", 100.0, 0.0, 0.0, 65.0, 13.15, 6.52, 67.7, 379.0, 0.0, 10.84, 10.1, 52.0, 4.25, 138.0, 410.0, 362.0, 6.0, 3.64, 0.39, 0.0, 3.63, 28.9, 0.0, 0.42, 0.0, 0.0, 0.46, 0.15, 1.12, 1.12, 0.1, 0.0, 40.4, 2.0, 32.0, 0.0, 1.11, 0.0, 0.0, 1.98, 2.3, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Apples_raw_with_skin("Apples, raw, with skin", 100.0, 0.0, 0.0, 38.0, 0.26, 0.17, 13.81, 52.0, 0.0, 85.56, 2.4, 6.0, 0.12, 5.0, 11.0, 107.0, 1.0, 0.04, 0.02, 3.3, 0.03, 0.0, 3.0, 0.18, 0.0, 4.6, 0.01, 0.02, 0.09, 0.06, 0.04, 0.0, 3.4, 2.2, 3.0, 0.0, 0.02, 0.0, 0.0, 0.007, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Apricots_raw("Apricots, raw", 100.0, 0.0, 0.0, 57.0, 1.4, 0.39, 11.12, 48.0, 0.0, 86.35, 2.0, 13.0, 0.39, 10.0, 23.0, 259.0, 1.0, 0.2, 0.07, 0.0, 0.07, 0.1, 96.0, 0.89, 0.0, 10.0, 0.03, 0.04, 0.6, 0.24, 0.05, 0.0, 2.8, 3.3, 9.0, 0.0, 0.02, 0.0, 0.0, 0.17, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bananas_raw("Bananas, raw", 100.0, 0.0, 0.0, 52.0, 1.09, 0.33, 22.84, 89.0, 0.0, 74.91, 2.6, 5.0, 0.26, 27.0, 22.0, 358.0, 1.0, 0.15, 0.07, 2.2, 0.27, 1.0, 3.0, 0.1, 0.0, 8.7, 0.03, 0.07, 0.66, 0.33, 0.36, 0.0, 9.8, 0.5, 20.0, 0.0, 0.11, 0.0, 0.0, 0.03, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Grapefruit_raw_pink_and_red_and_white_all_areas("Grapefruit, raw, pink and red and white, all areas", 100.0, 0.0, 0.0, 25.0, 0.63, 0.1, 8.08, 32.0, 0.0, 90.89, 1.1, 12.0, 0.09, 8.0, 8.0, 139.0, 0.0, 0.07, 0.04, 1.0, 0.01, 0.3, 46.0, 0.13, 0.0, 34.4, 0.03, 0.02, 0.25, 0.28, 0.04, 0.0, 7.7, 0.0, 10.0, 0.0, 0.01, 0.0, 0.0, 0.01, 0.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Grapes_red_or_green_european_type_such_as_thompson_seedless_raw("Grapes, red or green (European type, such as Thompson seedless), raw", 100.0, 0.0, 0.0, 46.0, 0.72, 0.16, 18.1, 69.0, 0.0, 80.54, 0.9, 10.0, 0.36, 7.0, 20.0, 191.0, 2.0, 0.07, 0.12, 7.8, 0.07, 0.1, 3.0, 0.19, 0.0, 3.2, 0.06, 0.07, 0.18, 0.05, 0.08, 0.0, 5.6, 14.6, 2.0, 0.0, 0.05, 0.0, 0.0, 0.007, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Mangos_raw("Mangos, raw", 100.0, 0.0, 0.0, 51.0, 0.82, 0.38, 14.98, 60.0, 0.0, 83.46, 1.6, 11.0, 0.16, 10.0, 14.0, 168.0, 1.0, 0.09, 0.11, 0.0, 0.06, 0.6, 54.0, 0.9, 0.0, 36.4, 0.02, 0.03, 0.66, 0.19, 0.11, 0.0, 7.6, 4.2, 43.0, 0.0, 0.09, 0.0, 0.0, 0.14, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Melons_cantaloupe_raw("Melons, cantaloupe, raw", 100.0, 0.0, 0.0, 67.0, 0.84, 0.19, 8.16, 34.0, 0.0, 90.15, 0.9, 9.0, 0.21, 12.0, 15.0, 267.0, 16.0, 0.18, 0.04, 1.0, 0.04, 0.4, 169.0, 0.05, 0.0, 36.7, 0.04, 0.01, 0.73, 0.1, 0.07, 0.0, 7.6, 2.5, 21.0, 0.0, 0.05, 0.0, 0.0, 0.003, 0.08, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Oranges_raw_all_commercial_varieties("Oranges, raw, all commercial varieties", 100.0, 0.0, 0.0, 42.0, 0.94, 0.12, 11.75, 47.0, 0.0, 86.75, 2.4, 40.0, 0.1, 10.0, 14.0, 181.0, 0.0, 0.07, 0.04, 0.0, 0.02, 0.5, 11.0, 0.18, 0.0, 53.2, 0.08, 0.04, 0.28, 0.25, 0.06, 0.0, 8.4, 0.0, 30.0, 0.0, 0.01, 0.0, 0.0, 0.02, 0.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Orange_juice_raw("Orange juice, raw", 100.0, 0.0, 0.0, 53.0, 0.7, 0.2, 10.4, 45.0, 0.0, 88.3, 0.2, 11.0, 0.2, 11.0, 17.0, 200.0, 1.0, 0.05, 0.04, 0.0, 0.01, 0.1, 10.0, 0.04, 0.0, 50.0, 0.09, 0.03, 0.4, 0.19, 0.04, 0.0, 6.2, 0.1, 30.0, 0.0, 0.02, 0.0, 0.0, 0.03, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Papayas_raw("Papayas, raw", 100.0, 0.0, 0.0, 56.0, 0.47, 0.26, 10.82, 43.0, 0.0, 88.06, 1.7, 20.0, 0.25, 21.0, 10.0, 182.0, 8.0, 0.08, 0.04, 0.0, 0.04, 0.6, 47.0, 0.3, 0.0, 60.9, 0.02, 0.02, 0.35, 0.19, 0.03, 0.0, 6.1, 2.6, 37.0, 0.0, 0.08, 0.0, 0.0, 0.07, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Peaches_yellow_raw("Peaches, yellow, raw", 100.0, 0.0, 0.0, 38.0, 0.91, 0.25, 9.54, 39.0, 0.0, 88.87, 1.5, 6.0, 0.25, 9.0, 20.0, 190.0, 0.0, 0.17, 0.06, 4.0, 0.06, 0.1, 16.0, 0.73, 0.0, 6.6, 0.02, 0.03, 0.8, 0.15, 0.02, 0.0, 6.1, 2.6, 4.0, 0.0, 0.01, 0.0, 0.0, 0.06, 0.08, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pears_raw("Pears, raw", 100.0, 0.0, 0.0, 38.0, 0.36, 0.14, 15.23, 57.0, 0.0, 83.96, 3.1, 9.0, 0.18, 7.0, 12.0, 116.0, 1.0, 0.1, 0.08, 2.2, 0.04, 0.1, 1.0, 0.12, 0.0, 4.3, 0.01, 0.02, 0.16, 0.04, 0.02, 0.0, 5.1, 4.4, 7.0, 0.0, 0.02, 0.0, 0.0, 0.08, 0.09, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pineapple_raw_all_varieties("Pineapple, raw, all varieties", 100.0, 0.0, 0.0, 59.0, 0.54, 0.12, 13.12, 50.0, 0.0, 86.0, 1.4, 13.0, 0.29, 12.0, 8.0, 109.0, 1.0, 0.12, 0.11, 0.0, 0.92, 0.1, 3.0, 0.02, 0.0, 47.8, 0.07, 0.03, 0.5, 0.21, 0.11, 0.0, 5.5, 0.7, 18.0, 0.0, 0.009, 0.0, 0.0, 0.01, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Plums_raw("Plums, raw", 100.0, 0.0, 0.0, 39.0, 0.7, 0.28, 11.42, 46.0, 0.0, 87.23, 1.4, 6.0, 0.17, 7.0, 16.0, 157.0, 0.0, 0.1, 0.05, 2.0, 0.05, 0.0, 17.0, 0.26, 0.0, 9.5, 0.02, 0.02, 0.41, 0.13, 0.02, 0.0, 1.9, 6.4, 5.0, 0.0, 0.01, 0.0, 0.0, 0.13, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Prickly_pears_raw("Prickly pears, raw", 100.0, 0.0, 0.0, 7.0, 0.73, 0.51, 9.57, 41.0, 0.0, 87.55, 3.6, 56.0, 0.3, 85.0, 24.0, 220.0, 5.0, 0.12, 0.08, 0.0, 0.0, 0.6, 2.0, 0.0, 0.0, 14.0, 0.01, 0.06, 0.46, 0.0, 0.06, 0.0, 0.0, 0.0, 6.0, 0.0, 0.06, 0.0, 0.0, 0.07, 0.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Raisins_seedless("Raisins, seedless", 100.0, 0.0, 0.0, 64.0, 3.07, 0.46, 79.18, 299.0, 0.0, 15.43, 3.7, 50.0, 1.88, 32.0, 101.0, 749.0, 11.0, 0.22, 0.31, 233.9, 0.29, 0.6, 0.0, 0.12, 0.0, 2.3, 0.1, 0.12, 0.76, 0.09, 0.17, 0.0, 11.1, 3.5, 5.0, 0.0, 0.05, 0.0, 0.0, 0.05, 0.03, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Usda_commodity_peaches_canned_light_syrup_drained("USDA Commodity peaches, canned, light syrup, drained", 100.0, 0.0, 0.0, 57.0, 0.56, 0.15, 15.65, 61.0, 0.0, 83.43, 0.7, 3.0, 0.25, 5.0, 10.0, 87.0, 7.0, 0.16, 0.03, 0.0, 0.03, 0.0, 25.0, 1.23, 0.0, 2.5, 0.02, 0.02, 0.58, 0.04, 0.01, 0.0, 0.0, 2.8, 8.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beets_canned_drained_solids("Beets, canned, drained solids", 100.0, 0.0, 0.0, 64.0, 0.91, 0.14, 7.21, 31.0, 0.0, 90.96, 1.8, 15.0, 1.82, 17.0, 17.0, 148.0, 194.0, 0.21, 0.05, 26.3, 0.28, 0.5, 1.0, 0.03, 0.0, 4.1, 0.01, 0.04, 0.15, 0.15, 0.05, 0.0, 7.5, 0.2, 30.0, 0.0, 0.02, 0.0, 0.0, 0.02, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Carrots_raw("Carrots, raw", 100.0, 0.0, 0.0, 47.0, 0.93, 0.24, 9.58, 41.0, 0.0, 88.29, 2.8, 33.0, 0.3, 12.0, 35.0, 320.0, 69.0, 0.24, 0.04, 3.2, 0.14, 0.1, 835.0, 0.66, 0.0, 5.9, 0.06, 0.05, 0.98, 0.27, 0.13, 0.0, 8.8, 13.2, 19.0, 0.0, 0.03, 0.0, 0.0, 0.01, 0.11, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Carrots_cooked_boiled_drained_without_salt("Carrots, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 41.0, 0.76, 0.18, 8.22, 35.0, 0.0, 90.17, 3.0, 30.0, 0.34, 10.0, 30.0, 235.0, 58.0, 0.2, 0.01, 47.5, 0.15, 0.7, 852.0, 1.03, 0.0, 3.6, 0.06, 0.04, 0.64, 0.23, 0.15, 0.0, 8.8, 13.7, 14.0, 0.0, 0.03, 0.0, 0.0, 0.006, 0.08, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Corn_sweet_yellow_cooked_boiled_drained_without_salt("Corn, sweet, yellow, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 46.0, 3.41, 1.5, 20.98, 96.0, 0.0, 73.41, 2.4, 3.0, 0.45, 26.0, 77.0, 218.0, 1.0, 0.62, 0.04, 0.0, 0.16, 0.2, 13.0, 0.09, 0.0, 5.5, 0.09, 0.05, 1.68, 0.79, 0.13, 0.0, 29.1, 0.4, 23.0, 0.0, 0.19, 0.0, 0.0, 0.37, 0.6, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Peas_green_cooked_boiled_drained_without_salt("Peas, green, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 48.0, 5.36, 0.22, 15.63, 84.0, 0.0, 77.87, 5.5, 27.0, 1.54, 39.0, 117.0, 271.0, 3.0, 1.19, 0.17, 0.0, 0.52, 1.9, 40.0, 0.14, 0.0, 14.2, 0.25, 0.14, 2.02, 0.15, 0.21, 0.0, 29.7, 25.9, 63.0, 0.0, 0.03, 0.0, 0.0, 0.01, 0.1, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Potatoes_white_flesh_and_skin_baked("Potatoes, white, flesh and skin, baked", 100.0, 0.0, 0.0, 60.0, 2.1, 0.15, 21.08, 94.0, 0.0, 75.43, 2.1, 10.0, 0.64, 27.0, 75.0, 544.0, 7.0, 0.35, 0.12, 0.0, 0.18, 0.5, 1.0, 0.04, 0.0, 12.6, 0.04, 0.04, 1.52, 0.38, 0.21, 0.0, 14.4, 2.7, 38.0, 0.0, 0.02, 0.0, 0.0, 0.002, 0.03, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Soybeans_green_cooked_boiled_drained_without_salt("Soybeans, green, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 14.0, 12.35, 6.4, 11.05, 141.0, 0.0, 68.6, 4.2, 145.0, 2.5, 60.0, 158.0, 539.0, 14.0, 0.91, 0.11, 0.0, 0.5, 1.4, 8.0, 0.0, 0.0, 17.0, 0.26, 0.15, 1.25, 0.12, 0.06, 0.0, 0.0, 0.0, 111.0, 0.0, 0.74, 0.0, 0.0, 1.2, 3.01, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Sweet_potato_cooked_baked_in_skin_flesh_without_salt("Sweet potato, cooked, baked in skin, flesh, without salt", 100.0, 0.0, 0.0, 61.0, 2.01, 0.15, 20.71, 90.0, 0.0, 75.78, 3.3, 38.0, 0.69, 27.0, 54.0, 475.0, 36.0, 0.32, 0.16, 0.0, 0.49, 0.2, 961.0, 0.71, 0.0, 19.6, 0.1, 0.1, 1.48, 0.88, 0.28, 0.0, 13.1, 2.3, 6.0, 0.0, 0.05, 0.0, 0.0, 0.002, 0.09, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Yam_cooked_boiled_drained_or_baked_without_salt("Yam, cooked, boiled, drained, or baked, without salt", 100.0, 0.0, 0.0, 37.0, 1.49, 0.14, 27.48, 116.0, 0.0, 70.13, 3.9, 14.0, 0.52, 18.0, 49.0, 670.0, 8.0, 0.2, 0.15, 0.0, 0.37, 0.7, 6.0, 0.34, 0.0, 12.1, 0.09, 0.02, 0.55, 0.31, 0.22, 0.0, 16.2, 2.3, 16.0, 0.0, 0.02, 0.0, 0.0, 0.005, 0.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Carrot_juice_canned("Carrot juice, canned", 100.0, 0.0, 0.0, 43.0, 0.95, 0.15, 9.28, 40.0, 0.0, 88.87, 0.8, 24.0, 0.46, 14.0, 42.0, 292.0, 66.0, 0.18, 0.04, 0.0, 0.13, 0.6, 956.0, 1.16, 0.0, 8.5, 0.09, 0.05, 0.38, 0.22, 0.21, 0.0, 9.9, 15.5, 4.0, 0.0, 0.02, 0.0, 0.0, 0.007, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Corn_sweet_white_cooked_boiled_drained_without_salt("Corn, sweet, white, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 46.0, 3.34, 1.41, 21.71, 97.0, 0.0, 72.84, 2.7, 2.0, 0.55, 31.0, 92.0, 252.0, 3.0, 0.54, 0.05, 0.0, 0.21, 0.8, 0.0, 0.09, 0.0, 6.2, 0.09, 0.05, 1.66, 0.74, 0.12, 0.0, 29.1, 0.4, 20.0, 0.0, 0.19, 0.0, 0.0, 0.37, 0.6, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Glucose("Glucose", 100.0, 0.0, 0.0, 100.0, 0.0, 0.0, 100.0, 400.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_kidney_red_mature_seeds_cooked_boiled_without_salt("Beans, kidney, red, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 28.0, 8.67, 0.5, 22.8, 127.0, 0.0, 66.94, 7.4, 28.0, 2.94, 45.0, 142.0, 403.0, 2.0, 1.07, 0.24, 0.0, 0.47, 1.2, 0.0, 0.03, 0.0, 1.2, 0.16, 0.05, 0.57, 0.22, 0.12, 0.0, 30.5, 8.4, 130.0, 0.0, 0.07, 0.0, 0.0, 0.03, 0.27, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beans_pinto_mature_seeds_cooked_boiled_without_salt("Beans, pinto, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 45.0, 9.01, 0.65, 26.22, 143.0, 0.0, 62.95, 9.0, 46.0, 2.09, 50.0, 147.0, 436.0, 1.0, 0.98, 0.21, 2.2, 0.45, 6.2, 0.0, 0.94, 0.0, 0.8, 0.19, 0.06, 0.31, 0.21, 0.22, 0.0, 35.3, 3.5, 172.0, 0.0, 0.13, 0.0, 0.0, 0.13, 0.23, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Lentils_mature_seeds_cooked_boiled_without_salt("Lentils, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 29.0, 9.02, 0.38, 20.13, 116.0, 0.0, 69.64, 7.9, 19.0, 3.33, 36.0, 180.0, 369.0, 2.0, 1.27, 0.25, 0.0, 0.49, 2.8, 0.0, 0.11, 0.0, 1.5, 0.16, 0.07, 1.06, 0.63, 0.17, 0.0, 32.7, 1.7, 181.0, 0.0, 0.05, 0.0, 0.0, 0.06, 0.17, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Soybeans_mature_cooked_boiled_without_salt("Soybeans, mature cooked, boiled, without salt", 100.0, 0.0, 0.0, 14.0, 18.21, 8.97, 8.36, 172.0, 0.0, 62.55, 6.0, 102.0, 5.14, 86.0, 245.0, 515.0, 1.0, 1.15, 0.4, 0.0, 0.82, 7.3, 0.0, 0.35, 0.0, 1.7, 0.15, 0.28, 0.39, 0.17, 0.23, 0.0, 47.5, 19.2, 54.0, 0.0, 1.29, 0.0, 0.0, 1.98, 5.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Hummus_home_prepared("Hummus, home prepared", 100.0, 0.0, 0.0, 6.0, 4.86, 8.59, 20.12, 177.0, 0.0, 64.87, 4.0, 49.0, 1.56, 29.0, 110.0, 173.0, 242.0, 1.09, 0.22, 0.0, 0.56, 2.4, 0.0, 0.75, 0.0, 7.9, 0.08, 0.05, 0.39, 0.28, 0.39, 0.0, 27.8, 3.0, 59.0, 0.0, 1.14, 0.0, 0.0, 4.86, 2.1, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids("Chickpeas (garbanzo beans, bengal gram), mature seeds, canned, drained solids", 100.0, 0.0, 0.0, 40.0, 7.05, 2.77, 22.53, 139.0, 0.0, 66.72, 6.4, 45.0, 1.07, 26.0, 85.0, 126.0, 246.0, 0.63, 0.25, 0.0, 0.84, 3.1, 1.0, 0.29, 0.0, 0.1, 0.02, 0.01, 0.14, 0.0, 0.11, 0.0, 0.0, 3.4, 48.0, 0.0, 0.21, 0.0, 0.0, 0.48, 0.96, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bread_pita_white_enriched("Bread, pita, white, enriched", 100.0, 0.0, 0.0, 70.0, 9.1, 1.2, 55.7, 275.0, 0.0, 32.1, 2.2, 86.0, 2.62, 26.0, 97.0, 120.0, 536.0, 0.84, 0.16, 0.0, 0.48, 27.1, 0.0, 0.3, 0.0, 0.0, 0.59, 0.32, 4.63, 0.39, 0.03, 0.0, 14.6, 0.2, 165.0, 0.0, 0.16, 0.0, 0.0, 0.1, 0.53, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bread_rye("Bread, rye", 100.0, 0.0, 0.0, 58.0, 8.5, 3.3, 48.3, 259.0, 0.0, 37.3, 5.8, 73.0, 2.83, 40.0, 125.0, 166.0, 603.0, 1.14, 0.18, 51.0, 0.82, 30.9, 0.0, 0.33, 0.0, 0.4, 0.43, 0.33, 3.8, 0.44, 0.07, 0.0, 14.6, 1.2, 151.0, 0.0, 0.62, 0.0, 0.0, 1.31, 0.79, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bread_white_wheat("Bread, white wheat", 100.0, 0.0, 0.0, 70.0, 10.66, 2.15, 43.91, 238.0, 0.0, 39.6, 9.2, 684.0, 4.89, 26.0, 103.0, 127.0, 478.0, 0.95, 0.14, 0.0, 0.63, 16.1, 0.0, 0.38, 0.0, 0.0, 0.51, 0.25, 4.45, 0.45, 0.08, 0.0, 8.1, 7.7, 162.0, 0.0, 0.63, 0.0, 0.003, 0.39, 0.97, 0.87, 0.08, 4.0, 4.0, 9.0, 6.93),
    Snacks_pretzels_hard_plain_salted("Snacks, pretzels, hard, plain, salted", 100.0, 0.0, 0.0, 83.0, 10.04, 2.93, 80.39, 384.0, 0.0, 3.13, 3.4, 27.0, 4.58, 29.0, 128.0, 223.0, 1240.0, 1.04, 0.15, 0.0, 1.01, 4.4, 0.0, 0.47, 0.0, 2.1, 0.42, 0.33, 5.27, 0.32, 0.07, 0.0, 29.5, 2.8, 166.0, 0.0, 0.39, 0.0, 0.0, 0.72, 1.29, 1.22, 0.06, 4.0, 4.0, 9.0, 6.93),
    Honey("Honey", 100.0, 0.0, 0.0, 55.0, 0.3, 0.0, 82.4, 304.0, 0.0, 17.1, 0.2, 6.0, 0.42, 2.0, 4.0, 52.0, 4.0, 0.22, 0.03, 7.0, 0.08, 0.8, 0.0, 0.0, 0.0, 0.5, 0.0, 0.03, 0.12, 0.06, 0.02, 0.0, 2.2, 0.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Sugars_granulated("Sugars, granulated", 100.0, 0.0, 0.0, 68.0, 0.0, 0.0, 99.98, 387.0, 0.0, 0.02, 0.0, 1.0, 0.05, 0.0, 0.0, 2.0, 1.0, 0.01, 0.007, 0.0, 0.004, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Snacks_popcorn_air_popped_unsalted("Snacks, popcorn, air-popped (Unsalted)", 100.0, 0.0, 0.0, 72.0, 12.0, 4.2, 77.9, 382.0, 0.0, 4.1, 15.1, 10.0, 2.66, 131.0, 300.0, 301.0, 4.0, 3.44, 0.42, 0.0, 0.94, 9.9, 1.0, 0.0, 0.0, 0.0, 0.2, 0.28, 1.94, 0.42, 0.24, 0.0, 0.0, 0.0, 23.0, 0.0, 0.57, 0.0, 0.0, 1.1, 1.9, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Snacks_tortilla_chips_low_fat_unsalted("Snacks, tortilla chips, low fat, unsalted", 100.0, 0.0, 0.0, 63.0, 11.0, 5.7, 80.1, 416.0, 0.0, 1.7, 5.3, 159.0, 1.6, 97.0, 318.0, 272.0, 15.0, 1.15, 0.11, 0.0, 0.0, 15.7, 4.0, 3.53, 0.0, 0.2, 0.22, 0.28, 0.42, 0.0, 0.18, 0.0, 23.4, 20.9, 16.0, 0.0, 0.85, 0.0, 0.0, 1.66, 2.87, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Barley_pearled_cooked("Barley, pearled, cooked", 100.0, 0.0, 0.0, 25.0, 2.26, 0.44, 28.22, 123.0, 0.0, 68.8, 3.8, 11.0, 1.33, 22.0, 54.0, 93.0, 3.0, 0.82, 0.1, 0.0, 0.25, 8.6, 0.0, 0.01, 0.0, 0.0, 0.08, 0.06, 2.06, 0.13, 0.11, 0.0, 13.4, 0.8, 16.0, 0.0, 0.09, 0.0, 0.0, 0.05, 0.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Couscous_cooked("Couscous, cooked", 100.0, 0.0, 0.0, 65.0, 3.79, 0.16, 23.22, 112.0, 0.0, 72.57, 1.4, 8.0, 0.38, 8.0, 22.0, 58.0, 5.0, 0.26, 0.04, 0.0, 0.08, 27.5, 0.0, 0.13, 0.0, 0.0, 0.06, 0.02, 0.98, 0.37, 0.05, 0.0, 3.3, 0.1, 15.0, 0.0, 0.02, 0.0, 0.0, 0.02, 0.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Hominy_canned_white("Hominy, canned, white", 100.0, 0.0, 0.0, 40.0, 1.48, 0.88, 14.26, 72.0, 0.0, 82.53, 2.5, 10.0, 0.62, 16.0, 35.0, 9.0, 345.0, 1.05, 0.03, 0.0, 0.07, 3.0, 0.0, 0.05, 0.0, 0.0, 0.003, 0.006, 0.03, 0.15, 0.005, 0.0, 3.1, 0.2, 1.0, 0.0, 0.12, 0.0, 0.0, 0.23, 0.39, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Millet_cooked("Millet, cooked", 100.0, 0.0, 0.0, 71.0, 3.51, 1.0, 23.67, 119.0, 0.0, 71.41, 1.3, 3.0, 0.63, 44.0, 100.0, 62.0, 2.0, 0.91, 0.16, 0.0, 0.27, 0.9, 0.0, 0.02, 0.0, 0.0, 0.1, 0.08, 1.33, 0.17, 0.1, 0.0, 11.2, 0.3, 19.0, 0.0, 0.17, 0.0, 0.0, 0.18, 0.5, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_brown_long_grain_cooked("Rice, brown, long-grain, cooked", 100.0, 0.0, 0.0, 66.0, 2.74, 0.97, 25.58, 123.0, 0.0, 70.27, 1.6, 3.0, 0.56, 39.0, 103.0, 86.0, 4.0, 0.71, 0.1, 0.0, 0.97, 5.8, 0.0, 0.17, 0.0, 0.0, 0.17, 0.06, 2.56, 0.38, 0.12, 0.0, 9.2, 0.2, 9.0, 0.0, 0.26, 0.0, 0.0, 0.36, 0.36, 0.35, 0.01, 4.0, 4.0, 9.0, 6.93),
    Rice_brown_medium_grain_cooked("Rice, brown, medium-grain, cooked", 100.0, 0.0, 0.0, 66.0, 2.32, 0.83, 23.51, 112.0, 0.0, 72.96, 1.8, 10.0, 0.53, 44.0, 77.0, 79.0, 1.0, 0.62, 0.08, 0.0, 1.09, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.01, 1.33, 0.39, 0.14, 0.0, 0.0, 0.0, 4.0, 0.0, 0.16, 0.0, 0.0, 0.3, 0.29, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_long_grain_regular_enriched_cooked("Rice, white, long-grain, regular, enriched, cooked", 100.0, 0.0, 0.0, 58.0, 2.69, 0.28, 28.17, 130.0, 0.0, 68.44, 0.4, 10.0, 1.2, 12.0, 43.0, 35.0, 1.0, 0.49, 0.06, 41.1, 0.47, 7.5, 0.0, 0.04, 0.0, 0.0, 0.16, 0.01, 1.47, 0.39, 0.09, 0.0, 2.1, 0.0, 97.0, 0.0, 0.07, 0.0, 0.0, 0.08, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_medium_grain_enriched_cooked("Rice, white, medium-grain, enriched, cooked", 100.0, 0.0, 0.0, 64.0, 2.38, 0.21, 28.59, 130.0, 0.0, 68.61, 0.3, 3.0, 1.49, 13.0, 37.0, 29.0, 0.0, 0.42, 0.03, 0.0, 0.37, 7.5, 0.0, 0.0, 0.0, 0.0, 0.16, 0.01, 1.83, 0.41, 0.05, 0.0, 0.0, 0.0, 97.0, 0.0, 0.05, 0.0, 0.0, 0.06, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_glutinous_unenriched_cooked("Rice, white, glutinous, unenriched, cooked", 100.0, 0.0, 0.0, 98.0, 2.02, 0.19, 21.09, 97.0, 0.0, 76.63, 1.0, 2.0, 0.14, 5.0, 8.0, 10.0, 5.0, 0.41, 0.04, 0.0, 0.26, 5.6, 0.0, 0.04, 0.0, 0.0, 0.02, 0.01, 0.29, 0.21, 0.02, 0.0, 2.1, 0.0, 1.0, 0.0, 0.03, 0.0, 0.0, 0.07, 0.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Wild_rice_cooked("Wild rice, cooked", 100.0, 0.0, 0.0, 57.0, 3.99, 0.34, 21.34, 101.0, 0.0, 73.93, 1.8, 3.0, 0.6, 32.0, 82.0, 101.0, 3.0, 1.34, 0.12, 0.0, 0.28, 0.8, 0.0, 0.24, 0.0, 0.0, 0.05, 0.08, 1.28, 0.15, 0.13, 0.0, 10.2, 0.5, 26.0, 0.0, 0.04, 0.0, 0.0, 0.05, 0.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pasta_cooked_enriched_without_added_salt("Pasta, cooked, enriched, without added salt", 100.0, 0.0, 0.0, 42.0, 5.8, 0.93, 30.86, 158.0, 0.0, 62.13, 1.8, 7.0, 1.28, 18.0, 58.0, 44.0, 1.0, 0.51, 0.1, 7.0, 0.32, 26.4, 0.0, 0.06, 0.0, 0.0, 0.27, 0.13, 1.68, 0.11, 0.04, 0.0, 6.4, 0.0, 119.0, 0.0, 0.17, 0.0, 0.0, 0.13, 0.32, 0.0, 0.02, 4.0, 4.0, 9.0, 6.93),
    Hominy_canned_yellow("Hominy, canned, yellow", 100.0, 0.0, 0.0, 40.0, 1.48, 0.88, 14.26, 72.0, 0.0, 82.53, 2.5, 10.0, 0.62, 16.0, 35.0, 9.0, 345.0, 1.05, 0.03, 0.0, 0.07, 3.0, 0.0, 0.0, 0.0, 0.0, 0.003, 0.006, 0.03, 0.15, 0.005, 0.0, 0.0, 0.0, 1.0, 0.0, 0.12, 0.0, 0.0, 0.23, 0.39, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pretzels_soft_unsalted("Pretzels, soft, unsalted", 100.0, 0.0, 0.0, 83.0, 8.2, 3.1, 71.04, 345.0, 0.0, 15.0, 1.7, 23.0, 3.92, 21.0, 79.0, 88.0, 252.0, 0.94, 0.12, 0.0, 0.0, 17.2, 0.0, 0.54, 0.0, 0.0, 0.41, 0.29, 4.27, 0.0, 0.02, 0.0, 17.7, 2.7, 24.0, 0.0, 0.69, 0.0, 0.0, 1.07, 0.94, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Campbell_s_tomato_juice("CAMPBELL'S, Tomato juice", 100.0, 0.0, 0.0, 38.0, 0.82, 0.0, 4.12, 21.0, 0.0, 93.9, 0.8, 8.0, 0.15, 0.0, 0.0, 177.0, 280.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 29.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Snacks_tortilla_chips_unsalted_white_corn("Snacks, tortilla chips, unsalted, white corn", 100.0, 0.0, 0.0, 63.0, 7.79, 23.36, 65.32, 503.0, 0.0, 2.09, 5.3, 174.0, 2.32, 146.0, 200.0, 215.0, 15.0, 2.46, 0.52, 0.0, 0.0, 6.7, 4.0, 3.53, 0.0, 0.0, 0.01, 0.1, 1.26, 1.18, 0.21, 0.36, 18.1, 0.7, 10.0, 0.0, 2.45, 0.0, 0.0, 9.52, 9.95, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Snacks_tortilla_chips_light_baked_with_less_oil("Snacks, tortilla chips, light (baked with less oil)", 100.0, 0.0, 0.0, 63.0, 8.7, 15.2, 73.4, 465.0, 0.0, 1.3, 5.7, 159.0, 1.63, 97.0, 318.0, 272.0, 564.0, 1.15, 0.11, 0.0, 0.0, 15.7, 4.0, 3.53, 0.0, 0.2, 0.22, 0.28, 0.42, 0.0, 0.18, 0.06, 23.4, 0.7, 16.0, 0.0, 2.83, 0.0, 0.0, 6.34, 5.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),;

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

    Glycemic_index_test_set(
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
        return "Glycemic Index Test Set";
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
