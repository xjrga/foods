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
import io.github.xjrga.foods.fruits_and_fruit_juices.*;

/**
 * This is fruits and fruit juices category
 */
public class Fruits_and_fruit_juices extends Abstract_category {

    private final Apples_raw_with_skin apples_raw_with_skin;
    private final Apricots_raw apricots_raw;
    private final Avocados_raw_all_commercial_varieties avocados_raw_all_commercial_varieties;
    private final Bananas_raw bananas_raw;
    private final Blackberries_raw blackberries_raw;
    private final Blackberries_frozen_unsweetened blackberries_frozen_unsweetened;
    private final Blueberries_raw blueberries_raw;
    private final Blueberries_frozen_unsweetened blueberries_frozen_unsweetened;
    private final Cherries_sweet_raw cherries_sweet_raw;
    private final Figs_raw figs_raw;
    private final Figs_dried_uncooked figs_dried_uncooked;
    private final Figs_dried_stewed figs_dried_stewed;
    private final Grapefruit_raw_pink_and_red_and_white_all_areas grapefruit_raw_pink_and_red_and_white_all_areas;
    private final Grapes_muscadine_raw grapes_muscadine_raw;
    private final Grapes_american_type_slip_skin_raw grapes_american_type_slip_skin_raw;
    private final Grapes_red_or_green_european_type_such_as_thompson_seedless_raw grapes_red_or_green_european_type_such_as_thompson_seedless_raw;
    private final Guavas_common_raw guavas_common_raw;
    private final Guavas_strawberry_raw guavas_strawberry_raw;
    private final Kiwifruit_green_raw kiwifruit_green_raw;
    private final Lemons_raw_without_peel lemons_raw_without_peel;
    private final Lemon_juice_raw lemon_juice_raw;
    private final Limes_raw limes_raw;
    private final Lime_juice_raw lime_juice_raw;
    private final Mangos_raw mangos_raw;
    private final Melons_cantaloupe_raw melons_cantaloupe_raw;
    private final Melons_honeydew_raw melons_honeydew_raw;
    private final Nectarines_raw nectarines_raw;
    private final Olives_ripe_canned_small_extra_large olives_ripe_canned_small_extra_large;
    private final Olives_ripe_canned_jumbo_super_colossal olives_ripe_canned_jumbo_super_colossal;
    private final Oranges_raw_all_commercial_varieties oranges_raw_all_commercial_varieties;
    private final Orange_juice_raw orange_juice_raw;
    private final Tangerines_mandarin_oranges_raw tangerines_mandarin_oranges_raw;
    private final Papayas_raw papayas_raw;
    private final Peaches_yellow_raw peaches_yellow_raw;
    private final Pears_raw pears_raw;
    private final Pineapple_raw_all_varieties pineapple_raw_all_varieties;
    private final Plums_raw plums_raw;
    private final Pomegranates_raw pomegranates_raw;
    private final Prickly_pears_raw prickly_pears_raw;
    private final Prune_juice_canned prune_juice_canned;
    private final Raisins_golden_seedless raisins_golden_seedless;
    private final Raisins_seedless raisins_seedless;
    private final Raspberries_raw raspberries_raw;
    private final Strawberries_raw strawberries_raw;
    private final Strawberries_frozen_unsweetened strawberries_frozen_unsweetened;
    private final Tamarinds_raw tamarinds_raw;
    private final Watermelon_raw watermelon_raw;
    private final Pears_asian_raw pears_asian_raw;
    private final Fruit_cocktail_canned_heavy_syrup_drained fruit_cocktail_canned_heavy_syrup_drained;
    private final Apricots_canned_heavy_syrup_drained apricots_canned_heavy_syrup_drained;
    private final Cherries_sweet_canned_pitted_heavy_syrup_drained cherries_sweet_canned_pitted_heavy_syrup_drained;
    private final Applesauce_canned_unsweetened_with_added_ascorbic_acid applesauce_canned_unsweetened_with_added_ascorbic_acid;
    private final Grapefruit_juice_pink_raw grapefruit_juice_pink_raw;
    private final Prune_puree prune_puree;
    private final Usda_commodity_peaches_canned_light_syrup_drained usda_commodity_peaches_canned_light_syrup_drained;
    private final Usda_commodity_pears_canned_light_syrup_drained usda_commodity_pears_canned_light_syrup_drained;
    private final Pomegranate_juice_bottled pomegranate_juice_bottled;

