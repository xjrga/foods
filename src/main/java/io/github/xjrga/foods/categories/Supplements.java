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
import io.github.xjrga.foods.supplements.*;

/**
 * This is supplements category
 */
public class Supplements extends Category_abstract {

    private final Glucose glucose;
    private final Generic_multivitamin generic_multivitamin;

    /**
     * Constructs supplements category
     */
    public Supplements() {
        set_name("Supplements");
        glucose = new Glucose();
        generic_multivitamin = new Generic_multivitamin();
        add(glucose);
        add(generic_multivitamin);
    }

    public Glucose get_glucose() {
        return glucose;
    }

    public Generic_multivitamin get_generic_multivitamin() {
        return generic_multivitamin;
    }

}
