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
 * This is a read only food object
 */
public class Food implements Interface_food {

    private final Double alcohol;
    private final Double alcohol_atwater_factor;
    private final Double alcohol_coefficient;
    private final Double alpha_linolenic_acid;
    private final Double alpha_linolenic_acid_coefficient;
    private final Double calcium;
    private final Double calcium_coefficient;
    private final Double carbohydrate_by_difference;
    private final Double carbohydrate_by_difference_atwater_factor;
    private final Double carbohydrate_by_difference_coefficient;
    private final Double cholesterol;
    private final Double cholesterol_coefficient;
    private final Double choline;
    private final Double choline_coefficient;
    private final Double complete_protein;
    private final Double complete_protein_coefficient;
    private final Double copper;
    private final Double copper_coefficient;
    private final Double cost;
    private final Double cost_coefficient;
    private final Double dha;
    private final Double dha_coefficient;
    private final Double digestible_carbohydrate;
    private final Double digestible_carbohydrate_coefficient;
    private final Double energy_alcohol;
    private final Double energy_alcohol_coefficient;
    private final Double energy_digestible;
    private final Double energy_digestible_carbohydrate;
    private final Double energy_digestible_carbohydrate_coefficient;
    private final Double energy_digestible_coefficient;
    private final Double energy_fat;
    private final Double energy_fat_coefficient;
    private final Double energy_gross;
    private final Double energy_gross_coefficient;
    private final Double energy_protein;
    private final Double energy_protein_coefficient;
    private final Double epa;
    private final Double epa_coefficient;
    private final Double fat;
    private final Double fat_atwater_factor;
    private final Double fat_coefficient;
    private final Double fiber;
    private final Double fiber_coefficient;
    private final Double fluoride;
    private final Double fluoride_coefficient;
    private final Double folate;
    private final Double folate_coefficient;
    private final Double food_quotient;
    private final Double glycemic_index;
    private final Double glycemic_load;
    private final Double glycemic_load_coefficient;
    private final Double iron;
    private final Double iron_coefficient;
    private final Double linoleic_acid;
    private final Double linoleic_acid_coefficient;
    private final Double magnesium;
    private final Double magnesium_coefficient;
    private final Double manganese;
    private final Double manganese_coefficient;
    private final Double monounsaturated_fat;
    private final Double monounsaturated_fat_coefficient;
    private final Double niacin;
    private final Double niacin_coefficient;
    private final Double pantothenic_acid;
    private final Double pantothenic_acid_coefficient;
    private final Double phosphorus;
    private final Double phosphorus_coefficient;
    private final Double polyunsaturated_fat;
    private final Double polyunsaturated_fat_coefficient;
    private final Double potassium;
    private final Double potassium_coefficient;
    private final Double protein;
    private final Double protein_atwater_factor;
    private final Double protein_coefficient;
    private final Double riboflavin;
    private final Double riboflavin_coefficient;
    private final Double saturated_fat;
    private final Double saturated_fat_coefficient;
    private final Double selenium;
    private final Double selenium_coefficient;
    private final Double sodium;
    private final Double sodium_coefficient;
    private final Double thiamin;
    private final Double thiamin_coefficient;
    private final Double vitamin_a;
    private final Double vitamin_a_coefficient;
    private final Double vitamin_b6;
    private final Double vitamin_b6_coefficient;
    private final Double vitamin_b12;
    private final Double vitamin_b12_coefficient;
    private final Double vitamin_c;
    private final Double vitamin_c_coefficient;
    private final Double vitamin_d;
    private final Double vitamin_d_coefficient;
    private final Double vitamin_e;
    private final Double vitamin_e_coefficient;
    private final Double vitamin_k;
    private final Double vitamin_k_coefficient;
    private final Double water;
    private final Double water_coefficient;
    private final Double weight;
    private final Double zinc;
    private final Double zinc_coefficient;
    private final Food_mutable food;
    private final String label;
    private final String name;

