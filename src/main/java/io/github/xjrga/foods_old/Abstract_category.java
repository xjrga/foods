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
package io.github.xjrga.foods_old;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public abstract class Abstract_category implements Interface_category {

    private final ArrayList<Interface_food> category;
    private String name;

    public Abstract_category() {
        category = new ArrayList();
    }

    @Override
    public final void set_name(String category_name) {
        name = category_name;
    }

    @Override
    public final String get_name() {
        return name;
    }

    @Override
    public final Interface_food find(String food_name) {
        Interface_food found = null;
        Iterator<Interface_food> it = category.iterator();
        while (it.hasNext()) {
            Interface_food next = it.next();
            if (next.get_food_name().equals(food_name)) {
                found = next;
                break;
            }
        }
        return found;
    }

    @Override
    public final void add(Interface_food food) {
        category.add(food);
    }

    @Override
    public final void remove(String food_name) {
        Interface_food food = find(food_name);
        if (food != null) {
            category.remove(food);
        }
    }

    @Override
    public final Iterator<Interface_food> get_iterator() {
        return category.iterator();
    }

    @Override
    public String toString() {
        return name;
    }

}
