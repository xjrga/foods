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
public enum Baked_products implements Interface_food {

    Bagels_cinnamon_raisin("Bagels, cinnamon-raisin", 100.0, 0.0, 0.0, 0.0, 9.8, 1.7, 55.2, 274.0, 0.0, 32.0, 2.3, 19.0, 3.8, 28.0, 100.0, 148.0, 344.0, 1.13, 0.16, 0.0, 0.87, 31.0, 21.0, 0.31, 0.0, 0.7, 0.38, 0.27, 3.08, 0.5, 0.06, 0.0, 14.6, 0.7, 174.0, 0.0, 0.27, 0.0, 0.0, 0.17, 0.67, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bread_pita_white_enriched("Bread, pita, white, enriched", 100.0, 0.0, 0.0, 70.0, 9.1, 1.2, 55.7, 275.0, 0.0, 32.1, 2.2, 86.0, 2.62, 26.0, 97.0, 120.0, 536.0, 0.84, 0.16, 0.0, 0.48, 27.1, 0.0, 0.3, 0.0, 0.0, 0.59, 0.32, 4.63, 0.39, 0.03, 0.0, 14.6, 0.2, 165.0, 0.0, 0.16, 0.0, 0.0, 0.1, 0.53, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bread_pita_whole_wheat("Bread, pita, whole-wheat", 100.0, 0.0, 0.0, 0.0, 9.8, 1.71, 55.89, 262.0, 0.0, 30.6, 6.1, 15.0, 3.06, 69.0, 180.0, 170.0, 527.0, 1.52, 0.29, 0.0, 1.74, 44.0, 0.0, 0.61, 0.0, 0.0, 0.33, 0.08, 2.84, 0.83, 0.26, 0.0, 26.5, 1.4, 35.0, 0.0, 0.14, 0.0, 0.0, 0.24, 0.74, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bread_rye("Bread, rye", 100.0, 0.0, 0.0, 58.0, 8.5, 3.3, 48.3, 259.0, 0.0, 37.3, 5.8, 73.0, 2.83, 40.0, 125.0, 166.0, 603.0, 1.14, 0.18, 51.0, 0.82, 30.9, 0.0, 0.33, 0.0, 0.4, 0.43, 0.33, 3.8, 0.44, 0.07, 0.0, 14.6, 1.2, 151.0, 0.0, 0.62, 0.0, 0.0, 1.31, 0.79, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bread_white_wheat("Bread, white wheat", 100.0, 0.0, 0.0, 70.0, 10.66, 2.15, 43.91, 238.0, 0.0, 39.6, 9.2, 684.0, 4.89, 26.0, 103.0, 127.0, 478.0, 0.95, 0.14, 0.0, 0.63, 16.1, 0.0, 0.38, 0.0, 0.0, 0.51, 0.25, 4.45, 0.45, 0.08, 0.0, 8.1, 7.7, 162.0, 0.0, 0.63, 0.0, 0.003, 0.39, 0.97, 0.87, 0.08, 4.0, 4.0, 9.0, 6.93),
    Bagels_wheat("Bagels, wheat", 100.0, 0.0, 0.0, 0.0, 10.2, 1.53, 48.89, 250.0, 0.0, 37.55, 4.1, 20.0, 2.76, 51.0, 142.0, 165.0, 439.0, 1.1, 0.17, 24.1, 1.43, 28.7, 0.0, 0.32, 0.0, 0.0, 0.4, 0.2, 3.37, 0.37, 0.14, 0.0, 9.8, 1.5, 108.0, 0.0, 0.0, 0.0, 0.0, 0.29, 0.93, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),
    Bread_naan_plain_commercially_prepared_refrigerated("Bread, naan, plain, commercially prepared, refrigerated", 100.0, 0.0, 0.0, 0.0, 9.62, 5.65, 50.43, 291.0, 0.0, 32.6, 2.2, 84.0, 3.25, 27.0, 100.0, 125.0, 465.0, 0.81, 0.12, 0.0, 0.51, 27.9, 0.0, 0.79, 0.0, 0.0, 0.78, 0.51, 5.84, 0.44, 0.09, 0.0, 0.0, 0.0, 0.0, 0.0, 1.39, 0.0, 0.0, 1.8, 2.09, 1.78, 0.27, 4.0, 4.0, 9.0, 6.93),
    Bagels_multigrain("Bagels, multigrain", 100.0, 0.0, 0.0, 0.0, 9.9, 1.24, 47.47, 241.0, 0.0, 39.4, 6.2, 124.0, 2.23, 85.0, 188.0, 204.0, 359.0, 1.52, 0.23, 0.0, 1.79, 26.9, 0.0, 0.66, 0.0, 0.0, 0.42, 0.25, 4.26, 0.51, 0.18, 0.0, 16.1, 0.6, 114.0, 6.0, 0.0, 0.0, 0.0, 0.31, 0.7, 0.0, 0.0, 4.0, 4.0, 9.0, 6.93),;

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

    Baked_products(
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
        return "Baked Products";
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
