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
import io.github.xjrga.foods.glycemic_index_test_set.*;

/**
 * This is glycemic index test set category
 */
public class Glycemic_index_test_set extends Category_abstract {

    private final Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim;
    private final Milk_canned_condensed_sweetened milk_canned_condensed_sweetened;
    private final Yogurt_greek_plain_nonfat yogurt_greek_plain_nonfat;
    private final Cereals_ready_to_eat_kellogg_kelloggs_all_bran_original cereals_ready_to_eat_kellogg_kelloggs_all_bran_original;
    private final Cereals_oats_regular_and_quick_not_fortified_dry cereals_oats_regular_and_quick_not_fortified_dry;
    private final Apples_raw_with_skin apples_raw_with_skin;
    private final Apricots_raw apricots_raw;
    private final Bananas_raw bananas_raw;
    private final Grapefruit_raw_pink_and_red_and_white_all_areas grapefruit_raw_pink_and_red_and_white_all_areas;
    private final Grapes_red_or_green_european_type_such_as_thompson_seedless_raw grapes_red_or_green_european_type_such_as_thompson_seedless_raw;
    private final Mangos_raw mangos_raw;
    private final Melons_cantaloupe_raw melons_cantaloupe_raw;
    private final Oranges_raw_all_commercial_varieties oranges_raw_all_commercial_varieties;
    private final Orange_juice_raw orange_juice_raw;
    private final Papayas_raw papayas_raw;
    private final Peaches_yellow_raw peaches_yellow_raw;
    private final Pears_raw pears_raw;
    private final Pineapple_raw_all_varieties pineapple_raw_all_varieties;
    private final Plums_raw plums_raw;
    private final Prickly_pears_raw prickly_pears_raw;
    private final Raisins_seedless raisins_seedless;
    private final Usda_commodity_peaches_canned_light_syrup_drained usda_commodity_peaches_canned_light_syrup_drained;
    private final Beets_canned_drained_solids beets_canned_drained_solids;
    private final Carrots_raw carrots_raw;
    private final Carrots_cooked_boiled_drained_without_salt carrots_cooked_boiled_drained_without_salt;
    private final Corn_sweet_yellow_cooked_boiled_drained_without_salt corn_sweet_yellow_cooked_boiled_drained_without_salt;
    private final Peas_green_cooked_boiled_drained_without_salt peas_green_cooked_boiled_drained_without_salt;
    private final Potatoes_white_flesh_and_skin_baked potatoes_white_flesh_and_skin_baked;
    private final Soybeans_green_cooked_boiled_drained_without_salt soybeans_green_cooked_boiled_drained_without_salt;
    private final Sweet_potato_cooked_baked_in_skin_flesh_without_salt sweet_potato_cooked_baked_in_skin_flesh_without_salt;
    private final Yam_cooked_boiled_drained_or_baked_without_salt yam_cooked_boiled_drained_or_baked_without_salt;
    private final Carrot_juice_canned carrot_juice_canned;
    private final Corn_sweet_white_cooked_boiled_drained_without_salt corn_sweet_white_cooked_boiled_drained_without_salt;
    private final Glucose glucose;
    private final Beans_kidney_red_mature_seeds_cooked_boiled_without_salt beans_kidney_red_mature_seeds_cooked_boiled_without_salt;
    private final Beans_pinto_mature_seeds_cooked_boiled_without_salt beans_pinto_mature_seeds_cooked_boiled_without_salt;
    private final Lentils_mature_seeds_cooked_boiled_without_salt lentils_mature_seeds_cooked_boiled_without_salt;
    private final Soybeans_mature_cooked_boiled_without_salt soybeans_mature_cooked_boiled_without_salt;
    private final Hummus_home_prepared hummus_home_prepared;
    private final Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids;
    private final Bread_pita_white_enriched bread_pita_white_enriched;
    private final Bread_rye bread_rye;
    private final Bread_white_wheat bread_white_wheat;
    private final Snacks_pretzels_hard_plain_salted snacks_pretzels_hard_plain_salted;
    private final Honey honey;
    private final Sugars_granulated sugars_granulated;
    private final Snacks_popcorn_air_popped_unsalted snacks_popcorn_air_popped_unsalted;
    private final Snacks_tortilla_chips_low_fat_unsalted snacks_tortilla_chips_low_fat_unsalted;
    private final Barley_pearled_cooked barley_pearled_cooked;
    private final Couscous_cooked couscous_cooked;
    private final Hominy_canned_white hominy_canned_white;
    private final Millet_cooked millet_cooked;
    private final Rice_brown_long_grain_cooked rice_brown_long_grain_cooked;
    private final Rice_brown_medium_grain_cooked rice_brown_medium_grain_cooked;
    private final Rice_white_long_grain_regular_enriched_cooked rice_white_long_grain_regular_enriched_cooked;
    private final Rice_white_medium_grain_enriched_cooked rice_white_medium_grain_enriched_cooked;
    private final Rice_white_glutinous_unenriched_cooked rice_white_glutinous_unenriched_cooked;
    private final Wild_rice_cooked wild_rice_cooked;
    private final Pasta_cooked_enriched_without_added_salt pasta_cooked_enriched_without_added_salt;
    private final Hominy_canned_yellow hominy_canned_yellow;
    private final Pretzels_soft_unsalted pretzels_soft_unsalted;
    private final Campbells_tomato_juice campbells_tomato_juice;
    private final Snacks_tortilla_chips_unsalted_white_corn snacks_tortilla_chips_unsalted_white_corn;
    private final Snacks_tortilla_chips_light_baked_with_less_oil snacks_tortilla_chips_light_baked_with_less_oil;

