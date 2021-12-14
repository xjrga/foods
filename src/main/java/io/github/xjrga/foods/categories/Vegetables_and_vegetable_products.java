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
import io.github.xjrga.foods.vegetables_and_vegetable_products.*;

/**
 * This is vegetables and vegetable products category
 */
public class Vegetables_and_vegetable_products extends Abstract_category {

    private final Asparagus_raw asparagus_raw;
    private final Asparagus_cooked_boiled_drained asparagus_cooked_boiled_drained;
    private final Beets_raw beets_raw;
    private final Beets_cooked_boiled_drained beets_cooked_boiled_drained;
    private final Beets_canned_drained_solids beets_canned_drained_solids;
    private final Broccoli_raw broccoli_raw;
    private final Broccoli_cooked_boiled_drained_without_salt broccoli_cooked_boiled_drained_without_salt;
    private final Cabbage_raw cabbage_raw;
    private final Cabbage_cooked_boiled_drained_without_salt cabbage_cooked_boiled_drained_without_salt;
    private final Cabbage_red_raw cabbage_red_raw;
    private final Cabbage_red_cooked_boiled_drained_without_salt cabbage_red_cooked_boiled_drained_without_salt;
    private final Carrots_raw carrots_raw;
    private final Carrots_cooked_boiled_drained_without_salt carrots_cooked_boiled_drained_without_salt;
    private final Cauliflower_raw cauliflower_raw;
    private final Cauliflower_cooked_boiled_drained_without_salt cauliflower_cooked_boiled_drained_without_salt;
    private final Cauliflower_frozen_unprepared cauliflower_frozen_unprepared;
    private final Cauliflower_frozen_cooked_boiled_drained_without_salt cauliflower_frozen_cooked_boiled_drained_without_salt;
    private final Celery_raw celery_raw;
    private final Celery_cooked_boiled_drained_without_salt celery_cooked_boiled_drained_without_salt;
    private final Coriander_cilantro_leaves_raw coriander_cilantro_leaves_raw;
    private final Corn_sweet_yellow_raw corn_sweet_yellow_raw;
    private final Corn_sweet_yellow_cooked_boiled_drained_without_salt corn_sweet_yellow_cooked_boiled_drained_without_salt;
    private final Cucumber_with_peel_raw cucumber_with_peel_raw;
    private final Cucumber_peeled_raw cucumber_peeled_raw;
    private final Edamame_frozen_prepared edamame_frozen_prepared;
    private final Garlic_raw garlic_raw;
    private final Ginger_root_raw ginger_root_raw;
    private final Kale_raw kale_raw;
    private final Kale_cooked_boiled_drained_without_salt kale_cooked_boiled_drained_without_salt;
    private final Mushrooms_shiitake_raw mushrooms_shiitake_raw;
    private final Mushrooms_portabella_grilled mushrooms_portabella_grilled;
    private final Lettuce_cos_or_romaine_raw lettuce_cos_or_romaine_raw;
    private final Lettuce_iceberg_includes_crisphead_types_raw lettuce_iceberg_includes_crisphead_types_raw;
    private final Lettuce_green_leaf_raw lettuce_green_leaf_raw;
    private final Lettuce_red_leaf_raw lettuce_red_leaf_raw;
    private final Mushrooms_white_raw mushrooms_white_raw;
    private final Mushrooms_white_stir_fried mushrooms_white_stir_fried;
    private final Mushrooms_portabella_raw mushrooms_portabella_raw;
    private final Mushrooms_shiitake_stir_fried mushrooms_shiitake_stir_fried;
    private final Okra_raw okra_raw;
    private final Okra_cooked_boiled_drained_without_salt okra_cooked_boiled_drained_without_salt;
    private final Onions_raw onions_raw;
    private final Onions_cooked_boiled_drained_without_salt onions_cooked_boiled_drained_without_salt;
    private final Peas_green_raw peas_green_raw;
    private final Peas_green_cooked_boiled_drained_without_salt peas_green_cooked_boiled_drained_without_salt;
    private final Peas_green_frozen_unprepared peas_green_frozen_unprepared;
    private final Peas_green_frozen_cooked_boiled_drained_without_salt peas_green_frozen_cooked_boiled_drained_without_salt;
    private final Peas_and_carrots_frozen_unprepared peas_and_carrots_frozen_unprepared;
    private final Peas_and_carrots_frozen_cooked_boiled_drained_without_salt peas_and_carrots_frozen_cooked_boiled_drained_without_salt;
    private final Peppers_sweet_green_raw peppers_sweet_green_raw;
    private final Potatoes_flesh_and_skin_raw potatoes_flesh_and_skin_raw;
    private final Potatoes_russet_flesh_and_skin_raw potatoes_russet_flesh_and_skin_raw;
    private final Potatoes_white_flesh_and_skin_raw potatoes_white_flesh_and_skin_raw;
    private final Potatoes_red_flesh_and_skin_raw potatoes_red_flesh_and_skin_raw;
    private final Potatoes_white_flesh_and_skin_baked potatoes_white_flesh_and_skin_baked;
    private final Potatoes_raw_skin potatoes_raw_skin;
    private final Potatoes_boiled_cooked_in_skin_flesh_without_salt potatoes_boiled_cooked_in_skin_flesh_without_salt;
    private final Potatoes_microwaved_cooked_in_skin_skin_without_salt potatoes_microwaved_cooked_in_skin_skin_without_salt;
    private final Radishes_raw radishes_raw;
    private final Soybeans_green_raw soybeans_green_raw;
    private final Soybeans_green_cooked_boiled_drained_without_salt soybeans_green_cooked_boiled_drained_without_salt;
    private final Soybeans_mature_seeds_sprouted_cooked_steamed soybeans_mature_seeds_sprouted_cooked_steamed;
    private final Spinach_raw spinach_raw;
    private final Spinach_cooked_boiled_drained_without_salt spinach_cooked_boiled_drained_without_salt;
    private final Spinach_canned_regular_pack_drained_solids spinach_canned_regular_pack_drained_solids;
    private final Squash_summer_zucchini_includes_skin_raw squash_summer_zucchini_includes_skin_raw;
    private final Sweet_potato_raw_unprepared sweet_potato_raw_unprepared;
    private final Sweet_potato_cooked_baked_in_skin_flesh_without_salt sweet_potato_cooked_baked_in_skin_flesh_without_salt;
    private final Tomatoes_red_ripe_raw_year_round_average tomatoes_red_ripe_raw_year_round_average;
    private final Tomato_products_canned_paste_without_salt_added tomato_products_canned_paste_without_salt_added;
    private final Tomato_products_canned_puree_without_salt_added tomato_products_canned_puree_without_salt_added;
    private final Tomato_products_canned_sauce tomato_products_canned_sauce;
    private final Vegetables_mixed_canned_drained_solids vegetables_mixed_canned_drained_solids;
    private final Vegetables_mixed_frozen_unprepared vegetables_mixed_frozen_unprepared;
    private final Yam_raw yam_raw;
    private final Yam_cooked_boiled_drained_or_baked_without_salt yam_cooked_boiled_drained_or_baked_without_salt;
    private final Yambean_jicama_raw yambean_jicama_raw;
    private final Squash_summer_all_varieties_raw squash_summer_all_varieties_raw;
    private final Squash_summer_all_varieties_cooked_boiled_drained_without_salt squash_summer_all_varieties_cooked_boiled_drained_without_salt;
    private final Squash_winter_all_varieties_raw squash_winter_all_varieties_raw;
    private final Sweet_potato_canned_syrup_pack_drained_solids sweet_potato_canned_syrup_pack_drained_solids;
    private final Carrot_juice_canned carrot_juice_canned;
    private final Potatoes_baked_flesh_and_skin_without_salt potatoes_baked_flesh_and_skin_without_salt;
    private final Peppers_sweet_red_raw peppers_sweet_red_raw;
    private final Corn_sweet_white_raw corn_sweet_white_raw;
    private final Corn_sweet_white_cooked_boiled_drained_without_salt corn_sweet_white_cooked_boiled_drained_without_salt;
    private final Catsup catsup;
    private final Catsup_low_sodium catsup_low_sodium;
    private final Tomatillos_raw tomatillos_raw;
    private final Carrots_baby_raw carrots_baby_raw;
    private final Nopales_raw nopales_raw;
    private final Nopales_cooked_without_salt nopales_cooked_without_salt;
    private final Peppers_serrano_raw peppers_serrano_raw;
    private final Peppers_jalapeno_raw peppers_jalapeno_raw;
    private final Campbells_tomato_juice campbells_tomato_juice;
    private final Campbells_tomato_juice_low_sodium campbells_tomato_juice_low_sodium;
    private final Campbells_v8_100_vegetable_juice campbells_v8_100_vegetable_juice;
    private final Campbells_v8_vegetable_juice_essential_antioxidants_v8 campbells_v8_vegetable_juice_essential_antioxidants_v8;
    private final Campbells_v8_vegetable_juice_spicy_hot_v8 campbells_v8_vegetable_juice_spicy_hot_v8;
    private final Vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added;

