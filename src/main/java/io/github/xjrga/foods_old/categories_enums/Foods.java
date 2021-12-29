/*
 * Copyright (C) 2022 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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
package io.github.xjrga.foods_old.categories_enums;

import io.github.xjrga.foods_old.Interface_food;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Food categories from USDA National Nutrient Database for Standard Reference,
 * Release 28 except omega-3, supplements, glycemic index test set and protein
 * powders which I added
 *
 */
public enum Foods {

    AMERICAN_INDIAN_ALASKA_NATIVE_FOODS("", get_american_indian_alaska_native_foods()),
    BABY_FOODS("", get_baby_foods()),
    BAKED_PRODUCTS("", get_baked_products()),
    BEEF_PRODUCTS("", get_beef_products()),
    BEVERAGES("", get_beverages()),
    BREAKFAST_CEREALS("", get_breakfast_cereals()),
    CEREAL_GRAINS_AND_PASTA("", get_cereal_grains_and_pasta()),
    DAIRY_AND_EGG_PRODUCTS("", get_dairy_and_egg_products()),
    FAST_FOODS("", get_fast_foods()),
    FATS_AND_OILS("", get_fats_and_oils()),
    FINFISH_AND_SHELLFISH_PRODUCTS("", get_finfish_and_shellfish_products()),
    FRUIT_AND_FRUIT_JUICES("", get_fruit_and_fruit_juices()),
    GLYCEMIC_INDEX_TEST_SET("", get_glycemic_index_test_set()),
    LEGUMES_AND_LEGUME_PRODUCTS("", get_legumes_and_legume_products()),
    NUTS_AND_SEED_PRODUCTS("", get_nuts_and_seed_products()),
    OMEGA_3("", get_omega_3()),
    PORK_PRODUCTS("", get_pork_products()),
    POULTRY_PRODUCTS("", get_poultry_products()),
    PROTEIN_POWDERS("", get_protein_powders()),
    SAUSAGES_AND_LUNCHEON_MEATS("", get_sausages_and_luncheon_meats()),
    SNACKS("", get_snacks()),
    SPICES_AND_HERBS("", get_spices_and_herbs()),
    SUPPLEMENTS("", get_supplements()),
    SWEETS("", get_sweets()),
    VEGETABLES_AND_VEGETABLE_PRODUCTS("", get_vegetables_and_vegetable_products());

    private final String name;
    private final List<Interface_food> foods;

    Foods(String name, List<Interface_food> foods) {
        this.name = name;
        this.foods = foods;
    }

    public String get_name() {
        return name;
    }

    public List<Interface_food> list() {
        return foods;
    }

    private static List<Interface_food> get_american_indian_alaska_native_foods() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(American_indian_alaska_native_foods.values()));
        return list;
    }

    private static List<Interface_food> get_baby_foods() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Baby_foods.values()));
        return list;
    }

    private static List<Interface_food> get_baked_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Baked_products.values()));
        return list;
    }

    private static List<Interface_food> get_beef_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Beef_products.values()));
        return list;
    }

    private static List<Interface_food> get_beverages() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Beverages.values()));
        return list;
    }

    private static List<Interface_food> get_breakfast_cereals() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Breakfast_cereals.values()));
        return list;
    }

    private static List<Interface_food> get_cereal_grains_and_pasta() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Cereal_grains_and_pasta.values()));
        return list;
    }

    private static List<Interface_food> get_dairy_and_egg_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Dairy_and_egg_products.values()));
        return list;
    }

    private static List<Interface_food> get_fast_foods() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Fast_foods.values()));
        return list;
    }

    private static List<Interface_food> get_fats_and_oils() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Fats_and_oils.values()));
        return list;
    }

    private static List<Interface_food> get_finfish_and_shellfish_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Finfish_and_shellfish_products.values()));
        return list;
    }

    private static List<Interface_food> get_fruit_and_fruit_juices() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Fruit_and_fruit_juices.values()));
        return list;
    }

    private static List<Interface_food> get_glycemic_index_test_set() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Glycemic_index_test_set.values()));
        return list;
    }

    private static List<Interface_food> get_legumes_and_legume_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Legumes_and_legume_products.values()));
        return list;
    }

    private static List<Interface_food> get_nuts_and_seed_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Nuts_and_seed_products.values()));
        return list;
    }

    private static List<Interface_food> get_omega_3() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Omega_3.values()));
        return list;
    }

    private static List<Interface_food> get_pork_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Pork_products.values()));
        return list;
    }

    private static List<Interface_food> get_poultry_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Poultry_products.values()));
        return list;
    }

    private static List<Interface_food> get_protein_powders() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Protein_powders.values()));
        return list;
    }

    private static List<Interface_food> get_sausages_and_luncheon_meats() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Sausages_and_luncheon_meats.values()));
        return list;
    }

    private static List<Interface_food> get_snacks() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Snacks.values()));
        return list;
    }

    private static List<Interface_food> get_spices_and_herbs() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Spices_and_herbs.values()));
        return list;
    }

    private static List<Interface_food> get_supplements() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Supplements.values()));
        return list;
    }

    private static List<Interface_food> get_sweets() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Sweets.values()));
        return list;
    }

    private static List<Interface_food> get_vegetables_and_vegetable_products() {
        List<Interface_food> list = new ArrayList<>();
        list.addAll(Arrays.asList(Vegetables_and_vegetable_products.values()));
        return list;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Interface_food find_food_by_name(String food_name) {
        Interface_food out = null;
        for (Foods foods : Foods.values()) {
            List<Interface_food> food_list = foods.list();
            for (Interface_food f : food_list) {
                if (f.get_food_name().equals(food_name)) {
                    out = f;
                }
            }
        }
        return out;
    }
}
