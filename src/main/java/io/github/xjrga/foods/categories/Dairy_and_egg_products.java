/*
 * Copyright (C) 2021 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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
package io.github.xjrga.foods.categories;

import io.github.xjrga.foods.*;
import io.github.xjrga.foods.dairy_and_egg_products.*;

/**
 * This is dairy and egg products category
 */
public class Dairy_and_egg_products extends Abstract_category {

    private final Cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd;
    private final Cheese_cottage_lowfat_2_milkfat cheese_cottage_lowfat_2_milkfat;
    private final Cheese_cottage_lowfat_1_milkfat cheese_cottage_lowfat_1_milkfat;
    private final Milk_whole_3_25_milkfat_with_added_vitamin_d milk_whole_3_25_milkfat_with_added_vitamin_d;
    private final Milk_producer_fluid_3_7_milkfat milk_producer_fluid_3_7_milkfat;
    private final Milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d;
    private final Milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d;
    private final Milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d;
    private final Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim;
    private final Milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim;
    private final Milk_buttermilk_fluid_cultured_lowfat milk_buttermilk_fluid_cultured_lowfat;
    private final Milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d;
    private final Milk_canned_condensed_sweetened milk_canned_condensed_sweetened;
    private final Milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a;
    private final Milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d;
    private final Milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d;
    private final Yogurt_plain_skim_milk_13_grams_protein_per_8_ounce yogurt_plain_skim_milk_13_grams_protein_per_8_ounce;
    private final Egg_whole_raw_fresh egg_whole_raw_fresh;
    private final Egg_white_raw_fresh egg_white_raw_fresh;
    private final Egg_whole_cooked_hard_boiled egg_whole_cooked_hard_boiled;
    private final Egg_white_dried egg_white_dried;
    private final Sour_cream_fat_free sour_cream_fat_free;
    private final Parmesan_cheese_topping_fat_free parmesan_cheese_topping_fat_free;
    private final Cheese_provolone_reduced_fat cheese_provolone_reduced_fat;
    private final Yogurt_greek_plain_nonfat yogurt_greek_plain_nonfat;
    private final Milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d;
    private final Yogurt_vanilla_non_fat yogurt_vanilla_non_fat;
    private final Milk_buttermilk_fluid_cultured_reduced_fat milk_buttermilk_fluid_cultured_reduced_fat;
    private final Cheese_mozzarella_nonfat cheese_mozzarella_nonfat;
    private final Cheese_cottage_lowfat_1_milkfat_no_sodium_added cheese_cottage_lowfat_1_milkfat_no_sodium_added;
    private final Cheese_swiss_low_fat cheese_swiss_low_fat;

    /**
     * Constructs airy and egg products category
     */
    public Dairy_and_egg_products() {
        set_name("Dairy and Egg Products");
        cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd = new Cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd();
        cheese_cottage_lowfat_2_milkfat = new Cheese_cottage_lowfat_2_milkfat();
        cheese_cottage_lowfat_1_milkfat = new Cheese_cottage_lowfat_1_milkfat();
        milk_whole_3_25_milkfat_with_added_vitamin_d = new Milk_whole_3_25_milkfat_with_added_vitamin_d();
        milk_producer_fluid_3_7_milkfat = new Milk_producer_fluid_3_7_milkfat();
        milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d = new Milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d();
        milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d = new Milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d();
        milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d = new Milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d();
        milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim = new Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim();
        milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim = new Milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim();
        milk_buttermilk_fluid_cultured_lowfat = new Milk_buttermilk_fluid_cultured_lowfat();
        milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d = new Milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d();
        milk_canned_condensed_sweetened = new Milk_canned_condensed_sweetened();
        milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a = new Milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a();
        milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d = new Milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d();
        milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d = new Milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d();
        yogurt_plain_skim_milk_13_grams_protein_per_8_ounce = new Yogurt_plain_skim_milk_13_grams_protein_per_8_ounce();
        egg_whole_raw_fresh = new Egg_whole_raw_fresh();
        egg_white_raw_fresh = new Egg_white_raw_fresh();
        egg_whole_cooked_hard_boiled = new Egg_whole_cooked_hard_boiled();
        egg_white_dried = new Egg_white_dried();
        sour_cream_fat_free = new Sour_cream_fat_free();
        parmesan_cheese_topping_fat_free = new Parmesan_cheese_topping_fat_free();
        cheese_provolone_reduced_fat = new Cheese_provolone_reduced_fat();
        yogurt_greek_plain_nonfat = new Yogurt_greek_plain_nonfat();
        milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d = new Milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d();
        yogurt_vanilla_non_fat = new Yogurt_vanilla_non_fat();
        milk_buttermilk_fluid_cultured_reduced_fat = new Milk_buttermilk_fluid_cultured_reduced_fat();
        cheese_mozzarella_nonfat = new Cheese_mozzarella_nonfat();
        cheese_cottage_lowfat_1_milkfat_no_sodium_added = new Cheese_cottage_lowfat_1_milkfat_no_sodium_added();
        cheese_swiss_low_fat = new Cheese_swiss_low_fat();
        add(cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd);
        add(cheese_cottage_lowfat_2_milkfat);
        add(cheese_cottage_lowfat_1_milkfat);
        add(milk_whole_3_25_milkfat_with_added_vitamin_d);
        add(milk_producer_fluid_3_7_milkfat);
        add(milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d);
        add(milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d);
        add(milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d);
        add(milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim);
        add(milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim);
        add(milk_buttermilk_fluid_cultured_lowfat);
        add(milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d);
        add(milk_canned_condensed_sweetened);
        add(milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a);
        add(milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d);
        add(milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d);
        add(yogurt_plain_skim_milk_13_grams_protein_per_8_ounce);
        add(egg_whole_raw_fresh);
        add(egg_white_raw_fresh);
        add(egg_whole_cooked_hard_boiled);
        add(egg_white_dried);
        add(sour_cream_fat_free);
        add(parmesan_cheese_topping_fat_free);
        add(cheese_provolone_reduced_fat);
        add(yogurt_greek_plain_nonfat);
        add(milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d);
        add(yogurt_vanilla_non_fat);
        add(milk_buttermilk_fluid_cultured_reduced_fat);
        add(cheese_mozzarella_nonfat);
        add(cheese_cottage_lowfat_1_milkfat_no_sodium_added);
        add(cheese_swiss_low_fat);
    }