    /**
     * Constructs vegetables and vegetable products category
     */
    public Vegetables_and_vegetable_products() {
        set_name("Vegetables and Vegetable Products");
        asparagus_raw = new Asparagus_raw();
        asparagus_cooked_boiled_drained = new Asparagus_cooked_boiled_drained();
        beets_raw = new Beets_raw();
        beets_cooked_boiled_drained = new Beets_cooked_boiled_drained();
        beets_canned_drained_solids = new Beets_canned_drained_solids();
        broccoli_raw = new Broccoli_raw();
        broccoli_cooked_boiled_drained_without_salt = new Broccoli_cooked_boiled_drained_without_salt();
        cabbage_raw = new Cabbage_raw();
        cabbage_cooked_boiled_drained_without_salt = new Cabbage_cooked_boiled_drained_without_salt();
        cabbage_red_raw = new Cabbage_red_raw();
        cabbage_red_cooked_boiled_drained_without_salt = new Cabbage_red_cooked_boiled_drained_without_salt();
        carrots_raw = new Carrots_raw();
        carrots_cooked_boiled_drained_without_salt = new Carrots_cooked_boiled_drained_without_salt();
        cauliflower_raw = new Cauliflower_raw();
        cauliflower_cooked_boiled_drained_without_salt = new Cauliflower_cooked_boiled_drained_without_salt();
        cauliflower_frozen_unprepared = new Cauliflower_frozen_unprepared();
        cauliflower_frozen_cooked_boiled_drained_without_salt = new Cauliflower_frozen_cooked_boiled_drained_without_salt();
        celery_raw = new Celery_raw();
        celery_cooked_boiled_drained_without_salt = new Celery_cooked_boiled_drained_without_salt();
        coriander_cilantro_leaves_raw = new Coriander_cilantro_leaves_raw();
        corn_sweet_yellow_raw = new Corn_sweet_yellow_raw();
        corn_sweet_yellow_cooked_boiled_drained_without_salt = new Corn_sweet_yellow_cooked_boiled_drained_without_salt();
        cucumber_with_peel_raw = new Cucumber_with_peel_raw();
        cucumber_peeled_raw = new Cucumber_peeled_raw();
        edamame_frozen_prepared = new Edamame_frozen_prepared();
        garlic_raw = new Garlic_raw();
        ginger_root_raw = new Ginger_root_raw();
        kale_raw = new Kale_raw();
        kale_cooked_boiled_drained_without_salt = new Kale_cooked_boiled_drained_without_salt();
        mushrooms_shiitake_raw = new Mushrooms_shiitake_raw();
        mushrooms_portabella_grilled = new Mushrooms_portabella_grilled();
        lettuce_cos_or_romaine_raw = new Lettuce_cos_or_romaine_raw();
        lettuce_iceberg_includes_crisphead_types_raw = new Lettuce_iceberg_includes_crisphead_types_raw();
        lettuce_green_leaf_raw = new Lettuce_green_leaf_raw();
        lettuce_red_leaf_raw = new Lettuce_red_leaf_raw();
        mushrooms_white_raw = new Mushrooms_white_raw();
        mushrooms_white_stir_fried = new Mushrooms_white_stir_fried();
        mushrooms_portabella_raw = new Mushrooms_portabella_raw();
        mushrooms_shiitake_stir_fried = new Mushrooms_shiitake_stir_fried();
        okra_raw = new Okra_raw();
        okra_cooked_boiled_drained_without_salt = new Okra_cooked_boiled_drained_without_salt();
        onions_raw = new Onions_raw();
        onions_cooked_boiled_drained_without_salt = new Onions_cooked_boiled_drained_without_salt();
        peas_green_raw = new Peas_green_raw();
        peas_green_cooked_boiled_drained_without_salt = new Peas_green_cooked_boiled_drained_without_salt();
        peas_green_frozen_unprepared = new Peas_green_frozen_unprepared();
        peas_green_frozen_cooked_boiled_drained_without_salt = new Peas_green_frozen_cooked_boiled_drained_without_salt();
        peas_and_carrots_frozen_unprepared = new Peas_and_carrots_frozen_unprepared();
        peas_and_carrots_frozen_cooked_boiled_drained_without_salt = new Peas_and_carrots_frozen_cooked_boiled_drained_without_salt();
        peppers_sweet_green_raw = new Peppers_sweet_green_raw();
        potatoes_flesh_and_skin_raw = new Potatoes_flesh_and_skin_raw();
        potatoes_russet_flesh_and_skin_raw = new Potatoes_russet_flesh_and_skin_raw();
        potatoes_white_flesh_and_skin_raw = new Potatoes_white_flesh_and_skin_raw();
        potatoes_red_flesh_and_skin_raw = new Potatoes_red_flesh_and_skin_raw();
        potatoes_white_flesh_and_skin_baked = new Potatoes_white_flesh_and_skin_baked();
        potatoes_raw_skin = new Potatoes_raw_skin();
        potatoes_boiled_cooked_in_skin_flesh_without_salt = new Potatoes_boiled_cooked_in_skin_flesh_without_salt();
        potatoes_microwaved_cooked_in_skin_skin_without_salt = new Potatoes_microwaved_cooked_in_skin_skin_without_salt();
        radishes_raw = new Radishes_raw();
        soybeans_green_raw = new Soybeans_green_raw();
        soybeans_green_cooked_boiled_drained_without_salt = new Soybeans_green_cooked_boiled_drained_without_salt();
        soybeans_mature_seeds_sprouted_cooked_steamed = new Soybeans_mature_seeds_sprouted_cooked_steamed();
        spinach_raw = new Spinach_raw();
        spinach_cooked_boiled_drained_without_salt = new Spinach_cooked_boiled_drained_without_salt();
        spinach_canned_regular_pack_drained_solids = new Spinach_canned_regular_pack_drained_solids();
        squash_summer_zucchini_includes_skin_raw = new Squash_summer_zucchini_includes_skin_raw();
        sweet_potato_raw_unprepared = new Sweet_potato_raw_unprepared();
        sweet_potato_cooked_baked_in_skin_flesh_without_salt = new Sweet_potato_cooked_baked_in_skin_flesh_without_salt();
        tomatoes_red_ripe_raw_year_round_average = new Tomatoes_red_ripe_raw_year_round_average();
        tomato_products_canned_paste_without_salt_added = new Tomato_products_canned_paste_without_salt_added();
        tomato_products_canned_puree_without_salt_added = new Tomato_products_canned_puree_without_salt_added();
        tomato_products_canned_sauce = new Tomato_products_canned_sauce();
        vegetables_mixed_canned_drained_solids = new Vegetables_mixed_canned_drained_solids();
        vegetables_mixed_frozen_unprepared = new Vegetables_mixed_frozen_unprepared();
        yam_raw = new Yam_raw();
        yam_cooked_boiled_drained_or_baked_without_salt = new Yam_cooked_boiled_drained_or_baked_without_salt();
        yambean_jicama_raw = new Yambean_jicama_raw();
        squash_summer_all_varieties_raw = new Squash_summer_all_varieties_raw();
        squash_summer_all_varieties_cooked_boiled_drained_without_salt = new Squash_summer_all_varieties_cooked_boiled_drained_without_salt();
        squash_winter_all_varieties_raw = new Squash_winter_all_varieties_raw();
        sweet_potato_canned_syrup_pack_drained_solids = new Sweet_potato_canned_syrup_pack_drained_solids();
        carrot_juice_canned = new Carrot_juice_canned();
        potatoes_baked_flesh_and_skin_without_salt = new Potatoes_baked_flesh_and_skin_without_salt();
        peppers_sweet_red_raw = new Peppers_sweet_red_raw();
        corn_sweet_white_raw = new Corn_sweet_white_raw();
        corn_sweet_white_cooked_boiled_drained_without_salt = new Corn_sweet_white_cooked_boiled_drained_without_salt();
        catsup = new Catsup();
        catsup_low_sodium = new Catsup_low_sodium();
        tomatillos_raw = new Tomatillos_raw();
        carrots_baby_raw = new Carrots_baby_raw();
        nopales_raw = new Nopales_raw();
        nopales_cooked_without_salt = new Nopales_cooked_without_salt();
        peppers_serrano_raw = new Peppers_serrano_raw();
        peppers_jalapeno_raw = new Peppers_jalapeno_raw();
        campbells_tomato_juice = new Campbells_tomato_juice();
        campbells_tomato_juice_low_sodium = new Campbells_tomato_juice_low_sodium();
        campbells_v8_100_vegetable_juice = new Campbells_v8_100_vegetable_juice();
        campbells_v8_vegetable_juice_essential_antioxidants_v8 = new Campbells_v8_vegetable_juice_essential_antioxidants_v8();
        campbells_v8_vegetable_juice_spicy_hot_v8 = new Campbells_v8_vegetable_juice_spicy_hot_v8();
        vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added = new Vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added();
        add(asparagus_raw);
        add(asparagus_cooked_boiled_drained);
        add(beets_raw);
        add(beets_cooked_boiled_drained);
        add(beets_canned_drained_solids);
        add(broccoli_raw);
        add(broccoli_cooked_boiled_drained_without_salt);
        add(cabbage_raw);
        add(cabbage_cooked_boiled_drained_without_salt);
        add(cabbage_red_raw);
        add(cabbage_red_cooked_boiled_drained_without_salt);
        add(carrots_raw);
        add(carrots_cooked_boiled_drained_without_salt);
        add(cauliflower_raw);
        add(cauliflower_cooked_boiled_drained_without_salt);
        add(cauliflower_frozen_unprepared);
        add(cauliflower_frozen_cooked_boiled_drained_without_salt);
        add(celery_raw);
        add(celery_cooked_boiled_drained_without_salt);
        add(coriander_cilantro_leaves_raw);
        add(corn_sweet_yellow_raw);
        add(corn_sweet_yellow_cooked_boiled_drained_without_salt);
        add(cucumber_with_peel_raw);
        add(cucumber_peeled_raw);
        add(edamame_frozen_prepared);
        add(garlic_raw);
        add(ginger_root_raw);
        add(kale_raw);
        add(kale_cooked_boiled_drained_without_salt);
        add(mushrooms_shiitake_raw);
        add(mushrooms_portabella_grilled);
        add(lettuce_cos_or_romaine_raw);
        add(lettuce_iceberg_includes_crisphead_types_raw);
        add(lettuce_green_leaf_raw);
        add(lettuce_red_leaf_raw);
        add(mushrooms_white_raw);
        add(mushrooms_white_stir_fried);
        add(mushrooms_portabella_raw);
        add(mushrooms_shiitake_stir_fried);
        add(okra_raw);
        add(okra_cooked_boiled_drained_without_salt);
        add(onions_raw);
        add(onions_cooked_boiled_drained_without_salt);
        add(peas_green_raw);
        add(peas_green_cooked_boiled_drained_without_salt);
        add(peas_green_frozen_unprepared);
        add(peas_green_frozen_cooked_boiled_drained_without_salt);
        add(peas_and_carrots_frozen_unprepared);
        add(peas_and_carrots_frozen_cooked_boiled_drained_without_salt);
        add(peppers_sweet_green_raw);
        add(potatoes_flesh_and_skin_raw);
        add(potatoes_russet_flesh_and_skin_raw);
        add(potatoes_white_flesh_and_skin_raw);
        add(potatoes_red_flesh_and_skin_raw);
        add(potatoes_white_flesh_and_skin_baked);
        add(potatoes_raw_skin);
        add(potatoes_boiled_cooked_in_skin_flesh_without_salt);
        add(potatoes_microwaved_cooked_in_skin_skin_without_salt);
        add(radishes_raw);
        add(soybeans_green_raw);
        add(soybeans_green_cooked_boiled_drained_without_salt);
        add(soybeans_mature_seeds_sprouted_cooked_steamed);
        add(spinach_raw);
        add(spinach_cooked_boiled_drained_without_salt);
        add(spinach_canned_regular_pack_drained_solids);
        add(squash_summer_zucchini_includes_skin_raw);
        add(sweet_potato_raw_unprepared);
        add(sweet_potato_cooked_baked_in_skin_flesh_without_salt);
        add(tomatoes_red_ripe_raw_year_round_average);
        add(tomato_products_canned_paste_without_salt_added);
        add(tomato_products_canned_puree_without_salt_added);
        add(tomato_products_canned_sauce);
        add(vegetables_mixed_canned_drained_solids);
        add(vegetables_mixed_frozen_unprepared);
        add(yam_raw);
        add(yam_cooked_boiled_drained_or_baked_without_salt);
        add(yambean_jicama_raw);
        add(squash_summer_all_varieties_raw);
        add(squash_summer_all_varieties_cooked_boiled_drained_without_salt);
        add(squash_winter_all_varieties_raw);
        add(sweet_potato_canned_syrup_pack_drained_solids);
        add(carrot_juice_canned);
        add(potatoes_baked_flesh_and_skin_without_salt);
        add(peppers_sweet_red_raw);
        add(corn_sweet_white_raw);
        add(corn_sweet_white_cooked_boiled_drained_without_salt);
        add(catsup);
        add(catsup_low_sodium);
        add(tomatillos_raw);
        add(carrots_baby_raw);
        add(nopales_raw);
        add(nopales_cooked_without_salt);
        add(peppers_serrano_raw);
        add(peppers_jalapeno_raw);
        add(campbells_tomato_juice);
        add(campbells_tomato_juice_low_sodium);
        add(campbells_v8_100_vegetable_juice);
        add(campbells_v8_vegetable_juice_essential_antioxidants_v8);
        add(campbells_v8_vegetable_juice_spicy_hot_v8);
        add(vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added);
    }

