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
import io.github.xjrga.foods.protein_powders.*;

/**
 * This is protein powders category
 */
public class Protein_powders extends Abstract_category {

    private final Egg_white_dried egg_white_dried;
    private final Whey_protein_concentrate whey_protein_concentrate;
    private final Soy_protein_isolate soy_protein_isolate;

    /**
     * Constructs protein powders category
     */
    public Protein_powders() {
        set_name("Protein Powders");
        egg_white_dried = new Egg_white_dried();
        whey_protein_concentrate = new Whey_protein_concentrate();
        soy_protein_isolate = new Soy_protein_isolate();
        add(egg_white_dried);
        add(whey_protein_concentrate);
        add(soy_protein_isolate);
    }

    public Egg_white_dried get_egg_white_dried() {
        return egg_white_dried;
    }

    public Whey_protein_concentrate get_whey_protein_concentrate() {
        return whey_protein_concentrate;
    }

    public Soy_protein_isolate get_soy_protein_isolate() {
        return soy_protein_isolate;
    }

}
