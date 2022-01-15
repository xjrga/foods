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

import java.util.Objects;

/**
 * This is an abstract food to extend from
 */
public abstract class Abstract_food implements Interface_food_set, Interface_food_get, Interface_food_coefficient {

    private String name;
    private String label;
    private Double weight;
    private Double gross_energy;
    private Double protein;
    private Double protein_atwater_factor;
    private Double carbohydrate_by_difference;
    private Double carbohydrate_by_difference_atwater_factor;
    private Double fiber;
    private Double fat;
    private Double fat_atwater_factor;
    private Double alcohol;
    private Double alcohol_atwater_factor;
    private Double cholesterol;
    private Double monounsaturated_fat;
    private Double polyunsaturated_fat;
    private Double saturated_fat;
    private Double complete_protein;
    private Double calcium;
    private Double copper;
    private Double fluoride;
    private Double iron;
    private Double magnesium;
    private Double manganese;
    private Double phosphorus;
    private Double potassium;
    private Double selenium;
    private Double sodium;
    private Double zinc;
    private Double folate;
    private Double niacin;
    private Double pantothenic_acid;
    private Double riboflavin;
    private Double thiamin;
    private Double vitamin_a;
    private Double vitamin_b12;
    private Double vitamin_b6;
    private Double vitamin_c;
    private Double vitamin_d;
    private Double vitamin_e;
    private Double vitamin_k;
    private Double choline;
    private Double glycemic_index;
    private Double alphalinolenic_acid;
    private Double linoleic_acid;
    private Double dha;
    private Double epa;
    private Double water;
    private Double cost;
    private Double energy_alcohol = -1.0;
    private Double energy_digestible_carbohydrate = -1.0;
    private Double energy_digestible = -1.0;
    private Double energy_fat = -1.0;
    private Double energy_protein = -1.0;

    /**
     *
     */
    public Abstract_food() {
        set_food_name("");
        set_food_label("");
        set_weight_in_grams(0.0);
        set_energy_gross_in_kilocalories(0.0);
        set_protein_in_grams(0.0);
        set_carbohydrate_by_difference_in_grams(0.0);
        set_fiber_in_grams(0.0);
        set_fat_in_grams(0.0);
        set_alcohol_in_grams(0.0);
        set_cholesterol_in_milligrams(0.0);
        set_monounsaturated_fat_in_grams(0.0);
        set_polyunsaturated_fat_in_grams(0.0);
        set_saturated_fat_in_grams(0.0);
        set_complete_protein_in_grams(0.0);
        set_calcium_in_milligrams(0.0);
        set_copper_in_milligrams(0.0);
        set_fluoride_in_micrograms(0.0);
        set_iron_in_milligrams(0.0);
        set_magnesium_in_milligrams(0.0);
        set_manganese_in_milligrams(0.0);
        set_phosphorus_in_milligrams(0.0);
        set_potassium_in_milligrams(0.0);
        set_selenium_in_micrograms(0.0);
        set_sodium_in_milligrams(0.0);
        set_zinc_in_milligrams(0.0);
        set_folate_in_micrograms(0.0);
        set_niacin_in_milligrams(0.0);
        set_pantothenic_acid_in_milligrams(0.0);
        set_riboflavin_in_milligrams(0.0);
        set_thiamin_in_milligrams(0.0);
        set_vitamin_a_in_micrograms(0.0);
        set_vitamin_b12_in_micrograms(0.0);
        set_vitamin_b6_in_milligrams(0.0);
        set_vitamin_c_in_milligrams(0.0);
        set_vitamin_d_in_micrograms(0.0);
        set_vitamin_e_in_milligrams(0.0);
        set_vitamin_k_in_micrograms(0.0);
        set_choline_in_milligrams(0.0);
        set_glycemic_index(0.0);
        set_alpha_linolenic_acid_in_grams(0.0);
        set_linoleic_acid_in_grams(0.0);
        set_dha_in_grams(0.0);
        set_epa_in_grams(0.0);
        set_water_in_grams(0.0);
        set_cost_in_dollars(0.0);
        //
        set_protein_atwater_factor(4.0);
        set_carbohydrate_by_difference_atwater_factor(4.0);
        set_fat_atwater_factor(9.0);
        set_alcohol_atwater_factor(6.93);
    }

