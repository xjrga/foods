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
public enum Cereal_grains_and_pasta implements Interface_food {

    Amaranth_grain_uncooked("Amaranth grain, uncooked", 100.0, 0.0, 0.0, 0.0, 13.56, 7.02, 65.25, 371.0, 0.0, 11.29, 6.7, 159.0, 7.61, 248.0, 557.0, 508.0, 4.0, 2.87, 0.52, 0.0, 3.33, 18.7, 0.0, 1.19, 0.0, 4.2, 0.11, 0.2, 0.92, 1.45, 0.59, 0.0, 69.8, 0.0, 82.0, 0.0, 1.45, 0.0, 0.0, 1.68, 2.77, 0.0, 0.04, 4.0, 4.0, 9.0, 6.93),
    Amaranth_grain_cooked("Amaranth grain, cooked", 100.0, 0.0, 0.0, 0.0, 3.8, 1.58, 18.69, 102.0, 0.0, 75.16, 2.1, 47.0, 2.1, 65.0, 148.0, 135.0, 6.0, 0.86, 0.14, 0.0, 0.85, 5.5, 0.0, 0.19, 0.0, 0.0, 0.01, 0.02, 0.23, 0.0, 0.11, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Barley_pearled_raw("Barley, pearled, raw", 100.0, 0.0, 0.0, 0.0, 9.91, 1.16, 77.72, 352.0, 0.0, 10.09, 15.6, 29.0, 2.5, 79.0, 221.0, 280.0, 9.0, 2.13, 0.42, 0.0, 1.32, 37.7, 1.0, 0.02, 0.0, 0.0, 0.19, 0.11, 4.6, 0.28, 0.26, 0.0, 37.8, 2.2, 23.0, 0.0, 0.24, 0.0, 0.0, 0.14, 0.56, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Barley_pearled_cooked("Barley, pearled, cooked", 100.0, 0.0, 0.0, 25.0, 2.26, 0.44, 28.22, 123.0, 0.0, 68.8, 3.8, 11.0, 1.33, 22.0, 54.0, 93.0, 3.0, 0.82, 0.1, 0.0, 0.25, 8.6, 0.0, 0.01, 0.0, 0.0, 0.08, 0.06, 2.06, 0.13, 0.11, 0.0, 13.4, 0.8, 16.0, 0.0, 0.09, 0.0, 0.0, 0.05, 0.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Corn_grain_yellow("Corn grain, yellow", 100.0, 0.0, 0.0, 0.0, 9.42, 4.74, 74.26, 365.0, 0.0, 10.37, 7.3, 7.0, 2.71, 127.0, 210.0, 287.0, 35.0, 2.21, 0.31, 0.0, 0.48, 15.5, 11.0, 0.49, 0.0, 0.0, 0.38, 0.2, 3.62, 0.42, 0.62, 0.0, 0.0, 0.3, 19.0, 0.0, 0.66, 0.0, 0.0, 1.25, 2.16, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Corn_bran_crude("Corn bran, crude", 100.0, 0.0, 0.0, 0.0, 8.36, 0.92, 85.64, 224.0, 0.0, 4.71, 79.0, 42.0, 2.79, 64.0, 72.0, 44.0, 7.0, 1.56, 0.24, 0.0, 0.14, 16.5, 4.0, 0.42, 0.0, 0.0, 0.01, 0.1, 2.73, 0.63, 0.15, 0.0, 18.1, 0.3, 4.0, 0.0, 0.13, 0.0, 0.0, 0.24, 0.42, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Couscous_dry("Couscous, dry", 100.0, 0.0, 0.0, 0.0, 12.76, 0.64, 77.43, 376.0, 0.0, 8.56, 5.0, 24.0, 1.08, 44.0, 170.0, 166.0, 10.0, 0.83, 0.24, 0.0, 0.78, 0.0, 0.0, 0.0, 0.0, 0.0, 0.16, 0.07, 3.49, 1.24, 0.11, 0.0, 0.0, 0.0, 20.0, 0.0, 0.11, 0.0, 0.0, 0.08, 0.25, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Couscous_cooked("Couscous, cooked", 100.0, 0.0, 0.0, 65.0, 3.79, 0.16, 23.22, 112.0, 0.0, 72.57, 1.4, 8.0, 0.38, 8.0, 22.0, 58.0, 5.0, 0.26, 0.04, 0.0, 0.08, 27.5, 0.0, 0.13, 0.0, 0.0, 0.06, 0.02, 0.98, 0.37, 0.05, 0.0, 3.3, 0.1, 15.0, 0.0, 0.02, 0.0, 0.0, 0.02, 0.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Hominy_canned_white("Hominy, canned, white", 100.0, 0.0, 0.0, 40.0, 1.48, 0.88, 14.26, 72.0, 0.0, 82.53, 2.5, 10.0, 0.62, 16.0, 35.0, 9.0, 345.0, 1.05, 0.03, 0.0, 0.07, 3.0, 0.0, 0.05, 0.0, 0.0, 0.003, 0.006, 0.03, 0.15, 0.005, 0.0, 3.1, 0.2, 1.0, 0.0, 0.12, 0.0, 0.0, 0.23, 0.39, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Millet_raw("Millet, raw", 100.0, 0.0, 0.0, 0.0, 11.02, 4.22, 72.85, 378.0, 0.0, 8.67, 8.5, 8.0, 3.01, 114.0, 285.0, 195.0, 5.0, 1.68, 0.75, 0.0, 1.63, 2.7, 0.0, 0.05, 0.0, 0.0, 0.42, 0.29, 4.72, 0.84, 0.38, 0.0, 0.0, 0.9, 85.0, 0.0, 0.72, 0.0, 0.0, 0.77, 2.13, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Millet_cooked("Millet, cooked", 100.0, 0.0, 0.0, 71.0, 3.51, 1.0, 23.67, 119.0, 0.0, 71.41, 1.3, 3.0, 0.63, 44.0, 100.0, 62.0, 2.0, 0.91, 0.16, 0.0, 0.27, 0.9, 0.0, 0.02, 0.0, 0.0, 0.1, 0.08, 1.33, 0.17, 0.1, 0.0, 11.2, 0.3, 19.0, 0.0, 0.17, 0.0, 0.0, 0.18, 0.5, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Oat_bran_raw("Oat bran, raw", 100.0, 0.0, 0.0, 0.0, 17.3, 7.03, 66.22, 246.0, 0.0, 6.55, 15.4, 58.0, 5.41, 235.0, 734.0, 566.0, 4.0, 3.11, 0.4, 0.0, 5.63, 45.2, 0.0, 1.01, 0.0, 0.0, 1.17, 0.22, 0.93, 1.49, 0.16, 0.0, 32.2, 3.2, 52.0, 0.0, 1.32, 0.0, 0.0, 2.37, 2.76, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Oat_bran_cooked("Oat bran, cooked", 100.0, 0.0, 0.0, 0.0, 3.21, 0.86, 11.44, 40.0, 0.0, 84.0, 2.6, 10.0, 0.88, 40.0, 119.0, 92.0, 1.0, 0.53, 0.06, 0.0, 0.96, 7.7, 0.0, 0.0, 0.0, 0.0, 0.16, 0.03, 0.14, 0.21, 0.02, 0.0, 0.0, 0.0, 6.0, 0.0, 0.16, 0.0, 0.0, 0.29, 0.33, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Quinoa_uncooked("Quinoa, uncooked", 100.0, 0.0, 0.0, 0.0, 14.12, 6.07, 64.16, 368.0, 0.0, 13.28, 7.0, 47.0, 4.57, 197.0, 457.0, 563.0, 5.0, 3.1, 0.59, 0.0, 2.03, 8.5, 1.0, 2.44, 0.0, 0.0, 0.36, 0.31, 1.52, 0.77, 0.48, 0.0, 70.2, 0.0, 184.0, 0.0, 0.7, 0.04, 0.0, 1.61, 3.29, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_brown_long_grain_raw("Rice, brown, long-grain, raw", 100.0, 0.0, 0.0, 0.0, 7.54, 3.2, 76.25, 367.0, 0.0, 11.8, 3.6, 9.0, 1.29, 116.0, 311.0, 250.0, 5.0, 2.13, 0.3, 0.0, 2.85, 17.1, 0.0, 0.6, 0.0, 0.0, 0.54, 0.09, 6.49, 1.06, 0.47, 0.0, 21.5, 0.6, 23.0, 0.0, 0.59, 0.0, 0.0, 1.05, 1.0, 0.96, 0.03, 4.0, 4.0, 9.0, 6.93),
    Rice_brown_long_grain_cooked("Rice, brown, long-grain, cooked", 100.0, 0.0, 0.0, 66.0, 2.74, 0.97, 25.58, 123.0, 0.0, 70.27, 1.6, 3.0, 0.56, 39.0, 103.0, 86.0, 4.0, 0.71, 0.1, 0.0, 0.97, 5.8, 0.0, 0.17, 0.0, 0.0, 0.17, 0.06, 2.56, 0.38, 0.12, 0.0, 9.2, 0.2, 9.0, 0.0, 0.26, 0.0, 0.0, 0.36, 0.36, 0.35, 0.01, 4.0, 4.0, 9.0, 6.93),
    Oats("Oats", 100.0, 0.0, 0.0, 0.0, 16.89, 6.9, 66.27, 389.0, 0.0, 8.22, 10.6, 54.0, 4.72, 177.0, 523.0, 429.0, 2.0, 3.97, 0.62, 0.0, 4.91, 0.0, 0.0, 0.0, 0.0, 0.0, 0.76, 0.13, 0.96, 1.34, 0.11, 0.0, 0.0, 0.0, 56.0, 0.0, 1.21, 0.0, 0.0, 2.17, 2.53, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_brown_medium_grain_raw("Rice, brown, medium-grain, raw", 100.0, 0.0, 0.0, 0.0, 7.5, 2.68, 76.17, 362.0, 0.0, 12.37, 3.4, 33.0, 1.8, 143.0, 264.0, 268.0, 4.0, 2.02, 0.27, 0.0, 3.74, 0.0, 0.0, 0.0, 0.0, 0.0, 0.41, 0.04, 4.3, 1.49, 0.5, 0.0, 0.0, 0.0, 20.0, 0.0, 0.53, 0.0, 0.0, 0.97, 0.95, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_brown_medium_grain_cooked("Rice, brown, medium-grain, cooked", 100.0, 0.0, 0.0, 66.0, 2.32, 0.83, 23.51, 112.0, 0.0, 72.96, 1.8, 10.0, 0.53, 44.0, 77.0, 79.0, 1.0, 0.62, 0.08, 0.0, 1.09, 0.0, 0.0, 0.0, 0.0, 0.0, 0.1, 0.01, 1.33, 0.39, 0.14, 0.0, 0.0, 0.0, 4.0, 0.0, 0.16, 0.0, 0.0, 0.3, 0.29, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_long_grain_regular_raw_enriched("Rice, white, long-grain, regular, raw, enriched", 100.0, 0.0, 0.0, 0.0, 7.13, 0.66, 79.95, 365.0, 0.0, 11.62, 1.3, 28.0, 4.31, 25.0, 115.0, 115.0, 5.0, 1.09, 0.22, 0.0, 1.08, 15.1, 0.0, 0.11, 0.0, 0.0, 0.57, 0.04, 4.19, 1.01, 0.16, 0.0, 5.8, 0.1, 387.0, 0.0, 0.18, 0.0, 0.0, 0.2, 0.17, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_long_grain_regular_enriched_cooked("Rice, white, long-grain, regular, enriched, cooked", 100.0, 0.0, 0.0, 58.0, 2.69, 0.28, 28.17, 130.0, 0.0, 68.44, 0.4, 10.0, 1.2, 12.0, 43.0, 35.0, 1.0, 0.49, 0.06, 41.1, 0.47, 7.5, 0.0, 0.04, 0.0, 0.0, 0.16, 0.01, 1.47, 0.39, 0.09, 0.0, 2.1, 0.0, 97.0, 0.0, 0.07, 0.0, 0.0, 0.08, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_medium_grain_raw_enriched("Rice, white, medium-grain, raw, enriched", 100.0, 0.0, 0.0, 0.0, 6.61, 0.58, 79.34, 360.0, 0.0, 12.89, 1.4, 9.0, 4.36, 35.0, 108.0, 86.0, 1.0, 1.16, 0.11, 0.0, 1.1, 15.1, 0.0, 0.11, 0.0, 0.0, 0.57, 0.04, 5.09, 1.34, 0.14, 0.0, 0.0, 0.0, 386.0, 0.0, 0.15, 0.0, 0.0, 0.18, 0.15, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_medium_grain_enriched_cooked("Rice, white, medium-grain, enriched, cooked", 100.0, 0.0, 0.0, 64.0, 2.38, 0.21, 28.59, 130.0, 0.0, 68.61, 0.3, 3.0, 1.49, 13.0, 37.0, 29.0, 0.0, 0.42, 0.03, 0.0, 0.37, 7.5, 0.0, 0.0, 0.0, 0.0, 0.16, 0.01, 1.83, 0.41, 0.05, 0.0, 0.0, 0.0, 97.0, 0.0, 0.05, 0.0, 0.0, 0.06, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_short_grain_enriched_uncooked("Rice, white, short-grain, enriched, uncooked", 100.0, 0.0, 0.0, 0.0, 6.5, 0.52, 79.15, 358.0, 0.0, 13.29, 2.8, 3.0, 4.23, 23.0, 95.0, 76.0, 1.0, 1.1, 0.21, 0.0, 1.03, 15.1, 0.0, 0.0, 0.0, 0.0, 0.56, 0.04, 4.11, 1.28, 0.17, 0.0, 0.0, 0.0, 389.0, 0.0, 0.14, 0.0, 0.0, 0.16, 0.13, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_short_grain_enriched_cooked("Rice, white, short-grain, enriched, cooked", 100.0, 0.0, 0.0, 0.0, 2.36, 0.19, 28.73, 130.0, 0.0, 68.53, 0.0, 1.0, 1.46, 8.0, 33.0, 26.0, 0.0, 0.4, 0.07, 0.0, 0.35, 7.5, 0.0, 0.0, 0.0, 0.0, 0.16, 0.01, 1.49, 0.39, 0.05, 0.0, 0.0, 0.0, 99.0, 0.0, 0.05, 0.0, 0.0, 0.05, 0.05, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_glutinous_unenriched_uncooked("Rice, white, glutinous, unenriched, uncooked", 100.0, 0.0, 0.0, 0.0, 6.81, 0.55, 81.68, 370.0, 0.0, 10.46, 2.8, 11.0, 1.6, 23.0, 71.0, 77.0, 7.0, 1.2, 0.17, 0.0, 0.97, 15.1, 0.0, 0.0, 0.0, 0.0, 0.18, 0.05, 2.14, 0.82, 0.1, 0.0, 0.0, 0.0, 7.0, 0.0, 0.11, 0.0, 0.0, 0.2, 0.19, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_white_glutinous_unenriched_cooked("Rice, white, glutinous, unenriched, cooked", 100.0, 0.0, 0.0, 98.0, 2.02, 0.19, 21.09, 97.0, 0.0, 76.63, 1.0, 2.0, 0.14, 5.0, 8.0, 10.0, 5.0, 0.41, 0.04, 0.0, 0.26, 5.6, 0.0, 0.04, 0.0, 0.0, 0.02, 0.01, 0.29, 0.21, 0.02, 0.0, 2.1, 0.0, 1.0, 0.0, 0.03, 0.0, 0.0, 0.07, 0.06, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rice_bran_crude("Rice bran, crude", 100.0, 0.0, 0.0, 0.0, 13.35, 20.85, 49.69, 316.0, 0.0, 6.13, 21.0, 57.0, 18.54, 781.0, 1677.0, 1485.0, 5.0, 6.04, 0.72, 0.0, 14.21, 15.6, 0.0, 4.92, 0.0, 0.0, 2.75, 0.28, 33.99, 7.39, 4.07, 0.0, 32.2, 1.9, 63.0, 0.0, 4.17, 0.0, 0.0, 7.54, 7.45, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Rye_grain("Rye grain", 100.0, 0.0, 0.0, 0.0, 10.34, 1.63, 75.86, 338.0, 0.0, 10.6, 15.1, 24.0, 2.63, 110.0, 332.0, 510.0, 2.0, 2.65, 0.36, 0.0, 2.57, 13.9, 1.0, 0.85, 0.0, 0.0, 0.31, 0.25, 4.27, 1.45, 0.29, 0.0, 30.4, 5.9, 38.0, 0.0, 0.19, 0.0, 0.0, 0.2, 0.76, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Sorghum_grain("Sorghum grain", 100.0, 0.0, 0.0, 0.0, 10.62, 3.46, 72.09, 329.0, 0.0, 12.4, 6.7, 13.0, 3.36, 165.0, 289.0, 363.0, 2.0, 1.67, 0.28, 0.0, 1.6, 12.2, 0.0, 0.5, 0.0, 0.0, 0.33, 0.09, 3.68, 0.36, 0.44, 0.0, 0.0, 0.0, 20.0, 0.0, 0.61, 0.0, 0.0, 1.13, 1.55, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Triticale("Triticale", 100.0, 0.0, 0.0, 0.0, 13.05, 2.09, 72.13, 336.0, 0.0, 10.51, 0.0, 37.0, 2.57, 130.0, 358.0, 332.0, 5.0, 3.45, 0.45, 0.0, 3.21, 0.0, 0.0, 0.9, 0.0, 0.0, 0.41, 0.13, 1.43, 1.32, 0.13, 0.0, 0.0, 0.0, 73.0, 0.0, 0.36, 0.0, 0.0, 0.21, 0.91, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Wheat_bran_crude("Wheat bran, crude", 100.0, 0.0, 0.0, 0.0, 15.55, 4.25, 64.51, 216.0, 0.0, 9.89, 42.8, 73.0, 10.57, 611.0, 1013.0, 1182.0, 2.0, 7.27, 0.99, 0.0, 11.5, 77.6, 0.0, 1.49, 0.0, 0.0, 0.52, 0.57, 13.57, 2.18, 1.3, 0.0, 74.4, 1.9, 79.0, 0.0, 0.63, 0.0, 0.0, 0.63, 2.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Wheat_germ_crude("Wheat germ, crude", 100.0, 0.0, 0.0, 0.0, 23.15, 9.72, 51.8, 360.0, 0.0, 11.12, 13.2, 39.0, 6.26, 239.0, 842.0, 892.0, 12.0, 12.29, 0.79, 0.0, 13.3, 79.2, 0.0, 0.0, 0.0, 0.0, 1.88, 0.49, 6.81, 2.25, 1.3, 0.0, 0.0, 0.0, 281.0, 0.0, 1.66, 0.0, 0.0, 1.36, 6.01, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Wild_rice_raw("Wild rice, raw", 100.0, 0.0, 0.0, 0.0, 14.73, 1.08, 74.9, 357.0, 0.0, 7.76, 6.2, 21.0, 1.96, 177.0, 433.0, 427.0, 7.0, 5.96, 0.52, 0.0, 1.32, 2.8, 1.0, 0.82, 0.0, 0.0, 0.11, 0.26, 6.73, 1.07, 0.39, 0.0, 35.0, 1.9, 95.0, 0.0, 0.15, 0.0, 0.0, 0.15, 0.67, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Wild_rice_cooked("Wild rice, cooked", 100.0, 0.0, 0.0, 57.0, 3.99, 0.34, 21.34, 101.0, 0.0, 73.93, 1.8, 3.0, 0.6, 32.0, 82.0, 101.0, 3.0, 1.34, 0.12, 0.0, 0.28, 0.8, 0.0, 0.24, 0.0, 0.0, 0.05, 0.08, 1.28, 0.15, 0.13, 0.0, 10.2, 0.5, 26.0, 0.0, 0.04, 0.0, 0.0, 0.05, 0.21, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Pasta_dry_enriched("Pasta, dry, enriched", 100.0, 0.0, 0.0, 0.0, 13.04, 1.51, 74.67, 371.0, 0.0, 9.9, 3.2, 21.0, 3.3, 53.0, 189.0, 223.0, 6.0, 1.41, 0.28, 18.0, 0.91, 63.2, 0.0, 0.11, 0.0, 0.0, 0.89, 0.4, 7.17, 0.43, 0.14, 0.0, 15.1, 0.1, 391.0, 0.0, 0.27, 0.0, 0.0, 0.17, 0.56, 0.0, 0.02, 4.0, 4.0, 9.0, 6.93),
    Pasta_cooked_enriched_without_added_salt("Pasta, cooked, enriched, without added salt", 100.0, 0.0, 0.0, 42.0, 5.8, 0.93, 30.86, 158.0, 0.0, 62.13, 1.8, 7.0, 1.28, 18.0, 58.0, 44.0, 1.0, 0.51, 0.1, 7.0, 0.32, 26.4, 0.0, 0.06, 0.0, 0.0, 0.27, 0.13, 1.68, 0.11, 0.04, 0.0, 6.4, 0.0, 119.0, 0.0, 0.17, 0.0, 0.0, 0.13, 0.32, 0.0, 0.02, 4.0, 4.0, 9.0, 6.93),
    Pasta_whole_wheat_dry("Pasta, whole-wheat, dry", 100.0, 0.0, 0.0, 0.0, 13.87, 2.93, 73.37, 352.0, 0.0, 8.21, 9.2, 29.0, 3.62, 128.0, 343.0, 434.0, 6.0, 2.97, 0.49, 0.0, 2.98, 77.6, 0.0, 0.46, 0.0, 0.0, 0.4, 0.21, 8.69, 0.87, 0.28, 0.0, 0.0, 1.4, 69.0, 0.0, 0.42, 0.0, 0.0, 0.36, 1.13, 1.06, 0.07, 4.0, 4.0, 9.0, 6.93),
    Quinoa_cooked("Quinoa, cooked", 100.0, 0.0, 0.0, 0.0, 4.4, 1.92, 21.3, 120.0, 0.0, 71.61, 2.8, 17.0, 1.49, 64.0, 152.0, 172.0, 7.0, 1.09, 0.19, 0.0, 0.63, 2.8, 0.0, 0.63, 0.0, 0.0, 0.1, 0.11, 0.41, 0.0, 0.12, 0.0, 23.0, 0.0, 42.0, 0.0, 0.23, 0.01, 0.0, 0.52, 1.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Wheat_kamut_khorasan_uncooked("Wheat, KAMUT khorasan, uncooked", 100.0, 0.0, 0.0, 0.0, 14.54, 2.13, 70.58, 337.0, 0.0, 11.07, 11.1, 22.0, 3.77, 130.0, 364.0, 403.0, 5.0, 3.68, 0.5, 0.0, 2.73, 81.5, 1.0, 0.61, 0.0, 0.0, 0.56, 0.18, 6.37, 0.94, 0.25, 0.0, 25.8, 1.8, 0.0, 0.0, 0.19, 0.0, 0.0, 0.21, 0.62, 0.0, 0.04, 4.0, 4.0, 9.0, 6.93),
    Wheat_kamut_khorasan_cooked("Wheat, KAMUT khorasan, cooked", 100.0, 0.0, 0.0, 0.0, 5.71, 0.83, 27.6, 132.0, 0.0, 65.18, 4.3, 9.0, 1.76, 48.0, 147.0, 164.0, 8.0, 1.84, 0.2, 0.0, 1.03, 31.9, 0.0, 0.24, 0.0, 0.0, 0.09, 0.03, 2.3, 0.0, 0.07, 0.0, 0.0, 0.0, 11.0, 0.0, 0.07, 0.0, 0.0, 0.08, 0.24, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Corn_grain_white("Corn grain, white", 100.0, 0.0, 0.0, 0.0, 9.42, 4.74, 74.26, 365.0, 0.0, 10.37, 0.0, 7.0, 2.71, 127.0, 210.0, 287.0, 35.0, 2.21, 0.31, 0.0, 0.48, 15.5, 0.0, 0.0, 0.0, 0.0, 0.38, 0.2, 3.62, 0.42, 0.62, 0.0, 0.0, 0.0, 0.0, 0.0, 0.66, 0.0, 0.0, 1.25, 2.16, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Hominy_canned_yellow("Hominy, canned, yellow", 100.0, 0.0, 0.0, 40.0, 1.48, 0.88, 14.26, 72.0, 0.0, 82.53, 2.5, 10.0, 0.62, 16.0, 35.0, 9.0, 345.0, 1.05, 0.03, 0.0, 0.07, 3.0, 0.0, 0.0, 0.0, 0.0, 0.003, 0.006, 0.03, 0.15, 0.005, 0.0, 0.0, 0.0, 1.0, 0.0, 0.12, 0.0, 0.0, 0.23, 0.39, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),;

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

    Cereal_grains_and_pasta(
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
        return "Cereal Grains and Pasta";
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
