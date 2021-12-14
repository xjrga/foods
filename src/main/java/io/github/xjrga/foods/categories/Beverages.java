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
import io.github.xjrga.foods.beverages.*;

/**
 * This is beverages category
 */
public class Beverages extends Abstract_category {

    private final Water water;
    private final Alcoholic_beverage_beer_regular_all alcoholic_beverage_beer_regular_all;
    private final Alcoholic_beverage_beer_light alcoholic_beverage_beer_light;
    private final Alcoholic_beverage_wine_table_red alcoholic_beverage_wine_table_red;
    private final Alcoholic_beverage_wine_table_white alcoholic_beverage_wine_table_white;
    private final Beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine;
    private final Beverages_tea_oolong_brewed beverages_tea_oolong_brewed;
    private final Coffee_brewed_prepared_with_tap_water coffee_brewed_prepared_with_tap_water;
    private final Beverages_tea_green_brewed_regular beverages_tea_green_brewed_regular;
    private final Beverages_tea_black_brewed_prepared_with_tap_water beverages_tea_black_brewed_prepared_with_tap_water;
    private final Alcoholic_beverage_liqueur_coffee_53_proof alcoholic_beverage_liqueur_coffee_53_proof;
    private final Beverages_arizona_tea_ready_to_drink_lemon beverages_arizona_tea_ready_to_drink_lemon;

    /**
     * Constructs beverages category
     */
    public Beverages() {
        set_name("Beverages");
        water = new Water();
        alcoholic_beverage_beer_regular_all = new Alcoholic_beverage_beer_regular_all();
        alcoholic_beverage_beer_light = new Alcoholic_beverage_beer_light();
        alcoholic_beverage_wine_table_red = new Alcoholic_beverage_wine_table_red();
        alcoholic_beverage_wine_table_white = new Alcoholic_beverage_wine_table_white();
        beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine = new Beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine();
        beverages_tea_oolong_brewed = new Beverages_tea_oolong_brewed();
        coffee_brewed_prepared_with_tap_water = new Coffee_brewed_prepared_with_tap_water();
        beverages_tea_green_brewed_regular = new Beverages_tea_green_brewed_regular();
        beverages_tea_black_brewed_prepared_with_tap_water = new Beverages_tea_black_brewed_prepared_with_tap_water();
        alcoholic_beverage_liqueur_coffee_53_proof = new Alcoholic_beverage_liqueur_coffee_53_proof();
        beverages_arizona_tea_ready_to_drink_lemon = new Beverages_arizona_tea_ready_to_drink_lemon();
        add(water);
        add(alcoholic_beverage_beer_regular_all);
        add(alcoholic_beverage_beer_light);
        add(alcoholic_beverage_wine_table_red);
        add(alcoholic_beverage_wine_table_white);
        add(beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine);
        add(beverages_tea_oolong_brewed);
        add(coffee_brewed_prepared_with_tap_water);
        add(beverages_tea_green_brewed_regular);
        add(beverages_tea_black_brewed_prepared_with_tap_water);
        add(alcoholic_beverage_liqueur_coffee_53_proof);
        add(beverages_arizona_tea_ready_to_drink_lemon);
    }

    public Alcoholic_beverage_beer_regular_all getAlcoholic_beverage_beer_regular_all() {
        return alcoholic_beverage_beer_regular_all;
    }

    public Alcoholic_beverage_beer_light get_alcoholic_beverage_beer_light() {
        return alcoholic_beverage_beer_light;
    }

    public Alcoholic_beverage_wine_table_red get_alcoholic_beverage_wine_table_red() {
        return alcoholic_beverage_wine_table_red;
    }

    public Alcoholic_beverage_wine_table_white get_alcoholic_beverage_wine_table_white() {
        return alcoholic_beverage_wine_table_white;
    }

    public Beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine get_beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine() {
        return beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine;
    }

    public Beverages_tea_oolong_brewed get_beverages_tea_oolong_brewed() {
        return beverages_tea_oolong_brewed;
    }

    public Coffee_brewed_prepared_with_tap_water get_coffee_brewed_prepared_with_tap_water() {
        return coffee_brewed_prepared_with_tap_water;
    }

    public Beverages_tea_green_brewed_regular get_beverages_tea_green_brewed_regular() {
        return beverages_tea_green_brewed_regular;
    }

    public Beverages_tea_black_brewed_prepared_with_tap_water get_beverages_tea_black_brewed_prepared_with_tap_water() {
        return beverages_tea_black_brewed_prepared_with_tap_water;
    }

    public Alcoholic_beverage_liqueur_coffee_53_proof get_alcoholic_beverage_liqueur_coffee_53_proof() {
        return alcoholic_beverage_liqueur_coffee_53_proof;
    }

    public Beverages_arizona_tea_ready_to_drink_lemon get_beverages_arizona_tea_ready_to_drink_lemon() {
        return beverages_arizona_tea_ready_to_drink_lemon;
    }

}
