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
import io.github.xjrga.foods.poultry_products.*;

/**
 * This is poultry products category
 */
public class Poultry_products extends Abstract_category {

    private final Chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw;
    private final Chicken_broilers_or_fryers_breast_meat_only_cooked_roasted chicken_broilers_or_fryers_breast_meat_only_cooked_roasted;
    private final Turkey_breast_from_whole_bird_non_enhanced_meat_only_raw turkey_breast_from_whole_bird_non_enhanced_meat_only_raw;
    private final Turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted;
    private final Ground_turkey_fat_free_raw ground_turkey_fat_free_raw;

    /**
     * Constructs poultry products category
     */
    public Poultry_products() {
        set_name("Poultry Products");
        chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw = new Chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw();
        chicken_broilers_or_fryers_breast_meat_only_cooked_roasted = new Chicken_broilers_or_fryers_breast_meat_only_cooked_roasted();
        turkey_breast_from_whole_bird_non_enhanced_meat_only_raw = new Turkey_breast_from_whole_bird_non_enhanced_meat_only_raw();
        turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted = new Turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted();
        ground_turkey_fat_free_raw = new Ground_turkey_fat_free_raw();
        add(chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw);
        add(chicken_broilers_or_fryers_breast_meat_only_cooked_roasted);
        add(turkey_breast_from_whole_bird_non_enhanced_meat_only_raw);
        add(turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted);
        add(ground_turkey_fat_free_raw);
    }

    public Chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw get_chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw() {
        return chicken_broiler_or_fryers_breast_skinless_boneless_meat_only_raw;
    }

    public Chicken_broilers_or_fryers_breast_meat_only_cooked_roasted get_chicken_broilers_or_fryers_breast_meat_only_cooked_roasted() {
        return chicken_broilers_or_fryers_breast_meat_only_cooked_roasted;
    }

    public Turkey_breast_from_whole_bird_non_enhanced_meat_only_raw get_turkey_breast_from_whole_bird_non_enhanced_meat_only_raw() {
        return turkey_breast_from_whole_bird_non_enhanced_meat_only_raw;
    }

    public Turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted get_turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted() {
        return turkey_breast_from_whole_bird_non_enhanced_meat_only_roasted;
    }

    public Ground_turkey_fat_free_raw get_ground_turkey_fat_free_raw() {
        return ground_turkey_fat_free_raw;
    }

}
