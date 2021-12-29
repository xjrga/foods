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

import io.github.xjrga.foods.data.American_indian_alaska_native_foods;
import io.github.xjrga.foods.data.Baby_foods;
import io.github.xjrga.foods.data.Baked_products;
import io.github.xjrga.foods.data.Beef_products;
import io.github.xjrga.foods.data.Beverages;
import io.github.xjrga.foods.data.Breakfast_cereals;
import io.github.xjrga.foods.data.Cereal_grains_and_pasta;
import io.github.xjrga.foods.data.Dairy_and_egg_products;
import io.github.xjrga.foods.data.Fast_foods;
import io.github.xjrga.foods.data.Fats_and_oils;
import io.github.xjrga.foods.data.Finfish_and_shellfish_products;
import io.github.xjrga.foods.data.Fruits_and_fruit_juices;
import io.github.xjrga.foods.data.Glycemic_index_test_set;
import io.github.xjrga.foods.data.Legumes_and_legume_products;
import io.github.xjrga.foods.data.Nut_and_seed_products;
import io.github.xjrga.foods.data.Omega_3;
import io.github.xjrga.foods.data.Pork_products;
import io.github.xjrga.foods.data.Poultry_products;
import io.github.xjrga.foods.data.Protein_powders;
import io.github.xjrga.foods.data.Sausages_and_luncheon_meats;
import io.github.xjrga.foods.data.Snacks;
import io.github.xjrga.foods.data.Spices_and_herbs;
import io.github.xjrga.foods.data.Supplements;
import io.github.xjrga.foods.data.Sweets;
import io.github.xjrga.foods.data.Vegetables_and_vegetable_products;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Chef {

    private final HashMap<String, ArrayList<Interface_food>> map;

    public Chef() {
        map = new HashMap();
        map.put("American Indian/Alaska Native Foods", create_American_indian_alaska_native_foods());
        map.put("Baby Foods", create_Baby_foods());
        map.put("Baked Products", create_Baked_products());
        map.put("Beef Products", create_Beef_products());
        map.put("Beverages", create_Beverages());
        map.put("Breakfast Cereals", create_Breakfast_cereals());
        map.put("Cereal Grains and Pasta", create_Cereal_grains_and_pasta());
        map.put("Dairy and Egg Products", create_Dairy_and_egg_products());
        map.put("Fast Foods", create_Fast_foods());
        map.put("Fats and Oils", create_Fats_and_oils());
        map.put("Finfish and Shellfish Products", create_Finfish_and_shellfish_products());
        map.put("Fruits and Fruit Juices", create_Fruits_and_fruit_juices());
        map.put("Glycemic Index Test Set", create_Glycemic_index_test_set());
        map.put("Legumes and Legume Products", create_Legumes_and_legume_products());
        map.put("Nut and Seed Products", create_Nut_and_seed_products());
        map.put("Omega_3", create_Omega_3());
        map.put("Pork Products", create_Pork_products());
        map.put("Poultry Products", create_Poultry_products());
        map.put("Protein Powders", create_Protein_powders());
        map.put("Sausages and Luncheon Meats", create_Sausages_and_luncheon_meats());
        map.put("Snacks", create_Snacks());
        map.put("Spices and Herbs", create_Spices_and_herbs());
        map.put("Supplements", create_Supplements());
        map.put("Sweets", create_Sweets());
        map.put("Vegetables and Vegetable Products", create_Vegetables_and_vegetable_products());
    }

    public Iterator<String> get_categories() {
        return map.keySet().iterator();
    }

    public Iterator<Interface_food> get_foods(String category) {
        return map.get(category).iterator();
    }

    public Interface_food find_food(String food_name) {
        Interface_food found = null;
        Iterator<Entry<String, ArrayList<Interface_food>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, ArrayList<Interface_food>> entry = it.next();
            ArrayList<Interface_food> food_list = entry.getValue();
            Iterator<Interface_food> it2 = food_list.iterator();
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

    private ArrayList<Interface_food> create_American_indian_alaska_native_foods() {
        ArrayList<Interface_food> list = new ArrayList();
        for (American_indian_alaska_native_foods f : American_indian_alaska_native_foods.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Baby_foods() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Baby_foods f : Baby_foods.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Baked_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Baked_products f : Baked_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Beef_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Beef_products f : Beef_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Beverages() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Beverages f : Beverages.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Breakfast_cereals() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Breakfast_cereals f : Breakfast_cereals.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Cereal_grains_and_pasta() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Cereal_grains_and_pasta f : Cereal_grains_and_pasta.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Dairy_and_egg_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Dairy_and_egg_products f : Dairy_and_egg_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Fast_foods() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Fast_foods f : Fast_foods.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Fats_and_oils() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Fats_and_oils f : Fats_and_oils.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Finfish_and_shellfish_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Finfish_and_shellfish_products f : Finfish_and_shellfish_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Fruits_and_fruit_juices() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Fruits_and_fruit_juices f : Fruits_and_fruit_juices.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Glycemic_index_test_set() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Glycemic_index_test_set f : Glycemic_index_test_set.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Legumes_and_legume_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Legumes_and_legume_products f : Legumes_and_legume_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Nut_and_seed_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Nut_and_seed_products f : Nut_and_seed_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Omega_3() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Omega_3 f : Omega_3.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Pork_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Pork_products f : Pork_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Poultry_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Poultry_products f : Poultry_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Protein_powders() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Protein_powders f : Protein_powders.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Sausages_and_luncheon_meats() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Sausages_and_luncheon_meats f : Sausages_and_luncheon_meats.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Snacks() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Snacks f : Snacks.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Spices_and_herbs() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Spices_and_herbs f : Spices_and_herbs.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Supplements() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Supplements f : Supplements.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Sweets() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Sweets f : Sweets.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }

    private ArrayList<Interface_food> create_Vegetables_and_vegetable_products() {
        ArrayList<Interface_food> list = new ArrayList();
        for (Vegetables_and_vegetable_products f : Vegetables_and_vegetable_products.values()) {
            Food food = Food_creator.make_food_from_food_enum(f);
            list.add(food);
        }
        return list;
    }
}