    /**
     * Constructs glycemic index test set category
     */
    public Glycemic_index_test_set() {
        set_name("Glycemic Index Test Set");
        milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim = new Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim();
        milk_canned_condensed_sweetened = new Milk_canned_condensed_sweetened();
        yogurt_greek_plain_nonfat = new Yogurt_greek_plain_nonfat();
        cereals_ready_to_eat_kellogg_kelloggs_all_bran_original = new Cereals_ready_to_eat_kellogg_kelloggs_all_bran_original();
        cereals_oats_regular_and_quick_not_fortified_dry = new Cereals_oats_regular_and_quick_not_fortified_dry();
        apples_raw_with_skin = new Apples_raw_with_skin();
        apricots_raw = new Apricots_raw();
        bananas_raw = new Bananas_raw();
        grapefruit_raw_pink_and_red_and_white_all_areas = new Grapefruit_raw_pink_and_red_and_white_all_areas();
        grapes_red_or_green_european_type_such_as_thompson_seedless_raw = new Grapes_red_or_green_european_type_such_as_thompson_seedless_raw();
        mangos_raw = new Mangos_raw();
        melons_cantaloupe_raw = new Melons_cantaloupe_raw();
        oranges_raw_all_commercial_varieties = new Oranges_raw_all_commercial_varieties();
        orange_juice_raw = new Orange_juice_raw();
        papayas_raw = new Papayas_raw();
        peaches_yellow_raw = new Peaches_yellow_raw();
        pears_raw = new Pears_raw();
        pineapple_raw_all_varieties = new Pineapple_raw_all_varieties();
        plums_raw = new Plums_raw();
        prickly_pears_raw = new Prickly_pears_raw();
        raisins_seedless = new Raisins_seedless();
        usda_commodity_peaches_canned_light_syrup_drained = new Usda_commodity_peaches_canned_light_syrup_drained();
        beets_canned_drained_solids = new Beets_canned_drained_solids();
        carrots_raw = new Carrots_raw();
        carrots_cooked_boiled_drained_without_salt = new Carrots_cooked_boiled_drained_without_salt();
        corn_sweet_yellow_cooked_boiled_drained_without_salt = new Corn_sweet_yellow_cooked_boiled_drained_without_salt();
        peas_green_cooked_boiled_drained_without_salt = new Peas_green_cooked_boiled_drained_without_salt();
        potatoes_white_flesh_and_skin_baked = new Potatoes_white_flesh_and_skin_baked();
        soybeans_green_cooked_boiled_drained_without_salt = new Soybeans_green_cooked_boiled_drained_without_salt();
        sweet_potato_cooked_baked_in_skin_flesh_without_salt = new Sweet_potato_cooked_baked_in_skin_flesh_without_salt();
        yam_cooked_boiled_drained_or_baked_without_salt = new Yam_cooked_boiled_drained_or_baked_without_salt();
        carrot_juice_canned = new Carrot_juice_canned();
        corn_sweet_white_cooked_boiled_drained_without_salt = new Corn_sweet_white_cooked_boiled_drained_without_salt();
        glucose = new Glucose();
        beans_kidney_red_mature_seeds_cooked_boiled_without_salt = new Beans_kidney_red_mature_seeds_cooked_boiled_without_salt();
        beans_pinto_mature_seeds_cooked_boiled_without_salt = new Beans_pinto_mature_seeds_cooked_boiled_without_salt();
        lentils_mature_seeds_cooked_boiled_without_salt = new Lentils_mature_seeds_cooked_boiled_without_salt();
        soybeans_mature_cooked_boiled_without_salt = new Soybeans_mature_cooked_boiled_without_salt();
        hummus_home_prepared = new Hummus_home_prepared();
        chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids = new Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids();
        bread_pita_white_enriched = new Bread_pita_white_enriched();
        bread_rye = new Bread_rye();
        bread_white_wheat = new Bread_white_wheat();
        snacks_pretzels_hard_plain_salted = new Snacks_pretzels_hard_plain_salted();
        honey = new Honey();
        sugars_granulated = new Sugars_granulated();
        snacks_popcorn_air_popped_unsalted = new Snacks_popcorn_air_popped_unsalted();
        snacks_tortilla_chips_low_fat_unsalted = new Snacks_tortilla_chips_low_fat_unsalted();
        barley_pearled_cooked = new Barley_pearled_cooked();
        couscous_cooked = new Couscous_cooked();
        hominy_canned_white = new Hominy_canned_white();
        millet_cooked = new Millet_cooked();
        rice_brown_long_grain_cooked = new Rice_brown_long_grain_cooked();
        rice_brown_medium_grain_cooked = new Rice_brown_medium_grain_cooked();
        rice_white_long_grain_regular_enriched_cooked = new Rice_white_long_grain_regular_enriched_cooked();
        rice_white_medium_grain_enriched_cooked = new Rice_white_medium_grain_enriched_cooked();
        rice_white_glutinous_unenriched_cooked = new Rice_white_glutinous_unenriched_cooked();
        wild_rice_cooked = new Wild_rice_cooked();
        pasta_cooked_enriched_without_added_salt = new Pasta_cooked_enriched_without_added_salt();
        hominy_canned_yellow = new Hominy_canned_yellow();
        pretzels_soft_unsalted = new Pretzels_soft_unsalted();
        campbells_tomato_juice = new Campbells_tomato_juice();
        snacks_tortilla_chips_unsalted_white_corn = new Snacks_tortilla_chips_unsalted_white_corn();
        snacks_tortilla_chips_light_baked_with_less_oil = new Snacks_tortilla_chips_light_baked_with_less_oil();
        add(milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim);
        add(milk_canned_condensed_sweetened);
        add(yogurt_greek_plain_nonfat);
        add(cereals_ready_to_eat_kellogg_kelloggs_all_bran_original);
        add(cereals_oats_regular_and_quick_not_fortified_dry);
        add(apples_raw_with_skin);
        add(apricots_raw);
        add(bananas_raw);
        add(grapefruit_raw_pink_and_red_and_white_all_areas);
        add(grapes_red_or_green_european_type_such_as_thompson_seedless_raw);
        add(mangos_raw);
        add(melons_cantaloupe_raw);
        add(oranges_raw_all_commercial_varieties);
        add(orange_juice_raw);
        add(papayas_raw);
        add(peaches_yellow_raw);
        add(pears_raw);
        add(pineapple_raw_all_varieties);
        add(plums_raw);
        add(prickly_pears_raw);
        add(raisins_seedless);
        add(usda_commodity_peaches_canned_light_syrup_drained);
        add(beets_canned_drained_solids);
        add(carrots_raw);
        add(carrots_cooked_boiled_drained_without_salt);
        add(corn_sweet_yellow_cooked_boiled_drained_without_salt);
        add(peas_green_cooked_boiled_drained_without_salt);
        add(potatoes_white_flesh_and_skin_baked);
        add(soybeans_green_cooked_boiled_drained_without_salt);
        add(sweet_potato_cooked_baked_in_skin_flesh_without_salt);
        add(yam_cooked_boiled_drained_or_baked_without_salt);
        add(carrot_juice_canned);
        add(corn_sweet_white_cooked_boiled_drained_without_salt);
        add(glucose);
        add(beans_kidney_red_mature_seeds_cooked_boiled_without_salt);
        add(beans_pinto_mature_seeds_cooked_boiled_without_salt);
        add(lentils_mature_seeds_cooked_boiled_without_salt);
        add(soybeans_mature_cooked_boiled_without_salt);
        add(hummus_home_prepared);
        add(chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids);
        add(bread_pita_white_enriched);
        add(bread_rye);
        add(bread_white_wheat);
        add(snacks_pretzels_hard_plain_salted);
        add(honey);
        add(sugars_granulated);
        add(snacks_popcorn_air_popped_unsalted);
        add(snacks_tortilla_chips_low_fat_unsalted);
        add(barley_pearled_cooked);
        add(couscous_cooked);
        add(hominy_canned_white);
        add(millet_cooked);
        add(rice_brown_long_grain_cooked);
        add(rice_brown_medium_grain_cooked);
        add(rice_white_long_grain_regular_enriched_cooked);
        add(rice_white_medium_grain_enriched_cooked);
        add(rice_white_glutinous_unenriched_cooked);
        add(wild_rice_cooked);
        add(pasta_cooked_enriched_without_added_salt);
        add(hominy_canned_yellow);
        add(pretzels_soft_unsalted);
        add(campbells_tomato_juice);
        add(snacks_tortilla_chips_unsalted_white_corn);
        add(snacks_tortilla_chips_light_baked_with_less_oil);
    }