    public Food(Food_mutable food) {
        this.food = food;
        alcohol = Double.valueOf(food.get_alcohol());
        alcohol_atwater_factor = Double.valueOf(food.get_alcohol_atwater_factor());
        alcohol_coefficient = Double.valueOf(food.get_alcohol_coefficient());
        alpha_linolenic_acid = Double.valueOf(food.get_alpha_linolenic_acid());
        alpha_linolenic_acid_coefficient = Double.valueOf(food.get_alpha_linolenic_acid_coefficient());
        calcium = Double.valueOf(food.get_calcium());
        calcium_coefficient = Double.valueOf(food.get_calcium_coefficient());
        carbohydrate_by_difference = Double.valueOf(food.get_carbohydrate_by_difference());
        carbohydrate_by_difference_atwater_factor = Double.valueOf(food.get_carbohydrate_by_difference_atwater_factor());
        carbohydrate_by_difference_coefficient = Double.valueOf(food.get_carbohydrate_by_difference_coefficient());
        cholesterol = Double.valueOf(food.get_cholesterol());
        cholesterol_coefficient = Double.valueOf(food.get_cholesterol_coefficient());
        choline = Double.valueOf(food.get_choline());
        choline_coefficient = Double.valueOf(food.get_choline_coefficient());
        complete_protein = Double.valueOf(food.get_complete_protein());
        complete_protein_coefficient = Double.valueOf(food.get_complete_protein_coefficient());
        copper = Double.valueOf(food.get_copper());
        copper_coefficient = Double.valueOf(food.get_copper_coefficient());
        cost = Double.valueOf(food.get_cost());
        cost_coefficient = Double.valueOf(food.get_cost_coefficient());
        dha = Double.valueOf(food.get_dha());
        dha_coefficient = Double.valueOf(food.get_dha_coefficient());
        digestible_carbohydrate = Double.valueOf(food.get_digestible_carbohydrate());
        digestible_carbohydrate_coefficient = Double.valueOf(food.get_digestible_carbohydrate_coefficient());
        energy_alcohol = Double.valueOf(food.get_energy_alcohol());
        energy_alcohol_coefficient = Double.valueOf(food.get_energy_alcohol_coefficient());
        energy_digestible = Double.valueOf(food.get_energy_digestible());
        energy_digestible_carbohydrate = Double.valueOf(food.get_energy_digestible_carbohydrate());
        energy_digestible_carbohydrate_coefficient = Double.valueOf(food.get_energy_digestible_carbohydrate_coefficient());
        energy_digestible_coefficient = Double.valueOf(food.get_energy_digestible_coefficient());
        energy_fat = Double.valueOf(food.get_energy_fat());
        energy_fat_coefficient = Double.valueOf(food.get_energy_fat_coefficient());
        energy_gross = Double.valueOf(food.get_energy_gross());
        energy_gross_coefficient = Double.valueOf(food.get_energy_gross_coefficient());
        energy_protein = Double.valueOf(food.get_energy_protein());
        energy_protein_coefficient = Double.valueOf(food.get_energy_protein_coefficient());
        epa = Double.valueOf(food.get_epa());
        epa_coefficient = Double.valueOf(food.get_epa_coefficient());
        fat = Double.valueOf(food.get_fat());
        fat_atwater_factor = Double.valueOf(food.get_fat_atwater_factor());
        fat_coefficient = Double.valueOf(food.get_fat_coefficient());
        fiber = Double.valueOf(food.get_fiber());
        fiber_coefficient = Double.valueOf(food.get_fiber_coefficient());
        fluoride = Double.valueOf(food.get_fluoride());
        fluoride_coefficient = Double.valueOf(food.get_fluoride_coefficient());
        folate = Double.valueOf(food.get_folate());
        folate_coefficient = Double.valueOf(food.get_folate_coefficient());
        food_quotient = Double.valueOf(food.get_food_quotient());
        glycemic_index = Double.valueOf(food.get_glycemic_index());
        glycemic_load = Double.valueOf(food.get_glycemic_load());
        glycemic_load_coefficient = Double.valueOf(food.get_glycemic_load_coefficient());
        iron = Double.valueOf(food.get_iron());
        iron_coefficient = Double.valueOf(food.get_iron_coefficient());
        label = new String(food.get_food_label());
        linoleic_acid = Double.valueOf(food.get_linoleic_acid());
        linoleic_acid_coefficient = Double.valueOf(food.get_linoleic_acid_coefficient());
        magnesium = Double.valueOf(food.get_magnesium());
        magnesium_coefficient = Double.valueOf(food.get_magnesium_coefficient());
        manganese = Double.valueOf(food.get_manganese());
        manganese_coefficient = Double.valueOf(food.get_manganese_coefficient());
        monounsaturated_fat = Double.valueOf(food.get_monounsaturated_fat());
        monounsaturated_fat_coefficient = Double.valueOf(food.get_monounsaturated_fat_coefficient());
        name = new String(food.get_food_name());
        niacin = Double.valueOf(food.get_niacin());
        niacin_coefficient = Double.valueOf(food.get_niacin_coefficient());
        pantothenic_acid = Double.valueOf(food.get_pantothenic_acid());
        pantothenic_acid_coefficient = Double.valueOf(food.get_pantothenic_acid_coefficient());
        phosphorus = Double.valueOf(food.get_phosphorus());
        phosphorus_coefficient = Double.valueOf(food.get_phosphorus_coefficient());
        polyunsaturated_fat = Double.valueOf(food.get_polyunsaturated_fat());
        polyunsaturated_fat_coefficient = Double.valueOf(food.get_polyunsaturated_fat_coefficient());
        potassium = Double.valueOf(food.get_potassium());
        potassium_coefficient = Double.valueOf(food.get_potassium_coefficient());
        protein = Double.valueOf(food.get_protein());
        protein_atwater_factor = Double.valueOf(food.get_protein_atwater_factor());
        protein_coefficient = Double.valueOf(food.get_protein_coefficient());
        riboflavin = Double.valueOf(food.get_riboflavin());
        riboflavin_coefficient = Double.valueOf(food.get_riboflavin_coefficient());
        saturated_fat = Double.valueOf(food.get_saturated_fat());
        saturated_fat_coefficient = Double.valueOf(food.get_saturated_fat_coefficient());
        selenium = Double.valueOf(food.get_selenium());
        selenium_coefficient = Double.valueOf(food.get_selenium_coefficient());
        sodium = Double.valueOf(food.get_sodium());
        sodium_coefficient = Double.valueOf(food.get_sodium_coefficient());
        thiamin = Double.valueOf(food.get_thiamin());
        thiamin_coefficient = Double.valueOf(food.get_thiamin_coefficient());
        vitamin_a = Double.valueOf(food.get_vitamin_a());
        vitamin_a_coefficient = Double.valueOf(food.get_vitamin_a_coefficient());
        vitamin_b6 = Double.valueOf(food.get_vitamin_b6());
        vitamin_b6_coefficient = Double.valueOf(food.get_vitamin_b6_coefficient());
        vitamin_b12 = Double.valueOf(food.get_vitamin_b12());
        vitamin_b12_coefficient = Double.valueOf(food.get_vitamin_b12_coefficient());
        vitamin_c = Double.valueOf(food.get_vitamin_c());
        vitamin_c_coefficient = Double.valueOf(food.get_vitamin_c_coefficient());
        vitamin_d = Double.valueOf(food.get_vitamin_d());
        vitamin_d_coefficient = Double.valueOf(food.get_vitamin_d_coefficient());
        vitamin_e = Double.valueOf(food.get_vitamin_e());
        vitamin_e_coefficient = Double.valueOf(food.get_vitamin_e_coefficient());
        vitamin_k = Double.valueOf(food.get_vitamin_k());
        vitamin_k_coefficient = Double.valueOf(food.get_vitamin_k_coefficient());
        water = Double.valueOf(food.get_water());
        water_coefficient = Double.valueOf(food.get_water_coefficient());
        weight = Double.valueOf(food.get_weight());
        zinc = Double.valueOf(food.get_zinc());
        zinc_coefficient = Double.valueOf(food.get_zinc_coefficient());
    }

