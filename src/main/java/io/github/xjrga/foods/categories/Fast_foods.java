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
import io.github.xjrga.foods.fast_foods.*;

/**
 * This is fast foods category
 */
public class Fast_foods extends Category_abstract {

    private final Subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato;
    private final Subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato;
    private final Subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato;

    /**
     * Constructs fast foods category
     */
    public Fast_foods() {
        set_name("Fast Foods");
        subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato = new Subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato();
        subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato = new Subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato();
        subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato = new Subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato();
        add(subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato);
        add(subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato);
        add(subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato);
    }

    public Subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato get_subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato() {
        return subway_turkey_breast_sub_on_white_bread_with_lettuce_and_tomato;
    }

    public Subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato get_subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato() {
        return subway_roast_beef_sub_on_white_bread_with_lettuce_and_tomato;
    }

    public Subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato get_subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato() {
        return subway_oven_roasted_chicken_sub_on_white_bread_with_lettuce_and_tomato;
    }

}
