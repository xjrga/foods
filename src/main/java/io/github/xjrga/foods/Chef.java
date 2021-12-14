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

import io.github.xjrga.foods.categories.American_indian_alaska_native_foods;
import io.github.xjrga.foods.categories.Baby_foods;
import io.github.xjrga.foods.categories.Baked_products;
import io.github.xjrga.foods.categories.Beef_products;
import io.github.xjrga.foods.categories.Beverages;
import io.github.xjrga.foods.categories.Breakfast_cereals;
import io.github.xjrga.foods.categories.Cereal_grains_and_pasta;
import io.github.xjrga.foods.categories.Dairy_and_egg_products;
import io.github.xjrga.foods.categories.Fast_foods;
import io.github.xjrga.foods.categories.Fats_and_oils;
import io.github.xjrga.foods.categories.Finfish_and_shellfish_products;
import io.github.xjrga.foods.categories.Fruits_and_fruit_juices;
import io.github.xjrga.foods.categories.Glycemic_index_test_set;
import io.github.xjrga.foods.categories.Legumes_and_legume_products;
import io.github.xjrga.foods.categories.Nuts_and_seed_products;
import io.github.xjrga.foods.categories.Omega_3;
import io.github.xjrga.foods.categories.Pork_products;
import io.github.xjrga.foods.categories.Poultry_products;
import io.github.xjrga.foods.categories.Protein_powders;
import io.github.xjrga.foods.categories.Sausages_and_luncheon_meats;
import io.github.xjrga.foods.categories.Snacks;
import io.github.xjrga.foods.categories.Spices_and_herbs;
import io.github.xjrga.foods.categories.Supplements;
import io.github.xjrga.foods.categories.Sweets;
import io.github.xjrga.foods.categories.Vegetables_and_vegetable_products;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Gives easy access to all food categories and foods
 */
public class Chef {

    private final List<Category> list;
    private final American_indian_alaska_native_foods american_indian_alaska_native_foods;
    private final Baby_foods baby_foods;
    private final Baked_products baked_products;
    private final Beef_products beef_products;
    private final Beverages beverages;
    private final Breakfast_cereals breakfast_cereals;
    private final Cereal_grains_and_pasta cereal_grains_and_pasta;
    private final Dairy_and_egg_products dairy_and_egg_products;
    private final Fast_foods fast_foods;
    private final Fats_and_oils fats_and_oils;
    private final Finfish_and_shellfish_products finfish_and_shellfish_products;
    private final Fruits_and_fruit_juices fruits_and_fruit_juices;
    private final Glycemic_index_test_set glycemic_index_test_set;
    private final Legumes_and_legume_products legumes_and_legume_products;
    private final Nuts_and_seed_products nuts_and_seed_products;
    private final Omega_3 omega_3;
    private final Pork_products pork_products;
    private final Poultry_products poultry_products;
    private final Protein_powders protein_powders;
    private final Sausages_and_luncheon_meats sausages_and_luncheon_meats;
    private final Snacks snacks;
    private final Spices_and_herbs spices_and_herbs;
    private final Supplements supplements;
    private final Sweets sweets;
    private final Vegetables_and_vegetable_products vegetables_and_vegetable_products;

