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
import io.github.xjrga.foods.baked_products.*;

/**
 * This is baked products category
 */
public class Baked_products extends Category_abstract {

    private final Bagels_cinnamon_raisin bagels_cinnamon_raisin;
    private final Bread_pita_white_enriched bread_pita_white_enriched;
    private final Bread_pita_whole_wheat bread_pita_whole_wheat;
    private final Bread_rye bread_rye;
    private final Bread_white_wheat bread_white_wheat;
    private final Bagels_wheat bagels_wheat;
    private final Bread_naan_plain_commercially_prepared_refrigerated bread_naan_plain_commercially_prepared_refrigerated;
    private final Bagels_multigrain bagels_multigrain;

    /**
     * Constructs baked products category
     */
    public Baked_products() {
        set_name("Baked Products");
        bagels_cinnamon_raisin = new Bagels_cinnamon_raisin();
        bread_pita_white_enriched = new Bread_pita_white_enriched();
        bread_pita_whole_wheat = new Bread_pita_whole_wheat();
        bread_rye = new Bread_rye();
        bread_white_wheat = new Bread_white_wheat();
        bagels_wheat = new Bagels_wheat();
        bread_naan_plain_commercially_prepared_refrigerated = new Bread_naan_plain_commercially_prepared_refrigerated();
        bagels_multigrain = new Bagels_multigrain();
        add(bagels_cinnamon_raisin);
        add(bread_pita_white_enriched);
        add(bread_pita_whole_wheat);
        add(bread_rye);
        add(bread_white_wheat);
        add(bagels_wheat);
        add(bread_naan_plain_commercially_prepared_refrigerated);
        add(bagels_multigrain);
    }

    public Bagels_cinnamon_raisin get_bagels_cinnamon_raisin() {
        return bagels_cinnamon_raisin;
    }

    public Bread_pita_white_enriched get_bread_pita_white_enriched() {
        return bread_pita_white_enriched;
    }

    public Bread_pita_whole_wheat get_bread_pita_whole_wheat() {
        return bread_pita_whole_wheat;
    }

    public Bread_rye get_bread_rye() {
        return bread_rye;
    }

    public Bread_white_wheat get_bread_white_wheat() {
        return bread_white_wheat;
    }

    public Bagels_wheat get_bagels_wheat() {
        return bagels_wheat;
    }

    public Bread_naan_plain_commercially_prepared_refrigerated get_bread_naan_plain_commercially_prepared_refrigerated() {
        return bread_naan_plain_commercially_prepared_refrigerated;
    }

    public Bagels_multigrain get_bagels_multigrain() {
        return bagels_multigrain;
    }

}