    /**
     * Constructs fruits and fruit juices category
     */
    public Fruits_and_fruit_juices() {
        set_name("Fruits and Fruit Juices");
        apples_raw_with_skin = new Apples_raw_with_skin();
        apricots_raw = new Apricots_raw();
        avocados_raw_all_commercial_varieties = new Avocados_raw_all_commercial_varieties();
        bananas_raw = new Bananas_raw();
        blackberries_raw = new Blackberries_raw();
        blackberries_frozen_unsweetened = new Blackberries_frozen_unsweetened();
        blueberries_raw = new Blueberries_raw();
        blueberries_frozen_unsweetened = new Blueberries_frozen_unsweetened();
        cherries_sweet_raw = new Cherries_sweet_raw();
        figs_raw = new Figs_raw();
        figs_dried_uncooked = new Figs_dried_uncooked();
        figs_dried_stewed = new Figs_dried_stewed();
        grapefruit_raw_pink_and_red_and_white_all_areas = new Grapefruit_raw_pink_and_red_and_white_all_areas();
        grapes_muscadine_raw = new Grapes_muscadine_raw();
        grapes_american_type_slip_skin_raw = new Grapes_american_type_slip_skin_raw();
        grapes_red_or_green_european_type_such_as_thompson_seedless_raw = new Grapes_red_or_green_european_type_such_as_thompson_seedless_raw();
        guavas_common_raw = new Guavas_common_raw();
        guavas_strawberry_raw = new Guavas_strawberry_raw();
        kiwifruit_green_raw = new Kiwifruit_green_raw();
        lemons_raw_without_peel = new Lemons_raw_without_peel();
        lemon_juice_raw = new Lemon_juice_raw();
        limes_raw = new Limes_raw();
        lime_juice_raw = new Lime_juice_raw();
        mangos_raw = new Mangos_raw();
        melons_cantaloupe_raw = new Melons_cantaloupe_raw();
        melons_honeydew_raw = new Melons_honeydew_raw();
        nectarines_raw = new Nectarines_raw();
        olives_ripe_canned_small_extra_large = new Olives_ripe_canned_small_extra_large();
        olives_ripe_canned_jumbo_super_colossal = new Olives_ripe_canned_jumbo_super_colossal();
        oranges_raw_all_commercial_varieties = new Oranges_raw_all_commercial_varieties();
        orange_juice_raw = new Orange_juice_raw();
        tangerines_mandarin_oranges_raw = new Tangerines_mandarin_oranges_raw();
        papayas_raw = new Papayas_raw();
        peaches_yellow_raw = new Peaches_yellow_raw();
        pears_raw = new Pears_raw();
        pineapple_raw_all_varieties = new Pineapple_raw_all_varieties();
        plums_raw = new Plums_raw();
        pomegranates_raw = new Pomegranates_raw();
        prickly_pears_raw = new Prickly_pears_raw();
        prune_juice_canned = new Prune_juice_canned();
        raisins_golden_seedless = new Raisins_golden_seedless();
        raisins_seedless = new Raisins_seedless();
        raspberries_raw = new Raspberries_raw();
        strawberries_raw = new Strawberries_raw();
        strawberries_frozen_unsweetened = new Strawberries_frozen_unsweetened();
        tamarinds_raw = new Tamarinds_raw();
        watermelon_raw = new Watermelon_raw();
        pears_asian_raw = new Pears_asian_raw();
        fruit_cocktail_canned_heavy_syrup_drained = new Fruit_cocktail_canned_heavy_syrup_drained();
        apricots_canned_heavy_syrup_drained = new Apricots_canned_heavy_syrup_drained();
        cherries_sweet_canned_pitted_heavy_syrup_drained = new Cherries_sweet_canned_pitted_heavy_syrup_drained();
        applesauce_canned_unsweetened_with_added_ascorbic_acid = new Applesauce_canned_unsweetened_with_added_ascorbic_acid();
        grapefruit_juice_pink_raw = new Grapefruit_juice_pink_raw();
        prune_puree = new Prune_puree();
        usda_commodity_peaches_canned_light_syrup_drained = new Usda_commodity_peaches_canned_light_syrup_drained();
        usda_commodity_pears_canned_light_syrup_drained = new Usda_commodity_pears_canned_light_syrup_drained();
        pomegranate_juice_bottled = new Pomegranate_juice_bottled();
        add(apples_raw_with_skin);
        add(apricots_raw);
        add(avocados_raw_all_commercial_varieties);
        add(bananas_raw);
        add(blackberries_raw);
        add(blackberries_frozen_unsweetened);
        add(blueberries_raw);
        add(blueberries_frozen_unsweetened);
        add(cherries_sweet_raw);
        add(figs_raw);
        add(figs_dried_uncooked);
        add(figs_dried_stewed);
        add(grapefruit_raw_pink_and_red_and_white_all_areas);
        add(grapes_muscadine_raw);
        add(grapes_american_type_slip_skin_raw);
        add(grapes_red_or_green_european_type_such_as_thompson_seedless_raw);
        add(guavas_common_raw);
        add(guavas_strawberry_raw);
        add(kiwifruit_green_raw);
        add(lemons_raw_without_peel);
        add(lemon_juice_raw);
        add(limes_raw);
        add(lime_juice_raw);
        add(mangos_raw);
        add(melons_cantaloupe_raw);
        add(melons_honeydew_raw);
        add(nectarines_raw);
        add(olives_ripe_canned_small_extra_large);
        add(olives_ripe_canned_jumbo_super_colossal);
        add(oranges_raw_all_commercial_varieties);
        add(orange_juice_raw);
        add(tangerines_mandarin_oranges_raw);
        add(papayas_raw);
        add(peaches_yellow_raw);
        add(pears_raw);
        add(pineapple_raw_all_varieties);
        add(plums_raw);
        add(pomegranates_raw);
        add(prickly_pears_raw);
        add(prune_juice_canned);
        add(raisins_golden_seedless);
        add(raisins_seedless);
        add(raspberries_raw);
        add(strawberries_raw);
        add(strawberries_frozen_unsweetened);
        add(tamarinds_raw);
        add(watermelon_raw);
        add(pears_asian_raw);
        add(fruit_cocktail_canned_heavy_syrup_drained);
        add(apricots_canned_heavy_syrup_drained);
        add(cherries_sweet_canned_pitted_heavy_syrup_drained);
        add(applesauce_canned_unsweetened_with_added_ascorbic_acid);
        add(grapefruit_juice_pink_raw);
        add(prune_puree);
        add(usda_commodity_peaches_canned_light_syrup_drained);
        add(usda_commodity_pears_canned_light_syrup_drained);
        add(pomegranate_juice_bottled);
    }