    public Milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim get_milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim() {
        return milk_nonfat_fluid_with_added_vitamin_a_and_vitamin_d_fat_free_or_skim;
    }

    public Milk_canned_condensed_sweetened get_milk_canned_condensed_sweetened() {
        return milk_canned_condensed_sweetened;
    }

    public Yogurt_greek_plain_nonfat get_yogurt_greek_plain_nonfat() {
        return yogurt_greek_plain_nonfat;
    }

    public Cereals_ready_to_eat_kellogg_kelloggs_all_bran_original get_cereals_ready_to_eat_kellogg_kelloggs_all_bran_original() {
        return cereals_ready_to_eat_kellogg_kelloggs_all_bran_original;
    }

    public Cereals_oats_regular_and_quick_not_fortified_dry get_cereals_oats_regular_and_quick_not_fortified_dry() {
        return cereals_oats_regular_and_quick_not_fortified_dry;
    }

    public Apples_raw_with_skin get_apples_raw_with_skin() {
        return apples_raw_with_skin;
    }

    public Apricots_raw get_apricots_raw() {
        return apricots_raw;
    }

    public Bananas_raw get_bananas_raw() {
        return bananas_raw;
    }

    public Grapefruit_raw_pink_and_red_and_white_all_areas get_grapefruit_raw_pink_and_red_and_white_all_areas() {
        return grapefruit_raw_pink_and_red_and_white_all_areas;
    }