    public Abstract_food(Food_data food) {
        set_food_name(food.get_food_name());
        set_food_label(food.get_food_label());
        set_weight_in_grams(food.get_weight_in_grams());
        set_energy_gross_in_kilocalories(food.get_energy_gross_in_kilocalories());
        set_protein_in_grams(food.get_protein_in_grams());
        set_carbohydrate_by_difference_in_grams(food.get_carbohydrate_by_difference_in_grams());
        set_fiber_in_grams(food.get_fiber_in_grams());
        set_fat_in_grams(food.get_fat_in_grams());
        set_alcohol_in_grams(food.get_alcohol_in_grams());
        set_cholesterol_in_milligrams(food.get_cholesterol_in_milligrams());
        set_monounsaturated_fat_in_grams(food.get_monounsaturated_fat_in_grams());
        set_polyunsaturated_fat_in_grams(food.get_polyunsaturated_fat_in_grams());
        set_saturated_fat_in_grams(food.get_saturated_fat_in_grams());
        set_complete_protein_in_grams(food.get_complete_protein_in_grams());
        set_calcium_in_milligrams(food.get_calcium_in_milligrams());
        set_copper_in_milligrams(food.get_copper_in_milligrams());
        set_fluoride_in_micrograms(food.get_fluoride_in_micrograms());
        set_iron_in_milligrams(food.get_iron_in_milligrams());
        set_magnesium_in_milligrams(food.get_magnesium_in_milligrams());
        set_manganese_in_milligrams(food.get_manganese_in_milligrams());
        set_phosphorus_in_milligrams(food.get_phosphorus_in_milligrams());
        set_potassium_in_milligrams(food.get_potassium_in_milligrams());
        set_selenium_in_micrograms(food.get_selenium_in_micrograms());
        set_sodium_in_milligrams(food.get_sodium_in_milligrams());
        set_zinc_in_milligrams(food.get_zinc_in_milligrams());
        set_folate_in_micrograms(food.get_folate_in_micrograms());
        set_niacin_in_milligrams(food.get_niacin_in_milligrams());
        set_pantothenic_acid_in_milligrams(food.get_pantothenic_acid_in_milligrams());
        set_riboflavin_in_milligrams(food.get_riboflavin_in_milligrams());
        set_thiamin_in_milligrams(food.get_thiamin_in_milligrams());
        set_vitamin_a_in_micrograms(food.get_vitamin_a_in_micrograms());
        set_vitamin_b12_in_micrograms(food.get_vitamin_b12_in_micrograms());
        set_vitamin_b6_in_milligrams(food.get_vitamin_b6_in_milligrams());
        set_vitamin_c_in_milligrams(food.get_vitamin_c_in_milligrams());
        set_vitamin_d_in_micrograms(food.get_vitamin_d_in_micrograms());
        set_vitamin_e_in_milligrams(food.get_vitamin_e_in_milligrams());
        set_vitamin_k_in_micrograms(food.get_vitamin_k_in_micrograms());
        set_choline_in_milligrams(food.get_choline_in_milligrams());
        set_glycemic_index(food.get_glycemic_index());
        set_alpha_linolenic_acid_in_grams(food.get_alpha_linolenic_acid_in_grams());
        set_linoleic_acid_in_grams(food.get_linoleic_acid_in_grams());
        set_dha_in_grams(food.get_dha_in_grams());
        set_epa_in_grams(food.get_epa_in_grams());
        set_water_in_grams(food.get_water_in_grams());
        set_cost_in_dollars(food.get_cost_in_dollars());
        //
        if (!(food.get_protein_atwater_factor() == -1)) {
            set_protein_atwater_factor(4.0);
        } else {
            set_protein_atwater_factor(food.get_protein_atwater_factor());
        }
        if (!(food.get_carbohydrate_by_difference_atwater_factor() == -1)) {
            set_carbohydrate_by_difference_atwater_factor(4.0);
        } else {
            set_carbohydrate_by_difference_atwater_factor(food.get_carbohydrate_by_difference_atwater_factor());
        }
        if (!(food.get_fat_atwater_factor() == -1)) {
            set_fat_atwater_factor(9.0);
        } else {
            set_fat_atwater_factor(food.get_fat_atwater_factor());
        }
        if (!(food.get_alcohol_atwater_factor() == -1)) {
            set_alcohol_atwater_factor(6.93);
        } else {
            set_alcohol_atwater_factor(food.get_alcohol_atwater_factor());
        }

    }