    public Asparagus_raw getAsparagus_raw() {
        return asparagus_raw;
    }

    public Asparagus_cooked_boiled_drained get_asparagus_cooked_boiled_drained() {
        return asparagus_cooked_boiled_drained;
    }

    public Beets_raw get_beets_raw() {
        return beets_raw;
    }

    public Beets_cooked_boiled_drained get_beets_cooked_boiled_drained() {
        return beets_cooked_boiled_drained;
    }

    public Beets_canned_drained_solids get_beets_canned_drained_solids() {
        return beets_canned_drained_solids;
    }

    public Broccoli_raw get_broccoli_raw() {
        return broccoli_raw;
    }

    public Broccoli_cooked_boiled_drained_without_salt get_broccoli_cooked_boiled_drained_without_salt() {
        return broccoli_cooked_boiled_drained_without_salt;
    }

    public Cabbage_raw get_cabbage_raw() {
        return cabbage_raw;
    }

    public Cabbage_cooked_boiled_drained_without_salt get_cabbage_cooked_boiled_drained_without_salt() {
        return cabbage_cooked_boiled_drained_without_salt;
    }

    public Cabbage_red_raw get_cabbage_red_raw() {
        return cabbage_red_raw;
    }

    public Cabbage_red_cooked_boiled_drained_without_salt get_cabbage_red_cooked_boiled_drained_without_salt() {
        return cabbage_red_cooked_boiled_drained_without_salt;
    }