    public Grapes_red_or_green_european_type_such_as_thompson_seedless_raw get_grapes_red_or_green_european_type_such_as_thompson_seedless_raw() {
        return grapes_red_or_green_european_type_such_as_thompson_seedless_raw;
    }

    public Mangos_raw get_mangos_raw() {
        return mangos_raw;
    }

    public Melons_cantaloupe_raw get_melons_cantaloupe_raw() {
        return melons_cantaloupe_raw;
    }

    public Oranges_raw_all_commercial_varieties get_oranges_raw_all_commercial_varieties() {
        return oranges_raw_all_commercial_varieties;
    }

    public Orange_juice_raw get_orange_juice_raw() {
        return orange_juice_raw;
    }

    public Papayas_raw get_papayas_raw() {
        return papayas_raw;
    }

    public Peaches_yellow_raw get_peaches_yellow_raw() {
        return peaches_yellow_raw;
    }

    public Pears_raw get_pears_raw() {
        return pears_raw;
    }

    public Pineapple_raw_all_varieties get_pineapple_raw_all_varieties() {
        return pineapple_raw_all_varieties;
    }

    public Plums_raw get_plums_raw() {
        return plums_raw;
    }

    public Prickly_pears_raw get_prickly_pears_raw() {
        return prickly_pears_raw;
    }

