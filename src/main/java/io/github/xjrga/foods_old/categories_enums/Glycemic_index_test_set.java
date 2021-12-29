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
package io.github.xjrga.foods_old.categories_enums;

import io.github.xjrga.foods_old.Interface_food;

/**
 * Glycemic index test set foods have the glycemic load data filled in and can
 * be used to test glycemic load calculations
 *
 */
public enum Glycemic_index_test_set implements Interface_food {

    //01085
    Milk_nonfat_fluid_with_added_vitamin_A_and_vitamin_D_fat_free_or_skim_("Milk, nonfat, fluid, with added vitamin A and vitamin D (fat free or skim)", 100.0, 3.37, 0.0, 1.5872, 3.37, 0.08, 4.96, 34.0, 0.0, 90.84, 0.0, 122.0, 0.03, 11.0, 101.0, 156.0, 42.0, 0.42, 0.01, 3.1, 0.003, 3.1, 61.0, 0.01, 1.2, 0.0, 0.04, 0.18, 0.09, 0.35, 0.03, 0.5, 15.6, 0.0, 5.0, 2.0, 0.05, 0.0, 0.0, 0.02, 0.003, 0.0, 0.0),
    //01095
    Milk_canned_condensed_sweetened("Milk, canned, condensed, sweetened", 100.0, 7.91, 0.0, 33.184, 7.91, 8.7, 54.4, 321.0, 0.0, 27.16, 0.0, 284.0, 0.19, 26.0, 253.0, 371.0, 127.0, 0.94, 0.01, 0.0, 0.006, 14.8, 74.0, 0.16, 0.2, 2.6, 0.09, 0.41, 0.21, 0.75, 0.05, 0.44, 89.1, 0.6, 11.0, 34.0, 5.48, 0.0, 0.0, 2.42, 0.33, 0.0, 0.0),
    //01256
    Yogurt_Greek_plain_nonfat("Yogurt, Greek, plain, nonfat", 100.0, 10.19, 0.0, 0.504, 10.19, 0.39, 3.6, 59.0, 0.0, 85.1, 0.0, 110.0, 0.07, 11.0, 135.0, 141.0, 36.0, 0.52, 0.01, 0.0, 0.009, 9.7, 1.0, 0.01, 0.0, 0.0, 0.02, 0.27, 0.2, 0.33, 0.06, 0.75, 15.1, 0.0, 7.0, 5.0, 0.11, 0.0, 0.0, 0.05, 0.01, 0.01, 0.001),
    //08001
    Cereals_ready_to_eat_KELLOGG_KELLOGG_S_ALL_BRAN_Original("Cereals ready-to-eat, KELLOGG, KELLOGG'S ALL-BRAN Original", 100.0, 0.0, 0.0, 15.2796, 13.14, 4.9, 74.24, 259.0, 0.0, 2.12, 29.3, 389.0, 17.6, 362.0, 1150.0, 1020.0, 258.0, 12.4, 1.04, 0.0, 7.41, 9.4, 522.0, 1.19, 4.3, 20.0, 2.27, 2.71, 14.8, 1.06, 12.0, 18.8, 49.4, 5.2, 2198.0, 0.0, 1.1, 0.0, 0.0, 0.89, 2.0, 0.0, 0.0),
    //08120
    Cereals_oats_regular_and_quick_not_fortified_dry("Cereals, oats, regular and quick, not fortified, dry", 100.0, 0.0, 0.0, 37.44, 13.15, 6.52, 67.7, 379.0, 0.0, 10.84, 10.1, 52.0, 4.25, 138.0, 410.0, 362.0, 6.0, 3.64, 0.39, 0.0, 3.63, 28.9, 0.0, 0.42, 0.0, 0.0, 0.46, 0.15, 1.12, 1.12, 0.1, 0.0, 40.4, 2.0, 32.0, 0.0, 1.11, 0.0, 0.0, 1.98, 2.3, 0.0, 0.0),
    //09003
    Apples_raw_with_skin("Apples, raw, with skin", 100.0, 0.0, 0.0, 4.3358, 0.26, 0.17, 13.81, 52.0, 0.0, 85.56, 2.4, 6.0, 0.12, 5.0, 11.0, 107.0, 1.0, 0.04, 0.02, 3.3, 0.03, 0.0, 3.0, 0.18, 0.0, 4.6, 0.01, 0.02, 0.09, 0.06, 0.04, 0.0, 3.4, 2.2, 3.0, 0.0, 0.02, 0.0, 0.0, 0.007, 0.05, 0.0, 0.0),
    //09021
    Apricots_raw("Apricots, raw", 100.0, 0.0, 0.0, 5.1983999999999995, 1.4, 0.39, 11.12, 48.0, 0.0, 86.35, 2.0, 13.0, 0.39, 10.0, 23.0, 259.0, 1.0, 0.2, 0.07, 0.0, 0.07, 0.1, 96.0, 0.89, 0.0, 10.0, 0.03, 0.04, 0.6, 0.24, 0.05, 0.0, 2.8, 3.3, 9.0, 0.0, 0.02, 0.0, 0.0, 0.17, 0.07, 0.0, 0.0),
    //09040
    Bananas_raw("Bananas, raw", 100.0, 0.0, 0.0, 10.5248, 1.09, 0.33, 22.84, 89.0, 0.0, 74.91, 2.6, 5.0, 0.26, 27.0, 22.0, 358.0, 1.0, 0.15, 0.07, 2.2, 0.27, 1.0, 3.0, 0.1, 0.0, 8.7, 0.03, 0.07, 0.66, 0.33, 0.36, 0.0, 9.8, 0.5, 20.0, 0.0, 0.11, 0.0, 0.0, 0.03, 0.07, 0.0, 0.0),
    //09111
    Grapefruit_raw_pink_and_red_and_white_all_areas("Grapefruit, raw, pink and red and white, all areas", 100.0, 0.0, 0.0, 1.745, 0.63, 0.1, 8.08, 32.0, 0.0, 90.89, 1.1, 12.0, 0.09, 8.0, 8.0, 139.0, 0.0, 0.07, 0.04, 1.0, 0.01, 0.3, 46.0, 0.13, 0.0, 34.4, 0.03, 0.02, 0.25, 0.28, 0.04, 0.0, 7.7, 0.0, 10.0, 0.0, 0.01, 0.0, 0.0, 0.01, 0.02, 0.0, 0.0),
    //09132
    Grapes_red_or_green_European_type_such_as_Thompson_seedless_raw("Grapes, red or green (European type, such as Thompson seedless), raw", 100.0, 0.0, 0.0, 7.912000000000002, 0.72, 0.16, 18.1, 69.0, 0.0, 80.54, 0.9, 10.0, 0.36, 7.0, 20.0, 191.0, 2.0, 0.07, 0.12, 7.8, 0.07, 0.1, 3.0, 0.19, 0.0, 3.2, 0.06, 0.07, 0.18, 0.05, 0.08, 0.0, 5.6, 14.6, 2.0, 0.0, 0.05, 0.0, 0.0, 0.007, 0.04, 0.0, 0.0),
    //09176
    Mangos_raw("Mangos, raw", 100.0, 0.0, 0.0, 6.8238, 0.82, 0.38, 14.98, 60.0, 0.0, 83.46, 1.6, 11.0, 0.16, 10.0, 14.0, 168.0, 1.0, 0.09, 0.11, 0.0, 0.06, 0.6, 54.0, 0.9, 0.0, 36.4, 0.02, 0.03, 0.66, 0.19, 0.11, 0.0, 7.6, 4.2, 43.0, 0.0, 0.09, 0.0, 0.0, 0.14, 0.07, 0.0, 0.0),
    //09181
    Melons_cantaloupe_raw("Melons, cantaloupe, raw", 100.0, 0.0, 0.0, 4.864199999999999, 0.84, 0.19, 8.16, 34.0, 0.0, 90.15, 0.9, 9.0, 0.21, 12.0, 15.0, 267.0, 16.0, 0.18, 0.04, 1.0, 0.04, 0.4, 169.0, 0.05, 0.0, 36.7, 0.04, 0.01, 0.73, 0.1, 0.07, 0.0, 7.6, 2.5, 21.0, 0.0, 0.05, 0.0, 0.0, 0.003, 0.08, 0.0, 0.0),
    //09200
    Oranges_raw_all_commercial_varieties("Oranges, raw, all commercial varieties", 100.0, 0.0, 0.0, 3.927, 0.94, 0.12, 11.75, 47.0, 0.0, 86.75, 2.4, 40.0, 0.1, 10.0, 14.0, 181.0, 0.0, 0.07, 0.04, 0.0, 0.02, 0.5, 11.0, 0.18, 0.0, 53.2, 0.08, 0.04, 0.28, 0.25, 0.06, 0.0, 8.4, 0.0, 30.0, 0.0, 0.01, 0.0, 0.0, 0.02, 0.02, 0.0, 0.0),
    //09206
    Orange_juice_raw("Orange juice, raw", 100.0, 0.0, 0.0, 5.406000000000001, 0.7, 0.2, 10.4, 45.0, 0.0, 88.3, 0.2, 11.0, 0.2, 11.0, 17.0, 200.0, 1.0, 0.05, 0.04, 0.0, 0.01, 0.1, 10.0, 0.04, 0.0, 50.0, 0.09, 0.03, 0.4, 0.19, 0.04, 0.0, 6.2, 0.1, 30.0, 0.0, 0.02, 0.0, 0.0, 0.03, 0.04, 0.0, 0.0),
    //09226
    Papayas_raw("Papayas, raw", 100.0, 0.0, 0.0, 5.107200000000001, 0.47, 0.26, 10.82, 43.0, 0.0, 88.06, 1.7, 20.0, 0.25, 21.0, 10.0, 182.0, 8.0, 0.08, 0.04, 0.0, 0.04, 0.6, 47.0, 0.3, 0.0, 60.9, 0.02, 0.02, 0.35, 0.19, 0.03, 0.0, 6.1, 2.6, 37.0, 0.0, 0.08, 0.0, 0.0, 0.07, 0.05, 0.0, 0.0),
    //09236
    Peaches_yellow_raw("Peaches, yellow, raw", 100.0, 0.0, 0.0, 3.0551999999999997, 0.91, 0.25, 9.54, 39.0, 0.0, 88.87, 1.5, 6.0, 0.25, 9.0, 20.0, 190.0, 0.0, 0.17, 0.06, 4.0, 0.06, 0.1, 16.0, 0.73, 0.0, 6.6, 0.02, 0.03, 0.8, 0.15, 0.02, 0.0, 6.1, 2.6, 4.0, 0.0, 0.01, 0.0, 0.0, 0.06, 0.08, 0.0, 0.0),
    //09252
    Pears_raw("Pears, raw", 100.0, 0.0, 0.0, 4.609400000000001, 0.36, 0.14, 15.23, 57.0, 0.0, 83.96, 3.1, 9.0, 0.18, 7.0, 12.0, 116.0, 1.0, 0.1, 0.08, 2.2, 0.04, 0.1, 1.0, 0.12, 0.0, 4.3, 0.01, 0.02, 0.16, 0.04, 0.02, 0.0, 5.1, 4.4, 7.0, 0.0, 0.02, 0.0, 0.0, 0.08, 0.09, 0.0, 0.0),
    //09266
    Pineapple_raw_all_varieties("Pineapple, raw, all varieties", 100.0, 0.0, 0.0, 6.914799999999999, 0.54, 0.12, 13.12, 50.0, 0.0, 86.0, 1.4, 13.0, 0.29, 12.0, 8.0, 109.0, 1.0, 0.12, 0.11, 0.0, 0.92, 0.1, 3.0, 0.02, 0.0, 47.8, 0.07, 0.03, 0.5, 0.21, 0.11, 0.0, 5.5, 0.7, 18.0, 0.0, 0.009, 0.0, 0.0, 0.01, 0.04, 0.0, 0.0),
    //09279
    Plums_raw("Plums, raw", 100.0, 0.0, 0.0, 3.9078, 0.7, 0.28, 11.42, 46.0, 0.0, 87.23, 1.4, 6.0, 0.17, 7.0, 16.0, 157.0, 0.0, 0.1, 0.05, 2.0, 0.05, 0.0, 17.0, 0.26, 0.0, 9.5, 0.02, 0.02, 0.41, 0.13, 0.02, 0.0, 1.9, 6.4, 5.0, 0.0, 0.01, 0.0, 0.0, 0.13, 0.04, 0.0, 0.0),
    //09287
    Prickly_pears_raw("Prickly pears, raw", 100.0, 0.0, 0.0, 0.41790000000000005, 0.73, 0.51, 9.57, 41.0, 0.0, 87.55, 3.6, 56.0, 0.3, 85.0, 24.0, 220.0, 5.0, 0.12, 0.08, 0.0, 0.0, 0.6, 2.0, 0.0, 0.0, 14.0, 0.01, 0.06, 0.46, 0.0, 0.06, 0.0, 0.0, 0.0, 6.0, 0.0, 0.06, 0.0, 0.0, 0.07, 0.21, 0.0, 0.0),
    //09298
    Raisins_seedless("Raisins, seedless", 100.0, 0.0, 0.0, 48.3072, 3.07, 0.46, 79.18, 299.0, 0.0, 15.43, 3.7, 50.0, 1.88, 32.0, 101.0, 749.0, 11.0, 0.22, 0.31, 233.9, 0.29, 0.6, 0.0, 0.12, 0.0, 2.3, 0.1, 0.12, 0.76, 0.09, 0.17, 0.0, 11.1, 3.5, 5.0, 0.0, 0.05, 0.0, 0.0, 0.05, 0.03, 0.0, 0.0),
    //09438
    USDA_Commodity_peaches_canned_light_syrup_drained("USDA Commodity peaches, canned, light syrup, drained", 100.0, 0.0, 0.0, 8.521500000000001, 0.56, 0.15, 15.65, 61.0, 0.0, 83.43, 0.7, 3.0, 0.25, 5.0, 10.0, 87.0, 7.0, 0.16, 0.03, 0.0, 0.03, 0.0, 25.0, 1.23, 0.0, 2.5, 0.02, 0.02, 0.58, 0.04, 0.01, 0.0, 0.0, 2.8, 8.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //11084
    Beets_canned_drained_solids("Beets, canned, drained solids", 100.0, 0.0, 0.0, 3.4624, 0.91, 0.14, 7.21, 31.0, 0.0, 90.96, 1.8, 15.0, 1.82, 17.0, 17.0, 148.0, 194.0, 0.21, 0.05, 26.3, 0.28, 0.5, 1.0, 0.03, 0.0, 4.1, 0.01, 0.04, 0.15, 0.15, 0.05, 0.0, 7.5, 0.2, 30.0, 0.0, 0.02, 0.0, 0.0, 0.02, 0.04, 0.0, 0.0),
    //11124
    Carrots_raw("Carrots, raw", 100.0, 0.0, 0.0, 3.1866000000000003, 0.93, 0.24, 9.58, 41.0, 0.0, 88.29, 2.8, 33.0, 0.3, 12.0, 35.0, 320.0, 69.0, 0.24, 0.04, 3.2, 0.14, 0.1, 835.0, 0.66, 0.0, 5.9, 0.06, 0.05, 0.98, 0.27, 0.13, 0.0, 8.8, 13.2, 19.0, 0.0, 0.03, 0.0, 0.0, 0.01, 0.11, 0.0, 0.0),
    //11125
    Carrots_cooked_boiled_drained_without_salt("Carrots, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 2.1402000000000005, 0.76, 0.18, 8.22, 35.0, 0.0, 90.17, 3.0, 30.0, 0.34, 10.0, 30.0, 235.0, 58.0, 0.2, 0.01, 47.5, 0.15, 0.7, 852.0, 1.03, 0.0, 3.6, 0.06, 0.04, 0.64, 0.23, 0.15, 0.0, 8.8, 13.7, 14.0, 0.0, 0.03, 0.0, 0.0, 0.006, 0.08, 0.0, 0.0),
    //11168
    Corn_sweet_yellow_cooked_boiled_drained_without_salt("Corn, sweet, yellow, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 8.546800000000001, 3.41, 1.5, 20.98, 96.0, 0.0, 73.41, 2.4, 3.0, 0.45, 26.0, 77.0, 218.0, 1.0, 0.62, 0.04, 0.0, 0.16, 0.2, 13.0, 0.09, 0.0, 5.5, 0.09, 0.05, 1.68, 0.79, 0.13, 0.0, 29.1, 0.4, 23.0, 0.0, 0.19, 0.0, 0.0, 0.37, 0.6, 0.0, 0.0),
    //11305
    Peas_green_cooked_boiled_drained_without_salt("Peas, green, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 4.8624, 5.36, 0.22, 15.63, 84.0, 0.0, 77.87, 5.5, 27.0, 1.54, 39.0, 117.0, 271.0, 3.0, 1.19, 0.17, 0.0, 0.52, 1.9, 40.0, 0.14, 0.0, 14.2, 0.25, 0.14, 2.02, 0.15, 0.21, 0.0, 29.7, 25.9, 63.0, 0.0, 0.03, 0.0, 0.0, 0.01, 0.1, 0.0, 0.0),
    //11357
    Potatoes_white_flesh_and_skin_baked("Potatoes, white, flesh and skin, baked", 100.0, 0.0, 0.0, 11.387999999999998, 2.1, 0.15, 21.08, 94.0, 0.0, 75.43, 2.1, 10.0, 0.64, 27.0, 75.0, 544.0, 7.0, 0.35, 0.12, 0.0, 0.18, 0.5, 1.0, 0.04, 0.0, 12.6, 0.04, 0.04, 1.52, 0.38, 0.21, 0.0, 14.4, 2.7, 38.0, 0.0, 0.02, 0.0, 0.0, 0.002, 0.03, 0.0, 0.0),
    //11451
    Soybeans_green_cooked_boiled_drained_without_salt("Soybeans, green, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 0.9590000000000001, 12.35, 6.4, 11.05, 141.0, 0.0, 68.6, 4.2, 145.0, 2.5, 60.0, 158.0, 539.0, 14.0, 0.91, 0.11, 0.0, 0.5, 1.4, 8.0, 0.0, 0.0, 17.0, 0.26, 0.15, 1.25, 0.12, 0.06, 0.0, 0.0, 0.0, 111.0, 0.0, 0.74, 0.0, 0.0, 1.2, 3.01, 0.0, 0.0),
    //11508
    Sweet_potato_cooked_baked_in_skin_flesh_without_salt("Sweet potato, cooked, baked in skin, flesh, without salt", 100.0, 0.0, 0.0, 10.6201, 2.01, 0.15, 20.71, 90.0, 0.0, 75.78, 3.3, 38.0, 0.69, 27.0, 54.0, 475.0, 36.0, 0.32, 0.16, 0.0, 0.49, 0.2, 961.0, 0.71, 0.0, 19.6, 0.1, 0.1, 1.48, 0.88, 0.28, 0.0, 13.1, 2.3, 6.0, 0.0, 0.05, 0.0, 0.0, 0.002, 0.09, 0.0, 0.0),
    //11602
    Yam_cooked_boiled_drained_or_baked_without_salt("Yam, cooked, boiled, drained, or baked, without salt", 100.0, 0.0, 0.0, 8.7246, 1.49, 0.14, 27.48, 116.0, 0.0, 70.13, 3.9, 14.0, 0.52, 18.0, 49.0, 670.0, 8.0, 0.2, 0.15, 0.0, 0.37, 0.7, 6.0, 0.34, 0.0, 12.1, 0.09, 0.02, 0.55, 0.31, 0.22, 0.0, 16.2, 2.3, 16.0, 0.0, 0.02, 0.0, 0.0, 0.005, 0.06, 0.0, 0.0),
    //11655
    Carrot_juice_canned("Carrot juice, canned", 100.0, 0.0, 0.0, 3.6463999999999994, 0.95, 0.15, 9.28, 40.0, 0.0, 88.87, 0.8, 24.0, 0.46, 14.0, 42.0, 292.0, 66.0, 0.18, 0.04, 0.0, 0.13, 0.6, 956.0, 1.16, 0.0, 8.5, 0.09, 0.05, 0.38, 0.22, 0.21, 0.0, 9.9, 15.5, 4.0, 0.0, 0.02, 0.0, 0.0, 0.007, 0.07, 0.0, 0.0),
    //11901
    Corn_sweet_white_cooked_boiled_drained_without_salt("Corn, sweet, white, cooked, boiled, drained, without salt", 100.0, 0.0, 0.0, 8.7446, 3.34, 1.41, 21.71, 97.0, 0.0, 72.84, 2.7, 2.0, 0.55, 31.0, 92.0, 252.0, 3.0, 0.54, 0.05, 0.0, 0.21, 0.8, 0.0, 0.09, 0.0, 6.2, 0.09, 0.05, 1.66, 0.74, 0.12, 0.0, 29.1, 0.4, 20.0, 0.0, 0.19, 0.0, 0.0, 0.37, 0.6, 0.0, 0.0),
    //123456754
    Glucose("Glucose", 100.0, 0.0, 0.0, 100.0, 0.0, 0.0, 100.0, 400.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //16033
    Beans_kidney_red_mature_seeds_cooked_boiled_without_salt("Beans, kidney, red, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 4.312, 8.67, 0.5, 22.8, 127.0, 0.0, 66.94, 7.4, 28.0, 2.94, 45.0, 142.0, 403.0, 2.0, 1.07, 0.24, 0.0, 0.47, 1.2, 0.0, 0.03, 0.0, 1.2, 0.16, 0.05, 0.57, 0.22, 0.12, 0.0, 30.5, 8.4, 130.0, 0.0, 0.07, 0.0, 0.0, 0.03, 0.27, 0.0, 0.0),
    //16043
    Beans_pinto_mature_seeds_cooked_boiled_without_salt("Beans, pinto, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 7.749, 9.01, 0.65, 26.22, 143.0, 0.0, 62.95, 9.0, 46.0, 2.09, 50.0, 147.0, 436.0, 1.0, 0.98, 0.21, 2.2, 0.45, 6.2, 0.0, 0.94, 0.0, 0.8, 0.19, 0.06, 0.31, 0.21, 0.22, 0.0, 35.3, 3.5, 172.0, 0.0, 0.13, 0.0, 0.0, 0.13, 0.23, 0.0, 0.0),
    //16070
    Lentils_mature_seeds_cooked_boiled_without_salt("Lentils, mature seeds, cooked, boiled, without salt", 100.0, 0.0, 0.0, 3.5466999999999995, 9.02, 0.38, 20.13, 116.0, 0.0, 69.64, 7.9, 19.0, 3.33, 36.0, 180.0, 369.0, 2.0, 1.27, 0.25, 0.0, 0.49, 2.8, 0.0, 0.11, 0.0, 1.5, 0.16, 0.07, 1.06, 0.63, 0.17, 0.0, 32.7, 1.7, 181.0, 0.0, 0.05, 0.0, 0.0, 0.06, 0.17, 0.0, 0.0),
    //16109
    Soybeans_mature_cooked_boiled_without_salt("Soybeans, mature cooked, boiled, without salt", 100.0, 0.0, 0.0, 0.3303999999999999, 18.21, 8.97, 8.36, 172.0, 0.0, 62.55, 6.0, 102.0, 5.14, 86.0, 245.0, 515.0, 1.0, 1.15, 0.4, 0.0, 0.82, 7.3, 0.0, 0.35, 0.0, 1.7, 0.15, 0.28, 0.39, 0.17, 0.23, 0.0, 47.5, 19.2, 54.0, 0.0, 1.29, 0.0, 0.0, 1.98, 5.06, 0.0, 0.0),
    //16137
    Hummus_home_prepared("Hummus, home prepared", 100.0, 0.0, 0.0, 0.9672, 4.86, 8.59, 20.12, 177.0, 0.0, 64.87, 4.0, 49.0, 1.56, 29.0, 110.0, 173.0, 242.0, 1.09, 0.22, 0.0, 0.56, 2.4, 0.0, 0.75, 0.0, 7.9, 0.08, 0.05, 0.39, 0.28, 0.39, 0.0, 27.8, 3.0, 59.0, 0.0, 1.14, 0.0, 0.0, 4.86, 2.1, 0.0, 0.0),
    //16358
    Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids("Chickpeas (garbanzo beans, bengal gram), mature seeds, canned, drained solids", 100.0, 0.0, 0.0, 6.452000000000001, 7.05, 2.77, 22.53, 139.0, 0.0, 66.72, 6.4, 45.0, 1.07, 26.0, 85.0, 126.0, 246.0, 0.63, 0.25, 0.0, 0.84, 3.1, 1.0, 0.29, 0.0, 0.1, 0.02, 0.01, 0.14, 0.0, 0.11, 0.0, 0.0, 3.4, 48.0, 0.0, 0.21, 0.0, 0.0, 0.48, 0.96, 0.0, 0.0),
    //18041
    Bread_pita_white_enriched("Bread, pita, white, enriched", 100.0, 0.0, 0.0, 37.45, 9.1, 1.2, 55.7, 275.0, 0.0, 32.1, 2.2, 86.0, 2.62, 26.0, 97.0, 120.0, 536.0, 0.84, 0.16, 0.0, 0.48, 27.1, 0.0, 0.3, 0.0, 0.0, 0.59, 0.32, 4.63, 0.39, 0.03, 0.0, 14.6, 0.2, 165.0, 0.0, 0.16, 0.0, 0.0, 0.1, 0.53, 0.0, 0.0),
    //18060
    Bread_rye("Bread, rye", 100.0, 0.0, 0.0, 24.65, 8.5, 3.3, 48.3, 259.0, 0.0, 37.3, 5.8, 73.0, 2.83, 40.0, 125.0, 166.0, 603.0, 1.14, 0.18, 51.0, 0.82, 30.9, 0.0, 0.33, 0.0, 0.4, 0.43, 0.33, 3.8, 0.44, 0.07, 0.0, 14.6, 1.2, 151.0, 0.0, 0.62, 0.0, 0.0, 1.31, 0.79, 0.0, 0.0),
    //18967
    Bread_white_wheat("Bread, white wheat", 100.0, 0.0, 0.0, 24.296999999999993, 10.66, 2.15, 43.91, 238.0, 0.0, 39.6, 9.2, 684.0, 4.89, 26.0, 103.0, 127.0, 478.0, 0.95, 0.14, 0.0, 0.63, 16.1, 0.0, 0.38, 0.0, 0.0, 0.51, 0.25, 4.45, 0.45, 0.08, 0.0, 8.1, 7.7, 162.0, 0.0, 0.63, 0.0, 0.003, 0.39, 0.97, 0.87, 0.08),
    //19047
    Snacks_pretzels_hard_plain_salted("Snacks, pretzels, hard, plain, salted", 100.0, 0.0, 0.0, 63.90169999999999, 10.04, 2.93, 80.39, 384.0, 0.0, 3.13, 3.4, 27.0, 4.58, 29.0, 128.0, 223.0, 1240.0, 1.04, 0.15, 0.0, 1.01, 4.4, 0.0, 0.47, 0.0, 2.1, 0.42, 0.33, 5.27, 0.32, 0.07, 0.0, 29.5, 2.8, 166.0, 0.0, 0.39, 0.0, 0.0, 0.72, 1.29, 1.22, 0.06),
    //19296
    Honey("Honey", 100.0, 0.0, 0.0, 45.21, 0.3, 0.0, 82.4, 304.0, 0.0, 17.1, 0.2, 6.0, 0.42, 2.0, 4.0, 52.0, 4.0, 0.22, 0.03, 7.0, 0.08, 0.8, 0.0, 0.0, 0.0, 0.5, 0.0, 0.03, 0.12, 0.06, 0.02, 0.0, 2.2, 0.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //19335
    Sugars_granulated("Sugars, granulated", 100.0, 0.0, 0.0, 67.9864, 0.0, 0.0, 99.98, 387.0, 0.0, 0.02, 0.0, 1.0, 0.05, 0.0, 0.0, 2.0, 1.0, 0.01, 0.007, 0.0, 0.004, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //19806
    Snacks_popcorn_air_popped_Unsalted_("Snacks, popcorn, air-popped (Unsalted)", 100.0, 0.0, 0.0, 45.216, 12.0, 4.2, 77.9, 382.0, 0.0, 4.1, 15.1, 10.0, 2.66, 131.0, 300.0, 301.0, 4.0, 3.44, 0.42, 0.0, 0.94, 9.9, 1.0, 0.0, 0.0, 0.0, 0.2, 0.28, 1.94, 0.42, 0.24, 0.0, 0.0, 0.0, 23.0, 0.0, 0.57, 0.0, 0.0, 1.1, 1.9, 0.0, 0.0),
    //19833
    Snacks_tortilla_chips_low_fat_unsalted("Snacks, tortilla chips, low fat, unsalted", 100.0, 0.0, 0.0, 47.123999999999995, 11.0, 5.7, 80.1, 416.0, 0.0, 1.7, 5.3, 159.0, 1.6, 97.0, 318.0, 272.0, 15.0, 1.15, 0.11, 0.0, 0.0, 15.7, 4.0, 3.53, 0.0, 0.2, 0.22, 0.28, 0.42, 0.0, 0.18, 0.0, 23.4, 20.9, 16.0, 0.0, 0.85, 0.0, 0.0, 1.66, 2.87, 0.0, 0.0),
    //20006
    Barley_pearled_cooked("Barley, pearled, cooked", 100.0, 0.0, 0.0, 6.105, 2.26, 0.44, 28.22, 123.0, 0.0, 68.8, 3.8, 11.0, 1.33, 22.0, 54.0, 93.0, 3.0, 0.82, 0.1, 0.0, 0.25, 8.6, 0.0, 0.01, 0.0, 0.0, 0.08, 0.06, 2.06, 0.13, 0.11, 0.0, 13.4, 0.8, 16.0, 0.0, 0.09, 0.0, 0.0, 0.05, 0.21, 0.0, 0.0),
    //20029
    Couscous_cooked("Couscous, cooked", 100.0, 0.0, 0.0, 14.183, 3.79, 0.16, 23.22, 112.0, 0.0, 72.57, 1.4, 8.0, 0.38, 8.0, 22.0, 58.0, 5.0, 0.26, 0.04, 0.0, 0.08, 27.5, 0.0, 0.13, 0.0, 0.0, 0.06, 0.02, 0.98, 0.37, 0.05, 0.0, 3.3, 0.1, 15.0, 0.0, 0.02, 0.0, 0.0, 0.02, 0.06, 0.0, 0.0),
    //20030
    Hominy_canned_white("Hominy, canned, white", 100.0, 0.0, 0.0, 4.704, 1.48, 0.88, 14.26, 72.0, 0.0, 82.53, 2.5, 10.0, 0.62, 16.0, 35.0, 9.0, 345.0, 1.05, 0.03, 0.0, 0.07, 3.0, 0.0, 0.05, 0.0, 0.0, 0.003, 0.006, 0.03, 0.15, 0.005, 0.0, 3.1, 0.2, 1.0, 0.0, 0.12, 0.0, 0.0, 0.23, 0.39, 0.0, 0.0),
    //20032
    Millet_cooked("Millet, cooked", 100.0, 0.0, 0.0, 15.8827, 3.51, 1.0, 23.67, 119.0, 0.0, 71.41, 1.3, 3.0, 0.63, 44.0, 100.0, 62.0, 2.0, 0.91, 0.16, 0.0, 0.27, 0.9, 0.0, 0.02, 0.0, 0.0, 0.1, 0.08, 1.33, 0.17, 0.1, 0.0, 11.2, 0.3, 19.0, 0.0, 0.17, 0.0, 0.0, 0.18, 0.5, 0.0, 0.0),
    //20037
    Rice_brown_long_grain_cooked("Rice, brown, long-grain, cooked", 100.0, 0.0, 0.0, 15.826799999999999, 2.74, 0.97, 25.58, 123.0, 0.0, 70.27, 1.6, 3.0, 0.56, 39.0, 103.0, 86.0, 4.0, 0.71, 0.1, 0.0, 0.97, 5.8, 0.0, 0.17, 0.0, 0.0, 0.17, 0.06, 2.56, 0.38, 0.12, 0.0, 9.2, 0.2, 9.0, 0.0, 0.26, 0.0, 0.0, 0.36, 0.36, 0.35, 0.01),
    //20041
    Rice_brown_medium_grain_cooked("Rice, brown, medium-grain, cooked", 100.0, 0.0, 0.0, 14.328600000000002, 2.32, 0.83, 23.51, 112.0, 0.0, 72.96, 1.8, 10.0, 0.53, 44.0, 77.0, 79.0, 1.0, 0.62, 0.08, 0.0, 1.09, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.01, 1.33, 0.39, 0.14, 0.0, 0.0, 0.0, 4.0, 0.0, 0.16, 0.0, 0.0, 0.3, 0.29, 0.0, 0.0),
    //20045
    Rice_white_long_grain_regular_enriched_cooked("Rice, white, long-grain, regular, enriched, cooked", 100.0, 0.0, 0.0, 16.1066, 2.69, 0.28, 28.17, 130.0, 0.0, 68.44, 0.4, 10.0, 1.2, 12.0, 43.0, 35.0, 1.0, 0.49, 0.06, 41.1, 0.47, 7.5, 0.0, 0.04, 0.0, 0.0, 0.16, 0.01, 1.47, 0.39, 0.09, 0.0, 2.1, 0.0, 97.0, 0.0, 0.07, 0.0, 0.0, 0.08, 0.07, 0.0, 0.0),
    //20051
    Rice_white_medium_grain_enriched_cooked("Rice, white, medium-grain, enriched, cooked", 100.0, 0.0, 0.0, 18.1056, 2.38, 0.21, 28.59, 130.0, 0.0, 68.61, 0.3, 3.0, 1.49, 13.0, 37.0, 29.0, 0.0, 0.42, 0.03, 0.0, 0.37, 7.5, 0.0, 0.0, 0.0, 0.0, 0.16, 0.01, 1.83, 0.41, 0.05, 0.0, 0.0, 0.0, 97.0, 0.0, 0.05, 0.0, 0.0, 0.06, 0.05, 0.0, 0.0),
    //20055
    Rice_white_glutinous_unenriched_cooked("Rice, white, glutinous, unenriched, cooked", 100.0, 0.0, 0.0, 19.6882, 2.02, 0.19, 21.09, 97.0, 0.0, 76.63, 1.0, 2.0, 0.14, 5.0, 8.0, 10.0, 5.0, 0.41, 0.04, 0.0, 0.26, 5.6, 0.0, 0.04, 0.0, 0.0, 0.02, 0.01, 0.29, 0.21, 0.02, 0.0, 2.1, 0.0, 1.0, 0.0, 0.03, 0.0, 0.0, 0.07, 0.06, 0.0, 0.0),
    //20089
    Wild_rice_cooked("Wild rice, cooked", 100.0, 0.0, 0.0, 11.1378, 3.99, 0.34, 21.34, 101.0, 0.0, 73.93, 1.8, 3.0, 0.6, 32.0, 82.0, 101.0, 3.0, 1.34, 0.12, 0.0, 0.28, 0.8, 0.0, 0.24, 0.0, 0.0, 0.05, 0.08, 1.28, 0.15, 0.13, 0.0, 10.2, 0.5, 26.0, 0.0, 0.04, 0.0, 0.0, 0.05, 0.21, 0.0, 0.0),
    //20121
    Pasta_cooked_enriched_without_added_salt("Pasta, cooked, enriched, without added salt", 100.0, 0.0, 0.0, 12.2052, 5.8, 0.93, 30.86, 158.0, 0.0, 62.13, 1.8, 7.0, 1.28, 18.0, 58.0, 44.0, 1.0, 0.51, 0.1, 7.0, 0.32, 26.4, 0.0, 0.06, 0.0, 0.0, 0.27, 0.13, 1.68, 0.11, 0.04, 0.0, 6.4, 0.0, 119.0, 0.0, 0.17, 0.0, 0.0, 0.13, 0.32, 0.0, 0.02),
    //20330
    Hominy_canned_yellow("Hominy, canned, yellow", 100.0, 0.0, 0.0, 4.704, 1.48, 0.88, 14.26, 72.0, 0.0, 82.53, 2.5, 10.0, 0.62, 16.0, 35.0, 9.0, 345.0, 1.05, 0.03, 0.0, 0.07, 3.0, 0.0, 0.0, 0.0, 0.0, 0.003, 0.006, 0.03, 0.15, 0.005, 0.0, 0.0, 0.0, 1.0, 0.0, 0.12, 0.0, 0.0, 0.23, 0.39, 0.0, 0.0),
    //25024
    Pretzels_soft_unsalted("Pretzels, soft, unsalted", 100.0, 0.0, 0.0, 57.5522, 8.2, 3.1, 71.04, 345.0, 0.0, 15.0, 1.7, 23.0, 3.92, 21.0, 79.0, 88.0, 252.0, 0.94, 0.12, 0.0, 0.0, 17.2, 0.0, 0.54, 0.0, 0.0, 0.41, 0.29, 4.27, 0.0, 0.02, 0.0, 17.7, 2.7, 24.0, 0.0, 0.69, 0.0, 0.0, 1.07, 0.94, 0.0, 0.0),
    //31001
    CAMPBELL_S_Tomato_juice("CAMPBELL'S, Tomato juice", 100.0, 0.0, 0.0, 1.2616, 0.82, 0.0, 4.12, 21.0, 0.0, 93.9, 0.8, 8.0, 0.15, 0.0, 0.0, 177.0, 280.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 29.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //43364
    Snacks_tortilla_chips_unsalted_white_corn("Snacks, tortilla chips, unsalted, white corn", 100.0, 0.0, 0.0, 37.812599999999996, 7.79, 23.36, 65.32, 503.0, 0.0, 2.09, 5.3, 174.0, 2.32, 146.0, 200.0, 215.0, 15.0, 2.46, 0.52, 0.0, 0.0, 6.7, 4.0, 3.53, 0.0, 0.0, 0.01, 0.1, 1.26, 1.18, 0.21, 0.36, 18.1, 0.7, 10.0, 0.0, 2.45, 0.0, 0.0, 9.52, 9.95, 0.0, 0.0),
    //43566
    Snacks_tortilla_chips_light_baked_with_less_oil_("Snacks, tortilla chips, light (baked with less oil)", 100.0, 0.0, 0.0, 42.651, 8.7, 15.2, 73.4, 465.0, 0.0, 1.3, 5.7, 159.0, 1.63, 97.0, 318.0, 272.0, 564.0, 1.15, 0.11, 0.0, 0.0, 15.7, 4.0, 3.53, 0.0, 0.2, 0.22, 0.28, 0.42, 0.0, 0.18, 0.06, 23.4, 0.7, 16.0, 0.0, 2.83, 0.0, 0.0, 6.34, 5.02, 0.0, 0.0);

    private final String Name;
    private final Double Weight;
    private final Double CompleteProtein;
    private final Double Cost;
    private final Double GlycemicLoad;
    private final Double Protein;
    private final Double Fat;
    private final Double CarbsByDiff;
    private final Double EnergyGross;
    private final Double Alcohol;
    private final Double Water;
    private final Double Fiber;
    private final Double Calcium;
    private final Double Iron;
    private final Double Magnesium;
    private final Double Phosphorus;
    private final Double Potassium;
    private final Double Sodium;
    private final Double Zinc;
    private final Double Copper;
    private final Double Fluoride;
    private final Double Manganese;
    private final Double Selenium;
    private final Double VitaminA;
    private final Double VitaminE;
    private final Double VitaminD;
    private final Double VitaminC;
    private final Double Thiamin;
    private final Double Riboflavin;
    private final Double Niacin;
    private final Double Pantothenic;
    private final Double VitaminB6;
    private final Double VitaminB12;
    private final Double Choline;
    private final Double VitaminK;
    private final Double Folate;
    private final Double Cholesterol;
    private final Double Saturated;
    private final Double DHA;
    private final Double EPA;
    private final Double Monounsaturated;
    private final Double Polyunsaturated;
    private final Double Linoleic;
    private final Double AlphaLinolenic;

    Glycemic_index_test_set(
            String Name,
            Double Weight,
            Double CompleteProtein,
            Double Cost,
            Double GlycemicLoad,
            Double Protein,
            Double Fat,
            Double CarbsByDiff,
            Double EnergyGross,
            Double Alcohol,
            Double Water,
            Double Fiber,
            Double Calcium,
            Double Iron,
            Double Magnesium,
            Double Phosphorus,
            Double Potassium,
            Double Sodium,
            Double Zinc,
            Double Copper,
            Double Fluoride,
            Double Manganese,
            Double Selenium,
            Double VitaminA,
            Double VitaminE,
            Double VitaminD,
            Double VitaminC,
            Double Thiamin,
            Double Riboflavin,
            Double Niacin,
            Double Pantothenic,
            Double VitaminB6,
            Double VitaminB12,
            Double Choline,
            Double VitaminK,
            Double Folate,
            Double Cholesterol,
            Double Saturated,
            Double DHA,
            Double EPA,
            Double Monounsaturated,
            Double Polyunsaturated,
            Double Linoleic,
            Double AlphaLinolenic
    ) {
        this.Name = Name;
        this.Weight = Weight;
        this.CompleteProtein = CompleteProtein;
        this.Cost = Cost;
        this.GlycemicLoad = GlycemicLoad;
        this.Protein = Protein;
        this.Fat = Fat;
        this.CarbsByDiff = CarbsByDiff;
        this.EnergyGross = EnergyGross;
        this.Alcohol = Alcohol;
        this.Water = Water;
        this.Fiber = Fiber;
        this.Calcium = Calcium;
        this.Iron = Iron;
        this.Magnesium = Magnesium;
        this.Phosphorus = Phosphorus;
        this.Potassium = Potassium;
        this.Sodium = Sodium;
        this.Zinc = Zinc;
        this.Copper = Copper;
        this.Fluoride = Fluoride;
        this.Manganese = Manganese;
        this.Selenium = Selenium;
        this.VitaminA = VitaminA;
        this.VitaminE = VitaminE;
        this.VitaminD = VitaminD;
        this.VitaminC = VitaminC;
        this.Thiamin = Thiamin;
        this.Riboflavin = Riboflavin;
        this.Niacin = Niacin;
        this.Pantothenic = Pantothenic;
        this.VitaminB6 = VitaminB6;
        this.VitaminB12 = VitaminB12;
        this.Choline = Choline;
        this.VitaminK = VitaminK;
        this.Folate = Folate;
        this.Cholesterol = Cholesterol;
        this.Saturated = Saturated;
        this.DHA = DHA;
        this.EPA = EPA;
        this.Monounsaturated = Monounsaturated;
        this.Polyunsaturated = Polyunsaturated;
        this.Linoleic = Linoleic;
        this.AlphaLinolenic = AlphaLinolenic;
    }

    @Override
    public String get_food_label() {
        return this.name();
    }

    @Override
    public String get_food_name() {
        return Name;
    }

    @Override
    public Double get_weight() {
        return Weight;
    }

    public Double get_weight_coefficient() {
        return Weight / Weight;
    }

    @Override
    public Double get_complete_protein() {
        return CompleteProtein;
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return CompleteProtein / Weight;
    }

    @Override
    public Double get_digestible_carbohydrate() {
        return CarbsByDiff - Fiber;
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return get_digestible_carbohydrate() / Weight;
    }

    @Override
    public Double get_cost() {
        return Cost;
    }

    @Override
    public Double get_cost_coefficient() {
        return Cost / Weight;
    }

    @Override
    public Double get_glycemic_load() {
        return GlycemicLoad;
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return GlycemicLoad / Weight;
    }

    @Override
    public Double get_energy_digestible() {
        return get_energy_protein() + get_energy_fat() + get_energy_digestible_carbohydrate() + get_energy_alcohol();
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return get_energy_digestible() / Weight;
    }

    public Double get_energy_no_protein() {
        return get_energy_fat() + get_energy_digestible_carbohydrate() + get_energy_alcohol();
    }

    public Double get_energy_no_protein_coefficient() {
        return get_energy_no_protein() / Weight;
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return get_digestible_carbohydrate() * 4;
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return get_energy_digestible_carbohydrate() / Weight;
    }

    @Override
    public Double get_energy_protein() {
        return Protein * 4;
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return get_energy_protein() / Weight;
    }

    @Override
    public Double get_energy_fat() {
        return Fat * 9;
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return get_energy_fat() / Weight;
    }

    @Override
    public Double get_energy_alcohol() {
        return Alcohol * 7;
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return get_energy_alcohol() / Weight;
    }

    @Override
    public Double get_protein() {
        return Protein;
    }

    @Override
    public Double get_protein_coefficient() {
        return Protein / Weight;
    }

    @Override
    public Double get_fat() {
        return Fat;
    }

    @Override
    public Double get_fat_coefficient() {
        return Fat / Weight;
    }

    @Override
    public Double get_carbohydrate_by_difference() {
        return CarbsByDiff;
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return CarbsByDiff / Weight;
    }

    @Override
    public Double get_energy_gross() {
        return EnergyGross;
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return EnergyGross / Weight;
    }

    @Override
    public Double get_alcohol() {
        return Alcohol;
    }

    @Override
    public Double get_alcohol_coefficient() {
        return Alcohol / Weight;
    }

    @Override
    public Double get_water() {
        return Water;
    }

    @Override
    public Double get_water_coefficient() {
        return Water / Weight;
    }

    @Override
    public Double get_fiber() {
        return Fiber;
    }

    @Override
    public Double get_fiber_coefficient() {
        return Fiber / Weight;
    }

    @Override
    public Double get_calcium() {
        return Calcium;
    }

    @Override
    public Double get_calcium_coefficient() {
        return Calcium / Weight;
    }

    @Override
    public Double get_iron() {
        return Iron;
    }

    @Override
    public Double get_iron_coefficient() {
        return Iron / Weight;
    }

    @Override
    public Double get_magnesium() {
        return Magnesium;
    }

    @Override
    public Double get_magnesium_coefficient() {
        return Magnesium / Weight;
    }

    @Override
    public Double get_phosphorus() {
        return Phosphorus;
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return Phosphorus / Weight;
    }

    @Override
    public Double get_potassium() {
        return Potassium;
    }

    @Override
    public Double get_potassium_coefficient() {
        return Potassium / Weight;
    }

    @Override
    public Double get_sodium() {
        return Sodium;
    }

    @Override
    public Double get_sodium_coefficient() {
        return Sodium / Weight;
    }

    @Override
    public Double get_zinc() {
        return Zinc;
    }

    @Override
    public Double get_zinc_coefficient() {
        return Zinc / Weight;
    }

    @Override
    public Double get_copper() {
        return Copper;
    }

    @Override
    public Double get_copper_coefficient() {
        return Copper / Weight;
    }

    @Override
    public Double get_fluoride() {
        return Fluoride;
    }

    @Override
    public Double get_fluoride_coefficient() {
        return Fluoride / Weight;
    }

    @Override
    public Double get_manganese() {
        return Manganese;
    }

    @Override
    public Double get_manganese_coefficient() {
        return Manganese / Weight;
    }

    @Override
    public Double get_selenium() {
        return Selenium;
    }

    @Override
    public Double get_selenium_coefficient() {
        return Selenium / Weight;
    }

    @Override
    public Double get_vitamin_a() {
        return VitaminA;
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return VitaminA / Weight;
    }

    @Override
    public Double get_vitamin_e() {
        return VitaminE;
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return VitaminE / Weight;
    }

    @Override
    public Double get_vitamin_d() {
        return VitaminD;
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return VitaminD / Weight;
    }

    @Override
    public Double get_vitamin_c() {
        return VitaminC;
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return VitaminC / Weight;
    }

    @Override
    public Double get_thiamin() {
        return Thiamin;
    }

    @Override
    public Double get_thiamin_coefficient() {
        return Thiamin / Weight;
    }

    @Override
    public Double get_riboflavin() {
        return Riboflavin;
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return Riboflavin / Weight;
    }

    @Override
    public Double get_niacin() {
        return Niacin;
    }

    @Override
    public Double get_niacin_coefficient() {
        return Niacin / Weight;
    }

    @Override
    public Double get_pantothenic_acid() {
        return Pantothenic;
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return Pantothenic / Weight;
    }

    @Override
    public Double get_vitamin_b6() {
        return VitaminB6;
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return VitaminB6 / Weight;
    }

    @Override
    public Double get_vitamin_b12() {
        return VitaminB12;
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return VitaminB12 / Weight;
    }

    @Override
    public Double get_choline() {
        return Choline;
    }

    @Override
    public Double get_choline_coefficient() {
        return Choline / Weight;
    }

    @Override
    public Double get_vitamin_k() {
        return VitaminK;
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return VitaminK / Weight;
    }

    @Override
    public Double get_folate() {
        return Folate;
    }

    @Override
    public Double get_folate_coefficient() {
        return Folate / Weight;
    }

    @Override
    public Double get_cholesterol() {
        return Cholesterol;
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return Cholesterol / Weight;
    }

    @Override
    public Double get_saturated_fat() {
        return Saturated;
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return Saturated / Weight;
    }

    @Override
    public Double get_dha() {
        return DHA;
    }

    @Override
    public Double get_dha_coefficient() {
        return DHA / Weight;
    }

    @Override
    public Double get_epa() {
        return EPA;
    }

    @Override
    public Double get_epa_coefficient() {
        return EPA / Weight;
    }

    @Override
    public Double get_monounsaturated_fat() {
        return Monounsaturated;
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return Monounsaturated / Weight;
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return Polyunsaturated;
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return Polyunsaturated / Weight;
    }

    @Override
    public Double get_linoleic_acid() {
        return Linoleic;
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return Linoleic / Weight;
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return AlphaLinolenic;
    }

    @Override
    public Double get_alpha_linolenic_acid_coefficient() {
        return AlphaLinolenic / Weight;
    }

    public static String get_category_name() {
        return "Glycemic index test set";
    }

    @Override
    public String toString() {
        return get_food_name();
    }

    @Override
    public Double get_protein_atwater_factor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_carbohydrate_by_difference_atwater_factor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_fat_atwater_factor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_alcohol_atwater_factor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_glycemic_index() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