    public Carrots_raw get_carrots_raw() {
        return carrots_raw;
    }

    public Carrots_cooked_boiled_drained_without_salt get_carrots_cooked_boiled_drained_without_salt() {
        return carrots_cooked_boiled_drained_without_salt;
    }

    public Cauliflower_raw get_cauliflower_raw() {
        return cauliflower_raw;
    }

    public Cauliflower_cooked_boiled_drained_without_salt get_cauliflower_cooked_boiled_drained_without_salt() {
        return cauliflower_cooked_boiled_drained_without_salt;
    }

    public Cauliflower_frozen_unprepared get_cauliflower_frozen_unprepared() {
        return cauliflower_frozen_unprepared;
    }

    public Cauliflower_frozen_cooked_boiled_drained_without_salt get_cauliflower_frozen_cooked_boiled_drained_without_salt() {
        return cauliflower_frozen_cooked_boiled_drained_without_salt;
    }

    public Celery_raw get_celery_raw() {
        return celery_raw;
    }

    public Celery_cooked_boiled_drained_without_salt get_celery_cooked_boiled_drained_without_salt() {
        return celery_cooked_boiled_drained_without_salt;
    }

    public Coriander_cilantro_leaves_raw get_coriander_cilantro_leaves_raw() {
        return coriander_cilantro_leaves_raw;
    }