    public Raisins_seedless get_raisins_seedless() {
        return raisins_seedless;
    }

    public Usda_commodity_peaches_canned_light_syrup_drained get_usda_commodity_peaches_canned_light_syrup_drained() {
        return usda_commodity_peaches_canned_light_syrup_drained;
    }

    public Beets_canned_drained_solids get_beets_canned_drained_solids() {
        return beets_canned_drained_solids;
    }

    public Carrots_raw get_carrots_raw() {
        return carrots_raw;
    }

    public Carrots_cooked_boiled_drained_without_salt get_carrots_cooked_boiled_drained_without_salt() {
        return carrots_cooked_boiled_drained_without_salt;
    }

    public Corn_sweet_yellow_cooked_boiled_drained_without_salt get_corn_sweet_yellow_cooked_boiled_drained_without_salt() {
        return corn_sweet_yellow_cooked_boiled_drained_without_salt;
    }

    public Peas_green_cooked_boiled_drained_without_salt get_peas_green_cooked_boiled_drained_without_salt() {
        return peas_green_cooked_boiled_drained_without_salt;
    }

    public Potatoes_white_flesh_and_skin_baked get_potatoes_white_flesh_and_skin_baked() {
        return potatoes_white_flesh_and_skin_baked;
    }

    public Soybeans_green_cooked_boiled_drained_without_salt get_soybeans_green_cooked_boiled_drained_without_salt() {
        return soybeans_green_cooked_boiled_drained_without_salt;
    }

    public Sweet_potato_cooked_baked_in_skin_flesh_without_salt get_sweet_potato_cooked_baked_in_skin_flesh_without_salt() {
        return sweet_potato_cooked_baked_in_skin_flesh_without_salt;
    }

    public Yam_cooked_boiled_drained_or_baked_without_salt get_yam_cooked_boiled_drained_or_baked_without_salt() {
        return yam_cooked_boiled_drained_or_baked_without_salt;
    }

    public Carrot_juice_canned get_carrot_juice_canned() {
        return carrot_juice_canned;
    }

    public Corn_sweet_white_cooked_boiled_drained_without_salt get_corn_sweet_white_cooked_boiled_drained_without_salt() {
        return corn_sweet_white_cooked_boiled_drained_without_salt;
    }

    public Glucose get_glucose() {
        return glucose;
    }

    public Beans_kidney_red_mature_seeds_cooked_boiled_without_salt get_beans_kidney_red_mature_seeds_cooked_boiled_without_salt() {
        return beans_kidney_red_mature_seeds_cooked_boiled_without_salt;
    }

