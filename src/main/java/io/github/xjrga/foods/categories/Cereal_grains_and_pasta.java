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
import io.github.xjrga.foods.cereal_grains_and_pasta.*;

/**
 * This is cereal grains and pasta category
 */
public class Cereal_grains_and_pasta extends Category_abstract {

    private final Hominy_canned_yellow hominy_canned_yellow;
    private final Corn_grain_white corn_grain_white;
    private final Wheat_kamut_khorasan_cooked wheat_kamut_khorasan_cooked;
    private final Wheat_kamut_khorasan_uncooked wheat_kamut_khorasan_uncooked;
    private final Quinoa_cooked quinoa_cooked;
    private final Pasta_whole_wheat_dry pasta_whole_wheat_dry;
    private final Pasta_cooked_enriched_without_added_salt pasta_cooked_enriched_without_added_salt;
    private final Pasta_dry_enriched pasta_dry_enriched;
    private final Wild_rice_cooked wild_rice_cooked;
    private final Wild_rice_raw wild_rice_raw;
    private final Wheat_germ_crude wheat_germ_crude;
    private final Wheat_bran_crude wheat_bran_crude;
    private final Triticale triticale;
    private final Sorghum_grain sorghum_grain;
    private final Rye_grain rye_grain;
    private final Rice_bran_crude rice_bran_crude;
    private final Rice_white_glutinous_unenriched_cooked rice_white_glutinous_unenriched_cooked;
    private final Rice_white_glutinous_unenriched_uncooked rice_white_glutinous_unenriched_uncooked;
    private final Rice_white_short_grain_enriched_cooked rice_white_short_grain_enriched_cooked;
    private final Rice_white_short_grain_enriched_uncooked rice_white_short_grain_enriched_uncooked;
    private final Rice_white_medium_grain_enriched_cooked rice_white_medium_grain_enriched_cooked;
    private final Rice_white_medium_grain_raw_enriched rice_white_medium_grain_raw_enriched;
    private final Rice_white_long_grain_regular_enriched_cooked rice_white_long_grain_regular_enriched_cooked;
    private final Rice_white_long_grain_regular_raw_enriched rice_white_long_grain_regular_raw_enriched;
    private final Rice_brown_medium_grain_cooked rice_brown_medium_grain_cooked;
    private final Rice_brown_medium_grain_raw rice_brown_medium_grain_raw;
    private final Oats oats;
    private final Rice_brown_long_grain_cooked rice_brown_long_grain_cooked;
    private final Rice_brown_long_grain_raw rice_brown_long_grain_raw;
    private final Quinoa_uncooked quinoa_uncooked;
    private final Oat_bran_cooked oat_bran_cooked;
    private final Oat_bran_raw oat_bran_raw;
    private final Millet_cooked millet_cooked;
    private final Millet_raw millet_raw;
    private final Hominy_canned_white hominy_canned_white;
    private final Couscous_cooked couscous_cooked;
    private final Couscous_dry couscous_dry;
    private final Corn_bran_crude corn_bran_crude;
    private final Corn_grain_yellow corn_grain_yellow;
    private final Barley_pearled_cooked barley_pearled_cooked;
    private final Barley_pearled_raw barley_pearled_raw;
    private final Amaranth_grain_cooked amaranth_grain_cooked;
    private final Amaranth_grain_uncooked amaranth_grain_uncooked;