    public Corn_sweet_yellow_raw get_corn_sweet_yellow_raw() {
        return corn_sweet_yellow_raw;
    }

    public Corn_sweet_yellow_cooked_boiled_drained_without_salt get_corn_sweet_yellow_cooked_boiled_drained_without_salt() {
        return corn_sweet_yellow_cooked_boiled_drained_without_salt;
    }

    public Cucumber_with_peel_raw get_cucumber_with_peel_raw() {
        return cucumber_with_peel_raw;
    }

    public Cucumber_peeled_raw get_cucumber_peeled_raw() {
        return cucumber_peeled_raw;
    }

    public Edamame_frozen_prepared get_edamame_frozen_prepared() {
        return edamame_frozen_prepared;
    }

    public Garlic_raw get_garlic_raw() {
        return garlic_raw;
    }

    public Ginger_root_raw get_ginger_root_raw() {
        return ginger_root_raw;
    }

    public Kale_raw get_kale_raw() {
        return kale_raw;
    }

    public Kale_cooked_boiled_drained_without_salt get_kale_cooked_boiled_drained_without_salt() {
        return kale_cooked_boiled_drained_without_salt;
    }

    public Mushrooms_shiitake_raw get_mushrooms_shiitake_raw() {
        return mushrooms_shiitake_raw;
    }

