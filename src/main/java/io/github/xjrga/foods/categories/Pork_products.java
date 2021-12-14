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
import io.github.xjrga.foods.pork_products.*;

/**
 * This is pork products category
 */
public class Pork_products extends Abstract_category {

    private final Pork_fresh_loin_tenderloin_separable_lean_only_raw pork_fresh_loin_tenderloin_separable_lean_only_raw;
    private final Pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted;
    private final Pork_ground_96_lean_4_fat_raw pork_ground_96_lean_4_fat_raw;
    private final Pork_ground_96_lean_4_fat_cooked_pan_broiled pork_ground_96_lean_4_fat_cooked_pan_broiled;

    /**
     * Constructs pork products category
     */
    public Pork_products() {
        set_name("Pork Products");
        pork_fresh_loin_tenderloin_separable_lean_only_raw = new Pork_fresh_loin_tenderloin_separable_lean_only_raw();
        pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted = new Pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted();
        pork_ground_96_lean_4_fat_raw = new Pork_ground_96_lean_4_fat_raw();
        pork_ground_96_lean_4_fat_cooked_pan_broiled = new Pork_ground_96_lean_4_fat_cooked_pan_broiled();
        add(pork_fresh_loin_tenderloin_separable_lean_only_raw);
        add(pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted);
        add(pork_ground_96_lean_4_fat_raw);
        add(pork_ground_96_lean_4_fat_cooked_pan_broiled);
    }

    public Pork_fresh_loin_tenderloin_separable_lean_only_raw get_pork_fresh_loin_tenderloin_separable_lean_only_raw() {
        return pork_fresh_loin_tenderloin_separable_lean_only_raw;
    }

    public Pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted get_pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted() {
        return pork_fresh_loin_tenderloin_separable_lean_only_cooked_roasted;
    }

    public Pork_ground_96_lean_4_fat_raw get_pork_ground_96_lean_4_fat_raw() {
        return pork_ground_96_lean_4_fat_raw;
    }

    public Pork_ground_96_lean_4_fat_cooked_pan_broiled get_pork_ground_96_lean_4_fat_cooked_pan_broiled() {
        return pork_ground_96_lean_4_fat_cooked_pan_broiled;
    }

}