    public Apples_raw_with_skin get_apples_raw_with_skin() {
        return apples_raw_with_skin;
    }

    public Apricots_raw get_apricots_raw() {
        return apricots_raw;
    }

    public Avocados_raw_all_commercial_varieties get_avocados_raw_all_commercial_varieties() {
        return avocados_raw_all_commercial_varieties;
    }

    public Bananas_raw get_bananas_raw() {
        return bananas_raw;
    }

    public Blackberries_raw get_blackberries_raw() {
        return blackberries_raw;
    }

    public Blackberries_frozen_unsweetened get_blackberries_frozen_unsweetened() {
        return blackberries_frozen_unsweetened;
    }

    public Blueberries_raw get_blueberries_raw() {
        return blueberries_raw;
    }

    public Blueberries_frozen_unsweetened get_blueberries_frozen_unsweetened() {
        return blueberries_frozen_unsweetened;
    }

    public Cherries_sweet_raw get_cherries_sweet_raw() {
        return cherries_sweet_raw;
    }

    public Figs_raw get_figs_raw() {
        return figs_raw;
    }

    public Figs_dried_uncooked get_figs_dried_uncooked() {
        return figs_dried_uncooked;
    }

    public Figs_dried_stewed get_figs_dried_stewed() {
        return figs_dried_stewed;
    }

    public Grapefruit_raw_pink_and_red_and_white_all_areas get_grapefruit_raw_pink_and_red_and_white_all_areas() {
        return grapefruit_raw_pink_and_red_and_white_all_areas;
    }

    public Grapes_muscadine_raw get_grapes_muscadine_raw() {
        return grapes_muscadine_raw;
    }

    public Grapes_american_type_slip_skin_raw get_grapes_american_type_slip_skin_raw() {
        return grapes_american_type_slip_skin_raw;
    }

    public Grapes_red_or_green_european_type_such_as_thompson_seedless_raw get_grapes_red_or_green_european_type_such_as_thompson_seedless_raw() {
        return grapes_red_or_green_european_type_such_as_thompson_seedless_raw;
    }

    public Guavas_common_raw get_guavas_common_raw() {
        return guavas_common_raw;
    }