    public Beans_pinto_mature_seeds_cooked_boiled_without_salt get_beans_pinto_mature_seeds_cooked_boiled_without_salt() {
        return beans_pinto_mature_seeds_cooked_boiled_without_salt;
    }

    public Lentils_mature_seeds_cooked_boiled_without_salt getLentils_mature_seeds_cooked_boiled_without_salt() {
        return lentils_mature_seeds_cooked_boiled_without_salt;
    }

    public Soybeans_mature_cooked_boiled_without_salt get_soybeans_mature_cooked_boiled_without_salt() {
        return soybeans_mature_cooked_boiled_without_salt;
    }

    public Hummus_home_prepared get_hummus_home_prepared() {
        return hummus_home_prepared;
    }

    public Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids get_chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids() {
        return chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids;
    }

    public Bread_pita_white_enriched get_bread_pita_white_enriched() {
        return bread_pita_white_enriched;
    }

    public Bread_rye get_bread_rye() {
        return bread_rye;
    }

    public Bread_white_wheat get_bread_white_wheat() {
        return bread_white_wheat;
    }

    public Snacks_pretzels_hard_plain_salted get_snacks_pretzels_hard_plain_salted() {
        return snacks_pretzels_hard_plain_salted;
    }

    public Honey get_honey() {
        return honey;
    }

    public Sugars_granulated get_sugars_granulated() {
        return sugars_granulated;
    }

    public Snacks_popcorn_air_popped_unsalted get_snacks_popcorn_air_popped_unsalted() {
        return snacks_popcorn_air_popped_unsalted;
    }

    public Snacks_tortilla_chips_low_fat_unsalted get_snacks_tortilla_chips_low_fat_unsalted() {
        return snacks_tortilla_chips_low_fat_unsalted;
    }

    public Barley_pearled_cooked get_barley_pearled_cooked() {
        return barley_pearled_cooked;
    }

    public Couscous_cooked get_couscous_cooked() {
        return couscous_cooked;
    }

    public Hominy_canned_white get_hominy_canned_white() {
        return hominy_canned_white;
    }

    public Millet_cooked get_millet_cooked() {
        return millet_cooked;
    }

    public Rice_brown_long_grain_cooked get_rice_brown_long_grain_cooked() {
        return rice_brown_long_grain_cooked;
    }

    public Rice_brown_medium_grain_cooked get_rice_brown_medium_grain_cooked() {
        return rice_brown_medium_grain_cooked;
    }

    public Rice_white_long_grain_regular_enriched_cooked get_rice_white_long_grain_regular_enriched_cooked() {
        return rice_white_long_grain_regular_enriched_cooked;
    }

    public Rice_white_medium_grain_enriched_cooked get_rice_white_medium_grain_enriched_cooked() {
        return rice_white_medium_grain_enriched_cooked;
    }

    public Rice_white_glutinous_unenriched_cooked get_rice_white_glutinous_unenriched_cooked() {
        return rice_white_glutinous_unenriched_cooked;
    }

    public Wild_rice_cooked get_wild_rice_cooked() {
        return wild_rice_cooked;
    }

    public Pasta_cooked_enriched_without_added_salt get_pasta_cooked_enriched_without_added_salt() {
        return pasta_cooked_enriched_without_added_salt;
    }

    public Hominy_canned_yellow get_hominy_canned_yellow() {
        return hominy_canned_yellow;
    }

    public Pretzels_soft_unsalted get_pretzels_soft_unsalted() {
        return pretzels_soft_unsalted;
    }

    public Campbells_tomato_juice get_campbells_tomato_juice() {
        return campbells_tomato_juice;
    }

    public Snacks_tortilla_chips_unsalted_white_corn get_snacks_tortilla_chips_unsalted_white_corn() {
        return snacks_tortilla_chips_unsalted_white_corn;
    }

    public Snacks_tortilla_chips_light_baked_with_less_oil get_snacks_tortilla_chips_light_baked_with_less_oil() {
        return snacks_tortilla_chips_light_baked_with_less_oil;
    }

}
