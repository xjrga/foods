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
package io.github.xjrga.foods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * This is an abstract category to extend from
 */
public class Abstract_category implements Category {

    private final List<Food> list;
    private String name;

    public Abstract_category() {
        list = new ArrayList();
    }

    @Override
    public final void set_name(String name) {
        this.name = name;
    }

    @Override
    public final String get_name() {
        return name;
    }

    @Override
    public final void add(Food food) {
        list.add(food);

    }

    @Override
    public final boolean contains(Food food) {
        return list.contains(food);
    }

    @Override
    public final Iterator<Food> iterator() {
        return list.iterator();
    }

    @Override
    public final String toString() {
        return name;
    }

    @Override
    public final int hashCode() {
        return name.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Abstract_category other = (Abstract_category) obj;
        return Objects.equals(this.name, other.name);
    }
}