    public Mushrooms_portabella_grilled get_mushrooms_portabella_grilled() {
        return mushrooms_portabella_grilled;
    }

    public Lettuce_cos_or_romaine_raw get_lettuce_cos_or_romaine_raw() {
        return lettuce_cos_or_romaine_raw;
    }

    public Lettuce_iceberg_includes_crisphead_types_raw get_lettuce_iceberg_includes_crisphead_types_raw() {
        return lettuce_iceberg_includes_crisphead_types_raw;
    }

    public Lettuce_green_leaf_raw get_lettuce_green_leaf_raw() {
        return lettuce_green_leaf_raw;
    }

    public Lettuce_red_leaf_raw get_lettuce_red_leaf_raw() {
        return lettuce_red_leaf_raw;
    }

    public Mushrooms_white_raw get_mushrooms_white_raw() {
        return mushrooms_white_raw;
    }

    public Mushrooms_white_stir_fried get_mushrooms_white_stir_fried() {
        return mushrooms_white_stir_fried;
    }

    public Mushrooms_portabella_raw get_mushrooms_portabella_raw() {
        return mushrooms_portabella_raw;
    }

    public Mushrooms_shiitake_stir_fried get_mushrooms_shiitake_stir_fried() {
        return mushrooms_shiitake_stir_fried;
    }

