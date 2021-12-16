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
import io.github.xjrga.foods.american_indian_alaska_native_foods.*;

/**
 * This is american indian/alaska native foods category
 */
public class American_indian_alaska_native_foods extends Abstract_category {

    private final Blackberries_wild_raw_alaska_native blackberries_wild_raw_alaska_native;
    private final Blueberries_wild_frozen_alaska_native blueberries_wild_frozen_alaska_native;
    private final Blueberries_wild_raw_alaska_native blueberries_wild_raw_alaska_native;
    private final Bread_blue_corn_somiviki_hopi bread_blue_corn_somiviki_hopi;
    private final Chokecherries_raw_pitted_northern_plains_indians chokecherries_raw_pitted_northern_plains_indians;
    private final Chokecherries_raw_pitted_shoshone_bannock chokecherries_raw_pitted_shoshone_bannock;
    private final Cranberries_wild_bush_raw_alaska_native cranberries_wild_bush_raw_alaska_native;
    private final Fish_salmon_chum_raw_alaska_native fish_salmon_chum_raw_alaska_native;
    private final Fish_salmon_coho_silver_raw_alaska_native fish_salmon_coho_silver_raw_alaska_native;
    private final Fish_salmon_king_chinook_raw_alaska_native fish_salmon_king_chinook_raw_alaska_native;
    private final Fish_salmon_sockeye_red_raw_alaska_native fish_salmon_sockeye_red_raw_alaska_native;
    private final Plums_wild_northern_plains_indians plums_wild_northern_plains_indians;
    private final Prickly_pears_raw_northern_plains_indians prickly_pears_raw_northern_plains_indians;
    private final Raspberries_wild_northern_plains_indians raspberries_wild_northern_plains_indians;
    private final Tortilla_blue_corn_sakwavikaviki_hopi tortilla_blue_corn_sakwavikaviki_hopi;

    /**
     * Constructs american indian/alaska native foods category
     */
    public American_indian_alaska_native_foods() {
        set_name("American Indian/Alaska Native Foods");
        blackberries_wild_raw_alaska_native = new Blackberries_wild_raw_alaska_native();
        blueberries_wild_frozen_alaska_native = new Blueberries_wild_frozen_alaska_native();
        blueberries_wild_raw_alaska_native = new Blueberries_wild_raw_alaska_native();
        bread_blue_corn_somiviki_hopi = new Bread_blue_corn_somiviki_hopi();
        chokecherries_raw_pitted_northern_plains_indians = new Chokecherries_raw_pitted_northern_plains_indians();
        chokecherries_raw_pitted_shoshone_bannock = new Chokecherries_raw_pitted_shoshone_bannock();
        cranberries_wild_bush_raw_alaska_native = new Cranberries_wild_bush_raw_alaska_native();
        fish_salmon_chum_raw_alaska_native = new Fish_salmon_chum_raw_alaska_native();
        fish_salmon_coho_silver_raw_alaska_native = new Fish_salmon_coho_silver_raw_alaska_native();
        fish_salmon_king_chinook_raw_alaska_native = new Fish_salmon_king_chinook_raw_alaska_native();
        fish_salmon_sockeye_red_raw_alaska_native = new Fish_salmon_sockeye_red_raw_alaska_native();
        plums_wild_northern_plains_indians = new Plums_wild_northern_plains_indians();
        prickly_pears_raw_northern_plains_indians = new Prickly_pears_raw_northern_plains_indians();
        raspberries_wild_northern_plains_indians = new Raspberries_wild_northern_plains_indians();
        tortilla_blue_corn_sakwavikaviki_hopi = new Tortilla_blue_corn_sakwavikaviki_hopi();
        add(blackberries_wild_raw_alaska_native);
        add(blueberries_wild_frozen_alaska_native);
        add(blueberries_wild_raw_alaska_native);
        add(bread_blue_corn_somiviki_hopi);
        add(chokecherries_raw_pitted_northern_plains_indians);
        add(chokecherries_raw_pitted_shoshone_bannock);
        add(cranberries_wild_bush_raw_alaska_native);
        add(fish_salmon_chum_raw_alaska_native);
        add(fish_salmon_coho_silver_raw_alaska_native);
        add(fish_salmon_king_chinook_raw_alaska_native);
        add(fish_salmon_sockeye_red_raw_alaska_native);
        add(plums_wild_northern_plains_indians);
        add(prickly_pears_raw_northern_plains_indians);
        add(raspberries_wild_northern_plains_indians);
        add(tortilla_blue_corn_sakwavikaviki_hopi);
    }

    public Blackberries_wild_raw_alaska_native get_blackberries_wild_raw_alaska_native() {
        return blackberries_wild_raw_alaska_native;
    }

    public Blueberries_wild_frozen_alaska_native get_blueberries_wild_frozen_alaska_native() {
        return blueberries_wild_frozen_alaska_native;
    }

    public Food get_blueberries_wild_raw_alaska_native() {
        return blueberries_wild_raw_alaska_native;
    }

    public Food get_bread_blue_corn_somiviki_hopi() {
        return bread_blue_corn_somiviki_hopi;
    }

    public Food get_chokecherries_raw_pitted_northern_plains_indians() {
        return chokecherries_raw_pitted_northern_plains_indians;
    }

    public Food get_chokecherries_raw_pitted_shoshone_bannock() {
        return chokecherries_raw_pitted_shoshone_bannock;
    }

    public Food get_cranberries_wild_bush_raw_alaska_native() {
        return cranberries_wild_bush_raw_alaska_native;
    }

    public Food get_fish_salmon_chum_raw_alaska_native() {
        return fish_salmon_chum_raw_alaska_native;
    }

    public Food get_fish_salmon_coho_silver_raw_alaska_native() {
        return fish_salmon_coho_silver_raw_alaska_native;
    }

    public Food get_fish_salmon_king_chinook_raw_alaska_native() {
        return fish_salmon_king_chinook_raw_alaska_native;
    }

    public Food get_fish_salmon_sockeye_red_raw_alaska_native() {
        return fish_salmon_sockeye_red_raw_alaska_native;
    }

    public Food get_plums_wild_northern_plains_indians() {
        return plums_wild_northern_plains_indians;
    }

    public Food get_prickly_pears_raw_northern_plains_indians() {
        return prickly_pears_raw_northern_plains_indians;
    }

    public Food get_raspberries_wild_northern_plains_indians() {
        return raspberries_wild_northern_plains_indians;
    }

    public Food getTortilla_blue_corn_sakwavikaviki_hopi() {
        return tortilla_blue_corn_sakwavikaviki_hopi;
    }

}