    public Chef() {
        list = new ArrayList();
        american_indian_alaska_native_foods = new American_indian_alaska_native_foods();
        baby_foods = new Baby_foods();
        baked_products = new Baked_products();
        beef_products = new Beef_products();
        beverages = new Beverages();
        breakfast_cereals = new Breakfast_cereals();
        cereal_grains_and_pasta = new Cereal_grains_and_pasta();
        dairy_and_egg_products = new Dairy_and_egg_products();
        fast_foods = new Fast_foods();
        fats_and_oils = new Fats_and_oils();
        finfish_and_shellfish_products = new Finfish_and_shellfish_products();
        fruits_and_fruit_juices = new Fruits_and_fruit_juices();
        glycemic_index_test_set = new Glycemic_index_test_set();
        legumes_and_legume_products = new Legumes_and_legume_products();
        nuts_and_seed_products = new Nuts_and_seed_products();
        omega_3 = new Omega_3();
        pork_products = new Pork_products();
        poultry_products = new Poultry_products();
        protein_powders = new Protein_powders();
        sausages_and_luncheon_meats = new Sausages_and_luncheon_meats();
        snacks = new Snacks();
        spices_and_herbs = new Spices_and_herbs();
        supplements = new Supplements();
        sweets = new Sweets();
        vegetables_and_vegetable_products = new Vegetables_and_vegetable_products();
        list.add(american_indian_alaska_native_foods);
        list.add(baby_foods);
        list.add(baked_products);
        list.add(beef_products);
        list.add(beverages);
        list.add(breakfast_cereals);
        list.add(cereal_grains_and_pasta);
        list.add(dairy_and_egg_products);
        list.add(fast_foods);
        list.add(fats_and_oils);
        list.add(finfish_and_shellfish_products);
        list.add(fruits_and_fruit_juices);
        list.add(glycemic_index_test_set);
        list.add(legumes_and_legume_products);
        list.add(nuts_and_seed_products);
        list.add(omega_3);
        list.add(pork_products);
        list.add(poultry_products);
        list.add(protein_powders);
        list.add(sausages_and_luncheon_meats);
        list.add(snacks);
        list.add(spices_and_herbs);
        list.add(supplements);
        list.add(sweets);
        list.add(vegetables_and_vegetable_products);
    }

    public American_indian_alaska_native_foods get_american_indian_alaska_native_foods() {
        return american_indian_alaska_native_foods;
    }

    public Baby_foods get_baby_foods() {
        return baby_foods;
    }

    public Baked_products get_baked_products() {
        return baked_products;
    }

    public Beef_products get_beef_products() {
        return beef_products;
    }

    public Beverages get_beverages() {
        return beverages;
    }

    public Breakfast_cereals get_breakfast_cereals() {
        return breakfast_cereals;
    }

    public Cereal_grains_and_pasta get_cereal_grains_and_pasta() {
        return cereal_grains_and_pasta;
    }

    public Dairy_and_egg_products get_dairy_and_egg_products() {
        return dairy_and_egg_products;
    }

    public Fast_foods get_fast_foods() {
        return fast_foods;
    }

    public Fats_and_oils get_fats_and_oils() {
        return fats_and_oils;
    }

    public Finfish_and_shellfish_products get_finfish_and_shellfish_products() {
        return finfish_and_shellfish_products;
    }

    public Fruits_and_fruit_juices get_fruits_and_fruit_juices() {
        return fruits_and_fruit_juices;
    }

    public Glycemic_index_test_set get_glycemic_index_test_set() {
        return glycemic_index_test_set;
    }

    public Legumes_and_legume_products get_legumes_and_legume_products() {
        return legumes_and_legume_products;
    }

    public Nuts_and_seed_products get_nuts_and_seed_products() {
        return nuts_and_seed_products;
    }

    public Omega_3 get_omega_3() {
        return omega_3;
    }

    public Pork_products get_pork_products() {
        return pork_products;
    }

    public Poultry_products get_poultry_products() {
        return poultry_products;
    }

    public Protein_powders get_protein_powders() {
        return protein_powders;
    }

    public Sausages_and_luncheon_meats get_sausages_and_luncheon_meats() {
        return sausages_and_luncheon_meats;
    }

    public Snacks get_snacks() {
        return snacks;
    }

    public Spices_and_herbs get_spices_and_herbs() {
        return spices_and_herbs;
    }

    public Supplements get_supplements() {
        return supplements;
    }

    public Sweets get_sweets() {
        return sweets;
    }

    public Vegetables_and_vegetable_products get_vegetables_and_vegetable_products() {
        return vegetables_and_vegetable_products;
    }

    public final Iterator<Category> iterator() {
        return list.iterator();
    }

    public Food find(String food_name) {
        Food found = null;
        Iterator<Category> it = iterator();
        while (it.hasNext()) {
            Category category = it.next();
            Iterator<Food> it2 = category.iterator();
            while (it2.hasNext()) {
                Food food = it2.next();
                if (food.get_food_name().equals(food_name)) {
                    found = food;
                    break;
                }
            }
        }
        return found;
    }
}
