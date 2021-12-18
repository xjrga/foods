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
import io.github.xjrga.foods.nuts_and_seed_products.*;

/**
 * This is nut and seed products category
 */
public class Nuts_and_seed_products extends Category_abstract {

    private final Seeds_sunflower_seed_kernels_dry_roasted_without_salt seeds_sunflower_seed_kernels_dry_roasted_without_salt;
    private final Seeds_sunflower_seed_kernels_toasted_without_salt seeds_sunflower_seed_kernels_toasted_without_salt;
    private final Nuts_almonds nuts_almonds;
    private final Nuts_almonds_dry_roasted_without_salt_added nuts_almonds_dry_roasted_without_salt_added;
    private final Nuts_cashew_nuts_dry_roasted_without_salt_added nuts_cashew_nuts_dry_roasted_without_salt_added;
    private final Nuts_cashew_nuts_raw nuts_cashew_nuts_raw;
    private final Nuts_cashew_butter_plain_without_salt_added nuts_cashew_butter_plain_without_salt_added;
    private final Nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added;
    private final Nuts_macadamia_nuts_raw nuts_macadamia_nuts_raw;
    private final Nuts_macadamia_nuts_dry_roasted_without_salt_added nuts_macadamia_nuts_dry_roasted_without_salt_added;
    private final Nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added;
    private final Nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend;
    private final Nuts_pecans nuts_pecans;
    private final Nuts_pecans_dry_roasted_without_salt_added nuts_pecans_dry_roasted_without_salt_added;
    private final Nuts_pistachio_nuts_raw nuts_pistachio_nuts_raw;
    private final Nuts_pistachio_nuts_dry_roasted_without_salt_added nuts_pistachio_nuts_dry_roasted_without_salt_added;
    private final Nuts_walnuts_english nuts_walnuts_english;
    private final Nuts_walnuts_dry_roasted_with_salt_added nuts_walnuts_dry_roasted_with_salt_added;
    private final Nuts_almonds_honey_roasted_unblanched nuts_almonds_honey_roasted_unblanched;
    private final Seeds_flaxseed seeds_flaxseed;
    private final Seeds_flaxseed_efas seeds_flaxseed_efas;

    /**
     * Constructs nut and seed products category
     */
    public Nuts_and_seed_products() {
        set_name("Nut and Seed Products");
        seeds_sunflower_seed_kernels_dry_roasted_without_salt = new Seeds_sunflower_seed_kernels_dry_roasted_without_salt();
        seeds_sunflower_seed_kernels_toasted_without_salt = new Seeds_sunflower_seed_kernels_toasted_without_salt();
        nuts_almonds = new Nuts_almonds();
        nuts_almonds_dry_roasted_without_salt_added = new Nuts_almonds_dry_roasted_without_salt_added();
        nuts_cashew_nuts_dry_roasted_without_salt_added = new Nuts_cashew_nuts_dry_roasted_without_salt_added();
        nuts_cashew_nuts_raw = new Nuts_cashew_nuts_raw();
        nuts_cashew_butter_plain_without_salt_added = new Nuts_cashew_butter_plain_without_salt_added();
        nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added = new Nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added();
        nuts_macadamia_nuts_raw = new Nuts_macadamia_nuts_raw();
        nuts_macadamia_nuts_dry_roasted_without_salt_added = new Nuts_macadamia_nuts_dry_roasted_without_salt_added();
        nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added = new Nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added();
        nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend = new Nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend();
        nuts_pecans = new Nuts_pecans();
        nuts_pecans_dry_roasted_without_salt_added = new Nuts_pecans_dry_roasted_without_salt_added();
        nuts_pistachio_nuts_raw = new Nuts_pistachio_nuts_raw();
        nuts_pistachio_nuts_dry_roasted_without_salt_added = new Nuts_pistachio_nuts_dry_roasted_without_salt_added();
        nuts_walnuts_english = new Nuts_walnuts_english();
        nuts_walnuts_dry_roasted_with_salt_added = new Nuts_walnuts_dry_roasted_with_salt_added();
        nuts_almonds_honey_roasted_unblanched = new Nuts_almonds_honey_roasted_unblanched();
        seeds_flaxseed = new Seeds_flaxseed();
        seeds_flaxseed_efas = new Seeds_flaxseed_efas();
        add(seeds_sunflower_seed_kernels_dry_roasted_without_salt);
        add(seeds_sunflower_seed_kernels_toasted_without_salt);
        add(nuts_almonds);
        add(nuts_almonds_dry_roasted_without_salt_added);
        add(nuts_cashew_nuts_dry_roasted_without_salt_added);
        add(nuts_cashew_nuts_raw);
        add(nuts_cashew_butter_plain_without_salt_added);
        add(nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added);
        add(nuts_macadamia_nuts_raw);
        add(nuts_macadamia_nuts_dry_roasted_without_salt_added);
        add(nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added);
        add(nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend);
        add(nuts_pecans);
        add(nuts_pecans_dry_roasted_without_salt_added);
        add(nuts_pistachio_nuts_raw);
        add(nuts_pistachio_nuts_dry_roasted_without_salt_added);
        add(nuts_walnuts_english);
        add(nuts_walnuts_dry_roasted_with_salt_added);
        add(nuts_almonds_honey_roasted_unblanched);
        add(seeds_flaxseed);
        add(seeds_flaxseed_efas);
    }

