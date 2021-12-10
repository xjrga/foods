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

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public abstract class Abstract_food implements Food {

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
    private Double flouride;
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

    public Abstract_food() {
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
        set_alcohol_atwater_factor(7.0);
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

    @Override
    public final Double get_carbohydrate_by_difference() {
        return carbohydrate_by_difference;
    }

    @Override
    public final void set_carbohydrate_by_difference(Double quantity) {
        carbohydrate_by_difference = quantity;
    }

    @Override
    public final Double get_carbohydrate_by_difference_coefficient() {
        return carbohydrate_by_difference / weight;
    }

    @Override
    public final Double get_carbohydrate_by_difference_atwater_factor() {
        return carbohydrate_by_difference_atwater_factor;
    }

    @Override
    public final void set_carbohydrate_by_difference_atwater_factor(Double quantity) {
        carbohydrate_by_difference_atwater_factor = quantity;
    }

    @Override
    public final Double get_fiber() {
        return fiber;
    }

    @Override
    public final void set_fiber(Double quantity) {
        fiber = quantity;
    }

    @Override
    public final Double get_fiber_coefficient() {
        return fiber / weight;
    }

    @Override
    public final Double get_fat() {
        return fat;
    }

    @Override
    public final void set_fat(Double quantity) {
        fat = quantity;
    }

    @Override
    public final Double get_fat_coefficient() {
        return fat / weight;
    }

    @Override
    public final Double get_fat_atwater_factor() {
        return fat_atwater_factor;
    }

    @Override
    public final void set_fat_atwater_factor(Double quantity) {
        fat_atwater_factor = quantity;
    }

    @Override
    public final Double get_alcohol() {
        return alcohol;
    }

    @Override
    public final void set_alcohol(Double quantity) {
        alcohol = quantity;
    }

    @Override
    public final Double get_alcohol_coefficient() {
        return alcohol / weight;
    }

    @Override
    public final Double get_alcohol_atwater_factor() {
        return alcohol_atwater_factor;
    }

    @Override
    public final void set_alcohol_atwater_factor(Double quantity) {
        alcohol_atwater_factor = quantity;
    }

    //calculated carbs
    @Override
    public final Double get_digestible_carbohydrate() {
        return carbohydrate_by_difference - fiber;
    }

    @Override
    public final Double get_digestible_carbs_coefficient() {
        return get_digestible_carbohydrate() / weight;
    }

    //fats
    @Override
    public final Double get_cholesterol() {
        return cholesterol;
    }

    @Override
    public final void set_cholesterol(Double quantity) {
        cholesterol = quantity;
    }

    @Override
    public final Double get_cholesterol_coefficient() {
        return cholesterol / weight;
    }

    @Override
    public final Double get_monounsaturated_fat() {
        return monounsaturated_fat;
    }

    @Override
    public final void set_monounsaturated_fat(Double quantity) {
        monounsaturated_fat = quantity;
    }

    @Override
    public final Double get_monounsaturated_fat_coefficient() {
        return monounsaturated_fat / weight;
    }

    @Override
    public final Double get_polyunsaturated_fat() {
        return polyunsaturated_fat;
    }

    @Override
    public final void set_polyunsaturated_fat(Double quantity) {
        polyunsaturated_fat = quantity;
    }

    @Override
    public final Double get_polyunsaturated_fat_coefficient() {
        return polyunsaturated_fat / weight;
    }

    @Override
    public final Double get_saturated_fat() {
        return saturated_fat;
    }

    @Override
    public final void set_saturated_fat(Double quantity) {
        saturated_fat = quantity;
    }

    @Override
    public final Double get_saturated_fat_coefficient() {
        return saturated_fat / weight;
    }

    //protein
    @Override
    public final Double get_complete_protein() {
        return complete_protein;
    }

    @Override
    public final void set_complete_protein(Double quantity) {
        complete_protein = quantity;
    }

    @Override
    public final Double get_complete_protein_coefficient() {
        return complete_protein / weight;
    }

    //minerals
    @Override
    public final Double get_calcium() {
        return calcium;
    }

    @Override
    public final void set_calcium(Double quantity) {
        calcium = quantity;
    }

    @Override
    public final Double get_calcium_coefficient() {
        return calcium / weight;
    }

    @Override
    public final Double get_copper() {
        return copper;
    }

    @Override
    public final void set_copper(Double quantity) {
        copper = quantity;
    }

    @Override
    public final Double get_copper_coefficient() {
        return copper / weight;
    }

    @Override
    public final Double get_fluoride() {
        return flouride;
    }

    @Override
    public final void set_fluoride(Double quantity) {
        flouride = quantity;
    }

    @Override
    public final Double get_fluoride_coefficient() {
        return flouride / weight;
    }

    @Override
    public final Double get_iron() {
        return iron;
    }

    @Override
    public final void set_iron(Double quantity) {
        iron = quantity;
    }

    @Override
    public final Double get_iron_coefficient() {
        return iron / weight;
    }

    @Override
    public final Double get_magnesium() {
        return magnesium;
    }

    @Override
    public final void set_magnesium(Double quantity) {
        magnesium = quantity;
    }

    @Override
    public final Double get_magnesium_coefficient() {
        return magnesium / weight;
    }

    @Override
    public final Double get_manganese() {
        return manganese;
    }

    @Override
    public final void set_manganese(Double quantity) {
        manganese = quantity;
    }

    @Override
    public final Double get_manganese_coefficient() {
        return manganese / weight;
    }

    @Override
    public final Double get_phosphorus() {
        return phosphorus;
    }

    @Override
    public final void set_phosphorus(Double quantity) {
        phosphorus = quantity;
    }

    @Override
    public final Double get_phosphorus_coefficient() {
        return phosphorus / weight;
    }

    @Override
    public final Double get_potassium() {
        return potassium;
    }

    @Override
    public final void set_potassium(Double quantity) {
        potassium = quantity;
    }

    @Override
    public final Double get_potassium_coefficient() {
        return potassium / weight;
    }

    @Override
    public final Double get_selenium() {
        return selenium;
    }

    @Override
    public final void set_selenium(Double quantity) {
        selenium = quantity;
    }

    @Override
    public final Double get_selenium_coefficient() {
        return selenium / weight;
    }

    @Override
    public final Double get_sodium() {
        return sodium;
    }

    @Override
    public final void set_sodium(Double quantity) {
        sodium = quantity;
    }

    @Override
    public final Double get_sodium_coefficient() {
        return sodium / weight;
    }

    @Override
    public final Double get_zinc() {
        return zinc;
    }

    @Override
    public final void set_zinc(Double quantity) {
        zinc = quantity;
    }

    @Override
    public final Double get_zinc_coefficient() {
        return zinc / weight;
    }

    //vitamins
    @Override
    public final Double get_folate() {
        return folate;
    }

    @Override
    public final void set_folate(Double quantity) {
        folate = quantity;
    }

    @Override
    public final Double get_folate_coefficient() {
        return folate / weight;
    }

    @Override
    public final Double get_niacin() {
        return niacin;
    }

    @Override
    public final void set_niacin(Double quantity) {
        niacin = quantity;
    }

    @Override
    public final Double get_niacin_coefficient() {
        return niacin / weight;
    }

    @Override
    public final Double get_pantothenic_acid() {
        return pantothenic_acid;
    }

    @Override
    public final void set_pantothenic_acid(Double quantity) {
        pantothenic_acid = quantity;
    }

    @Override
    public final Double get_pantothenic_acid_coefficient() {
        return pantothenic_acid / weight;
    }

    @Override
    public final Double get_riboflavin() {
        return riboflavin;
    }

    @Override
    public final void set_riboflavin(Double quantity) {
        riboflavin = quantity;
    }

    @Override
    public final Double get_riboflavin_coefficient() {
        return riboflavin / weight;
    }

    @Override
    public final Double get_thiamin() {
        return thiamin;
    }

    @Override
    public final void set_thiamin(Double quantity) {
        thiamin = quantity;
    }

    @Override
    public final Double get_thiamin_coefficient() {
        return thiamin / weight;
    }

    @Override
    public final Double get_vitamin_a() {
        return vitamin_a;
    }

    @Override
    public final void set_vitamin_a(Double quantity) {
        vitamin_a = quantity;
    }

    @Override
    public final Double get_vitamin_a_coefficient() {
        return vitamin_a / weight;
    }

    @Override
    public final Double get_vitamin_b12() {
        return vitamin_b12;
    }

    @Override
    public final void set_vitamin_b12(Double quantity) {
        vitamin_b12 = quantity;
    }

    @Override
    public final Double get_vitamin_b12_coefficient() {
        return vitamin_b12 / weight;
    }

    @Override
    public final Double get_vitamin_b6() {
        return vitamin_b6;
    }

    @Override
    public final void set_vitamin_b6(Double quantity) {
        vitamin_b6 = quantity;
    }

    @Override
    public final Double get_vitamin_b6_coefficient() {
        return vitamin_b6 / weight;
    }

    @Override
    public final Double get_vitamin_c() {
        return vitamin_c;
    }

    @Override
    public final void set_vitamin_c(Double quantity) {
        vitamin_c = quantity;
    }

    @Override
    public final Double get_vitamin_c_coefficient() {
        return vitamin_c / weight;
    }

    @Override
    public final Double get_vitamin_d() {
        return vitamin_d;
    }

    @Override
    public final void set_vitamin_d(Double quantity) {
        vitamin_d = quantity;
    }

    @Override
    public final Double get_vitamin_d_coefficient() {
        return vitamin_d / weight;
    }

    @Override
    public final Double get_vitamin_e() {
        return vitamin_e;
    }

    @Override
    public final void set_vitamin_e(Double quantity) {
        vitamin_e = quantity;
    }

    @Override
    public final Double get_vitamin_e_coefficient() {
        return vitamin_e / weight;
    }

    @Override
    public final Double get_vitamin_k() {
        return vitamin_k;
    }

    @Override
    public final void set_vitamin_k(Double quantity) {
        vitamin_k = quantity;
    }

    @Override
    public final Double get_vitamin_k_coefficient() {
        return vitamin_k / weight;
    }

    @Override
    public final Double get_choline() {
        return choline;
    }

    @Override
    public final void set_choline(Double quantity) {
        choline = quantity;
    }

    @Override
    public final Double get_choline_coefficient() {
        return choline / weight;
    }

    //glycemic
    @Override
    public final Double get_glycemic_index() {
        return glycemic_index;
    }

    @Override
    public final void set_glycemic_index(Double quantity) {
        glycemic_index = quantity;
    }

    @Override
    public final Double get_glycemic_load() {
        return get_digestible_carbohydrate() * (get_glycemic_index() / 100);
    }

    @Override
    public final Double get_glycemic_load_coefficient() {
        return get_glycemic_load() / weight;
    }

    //omega-3
    @Override
    public final Double get_alpha_linolenic_acid() {
        return alphalinolenic_acid;
    }

    @Override
    public final void set_alpha_linolenic_acid(Double quantity) {
        alphalinolenic_acid = quantity;
    }

    @Override
    public final Double get_alphalinolenic_acid_coefficient() {
        return alphalinolenic_acid / weight;
    }

    @Override
    public final Double get_linoleic_acid() {
        return linoleic_acid;
    }

    @Override
    public final void set_linoleic_acid(Double quantity) {
        linoleic_acid = quantity;
    }

    @Override
    public final Double get_linoleic_acid_coefficient() {
        return linoleic_acid / weight;
    }

    @Override
    public final Double get_dha() {
        return dha;
    }

    @Override
    public final void set_dha(Double quantity) {
        dha = quantity;
    }

    @Override
    public final Double get_dha_coefficient() {
        return dha / weight;
    }

    @Override
    public final Double get_epa() {
        return epa;
    }

    @Override
    public final void set_epa(Double quantity) {
        epa = quantity;
    }

    @Override
    public final Double get_epa_coefficient() {
        return epa / weight;
    }

    //water
    @Override
    public final Double get_water() {
        return water;
    }

    @Override
    public final void set_water(Double quantity) {
        water = quantity;
    }

    @Override
    public final Double get_water_coefficient() {
        return water / weight;
    }

    //cost
    @Override
    public final Double get_cost() {
        return cost;
    }

    @Override
    public final void set_cost(Double quantity) {
        cost = quantity;
    }

    @Override
    public final Double get_cost_coefficient() {
        return cost / weight;
    }

    //calculated energy
    @Override
    public final Double get_energy_alcohol() {
        return get_alcohol() * get_alcohol_atwater_factor();
    }

    @Override
    public final Double get_energy_alcohol_coefficient() {
        return get_energy_alcohol() / weight;
    }

    @Override
    public final Double get_energy_digestible_carbohydrate() {
        return get_digestible_carbohydrate() * get_carbohydrate_by_difference_atwater_factor();
    }

    @Override
    public final Double get_energy_digestible_carbohydrate_coefficient() {
        return get_energy_digestible_carbohydrate() / weight;
    }

    @Override
    public final Double get_energy_digestible() {
        return get_energy_protein() + get_energy_fat() + get_energy_digestible_carbohydrate();
    }

    @Override
    public final Double get_energy_digestible_coefficient() {
        return get_energy_digestible() / weight;
    }

    @Override
    public final Double get_energy_fat() {
        return get_fat() * get_fat_atwater_factor();
    }

    @Override
    public final Double get_energy_fat_coefficient() {
        return get_energy_fat() / weight;
    }

    @Override
    public final Double get_energy_no_protein() {
        return get_energy_fat() + get_energy_digestible_carbohydrate();
    }

    @Override
    public final Double get_energy_no_protein_coefficient() {
        return get_energy_no_protein() / weight;
    }

    @Override
    public final Double get_energy_protein() {
        return get_protein() * get_protein_atwater_factor();
    }

    @Override
    public final Double get_energy_protein_coefficient() {
        return get_energy_protein() / weight;
    }
}
