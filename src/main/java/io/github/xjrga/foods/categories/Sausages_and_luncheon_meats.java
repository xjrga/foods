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
import io.github.xjrga.foods.sausages_and_luncheon_meats.*;

/**
 * This is sausages and luncheon meats category
 */
public class Sausages_and_luncheon_meats extends Abstract_category {

    private final Ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added;
    private final Oscar_mayer_chicken_breast_honey_glazed oscar_mayer_chicken_breast_honey_glazed;
    private final Frankfurter_beef_pork_and_turkey_fat_free frankfurter_beef_pork_and_turkey_fat_free;
    private final Pastrami_beef_98_fat_free pastrami_beef_98_fat_free;
    private final Chicken_breast_fat_free_mesquite_flavor_sliced chicken_breast_fat_free_mesquite_flavor_sliced;
    private final Chicken_breast_oven_roasted_fat_free_sliced chicken_breast_oven_roasted_fat_free_sliced;
    private final Turkey_breast_smoked_lemon_pepper_flavor_97_fat_free turkey_breast_smoked_lemon_pepper_flavor_97_fat_free;
    private final Chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged;

    /**
     * Constructs sausages and luncheon meats category
     */
    public Sausages_and_luncheon_meats() {
        set_name("Sausages and Luncheon Meats");
        ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added = new Ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added();
        oscar_mayer_chicken_breast_honey_glazed = new Oscar_mayer_chicken_breast_honey_glazed();
        frankfurter_beef_pork_and_turkey_fat_free = new Frankfurter_beef_pork_and_turkey_fat_free();
        pastrami_beef_98_fat_free = new Pastrami_beef_98_fat_free();
        chicken_breast_fat_free_mesquite_flavor_sliced = new Chicken_breast_fat_free_mesquite_flavor_sliced();
        chicken_breast_oven_roasted_fat_free_sliced = new Chicken_breast_oven_roasted_fat_free_sliced();
        turkey_breast_smoked_lemon_pepper_flavor_97_fat_free = new Turkey_breast_smoked_lemon_pepper_flavor_97_fat_free();
        chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged = new Chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged();
        add(ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added);
        add(oscar_mayer_chicken_breast_honey_glazed);
        add(frankfurter_beef_pork_and_turkey_fat_free);
        add(pastrami_beef_98_fat_free);
        add(chicken_breast_fat_free_mesquite_flavor_sliced);
        add(chicken_breast_oven_roasted_fat_free_sliced);
        add(turkey_breast_smoked_lemon_pepper_flavor_97_fat_free);
        add(chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged);
    }

    public Ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added get_ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added() {
        return ham_sliced_pre_packaged_deli_meat_96_fat_free_water_added;
    }

    public Oscar_mayer_chicken_breast_honey_glazed get_oscar_mayer_chicken_breast_honey_glazed() {
        return oscar_mayer_chicken_breast_honey_glazed;
    }

    public Frankfurter_beef_pork_and_turkey_fat_free get_frankfurter_beef_pork_and_turkey_fat_free() {
        return frankfurter_beef_pork_and_turkey_fat_free;
    }

    public Pastrami_beef_98_fat_free get_pastrami_beef_98_fat_free() {
        return pastrami_beef_98_fat_free;
    }

    public Chicken_breast_fat_free_mesquite_flavor_sliced get_chicken_breast_fat_free_mesquite_flavor_sliced() {
        return chicken_breast_fat_free_mesquite_flavor_sliced;
    }

    public Chicken_breast_oven_roasted_fat_free_sliced get_chicken_breast_oven_roasted_fat_free_sliced() {
        return chicken_breast_oven_roasted_fat_free_sliced;
    }

    public Turkey_breast_smoked_lemon_pepper_flavor_97_fat_free get_turkey_breast_smoked_lemon_pepper_flavor_97_fat_free() {
        return turkey_breast_smoked_lemon_pepper_flavor_97_fat_free;
    }

    public Chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged get_chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged() {
        return chicken_breast_deli_rotisserie_seasoned_sliced_prepackaged;
    }

}
