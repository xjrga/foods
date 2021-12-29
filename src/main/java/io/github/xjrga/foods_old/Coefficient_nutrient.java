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

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Coefficient_nutrient {

    private final ArrayList<Interface_food> list;
    private final double[] alcohol;
    private final double[] alpha_linolenic_acid;
    private final double[] calcium;
    private final double[] carbohydrate_by_difference;
    private final double[] cholesterol;
    private final double[] choline;
    private final double[] complete_protein;
    private final double[] copper;
    private final double[] cost;
    private final double[] dha;
    private final double[] digestible_carbohydrate;
    private final double[] energy_alcohol;
    private final double[] energy_digestible;
    private final double[] energy_digestible_carbohydrate;
    private final double[] energy_fat;
    private final double[] energy_protein;
    private final double[] epa;
    private final double[] fat;
    private final double[] fiber;
    private final double[] fluoride;
    private final double[] folate;
    private final double[] glycemic_load;
    private final double[] gross_energy;
    private final double[] iron;
    private final double[] linoleic_acid;
    private final double[] magnesium;
    private final double[] manganese;
    private final double[] monounsaturated_fat;
    private final double[] niacin;
    private final double[] pantothenic_acid;
    private final double[] phosphorus;
    private final double[] polyunsaturated_fat;
    private final double[] potassium;
    private final double[] protein;
    private final double[] riboflavin;
    private final double[] saturated_fat;
    private final double[] selenium;
    private final double[] sodium;
    private final double[] thiamin;
    private final double[] vitamin_a;
    private final double[] vitamin_b12;
    private final double[] vitamin_b6;
    private final double[] vitamin_c;
    private final double[] vitamin_d;
    private final double[] vitamin_e;
    private final double[] vitamin_k;
    private final double[] water;
    private final double[] weight;
    private final double[] zinc;
    private final int size;

    public Coefficient_nutrient(ArrayList<Interface_food> food_list) {
        this.list = (ArrayList<Interface_food>) food_list.clone();
        size = list.size();
        alcohol = new double[size];
        alpha_linolenic_acid = new double[size];
        calcium = new double[size];
        carbohydrate_by_difference = new double[size];
        cholesterol = new double[size];
        choline = new double[size];
        complete_protein = new double[size];
        copper = new double[size];
        cost = new double[size];
        dha = new double[size];
        digestible_carbohydrate = new double[size];
        energy_alcohol = new double[size];
        energy_digestible_carbohydrate = new double[size];
        energy_digestible = new double[size];
        energy_fat = new double[size];
        energy_protein = new double[size];
        epa = new double[size];
        fat = new double[size];
        fiber = new double[size];
        fluoride = new double[size];
        folate = new double[size];
        glycemic_load = new double[size];
        gross_energy = new double[size];
        iron = new double[size];
        linoleic_acid = new double[size];
        magnesium = new double[size];
        manganese = new double[size];
        monounsaturated_fat = new double[size];
        niacin = new double[size];
        pantothenic_acid = new double[size];
        phosphorus = new double[size];
        polyunsaturated_fat = new double[size];
        potassium = new double[size];
        protein = new double[size];
        riboflavin = new double[size];
        saturated_fat = new double[size];
        selenium = new double[size];
        sodium = new double[size];
        thiamin = new double[size];
        vitamin_a = new double[size];
        vitamin_b12 = new double[size];
        vitamin_b6 = new double[size];
        vitamin_c = new double[size];
        vitamin_d = new double[size];
        vitamin_e = new double[size];
        vitamin_k = new double[size];
        water = new double[size];
        weight = new double[size];
        zinc = new double[size];
        populate_coefficient_arrays();
    }

    public final double[] get_energy_gross_coefficients() {
        return gross_energy;
    }

    public final double[] get_protein_coefficients() {
        return protein;
    }

    public final double[] get_carbohydrate_by_difference_coefficients() {
        return carbohydrate_by_difference;
    }

    public final double[] get_fiber_coefficients() {
        return fiber;
    }

    public final double[] get_fat_coefficients() {
        return fat;
    }

    public final double[] get_alcohol_coefficients() {
        return alcohol;
    }

    public final double[] get_digestible_carbohydrate_coefficients() {
        return digestible_carbohydrate;
    }

    public final double[] get_cholesterol_coefficients() {
        return cholesterol;
    }

    public final double[] get_monounsaturated_fat_coefficients() {
        return monounsaturated_fat;
    }

    public final double[] get_polyunsaturated_fat_coefficients() {
        return polyunsaturated_fat;
    }

    public final double[] get_saturated_fat_coefficients() {
        return saturated_fat;
    }

    public final double[] get_complete_protein_coefficients() {
        return complete_protein;
    }

    public final double[] get_calcium_coefficients() {
        return calcium;
    }

    public final double[] get_copper_coefficients() {
        return copper;
    }

    public final double[] get_fluoride_coefficients() {
        return fluoride;
    }

    public final double[] get_iron_coefficients() {
        return iron;
    }

    public final double[] get_magnesium_coefficients() {
        return magnesium;
    }

    public final double[] get_manganese_coefficients() {
        return manganese;
    }

    public final double[] get_phosphorus_coefficients() {
        return phosphorus;
    }

    public final double[] get_potassium_coefficients() {
        return potassium;
    }

    public final double[] get_selenium_coefficients() {
        return selenium;
    }

    public final double[] get_sodium_coefficients() {
        return sodium;
    }

    public final double[] get_zinc_coefficients() {
        return zinc;
    }

    public final double[] get_folate_coefficients() {
        return folate;
    }

    public final double[] get_niacin_coefficients() {
        return niacin;
    }

    public final double[] get_pantothenic_acid_coefficients() {
        return pantothenic_acid;
    }

    public final double[] get_riboflavin_coefficients() {
        return riboflavin;
    }

    public final double[] get_thiamin_coefficients() {
        return thiamin;
    }

    public final double[] get_vitamin_a_coefficients() {
        return vitamin_a;
    }

    public final double[] get_vitamin_b12_coefficients() {
        return vitamin_b12;
    }

    public final double[] get_vitamin_b6_coefficients() {
        return vitamin_b6;
    }

    public final double[] get_vitamin_c_coefficients() {
        return vitamin_c;
    }

    public final double[] get_vitamin_d_coefficients() {
        return vitamin_d;
    }

    public final double[] get_vitamin_e_coefficients() {
        return vitamin_e;
    }

    public final double[] get_vitamin_k_coefficients() {
        return vitamin_k;
    }

    public final double[] get_choline_coefficients() {
        return choline;
    }

    public final double[] get_glycemic_load_coefficients() {
        return glycemic_load;
    }

    public final double[] get_alphalinolenic_acid_coefficients() {
        return alpha_linolenic_acid;
    }

    public final double[] get_linoleic_acid_coefficients() {
        return linoleic_acid;
    }

    public final double[] get_dha_coefficients() {
        return dha;
    }

    public final double[] get_epa_coefficients() {
        return epa;
    }

    public final double[] get_water_coefficients() {
        return water;
    }

    public final double[] get_cost_coefficients() {
        return cost;
    }

    public final double[] get_energy_alcohol_coefficients() {
        return energy_alcohol;
    }

    public final double[] get_energy_digestible_carbohydrate_coefficients() {
        return energy_digestible_carbohydrate;
    }

    public final double[] get_energy_digestible_coefficients() {
        return energy_digestible;
    }

    public final double[] get_energy_fat_coefficients() {
        return energy_fat;
    }

    public final double[] get_energy_protein_coefficients() {
        return energy_protein;
    }

    private void populate_coefficient_arrays() {
        for (int i = 0; i < size; i++) {
            Interface_food food = list.get(i);
            alcohol[i] = food.get_alcohol_coefficient();
            alpha_linolenic_acid[i] = food.get_alpha_linolenic_acid_coefficient();
            calcium[i] = food.get_calcium_coefficient();
            carbohydrate_by_difference[i] = food.get_carbohydrate_by_difference_coefficient();
            cholesterol[i] = food.get_cholesterol_coefficient();
            choline[i] = food.get_choline_coefficient();
            complete_protein[i] = food.get_complete_protein_coefficient();
            copper[i] = food.get_copper_coefficient();
            cost[i] = food.get_cost_coefficient();
            dha[i] = food.get_dha_coefficient();
            digestible_carbohydrate[i] = food.get_digestible_carbohydrate_coefficient();
            energy_alcohol[i] = food.get_alcohol_coefficient();
            energy_digestible_carbohydrate[i] = food.get_energy_digestible_carbohydrate_coefficient();
            energy_digestible[i] = food.get_energy_digestible_coefficient();
            energy_fat[i] = food.get_energy_fat_coefficient();
            energy_protein[i] = food.get_energy_protein_coefficient();
            epa[i] = food.get_epa_coefficient();
            fat[i] = food.get_fat_coefficient();
            fiber[i] = food.get_fiber_coefficient();
            fluoride[i] = food.get_fluoride_coefficient();
            folate[i] = food.get_folate_coefficient();
            glycemic_load[i] = food.get_glycemic_load_coefficient();
            gross_energy[i] = food.get_energy_gross_coefficient();
            iron[i] = food.get_iron_coefficient();
            linoleic_acid[i] = food.get_linoleic_acid_coefficient();
            magnesium[i] = food.get_magnesium_coefficient();
            manganese[i] = food.get_manganese_coefficient();
            monounsaturated_fat[i] = food.get_monounsaturated_fat_coefficient();
            niacin[i] = food.get_niacin_coefficient();
            pantothenic_acid[i] = food.get_pantothenic_acid_coefficient();
            phosphorus[i] = food.get_phosphorus_coefficient();
            polyunsaturated_fat[i] = food.get_polyunsaturated_fat_coefficient();
            potassium[i] = food.get_potassium_coefficient();
            protein[i] = food.get_protein_coefficient();
            riboflavin[i] = food.get_riboflavin_coefficient();
            saturated_fat[i] = food.get_saturated_fat_coefficient();
            selenium[i] = food.get_selenium_coefficient();
            sodium[i] = food.get_sodium_coefficient();
            thiamin[i] = food.get_thiamin_coefficient();
            vitamin_a[i] = food.get_vitamin_a_coefficient();
            vitamin_b12[i] = food.get_vitamin_b12_coefficient();
            vitamin_b6[i] = food.get_vitamin_b6_coefficient();
            vitamin_c[i] = food.get_vitamin_c_coefficient();
            vitamin_d[i] = food.get_vitamin_d_coefficient();
            vitamin_e[i] = food.get_vitamin_e_coefficient();
            vitamin_k[i] = food.get_vitamin_k_coefficient();
            water[i] = food.get_water_coefficient();
            weight[i] = 1;
            zinc[i] = food.get_zinc_coefficient();
        }
    }

    private String print_food_names() {
        StringBuilder sb = new StringBuilder();
        sb.append("Foods:");
        sb.append("[");
        for (int i = 0; i < size; i++) {
            Interface_food food = list.get(i);
            sb.append(food.get_food_name());
            sb.append("|");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    private String print_coefficients(String id, double[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(":");
        sb.append(print_array(arr));
        return sb.toString();
    }

    private String print_array(double[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(print_food_names());
        sb.append("\n");
        sb.append(print_coefficients("Alcohol", get_alcohol_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Alphalinolenic_acid", get_alphalinolenic_acid_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Calcium", get_calcium_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Carbohydrate_by_difference", get_carbohydrate_by_difference_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Cholesterol", get_cholesterol_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Choline", get_choline_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Complete_protein", get_complete_protein_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Copper", get_copper_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Cost", get_cost_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Dha", get_dha_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Digestible_carbohydrate", get_digestible_carbohydrate_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Energy_alcohol", get_energy_alcohol_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Energy_digestible_carbohydrate", get_energy_digestible_carbohydrate_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Energy_digestible", get_energy_digestible_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Energy_fat", get_energy_fat_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Energy_protein", get_energy_protein_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Epa", get_epa_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Fat", get_fat_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Fiber", get_fiber_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Fluoride", get_fluoride_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Folate", get_folate_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Glycemic_load", get_glycemic_load_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Gross_energy", get_energy_gross_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Iron", get_iron_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Linoleic_acid", get_linoleic_acid_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Magnesium", get_magnesium_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Manganese", get_manganese_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Monounsaturated_fat", get_monounsaturated_fat_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Niacin", get_niacin_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Pantothenic_acid", get_pantothenic_acid_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Phosphorus", get_phosphorus_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Polyunsaturated_fat", get_polyunsaturated_fat_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Potassium", get_potassium_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Protein", get_protein_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Riboflavin", get_riboflavin_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Saturated_fat", get_saturated_fat_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Selenium", get_selenium_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Sodium", get_sodium_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Thiamin", get_thiamin_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Vitamin_a", get_vitamin_a_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Vitamin_b12", get_vitamin_b12_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Vitamin_b6", get_vitamin_b6_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Vitamin_c", get_vitamin_c_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Vitamin_d", get_vitamin_d_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Vitamin_e", get_vitamin_e_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Vitamin_k", get_vitamin_k_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Water", get_water_coefficients()));
        sb.append("\n");
        sb.append(print_coefficients("Zinc", get_zinc_coefficients()));
        return sb.toString();
    }

    @Override
    public final int hashCode() {
        return toString().hashCode();
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
        final Coefficient_nutrient other = (Coefficient_nutrient) obj;
        return Objects.equals(this.toString(), other.toString());
    }

}
