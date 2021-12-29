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
 * Dairy and egg products food subset from USDA National Nutrient Database for
 * Standard Reference, Release 28
 *
 */
public enum Dairy_and_egg_products implements Interface_food {

    //01014
    Cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd("Cheese, cottage, nonfat, uncreamed, dry, large or small curd", 100.0, 10.34, 0.0, 0.0, 10.34, 0.29, 6.66, 72.0, 0.0, 81.01, 0.0, 86.0, 0.15, 11.0, 190.0, 137.0, 372.0, 0.47, 0.03, 31.6, 0.02, 9.4, 2.0, 0.01, 0.0, 0.0, 0.02, 0.22, 0.14, 0.44, 0.01, 0.46, 17.9, 0.0, 9.0, 7.0, 0.16, 0.0, 0.0, 0.07, 0.003, 0.0, 0.0),
    //01015
    Cheese_cottage_lowfat_2_milkfat("Cheese, cottage, lowfat, 2% milkfat", 100.0, 10.45, 0.0, 0.0, 10.45, 2.27, 4.76, 81.0, 0.0, 81.24, 0.0, 111.0, 0.13, 9.0, 150.0, 125.0, 308.0, 0.51, 0.03, 0.0, 0.01, 11.9, 68.0, 0.08, 0.0, 0.0, 0.02, 0.25, 0.1, 0.52, 0.05, 0.47, 16.3, 0.0, 8.0, 12.0, 1.23, 0.0, 0.001, 0.51, 0.08, 0.04, 0.007),
    //01016
    Cheese_cottage_lowfat_1_milkfat("Cheese, cottage, lowfat, 1% milkfat", 100.0, 12.39, 0.0, 0.0, 12.39, 1.02, 2.72, 72.0, 0.0, 82.48, 0.0, 61.0, 0.14, 5.0, 134.0, 86.0, 406.0, 0.38, 0.02, 31.6, 0.003, 9.0, 11.0, 0.01, 0.0, 0.0, 0.02, 0.16, 0.12, 0.21, 0.06, 0.63, 17.5, 0.1, 12.0, 4.0, 0.64, 0.0, 0.0, 0.29, 0.03, 0.0, 0.0),
    //01077
    Milk_whole_3_25_milkfat_with_added_vitamin_D("Milk, whole, 3.25% milkfat, with added vitamin D", 100.0, 3.15, 0.0, 0.0, 3.15, 3.25, 4.8, 61.0, 0.0, 88.13, 0.0, 113.0, 0.03, 10.0, 84.0, 132.0, 43.0, 0.37, 0.02, 0.0, 0.004, 3.7, 46.0, 0.07, 1.3, 0.0, 0.04, 0.16, 0.08, 0.37, 0.03, 0.45, 14.3, 0.3, 5.0, 10.0, 1.86, 0.0, 0.0, 0.81, 0.19, 0.0, 0.0),
    //01078
    Milk_producer_fluid_3_7_milkfat("Milk, producer, fluid, 3.7% milkfat", 100.0, 3.28, 0.0, 0.0, 3.28, 3.66, 4.65, 64.0, 0.0, 87.69, 0.0, 119.0, 0.05, 13.0, 93.0, 151.0, 49.0, 0.38, 0.01, 0.0, 0.004, 2.0, 33.0, 0.0, 0.0, 1.5, 0.03, 0.16, 0.08, 0.31, 0.04, 0.36, 0.0, 0.0, 5.0, 14.0, 2.27, 0.0, 0.0, 1.05, 0.13, 0.0, 0.0),
    //01079
    Milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_A_and_vitamin_D("Milk, reduced fat, fluid, 2% milkfat, with added vitamin A and vitamin D", 100.0, 3.3, 0.0, 0.0, 3.3, 1.98, 4.8, 50.0, 0.0, 89.21, 0.0, 120.0, 0.02, 11.0, 92.0, 140.0, 47.0, 0.48, 0.006, 3.4, 0.01, 2.5, 55.0, 0.03, 1.2, 0.2, 0.03, 0.18, 0.09, 0.35, 0.03, 0.53, 16.4, 0.2, 5.0, 8.0, 1.25, 0.0, 0.0, 0.56, 0.07, 0.05, 0.008),
    //01082
    Milk_lowfat_fluid_1_milkfat_with_added_vitamin_A_and_vitamin_D("Milk, lowfat, fluid, 1% milkfat, with added vitamin A and vitamin D", 100.0, 3.37, 0.0, 0.0, 3.37, 0.97, 4.99, 42.0, 0.0, 89.92, 0.0, 125.0, 0.03, 11.0, 95.0, 150.0, 44.0, 0.42, 0.01, 2.6, 0.003, 3.3, 58.0, 0.01, 1.2, 0.0, 0.02, 0.18, 0.09, 0.36, 0.03, 0.47, 17.7, 0.1, 5.0, 5.0, 0.63, 0.0, 0.0, 0.27, 0.03, 0.02, 0.004),
    //01084
    Milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_A_and_vitamin_D("Milk, lowfat, fluid, 1% milkfat, protein fortified, with added vitamin A and vitamin D", 100.0, 3.93, 0.0, 0.0, 3.93, 1.17, 5.52, 48.0, 0.0, 88.74, 0.0, 142.0, 0.06, 16.0, 111.0, 180.0, 58.0, 0.45, 0.01, 0.0, 0.002, 2.5, 61.0, 0.0, 1.0, 1.2, 0.04, 0.19, 0.1, 0.37, 0.05, 0.43, 0.0, 0.0, 6.0, 4.0, 0.72, 0.0, 0.0, 0.33, 0.04, 0.0, 0.0),
    //01085
    Milk_nonfat_fluid_with_added_vitamin_A_and_vitamin_D_fat_free_or_skim_("Milk, nonfat, fluid, with added vitamin A and vitamin D (fat free or skim)", 100.0, 3.37, 0.0, 1.5872, 3.37, 0.08, 4.96, 34.0, 0.0, 90.84, 0.0, 122.0, 0.03, 11.0, 101.0, 156.0, 42.0, 0.42, 0.01, 3.1, 0.003, 3.1, 61.0, 0.01, 1.2, 0.0, 0.04, 0.18, 0.09, 0.35, 0.03, 0.5, 15.6, 0.0, 5.0, 2.0, 0.05, 0.0, 0.0, 0.02, 0.003, 0.0, 0.0),
    //01087
    Milk_nonfat_fluid_protein_fortified_with_added_vitamin_A_and_vitamin_D_fat_free_and_skim_("Milk, nonfat, fluid, protein fortified, with added vitamin A and vitamin D (fat free and skim)", 100.0, 3.96, 0.0, 0.0, 3.96, 0.25, 5.56, 41.0, 0.0, 89.36, 0.0, 143.0, 0.06, 16.0, 112.0, 182.0, 59.0, 0.45, 0.01, 0.0, 0.002, 2.4, 61.0, 0.0, 1.0, 1.1, 0.04, 0.19, 0.1, 0.37, 0.05, 0.43, 0.0, 0.0, 6.0, 2.0, 0.16, 0.0, 0.0, 0.06, 0.009, 0.0, 0.0),
    //01088
    Milk_buttermilk_fluid_cultured_lowfat("Milk, buttermilk, fluid, cultured, lowfat", 100.0, 3.31, 0.0, 0.0, 3.31, 0.88, 4.79, 40.0, 0.0, 90.13, 0.0, 116.0, 0.05, 11.0, 89.0, 151.0, 190.0, 0.42, 0.01, 4.0, 0.002, 2.0, 14.0, 0.05, 0.0, 1.0, 0.03, 0.15, 0.05, 0.27, 0.03, 0.22, 17.7, 0.1, 5.0, 4.0, 0.54, 0.0, 0.0, 0.25, 0.03, 0.0, 0.0),
    //01092
    Milk_dry_nonfat_instant_with_added_vitamin_A_and_vitamin_D("Milk, dry, nonfat, instant, with added vitamin A and vitamin D", 100.0, 35.1, 0.0, 0.0, 35.1, 0.72, 52.19, 358.0, 0.0, 3.96, 0.0, 1231.0, 0.31, 117.0, 985.0, 1705.0, 549.0, 4.41, 0.04, 0.0, 0.02, 27.3, 709.0, 0.01, 11.0, 5.6, 0.41, 1.74, 0.89, 3.23, 0.34, 3.99, 167.8, 0.0, 50.0, 18.0, 0.46, 0.0, 0.0, 0.18, 0.02, 0.0, 0.0),
    //01095
    Milk_canned_condensed_sweetened("Milk, canned, condensed, sweetened", 100.0, 7.91, 0.0, 33.184, 7.91, 8.7, 54.4, 321.0, 0.0, 27.16, 0.0, 284.0, 0.19, 26.0, 253.0, 371.0, 127.0, 0.94, 0.01, 0.0, 0.006, 14.8, 74.0, 0.16, 0.2, 2.6, 0.09, 0.41, 0.21, 0.75, 0.05, 0.44, 89.1, 0.6, 11.0, 34.0, 5.48, 0.0, 0.0, 2.42, 0.33, 0.0, 0.0),
    //01096
    Milk_canned_evaporated_with_added_vitamin_D_and_without_added_vitamin_A("Milk, canned, evaporated, with added vitamin D and without added vitamin A", 100.0, 6.81, 0.0, 0.0, 6.81, 7.56, 10.04, 134.0, 0.0, 74.04, 0.0, 261.0, 0.19, 24.0, 203.0, 303.0, 106.0, 0.77, 0.01, 8.5, 0.006, 2.3, 65.0, 0.14, 2.0, 1.9, 0.04, 0.31, 0.19, 0.63, 0.05, 0.16, 31.8, 0.5, 8.0, 29.0, 4.59, 0.0, 0.0, 2.33, 0.24, 0.0, 0.0),
    //01097
    Milk_canned_evaporated_nonfat_with_added_vitamin_A_and_vitamin_D("Milk, canned, evaporated, nonfat, with added vitamin A and vitamin D", 100.0, 7.55, 0.0, 0.0, 7.55, 0.2, 11.35, 78.0, 0.0, 79.4, 0.0, 290.0, 0.29, 27.0, 195.0, 332.0, 115.0, 0.9, 0.01, 8.5, 0.006, 2.5, 118.0, 0.0, 2.0, 1.2, 0.04, 0.3, 0.17, 0.73, 0.05, 0.24, 25.2, 0.0, 9.0, 4.0, 0.12, 0.0, 0.0, 0.06, 0.006, 0.0, 0.0),
    //01104
    Milk_chocolate_lowfat_with_added_vitamin_A_and_vitamin_D("Milk, chocolate, lowfat, with added vitamin A and vitamin D", 100.0, 3.46, 0.0, 0.0, 3.46, 1.0, 9.86, 62.0, 0.0, 84.91, 0.1, 129.0, 0.23, 13.0, 96.0, 172.0, 65.0, 0.43, 0.02, 0.0, 0.03, 1.9, 52.0, 0.0, 1.1, 0.4, 0.03, 0.24, 0.12, 0.43, 0.04, 0.23, 17.0, 0.1, 3.0, 5.0, 0.58, 0.0, 0.001, 0.54, 0.09, 0.02, 0.006),
    //01118
    Yogurt_plain_skim_milk_13_grams_protein_per_8_ounce("Yogurt, plain, skim milk, 13 grams protein per 8 ounce", 100.0, 5.73, 0.0, 0.0, 5.73, 0.18, 7.68, 56.0, 0.0, 85.23, 0.0, 199.0, 0.09, 19.0, 157.0, 255.0, 77.0, 0.97, 0.01, 12.0, 0.005, 3.6, 2.0, 0.0, 0.0, 0.9, 0.04, 0.23, 0.12, 0.64, 0.05, 0.61, 15.2, 0.2, 12.0, 2.0, 0.11, 0.0, 0.0, 0.04, 0.005, 0.0, 0.0),
    //01123
    Egg_whole_raw_fresh("Egg, whole, raw, fresh", 100.0, 12.56, 0.0, 0.0, 12.56, 9.51, 0.72, 143.0, 0.0, 76.15, 0.0, 56.0, 1.75, 12.0, 198.0, 138.0, 142.0, 1.29, 0.07, 1.1, 0.02, 30.7, 160.0, 1.05, 2.0, 0.0, 0.04, 0.45, 0.07, 1.53, 0.17, 0.89, 293.8, 0.3, 47.0, 372.0, 3.12, 0.05, 0.0, 3.65, 1.91, 1.53, 0.03),
    //01124
    Egg_white_raw_fresh("Egg, white, raw, fresh", 100.0, 10.9, 0.0, 0.0, 10.9, 0.17, 0.73, 52.0, 0.0, 87.57, 0.0, 7.0, 0.08, 11.0, 15.0, 163.0, 166.0, 0.03, 0.02, 0.0, 0.01, 20.0, 0.0, 0.0, 0.0, 0.0, 0.004, 0.43, 0.1, 0.19, 0.005, 0.09, 1.1, 0.0, 4.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //01129
    Egg_whole_cooked_hard_boiled("Egg, whole, cooked, hard-boiled", 100.0, 12.58, 0.0, 0.0, 12.58, 10.61, 1.12, 155.0, 0.0, 74.62, 0.0, 50.0, 1.19, 10.0, 172.0, 126.0, 124.0, 1.05, 0.01, 4.8, 0.02, 30.8, 149.0, 1.03, 2.2, 0.0, 0.06, 0.51, 0.06, 1.39, 0.12, 1.11, 293.8, 0.3, 44.0, 373.0, 3.26, 0.03, 0.005, 4.07, 1.41, 0.0, 0.0),
    //01173
    Egg_white_dried("Egg, white, dried", 100.0, 81.1, 0.0, 0.0, 81.1, 0.0, 7.8, 382.0, 0.0, 5.8, 0.0, 62.0, 0.15, 88.0, 111.0, 1125.0, 1280.0, 0.1, 0.11, 0.0, 0.007, 125.1, 0.0, 0.0, 0.0, 0.0, 0.005, 2.53, 0.86, 0.77, 0.03, 0.18, 8.4, 0.0, 18.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //01180
    Sour_cream_fat_free("Sour cream, fat free", 100.0, 3.1, 0.0, 0.0, 3.1, 0.0, 15.6, 74.0, 0.0, 80.6, 0.0, 125.0, 0.0, 10.0, 95.0, 129.0, 141.0, 0.5, 0.01, 0.0, 0.0, 5.3, 73.0, 0.0, 0.0, 0.0, 0.04, 0.15, 0.07, 0.0, 0.02, 0.3, 19.2, 0.0, 11.0, 9.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //01185
    Parmesan_cheese_topping_fat_free("Parmesan cheese topping, fat free", 100.0, 40.0, 0.0, 0.0, 40.0, 5.0, 40.0, 370.0, 0.0, 8.6, 0.0, 800.0, 5.0, 40.0, 700.0, 600.0, 1150.0, 3.0, 0.02, 0.0, 0.0, 43.3, 40.0, 0.04, 0.0, 0.0, 0.05, 0.05, 0.2, 0.0, 0.1, 1.1, 15.4, 0.4, 25.0, 20.0, 3.11, 0.0, 0.0, 1.44, 0.18, 0.0, 0.0),
    //01208
    Cheese_provolone_reduced_fat("Cheese, provolone, reduced fat", 100.0, 24.7, 0.0, 0.0, 24.7, 17.6, 3.5, 274.0, 0.0, 50.6, 0.0, 756.0, 0.52, 28.0, 496.0, 138.0, 615.0, 3.23, 0.02, 0.0, 0.01, 14.5, 141.0, 0.15, 0.3, 0.0, 0.01, 0.32, 0.15, 0.47, 0.07, 1.46, 12.9, 1.5, 10.0, 55.0, 11.3, 0.0, 0.0, 4.89, 0.51, 0.0, 0.0),
    //01256
    Yogurt_Greek_plain_nonfat("Yogurt, Greek, plain, nonfat", 100.0, 10.19, 0.0, 0.504, 10.19, 0.39, 3.6, 59.0, 0.0, 85.1, 0.0, 110.0, 0.07, 11.0, 135.0, 141.0, 36.0, 0.52, 0.01, 0.0, 0.009, 9.7, 1.0, 0.01, 0.0, 0.0, 0.02, 0.27, 0.2, 0.33, 0.06, 0.75, 15.1, 0.0, 7.0, 5.0, 0.11, 0.0, 0.0, 0.05, 0.01, 0.01, 0.001),
    //01292
    Milk_chocolate_fat_free_with_added_vitamin_A_and_vitamin_D("Milk, chocolate, fat free, with added vitamin A and vitamin D", 100.0, 3.39, 0.0, 0.0, 3.39, 0.0, 13.46, 67.0, 0.0, 82.34, 0.0, 127.0, 0.27, 13.0, 101.0, 182.0, 110.0, 0.41, 0.07, 0.0, 0.06, 1.9, 64.0, 0.04, 1.1, 1.0, 0.04, 0.16, 0.16, 0.3, 0.02, 0.32, 15.6, 0.2, 2.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //01295
    Yogurt_vanilla_non_fat("Yogurt, vanilla, non-fat", 100.0, 2.94, 0.0, 0.0, 2.94, 0.0, 17.04, 78.0, 0.0, 79.0, 0.0, 118.0, 0.0, 16.0, 88.0, 141.0, 47.0, 0.83, 0.01, 0.0, 0.004, 4.9, 61.0, 0.01, 0.9, 0.0, 0.04, 0.2, 0.1, 0.55, 0.04, 0.53, 15.6, 0.0, 11.0, 3.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //42189
    Milk_buttermilk_fluid_cultured_reduced_fat("Milk, buttermilk, fluid, cultured, reduced fat", 100.0, 4.1, 0.0, 0.0, 4.1, 2.0, 5.3, 56.0, 0.0, 87.7, 0.0, 143.0, 0.06, 13.0, 82.0, 180.0, 105.0, 0.24, 0.008, 0.0, 0.0, 2.3, 16.0, 0.11, 0.0, 1.5, 0.05, 0.21, 0.1, 0.0, 0.03, 0.37, 16.0, 0.1, 6.0, 8.0, 1.24, 0.0, 0.0, 0.57, 0.07, 0.0, 0.0),
    //42304
    Cheese_mozzarella_nonfat("Cheese, mozzarella, nonfat", 100.0, 31.7, 0.0, 0.0, 31.7, 0.0, 3.5, 141.0, 0.0, 60.2, 1.8, 961.0, 0.31, 33.0, 656.0, 106.0, 743.0, 3.92, 0.03, 0.0, 0.0, 18.9, 127.0, 0.14, 0.0, 0.0, 0.02, 0.3, 0.12, 0.0, 0.08, 0.92, 15.4, 1.6, 10.0, 18.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //43352
    Cheese_cottage_lowfat_1_milkfat_no_sodium_added("Cheese, cottage, lowfat, 1% milkfat, no sodium added", 100.0, 12.4, 0.0, 0.0, 12.4, 1.0, 2.7, 72.0, 0.0, 83.5, 0.0, 61.0, 0.14, 5.0, 134.0, 86.0, 13.0, 0.38, 0.02, 0.0, 0.0, 8.4, 11.0, 0.01, 0.0, 0.0, 0.02, 0.16, 0.13, 0.0, 0.07, 0.63, 17.5, 0.1, 12.0, 4.0, 0.63, 0.0, 0.0, 0.28, 0.03, 0.0, 0.0),
    //43589
    Cheese_swiss_low_fat("Cheese, swiss, low fat", 100.0, 28.4, 0.0, 0.0, 28.4, 5.1, 3.4, 179.0, 0.0, 59.6, 0.0, 961.0, 0.17, 36.0, 605.0, 111.0, 199.0, 3.9, 0.02, 0.0, 0.0, 12.7, 40.0, 0.07, 0.1, 0.0, 0.02, 0.36, 0.09, 0.0, 0.08, 1.68, 15.4, 0.5, 6.0, 35.0, 3.3, 0.0, 0.0, 1.35, 0.18, 0.0, 0.0);

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

    Dairy_and_egg_products(
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
        return "Dairy and egg products";
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