    @Override
    public final void set_food_name(String text) {
        name = text;
    }

    @Override
    public final String get_food_name() {
        return name;
    }

    @Override
    public final void set_food_label(String text) {
        label = text;
    }

    @Override
    public final String get_food_label() {
        return label;
    }

    @Override
    public final Double get_weight_in_grams() {
        return weight;
    }

    @Override
    public final void set_weight_in_grams(Double quantity) {
        weight = quantity;
    }

    @Override
    public final Double get_energy_gross_in_kilocalories() {
        return gross_energy;
    }

    @Override
    public final void set_energy_gross_in_kilocalories(Double quantity) {
        gross_energy = quantity;
    }

    @Override
    public final Double get_energy_gross_coefficient_in_kilocalories() {
        return gross_energy / weight;
    }

    @Override
    public final Double get_protein_in_grams() {
        return protein;
    }

    @Override
    public final void set_protein_in_grams(Double quantity) {
        protein = quantity;
    }

    @Override
    public final Double get_protein_coefficient() {
        return protein / weight;
    }

    @Override
    public final Double get_protein_atwater_factor() {
        return protein_atwater_factor;
    }

    @Override
    public final void set_protein_atwater_factor(Double quantity) {
        protein_atwater_factor = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_carbohydrate_by_difference_in_grams() {
        return carbohydrate_by_difference;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_carbohydrate_by_difference_in_grams(Double quantity) {
        carbohydrate_by_difference = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_carbohydrate_by_difference_coefficient() {
        return carbohydrate_by_difference / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_carbohydrate_by_difference_atwater_factor() {
        return carbohydrate_by_difference_atwater_factor;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_carbohydrate_by_difference_atwater_factor(Double quantity) {
        carbohydrate_by_difference_atwater_factor = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fiber_in_grams() {
        return fiber;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fiber_in_grams(Double quantity) {
        fiber = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fiber_coefficient() {
        return fiber / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fat_in_grams() {
        return fat;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fat_in_grams(Double quantity) {
        fat = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fat_coefficient() {
        return fat / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fat_atwater_factor() {
        return fat_atwater_factor;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fat_atwater_factor(Double quantity) {
        fat_atwater_factor = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_alcohol_in_grams() {
        return alcohol;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_alcohol_in_grams(Double quantity) {
        alcohol = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_alcohol_coefficient() {
        return alcohol / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_alcohol_atwater_factor() {
        return alcohol_atwater_factor;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_alcohol_atwater_factor(Double quantity) {
        alcohol_atwater_factor = quantity;
    }

    //calculated carbs
    /**
     *
     * @return
     */
    @Override
    public final Double get_digestible_carbohydrate_in_grams() {
        return carbohydrate_by_difference - fiber;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_digestible_carbohydrate_coefficient() {
        return get_digestible_carbohydrate_in_grams() / weight;
    }

    //fats
    /**
     *
     * @return
     */
    @Override
    public final Double get_cholesterol_in_milligrams() {
        return cholesterol;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_cholesterol_in_milligrams(Double quantity) {
        cholesterol = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_cholesterol_coefficient() {
        return cholesterol / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_monounsaturated_fat_in_grams() {
        return monounsaturated_fat;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_monounsaturated_fat_in_grams(Double quantity) {
        monounsaturated_fat = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_monounsaturated_fat_coefficient() {
        return monounsaturated_fat / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_polyunsaturated_fat_in_grams() {
        return polyunsaturated_fat;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_polyunsaturated_fat_in_grams(Double quantity) {
        polyunsaturated_fat = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_polyunsaturated_fat_coefficient() {
        return polyunsaturated_fat / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_saturated_fat_in_grams() {
        return saturated_fat;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_saturated_fat_in_grams(Double quantity) {
        saturated_fat = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_saturated_fat_coefficient() {
        return saturated_fat / weight;
    }

    //protein
    /**
     *
     * @return
     */
    @Override
    public final Double get_complete_protein_in_grams() {
        return complete_protein;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_complete_protein_in_grams(Double quantity) {
        complete_protein = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_complete_protein_coefficient() {
        return complete_protein / weight;
    }

    //minerals
    /**
     *
     * @return
     */
    @Override
    public final Double get_calcium_in_milligrams() {
        return calcium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_calcium_in_milligrams(Double quantity) {
        calcium = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_calcium_coefficient() {
        return calcium / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_copper_in_milligrams() {
        return copper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_copper_in_milligrams(Double quantity) {
        copper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_copper_coefficient() {
        return copper / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fluoride_in_micrograms() {
        return fluoride;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fluoride_in_micrograms(Double quantity) {
        fluoride = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fluoride_coefficient() {
        return fluoride / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_iron_in_milligrams() {
        return iron;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_iron_in_milligrams(Double quantity) {
        iron = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_iron_coefficient() {
        return iron / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_magnesium_in_milligrams() {
        return magnesium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_magnesium_in_milligrams(Double quantity) {
        magnesium = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_magnesium_coefficient() {
        return magnesium / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_manganese_in_milligrams() {
        return manganese;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_manganese_in_milligrams(Double quantity) {
        manganese = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_manganese_coefficient() {
        return manganese / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_phosphorus_in_milligrams() {
        return phosphorus;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_phosphorus_in_milligrams(Double quantity) {
        phosphorus = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_phosphorus_coefficient() {
        return phosphorus / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_potassium_in_milligrams() {
        return potassium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_potassium_in_milligrams(Double quantity) {
        potassium = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_potassium_coefficient() {
        return potassium / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_selenium_in_micrograms() {
        return selenium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_selenium_in_micrograms(Double quantity) {
        selenium = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_selenium_coefficient() {
        return selenium / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_sodium_in_milligrams() {
        return sodium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_sodium_in_milligrams(Double quantity) {
        sodium = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_sodium_coefficient() {
        return sodium / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_zinc_in_milligrams() {
        return zinc;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_zinc_in_milligrams(Double quantity) {
        zinc = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_zinc_coefficient() {
        return zinc / weight;
    }

    //vitamins
    /**
     *
     * @return
     */
    @Override
    public final Double get_folate_in_micrograms() {
        return folate;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_folate_in_micrograms(Double quantity) {
        folate = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_folate_coefficient() {
        return folate / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_niacin_in_milligrams() {
        return niacin;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_niacin_in_milligrams(Double quantity) {
        niacin = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_niacin_coefficient() {
        return niacin / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_pantothenic_acid_in_milligrams() {
        return pantothenic_acid;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_pantothenic_acid_in_milligrams(Double quantity) {
        pantothenic_acid = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_pantothenic_acid_coefficient() {
        return pantothenic_acid / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_riboflavin_in_milligrams() {
        return riboflavin;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_riboflavin_in_milligrams(Double quantity) {
        riboflavin = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_riboflavin_coefficient() {
        return riboflavin / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_thiamin_in_milligrams() {
        return thiamin;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_thiamin_in_milligrams(Double quantity) {
        thiamin = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_thiamin_coefficient() {
        return thiamin / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_a_in_micrograms() {
        return vitamin_a;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_a_in_micrograms(Double quantity) {
        vitamin_a = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_a_coefficient() {
        return vitamin_a / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b12_in_micrograms() {
        return vitamin_b12;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b12_in_micrograms(Double quantity) {
        vitamin_b12 = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b12_coefficient() {
        return vitamin_b12 / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b6_in_milligrams() {
        return vitamin_b6;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b6_in_milligrams(Double quantity) {
        vitamin_b6 = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b6_coefficient() {
        return vitamin_b6 / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_c_in_milligrams() {
        return vitamin_c;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_c_in_milligrams(Double quantity) {
        vitamin_c = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_c_coefficient() {
        return vitamin_c / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_d_in_micrograms() {
        return vitamin_d;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_d_in_micrograms(Double quantity) {
        vitamin_d = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_d_coefficient() {
        return vitamin_d / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_e_in_milligrams() {
        return vitamin_e;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_e_in_milligrams(Double quantity) {
        vitamin_e = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_e_coefficient() {
        return vitamin_e / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_k_in_micrograms() {
        return vitamin_k;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_k_in_micrograms(Double quantity) {
        vitamin_k = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_k_coefficient() {
        return vitamin_k / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_choline_in_milligrams() {
        return choline;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_choline_in_milligrams(Double quantity) {
        choline = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_choline_coefficient() {
        return choline / weight;
    }

    //glycemic
    /**
     * Get glycemic index (0-100)
     * <p>
     * Glycemic index is total glucose exposure delivered by test food (in two
     * hours) divided by total glucose exposure delivered by standard food (in
     * two hours) multiplied by 100. Either 50 g of glucose or white bread are
     * used as the standard. It is a percentage of standard.
     *
     * @return
     */
    @Override
    public final Double get_glycemic_index() {
        return glycemic_index;
    }

    /**
     * Set glycemic index (0-100)
     *
     * @param quantity
     */
    @Override
    public final void set_glycemic_index(Double quantity) {
        glycemic_index = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_glycemic_load() {
        return get_digestible_carbohydrate_in_grams() * (get_glycemic_index() / 100);
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_glycemic_load_coefficient() {
        return get_glycemic_load() / weight;
    }

    //omega-3
    /**
     *
     * @return
     */
    @Override
    public final Double get_alpha_linolenic_acid_in_grams() {
        return alphalinolenic_acid;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_alpha_linolenic_acid_in_grams(Double quantity) {
        alphalinolenic_acid = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_alpha_linolenic_acid_coefficient() {
        return alphalinolenic_acid / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_linoleic_acid_in_grams() {
        return linoleic_acid;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_linoleic_acid_in_grams(Double quantity) {
        linoleic_acid = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_linoleic_acid_coefficient() {
        return linoleic_acid / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_dha_in_grams() {
        return dha;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_dha_in_grams(Double quantity) {
        dha = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_dha_coefficient() {
        return dha / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_epa_in_grams() {
        return epa;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_epa_in_grams(Double quantity) {
        epa = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_epa_coefficient() {
        return epa / weight;
    }

    //water
    /**
     *
     * @return
     */
    @Override
    public final Double get_water_in_grams() {
        return water;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_water_in_grams(Double quantity) {
        water = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_water_coefficient() {
        return water / weight;
    }

    //cost
    /**
     *
     * @return
     */
    @Override
    public final Double get_cost_in_dollars() {
        return cost;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_cost_in_dollars(Double quantity) {
        cost = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_cost_coefficient() {
        return cost / weight;
    }

    //calculated energy
    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_alcohol_in_kilocalories() {
        return energy_alcohol == -1 ? get_alcohol_in_grams() * get_alcohol_atwater_factor() : energy_alcohol;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_alcohol_coefficient() {
        return get_energy_alcohol_in_kilocalories() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_digestible_carbohydrate_in_kilocalories() {
        return energy_digestible_carbohydrate == -1 ? get_digestible_carbohydrate_in_grams() * get_carbohydrate_by_difference_atwater_factor() : energy_digestible_carbohydrate;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_digestible_carbohydrate_coefficient() {
        return get_energy_digestible_carbohydrate_in_kilocalories() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_digestible_in_kilocalories() {
        return energy_digestible == -1 ? get_energy_protein_in_kilocalories() + get_energy_fat_in_kilocalories() + get_energy_digestible_carbohydrate_in_kilocalories() : energy_digestible;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_digestible_coefficient() {
        return get_energy_digestible_in_kilocalories() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_fat_in_kilocalories() {
        return energy_fat == -1 ? get_fat_in_grams() * get_fat_atwater_factor() : energy_fat;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_fat_coefficient() {
        return get_energy_fat_in_kilocalories() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_protein_in_kilocalories() {
        return energy_protein == -1 ? get_protein_in_grams() * get_protein_atwater_factor() : energy_protein;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_protein_coefficient() {
        return get_energy_protein_in_kilocalories() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_food_quotient() {
        Double fq = get_energy_digestible_carbohydrate_in_kilocalories() / get_energy_digestible_in_kilocalories() * 1.00
                + get_energy_fat_in_kilocalories() / get_energy_digestible_in_kilocalories() * 0.71
                + get_energy_protein_in_kilocalories() / get_energy_digestible_in_kilocalories() * 0.81
                + get_energy_alcohol_in_kilocalories() / get_energy_digestible_in_kilocalories() * 0.667;
        return fq;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Abstract_food other = (Abstract_food) obj;
        return Objects.equals(name, other.name);
    }
}