    @Override
    public String get_food_name() {
        return name;
    }

    @Override
    public String get_food_label() {
        return label;
    }

    @Override
    public Double get_weight() {
        return weight;
    }

    @Override
    public Double get_energy_gross() {
        return energy_gross;
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return energy_gross_coefficient;
    }

    @Override
    public Double get_protein() {
        return protein;
    }

    @Override
    public Double get_protein_coefficient() {
        return protein_coefficient;
    }

    @Override
    public Double get_protein_atwater_factor() {
        return protein_atwater_factor;
    }

    @Override
    public Double get_carbohydrate_by_difference() {
        return carbohydrate_by_difference;
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return carbohydrate_by_difference_coefficient;
    }

    @Override
    public Double get_carbohydrate_by_difference_atwater_factor() {
        return carbohydrate_by_difference_atwater_factor;
    }

    @Override
    public Double get_fiber() {
        return fiber;
    }

    @Override
    public Double get_fiber_coefficient() {
        return fiber_coefficient;
    }

    @Override
    public Double get_fat() {
        return fat;
    }

    @Override
    public Double get_fat_coefficient() {
        return fat_coefficient;
    }

    @Override
    public Double get_fat_atwater_factor() {
        return fat_atwater_factor;
    }

    @Override
    public Double get_alcohol() {
        return alcohol;
    }