    /**
     * Constructs cereal grains and pasta category
     */
    public Cereal_grains_and_pasta() {
        set_name("Cereal Grains and Pasta");
        add(new Food_impl());
        amaranth_grain_uncooked = new Amaranth_grain_uncooked();
        amaranth_grain_cooked = new Amaranth_grain_cooked();
        barley_pearled_raw = new Barley_pearled_raw();
        barley_pearled_cooked = new Barley_pearled_cooked();
        corn_grain_yellow = new Corn_grain_yellow();
        corn_bran_crude = new Corn_bran_crude();
        couscous_dry = new Couscous_dry();
        couscous_cooked = new Couscous_cooked();
        hominy_canned_white = new Hominy_canned_white();
        millet_raw = new Millet_raw();
        millet_cooked = new Millet_cooked();
        oat_bran_raw = new Oat_bran_raw();
        oat_bran_cooked = new Oat_bran_cooked();
        quinoa_uncooked = new Quinoa_uncooked();
        rice_brown_long_grain_raw = new Rice_brown_long_grain_raw();
        rice_brown_long_grain_cooked = new Rice_brown_long_grain_cooked();
        oats = new Oats();
        rice_brown_medium_grain_raw = new Rice_brown_medium_grain_raw();
        rice_brown_medium_grain_cooked = new Rice_brown_medium_grain_cooked();
        rice_white_long_grain_regular_raw_enriched = new Rice_white_long_grain_regular_raw_enriched();
        rice_white_long_grain_regular_enriched_cooked = new Rice_white_long_grain_regular_enriched_cooked();
        rice_white_medium_grain_raw_enriched = new Rice_white_medium_grain_raw_enriched();
        rice_white_medium_grain_enriched_cooked = new Rice_white_medium_grain_enriched_cooked();
        rice_white_short_grain_enriched_uncooked = new Rice_white_short_grain_enriched_uncooked();
        rice_white_short_grain_enriched_cooked = new Rice_white_short_grain_enriched_cooked();
        rice_white_glutinous_unenriched_uncooked = new Rice_white_glutinous_unenriched_uncooked();
        rice_white_glutinous_unenriched_cooked = new Rice_white_glutinous_unenriched_cooked();
        rice_bran_crude = new Rice_bran_crude();
        rye_grain = new Rye_grain();
        sorghum_grain = new Sorghum_grain();
        triticale = new Triticale();
        wheat_bran_crude = new Wheat_bran_crude();
        wheat_germ_crude = new Wheat_germ_crude();
        wild_rice_raw = new Wild_rice_raw();
        wild_rice_cooked = new Wild_rice_cooked();
        pasta_dry_enriched = new Pasta_dry_enriched();
        pasta_cooked_enriched_without_added_salt = new Pasta_cooked_enriched_without_added_salt();
        pasta_whole_wheat_dry = new Pasta_whole_wheat_dry();
        quinoa_cooked = new Quinoa_cooked();
        wheat_kamut_khorasan_uncooked = new Wheat_kamut_khorasan_uncooked();
        wheat_kamut_khorasan_cooked = new Wheat_kamut_khorasan_cooked();
        corn_grain_white = new Corn_grain_white();
        hominy_canned_yellow = new Hominy_canned_yellow();
        add(amaranth_grain_uncooked);
        add(amaranth_grain_cooked);
        add(barley_pearled_raw);
        add(barley_pearled_cooked);
        add(corn_grain_yellow);
        add(corn_bran_crude);
        add(couscous_dry);
        add(couscous_cooked);
        add(hominy_canned_white);
        add(millet_raw);
        add(millet_cooked);
        add(oat_bran_raw);
        add(oat_bran_cooked);
        add(quinoa_uncooked);
        add(rice_brown_long_grain_raw);
        add(rice_brown_long_grain_cooked);
        add(oats);
        add(rice_brown_medium_grain_raw);
        add(rice_brown_medium_grain_cooked);
        add(rice_white_long_grain_regular_raw_enriched);
        add(rice_white_long_grain_regular_enriched_cooked);
        add(rice_white_medium_grain_raw_enriched);
        add(rice_white_medium_grain_enriched_cooked);
        add(rice_white_short_grain_enriched_uncooked);
        add(rice_white_short_grain_enriched_cooked);
        add(rice_white_glutinous_unenriched_uncooked);
        add(rice_white_glutinous_unenriched_cooked);
        add(rice_bran_crude);
        add(rye_grain);
        add(sorghum_grain);
        add(triticale);
        add(wheat_bran_crude);
        add(wheat_germ_crude);
        add(wild_rice_raw);
        add(wild_rice_cooked);
        add(pasta_dry_enriched);
        add(pasta_cooked_enriched_without_added_salt);
        add(pasta_whole_wheat_dry);
        add(quinoa_cooked);
        add(wheat_kamut_khorasan_uncooked);
        add(wheat_kamut_khorasan_cooked);
        add(corn_grain_white);
        add(hominy_canned_yellow);
    }

    public Hominy_canned_yellow get_hominy_canned_yellow() {
        return hominy_canned_yellow;
    }

    public Corn_grain_white get_corn_grain_white() {
        return corn_grain_white;
    }

    public Wheat_kamut_khorasan_cooked get_wheat_kamut_khorasan_cooked() {
        return wheat_kamut_khorasan_cooked;
    }

    public Wheat_kamut_khorasan_uncooked get_wheat_kamut_khorasan_uncooked() {
        return wheat_kamut_khorasan_uncooked;
    }

    public Quinoa_cooked get_quinoa_cooked() {
        return quinoa_cooked;
    }

    public Pasta_whole_wheat_dry get_pasta_whole_wheat_dry() {
        return pasta_whole_wheat_dry;
    }

