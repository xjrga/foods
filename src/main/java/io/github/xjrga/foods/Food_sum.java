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
package io.github.xjrga.foods;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_sum extends Abstract_food {

    private final ArrayList<Abstract_food> list;

    public Food_sum(ArrayList<Abstract_food> food_list, String name) {
        list = food_list;
        Iterator it = list.iterator();
        Double weight = 0.0;
        Double energy_gross = 0.0;
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
            Abstract_food local_food = (Abstract_food) it.next();
            weight += local_food.get_weight_in_grams();
            energy_gross += local_food.get_energy_gross_in_kilocalories();
            protein += local_food.get_protein_in_grams();
            carbohydrate_by_difference += local_food.get_carbohydrate_by_difference_in_grams();
            fiber += local_food.get_fiber_in_grams();
            fat += local_food.get_fat_in_grams();
            alcohol += local_food.get_alcohol_in_grams();
            cholesterol += local_food.get_cholesterol_in_milligrams();
            monounsaturated_fat += local_food.get_monounsaturated_fat_in_grams();
            polyunsaturated_fat += local_food.get_polyunsaturated_fat_in_grams();
            saturated_fat += local_food.get_saturated_fat_in_grams();
            complete_protein += local_food.get_complete_protein_in_grams();
            calcium += local_food.get_calcium_in_milligrams();
            copper += local_food.get_copper_in_milligrams();
            fluoride += local_food.get_fluoride_in_micrograms();
            iron += local_food.get_iron_in_milligrams();
            magnesium += local_food.get_magnesium_in_milligrams();
            manganese += local_food.get_manganese_in_milligrams();
            phosphorus += local_food.get_phosphorus_in_milligrams();
            potassium += local_food.get_potassium_in_milligrams();
            selenium += local_food.get_selenium_in_micrograms();
            sodium += local_food.get_sodium_in_milligrams();
            zinc += local_food.get_zinc_in_milligrams();
            folate += local_food.get_folate_in_micrograms();
            niacin += local_food.get_niacin_in_milligrams();
            pantothenic_acid += local_food.get_pantothenic_acid_in_milligrams();
            riboflavin += local_food.get_riboflavin_in_milligrams();
            thiamin += local_food.get_thiamin_in_milligrams();
            vitamin_a += local_food.get_vitamin_a_in_micrograms();
            vitamin_b12 += local_food.get_vitamin_b12_in_micrograms();
            vitamin_b6 += local_food.get_vitamin_b6_in_milligrams();
            vitamin_c += local_food.get_vitamin_c_in_milligrams();
            vitamin_d += local_food.get_vitamin_d_in_micrograms();
            vitamin_e += local_food.get_vitamin_e_in_milligrams();
            vitamin_k += local_food.get_vitamin_k_in_micrograms();
            choline += local_food.get_choline_in_milligrams();
            alphalinolenic_acid += local_food.get_alpha_linolenic_acid_in_grams();
            linoleic_acid += local_food.get_linoleic_acid_in_grams();
            dha += local_food.get_dha_in_grams();
            epa += local_food.get_epa_in_grams();
            water += local_food.get_water_in_grams();
            cost += local_food.get_cost_in_dollars();
        }
        set_food_name(name);
        set_food_label(name);
        set_weight_in_grams(weight);
        set_energy_gross_in_kilocalories(energy_gross);
        set_protein_in_grams(protein);
        set_carbohydrate_by_difference_in_grams(carbohydrate_by_difference);
        set_fiber_in_grams(fiber);
        set_fat_in_grams(fat);
        set_alcohol_in_grams(alcohol);
        set_cholesterol_in_milligrams(cholesterol);
        set_monounsaturated_fat_in_grams(monounsaturated_fat);
        set_polyunsaturated_fat_in_grams(polyunsaturated_fat);
        set_saturated_fat_in_grams(saturated_fat);
        set_complete_protein_in_grams(complete_protein);
        set_calcium_in_milligrams(calcium);
        set_copper_in_milligrams(copper);
        set_fluoride_in_micrograms(fluoride);
        set_iron_in_milligrams(iron);
        set_magnesium_in_milligrams(magnesium);
        set_manganese_in_milligrams(manganese);
        set_phosphorus_in_milligrams(phosphorus);
        set_potassium_in_milligrams(potassium);
        set_selenium_in_micrograms(selenium);
        set_sodium_in_milligrams(sodium);
        set_zinc_in_milligrams(zinc);
        set_folate_in_micrograms(folate);
        set_niacin_in_milligrams(niacin);
        set_pantothenic_acid_in_milligrams(pantothenic_acid);
        set_riboflavin_in_milligrams(riboflavin);
        set_thiamin_in_milligrams(thiamin);
        set_vitamin_a_in_micrograms(vitamin_a);
        set_vitamin_b12_in_micrograms(vitamin_b12);
        set_vitamin_b6_in_milligrams(vitamin_b6);
        set_vitamin_c_in_milligrams(vitamin_c);
        set_vitamin_d_in_micrograms(vitamin_d);
        set_vitamin_e_in_milligrams(vitamin_e);
        set_vitamin_k_in_micrograms(vitamin_k);
        set_choline_in_milligrams(choline);
        set_glycemic_index(get_meal_glycemic_index());
        set_alpha_linolenic_acid_in_grams(alphalinolenic_acid);
        set_linoleic_acid_in_grams(linoleic_acid);
        set_dha_in_grams(dha);
        set_epa_in_grams(epa);
        set_water_in_grams(water);
        set_cost_in_dollars(cost);
    }

    private Double get_meal_glycemic_index() {
        Double total_digestible_carbohydrate = 0.0;
        Double meal_gi = 0.0;
        for (Interface_food_get food : list) {
            total_digestible_carbohydrate += food.get_digestible_carbohydrate_in_grams();
        }
        for (Interface_food_get food : list) {
            meal_gi += (food.get_digestible_carbohydrate_in_grams() / total_digestible_carbohydrate) * food.get_glycemic_index();
        }
        return meal_gi;
    }
}