    public Cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd get_cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd() {
        return cheese_cottage_nonfat_uncreamed_dry_large_or_small_curd;
    }

    public Cheese_cottage_lowfat_2_milkfat get_cheese_cottage_lowfat_2_milkfat() {
        return cheese_cottage_lowfat_2_milkfat;
    }

    public Cheese_cottage_lowfat_1_milkfat get_cheese_cottage_lowfat_1_milkfat() {
        return cheese_cottage_lowfat_1_milkfat;
    }

    public Milk_whole_3_25_milkfat_with_added_vitamin_d get_milk_whole_3_25_milkfat_with_added_vitamin_d() {
        return milk_whole_3_25_milkfat_with_added_vitamin_d;
    }

    public Milk_producer_fluid_3_7_milkfat get_milk_producer_fluid_3_7_milkfat() {
        return milk_producer_fluid_3_7_milkfat;
    }

    public Milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d get_milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d() {
        return milk_reduced_fat_fluid_2_milkfat_with_added_vitamin_a_and_vitamin_d;
    }

    public Milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d get_milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d() {
        return milk_lowfat_fluid_1_milkfat_with_added_vitamin_a_and_vitamin_d;
    }

    public Milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d get_milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d() {
        return milk_lowfat_fluid_1_milkfat_protein_fortified_with_added_vitamin_a_and_vitamin_d;
    }

    public Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim get_milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim() {
        return milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim;
    }

    public Milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim get_milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim() {
        return milk_nonfat_fluid_protein_fortified_with_added_vitamin_a_and_vitamin_d_fat_free_and_skim;
    }

    public Milk_buttermilk_fluid_cultured_lowfat get_milk_buttermilk_fluid_cultured_lowfat() {
        return milk_buttermilk_fluid_cultured_lowfat;
    }

    public Milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d get_milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d() {
        return milk_dry_nonfat_instant_with_added_vitamin_a_and_vitamin_d;
    }

    public Milk_canned_condensed_sweetened get_milk_canned_condensed_sweetened() {
        return milk_canned_condensed_sweetened;
    }

    public Milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a get_milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a() {
        return milk_canned_evaporated_with_added_vitamin_d_and_without_added_vitamin_a;
    }

    public Milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d get_milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d() {
        return milk_canned_evaporated_nonfat_with_added_vitamin_a_and_vitamin_d;
    }

    public Milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d get_milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d() {
        return milk_chocolate_lowfat_with_added_vitamin_a_and_vitamin_d;
    }

    public Yogurt_plain_skim_milk_13_grams_protein_per_8_ounce get_yogurt_plain_skim_milk_13_grams_protein_per_8_ounce() {
        return yogurt_plain_skim_milk_13_grams_protein_per_8_ounce;
    }

    public Egg_whole_raw_fresh get_egg_whole_raw_fresh() {
        return egg_whole_raw_fresh;
    }

    public Egg_white_raw_fresh get_egg_white_raw_fresh() {
        return egg_white_raw_fresh;
    }

    public Egg_whole_cooked_hard_boiled get_egg_whole_cooked_hard_boiled() {
        return egg_whole_cooked_hard_boiled;
    }

    public Egg_white_dried get_egg_white_dried() {
        return egg_white_dried;
    }

    public Sour_cream_fat_free get_sour_cream_fat_free() {
        return sour_cream_fat_free;
    }

    public Parmesan_cheese_topping_fat_free get_parmesan_cheese_topping_fat_free() {
        return parmesan_cheese_topping_fat_free;
    }

    public Cheese_provolone_reduced_fat get_cheese_provolone_reduced_fat() {
        return cheese_provolone_reduced_fat;
    }

    public Yogurt_greek_plain_nonfat get_yogurt_greek_plain_nonfat() {
        return yogurt_greek_plain_nonfat;
    }

    public Milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d get_milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d() {
        return milk_chocolate_fat_free_with_added_vitamin_a_and_vitamin_d;
    }

    public Yogurt_vanilla_non_fat get_yogurt_vanilla_non_fat() {
        return yogurt_vanilla_non_fat;
    }

    public Milk_buttermilk_fluid_cultured_reduced_fat get_milk_buttermilk_fluid_cultured_reduced_fat() {
        return milk_buttermilk_fluid_cultured_reduced_fat;
    }

    public Cheese_mozzarella_nonfat get_cheese_mozzarella_nonfat() {
        return cheese_mozzarella_nonfat;
    }

    public Cheese_cottage_lowfat_1_milkfat_no_sodium_added get_cheese_cottage_lowfat_1_milkfat_no_sodium_added() {
        return cheese_cottage_lowfat_1_milkfat_no_sodium_added;
    }

    public Cheese_swiss_low_fat get_cheese_swiss_low_fat() {
        return cheese_swiss_low_fat;
    }

}
