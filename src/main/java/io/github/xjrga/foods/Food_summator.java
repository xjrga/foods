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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summator implements Food {

    private final ArrayList<Food> list;
    private final String name;
    private final Food meal;

    public Food_summator(ArrayList<Food> food_list, String name) {
        this.list = food_list;
        this.name = name;
        meal = get_total();
    }

    @Override
    public String get_food_name() {
        return meal.get_food_name();
    }

    @Override
    public String get_food_label() {
        return meal.get_food_label();
    }

    @Override
    public Double get_weight() {
        return meal.get_weight();
    }

    @Override
    public Double get_energy_gross() {
        return meal.get_energy_gross();
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return meal.get_energy_gross_coefficient();
    }

    @Override
    public Double get_protein() {
        return meal.get_protein();
    }

    @Override
    public Double get_protein_coefficient() {
        return meal.get_protein_coefficient();
    }

    @Override
    public Double get_protein_atwater_factor() {
        return meal.get_protein_atwater_factor();
    }

    @Override
    public Double get_carbohydrate_by_difference() {
        return meal.get_carbohydrate_by_difference();
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return meal.get_carbohydrate_by_difference_coefficient();
    }

    @Override
    public Double get_carbohydrate_by_difference_atwater_factor() {
        return meal.get_carbohydrate_by_difference_atwater_factor();
    }

    @Override
    public Double get_fiber() {
        return meal.get_fiber();
    }

    @Override
    public Double get_fiber_coefficient() {
        return meal.get_fiber_coefficient();
    }

    @Override
    public Double get_fat() {
        return meal.get_fat();
    }

    @Override
    public Double get_fat_coefficient() {
        return meal.get_fat_coefficient();
    }

    @Override
    public Double get_fat_atwater_factor() {
        return meal.get_fat_atwater_factor();
    }

    @Override
    public Double get_alcohol() {
        return meal.get_alcohol();
    }

    @Override
    public Double get_alcohol_coefficient() {
        return meal.get_alcohol_coefficient();
    }

    @Override
    public Double get_alcohol_atwater_factor() {
        return meal.get_alcohol_atwater_factor();
    }

    @Override
    public Double get_digestible_carbohydrate() {
        return meal.get_digestible_carbohydrate();
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return meal.get_digestible_carbohydrate_coefficient();
    }

    @Override
    public Double get_cholesterol() {
        return meal.get_cholesterol();
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return meal.get_cholesterol_coefficient();
    }

    @Override
    public Double get_monounsaturated_fat() {
        return meal.get_monounsaturated_fat();
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return meal.get_monounsaturated_fat_coefficient();
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return meal.get_polyunsaturated_fat();
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return meal.get_polyunsaturated_fat_coefficient();
    }

    @Override
    public Double get_saturated_fat() {
        return meal.get_saturated_fat();
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return meal.get_saturated_fat_coefficient();
    }

    @Override
    public Double get_complete_protein() {
        return meal.get_complete_protein();
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return meal.get_complete_protein_coefficient();
    }

    @Override
    public Double get_calcium() {
        return meal.get_calcium();
    }

    @Override
    public Double get_calcium_coefficient() {
        return meal.get_calcium_coefficient();
    }

    @Override
    public Double get_copper() {
        return meal.get_copper();
    }

    @Override
    public Double get_copper_coefficient() {
        return meal.get_copper_coefficient();
    }

    @Override
    public Double get_fluoride() {
        return meal.get_fluoride();
    }

    @Override
    public Double get_fluoride_coefficient() {
        return meal.get_fluoride_coefficient();
    }

    @Override
    public Double get_iron() {
        return meal.get_iron();
    }

    @Override
    public Double get_iron_coefficient() {
        return meal.get_iron_coefficient();
    }

    @Override
    public Double get_magnesium() {
        return meal.get_magnesium();
    }

    @Override
    public Double get_magnesium_coefficient() {
        return meal.get_magnesium_coefficient();
    }

    @Override
    public Double get_manganese() {
        return meal.get_manganese();
    }

    @Override
    public Double get_manganese_coefficient() {
        return meal.get_manganese_coefficient();
    }

    @Override
    public Double get_phosphorus() {
        return meal.get_phosphorus();
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return meal.get_phosphorus_coefficient();
    }

    @Override
    public Double get_potassium() {
        return meal.get_potassium();
    }

    @Override
    public Double get_potassium_coefficient() {
        return meal.get_potassium_coefficient();
    }

    @Override
    public Double get_selenium() {
        return meal.get_selenium();
    }

    @Override
    public Double get_selenium_coefficient() {
        return meal.get_selenium_coefficient();
    }

    @Override
    public Double get_sodium() {
        return meal.get_sodium();
    }

    @Override
    public Double get_sodium_coefficient() {
        return meal.get_sodium_coefficient();
    }

    @Override
    public Double get_zinc() {
        return meal.get_zinc();
    }

    @Override
    public Double get_zinc_coefficient() {
        return meal.get_zinc_coefficient();
    }

    @Override
    public Double get_folate() {
        return meal.get_folate();
    }

    @Override
    public Double get_folate_coefficient() {
        return meal.get_folate_coefficient();
    }

    @Override
    public Double get_niacin() {
        return meal.get_niacin();
    }

    @Override
    public Double get_niacin_coefficient() {
        return meal.get_niacin_coefficient();
    }

    @Override
    public Double get_pantothenic_acid() {
        return meal.get_pantothenic_acid();
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return meal.get_pantothenic_acid_coefficient();
    }

    @Override
    public Double get_riboflavin() {
        return meal.get_riboflavin();
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return meal.get_riboflavin_coefficient();
    }

    @Override
    public Double get_thiamin() {
        return meal.get_thiamin();
    }

    @Override
    public Double get_thiamin_coefficient() {
        return meal.get_thiamin_coefficient();
    }

    @Override
    public Double get_vitamin_a() {
        return meal.get_vitamin_a();
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return meal.get_vitamin_a_coefficient();
    }

    @Override
    public Double get_vitamin_b12() {
        return meal.get_vitamin_b12();
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return meal.get_vitamin_b12_coefficient();
    }

    @Override
    public Double get_vitamin_b6() {
        return meal.get_vitamin_b6();
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return meal.get_vitamin_b6_coefficient();
    }

    @Override
    public Double get_vitamin_c() {
        return meal.get_vitamin_c();
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return meal.get_vitamin_c_coefficient();
    }

    @Override
    public Double get_vitamin_d() {
        return meal.get_vitamin_d();
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return meal.get_vitamin_d_coefficient();
    }

    @Override
    public Double get_vitamin_e() {
        return meal.get_vitamin_e();
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return meal.get_vitamin_e_coefficient();
    }

    @Override
    public Double get_vitamin_k() {
        return meal.get_vitamin_k();
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return meal.get_vitamin_k_coefficient();
    }

    @Override
    public Double get_choline() {
        return meal.get_choline();
    }

    @Override
    public Double get_choline_coefficient() {
        return meal.get_choline_coefficient();
    }

    @Override
    public Double get_glycemic_index() {
        return meal.get_glycemic_index();
    }

    @Override
    public Double get_glycemic_load() {
        return meal.get_glycemic_load();
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return meal.get_glycemic_load_coefficient();
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return meal.get_alpha_linolenic_acid();
    }

    @Override
    public Double get_alphalinolenic_acid_coefficient() {
        return meal.get_alphalinolenic_acid_coefficient();
    }

    @Override
    public Double get_linoleic_acid() {
        return meal.get_linoleic_acid();
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return meal.get_linoleic_acid_coefficient();
    }

    @Override
    public Double get_dha() {
        return meal.get_dha();
    }

    @Override
    public Double get_dha_coefficient() {
        return meal.get_dha_coefficient();
    }

    @Override
    public Double get_epa() {
        return meal.get_epa();
    }

    @Override
    public Double get_epa_coefficient() {
        return meal.get_epa_coefficient();
    }

    @Override
    public Double get_water() {
        return meal.get_water();
    }

    @Override
    public Double get_water_coefficient() {
        return meal.get_water_coefficient();
    }

    @Override
    public Double get_cost() {
        return meal.get_cost();
    }

    @Override
    public Double get_cost_coefficient() {
        return meal.get_cost_coefficient();
    }

    @Override
    public Double get_energy_alcohol() {
        return meal.get_energy_alcohol();
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return meal.get_energy_alcohol_coefficient();
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return meal.get_energy_digestible_carbohydrate();
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return meal.get_energy_digestible_carbohydrate_coefficient();
    }

    @Override
    public Double get_energy_digestible() {
        return meal.get_energy_digestible();
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return meal.get_energy_digestible_coefficient();
    }

    @Override
    public Double get_energy_fat() {
        return meal.get_energy_fat();
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return meal.get_energy_fat_coefficient();
    }

    @Override
    public Double get_energy_no_protein() {
        return meal.get_energy_no_protein();
    }

    @Override
    public Double get_energy_no_protein_coefficient() {
        return meal.get_energy_no_protein_coefficient();
    }

    @Override
    public Double get_energy_protein() {
        return meal.get_energy_protein();
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return meal.get_energy_protein_coefficient();
    }

    private Food get_total() {
        Iterator it = list.iterator();
        Food_abstract happy_meal = new Food_mutable_impl();
        Double weight = 0.0;
        Double gross_energy = 0.0;
        Double protein = 0.0;
        Double carbohydrate_by_difference = 0.0;
        Double fiber = 0.0;
        Double fat = 0.0;
        Double alcohol = 0.0;
        Double cholesterol = 0.0;
        Double monounsaturated_fat = 0.0;
        Double polyunsaturated_fat = 0.0;
        Double saturated_fat = 0.0;
        Double complete_protein = 0.0;
        Double calcium = 0.0;
        Double copper = 0.0;
        Double fluoride = 0.0;
        Double iron = 0.0;
        Double magnesium = 0.0;
        Double manganese = 0.0;
        Double phosphorus = 0.0;
        Double potassium = 0.0;
        Double selenium = 0.0;
        Double sodium = 0.0;
        Double zinc = 0.0;
        Double folate = 0.0;
        Double niacin = 0.0;
        Double pantothenic_acid = 0.0;
        Double riboflavin = 0.0;
        Double thiamin = 0.0;
        Double vitamin_a = 0.0;
        Double vitamin_b12 = 0.0;
        Double vitamin_b6 = 0.0;
        Double vitamin_c = 0.0;
        Double vitamin_d = 0.0;
        Double vitamin_e = 0.0;
        Double vitamin_k = 0.0;
        Double choline = 0.0;
        Double alphalinolenic_acid = 0.0;
        Double linoleic_acid = 0.0;
        Double dha = 0.0;
        Double epa = 0.0;
        Double water = 0.0;
        Double cost = 0.0;
        while (it.hasNext()) {
            Food food = (Food) it.next();
            weight += food.get_weight();
            gross_energy += food.get_energy_gross();
            protein += food.get_protein();
            carbohydrate_by_difference += food.get_carbohydrate_by_difference();
            fiber += food.get_fiber();
            fat += food.get_fat();
            alcohol += food.get_alcohol();
            cholesterol += food.get_cholesterol();
            monounsaturated_fat += food.get_monounsaturated_fat();
            polyunsaturated_fat += food.get_polyunsaturated_fat();
            saturated_fat += food.get_saturated_fat();
            complete_protein += food.get_complete_protein();
            calcium += food.get_calcium();
            copper += food.get_copper();
            fluoride += food.get_fluoride();
            iron += food.get_iron();
            magnesium += food.get_magnesium();
            manganese += food.get_manganese();
            phosphorus += food.get_phosphorus();
            potassium += food.get_potassium();
            selenium += food.get_selenium();
            sodium += food.get_sodium();
            zinc += food.get_zinc();
            folate += food.get_folate();
            niacin += food.get_niacin();
            pantothenic_acid += food.get_pantothenic_acid();
            riboflavin += food.get_riboflavin();
            thiamin += food.get_thiamin();
            vitamin_a += food.get_vitamin_a();
            vitamin_b12 += food.get_vitamin_b12();
            vitamin_b6 += food.get_vitamin_b6();
            vitamin_c += food.get_vitamin_c();
            vitamin_d += food.get_vitamin_d();
            vitamin_e += food.get_vitamin_e();
            vitamin_k += food.get_vitamin_k();
            choline += food.get_choline();
            alphalinolenic_acid += food.get_alpha_linolenic_acid();
            linoleic_acid += food.get_linoleic_acid();
            dha += food.get_dha();
            epa += food.get_epa();
            water += food.get_water();
            cost += food.get_cost();
        }
        happy_meal.set_food_name(name);
        happy_meal.set_food_label(name);
        happy_meal.set_weight(weight);
        happy_meal.set_gross_energy(gross_energy);
        happy_meal.set_protein(protein);
        happy_meal.set_carbohydrate_by_difference(carbohydrate_by_difference);
        happy_meal.set_fiber(fiber);
        happy_meal.set_fat(fat);
        happy_meal.set_alcohol(alcohol);
        happy_meal.set_cholesterol(cholesterol);
        happy_meal.set_monounsaturated_fat(monounsaturated_fat);
        happy_meal.set_polyunsaturated_fat(polyunsaturated_fat);
        happy_meal.set_saturated_fat(saturated_fat);
        happy_meal.set_complete_protein(complete_protein);
        happy_meal.set_calcium(calcium);
        happy_meal.set_copper(copper);
        happy_meal.set_fluoride(fluoride);
        happy_meal.set_iron(iron);
        happy_meal.set_magnesium(magnesium);
        happy_meal.set_manganese(manganese);
        happy_meal.set_phosphorus(phosphorus);
        happy_meal.set_potassium(potassium);
        happy_meal.set_selenium(selenium);
        happy_meal.set_sodium(sodium);
        happy_meal.set_zinc(zinc);
        happy_meal.set_folate(folate);
        happy_meal.set_niacin(niacin);
        happy_meal.set_pantothenic_acid(pantothenic_acid);
        happy_meal.set_riboflavin(riboflavin);
        happy_meal.set_thiamin(thiamin);
        happy_meal.set_vitamin_a(vitamin_a);
        happy_meal.set_vitamin_b12(vitamin_b12);
        happy_meal.set_vitamin_b6(vitamin_b6);
        happy_meal.set_vitamin_c(vitamin_c);
        happy_meal.set_vitamin_d(vitamin_d);
        happy_meal.set_vitamin_e(vitamin_e);
        happy_meal.set_vitamin_k(vitamin_k);
        happy_meal.set_choline(choline);
        happy_meal.set_glycemic_index(get_meal_glycemic_index());
        happy_meal.set_alpha_linolenic_acid(alphalinolenic_acid);
        happy_meal.set_linoleic_acid(linoleic_acid);
        happy_meal.set_dha(dha);
        happy_meal.set_epa(epa);
        happy_meal.set_water(water);
        happy_meal.set_cost(cost);
        return happy_meal;
    }

    private Double get_meal_glycemic_index() {
        Double total_digestible_carbohydrate = 0.0;
        Double meal_gi = 0.0;
        for (Food food : list) {
            total_digestible_carbohydrate += food.get_digestible_carbohydrate();
        }
        for (Food food : list) {
            meal_gi += (food.get_digestible_carbohydrate() / total_digestible_carbohydrate) * food.get_glycemic_index();
        }
        return meal_gi;
    }

    @Override
    public final String toString() {
        return name;
    }

    @Override
    public final int hashCode() {
        return name.hashCode();
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Category_abstract other = (Category_abstract) obj;
        return Objects.equals(this.name, other.get_name());
    }

}