    @Override
    public Double get_alcohol_coefficient() {
        return alcohol_coefficient;
    }

    @Override
    public Double get_alcohol_atwater_factor() {
        return alcohol_atwater_factor;
    }

    @Override
    public Double get_digestible_carbohydrate() {
        return digestible_carbohydrate;
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return digestible_carbohydrate_coefficient;
    }

    @Override
    public Double get_cholesterol() {
        return cholesterol;
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return cholesterol_coefficient;
    }

    @Override
    public Double get_monounsaturated_fat() {
        return monounsaturated_fat;
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return monounsaturated_fat_coefficient;
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return polyunsaturated_fat;
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return polyunsaturated_fat_coefficient;
    }

    @Override
    public Double get_saturated_fat() {
        return saturated_fat;
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return saturated_fat_coefficient;
    }

    @Override
    public Double get_complete_protein() {
        return complete_protein;
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return complete_protein_coefficient;
    }

    @Override
    public Double get_calcium() {
        return calcium;
    }

    @Override
    public Double get_calcium_coefficient() {
        return calcium_coefficient;
    }

    @Override
    public Double get_copper() {
        return copper;
    }

    @Override
    public Double get_copper_coefficient() {
        return copper_coefficient;
    }

    @Override
    public Double get_fluoride() {
        return fluoride;
    }

    @Override
    public Double get_fluoride_coefficient() {
        return fluoride_coefficient;
    }

    @Override
    public Double get_iron() {
        return iron;
    }

    @Override
    public Double get_iron_coefficient() {
        return iron_coefficient;
    }

    @Override
    public Double get_magnesium() {
        return magnesium;
    }

    @Override
    public Double get_magnesium_coefficient() {
        return magnesium_coefficient;
    }

    @Override
    public Double get_manganese() {
        return manganese;
    }

    @Override
    public Double get_manganese_coefficient() {
        return manganese_coefficient;
    }

    @Override
    public Double get_phosphorus() {
        return phosphorus;
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return phosphorus_coefficient;
    }

    @Override
    public Double get_potassium() {
        return potassium;
    }

    @Override
    public Double get_potassium_coefficient() {
        return potassium_coefficient;
    }

    @Override
    public Double get_selenium() {
        return selenium;
    }

    @Override
    public Double get_selenium_coefficient() {
        return selenium_coefficient;
    }

    @Override
    public Double get_sodium() {
        return sodium;
    }

    @Override
    public Double get_sodium_coefficient() {
        return sodium_coefficient;
    }

    @Override
    public Double get_zinc() {
        return zinc;
    }

    @Override
    public Double get_zinc_coefficient() {
        return zinc_coefficient;
    }

