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
import io.github.xjrga.foods.breakfast_cereals.*;

/**
 * This is breakfast cereals category
 */
public class Breakfast_cereals extends Category_abstract {

    private final Cereals_ready_to_eat_kellogg_kelloggs_all_bran_original cereals_ready_to_eat_kellogg_kelloggs_all_bran_original;
    private final Cereals_oats_regular_and_quick_not_fortified_dry cereals_oats_regular_and_quick_not_fortified_dry;

    /**
     * Constructs breakfast cereals category
     */
    public Breakfast_cereals() {
        set_name("Breakfast Cereals");
        cereals_ready_to_eat_kellogg_kelloggs_all_bran_original = new Cereals_ready_to_eat_kellogg_kelloggs_all_bran_original();
        cereals_oats_regular_and_quick_not_fortified_dry = new Cereals_oats_regular_and_quick_not_fortified_dry();
        add(cereals_ready_to_eat_kellogg_kelloggs_all_bran_original);
        add(cereals_oats_regular_and_quick_not_fortified_dry);
    }

    public Cereals_ready_to_eat_kellogg_kelloggs_all_bran_original get_cereals_ready_to_eat_kellogg_kellogg_s_all_bran_original() {
        return cereals_ready_to_eat_kellogg_kelloggs_all_bran_original;
    }

    public Cereals_oats_regular_and_quick_not_fortified_dry get_cereals_oats_regular_and_quick_not_fortified_dry() {
        return cereals_oats_regular_and_quick_not_fortified_dry;
    }
}
