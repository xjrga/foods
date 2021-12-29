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
package io.github.xjrga.foods.data;

import io.github.xjrga.foods.Interface_food;

/**
 * Subset from USDA National Nutrient Database for Standard Reference, Release
 * 28
 *
 */
public enum Beverages implements Interface_food {

    Water("Water", 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Alcoholic_beverage_beer_regular_all("Alcoholic beverage, beer, regular, all", 100.0, 0.0, 0.0, 0.0, 0.46, 0.0, 3.55, 43.0, 3.9, 91.96, 0.0, 4.0, 0.02, 6.0, 14.0, 27.0, 4.0, 0.01, 0.005, 44.2, 0.008, 0.6, 0.0, 0.0, 0.0, 0.0, 0.005, 0.02, 0.51, 0.04, 0.04, 0.02, 10.1, 0.0, 6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Alcoholic_beverage_beer_light("Alcoholic beverage, beer, light", 100.0, 0.0, 0.0, 0.0, 0.24, 0.0, 1.64, 29.0, 3.1, 94.88, 0.0, 4.0, 0.03, 5.0, 12.0, 21.0, 4.0, 0.01, 0.006, 45.3, 0.006, 0.4, 0.0, 0.0, 0.0, 0.0, 0.005, 0.01, 0.39, 0.03, 0.03, 0.02, 8.8, 0.0, 6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Alcoholic_beverage_wine_table_red("Alcoholic beverage, wine, table, red", 100.0, 0.0, 0.0, 0.0, 0.07, 0.0, 2.61, 85.0, 10.6, 86.49, 0.0, 8.0, 0.46, 12.0, 23.0, 127.0, 4.0, 0.14, 0.01, 104.6, 0.13, 0.2, 0.0, 0.0, 0.0, 0.0, 0.005, 0.03, 0.22, 0.03, 0.05, 0.0, 5.7, 0.4, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Alcoholic_beverage_wine_table_white("Alcoholic beverage, wine, table, white", 100.0, 0.0, 0.0, 0.0, 0.07, 0.0, 2.6, 82.0, 10.3, 86.86, 0.0, 9.0, 0.27, 10.0, 18.0, 71.0, 5.0, 0.12, 0.004, 202.0, 0.11, 0.1, 0.0, 0.0, 0.0, 0.0, 0.005, 0.01, 0.1, 0.04, 0.05, 0.0, 4.3, 0.4, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beverages_carbonated_beverage_sprite_lemon_lime_without_caffeine("Beverages, Carbonated beverage, SPRITE, lemon-lime, without caffeine", 100.0, 0.0, 0.0, 0.0, 0.05, 0.02, 10.14, 40.0, 0.0, 89.78, 0.0, 2.0, 0.11, 1.0, 0.0, 1.0, 9.0, 0.04, 0.001, 55.9, 0.002, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beverages_tea_oolong_brewed("Beverages, tea, Oolong, brewed", 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 1.0, 0.0, 99.84, 0.0, 1.0, 0.0, 1.0, 1.0, 12.0, 3.0, 0.01, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Coffee_brewed_prepared_with_tap_water("Coffee, brewed, prepared with tap water", 100.0, 0.0, 0.0, 0.0, 0.12, 0.02, 0.0, 1.0, 0.0, 99.39, 0.0, 2.0, 0.01, 3.0, 3.0, 49.0, 2.0, 0.02, 0.002, 90.7, 0.02, 0.0, 0.0, 0.01, 0.0, 0.0, 0.01, 0.07, 0.19, 0.25, 0.001, 0.0, 2.6, 0.1, 2.0, 0.0, 0.002, 0.0, 0.0, 0.01, 0.001, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beverages_tea_green_brewed_regular("Beverages, tea, green, brewed, regular", 100.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.0, 1.0, 0.0, 99.93, 0.0, 0.0, 0.02, 1.0, 0.0, 8.0, 1.0, 0.01, 0.004, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.3, 0.007, 0.05, 0.03, 0.0, 0.005, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beverages_tea_black_brewed_prepared_with_tap_water("Beverages, tea, black, brewed, prepared with tap water", 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 1.0, 0.0, 99.7, 0.0, 0.0, 0.02, 3.0, 1.0, 37.0, 3.0, 0.02, 0.01, 372.9, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.01, 0.0, 0.0, 0.4, 0.0, 5.0, 0.0, 0.002, 0.0, 0.0, 0.001, 0.004, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Alcoholic_beverage_liqueur_coffee_53_proof("Alcoholic beverage, liqueur, coffee, 53 proof", 100.0, 0.0, 0.0, 0.0, 0.1, 0.3, 46.8, 336.0, 21.7, 31.0, 0.0, 1.0, 0.06, 3.0, 6.0, 30.0, 8.0, 0.03, 0.04, 0.0, 0.01, 0.4, 0.0, 0.0, 0.0, 0.0, 0.004, 0.01, 0.14, 0.0, 0.0, 0.0, 0.8, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 0.02, 0.1, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Beverages_arizona_tea_ready_to_drink_lemon("Beverages, ARIZONA, tea, ready-to-drink, lemon", 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 9.77, 39.0, 0.0, 90.15, 0.0, 3.0, 0.0, 1.0, 1.0, 10.0, 4.0, 0.01, 0.005, 123.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),;

    private final String name;
    private final Double weight;
    private final Double complete_protein;
    private final Double cost;
    private final Double glycemic_index;
    private final Double protein;
    private final Double fat;
    private final Double carbohydrate_by_difference;
    private final Double energy_gross;
    private final Double alcohol;
    private final Double water;
    private final Double fiber;
    private final Double calcium;
    private final Double iron;
    private final Double magnesium;
    private final Double phosphorus;
    private final Double potassium;
    private final Double sodium;
    private final Double zinc;
    private final Double copper;
    private final Double fluoride;
    private final Double manganese;
    private final Double selenium;
    private final Double vitamin_a;
    private final Double vitamin_e;
    private final Double vitamin_d;
    private final Double vitamin_c;
    private final Double thiamin;
    private final Double riboflavin;
    private final Double niacin;
    private final Double pantothenic_acid;
    private final Double vitamin_b6;
    private final Double vitamin_b12;
    private final Double choline;
    private final Double vitamin_k;
    private final Double folate;
    private final Double cholesterol;
    private final Double saturated_fat;
    private final Double dha;
    private final Double epa;
    private final Double monounsaturated_fat;
    private final Double polyunsaturated_fat;
    private final Double linoleic_acid;
    private final Double alpha_linolenic_acid;
    private final Double protein_atwater_factor;
    private final Double carbohydrate_by_difference_atwater_factor;
    private final Double fat_atwater_factor;
    private final Double alcohol_atwater_factor;

    Beverages(
            String name,
            Double weight,
            Double complete_protein,
            Double cost,
            Double glycemic_index,
            Double protein,
            Double fat,
            Double carbohydrate_by_difference,
            Double energy_gross,
            Double alcohol,
            Double water,
            Double fiber,
            Double calcium,
            Double iron,
            Double magnesium,
            Double phosphorus,
            Double potassium,
            Double sodium,
            Double zinc,
            Double copper,
            Double fluoride,
            Double manganese,
            Double selenium,
            Double vitamin_a,
            Double vitamin_e,
            Double vitamin_d,
            Double vitamin_c,
            Double thiamin,
            Double riboflavin,
            Double niacin,
            Double pantothenic_acid,
            Double vitamin_b6,
            Double vitamin_b12,
            Double choline,
            Double vitamin_k,
            Double folate,
            Double cholesterol,
            Double saturated_fat,
            Double dha,
            Double epa,
            Double monounsaturated_fat,
            Double polyunsaturated_fat,
            Double linoleic_acid,
            Double alpha_linolenic_acid,
            Double protein_atwater_factor,
            Double carbohydrate_by_difference_atwater_factor,
            Double fat_atwater_factor,
            Double alcohol_atwater_factor
    ) {
        this.name = name;
        this.weight = weight;
        this.complete_protein = complete_protein;
        this.cost = cost;
        this.glycemic_index = glycemic_index;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate_by_difference = carbohydrate_by_difference;
        this.energy_gross = energy_gross;
        this.alcohol = alcohol;
        this.water = water;
        this.fiber = fiber;
        this.calcium = calcium;
        this.iron = iron;
        this.magnesium = magnesium;
        this.phosphorus = phosphorus;
        this.potassium = potassium;
        this.sodium = sodium;
        this.zinc = zinc;
        this.copper = copper;
        this.fluoride = fluoride;
        this.manganese = manganese;
        this.selenium = selenium;
        this.vitamin_a = vitamin_a;
        this.vitamin_e = vitamin_e;
        this.vitamin_d = vitamin_d;
        this.vitamin_c = vitamin_c;
        this.thiamin = thiamin;
        this.riboflavin = riboflavin;
        this.niacin = niacin;
        this.pantothenic_acid = pantothenic_acid;
        this.vitamin_b6 = vitamin_b6;
        this.vitamin_b12 = vitamin_b12;
        this.choline = choline;
        this.vitamin_k = vitamin_k;
        this.folate = folate;
        this.cholesterol = cholesterol;
        this.saturated_fat = saturated_fat;
        this.dha = dha;
        this.epa = epa;
        this.monounsaturated_fat = monounsaturated_fat;
        this.polyunsaturated_fat = polyunsaturated_fat;
        this.linoleic_acid = linoleic_acid;
        this.alpha_linolenic_acid = alpha_linolenic_acid;
        this.protein_atwater_factor = protein_atwater_factor;
        this.carbohydrate_by_difference_atwater_factor = carbohydrate_by_difference_atwater_factor;
        this.fat_atwater_factor = fat_atwater_factor;
        this.alcohol_atwater_factor = alcohol_atwater_factor;
    }

    @Override
    public String get_food_label() {
        return this.name();
    }

    @Override
    public String get_food_name() {
        return name;
    }

    @Override
    public Double get_weight() {
        return weight;
    }

    public Double get_weight_coefficient() {
        return weight / weight;
    }

    @Override
    public Double get_complete_protein() {
        return complete_protein;
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return complete_protein / weight;
    }

    @Override
    public Double get_digestible_carbohydrate() {
        return carbohydrate_by_difference - fiber;
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return get_digestible_carbohydrate() / weight;
    }

    @Override
    public Double get_cost() {
        return cost;
    }

    @Override
    public Double get_cost_coefficient() {
        return cost / weight;
    }

    @Override
    public Double get_glycemic_load() {
        return get_digestible_carbohydrate() * (get_glycemic_index() / 100);
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return get_glycemic_load() / weight;
    }

    @Override
    public Double get_energy_digestible() {
        return get_energy_protein() + get_energy_fat() + get_energy_digestible_carbohydrate() + get_energy_alcohol();
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return get_energy_digestible() / weight;
    }

    public Double get_energy_no_protein() {
        return get_energy_fat() + get_energy_digestible_carbohydrate() + get_energy_alcohol();
    }

    public Double get_energy_no_protein_coefficient() {
        return get_energy_no_protein() / weight;
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return get_digestible_carbohydrate() * carbohydrate_by_difference_atwater_factor;
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return get_energy_digestible_carbohydrate() / weight;
    }

    @Override
    public Double get_energy_protein() {
        return protein * protein_atwater_factor;
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return get_energy_protein() / weight;
    }

    @Override
    public Double get_energy_fat() {
        return fat * fat_atwater_factor;
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return get_energy_fat() / weight;
    }

    @Override
    public Double get_energy_alcohol() {
        return alcohol * alcohol_atwater_factor;
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return get_energy_alcohol() / weight;
    }

    @Override
    public Double get_protein() {
        return protein;
    }

    @Override
    public Double get_protein_coefficient() {
        return protein / weight;
    }

    @Override
    public Double get_fat() {
        return fat;
    }

    @Override
    public Double get_fat_coefficient() {
        return fat / weight;
    }

    @Override
    public Double get_carbohydrate_by_difference() {
        return carbohydrate_by_difference;
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return carbohydrate_by_difference / weight;
    }

    @Override
    public Double get_energy_gross() {
        return energy_gross;
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return energy_gross / weight;
    }

    @Override
    public Double get_alcohol() {
        return alcohol;
    }

    @Override
    public Double get_alcohol_coefficient() {
        return alcohol / weight;
    }

    @Override
    public Double get_water() {
        return water;
    }

    @Override
    public Double get_water_coefficient() {
        return water / weight;
    }

    @Override
    public Double get_fiber() {
        return fiber;
    }

    @Override
    public Double get_fiber_coefficient() {
        return fiber / weight;
    }

    @Override
    public Double get_calcium() {
        return calcium;
    }

    @Override
    public Double get_calcium_coefficient() {
        return calcium / weight;
    }

    @Override
    public Double get_iron() {
        return iron;
    }

    @Override
    public Double get_iron_coefficient() {
        return iron / weight;
    }

    @Override
    public Double get_magnesium() {
        return magnesium;
    }

    @Override
    public Double get_magnesium_coefficient() {
        return magnesium / weight;
    }

    @Override
    public Double get_phosphorus() {
        return phosphorus;
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return phosphorus / weight;
    }

    @Override
    public Double get_potassium() {
        return potassium;
    }

    @Override
    public Double get_potassium_coefficient() {
        return potassium / weight;
    }

    @Override
    public Double get_sodium() {
        return sodium;
    }

    @Override
    public Double get_sodium_coefficient() {
        return sodium / weight;
    }

    @Override
    public Double get_zinc() {
        return zinc;
    }

    @Override
    public Double get_zinc_coefficient() {
        return zinc / weight;
    }

    @Override
    public Double get_copper() {
        return copper;
    }

    @Override
    public Double get_copper_coefficient() {
        return copper / weight;
    }

    @Override
    public Double get_fluoride() {
        return fluoride;
    }

    @Override
    public Double get_fluoride_coefficient() {
        return fluoride / weight;
    }

    @Override
    public Double get_manganese() {
        return manganese;
    }

    @Override
    public Double get_manganese_coefficient() {
        return manganese / weight;
    }

    @Override
    public Double get_selenium() {
        return selenium;
    }

    @Override
    public Double get_selenium_coefficient() {
        return selenium / weight;
    }

    @Override
    public Double get_vitamin_a() {
        return vitamin_a;
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return vitamin_a / weight;
    }

    @Override
    public Double get_vitamin_e() {
        return vitamin_e;
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return vitamin_e / weight;
    }

    @Override
    public Double get_vitamin_d() {
        return vitamin_d;
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return vitamin_d / weight;
    }

    @Override
    public Double get_vitamin_c() {
        return vitamin_c;
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return vitamin_c / weight;
    }

    @Override
    public Double get_thiamin() {
        return thiamin;
    }

    @Override
    public Double get_thiamin_coefficient() {
        return thiamin / weight;
    }

    @Override
    public Double get_riboflavin() {
        return riboflavin;
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return riboflavin / weight;
    }

    @Override
    public Double get_niacin() {
        return niacin;
    }

    @Override
    public Double get_niacin_coefficient() {
        return niacin / weight;
    }

    @Override
    public Double get_pantothenic_acid() {
        return pantothenic_acid;
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return pantothenic_acid / weight;
    }

    @Override
    public Double get_vitamin_b6() {
        return vitamin_b6;
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return vitamin_b6 / weight;
    }

    @Override
    public Double get_vitamin_b12() {
        return vitamin_b12;
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return vitamin_b12 / weight;
    }

    @Override
    public Double get_choline() {
        return choline;
    }

    @Override
    public Double get_choline_coefficient() {
        return choline / weight;
    }

    @Override
    public Double get_vitamin_k() {
        return vitamin_k;
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return vitamin_k / weight;
    }

    @Override
    public Double get_folate() {
        return folate;
    }

    @Override
    public Double get_folate_coefficient() {
        return folate / weight;
    }

    @Override
    public Double get_cholesterol() {
        return cholesterol;
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return cholesterol / weight;
    }

    @Override
    public Double get_saturated_fat() {
        return saturated_fat;
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return saturated_fat / weight;
    }

    @Override
    public Double get_dha() {
        return dha;
    }

    @Override
    public Double get_dha_coefficient() {
        return dha / weight;
    }

    @Override
    public Double get_epa() {
        return epa;
    }

    @Override
    public Double get_epa_coefficient() {
        return epa / weight;
    }

    @Override
    public Double get_monounsaturated_fat() {
        return monounsaturated_fat;
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return monounsaturated_fat / weight;
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return polyunsaturated_fat;
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return polyunsaturated_fat / weight;
    }

    @Override
    public Double get_linoleic_acid() {
        return linoleic_acid;
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return linoleic_acid / weight;
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return alpha_linolenic_acid;
    }

    @Override
    public Double get_alpha_linolenic_acid_coefficient() {
        return alpha_linolenic_acid / weight;
    }

    public static String get_category_name() {
        return "Beverages";
    }

    @Override
    public String toString() {
        return get_food_name();
    }

    @Override
    public Double get_protein_atwater_factor() {
        return protein_atwater_factor;
    }

    @Override
    public Double get_carbohydrate_by_difference_atwater_factor() {
        return carbohydrate_by_difference_atwater_factor;
    }

    @Override
    public Double get_fat_atwater_factor() {
        return fat_atwater_factor;
    }

    @Override
    public Double get_alcohol_atwater_factor() {
        return alcohol_atwater_factor;
    }

    @Override
    public Double get_glycemic_index() {
        return glycemic_index;
    }

    @Override
    public Double get_food_quotient() {
        Double fq = get_energy_digestible_carbohydrate() / get_energy_digestible() * 1.00
                + get_energy_fat() / get_energy_digestible() * 0.71
                + get_energy_protein() / get_energy_digestible() * 0.81
                + get_energy_alcohol() / get_energy_digestible() * 0.667;
        return fq;
    }
}