    @Override
    public Double get_folate() {
        return folate;
    }

    @Override
    public Double get_folate_coefficient() {
        return folate_coefficient;
    }

    @Override
    public Double get_niacin() {
        return niacin;
    }

    @Override
    public Double get_niacin_coefficient() {
        return niacin_coefficient;
    }

    @Override
    public Double get_pantothenic_acid() {
        return pantothenic_acid;
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return pantothenic_acid_coefficient;
    }

    @Override
    public Double get_riboflavin() {
        return riboflavin;
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return riboflavin_coefficient;
    }

    @Override
    public Double get_thiamin() {
        return thiamin;
    }

    @Override
    public Double get_thiamin_coefficient() {
        return thiamin_coefficient;
    }

    @Override
    public Double get_vitamin_a() {
        return vitamin_a;
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return vitamin_a_coefficient;
    }

    @Override
    public Double get_vitamin_b12() {
        return vitamin_b12;
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return vitamin_b12_coefficient;
    }

    @Override
    public Double get_vitamin_b6() {
        return vitamin_b6;
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return vitamin_b6_coefficient;
    }

    @Override
    public Double get_vitamin_c() {
        return vitamin_c;
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return vitamin_c_coefficient;
    }

    @Override
    public Double get_vitamin_d() {
        return vitamin_d;
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return vitamin_d_coefficient;
    }

    @Override
    public Double get_vitamin_e() {
        return vitamin_e;
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return vitamin_e_coefficient;
    }

    @Override
    public Double get_vitamin_k() {
        return vitamin_k;
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return vitamin_k_coefficient;
    }

    @Override
    public Double get_choline() {
        return choline;
    }

    @Override
    public Double get_choline_coefficient() {
        return choline_coefficient;
    }

    @Override
    public Double get_glycemic_index() {
        return glycemic_index;
    }

    @Override
    public Double get_glycemic_load() {
        return glycemic_load;
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return glycemic_load_coefficient;
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return alpha_linolenic_acid;
    }

    @Override
    public Double get_alpha_linolenic_acid_coefficient() {
        return alpha_linolenic_acid_coefficient;
    }

    @Override
    public Double get_linoleic_acid() {
        return linoleic_acid;
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return linoleic_acid_coefficient;
    }

    @Override
    public Double get_dha() {
        return dha;
    }

    @Override
    public Double get_dha_coefficient() {
        return dha_coefficient;
    }

    @Override
    public Double get_epa() {
        return epa;
    }

    @Override
    public Double get_epa_coefficient() {
        return epa_coefficient;
    }

    @Override
    public Double get_water() {
        return water;
    }

    @Override
    public Double get_water_coefficient() {
        return water_coefficient;
    }

    @Override
    public Double get_cost() {
        return cost;
    }

    @Override
    public Double get_cost_coefficient() {
        return cost_coefficient;
    }

    @Override
    public Double get_energy_alcohol() {
        return energy_alcohol;
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return energy_alcohol_coefficient;
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return energy_digestible_carbohydrate;
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return energy_digestible_carbohydrate_coefficient;
    }

    @Override
    public Double get_energy_digestible() {
        return energy_digestible;
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return energy_digestible_coefficient;
    }

    @Override
    public Double get_energy_fat() {
        return energy_fat;
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return energy_fat_coefficient;
    }

    @Override
    public Double get_energy_protein() {
        return energy_protein;
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return energy_protein_coefficient;
    }

