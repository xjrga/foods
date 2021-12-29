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
public enum Fruits_and_fruit_juices implements Interface_food {

    Apples_raw_with_skin("Apples, raw, with skin", 100.0, 0.0, 0.0, 38.0, 0.26, 0.17, 13.81, 52.0, 0.0, 85.56, 2.4, 6.0, 0.12, 5.0, 11.0, 107.0, 1.0, 0.04, 0.02, 3.3, 0.03, 0.0, 3.0, 0.18, 0.0, 4.6, 0.01, 0.02, 0.09, 0.06, 0.04, 0.0, 3.4, 2.2, 3.0, 0.0, 0.02, 0.0, 0.0, 0.007, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Apricots_raw("Apricots, raw", 100.0, 0.0, 0.0, 57.0, 1.4, 0.39, 11.12, 48.0, 0.0, 86.35, 2.0, 13.0, 0.39, 10.0, 23.0, 259.0, 1.0, 0.2, 0.07, 0.0, 0.07, 0.1, 96.0, 0.89, 0.0, 10.0, 0.03, 0.04, 0.6, 0.24, 0.05, 0.0, 2.8, 3.3, 9.0, 0.0, 0.02, 0.0, 0.0, 0.17, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Avocados_raw_all_commercial_varieties("Avocados, raw, all commercial varieties", 100.0, 0.0, 0.0, 0.0, 2.0, 14.66, 8.53, 160.0, 0.0, 73.23, 6.7, 12.0, 0.55, 29.0, 52.0, 485.0, 7.0, 0.64, 0.19, 7.0, 0.14, 0.4, 7.0, 2.07, 0.0, 10.0, 0.06, 0.13, 1.73, 1.38, 0.25, 0.0, 14.2, 21.0, 81.0, 0.0, 2.12, 0.0, 0.0, 9.79, 1.81, 0.0, 0.11, 4.0, 4.0, 9.0, 6.93),
    Bananas_raw("Bananas, raw", 100.0, 0.0, 0.0, 52.0, 1.09, 0.33, 22.84, 89.0, 0.0, 74.91, 2.6, 5.0, 0.26, 27.0, 22.0, 358.0, 1.0, 0.15, 0.07, 2.2, 0.27, 1.0, 3.0, 0.1, 0.0, 8.7, 0.03, 0.07, 0.66, 0.33, 0.36, 0.0, 9.8, 0.5, 20.0, 0.0, 0.11, 0.0, 0.0, 0.03, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Blackberries_raw("Blackberries, raw", 100.0, 0.0, 0.0, 0.0, 1.39, 0.49, 9.61, 43.0, 0.0, 88.15, 5.3, 29.0, 0.62, 20.0, 22.0, 162.0, 1.0, 0.53, 0.16, 0.0, 0.64, 0.4, 11.0, 1.17, 0.0, 21.0, 0.02, 0.02, 0.64, 0.27, 0.03, 0.0, 8.5, 19.8, 25.0, 0.0, 0.01, 0.0, 0.0, 0.04, 0.28, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Blackberries_frozen_unsweetened("Blackberries, frozen, unsweetened", 100.0, 0.0, 0.0, 0.0, 1.18, 0.43, 15.67, 64.0, 0.0, 82.21, 5.0, 29.0, 0.8, 22.0, 30.0, 140.0, 1.0, 0.25, 0.12, 0.0, 1.22, 0.4, 6.0, 1.17, 0.0, 3.1, 0.02, 0.04, 1.2, 0.15, 0.06, 0.0, 8.5, 19.8, 34.0, 0.0, 0.01, 0.0, 0.0, 0.04, 0.24, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Blueberries_raw("Blueberries, raw", 100.0, 0.0, 0.0, 0.0, 0.74, 0.33, 14.49, 57.0, 0.0, 84.21, 2.4, 6.0, 0.28, 6.0, 12.0, 77.0, 1.0, 0.16, 0.05, 0.0, 0.33, 0.1, 3.0, 0.57, 0.0, 9.7, 0.03, 0.04, 0.41, 0.12, 0.05, 0.0, 6.0, 19.3, 6.0, 0.0, 0.02, 0.0, 0.0, 0.04, 0.14, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Blueberries_frozen_unsweetened("Blueberries, frozen, unsweetened", 100.0, 0.0, 0.0, 0.0, 0.42, 0.64, 12.17, 51.0, 0.0, 86.59, 2.7, 8.0, 0.18, 5.0, 11.0, 54.0, 1.0, 0.07, 0.03, 0.0, 0.14, 0.1, 2.0, 0.48, 0.0, 2.5, 0.03, 0.03, 0.52, 0.12, 0.05, 0.0, 5.1, 16.4, 7.0, 0.0, 0.05, 0.0, 0.0, 0.09, 0.27, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Cherries_sweet_raw("Cherries, sweet, raw", 100.0, 0.0, 0.0, 0.0, 1.06, 0.2, 16.01, 63.0, 0.0, 82.25, 2.1, 13.0, 0.36, 11.0, 21.0, 222.0, 0.0, 0.07, 0.06, 2.0, 0.07, 0.0, 3.0, 0.07, 0.0, 7.0, 0.02, 0.03, 0.15, 0.19, 0.04, 0.0, 6.1, 2.1, 4.0, 0.0, 0.03, 0.0, 0.0, 0.04, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Figs_raw("Figs, raw", 100.0, 0.0, 0.0, 0.0, 0.75, 0.3, 19.18, 74.0, 0.0, 79.11, 2.9, 35.0, 0.37, 17.0, 14.0, 232.0, 1.0, 0.15, 0.07, 0.0, 0.12, 0.2, 7.0, 0.11, 0.0, 2.0, 0.06, 0.05, 0.4, 0.3, 0.11, 0.0, 4.7, 4.7, 6.0, 0.0, 0.06, 0.0, 0.0, 0.06, 0.14, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Figs_dried_uncooked("Figs, dried, uncooked", 100.0, 0.0, 0.0, 0.0, 3.3, 0.93, 63.87, 249.0, 0.0, 30.05, 9.8, 162.0, 2.03, 68.0, 67.0, 680.0, 10.0, 0.55, 0.28, 0.0, 0.51, 0.6, 0.0, 0.35, 0.0, 1.2, 0.08, 0.08, 0.61, 0.43, 0.1, 0.0, 15.8, 15.6, 9.0, 0.0, 0.14, 0.0, 0.0, 0.15, 0.34, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Figs_dried_stewed("Figs, dried, stewed", 100.0, 0.0, 0.0, 0.0, 1.42, 0.4, 27.57, 107.0, 0.0, 69.8, 4.2, 70.0, 0.88, 29.0, 29.0, 294.0, 4.0, 0.24, 0.12, 0.0, 0.22, 0.2, 0.0, 0.15, 0.0, 4.4, 0.01, 0.11, 0.64, 0.12, 0.13, 0.0, 6.8, 6.7, 1.0, 0.0, 0.06, 0.0, 0.0, 0.06, 0.14, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Grapefruit_raw_pink_and_red_and_white_all_areas("Grapefruit, raw, pink and red and white, all areas", 100.0, 0.0, 0.0, 25.0, 0.63, 0.1, 8.08, 32.0, 0.0, 90.89, 1.1, 12.0, 0.09, 8.0, 8.0, 139.0, 0.0, 0.07, 0.04, 1.0, 0.01, 0.3, 46.0, 0.13, 0.0, 34.4, 0.03, 0.02, 0.25, 0.28, 0.04, 0.0, 7.7, 0.0, 10.0, 0.0, 0.01, 0.0, 0.0, 0.01, 0.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Grapes_muscadine_raw("Grapes, muscadine, raw", 100.0, 0.0, 0.0, 0.0, 0.81, 0.47, 13.93, 57.0, 0.0, 84.29, 3.9, 37.0, 0.26, 14.0, 24.0, 203.0, 1.0, 0.11, 0.11, 0.0, 1.97, 0.0, 3.0, 0.0, 0.0, 6.5, 0.0, 1.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Grapes_american_type_slip_skin_raw("Grapes, american type (slip skin), raw", 100.0, 0.0, 0.0, 0.0, 0.63, 0.35, 17.15, 67.0, 0.0, 81.3, 0.9, 14.0, 0.29, 5.0, 10.0, 191.0, 2.0, 0.04, 0.04, 0.0, 0.71, 0.1, 5.0, 0.19, 0.0, 4.0, 0.09, 0.05, 0.3, 0.02, 0.11, 0.0, 5.6, 14.6, 4.0, 0.0, 0.11, 0.0, 0.0, 0.01, 0.1, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Grapes_red_or_green_european_type_such_as_thompson_seedless_raw("Grapes, red or green (European type, such as Thompson seedless), raw", 100.0, 0.0, 0.0, 46.0, 0.72, 0.16, 18.1, 69.0, 0.0, 80.54, 0.9, 10.0, 0.36, 7.0, 20.0, 191.0, 2.0, 0.07, 0.12, 7.8, 0.07, 0.1, 3.0, 0.19, 0.0, 3.2, 0.06, 0.07, 0.18, 0.05, 0.08, 0.0, 5.6, 14.6, 2.0, 0.0, 0.05, 0.0, 0.0, 0.007, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Guavas_common_raw("Guavas, common, raw", 100.0, 0.0, 0.0, 0.0, 2.55, 0.95, 14.32, 68.0, 0.0, 80.8, 5.4, 18.0, 0.26, 22.0, 40.0, 417.0, 2.0, 0.23, 0.23, 0.0, 0.15, 0.6, 31.0, 0.73, 0.0, 228.3, 0.06, 0.04, 1.08, 0.45, 0.11, 0.0, 7.6, 2.6, 49.0, 0.0, 0.27, 0.0, 0.0, 0.08, 0.4, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Guavas_strawberry_raw("Guavas, strawberry, raw", 100.0, 0.0, 0.0, 0.0, 0.58, 0.6, 17.36, 69.0, 0.0, 80.66, 5.4, 21.0, 0.22, 17.0, 27.0, 292.0, 37.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5.0, 0.0, 0.0, 37.0, 0.03, 0.03, 0.6, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.17, 0.0, 0.0, 0.05, 0.25, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Kiwifruit_green_raw("Kiwifruit, green, raw", 100.0, 0.0, 0.0, 0.0, 1.14, 0.52, 14.66, 61.0, 0.0, 83.07, 3.0, 34.0, 0.31, 17.0, 34.0, 312.0, 3.0, 0.14, 0.13, 0.0, 0.09, 0.2, 4.0, 1.46, 0.0, 92.7, 0.02, 0.02, 0.34, 0.18, 0.06, 0.0, 7.8, 40.3, 25.0, 0.0, 0.02, 0.0, 0.0, 0.04, 0.28, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Lemons_raw_without_peel("Lemons, raw, without peel", 100.0, 0.0, 0.0, 0.0, 1.1, 0.3, 9.32, 29.0, 0.0, 88.98, 2.8, 26.0, 0.6, 8.0, 16.0, 138.0, 2.0, 0.06, 0.03, 0.0, 0.03, 0.4, 1.0, 0.15, 0.0, 53.0, 0.04, 0.02, 0.1, 0.19, 0.08, 0.0, 5.1, 0.0, 11.0, 0.0, 0.03, 0.0, 0.0, 0.01, 0.08, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Lemon_juice_raw("Lemon juice, raw", 100.0, 0.0, 0.0, 0.0, 0.35, 0.24, 6.9, 22.0, 0.0, 92.31, 0.3, 6.0, 0.08, 6.0, 8.0, 103.0, 1.0, 0.05, 0.01, 0.0, 0.01, 0.1, 0.0, 0.15, 0.0, 38.7, 0.02, 0.01, 0.09, 0.13, 0.04, 0.0, 5.1, 0.0, 20.0, 0.0, 0.04, 0.0, 0.0, 0.006, 0.02, 0.01, 0.009, 4.0, 4.0, 9.0, 6.93),
    Limes_raw("Limes, raw", 100.0, 0.0, 0.0, 0.0, 0.7, 0.2, 10.54, 30.0, 0.0, 88.26, 2.8, 33.0, 0.6, 6.0, 18.0, 102.0, 2.0, 0.11, 0.06, 0.0, 0.008, 0.4, 2.0, 0.22, 0.0, 29.1, 0.03, 0.02, 0.2, 0.21, 0.04, 0.0, 5.1, 0.6, 8.0, 0.0, 0.02, 0.0, 0.0, 0.01, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Lime_juice_raw("Lime juice, raw", 100.0, 0.0, 0.0, 0.0, 0.42, 0.07, 8.42, 25.0, 0.0, 90.79, 0.4, 14.0, 0.09, 8.0, 14.0, 117.0, 2.0, 0.08, 0.02, 0.0, 0.01, 0.1, 2.0, 0.22, 0.0, 30.0, 0.02, 0.01, 0.14, 0.12, 0.03, 0.0, 5.1, 0.6, 10.0, 0.0, 0.008, 0.0, 0.0, 0.008, 0.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Mangos_raw("Mangos, raw", 100.0, 0.0, 0.0, 51.0, 0.82, 0.38, 14.98, 60.0, 0.0, 83.46, 1.6, 11.0, 0.16, 10.0, 14.0, 168.0, 1.0, 0.09, 0.11, 0.0, 0.06, 0.6, 54.0, 0.9, 0.0, 36.4, 0.02, 0.03, 0.66, 0.19, 0.11, 0.0, 7.6, 4.2, 43.0, 0.0, 0.09, 0.0, 0.0, 0.14, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Melons_cantaloupe_raw("Melons, cantaloupe, raw", 100.0, 0.0, 0.0, 67.0, 0.84, 0.19, 8.16, 34.0, 0.0, 90.15, 0.9, 9.0, 0.21, 12.0, 15.0, 267.0, 16.0, 0.18, 0.04, 1.0, 0.04, 0.4, 169.0, 0.05, 0.0, 36.7, 0.04, 0.01, 0.73, 0.1, 0.07, 0.0, 7.6, 2.5, 21.0, 0.0, 0.05, 0.0, 0.0, 0.003, 0.08, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Melons_honeydew_raw("Melons, honeydew, raw", 100.0, 0.0, 0.0, 0.0, 0.54, 0.14, 9.09, 36.0, 0.0, 89.82, 0.8, 6.0, 0.17, 10.0, 11.0, 228.0, 18.0, 0.09, 0.02, 0.0, 0.02, 0.7, 3.0, 0.02, 0.0, 18.0, 0.03, 0.01, 0.41, 0.15, 0.08, 0.0, 7.6, 2.9, 19.0, 0.0, 0.03, 0.0, 0.0, 0.003, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Nectarines_raw("Nectarines, raw", 100.0, 0.0, 0.0, 0.0, 1.06, 0.32, 10.55, 44.0, 0.0, 87.59, 1.7, 6.0, 0.28, 9.0, 26.0, 201.0, 0.0, 0.17, 0.08, 0.0, 0.05, 0.0, 17.0, 0.77, 0.0, 5.4, 0.03, 0.02, 1.12, 0.18, 0.02, 0.0, 6.2, 2.2, 5.0, 0.0, 0.02, 0.0, 0.0, 0.08, 0.11, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Olives_ripe_canned_small_extra_large("Olives, ripe, canned (small-extra large)", 100.0, 0.0, 0.0, 0.0, 0.84, 10.68, 6.26, 115.0, 0.0, 79.99, 3.2, 88.0, 3.3, 4.0, 3.0, 8.0, 735.0, 0.22, 0.25, 0.0, 0.02, 0.9, 20.0, 1.65, 0.0, 0.9, 0.003, 0.0, 0.03, 0.01, 0.009, 0.0, 10.3, 1.4, 0.0, 0.0, 1.41, 0.0, 0.0, 7.88, 0.91, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Olives_ripe_canned_jumbo_super_colossal("Olives, ripe, canned (jumbo-super colossal)", 100.0, 0.0, 0.0, 0.0, 0.97, 6.87, 5.61, 81.0, 0.0, 84.34, 2.5, 94.0, 3.32, 4.0, 3.0, 9.0, 735.0, 0.22, 0.22, 0.0, 0.02, 0.9, 17.0, 1.65, 0.0, 1.5, 0.003, 0.0, 0.02, 0.01, 0.01, 0.0, 6.6, 1.4, 0.0, 0.0, 0.9, 0.0, 0.0, 5.07, 0.58, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Oranges_raw_all_commercial_varieties("Oranges, raw, all commercial varieties", 100.0, 0.0, 0.0, 42.0, 0.94, 0.12, 11.75, 47.0, 0.0, 86.75, 2.4, 40.0, 0.1, 10.0, 14.0, 181.0, 0.0, 0.07, 0.04, 0.0, 0.02, 0.5, 11.0, 0.18, 0.0, 53.2, 0.08, 0.04, 0.28, 0.25, 0.06, 0.0, 8.4, 0.0, 30.0, 0.0, 0.01, 0.0, 0.0, 0.02, 0.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Orange_juice_raw("Orange juice, raw", 100.0, 0.0, 0.0, 53.0, 0.7, 0.2, 10.4, 45.0, 0.0, 88.3, 0.2, 11.0, 0.2, 11.0, 17.0, 200.0, 1.0, 0.05, 0.04, 0.0, 0.01, 0.1, 10.0, 0.04, 0.0, 50.0, 0.09, 0.03, 0.4, 0.19, 0.04, 0.0, 6.2, 0.1, 30.0, 0.0, 0.02, 0.0, 0.0, 0.03, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Tangerines_mandarin_oranges_raw("Tangerines, (mandarin oranges), raw", 100.0, 0.0, 0.0, 0.0, 0.81, 0.31, 13.34, 53.0, 0.0, 85.17, 1.8, 37.0, 0.15, 12.0, 20.0, 166.0, 2.0, 0.07, 0.04, 0.0, 0.03, 0.1, 34.0, 0.2, 0.0, 26.7, 0.05, 0.03, 0.37, 0.21, 0.07, 0.0, 10.2, 0.0, 16.0, 0.0, 0.03, 0.0, 0.0, 0.06, 0.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Papayas_raw("Papayas, raw", 100.0, 0.0, 0.0, 56.0, 0.47, 0.26, 10.82, 43.0, 0.0, 88.06, 1.7, 20.0, 0.25, 21.0, 10.0, 182.0, 8.0, 0.08, 0.04, 0.0, 0.04, 0.6, 47.0, 0.3, 0.0, 60.9, 0.02, 0.02, 0.35, 0.19, 0.03, 0.0, 6.1, 2.6, 37.0, 0.0, 0.08, 0.0, 0.0, 0.07, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Peaches_yellow_raw("Peaches, yellow, raw", 100.0, 0.0, 0.0, 38.0, 0.91, 0.25, 9.54, 39.0, 0.0, 88.87, 1.5, 6.0, 0.25, 9.0, 20.0, 190.0, 0.0, 0.17, 0.06, 4.0, 0.06, 0.1, 16.0, 0.73, 0.0, 6.6, 0.02, 0.03, 0.8, 0.15, 0.02, 0.0, 6.1, 2.6, 4.0, 0.0, 0.01, 0.0, 0.0, 0.06, 0.08, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pears_raw("Pears, raw", 100.0, 0.0, 0.0, 38.0, 0.36, 0.14, 15.23, 57.0, 0.0, 83.96, 3.1, 9.0, 0.18, 7.0, 12.0, 116.0, 1.0, 0.1, 0.08, 2.2, 0.04, 0.1, 1.0, 0.12, 0.0, 4.3, 0.01, 0.02, 0.16, 0.04, 0.02, 0.0, 5.1, 4.4, 7.0, 0.0, 0.02, 0.0, 0.0, 0.08, 0.09, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pineapple_raw_all_varieties("Pineapple, raw, all varieties", 100.0, 0.0, 0.0, 59.0, 0.54, 0.12, 13.12, 50.0, 0.0, 86.0, 1.4, 13.0, 0.29, 12.0, 8.0, 109.0, 1.0, 0.12, 0.11, 0.0, 0.92, 0.1, 3.0, 0.02, 0.0, 47.8, 0.07, 0.03, 0.5, 0.21, 0.11, 0.0, 5.5, 0.7, 18.0, 0.0, 0.009, 0.0, 0.0, 0.01, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Plums_raw("Plums, raw", 100.0, 0.0, 0.0, 39.0, 0.7, 0.28, 11.42, 46.0, 0.0, 87.23, 1.4, 6.0, 0.17, 7.0, 16.0, 157.0, 0.0, 0.1, 0.05, 2.0, 0.05, 0.0, 17.0, 0.26, 0.0, 9.5, 0.02, 0.02, 0.41, 0.13, 0.02, 0.0, 1.9, 6.4, 5.0, 0.0, 0.01, 0.0, 0.0, 0.13, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pomegranates_raw("Pomegranates, raw", 100.0, 0.0, 0.0, 0.0, 1.67, 1.17, 18.7, 83.0, 0.0, 77.93, 4.0, 10.0, 0.3, 12.0, 36.0, 236.0, 3.0, 0.35, 0.15, 0.0, 0.11, 0.5, 0.0, 0.6, 0.0, 10.2, 0.06, 0.05, 0.29, 0.37, 0.07, 0.0, 7.6, 16.4, 38.0, 0.0, 0.12, 0.0, 0.0, 0.09, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Prickly_pears_raw("Prickly pears, raw", 100.0, 0.0, 0.0, 7.0, 0.73, 0.51, 9.57, 41.0, 0.0, 87.55, 3.6, 56.0, 0.3, 85.0, 24.0, 220.0, 5.0, 0.12, 0.08, 0.0, 0.0, 0.6, 2.0, 0.0, 0.0, 14.0, 0.01, 0.06, 0.46, 0.0, 0.06, 0.0, 0.0, 0.0, 6.0, 0.0, 0.06, 0.0, 0.0, 0.07, 0.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Prune_juice_canned("Prune juice, canned", 100.0, 0.0, 0.0, 0.0, 0.61, 0.03, 17.45, 71.0, 0.0, 81.24, 1.0, 12.0, 1.18, 14.0, 25.0, 276.0, 4.0, 0.21, 0.06, 60.2, 0.15, 0.6, 0.0, 0.12, 0.0, 4.1, 0.01, 0.07, 0.78, 0.1, 0.21, 0.0, 2.7, 3.4, 0.0, 0.0, 0.003, 0.0, 0.0, 0.02, 0.007, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Raisins_golden_seedless("Raisins, golden seedless", 100.0, 0.0, 0.0, 0.0, 3.39, 0.46, 79.52, 302.0, 0.0, 14.97, 4.0, 53.0, 1.79, 35.0, 115.0, 746.0, 12.0, 0.32, 0.36, 0.0, 0.3, 0.7, 0.0, 0.12, 0.0, 3.2, 0.008, 0.19, 1.14, 0.14, 0.32, 0.0, 11.1, 3.5, 3.0, 0.0, 0.15, 0.0, 0.0, 0.01, 0.13, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Raisins_seedless("Raisins, seedless", 100.0, 0.0, 0.0, 64.0, 3.07, 0.46, 79.18, 299.0, 0.0, 15.43, 3.7, 50.0, 1.88, 32.0, 101.0, 749.0, 11.0, 0.22, 0.31, 233.9, 0.29, 0.6, 0.0, 0.12, 0.0, 2.3, 0.1, 0.12, 0.76, 0.09, 0.17, 0.0, 11.1, 3.5, 5.0, 0.0, 0.05, 0.0, 0.0, 0.05, 0.03, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Raspberries_raw("Raspberries, raw", 100.0, 0.0, 0.0, 0.0, 1.2, 0.65, 11.94, 52.0, 0.0, 85.75, 6.5, 25.0, 0.69, 22.0, 29.0, 151.0, 1.0, 0.42, 0.09, 0.0, 0.67, 0.2, 2.0, 0.87, 0.0, 26.2, 0.03, 0.03, 0.59, 0.32, 0.05, 0.0, 12.3, 7.8, 21.0, 0.0, 0.01, 0.0, 0.0, 0.06, 0.37, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Strawberries_raw("Strawberries, raw", 100.0, 0.0, 0.0, 0.0, 0.67, 0.3, 7.68, 32.0, 0.0, 90.95, 2.0, 16.0, 0.41, 13.0, 24.0, 153.0, 1.0, 0.14, 0.04, 4.4, 0.38, 0.4, 1.0, 0.29, 0.0, 58.8, 0.02, 0.02, 0.38, 0.12, 0.04, 0.0, 5.7, 2.2, 24.0, 0.0, 0.01, 0.0, 0.0, 0.04, 0.15, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Strawberries_frozen_unsweetened("Strawberries, frozen, unsweetened", 100.0, 0.0, 0.0, 0.0, 0.43, 0.11, 9.13, 35.0, 0.0, 89.97, 2.1, 16.0, 0.75, 11.0, 13.0, 148.0, 2.0, 0.13, 0.04, 0.0, 0.29, 0.7, 2.0, 0.29, 0.0, 41.2, 0.02, 0.03, 0.46, 0.1, 0.02, 0.0, 5.7, 2.2, 17.0, 0.0, 0.006, 0.0, 0.0, 0.01, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Tamarinds_raw("Tamarinds, raw", 100.0, 0.0, 0.0, 0.0, 2.8, 0.6, 62.5, 239.0, 0.0, 31.4, 5.1, 74.0, 2.8, 92.0, 113.0, 628.0, 28.0, 0.1, 0.08, 0.0, 0.0, 1.3, 2.0, 0.1, 0.0, 3.5, 0.42, 0.15, 1.93, 0.14, 0.06, 0.0, 8.6, 2.8, 14.0, 0.0, 0.27, 0.0, 0.0, 0.18, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Watermelon_raw("Watermelon, raw", 100.0, 0.0, 0.0, 0.0, 0.61, 0.15, 7.55, 30.0, 0.0, 91.45, 0.4, 7.0, 0.24, 10.0, 11.0, 112.0, 1.0, 0.1, 0.04, 1.5, 0.03, 0.4, 28.0, 0.05, 0.0, 8.1, 0.03, 0.02, 0.17, 0.22, 0.04, 0.0, 4.1, 0.1, 3.0, 0.0, 0.01, 0.0, 0.0, 0.03, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pears_asian_raw("Pears, asian, raw", 100.0, 0.0, 0.0, 0.0, 0.5, 0.23, 10.65, 42.0, 0.0, 88.25, 3.6, 4.0, 0.0, 8.0, 11.0, 121.0, 0.0, 0.02, 0.05, 0.0, 0.06, 0.1, 0.0, 0.12, 0.0, 3.8, 0.009, 0.01, 0.21, 0.07, 0.02, 0.0, 5.1, 4.5, 8.0, 0.0, 0.01, 0.0, 0.0, 0.04, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Fruit_cocktail_canned_heavy_syrup_drained("Fruit cocktail, canned, heavy syrup, drained", 100.0, 0.0, 0.0, 0.0, 0.47, 0.1, 18.8, 70.0, 0.0, 80.4, 1.7, 7.0, 0.29, 5.0, 12.0, 90.0, 6.0, 0.08, 0.08, 0.0, 0.0, 0.5, 14.0, 0.6, 0.0, 1.9, 0.01, 0.02, 0.37, 0.0, 0.05, 0.0, 2.4, 3.9, 3.0, 0.0, 0.01, 0.0, 0.0, 0.01, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Apricots_canned_heavy_syrup_drained("Apricots, canned, heavy syrup, drained", 100.0, 0.0, 0.0, 0.0, 0.64, 0.11, 21.31, 83.0, 0.0, 77.56, 2.7, 10.0, 0.3, 7.0, 13.0, 143.0, 4.0, 0.11, 0.09, 0.0, 0.0, 0.1, 146.0, 0.89, 0.0, 3.1, 0.02, 0.02, 0.37, 0.0, 0.05, 0.0, 2.8, 3.3, 2.0, 0.0, 0.007, 0.0, 0.0, 0.04, 0.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Cherries_sweet_canned_pitted_heavy_syrup_drained("Cherries, sweet, canned, pitted, heavy syrup, drained", 100.0, 0.0, 0.0, 0.0, 0.73, 0.21, 21.07, 83.0, 0.0, 77.61, 2.3, 10.0, 0.35, 9.0, 20.0, 148.0, 3.0, 0.1, 0.17, 0.0, 0.04, 0.0, 12.0, 0.17, 0.0, 3.6, 0.02, 0.04, 0.39, 0.06, 0.02, 0.0, 2.7, 0.9, 5.0, 0.0, 0.04, 0.0, 0.0, 0.04, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Applesauce_canned_unsweetened_with_added_ascorbic_acid("Applesauce, canned, unsweetened, with added ascorbic acid", 100.0, 0.0, 0.0, 0.0, 0.17, 0.1, 11.27, 42.0, 0.0, 88.22, 1.1, 4.0, 0.23, 3.0, 5.0, 74.0, 2.0, 0.03, 0.02, 0.0, 0.02, 0.3, 1.0, 0.16, 0.0, 21.2, 0.02, 0.03, 0.08, 0.04, 0.02, 0.0, 2.2, 0.5, 3.0, 0.0, 0.008, 0.0, 0.0, 0.002, 0.01, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Grapefruit_juice_pink_raw("Grapefruit juice, pink, raw", 100.0, 0.0, 0.0, 0.0, 0.5, 0.1, 9.2, 39.0, 0.0, 90.0, 0.0, 9.0, 0.2, 12.0, 15.0, 162.0, 1.0, 0.05, 0.03, 0.0, 0.02, 0.0, 22.0, 0.0, 0.0, 38.0, 0.04, 0.02, 0.2, 0.18, 0.04, 0.0, 0.0, 0.0, 10.0, 0.0, 0.01, 0.0, 0.0, 0.01, 0.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Prune_puree("Prune puree", 100.0, 0.0, 0.0, 0.0, 2.1, 0.2, 65.1, 257.0, 0.0, 30.0, 3.3, 31.0, 2.8, 0.0, 72.0, 852.0, 23.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 4.3, 0.04, 0.0, 2.5, 0.43, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Usda_commodity_peaches_canned_light_syrup_drained("USDA Commodity peaches, canned, light syrup, drained", 100.0, 0.0, 0.0, 57.0, 0.56, 0.15, 15.65, 61.0, 0.0, 83.43, 0.7, 3.0, 0.25, 5.0, 10.0, 87.0, 7.0, 0.16, 0.03, 0.0, 0.03, 0.0, 25.0, 1.23, 0.0, 2.5, 0.02, 0.02, 0.58, 0.04, 0.01, 0.0, 0.0, 2.8, 8.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Usda_commodity_pears_canned_light_syrup_drained("USDA Commodity pears, canned, light syrup, drained", 100.0, 0.0, 0.0, 0.0, 0.28, 0.15, 16.21, 62.0, 0.0, 83.16, 1.6, 5.0, 0.28, 4.0, 7.0, 61.0, 5.0, 0.09, 0.03, 0.0, 0.03, 0.0, 0.0, 0.11, 0.0, 0.9, 0.02, 0.01, 0.11, 0.04, 0.01, 0.0, 0.0, 0.3, 3.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pomegranate_juice_bottled("Pomegranate juice, bottled", 100.0, 0.0, 0.0, 0.0, 0.15, 0.29, 13.13, 54.0, 0.0, 85.95, 0.1, 11.0, 0.1, 7.0, 11.0, 214.0, 9.0, 0.09, 0.02, 0.0, 0.09, 0.3, 0.0, 0.38, 0.0, 0.1, 0.01, 0.01, 0.23, 0.28, 0.04, 0.0, 4.8, 10.4, 24.0, 0.0, 0.07, 0.0, 0.0, 0.05, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),;

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

    Fruits_and_fruit_juices(
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
        return "Fruits and Fruit Juices";
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