    public Okra_raw get_okra_raw() {
        return okra_raw;
    }

    public Okra_cooked_boiled_drained_without_salt get_okra_cooked_boiled_drained_without_salt() {
        return okra_cooked_boiled_drained_without_salt;
    }

    public Onions_raw get_onions_raw() {
        return onions_raw;
    }

    public Onions_cooked_boiled_drained_without_salt get_onions_cooked_boiled_drained_without_salt() {
        return onions_cooked_boiled_drained_without_salt;
    }

    public Peas_green_raw get_peas_green_raw() {
        return peas_green_raw;
    }

    public Peas_green_cooked_boiled_drained_without_salt get_peas_green_cooked_boiled_drained_without_salt() {
        return peas_green_cooked_boiled_drained_without_salt;
    }

    public Peas_green_frozen_unprepared get_peas_green_frozen_unprepared() {
        return peas_green_frozen_unprepared;
    }

    public Peas_green_frozen_cooked_boiled_drained_without_salt get_peas_green_frozen_cooked_boiled_drained_without_salt() {
        return peas_green_frozen_cooked_boiled_drained_without_salt;
    }

    public Peas_and_carrots_frozen_unprepared get_peas_and_carrots_frozen_unprepared() {
        return peas_and_carrots_frozen_unprepared;
    }

    public Peas_and_carrots_frozen_cooked_boiled_drained_without_salt get_peas_and_carrots_frozen_cooked_boiled_drained_without_salt() {
        return peas_and_carrots_frozen_cooked_boiled_drained_without_salt;
    }

    public Peppers_sweet_green_raw get_peppers_sweet_green_raw() {
        return peppers_sweet_green_raw;
    }

    public Potatoes_flesh_and_skin_raw get_potatoes_flesh_and_skin_raw() {
        return potatoes_flesh_and_skin_raw;
    }

    public Potatoes_russet_flesh_and_skin_raw get_potatoes_russet_flesh_and_skin_raw() {
        return potatoes_russet_flesh_and_skin_raw;
    }

    public Potatoes_white_flesh_and_skin_raw get_potatoes_white_flesh_and_skin_raw() {
        return potatoes_white_flesh_and_skin_raw;
    }

    public Potatoes_red_flesh_and_skin_raw get_potatoes_red_flesh_and_skin_raw() {
        return potatoes_red_flesh_and_skin_raw;
    }

    public Potatoes_white_flesh_and_skin_baked get_potatoes_white_flesh_and_skin_baked() {
        return potatoes_white_flesh_and_skin_baked;
    }

    public Potatoes_raw_skin get_potatoes_raw_skin() {
        return potatoes_raw_skin;
    }

    public Potatoes_boiled_cooked_in_skin_flesh_without_salt get_potatoes_boiled_cooked_in_skin_flesh_without_salt() {
        return potatoes_boiled_cooked_in_skin_flesh_without_salt;
    }

    public Potatoes_microwaved_cooked_in_skin_skin_without_salt get_potatoes_microwaved_cooked_in_skin_skin_without_salt() {
        return potatoes_microwaved_cooked_in_skin_skin_without_salt;
    }

    public Radishes_raw get_radishes_raw() {
        return radishes_raw;
    }

    public Soybeans_green_raw get_soybeans_green_raw() {
        return soybeans_green_raw;
    }

    public Soybeans_green_cooked_boiled_drained_without_salt get_soybeans_green_cooked_boiled_drained_without_salt() {
        return soybeans_green_cooked_boiled_drained_without_salt;
    }

    public Soybeans_mature_seeds_sprouted_cooked_steamed get_soybeans_mature_seeds_sprouted_cooked_steamed() {
        return soybeans_mature_seeds_sprouted_cooked_steamed;
    }

    public Spinach_raw get_spinach_raw() {
        return spinach_raw;
    }

    public Spinach_cooked_boiled_drained_without_salt get_spinach_cooked_boiled_drained_without_salt() {
        return spinach_cooked_boiled_drained_without_salt;
    }

    public Spinach_canned_regular_pack_drained_solids get_spinach_canned_regular_pack_drained_solids() {
        return spinach_canned_regular_pack_drained_solids;
    }

    public Squash_summer_zucchini_includes_skin_raw get_squash_summer_zucchini_includes_skin_raw() {
        return squash_summer_zucchini_includes_skin_raw;
    }

    public Sweet_potato_raw_unprepared get_sweet_potato_raw_unprepared() {
        return sweet_potato_raw_unprepared;
    }

    public Sweet_potato_cooked_baked_in_skin_flesh_without_salt get_sweet_potato_cooked_baked_in_skin_flesh_without_salt() {
        return sweet_potato_cooked_baked_in_skin_flesh_without_salt;
    }

