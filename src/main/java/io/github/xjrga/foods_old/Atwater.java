/*
 * Copyright (C) 2022 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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

/**
 * Nutrients subset from USDA National Nutrient Database for Standard Reference,
 * Release 28 except complete protein, digestible carbohydrate, cost, glycemic
 * load, energy digestible, energy no protein, energy carbohydrate, energy
 * protein, energy fat and energy alcohol which I added.
 *
 */
public enum Atwater {
    PROTEIN(4.0),
    FAT(9.0),
    CARBOHYDRATE_BY_DIFFERENCE(4.0),
    ALCOHOL(6.93);

    private final Double factor;

    Atwater(Double factor) {
        this.factor = factor;
    }

    public Double get_factor() {
        return factor;
    }
}