    @Override
    public Double get_food_quotient() {
        return food_quotient;
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
        final Food other = (Food) obj;
        if (!Objects.equals(this.label, other.label)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.alcohol, other.alcohol)) {
            return false;
        }
        if (!Objects.equals(this.alpha_linolenic_acid, other.alpha_linolenic_acid)) {
            return false;
        }
        if (!Objects.equals(this.calcium, other.calcium)) {
            return false;
        }
        if (!Objects.equals(this.carbohydrate_by_difference, other.carbohydrate_by_difference)) {
            return false;
        }
        if (!Objects.equals(this.cholesterol, other.cholesterol)) {
            return false;
        }
        if (!Objects.equals(this.choline, other.choline)) {
            return false;
        }
        if (!Objects.equals(this.complete_protein, other.complete_protein)) {
            return false;
        }
        if (!Objects.equals(this.copper, other.copper)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        if (!Objects.equals(this.dha, other.dha)) {
            return false;
        }
        if (!Objects.equals(this.digestible_carbohydrate, other.digestible_carbohydrate)) {
            return false;
        }
        if (!Objects.equals(this.energy_alcohol, other.energy_alcohol)) {
            return false;
        }
        if (!Objects.equals(this.energy_digestible, other.energy_digestible)) {
            return false;
        }
        if (!Objects.equals(this.energy_digestible_carbohydrate, other.energy_digestible_carbohydrate)) {
            return false;
        }
        if (!Objects.equals(this.energy_fat, other.energy_fat)) {
            return false;
        }
        if (!Objects.equals(this.energy_gross, other.energy_gross)) {
            return false;
        }
        if (!Objects.equals(this.energy_protein, other.energy_protein)) {
            return false;
        }
        if (!Objects.equals(this.epa, other.epa)) {
            return false;
        }
        if (!Objects.equals(this.fat, other.fat)) {
            return false;
        }
        if (!Objects.equals(this.fiber, other.fiber)) {
            return false;
        }
        if (!Objects.equals(this.fluoride, other.fluoride)) {
            return false;
        }
        if (!Objects.equals(this.folate, other.folate)) {
            return false;
        }
        if (!Objects.equals(this.iron, other.iron)) {
            return false;
        }
        if (!Objects.equals(this.linoleic_acid, other.linoleic_acid)) {
            return false;
        }
        if (!Objects.equals(this.magnesium, other.magnesium)) {
            return false;
        }
        if (!Objects.equals(this.manganese, other.manganese)) {
            return false;
        }
        if (!Objects.equals(this.monounsaturated_fat, other.monounsaturated_fat)) {
            return false;
        }
        if (!Objects.equals(this.niacin, other.niacin)) {
            return false;
        }
        if (!Objects.equals(this.pantothenic_acid, other.pantothenic_acid)) {
            return false;
        }
        if (!Objects.equals(this.phosphorus, other.phosphorus)) {
            return false;
        }
        if (!Objects.equals(this.polyunsaturated_fat, other.polyunsaturated_fat)) {
            return false;
        }
        if (!Objects.equals(this.potassium, other.potassium)) {
            return false;
        }
        if (!Objects.equals(this.protein, other.protein)) {
            return false;
        }
        if (!Objects.equals(this.riboflavin, other.riboflavin)) {
            return false;
        }
        if (!Objects.equals(this.saturated_fat, other.saturated_fat)) {
            return false;
        }
        if (!Objects.equals(this.selenium, other.selenium)) {
            return false;
        }
        if (!Objects.equals(this.sodium, other.sodium)) {
            return false;
        }
        if (!Objects.equals(this.thiamin, other.thiamin)) {
            return false;
        }
        if (!Objects.equals(this.vitamin_a, other.vitamin_a)) {
            return false;
        }
        if (!Objects.equals(this.vitamin_b6, other.vitamin_b6)) {
            return false;
        }
        if (!Objects.equals(this.vitamin_b12, other.vitamin_b12)) {
            return false;
        }
        if (!Objects.equals(this.vitamin_c, other.vitamin_c)) {
            return false;
        }
        if (!Objects.equals(this.vitamin_d, other.vitamin_d)) {
            return false;
        }
        if (!Objects.equals(this.vitamin_e, other.vitamin_e)) {
            return false;
        }
        if (!Objects.equals(this.vitamin_k, other.vitamin_k)) {
            return false;
        }
        if (!Objects.equals(this.water, other.water)) {
            return false;
        }
        if (!Objects.equals(this.weight, other.weight)) {
            return false;
        }
        if (!Objects.equals(this.zinc, other.zinc)) {
            return false;
        }
        return true;
    }

}