    public Tomatoes_red_ripe_raw_year_round_average get_tomatoes_red_ripe_raw_year_round_average() {
        return tomatoes_red_ripe_raw_year_round_average;
    }

    public Tomato_products_canned_paste_without_salt_added get_tomato_products_canned_paste_without_salt_added() {
        return tomato_products_canned_paste_without_salt_added;
    }

    public Tomato_products_canned_puree_without_salt_added get_tomato_products_canned_puree_without_salt_added() {
        return tomato_products_canned_puree_without_salt_added;
    }

    public Tomato_products_canned_sauce get_tomato_products_canned_sauce() {
        return tomato_products_canned_sauce;
    }

    public Vegetables_mixed_canned_drained_solids get_vegetables_mixed_canned_drained_solids() {
        return vegetables_mixed_canned_drained_solids;
    }

    public Vegetables_mixed_frozen_unprepared get_vegetables_mixed_frozen_unprepared() {
        return vegetables_mixed_frozen_unprepared;
    }

    public Yam_raw getYam_raw() {
        return yam_raw;
    }

    public Yam_cooked_boiled_drained_or_baked_without_salt get_yam_cooked_boiled_drained_or_baked_without_salt() {
        return yam_cooked_boiled_drained_or_baked_without_salt;
    }

    public Yambean_jicama_raw get_yambean_jicama_raw() {
        return yambean_jicama_raw;
    }

    public Squash_summer_all_varieties_raw get_squash_summer_all_varieties_raw() {
        return squash_summer_all_varieties_raw;
    }

    public Squash_summer_all_varieties_cooked_boiled_drained_without_salt get_squash_summer_all_varieties_cooked_boiled_drained_without_salt() {
        return squash_summer_all_varieties_cooked_boiled_drained_without_salt;
    }

    public Squash_winter_all_varieties_raw get_squash_winter_all_varieties_raw() {
        return squash_winter_all_varieties_raw;
    }

    public Sweet_potato_canned_syrup_pack_drained_solids get_sweet_potato_canned_syrup_pack_drained_solids() {
        return sweet_potato_canned_syrup_pack_drained_solids;
    }

    public Carrot_juice_canned get_carrot_juice_canned() {
        return carrot_juice_canned;
    }

    public Potatoes_baked_flesh_and_skin_without_salt get_potatoes_baked_flesh_and_skin_without_salt() {
        return potatoes_baked_flesh_and_skin_without_salt;
    }

    public Peppers_sweet_red_raw get_peppers_sweet_red_raw() {
        return peppers_sweet_red_raw;
    }

    public Corn_sweet_white_raw get_corn_sweet_white_raw() {
        return corn_sweet_white_raw;
    }

    public Corn_sweet_white_cooked_boiled_drained_without_salt get_corn_sweet_white_cooked_boiled_drained_without_salt() {
        return corn_sweet_white_cooked_boiled_drained_without_salt;
    }

    public Catsup get_catsup() {
        return catsup;
    }

    public Catsup_low_sodium get_catsup_low_sodium() {
        return catsup_low_sodium;
    }

    public Tomatillos_raw get_tomatillos_raw() {
        return tomatillos_raw;
    }

    public Carrots_baby_raw get_carrots_baby_raw() {
        return carrots_baby_raw;
    }

    public Nopales_raw get_nopales_raw() {
        return nopales_raw;
    }

    public Nopales_cooked_without_salt get_nopales_cooked_without_salt() {
        return nopales_cooked_without_salt;
    }

    public Peppers_serrano_raw get_peppers_serrano_raw() {
        return peppers_serrano_raw;
    }

    public Peppers_jalapeno_raw get_peppers_jalapeno_raw() {
        return peppers_jalapeno_raw;
    }

    public Campbells_tomato_juice get_campbells_tomato_juice() {
        return campbells_tomato_juice;
    }

    public Campbells_tomato_juice_low_sodium get_campbells_tomato_juice_low_sodium() {
        return campbells_tomato_juice_low_sodium;
    }

    public Campbells_v8_100_vegetable_juice get_campbells_v8_100_vegetable_juice() {
        return campbells_v8_100_vegetable_juice;
    }

    public Campbells_v8_vegetable_juice_essential_antioxidants_v8 get_campbells_v8_vegetable_juice_essential_antioxidants_v8() {
        return campbells_v8_vegetable_juice_essential_antioxidants_v8;
    }

    public Campbells_v8_vegetable_juice_spicy_hot_v8 get_campbells_v8_vegetable_juice_spicy_hot_v8() {
        return campbells_v8_vegetable_juice_spicy_hot_v8;
    }

    public Vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added get_vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added() {
        return vegetables_mixed_corn_lima_beans_peas_green_beans_carrots_canned_no_salt_added;
    }

}
