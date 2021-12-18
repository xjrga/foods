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

import io.github.xjrga.foods.omega_3.Fish_oil_menhaden;
import io.github.xjrga.foods.omega_3.Fish_oil_herring;
import io.github.xjrga.foods.omega_3.Fish_oil_sardine;
import io.github.xjrga.foods.omega_3.Seeds_flaxseed_efas;
import io.github.xjrga.foods.omega_3.Oil_flaxseed_cold_pressed;
import io.github.xjrga.foods.omega_3.Fish_oil_cod_liver;
import io.github.xjrga.foods.omega_3.Fish_oil_salmon;
import io.github.xjrga.foods.*;

/**
 * This is omega-3 category
 */
public class Omega_3 extends Category_abstract {

    private final Fish_oil_cod_liver fish_oil_cod_liver;
    private final Fish_oil_herring fish_oil_herring;
    private final Fish_oil_menhaden fish_oil_menhaden;
    private final Fish_oil_salmon fish_oil_salmon;
    private final Fish_oil_sardine fish_oil_sardine;
    private final Oil_flaxseed_cold_pressed oil_flaxseed_cold_pressed;
    private final Seeds_flaxseed_efas seeds_flaxseed_efas;

    /**
     * Constructs omega-3 category
     */
    public Omega_3() {
        set_name("Omega-3");
        fish_oil_cod_liver = new Fish_oil_cod_liver();
        fish_oil_herring = new Fish_oil_herring();
        fish_oil_menhaden = new Fish_oil_menhaden();
        fish_oil_salmon = new Fish_oil_salmon();
        fish_oil_sardine = new Fish_oil_sardine();
        oil_flaxseed_cold_pressed = new Oil_flaxseed_cold_pressed();
        seeds_flaxseed_efas = new Seeds_flaxseed_efas();
        add(fish_oil_cod_liver);
        add(fish_oil_herring);
        add(fish_oil_menhaden);
        add(fish_oil_salmon);
        add(fish_oil_sardine);
        add(oil_flaxseed_cold_pressed);
        add(seeds_flaxseed_efas);

    }

    public Fish_oil_cod_liver get_fish_oil_cod_liver() {
        return fish_oil_cod_liver;
    }

    public Fish_oil_herring get_fish_oil_herring() {
        return fish_oil_herring;
    }

    public Fish_oil_menhaden get_fish_oil_menhaden() {
        return fish_oil_menhaden;
    }

    public Fish_oil_salmon get_fish_oil_salmon() {
        return fish_oil_salmon;
    }

    public Fish_oil_sardine get_fish_oil_sardine() {
        return fish_oil_sardine;
    }

    public Oil_flaxseed_cold_pressed get_oil_flaxseed_cold_pressed() {
        return oil_flaxseed_cold_pressed;
    }

    public Seeds_flaxseed_efas get_seeds_flaxseed_efas() {
        return seeds_flaxseed_efas;
    }

}
