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
import java.util.Objects;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Coefficient_food {

    private final ArrayList<Interface_food> list;
    private final double[] coeffs;
    private final int size;

    public Coefficient_food(ArrayList<Interface_food> food_list, Interface_food food) {
        this.list = (ArrayList<Interface_food>) food_list.clone();
        size = list.size();
        coeffs = new double[size];
        for (int i = 0; i < size; i++) {
            Interface_food f = list.get(i);
            int a = f.equals(food) ? 1 : 0;
            coeffs[i] = a;
        }
    }

    public final double[] get_coefficients() {
        return coeffs;
    }

    private String print_food_names() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            Interface_food food = list.get(i);
            sb.append(food.get_food_name());
            sb.append("|");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    private String print_array(double[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(print_food_names());
        sb.append("\n");
        sb.append(print_array(get_coefficients()));
        return sb.toString();
    }

    @Override
    public final int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coefficient_food other = (Coefficient_food) obj;
        return Objects.equals(this.toString(), other.toString());
    }

}
