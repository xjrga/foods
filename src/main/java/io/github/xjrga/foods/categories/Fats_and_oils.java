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
import io.github.xjrga.foods.fats_and_oils.*;

/**
 * This is fats and oils category
 */
public class Fats_and_oils extends Category_abstract {

    private final Oil_wheat_germ oil_wheat_germ;
    private final Oil_peanut_salad_or_cooking oil_peanut_salad_or_cooking;
    private final Oil_soybean_salad_or_cooking oil_soybean_salad_or_cooking;
    private final Oil_olive_salad_or_cooking oil_olive_salad_or_cooking;
    private final Oil_sesame_salad_or_cooking oil_sesame_salad_or_cooking;
    private final Oil_cottonseed_salad_or_cooking oil_cottonseed_salad_or_cooking;
    private final Oil_grapeseed oil_grapeseed;
    private final Oil_corn_industrial_and_retail_all_purpose_salad_or_cooking oil_corn_industrial_and_retail_all_purpose_salad_or_cooking;
    private final Oil_walnut oil_walnut;
    private final Oil_almond oil_almond;
    private final Oil_soybean_lecithin oil_soybean_lecithin;
    private final Oil_avocado oil_avocado;
    private final Oil_canola oil_canola;
    private final Fish_oil_cod_liver fish_oil_cod_liver;
    private final Fish_oil_herring fish_oil_herring;
    private final Fish_oil_menhaden fish_oil_menhaden;
    private final Fish_oil_salmon fish_oil_salmon;
    private final Fish_oil_sardine fish_oil_sardine;
    private final Oil_pam_cooking_spray_original oil_pam_cooking_spray_original;
    private final Mayonnaise_reduced_fat_with_olive_oil mayonnaise_reduced_fat_with_olive_oil;
    private final Oil_flaxseed_cold_pressed oil_flaxseed_cold_pressed;
    private final Oil_corn_and_canola oil_corn_and_canola;

    /**
     * Constructs fats and oils category
     */
    public Fats_and_oils() {
        set_name("Fats and Oils");
        oil_wheat_germ = new Oil_wheat_germ();
        oil_peanut_salad_or_cooking = new Oil_peanut_salad_or_cooking();
        oil_soybean_salad_or_cooking = new Oil_soybean_salad_or_cooking();
        oil_olive_salad_or_cooking = new Oil_olive_salad_or_cooking();
        oil_sesame_salad_or_cooking = new Oil_sesame_salad_or_cooking();
        oil_cottonseed_salad_or_cooking = new Oil_cottonseed_salad_or_cooking();
        oil_grapeseed = new Oil_grapeseed();
        oil_corn_industrial_and_retail_all_purpose_salad_or_cooking = new Oil_corn_industrial_and_retail_all_purpose_salad_or_cooking();
        oil_walnut = new Oil_walnut();
        oil_almond = new Oil_almond();
        oil_soybean_lecithin = new Oil_soybean_lecithin();
        oil_avocado = new Oil_avocado();
        oil_canola = new Oil_canola();
        fish_oil_cod_liver = new Fish_oil_cod_liver();
        fish_oil_herring = new Fish_oil_herring();
        fish_oil_menhaden = new Fish_oil_menhaden();
        fish_oil_salmon = new Fish_oil_salmon();
        fish_oil_sardine = new Fish_oil_sardine();
        oil_pam_cooking_spray_original = new Oil_pam_cooking_spray_original();
        mayonnaise_reduced_fat_with_olive_oil = new Mayonnaise_reduced_fat_with_olive_oil();
        oil_flaxseed_cold_pressed = new Oil_flaxseed_cold_pressed();
        oil_corn_and_canola = new Oil_corn_and_canola();
        add(oil_wheat_germ);
        add(oil_peanut_salad_or_cooking);
        add(oil_soybean_salad_or_cooking);
        add(oil_olive_salad_or_cooking);
        add(oil_sesame_salad_or_cooking);
        add(oil_cottonseed_salad_or_cooking);
        add(oil_grapeseed);
        add(oil_corn_industrial_and_retail_all_purpose_salad_or_cooking);
        add(oil_walnut);
        add(oil_almond);
        add(oil_soybean_lecithin);
        add(oil_avocado);
        add(oil_canola);
        add(fish_oil_cod_liver);
        add(fish_oil_herring);
        add(fish_oil_menhaden);
        add(fish_oil_salmon);
        add(fish_oil_sardine);
        add(oil_pam_cooking_spray_original);
        add(mayonnaise_reduced_fat_with_olive_oil);
        add(oil_flaxseed_cold_pressed);
        add(oil_corn_and_canola);
    }

    public Oil_wheat_germ get_oil_wheat_germ() {
        return oil_wheat_germ;
    }

    public Oil_peanut_salad_or_cooking get_oil_peanut_salad_or_cooking() {
        return oil_peanut_salad_or_cooking;
    }

    public Oil_soybean_salad_or_cooking get_oil_soybean_salad_or_cooking() {
        return oil_soybean_salad_or_cooking;
    }

    public Oil_olive_salad_or_cooking get_oil_olive_salad_or_cooking() {
        return oil_olive_salad_or_cooking;
    }

    public Oil_sesame_salad_or_cooking get_oil_sesame_salad_or_cooking() {
        return oil_sesame_salad_or_cooking;
    }

    public Oil_cottonseed_salad_or_cooking get_oil_cottonseed_salad_or_cooking() {
        return oil_cottonseed_salad_or_cooking;
    }

    public Oil_grapeseed get_oil_grapeseed() {
        return oil_grapeseed;
    }

    public Oil_corn_industrial_and_retail_all_purpose_salad_or_cooking get_oil_corn_industrial_and_retail_all_purpose_salad_or_cooking() {
        return oil_corn_industrial_and_retail_all_purpose_salad_or_cooking;
    }

    public Oil_walnut get_oil_walnut() {
        return oil_walnut;
    }

    public Oil_almond get_oil_almond() {
        return oil_almond;
    }

    public Oil_soybean_lecithin get_oil_soybean_lecithin() {
        return oil_soybean_lecithin;
    }

    public Oil_avocado get_oil_avocado() {
        return oil_avocado;
    }

    public Oil_canola get_oil_canola() {
        return oil_canola;
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

    public Oil_pam_cooking_spray_original get_oil_pam_cooking_spray_original() {
        return oil_pam_cooking_spray_original;
    }

    public Mayonnaise_reduced_fat_with_olive_oil get_mayonnaise_reduced_fat_with_olive_oil() {
        return mayonnaise_reduced_fat_with_olive_oil;
    }

    public Oil_flaxseed_cold_pressed get_oil_flaxseed_cold_pressed() {
        return oil_flaxseed_cold_pressed;
    }

    public Oil_corn_and_canola get_oil_corn_and_canola() {
        return oil_corn_and_canola;
    }

}
