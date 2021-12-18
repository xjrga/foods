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
import io.github.xjrga.foods.legumes_and_legume_products.*;

/**
 * This is legumes and legume products category
 */
public class Legumes_and_legume_products extends Category_abstract {

    private final Beans_black_mature_seeds_raw beans_black_mature_seeds_raw;
    private final Beans_black_mature_seeds_cooked_boiled_without_salt beans_black_mature_seeds_cooked_boiled_without_salt;
    private final Beans_kidney_all_types_mature_seeds_raw beans_kidney_all_types_mature_seeds_raw;
    private final Beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt;
    private final Beans_kidney_california_red_mature_seeds_raw beans_kidney_california_red_mature_seeds_raw;
    private final Beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt;
    private final Beans_kidney_red_mature_seeds_raw beans_kidney_red_mature_seeds_raw;
    private final Beans_kidney_red_mature_seeds_cooked_boiled_without_salt beans_kidney_red_mature_seeds_cooked_boiled_without_salt;
    private final Beans_pinto_mature_seeds_raw beans_pinto_mature_seeds_raw;
    private final Beans_pinto_mature_seeds_cooked_boiled_without_salt beans_pinto_mature_seeds_cooked_boiled_without_salt;
    private final Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw;
    private final Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt;
    private final Lentils_raw lentils_raw;
    private final Lentils_mature_seeds_cooked_boiled_without_salt lentils_mature_seeds_cooked_boiled_without_salt;
    private final Peas_green_split_mature_seeds_raw peas_green_split_mature_seeds_raw;
    private final Peas_split_mature_seeds_cooked_boiled_without_salt peas_split_mature_seeds_cooked_boiled_without_salt;
    private final Peanut_butter_chunk_style_with_salt peanut_butter_chunk_style_with_salt;
    private final Soybeans_mature_seeds_raw soybeans_mature_seeds_raw;
    private final Soybeans_mature_cooked_boiled_without_salt soybeans_mature_cooked_boiled_without_salt;
    private final Soy_meal_defatted_raw soy_meal_defatted_raw;
    private final Soy_protein_isolate soy_protein_isolate;
    private final Hummus_home_prepared hummus_home_prepared;
    private final Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids;
    private final Lentils_mature_seeds_cooked_boiled_with_salt lentils_mature_seeds_cooked_boiled_with_salt;
    private final Peanuts_all_types_dry_roasted_without_salt peanuts_all_types_dry_roasted_without_salt;
    private final Peanut_butter_chunk_style_without_salt peanut_butter_chunk_style_without_salt;

    /**
     * Constructs legumes and legume products category
     */
    public Legumes_and_legume_products() {
        set_name("Legumes and Legume Products");
        beans_black_mature_seeds_raw = new Beans_black_mature_seeds_raw();
        beans_black_mature_seeds_cooked_boiled_without_salt = new Beans_black_mature_seeds_cooked_boiled_without_salt();
        beans_kidney_all_types_mature_seeds_raw = new Beans_kidney_all_types_mature_seeds_raw();
        beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt = new Beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt();
        beans_kidney_california_red_mature_seeds_raw = new Beans_kidney_california_red_mature_seeds_raw();
        beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt = new Beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt();
        beans_kidney_red_mature_seeds_raw = new Beans_kidney_red_mature_seeds_raw();
        beans_kidney_red_mature_seeds_cooked_boiled_without_salt = new Beans_kidney_red_mature_seeds_cooked_boiled_without_salt();
        beans_pinto_mature_seeds_raw = new Beans_pinto_mature_seeds_raw();
        beans_pinto_mature_seeds_cooked_boiled_without_salt = new Beans_pinto_mature_seeds_cooked_boiled_without_salt();
        chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw = new Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw();
        chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt = new Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt();
        lentils_raw = new Lentils_raw();
        lentils_mature_seeds_cooked_boiled_without_salt = new Lentils_mature_seeds_cooked_boiled_without_salt();
        peas_green_split_mature_seeds_raw = new Peas_green_split_mature_seeds_raw();
        peas_split_mature_seeds_cooked_boiled_without_salt = new Peas_split_mature_seeds_cooked_boiled_without_salt();
        peanut_butter_chunk_style_with_salt = new Peanut_butter_chunk_style_with_salt();
        soybeans_mature_seeds_raw = new Soybeans_mature_seeds_raw();
        soybeans_mature_cooked_boiled_without_salt = new Soybeans_mature_cooked_boiled_without_salt();
        soy_meal_defatted_raw = new Soy_meal_defatted_raw();
        soy_protein_isolate = new Soy_protein_isolate();
        hummus_home_prepared = new Hummus_home_prepared();
        chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids = new Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids();
        lentils_mature_seeds_cooked_boiled_with_salt = new Lentils_mature_seeds_cooked_boiled_with_salt();
        peanuts_all_types_dry_roasted_without_salt = new Peanuts_all_types_dry_roasted_without_salt();
        peanut_butter_chunk_style_without_salt = new Peanut_butter_chunk_style_without_salt();
        add(beans_black_mature_seeds_raw);
        add(beans_black_mature_seeds_cooked_boiled_without_salt);
        add(beans_kidney_all_types_mature_seeds_raw);
        add(beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt);
        add(beans_kidney_california_red_mature_seeds_raw);
        add(beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt);
        add(beans_kidney_red_mature_seeds_raw);
        add(beans_kidney_red_mature_seeds_cooked_boiled_without_salt);
        add(beans_pinto_mature_seeds_raw);
        add(beans_pinto_mature_seeds_cooked_boiled_without_salt);
        add(chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw);
        add(chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt);
        add(lentils_raw);
        add(lentils_mature_seeds_cooked_boiled_without_salt);
        add(peas_green_split_mature_seeds_raw);
        add(peas_split_mature_seeds_cooked_boiled_without_salt);
        add(peanut_butter_chunk_style_with_salt);
        add(soybeans_mature_seeds_raw);
        add(soybeans_mature_cooked_boiled_without_salt);
        add(soy_meal_defatted_raw);
        add(soy_protein_isolate);
        add(hummus_home_prepared);
        add(chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids);
        add(lentils_mature_seeds_cooked_boiled_with_salt);
        add(peanuts_all_types_dry_roasted_without_salt);
        add(peanut_butter_chunk_style_without_salt);
    }