    public Pasta_cooked_enriched_without_added_salt get_pasta_cooked_enriched_without_added_salt() {
        return pasta_cooked_enriched_without_added_salt;
    }

    public Pasta_dry_enriched get_pasta_dry_enriched() {
        return pasta_dry_enriched;
    }

    public Wild_rice_cooked get_wild_rice_cooked() {
        return wild_rice_cooked;
    }

    public Wild_rice_raw get_wild_rice_raw() {
        return wild_rice_raw;
    }

    public Wheat_germ_crude get_wheat_germ_crude() {
        return wheat_germ_crude;
    }

    public Wheat_bran_crude get_wheat_bran_crude() {
        return wheat_bran_crude;
    }

    public Triticale get_triticale() {
        return triticale;
    }

    public Sorghum_grain get_sorghum_grain() {
        return sorghum_grain;
    }

    public Rye_grain get_rye_grain() {
        return rye_grain;
    }

    public Rice_bran_crude get_rice_bran_crude() {
        return rice_bran_crude;
    }

    public Rice_white_glutinous_unenriched_cooked get_rice_white_glutinous_unenriched_cooked() {
        return rice_white_glutinous_unenriched_cooked;
    }

    public Rice_white_glutinous_unenriched_uncooked get_rice_white_glutinous_unenriched_uncooked() {
        return rice_white_glutinous_unenriched_uncooked;
    }

    public Rice_white_short_grain_enriched_cooked get_rice_white_short_grain_enriched_cooked() {
        return rice_white_short_grain_enriched_cooked;
    }

    public Rice_white_short_grain_enriched_uncooked get_rice_white_short_grain_enriched_uncooked() {
        return rice_white_short_grain_enriched_uncooked;
    }

    public Rice_white_medium_grain_enriched_cooked get_rice_white_medium_grain_enriched_cooked() {
        return rice_white_medium_grain_enriched_cooked;
    }

    public Rice_white_medium_grain_raw_enriched get_rice_white_medium_grain_raw_enriched() {
        return rice_white_medium_grain_raw_enriched;
    }

    public Rice_white_long_grain_regular_enriched_cooked get_rice_white_long_grain_regular_enriched_cooked() {
        return rice_white_long_grain_regular_enriched_cooked;
    }

    public Rice_white_long_grain_regular_raw_enriched get_rice_white_long_grain_regular_raw_enriched() {
        return rice_white_long_grain_regular_raw_enriched;
    }

    public Rice_brown_medium_grain_cooked get_rice_brown_medium_grain_cooked() {
        return rice_brown_medium_grain_cooked;
    }

    public Rice_brown_medium_grain_raw get_rice_brown_medium_grain_raw() {
        return rice_brown_medium_grain_raw;
    }

    public Oats get_oats() {
        return oats;
    }

    public Rice_brown_long_grain_cooked get_rice_brown_long_grain_cooked() {
        return rice_brown_long_grain_cooked;
    }

    public Rice_brown_long_grain_raw get_rice_brown_long_grain_raw() {
        return rice_brown_long_grain_raw;
    }

    public Quinoa_uncooked get_quinoa_uncooked() {
        return quinoa_uncooked;
    }

    public Oat_bran_cooked get_oat_bran_cooked() {
        return oat_bran_cooked;
    }

    public Oat_bran_raw get_oat_bran_raw() {
        return oat_bran_raw;
    }

    public Millet_cooked get_millet_cooked() {
        return millet_cooked;
    }

    public Millet_raw get_millet_raw() {
        return millet_raw;
    }

    public Hominy_canned_white get_hominy_canned_white() {
        return hominy_canned_white;
    }

    public Couscous_cooked get_couscous_cooked() {
        return couscous_cooked;
    }

    public Couscous_dry get_couscous_dry() {
        return couscous_dry;
    }

    public Corn_bran_crude get_corn_bran_crude() {
        return corn_bran_crude;
    }

    public Corn_grain_yellow get_corn_grain_yellow() {
        return corn_grain_yellow;
    }

    public Barley_pearled_cooked get_barley_pearled_cooked() {
        return barley_pearled_cooked;
    }

    public Barley_pearled_raw get_barley_pearled_raw() {
        return barley_pearled_raw;
    }

    public Amaranth_grain_cooked get_amaranth_grain_cooked() {
        return amaranth_grain_cooked;
    }

    public Amaranth_grain_uncooked get_amaranth_grain_uncooked() {
        return amaranth_grain_uncooked;
    }

}
