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
import io.github.xjrga.foods.finfish_and_shellfish_products.*;

/**
 * This is finfish and shellfish products category
 */
public class Finfish_and_shellfish_products extends Category_abstract {

    private final Fish_mahimahi_raw fish_mahimahi_raw;
    private final Fish_salmon_atlantic_wild_raw fish_salmon_atlantic_wild_raw;
    private final Fish_salmon_pink_raw fish_salmon_pink_raw;
    private final Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone;
    private final Fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone;
    private final Fish_tuna_light_canned_in_oil_drained_solids fish_tuna_light_canned_in_oil_drained_solids;
    private final Fish_tuna_light_canned_in_water_drained_solids fish_tuna_light_canned_in_water_drained_solids;
    private final Fish_tuna_white_canned_in_oil_drained_solids fish_tuna_white_canned_in_oil_drained_solids;
    private final Fish_tuna_white_canned_in_water_drained_solids fish_tuna_white_canned_in_water_drained_solids;
    private final Fish_mahimahi_cooked_dry_heat fish_mahimahi_cooked_dry_heat;
    private final Fish_salmon_atlantic_wild_cooked_dry_heat fish_salmon_atlantic_wild_cooked_dry_heat;
    private final Fish_salmon_pink_cooked_dry_heat fish_salmon_pink_cooked_dry_heat;
    private final Fish_salmon_atlantic_farmed_raw fish_salmon_atlantic_farmed_raw;
    private final Fish_salmon_atlantic_farmed_cooked_dry_heat fish_salmon_atlantic_farmed_cooked_dry_heat;
    private final Fish_tilapia_raw fish_tilapia_raw;
    private final Fish_tilapia_cooked_dry_heat fish_tilapia_cooked_dry_heat;
    private final Crustaceans_shrimp_raw_not_previously_frozen crustaceans_shrimp_raw_not_previously_frozen;

    /**
     * Constructs finfish and shellfish products category
     */
    public Finfish_and_shellfish_products() {
        set_name("Finfish and Shellfish Products");
        fish_mahimahi_raw = new Fish_mahimahi_raw();
        fish_salmon_atlantic_wild_raw = new Fish_salmon_atlantic_wild_raw();
        fish_salmon_pink_raw = new Fish_salmon_pink_raw();
        fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone = new Fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone();
        fish_tuna_light_canned_in_oil_drained_solids = new Fish_tuna_light_canned_in_oil_drained_solids();
        fish_tuna_light_canned_in_water_drained_solids = new Fish_tuna_light_canned_in_water_drained_solids();
        fish_tuna_white_canned_in_oil_drained_solids = new Fish_tuna_white_canned_in_oil_drained_solids();
        fish_tuna_white_canned_in_water_drained_solids = new Fish_tuna_white_canned_in_water_drained_solids();
        fish_mahimahi_cooked_dry_heat = new Fish_mahimahi_cooked_dry_heat();
        fish_salmon_atlantic_wild_cooked_dry_heat = new Fish_salmon_atlantic_wild_cooked_dry_heat();
        fish_salmon_pink_cooked_dry_heat = new Fish_salmon_pink_cooked_dry_heat();
        fish_salmon_atlantic_farmed_raw = new Fish_salmon_atlantic_farmed_raw();
        fish_salmon_atlantic_farmed_cooked_dry_heat = new Fish_salmon_atlantic_farmed_cooked_dry_heat();
        fish_tilapia_raw = new Fish_tilapia_raw();
        fish_tilapia_cooked_dry_heat = new Fish_tilapia_cooked_dry_heat();
        crustaceans_shrimp_raw_not_previously_frozen = new Crustaceans_shrimp_raw_not_previously_frozen();
        add(fish_mahimahi_raw);
        add(fish_salmon_atlantic_wild_raw);
        add(fish_salmon_pink_raw);
        add(fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone);
        add(fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone);
        add(fish_tuna_light_canned_in_oil_drained_solids);
        add(fish_tuna_light_canned_in_water_drained_solids);
        add(fish_tuna_white_canned_in_oil_drained_solids);
        add(fish_tuna_white_canned_in_water_drained_solids);
        add(fish_mahimahi_cooked_dry_heat);
        add(fish_salmon_atlantic_wild_cooked_dry_heat);
        add(fish_salmon_pink_cooked_dry_heat);
        add(fish_salmon_atlantic_farmed_raw);
        add(fish_salmon_atlantic_farmed_cooked_dry_heat);
        add(fish_tilapia_raw);
        add(fish_tilapia_cooked_dry_heat);
        add(crustaceans_shrimp_raw_not_previously_frozen);
    }

    public Fish_mahimahi_raw get_fish_mahimahi_raw() {
        return fish_mahimahi_raw;
    }

    public Fish_salmon_atlantic_wild_raw get_fish_salmon_atlantic_wild_raw() {
        return fish_salmon_atlantic_wild_raw;
    }

    public Fish_salmon_pink_raw get_fish_salmon_pink_raw() {
        return fish_salmon_pink_raw;
    }

    public Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone get_fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone() {
        return fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone;
    }

    public Fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone get_fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone() {
        return fish_sardine_pacific_canned_in_tomato_sauce_drained_solids_with_bone;
    }

    public Fish_tuna_light_canned_in_oil_drained_solids get_fish_tuna_light_canned_in_oil_drained_solids() {
        return fish_tuna_light_canned_in_oil_drained_solids;
    }

    public Fish_tuna_light_canned_in_water_drained_solids get_fish_tuna_light_canned_in_water_drained_solids() {
        return fish_tuna_light_canned_in_water_drained_solids;
    }

    public Fish_tuna_white_canned_in_oil_drained_solids get_fish_tuna_white_canned_in_oil_drained_solids() {
        return fish_tuna_white_canned_in_oil_drained_solids;
    }

    public Fish_tuna_white_canned_in_water_drained_solids get_fish_tuna_white_canned_in_water_drained_solids() {
        return fish_tuna_white_canned_in_water_drained_solids;
    }

    public Fish_mahimahi_cooked_dry_heat get_fish_mahimahi_cooked_dry_heat() {
        return fish_mahimahi_cooked_dry_heat;
    }

    public Fish_salmon_atlantic_wild_cooked_dry_heat get_fish_salmon_atlantic_wild_cooked_dry_heat() {
        return fish_salmon_atlantic_wild_cooked_dry_heat;
    }

    public Fish_salmon_pink_cooked_dry_heat get_fish_salmon_pink_cooked_dry_heat() {
        return fish_salmon_pink_cooked_dry_heat;
    }

    public Fish_salmon_atlantic_farmed_raw get_fish_salmon_atlantic_farmed_raw() {
        return fish_salmon_atlantic_farmed_raw;
    }

    public Fish_salmon_atlantic_farmed_cooked_dry_heat get_fish_salmon_atlantic_farmed_cooked_dry_heat() {
        return fish_salmon_atlantic_farmed_cooked_dry_heat;
    }

    public Fish_tilapia_raw get_fish_tilapia_raw() {
        return fish_tilapia_raw;
    }

    public Fish_tilapia_cooked_dry_heat get_fish_tilapia_cooked_dry_heat() {
        return fish_tilapia_cooked_dry_heat;
    }

    public Crustaceans_shrimp_raw_not_previously_frozen get_crustaceans_shrimp_raw_not_previously_frozen() {
        return crustaceans_shrimp_raw_not_previously_frozen;
    }

}