    public Beans_black_mature_seeds_raw get_beans_black_mature_seeds_raw() {
        return beans_black_mature_seeds_raw;
    }

    public Beans_black_mature_seeds_cooked_boiled_without_salt get_beans_black_mature_seeds_cooked_boiled_without_salt() {
        return beans_black_mature_seeds_cooked_boiled_without_salt;
    }

    public Beans_kidney_all_types_mature_seeds_raw get_beans_kidney_all_types_mature_seeds_raw() {
        return beans_kidney_all_types_mature_seeds_raw;
    }

    public Beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt get_beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt() {
        return beans_kidney_all_types_mature_seeds_cooked_boiled_without_salt;
    }

    public Beans_kidney_california_red_mature_seeds_raw get_beans_kidney_california_red_mature_seeds_raw() {
        return beans_kidney_california_red_mature_seeds_raw;
    }

    public Beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt get_beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt() {
        return beans_kidney_california_red_mature_seeds_cooked_boiled_without_salt;
    }

    public Beans_kidney_red_mature_seeds_raw get_beans_kidney_red_mature_seeds_raw() {
        return beans_kidney_red_mature_seeds_raw;
    }

    public Beans_kidney_red_mature_seeds_cooked_boiled_without_salt get_beans_kidney_red_mature_seeds_cooked_boiled_without_salt() {
        return beans_kidney_red_mature_seeds_cooked_boiled_without_salt;
    }

    public Beans_pinto_mature_seeds_raw get_beans_pinto_mature_seeds_raw() {
        return beans_pinto_mature_seeds_raw;
    }

    public Beans_pinto_mature_seeds_cooked_boiled_without_salt get_beans_pinto_mature_seeds_cooked_boiled_without_salt() {
        return beans_pinto_mature_seeds_cooked_boiled_without_salt;
    }

    public Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw get_chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw() {
        return chickpeas_garbanzo_beans_bengal_gram_mature_seeds_raw;
    }

    public Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt get_chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt() {
        return chickpeas_garbanzo_beans_bengal_gram_mature_seeds_cooked_boiled_without_salt;
    }

    public Lentils_raw get_lentils_raw() {
        return lentils_raw;
    }

    public Lentils_mature_seeds_cooked_boiled_without_salt get_lentils_mature_seeds_cooked_boiled_without_salt() {
        return lentils_mature_seeds_cooked_boiled_without_salt;
    }

    public Peas_green_split_mature_seeds_raw get_peas_green_split_mature_seeds_raw() {
        return peas_green_split_mature_seeds_raw;
    }

    public Peas_split_mature_seeds_cooked_boiled_without_salt get_peas_split_mature_seeds_cooked_boiled_without_salt() {
        return peas_split_mature_seeds_cooked_boiled_without_salt;
    }

    public Peanut_butter_chunk_style_with_salt get_peanut_butter_chunk_style_with_salt() {
        return peanut_butter_chunk_style_with_salt;
    }

    public Soybeans_mature_seeds_raw get_soybeans_mature_seeds_raw() {
        return soybeans_mature_seeds_raw;
    }

    public Soybeans_mature_cooked_boiled_without_salt get_soybeans_mature_cooked_boiled_without_salt() {
        return soybeans_mature_cooked_boiled_without_salt;
    }

    public Soy_meal_defatted_raw get_soy_meal_defatted_raw() {
        return soy_meal_defatted_raw;
    }

    public Soy_protein_isolate get_soy_protein_isolate() {
        return soy_protein_isolate;
    }

    public Hummus_home_prepared get_hummus_home_prepared() {
        return hummus_home_prepared;
    }

    public Chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids get_chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids() {
        return chickpeas_garbanzo_beans_bengal_gram_mature_seeds_canned_drained_solids;
    }

    public Lentils_mature_seeds_cooked_boiled_with_salt get_lentils_mature_seeds_cooked_boiled_with_salt() {
        return lentils_mature_seeds_cooked_boiled_with_salt;
    }

    public Peanuts_all_types_dry_roasted_without_salt get_peanuts_all_types_dry_roasted_without_salt() {
        return peanuts_all_types_dry_roasted_without_salt;
    }

    public Peanut_butter_chunk_style_without_salt get_peanut_butter_chunk_style_without_salt() {
        return peanut_butter_chunk_style_without_salt;
    }

}
