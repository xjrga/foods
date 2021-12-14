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
import io.github.xjrga.foods.spices_and_herbs.*;

/**
 * This is spices and herbs category
 */
public class Spices_and_herbs extends Abstract_category {

    private final Spices_pepper_black spices_pepper_black;
    private final Salt_table salt_table;
    private final Vinegar_balsamic vinegar_balsamic;

    /**
     * Constructs spices and herbs category
     */
    public Spices_and_herbs() {
        set_name("Spices and Herbs");
        spices_pepper_black = new Spices_pepper_black();
        salt_table = new Salt_table();
        vinegar_balsamic = new Vinegar_balsamic();
        add(spices_pepper_black);
        add(salt_table);
        add(vinegar_balsamic);
    }

    public Spices_pepper_black get_spices_pepper_black() {
        return spices_pepper_black;
    }

    public Salt_table get_salt_table() {
        return salt_table;
    }

    public Vinegar_balsamic get_vinegar_balsamic() {
        return vinegar_balsamic;
    }

}
