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
import io.github.xjrga.foods.baby_foods.*;

/**
 * This is baby foods category
 */
public class Baby_foods extends Abstract_category {

    private final Babyfood_dessert_custard_pudding_vanilla_junior babyfood_dessert_custard_pudding_vanilla_junior;

    /**
     * Constructs baby foods category
     */
    public Baby_foods() {
        set_name("Baby Foods");
        babyfood_dessert_custard_pudding_vanilla_junior = new Babyfood_dessert_custard_pudding_vanilla_junior();
        add(babyfood_dessert_custard_pudding_vanilla_junior);
    }

    public Babyfood_dessert_custard_pudding_vanilla_junior get_babyfood_dessert_custard_pudding_vanilla_junior() {
        return babyfood_dessert_custard_pudding_vanilla_junior;
    }

}
