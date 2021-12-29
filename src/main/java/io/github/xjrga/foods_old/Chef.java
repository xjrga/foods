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
package io.github.xjrga.foods_old;

import io.github.xjrga.foods_old.categories.American_indian_alaska_native_foods;
import io.github.xjrga.foods_old.categories.Baby_foods;
import io.github.xjrga.foods_old.categories.Baked_products;
import io.github.xjrga.foods_old.categories.Beef_products;
import io.github.xjrga.foods_old.categories.Beverages;
import io.github.xjrga.foods_old.categories.Breakfast_cereals;
import io.github.xjrga.foods_old.categories.Cereal_grains_and_pasta;
import io.github.xjrga.foods_old.categories.Dairy_and_egg_products;
import io.github.xjrga.foods_old.categories.Fast_foods;
import io.github.xjrga.foods_old.categories.Fats_and_oils;
import io.github.xjrga.foods_old.categories.Finfish_and_shellfish_products;
import io.github.xjrga.foods_old.categories.Fruits_and_fruit_juices;
import io.github.xjrga.foods_old.categories.Glycemic_index_test_set;
import io.github.xjrga.foods_old.categories.Legumes_and_legume_products;
import io.github.xjrga.foods_old.categories.Nut_and_seed_products;
import io.github.xjrga.foods_old.categories.Omega3;
import io.github.xjrga.foods_old.categories.Pork_products;
import io.github.xjrga.foods_old.categories.Poultry_products;
import io.github.xjrga.foods_old.categories.Protein_powders;
import io.github.xjrga.foods_old.categories.Sausages_and_luncheon_meats;
import io.github.xjrga.foods_old.categories.Snacks;
import io.github.xjrga.foods_old.categories.Spices_and_herbs;
import io.github.xjrga.foods_old.categories.Supplements;
import io.github.xjrga.foods_old.categories.Sweets;
import io.github.xjrga.foods_old.categories.Vegetables_and_vegetable_products;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * Gives easy access to all food categories and foods
 */
public class Chef {

    private final HashMap<String, Interface_category> list;

    public Chef() {
        list = new HashMap();
        Interface_category american_indian_alaska_native_foods = new American_indian_alaska_native_foods();
        Interface_category baby_foods = new Baby_foods();
        Interface_category baked_products = new Baked_products();
        Interface_category beef_products = new Beef_products();
        Interface_category beverages = new Beverages();
        Interface_category breakfast_cereals = new Breakfast_cereals();
        Interface_category cereal_grains_and_pasta = new Cereal_grains_and_pasta();
        Interface_category dairy_and_egg_products = new Dairy_and_egg_products();
        Interface_category fast_foods = new Fast_foods();
        Interface_category fats_and_oils = new Fats_and_oils();
        Interface_category finfish_and_shellfish_products = new Finfish_and_shellfish_products();
        Interface_category fruits_and_fruit_juices = new Fruits_and_fruit_juices();
        Interface_category glycemic_index_test_set = new Glycemic_index_test_set();
        Interface_category legumes_and_legume_products = new Legumes_and_legume_products();
        Interface_category nut_and_seed_products = new Nut_and_seed_products();
        Interface_category omega3 = new Omega3();
        Interface_category pork_products = new Pork_products();
        Interface_category poultry_products = new Poultry_products();
        Interface_category protein_powders = new Protein_powders();
        Interface_category sausages_and_luncheon_meats = new Sausages_and_luncheon_meats();
        Interface_category snacks = new Snacks();
        Interface_category spices_and_herbs = new Spices_and_herbs();
        Interface_category supplements = new Supplements();
        Interface_category sweets = new Sweets();
        Interface_category vegetables_and_vegetable_products = new Vegetables_and_vegetable_products();
        list.put(american_indian_alaska_native_foods.get_name(), american_indian_alaska_native_foods);
        list.put("Baby Foods", baby_foods);
        list.put("Baked Products", baked_products);
        list.put("Beef Products", beef_products);
        list.put("Beverages", beverages);
        list.put("Breakfast Cereals", breakfast_cereals);
        list.put("Cereal Grains and Pasta", cereal_grains_and_pasta);
        list.put("Dairy and Egg Products", dairy_and_egg_products);
        list.put("Fast Foods", fast_foods);
        list.put("Fats and Oils", fats_and_oils);
        list.put("Finfish and Shellfish Products", finfish_and_shellfish_products);
        list.put("Fruits and Fruit Juices", fruits_and_fruit_juices);
        list.put("Glycemic Index Test Set", glycemic_index_test_set);
        list.put("Legumes and Legume Products", legumes_and_legume_products);
        list.put("Nut and Seed Products", nut_and_seed_products);
        list.put("Omega3", omega3);
        list.put("Pork Products", pork_products);
        list.put("Poultry Products", poultry_products);
        list.put("Protein Powders", protein_powders);
        list.put("Sausages and Luncheon Meats", sausages_and_luncheon_meats);
        list.put("Snacks", snacks);
        list.put("Spices and Herbs", spices_and_herbs);
        list.put("Supplements", supplements);
        list.put("Sweets", sweets);
        list.put("Vegetables and Vegetable Products", vegetables_and_vegetable_products);
    }

    public Interface_food find_food(String food_name) {
        Interface_food found = null;
        Iterator<Entry<String, Interface_category>> it = list.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, Interface_category> entry = it.next();
            Interface_category category = entry.getValue();
            Iterator<Interface_food> it2 = category.get_iterator();
            while (it2.hasNext()) {
                Interface_food food = it2.next();
                if (food.get_food_name().equals(food_name)) {
                    found = food;
                    break;
                }
            }
        }
        return found;
    }

    public Interface_category get_food_list(String category_name) {
        Interface_category found = null;
        Iterator<Entry<String, Interface_category>> it = list.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, Interface_category> entry = it.next();
            if (entry.getKey().equals(category_name)) {
                Interface_category category = entry.getValue();
                found = category;
                break;
            }
        }
        return found;
    }
}