    public Guavas_strawberry_raw get_guavas_strawberry_raw() {
        return guavas_strawberry_raw;
    }

    public Kiwifruit_green_raw get_kiwifruit_green_raw() {
        return kiwifruit_green_raw;
    }

    public Lemons_raw_without_peel get_lemons_raw_without_peel() {
        return lemons_raw_without_peel;
    }

    public Lemon_juice_raw get_lemon_juice_raw() {
        return lemon_juice_raw;
    }

    public Limes_raw get_limes_raw() {
        return limes_raw;
    }

    public Lime_juice_raw get_lime_juice_raw() {
        return lime_juice_raw;
    }

    public Mangos_raw get_mangos_raw() {
        return mangos_raw;
    }

    public Melons_cantaloupe_raw get_melons_cantaloupe_raw() {
        return melons_cantaloupe_raw;
    }

    public Melons_honeydew_raw get_melons_honeydew_raw() {
        return melons_honeydew_raw;
    }

    public Nectarines_raw get_nectarines_raw() {
        return nectarines_raw;
    }

    public Olives_ripe_canned_small_extra_large get_olives_ripe_canned_small_extra_large() {
        return olives_ripe_canned_small_extra_large;
    }

    public Olives_ripe_canned_jumbo_super_colossal get_olives_ripe_canned_jumbo_super_colossal() {
        return olives_ripe_canned_jumbo_super_colossal;
    }

    public Oranges_raw_all_commercial_varieties get_oranges_raw_all_commercial_varieties() {
        return oranges_raw_all_commercial_varieties;
    }

    public Orange_juice_raw get_orange_juice_raw() {
        return orange_juice_raw;
    }

    public Tangerines_mandarin_oranges_raw get_tangerines_mandarin_oranges_raw() {
        return tangerines_mandarin_oranges_raw;
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

    public Pomegranates_raw get_pomegranates_raw() {
        return pomegranates_raw;
    }

    public Prickly_pears_raw get_prickly_pears_raw() {
        return prickly_pears_raw;
    }

    public Prune_juice_canned get_prune_juice_canned() {
        return prune_juice_canned;
    }

    public Raisins_golden_seedless get_raisins_golden_seedless() {
        return raisins_golden_seedless;
    }

    public Raisins_seedless get_raisins_seedless() {
        return raisins_seedless;
    }

    public Raspberries_raw get_raspberries_raw() {
        return raspberries_raw;
    }

    public Strawberries_raw get_strawberries_raw() {
        return strawberries_raw;
    }

    public Strawberries_frozen_unsweetened get_strawberries_frozen_unsweetened() {
        return strawberries_frozen_unsweetened;
    }

    public Tamarinds_raw get_tamarinds_raw() {
        return tamarinds_raw;
    }

    public Watermelon_raw get_watermelon_raw() {
        return watermelon_raw;
    }

    public Pears_asian_raw get_pears_asian_raw() {
        return pears_asian_raw;
    }

    public Fruit_cocktail_canned_heavy_syrup_drained get_fruit_cocktail_canned_heavy_syrup_drained() {
        return fruit_cocktail_canned_heavy_syrup_drained;
    }

    public Apricots_canned_heavy_syrup_drained get_apricots_canned_heavy_syrup_drained() {
        return apricots_canned_heavy_syrup_drained;
    }

    public Cherries_sweet_canned_pitted_heavy_syrup_drained get_cherries_sweet_canned_pitted_heavy_syrup_drained() {
        return cherries_sweet_canned_pitted_heavy_syrup_drained;
    }

    public Applesauce_canned_unsweetened_with_added_ascorbic_acid get_applesauce_canned_unsweetened_with_added_ascorbic_acid() {
        return applesauce_canned_unsweetened_with_added_ascorbic_acid;
    }

    public Grapefruit_juice_pink_raw get_grapefruit_juice_pink_raw() {
        return grapefruit_juice_pink_raw;
    }

    public Prune_puree get_prune_puree() {
        return prune_puree;
    }

    public Usda_commodity_peaches_canned_light_syrup_drained get_usda_commodity_peaches_canned_light_syrup_drained() {
        return usda_commodity_peaches_canned_light_syrup_drained;
    }

    public Usda_commodity_pears_canned_light_syrup_drained get_usda_commodity_pears_canned_light_syrup_drained() {
        return usda_commodity_pears_canned_light_syrup_drained;
    }

    public Pomegranate_juice_bottled get_pomegranate_juice_bottled() {
        return pomegranate_juice_bottled;
    }

}