    public Seeds_sunflower_seed_kernels_dry_roasted_without_salt get_seeds_sunflower_seed_kernels_dry_roasted_without_salt() {
        return seeds_sunflower_seed_kernels_dry_roasted_without_salt;
    }

    public Seeds_sunflower_seed_kernels_toasted_without_salt get_seeds_sunflower_seed_kernels_toasted_without_salt() {
        return seeds_sunflower_seed_kernels_toasted_without_salt;
    }

    public Nuts_almonds get_nuts_almonds() {
        return nuts_almonds;
    }

    public Nuts_almonds_dry_roasted_without_salt_added get_nuts_almonds_dry_roasted_without_salt_added() {
        return nuts_almonds_dry_roasted_without_salt_added;
    }

    public Nuts_cashew_nuts_dry_roasted_without_salt_added get_nuts_cashew_nuts_dry_roasted_without_salt_added() {
        return nuts_cashew_nuts_dry_roasted_without_salt_added;
    }

    public Nuts_cashew_nuts_raw get_nuts_cashew_nuts_raw() {
        return nuts_cashew_nuts_raw;
    }

    public Nuts_cashew_butter_plain_without_salt_added get_nuts_cashew_butter_plain_without_salt_added() {
        return nuts_cashew_butter_plain_without_salt_added;
    }

    public Nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added get_nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added() {
        return nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added;
    }

    public Nuts_macadamia_nuts_raw get_nuts_macadamia_nuts_raw() {
        return nuts_macadamia_nuts_raw;
    }

    public Nuts_macadamia_nuts_dry_roasted_without_salt_added get_nuts_macadamia_nuts_dry_roasted_without_salt_added() {
        return nuts_macadamia_nuts_dry_roasted_without_salt_added;
    }

    public Nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added get_nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added() {
        return nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added;
    }

    public Nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend get_nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend() {
        return nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_planters_pistachio_blend;
    }

    public Nuts_pecans get_nuts_pecans() {
        return nuts_pecans;
    }

    public Nuts_pecans_dry_roasted_without_salt_added get_nuts_pecans_dry_roasted_without_salt_added() {
        return nuts_pecans_dry_roasted_without_salt_added;
    }

    public Nuts_pistachio_nuts_raw get_nuts_pistachio_nuts_raw() {
        return nuts_pistachio_nuts_raw;
    }

    public Nuts_pistachio_nuts_dry_roasted_without_salt_added get_nuts_pistachio_nuts_dry_roasted_without_salt_added() {
        return nuts_pistachio_nuts_dry_roasted_without_salt_added;
    }

    public Nuts_walnuts_english get_nuts_walnuts_english() {
        return nuts_walnuts_english;
    }

    public Nuts_walnuts_dry_roasted_with_salt_added get_nuts_walnuts_dry_roasted_with_salt_added() {
        return nuts_walnuts_dry_roasted_with_salt_added;
    }

    public Nuts_almonds_honey_roasted_unblanched get_nuts_almonds_honey_roasted_unblanched() {
        return nuts_almonds_honey_roasted_unblanched;
    }

    public Seeds_flaxseed get_seeds_flaxseed() {
        return seeds_flaxseed;
    }

    public Seeds_flaxseed_efas get_seeds_flaxseed_efas() {
        return seeds_flaxseed_efas;
    }

}
