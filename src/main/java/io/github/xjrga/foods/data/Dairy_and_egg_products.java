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
public enum Dairy_and_egg_products implements Interface_food {

    Cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd("Cheese, cottage, nonfat, uncreamed, dry, large or small curd", 100.0, 10.34, 0.0, 0.0, 10.34, 0.29, 6.66, 72.0, 0.0, 81.01, 0.0, 86.0, 0.15, 11.0, 190.0, 137.0, 372.0, 0.47, 0.03, 31.6, 0.02, 9.4, 2.0, 0.01, 0.0, 0.0, 0.02, 0.22, 0.14, 0.44, 0.01, 0.46, 17.9, 0.0, 9.0, 7.0, 0.16, 0.0, 0.0, 0.07, 0.003, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Cheese_cottage_lowfat_2_milkfat("Cheese, cottage, lowfat, 2% milkfat", 100.0, 10.45, 0.0, 0.0, 10.45, 2.27, 4.76, 81.0, 0.0, 81.24, 0.0, 111.0, 0.13, 9.0, 150.0, 125.0, 308.0, 0.51, 0.03, 0.0, 0.01, 11.9, 68.0, 0.08, 0.0, 0.0, 0.02, 0.25, 0.1, 0.52, 0.05, 0.47, 16.3, 0.0, 8.0, 12.0, 1.23, 0.0, 0.001, 0.51, 0.08, 0.04, 0.007, 4.0, 4.0, 9.0, 6.93),
    Cheese_cottage_lowfat_1_milkfat("Cheese, cottage, lowfat, 1% milkfat", 100.0, 12.39, 0.0, 0.0, 12.39, 1.02, 2.72, 72.0, 0.0, 82.48, 0.0, 61.0, 0.14, 5.0, 134.0, 86.0, 406.0, 0.38, 0.02, 31.6, 0.003, 9.0, 11.0, 0.01, 0.0, 0.0, 0.02, 0.16, 0.12, 0.21, 0.06, 0.63, 17.5, 0.1, 12.0, 4.0, 0.64, 0.0, 0.0, 0.29, 0.03, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_whole_3_25_milkfat_with_added_vitamin_d("Milk, whole, 3.25% milkfat, with added vitamin D", 100.0, 3.15, 0.0, 0.0, 3.15, 3.25, 4.8, 61.0, 0.0, 88.13, 0.0, 113.0, 0.03, 10.0, 84.0, 132.0, 43.0, 0.37, 0.02, 0.0, 0.004, 3.7, 46.0, 0.07, 1.3, 0.0, 0.04, 0.16, 0.08, 0.37, 0.03, 0.45, 14.3, 0.3, 5.0, 10.0, 1.86, 0.0, 0.0, 0.81, 0.19, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_producer_fluid_3_7_milkfat("Milk, producer, fluid, 3.7% milkfat", 100.0, 3.28, 0.0, 0.0, 3.28, 3.66, 4.65, 64.0, 0.0, 87.69, 0.0, 119.0, 0.05, 13.0, 93.0, 151.0, 49.0, 0.38, 0.01, 0.0, 0.004, 2.0, 33.0, 0.0, 0.0, 1.5, 0.03, 0.16, 0.08, 0.31, 0.04, 0.36, 0.0, 0.0, 5.0, 14.0, 2.27, 0.0, 0.0, 1.05, 0.13, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d("Milk, reduced fat, fluid, 2% milkfat, with added vitamin A and vitamin D", 100.0, 3.3, 0.0, 0.0, 3.3, 1.98, 4.8, 50.0, 0.0, 89.21, 0.0, 120.0, 0.02, 11.0, 92.0, 140.0, 47.0, 0.48, 0.006, 3.4, 0.01, 2.5, 55.0, 0.03, 1.2, 0.2, 0.03, 0.18, 0.09, 0.35, 0.03, 0.53, 16.4, 0.2, 5.0, 8.0, 1.25, 0.0, 0.0, 0.56, 0.07, 0.05, 0.008, 4.0, 4.0, 9.0, 6.93),
    Milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d("Milk, lowfat, fluid, 1% milkfat, with added vitamin A and vitamin D", 100.0, 3.37, 0.0, 0.0, 3.37, 0.97, 4.99, 42.0, 0.0, 89.92, 0.0, 125.0, 0.03, 11.0, 95.0, 150.0, 44.0, 0.42, 0.01, 2.6, 0.003, 3.3, 58.0, 0.01, 1.2, 0.0, 0.02, 0.18, 0.09, 0.36, 0.03, 0.47, 17.7, 0.1, 5.0, 5.0, 0.63, 0.0, 0.0, 0.27, 0.03, 0.02, 0.004, 4.0, 4.0, 9.0, 6.93),
    Milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d("Milk, lowfat, fluid, 1% milkfat, protein fortified, with added vitamin A and vitamin D", 100.0, 3.93, 0.0, 0.0, 3.93, 1.17, 5.52, 48.0, 0.0, 88.74, 0.0, 142.0, 0.06, 16.0, 111.0, 180.0, 58.0, 0.45, 0.01, 0.0, 0.002, 2.5, 61.0, 0.0, 1.0, 1.2, 0.04, 0.19, 0.1, 0.37, 0.05, 0.43, 0.0, 0.0, 6.0, 4.0, 0.72, 0.0, 0.0, 0.33, 0.04, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim("Milk, nonfat, fluid, with added vitamin A and vitamin D (fat free or skim)", 100.0, 3.37, 0.0, 32.0, 3.37, 0.08, 4.96, 34.0, 0.0, 90.84, 0.0, 122.0, 0.03, 11.0, 101.0, 156.0, 42.0, 0.42, 0.01, 3.1, 0.003, 3.1, 61.0, 0.01, 1.2, 0.0, 0.04, 0.18, 0.09, 0.35, 0.03, 0.5, 15.6, 0.0, 5.0, 2.0, 0.05, 0.0, 0.0, 0.02, 0.003, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim("Milk, nonfat, fluid, protein fortified, with added vitamin A and vitamin D (fat free and skim)", 100.0, 3.96, 0.0, 0.0, 3.96, 0.25, 5.56, 41.0, 0.0, 89.36, 0.0, 143.0, 0.06, 16.0, 112.0, 182.0, 59.0, 0.45, 0.01, 0.0, 0.002, 2.4, 61.0, 0.0, 1.0, 1.1, 0.04, 0.19, 0.1, 0.37, 0.05, 0.43, 0.0, 0.0, 6.0, 2.0, 0.16, 0.0, 0.0, 0.06, 0.009, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_buttermilk_fluid_cultured_lowfat("Milk, buttermilk, fluid, cultured, lowfat", 100.0, 3.31, 0.0, 0.0, 3.31, 0.88, 4.79, 40.0, 0.0, 90.13, 0.0, 116.0, 0.05, 11.0, 89.0, 151.0, 190.0, 0.42, 0.01, 4.0, 0.002, 2.0, 14.0, 0.05, 0.0, 1.0, 0.03, 0.15, 0.05, 0.27, 0.03, 0.22, 17.7, 0.1, 5.0, 4.0, 0.54, 0.0, 0.0, 0.25, 0.03, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d("Milk, dry, nonfat, instant, with added vitamin A and vitamin D", 100.0, 35.1, 0.0, 0.0, 35.1, 0.72, 52.19, 358.0, 0.0, 3.96, 0.0, 1231.0, 0.31, 117.0, 985.0, 1705.0, 549.0, 4.41, 0.04, 0.0, 0.02, 27.3, 709.0, 0.01, 11.0, 5.6, 0.41, 1.74, 0.89, 3.23, 0.34, 3.99, 167.8, 0.0, 50.0, 18.0, 0.46, 0.0, 0.0, 0.18, 0.02, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_canned_condensed_sweetened("Milk, canned, condensed, sweetened", 100.0, 7.91, 0.0, 61.0, 7.91, 8.7, 54.4, 321.0, 0.0, 27.16, 0.0, 284.0, 0.19, 26.0, 253.0, 371.0, 127.0, 0.94, 0.01, 0.0, 0.006, 14.8, 74.0, 0.16, 0.2, 2.6, 0.09, 0.41, 0.21, 0.75, 0.05, 0.44, 89.1, 0.6, 11.0, 34.0, 5.48, 0.0, 0.0, 2.42, 0.33, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a("Milk, canned, evaporated, with added vitamin D and without added vitamin A", 100.0, 6.81, 0.0, 0.0, 6.81, 7.56, 10.04, 134.0, 0.0, 74.04, 0.0, 261.0, 0.19, 24.0, 203.0, 303.0, 106.0, 0.77, 0.01, 8.5, 0.006, 2.3, 65.0, 0.14, 2.0, 1.9, 0.04, 0.31, 0.19, 0.63, 0.05, 0.16, 31.8, 0.5, 8.0, 29.0, 4.59, 0.0, 0.0, 2.33, 0.24, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d("Milk, canned, evaporated, nonfat, with added vitamin A and vitamin D", 100.0, 7.55, 0.0, 0.0, 7.55, 0.2, 11.35, 78.0, 0.0, 79.4, 0.0, 290.0, 0.29, 27.0, 195.0, 332.0, 115.0, 0.9, 0.01, 8.5, 0.006, 2.5, 118.0, 0.0, 2.0, 1.2, 0.04, 0.3, 0.17, 0.73, 0.05, 0.24, 25.2, 0.0, 9.0, 4.0, 0.12, 0.0, 0.0, 0.06, 0.006, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d("Milk, chocolate, lowfat, with added vitamin A and vitamin D", 100.0, 3.46, 0.0, 0.0, 3.46, 1.0, 9.86, 62.0, 0.0, 84.91, 0.1, 129.0, 0.23, 13.0, 96.0, 172.0, 65.0, 0.43, 0.02, 0.0, 0.03, 1.9, 52.0, 0.0, 1.1, 0.4, 0.03, 0.24, 0.12, 0.43, 0.04, 0.23, 17.0, 0.1, 3.0, 5.0, 0.58, 0.0, 0.001, 0.54, 0.09, 0.02, 0.006, 4.0, 4.0, 9.0, 6.93),
    Yogurt_plain_skim_milk_13_grams_protein_per_8_ounce("Yogurt, plain, skim milk, 13 grams protein per 8 ounce", 100.0, 5.73, 0.0, 0.0, 5.73, 0.18, 7.68, 56.0, 0.0, 85.23, 0.0, 199.0, 0.09, 19.0, 157.0, 255.0, 77.0, 0.97, 0.01, 12.0, 0.005, 3.6, 2.0, 0.0, 0.0, 0.9, 0.04, 0.23, 0.12, 0.64, 0.05, 0.61, 15.2, 0.2, 12.0, 2.0, 0.11, 0.0, 0.0, 0.04, 0.005, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Egg_whole_raw_fresh("Egg, whole, raw, fresh", 100.0, 12.56, 0.0, 0.0, 12.56, 9.51, 0.72, 143.0, 0.0, 76.15, 0.0, 56.0, 1.75, 12.0, 198.0, 138.0, 142.0, 1.29, 0.07, 1.1, 0.02, 30.7, 160.0, 1.05, 2.0, 0.0, 0.04, 0.45, 0.07, 1.53, 0.17, 0.89, 293.8, 0.3, 47.0, 372.0, 3.12, 0.05, 0.0, 3.65, 1.91, 1.53, 0.03, 4.0, 4.0, 9.0, 6.93),
    Egg_white_raw_fresh("Egg, white, raw, fresh", 100.0, 10.9, 0.0, 0.0, 10.9, 0.17, 0.73, 52.0, 0.0, 87.57, 0.0, 7.0, 0.08, 11.0, 15.0, 163.0, 166.0, 0.03, 0.02, 0.0, 0.01, 20.0, 0.0, 0.0, 0.0, 0.0, 0.004, 0.43, 0.1, 0.19, 0.005, 0.09, 1.1, 0.0, 4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Egg_whole_cooked_hard_boiled("Egg, whole, cooked, hard-boiled", 100.0, 12.58, 0.0, 0.0, 12.58, 10.61, 1.12, 155.0, 0.0, 74.62, 0.0, 50.0, 1.19, 10.0, 172.0, 126.0, 124.0, 1.05, 0.01, 4.8, 0.02, 30.8, 149.0, 1.03, 2.2, 0.0, 0.06, 0.51, 0.06, 1.39, 0.12, 1.11, 293.8, 0.3, 44.0, 373.0, 3.26, 0.03, 0.005, 4.07, 1.41, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Egg_white_dried("Egg, white, dried", 100.0, 81.1, 0.0, 0.0, 81.1, 0.0, 7.8, 382.0, 0.0, 5.8, 0.0, 62.0, 0.15, 88.0, 111.0, 1125.0, 1280.0, 0.1, 0.11, 0.0, 0.007, 125.1, 0.0, 0.0, 0.0, 0.0, 0.005, 2.53, 0.86, 0.77, 0.03, 0.18, 8.4, 0.0, 18.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Sour_cream_fat_free("Sour cream, fat free", 100.0, 3.1, 0.0, 0.0, 3.1, 0.0, 15.6, 74.0, 0.0, 80.6, 0.0, 125.0, 0.0, 10.0, 95.0, 129.0, 141.0, 0.5, 0.01, 0.0, 0.0, 5.3, 73.0, 0.0, 0.0, 0.0, 0.04, 0.15, 0.07, 0.0, 0.02, 0.3, 19.2, 0.0, 11.0, 9.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Parmesan_cheese_topping_fat_free("Parmesan cheese topping, fat free", 100.0, 40.0, 0.0, 0.0, 40.0, 5.0, 40.0, 370.0, 0.0, 8.6, 0.0, 800.0, 5.0, 40.0, 700.0, 600.0, 1150.0, 3.0, 0.02, 0.0, 0.0, 43.3, 40.0, 0.04, 0.0, 0.0, 0.05, 0.05, 0.2, 0.0, 0.1, 1.1, 15.4, 0.4, 25.0, 20.0, 3.11, 0.0, 0.0, 1.44, 0.18, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Cheese_provolone_reduced_fat("Cheese, provolone, reduced fat", 100.0, 24.7, 0.0, 0.0, 24.7, 17.6, 3.5, 274.0, 0.0, 50.6, 0.0, 756.0, 0.52, 28.0, 496.0, 138.0, 615.0, 3.23, 0.02, 0.0, 0.01, 14.5, 141.0, 0.15, 0.3, 0.0, 0.01, 0.32, 0.15, 0.47, 0.07, 1.46, 12.9, 1.5, 10.0, 55.0, 11.3, 0.0, 0.0, 4.89, 0.51, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Yogurt_greek_plain_nonfat("Yogurt, Greek, plain, nonfat", 100.0, 10.19, 0.0, 14.0, 10.19, 0.39, 3.6, 59.0, 0.0, 85.1, 0.0, 110.0, 0.07, 11.0, 135.0, 141.0, 36.0, 0.52, 0.01, 0.0, 0.009, 9.7, 1.0, 0.01, 0.0, 0.0, 0.02, 0.27, 0.2, 0.33, 0.06, 0.75, 15.1, 0.0, 7.0, 5.0, 0.11, 0.0, 0.0, 0.05, 0.01, 0.01, 0.001, 4.0, 4.0, 9.0, 6.93),
    Milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d("Milk, chocolate, fat free, with added vitamin A and vitamin D", 100.0, 3.39, 0.0, 0.0, 3.39, 0.0, 13.46, 67.0, 0.0, 82.34, 0.0, 127.0, 0.27, 13.0, 101.0, 182.0, 110.0, 0.41, 0.07, 0.0, 0.06, 1.9, 64.0, 0.04, 1.1, 1.0, 0.04, 0.16, 0.16, 0.3, 0.02, 0.32, 15.6, 0.2, 2.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Yogurt_vanilla_non_fat("Yogurt, vanilla, non-fat", 100.0, 2.94, 0.0, 0.0, 2.94, 0.0, 17.04, 78.0, 0.0, 79.0, 0.0, 118.0, 0.0, 16.0, 88.0, 141.0, 47.0, 0.83, 0.01, 0.0, 0.004, 4.9, 61.0, 0.01, 0.9, 0.0, 0.04, 0.2, 0.1, 0.55, 0.04, 0.53, 15.6, 0.0, 11.0, 3.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Milk_buttermilk_fluid_cultured_reduced_fat("Milk, buttermilk, fluid, cultured, reduced fat", 100.0, 4.1, 0.0, 0.0, 4.1, 2.0, 5.3, 56.0, 0.0, 87.7, 0.0, 143.0, 0.06, 13.0, 82.0, 180.0, 105.0, 0.24, 0.008, 0.0, 0.0, 2.3, 16.0, 0.11, 0.0, 1.5, 0.05, 0.21, 0.1, 0.0, 0.03, 0.37, 16.0, 0.1, 6.0, 8.0, 1.24, 0.0, 0.0, 0.57, 0.07, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Cheese_mozzarella_nonfat("Cheese, mozzarella, nonfat", 100.0, 31.7, 0.0, 0.0, 31.7, 0.0, 3.5, 141.0, 0.0, 60.2, 1.8, 961.0, 0.31, 33.0, 656.0, 106.0, 743.0, 3.92, 0.03, 0.0, 0.0, 18.9, 127.0, 0.14, 0.0, 0.0, 0.02, 0.3, 0.12, 0.0, 0.08, 0.92, 15.4, 1.6, 10.0, 18.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Cheese_cottage_lowfat_1_milkfat_no_sodium_added("Cheese, cottage, lowfat, 1% milkfat, no sodium added", 100.0, 12.4, 0.0, 0.0, 12.4, 1.0, 2.7, 72.0, 0.0, 83.5, 0.0, 61.0, 0.14, 5.0, 134.0, 86.0, 13.0, 0.38, 0.02, 0.0, 0.0, 8.4, 11.0, 0.01, 0.0, 0.0, 0.02, 0.16, 0.13, 0.0, 0.07, 0.63, 17.5, 0.1, 12.0, 4.0, 0.63, 0.0, 0.0, 0.28, 0.03, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Cheese_swiss_low_fat("Cheese, swiss, low fat", 100.0, 28.4, 0.0, 0.0, 28.4, 5.1, 3.4, 179.0, 0.0, 59.6, 0.0, 961.0, 0.17, 36.0, 605.0, 111.0, 199.0, 3.9, 0.02, 0.0, 0.0, 12.7, 40.0, 0.07, 0.1, 0.0, 0.02, 0.36, 0.09, 0.0, 0.08, 1.68, 15.4, 0.5, 6.0, 35.0, 3.3, 0.0, 0.0, 1.35, 0.18, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),;

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

    Dairy_and_egg_products(
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
        return "Dairy and Egg Products";
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
