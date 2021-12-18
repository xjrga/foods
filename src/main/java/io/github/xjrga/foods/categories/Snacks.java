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
import io.github.xjrga.foods.snacks.*;

/**
 * This is snacks category
 */
public class Snacks extends Category_abstract {

    private final Snacks_pretzels_hard_plain_salted snacks_pretzels_hard_plain_salted;
    private final Snacks_trail_mix_regular snacks_trail_mix_regular;
    private final Snacks_popcorn_air_popped_unsalted snacks_popcorn_air_popped_unsalted;
    private final Snacks_rice_cakes_brown_rice_plain_unsalted snacks_rice_cakes_brown_rice_plain_unsalted;
    private final Snacks_rice_cakes_brown_rice_multigrain_unsalted snacks_rice_cakes_brown_rice_multigrain_unsalted;
    private final Snacks_trail_mix_regular_unsalted snacks_trail_mix_regular_unsalted;
    private final Snacks_tortilla_chips_low_fat_unsalted snacks_tortilla_chips_low_fat_unsalted;
    private final Snacks_popcorn_microwave_94_fat_free snacks_popcorn_microwave_94_fat_free;
    private final Snacks_sweet_potato_chips_unsalted snacks_sweet_potato_chips_unsalted;
    private final Pretzels_soft_unsalted pretzels_soft_unsalted;
    private final Snacks_pita_chips_salted snacks_pita_chips_salted;
    private final Snacks_tortilla_chips_unsalted_white_corn snacks_tortilla_chips_unsalted_white_corn;
    private final Snacks_tortilla_chips_light_baked_with_less_oil snacks_tortilla_chips_light_baked_with_less_oil;

    /**
     * Constructs snacks category
     */
    public Snacks() {
        set_name("Snacks");
        snacks_pretzels_hard_plain_salted = new Snacks_pretzels_hard_plain_salted();
        snacks_trail_mix_regular = new Snacks_trail_mix_regular();
        snacks_popcorn_air_popped_unsalted = new Snacks_popcorn_air_popped_unsalted();
        snacks_rice_cakes_brown_rice_plain_unsalted = new Snacks_rice_cakes_brown_rice_plain_unsalted();
        snacks_rice_cakes_brown_rice_multigrain_unsalted = new Snacks_rice_cakes_brown_rice_multigrain_unsalted();
        snacks_trail_mix_regular_unsalted = new Snacks_trail_mix_regular_unsalted();
        snacks_tortilla_chips_low_fat_unsalted = new Snacks_tortilla_chips_low_fat_unsalted();
        snacks_popcorn_microwave_94_fat_free = new Snacks_popcorn_microwave_94_fat_free();
        snacks_sweet_potato_chips_unsalted = new Snacks_sweet_potato_chips_unsalted();
        pretzels_soft_unsalted = new Pretzels_soft_unsalted();
        snacks_pita_chips_salted = new Snacks_pita_chips_salted();
        snacks_tortilla_chips_unsalted_white_corn = new Snacks_tortilla_chips_unsalted_white_corn();
        snacks_tortilla_chips_light_baked_with_less_oil = new Snacks_tortilla_chips_light_baked_with_less_oil();
        add(snacks_pretzels_hard_plain_salted);
        add(snacks_trail_mix_regular);
        add(snacks_popcorn_air_popped_unsalted);
        add(snacks_rice_cakes_brown_rice_plain_unsalted);
        add(snacks_rice_cakes_brown_rice_multigrain_unsalted);
        add(snacks_trail_mix_regular_unsalted);
        add(snacks_tortilla_chips_low_fat_unsalted);
        add(snacks_popcorn_microwave_94_fat_free);
        add(snacks_sweet_potato_chips_unsalted);
        add(pretzels_soft_unsalted);
        add(snacks_pita_chips_salted);
        add(snacks_tortilla_chips_unsalted_white_corn);
        add(snacks_tortilla_chips_light_baked_with_less_oil);
    }

    public Snacks_pretzels_hard_plain_salted get_snacks_pretzels_hard_plain_salted() {
        return snacks_pretzels_hard_plain_salted;
    }

    public Snacks_trail_mix_regular get_snacks_trail_mix_regular() {
        return snacks_trail_mix_regular;
    }

    public Snacks_popcorn_air_popped_unsalted get_snacks_popcorn_air_popped_unsalted() {
        return snacks_popcorn_air_popped_unsalted;
    }

    public Snacks_rice_cakes_brown_rice_plain_unsalted get_snacks_rice_cakes_brown_rice_plain_unsalted() {
        return snacks_rice_cakes_brown_rice_plain_unsalted;
    }

    public Snacks_rice_cakes_brown_rice_multigrain_unsalted get_snacks_rice_cakes_brown_rice_multigrain_unsalted() {
        return snacks_rice_cakes_brown_rice_multigrain_unsalted;
    }

    public Snacks_trail_mix_regular_unsalted get_snacks_trail_mix_regular_unsalted() {
        return snacks_trail_mix_regular_unsalted;
    }

    public Snacks_tortilla_chips_low_fat_unsalted get_snacks_tortilla_chips_low_fat_unsalted() {
        return snacks_tortilla_chips_low_fat_unsalted;
    }

    public Snacks_popcorn_microwave_94_fat_free get_snacks_popcorn_microwave_94_fat_free() {
        return snacks_popcorn_microwave_94_fat_free;
    }

    public Snacks_sweet_potato_chips_unsalted get_snacks_sweet_potato_chips_unsalted() {
        return snacks_sweet_potato_chips_unsalted;
    }

    public Pretzels_soft_unsalted get_pretzels_soft_unsalted() {
        return pretzels_soft_unsalted;
    }

    public Snacks_pita_chips_salted get_snacks_pita_chips_salted() {
        return snacks_pita_chips_salted;
    }

    public Snacks_tortilla_chips_unsalted_white_corn get_snacks_tortilla_chips_unsalted_white_corn() {
        return snacks_tortilla_chips_unsalted_white_corn;
    }

    public Snacks_tortilla_chips_light_baked_with_less_oil get_snacks_tortilla_chips_light_baked_with_less_oil() {
        return snacks_tortilla_chips_light_baked_with_less_oil;
    }

}
