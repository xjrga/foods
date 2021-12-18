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
public abstract class Food_abstract implements Food_mutable, Food {

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

    /**
     *
     */
    public Food_abstract() {
        set_food_name("");
        set_food_label("");
        set_weight(0.0);
        set_gross_energy(0.0);
        set_protein(0.0);
        set_carbohydrate_by_difference(0.0);
        set_fiber(0.0);
        set_fat(0.0);
        set_alcohol(0.0);
        set_cholesterol(0.0);
        set_monounsaturated_fat(0.0);
        set_polyunsaturated_fat(0.0);
        set_saturated_fat(0.0);
        set_complete_protein(0.0);
        set_calcium(0.0);
        set_copper(0.0);
        set_fluoride(0.0);
        set_iron(0.0);
        set_magnesium(0.0);
        set_manganese(0.0);
        set_phosphorus(0.0);
        set_potassium(0.0);
        set_selenium(0.0);
        set_sodium(0.0);
        set_zinc(0.0);
        set_folate(0.0);
        set_niacin(0.0);
        set_pantothenic_acid(0.0);
        set_riboflavin(0.0);
        set_thiamin(0.0);
        set_vitamin_a(0.0);
        set_vitamin_b12(0.0);
        set_vitamin_b6(0.0);
        set_vitamin_c(0.0);
        set_vitamin_d(0.0);
        set_vitamin_e(0.0);
        set_vitamin_k(0.0);
        set_choline(0.0);
        set_glycemic_index(0.0);
        set_alpha_linolenic_acid(0.0);
        set_linoleic_acid(0.0);
        set_dha(0.0);
        set_epa(0.0);
        set_water(0.0);
        set_cost(0.0);
        //
        set_protein_atwater_factor(4.0);
        set_carbohydrate_by_difference_atwater_factor(4.0);
        set_fat_atwater_factor(9.0);
        set_alcohol_atwater_factor(6.93);
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
    public final Double get_weight() {
        return weight;
    }

    @Override
    public final void set_weight(Double quantity) {
        weight = quantity;
    }

    @Override
    public final Double get_energy_gross() {
        return gross_energy;
    }

    @Override
    public final void set_gross_energy(Double quantity) {
        gross_energy = quantity;
    }

    @Override
    public final Double get_energy_gross_coefficient() {
        return gross_energy / weight;
    }

    @Override
    public final Double get_protein() {
        return protein;
    }

    @Override
    public final void set_protein(Double quantity) {
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
    public final Double get_carbohydrate_by_difference() {
        return carbohydrate_by_difference;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_carbohydrate_by_difference(Double quantity) {
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
    public final Double get_fiber() {
        return fiber;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fiber(Double quantity) {
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
    public final Double get_fat() {
        return fat;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fat(Double quantity) {
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
    public final Double get_alcohol() {
        return alcohol;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_alcohol(Double quantity) {
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
    public final Double get_digestible_carbohydrate() {
        return carbohydrate_by_difference - fiber;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_digestible_carbohydrate_coefficient() {
        return get_digestible_carbohydrate() / weight;
    }

    //fats
    /**
     *
     * @return
     */
    @Override
    public final Double get_cholesterol() {
        return cholesterol;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_cholesterol(Double quantity) {
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
    public final Double get_monounsaturated_fat() {
        return monounsaturated_fat;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_monounsaturated_fat(Double quantity) {
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
    public final Double get_polyunsaturated_fat() {
        return polyunsaturated_fat;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_polyunsaturated_fat(Double quantity) {
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
    public final Double get_saturated_fat() {
        return saturated_fat;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_saturated_fat(Double quantity) {
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
    public final Double get_complete_protein() {
        return complete_protein;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_complete_protein(Double quantity) {
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
    public final Double get_calcium() {
        return calcium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_calcium(Double quantity) {
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
    public final Double get_copper() {
        return copper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_copper(Double quantity) {
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
    public final Double get_fluoride() {
        return fluoride;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fluoride(Double quantity) {
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
    public final Double get_iron() {
        return iron;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_iron(Double quantity) {
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
    public final Double get_magnesium() {
        return magnesium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_magnesium(Double quantity) {
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
    public final Double get_manganese() {
        return manganese;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_manganese(Double quantity) {
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
    public final Double get_phosphorus() {
        return phosphorus;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_phosphorus(Double quantity) {
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
    public final Double get_potassium() {
        return potassium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_potassium(Double quantity) {
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
    public final Double get_selenium() {
        return selenium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_selenium(Double quantity) {
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
    public final Double get_sodium() {
        return sodium;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_sodium(Double quantity) {
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
    public final Double get_zinc() {
        return zinc;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_zinc(Double quantity) {
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
    public final Double get_folate() {
        return folate;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_folate(Double quantity) {
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
    public final Double get_niacin() {
        return niacin;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_niacin(Double quantity) {
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
    public final Double get_pantothenic_acid() {
        return pantothenic_acid;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_pantothenic_acid(Double quantity) {
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
    public final Double get_riboflavin() {
        return riboflavin;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_riboflavin(Double quantity) {
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
    public final Double get_thiamin() {
        return thiamin;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_thiamin(Double quantity) {
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
    public final Double get_vitamin_a() {
        return vitamin_a;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_a(Double quantity) {
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
    public final Double get_vitamin_b12() {
        return vitamin_b12;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b12(Double quantity) {
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
    public final Double get_vitamin_b6() {
        return vitamin_b6;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b6(Double quantity) {
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
    public final Double get_vitamin_c() {
        return vitamin_c;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_c(Double quantity) {
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
    public final Double get_vitamin_d() {
        return vitamin_d;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_d(Double quantity) {
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
    public final Double get_vitamin_e() {
        return vitamin_e;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_e(Double quantity) {
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
    public final Double get_vitamin_k() {
        return vitamin_k;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_k(Double quantity) {
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
    public final Double get_choline() {
        return choline;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_choline(Double quantity) {
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
        return get_digestible_carbohydrate() * (get_glycemic_index() / 100);
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
    public final Double get_alpha_linolenic_acid() {
        return alphalinolenic_acid;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_alpha_linolenic_acid(Double quantity) {
        alphalinolenic_acid = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_alphalinolenic_acid_coefficient() {
        return alphalinolenic_acid / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_linoleic_acid() {
        return linoleic_acid;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_linoleic_acid(Double quantity) {
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
    public final Double get_dha() {
        return dha;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_dha(Double quantity) {
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
    public final Double get_epa() {
        return epa;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_epa(Double quantity) {
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
    public final Double get_water() {
        return water;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_water(Double quantity) {
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
    public final Double get_cost() {
        return cost;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_cost(Double quantity) {
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
    public final Double get_energy_alcohol() {
        return get_alcohol() * get_alcohol_atwater_factor();
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_alcohol_coefficient() {
        return get_energy_alcohol() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_digestible_carbohydrate() {
        return get_digestible_carbohydrate() * get_carbohydrate_by_difference_atwater_factor();
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_digestible_carbohydrate_coefficient() {
        return get_energy_digestible_carbohydrate() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_digestible() {
        return get_energy_protein() + get_energy_fat() + get_energy_digestible_carbohydrate();
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_digestible_coefficient() {
        return get_energy_digestible() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_fat() {
        return get_fat() * get_fat_atwater_factor();
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_fat_coefficient() {
        return get_energy_fat() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_no_protein() {
        return get_energy_fat() + get_energy_digestible_carbohydrate();
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_no_protein_coefficient() {
        return get_energy_no_protein() / weight;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_protein() {
        return get_protein() * get_protein_atwater_factor();
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_energy_protein_coefficient() {
        return get_energy_protein() / weight;
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
        final Food_abstract other = (Food_abstract) obj;
        return Objects.equals(name, other.name);
    }
}
