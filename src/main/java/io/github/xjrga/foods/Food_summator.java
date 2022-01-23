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
public class Food_summator implements Interface_food {

	private final ArrayList<Interface_food> list;
	private final String name;
	private final Interface_food meal;

	public Food_summator(ArrayList<Interface_food> food_list, String name) {
		this.list = food_list;
		this.name = name;
		meal = get_total();
	}

	@Override
	public String get_food_id() {
		// TODO Auto-generated method stub
		return meal.get_food_id();
	}

	@Override
	public final String get_food_name() {
		return meal.get_food_name();
	}

	@Override
	public final String get_food_label() {
		return meal.get_food_label();
	}

	@Override
	public final Double get_weight_in_grams() {
		return meal.get_weight_in_grams();
	}

	@Override
	public final Double get_energy_gross_in_kilocalories() {
		return meal.get_energy_gross_in_kilocalories();
	}

	@Override
	public final Double get_energy_gross_in_kilocalories_coefficient() {
		return meal.get_energy_gross_in_kilocalories_coefficient();
	}

	@Override
	public final Double get_protein_in_grams() {
		return meal.get_protein_in_grams();
	}

	@Override
	public final Double get_protein_coefficient() {
		return meal.get_protein_coefficient();
	}

	@Override
	public final Double get_protein_atwater_factor() {
		return meal.get_protein_atwater_factor();
	}

	@Override
	public final Double get_carbohydrate_by_difference_in_grams() {
		return meal.get_carbohydrate_by_difference_in_grams();
	}

	@Override
	public final Double get_carbohydrate_by_difference_coefficient() {
		return meal.get_carbohydrate_by_difference_coefficient();
	}

	@Override
	public final Double get_carbohydrate_by_difference_atwater_factor() {
		return meal.get_carbohydrate_by_difference_atwater_factor();
	}

	@Override
	public final Double get_fiber_in_grams() {
		return meal.get_fiber_in_grams();
	}

	@Override
	public final Double get_fiber_coefficient() {
		return meal.get_fiber_coefficient();
	}

	@Override
	public final Double get_fat_in_grams() {
		return meal.get_fat_in_grams();
	}

	@Override
	public final Double get_fat_coefficient() {
		return meal.get_fat_coefficient();
	}

	@Override
	public final Double get_fat_atwater_factor() {
		return meal.get_fat_atwater_factor();
	}

	@Override
	public final Double get_alcohol_in_grams() {
		return meal.get_alcohol_in_grams();
	}

	@Override
	public final Double get_alcohol_coefficient() {
		return meal.get_alcohol_coefficient();
	}

	@Override
	public final Double get_alcohol_atwater_factor() {
		return meal.get_alcohol_atwater_factor();
	}

	@Override
	public final Double get_digestible_carbohydrate_in_grams() {
		return meal.get_digestible_carbohydrate_in_grams();
	}

	@Override
	public final Double get_digestible_carbohydrate_coefficient() {
		return meal.get_digestible_carbohydrate_coefficient();
	}

	@Override
	public final Double get_cholesterol_in_milligrams() {
		return meal.get_cholesterol_in_milligrams();
	}

	@Override
	public final Double get_cholesterol_coefficient() {
		return meal.get_cholesterol_coefficient();
	}

	@Override
	public final Double get_monounsaturated_fat_in_grams() {
		return meal.get_monounsaturated_fat_in_grams();
	}

	@Override
	public final Double get_monounsaturated_fat_coefficient() {
		return meal.get_monounsaturated_fat_coefficient();
	}

	@Override
	public final Double get_polyunsaturated_fat_in_grams() {
		return meal.get_polyunsaturated_fat_in_grams();
	}

	@Override
	public final Double get_polyunsaturated_fat_coefficient() {
		return meal.get_polyunsaturated_fat_coefficient();
	}

	@Override
	public final Double get_saturated_fat_in_grams() {
		return meal.get_saturated_fat_in_grams();
	}

	@Override
	public final Double get_saturated_fat_coefficient() {
		return meal.get_saturated_fat_coefficient();
	}

	@Override
	public final Double get_complete_protein_in_grams() {
		return meal.get_complete_protein_in_grams();
	}

	@Override
	public final Double get_complete_protein_coefficient() {
		return meal.get_complete_protein_coefficient();
	}

	@Override
	public final Double get_calcium_in_milligrams() {
		return meal.get_calcium_in_milligrams();
	}

	@Override
	public final Double get_calcium_coefficient() {
		return meal.get_calcium_coefficient();
	}

	@Override
	public final Double get_copper_in_milligrams() {
		return meal.get_copper_in_milligrams();
	}

	@Override
	public final Double get_copper_coefficient() {
		return meal.get_copper_coefficient();
	}

	@Override
	public final Double get_fluoride_in_micrograms() {
		return meal.get_fluoride_in_micrograms();
	}

	@Override
	public final Double get_fluoride_coefficient() {
		return meal.get_fluoride_coefficient();
	}

	@Override
	public final Double get_iron_in_milligrams() {
		return meal.get_iron_in_milligrams();
	}

	@Override
	public final Double get_iron_coefficient() {
		return meal.get_iron_coefficient();
	}

	@Override
	public final Double get_magnesium_in_milligrams() {
		return meal.get_magnesium_in_milligrams();
	}

	@Override
	public final Double get_magnesium_coefficient() {
		return meal.get_magnesium_coefficient();
	}

	@Override
	public final Double get_manganese_in_milligrams() {
		return meal.get_manganese_in_milligrams();
	}

	@Override
	public final Double get_manganese_coefficient() {
		return meal.get_manganese_coefficient();
	}

	@Override
	public final Double get_phosphorus_in_milligrams() {
		return meal.get_phosphorus_in_milligrams();
	}

	@Override
	public final Double get_phosphorus_coefficient() {
		return meal.get_phosphorus_coefficient();
	}

	@Override
	public final Double get_potassium_in_milligrams() {
		return meal.get_potassium_in_milligrams();
	}

	@Override
	public final Double get_potassium_coefficient() {
		return meal.get_potassium_coefficient();
	}

	@Override
	public final Double get_selenium_in_micrograms() {
		return meal.get_selenium_in_micrograms();
	}

	@Override
	public final Double get_selenium_coefficient() {
		return meal.get_selenium_coefficient();
	}

	@Override
	public final Double get_sodium_in_milligrams() {
		return meal.get_sodium_in_milligrams();
	}

	@Override
	public final Double get_sodium_coefficient() {
		return meal.get_sodium_coefficient();
	}

	@Override
	public final Double get_zinc_in_milligrams() {
		return meal.get_zinc_in_milligrams();
	}

	@Override
	public final Double get_zinc_coefficient() {
		return meal.get_zinc_coefficient();
	}

	@Override
	public final Double get_folate_in_micrograms() {
		return meal.get_folate_in_micrograms();
	}

	@Override
	public final Double get_folate_coefficient() {
		return meal.get_folate_coefficient();
	}

	@Override
	public final Double get_niacin_in_milligrams() {
		return meal.get_niacin_in_milligrams();
	}

	@Override
	public final Double get_niacin_coefficient() {
		return meal.get_niacin_coefficient();
	}

	@Override
	public final Double get_pantothenic_acid_in_milligrams() {
		return meal.get_pantothenic_acid_in_milligrams();
	}

	@Override
	public final Double get_pantothenic_acid_coefficient() {
		return meal.get_pantothenic_acid_coefficient();
	}

	@Override
	public final Double get_riboflavin_in_milligrams() {
		return meal.get_riboflavin_in_milligrams();
	}

	@Override
	public final Double get_riboflavin_coefficient() {
		return meal.get_riboflavin_coefficient();
	}

	@Override
	public final Double get_thiamin_in_milligrams() {
		return meal.get_thiamin_in_milligrams();
	}

	@Override
	public final Double get_thiamin_coefficient() {
		return meal.get_thiamin_coefficient();
	}

	@Override
	public final Double get_vitamin_a_in_micrograms() {
		return meal.get_vitamin_a_in_micrograms();
	}

	@Override
	public final Double get_vitamin_a_coefficient() {
		return meal.get_vitamin_a_coefficient();
	}

	@Override
	public final Double get_vitamin_b12_in_micrograms() {
		return meal.get_vitamin_b12_in_micrograms();
	}

	@Override
	public final Double get_vitamin_b12_coefficient() {
		return meal.get_vitamin_b12_coefficient();
	}

	@Override
	public final Double get_vitamin_b6_in_milligrams() {
		return meal.get_vitamin_b6_in_milligrams();
	}

	@Override
	public final Double get_vitamin_b6_coefficient() {
		return meal.get_vitamin_b6_coefficient();
	}

	@Override
	public final Double get_vitamin_c_in_milligrams() {
		return meal.get_vitamin_c_in_milligrams();
	}

	@Override
	public final Double get_vitamin_c_coefficient() {
		return meal.get_vitamin_c_coefficient();
	}

	@Override
	public final Double get_vitamin_d_in_micrograms() {
		return meal.get_vitamin_d_in_micrograms();
	}

	@Override
	public final Double get_vitamin_d_coefficient() {
		return meal.get_vitamin_d_coefficient();
	}

	@Override
	public final Double get_vitamin_e_in_milligrams() {
		return meal.get_vitamin_e_in_milligrams();
	}

	@Override
	public final Double get_vitamin_e_coefficient() {
		return meal.get_vitamin_e_coefficient();
	}

	@Override
	public final Double get_vitamin_k_in_micrograms() {
		return meal.get_vitamin_k_in_micrograms();
	}

	@Override
	public final Double get_vitamin_k_coefficient() {
		return meal.get_vitamin_k_coefficient();
	}

	@Override
	public final Double get_choline_in_milligrams() {
		return meal.get_choline_in_milligrams();
	}

	@Override
	public final Double get_choline_coefficient() {
		return meal.get_choline_coefficient();
	}

	@Override
	public final Double get_glycemic_index() {
		return meal.get_glycemic_index();
	}

	@Override
	public final Double get_glycemic_load() {
		return meal.get_glycemic_load();
	}

	@Override
	public final Double get_glycemic_load_coefficient() {
		return meal.get_glycemic_load_coefficient();
	}

	@Override
	public final Double get_alpha_linolenic_acid_in_grams() {
		return meal.get_alpha_linolenic_acid_in_grams();
	}

	@Override
	public final Double get_alpha_linolenic_acid_coefficient() {
		return meal.get_alpha_linolenic_acid_coefficient();
	}

	@Override
	public final Double get_linoleic_acid_in_grams() {
		return meal.get_linoleic_acid_in_grams();
	}

	@Override
	public final Double get_linoleic_acid_coefficient() {
		return meal.get_linoleic_acid_coefficient();
	}

	@Override
	public final Double get_dha_in_grams() {
		return meal.get_dha_in_grams();
	}

	@Override
	public final Double get_dha_coefficient() {
		return meal.get_dha_coefficient();
	}

	@Override
	public final Double get_epa_in_grams() {
		return meal.get_epa_in_grams();
	}

	@Override
	public final Double get_epa_coefficient() {
		return meal.get_epa_coefficient();
	}

	@Override
	public final Double get_water_in_grams() {
		return meal.get_water_in_grams();
	}

	@Override
	public final Double get_water_coefficient() {
		return meal.get_water_coefficient();
	}

	@Override
	public final Double get_cost_in_dollars() {
		return meal.get_cost_in_dollars();
	}

	@Override
	public final Double get_cost_coefficient() {
		return meal.get_cost_coefficient();
	}

	@Override
	public final Double get_energy_alcohol_in_kilocalories() {
		return meal.get_energy_alcohol_in_kilocalories();
	}

	@Override
	public final Double get_energy_alcohol_coefficient() {
		return meal.get_energy_alcohol_coefficient();
	}

	@Override
	public final Double get_energy_digestible_carbohydrate_in_kilocalories() {
		return meal.get_energy_digestible_carbohydrate_in_kilocalories();
	}

	@Override
	public final Double get_energy_digestible_carbohydrate_coefficient() {
		return meal.get_energy_digestible_carbohydrate_coefficient();
	}

	@Override
	public final Double get_energy_digestible_in_kilocalories() {
		return meal.get_energy_digestible_in_kilocalories();
	}

	@Override
	public final Double get_energy_digestible_coefficient() {
		return meal.get_energy_digestible_coefficient();
	}

	@Override
	public final Double get_energy_fat_in_kilocalories() {
		return meal.get_energy_fat_in_kilocalories();
	}

	@Override
	public final Double get_energy_fat_coefficient() {
		return meal.get_energy_fat_coefficient();
	}

	@Override
	public final Double get_energy_protein_in_kilocalories() {
		return meal.get_energy_protein_in_kilocalories();
	}

	@Override
	public final Double get_energy_protein_coefficient() {
		return meal.get_energy_protein_coefficient();
	}

	@Override
	public final Double get_food_quotient() {
		return meal.get_food_quotient();
	}

	private Interface_food get_total() {
		Iterator it = list.iterator();
		Food_mutable mutable = new Food_mutable();
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
		Double energy_alcohol = 0.0;
		Double energy_digestible_carbohydrate = 0.0;
		Double energy_digestible = 0.0;
		Double energy_fat = 0.0;
		Double energy_protein = 0.0;
		while (it.hasNext()) {
			Interface_food food = (Interface_food) it.next();
			weight += food.get_weight_in_grams();
			energy_gross += food.get_energy_gross_in_kilocalories();
			protein += food.get_protein_in_grams();
			carbohydrate_by_difference += food.get_carbohydrate_by_difference_in_grams();
			fiber += food.get_fiber_in_grams();
			fat += food.get_fat_in_grams();
			alcohol += food.get_alcohol_in_grams();
			cholesterol += food.get_cholesterol_in_milligrams();
			monounsaturated_fat += food.get_monounsaturated_fat_in_grams();
			polyunsaturated_fat += food.get_polyunsaturated_fat_in_grams();
			saturated_fat += food.get_saturated_fat_in_grams();
			complete_protein += food.get_complete_protein_in_grams();
			calcium += food.get_calcium_in_milligrams();
			copper += food.get_copper_in_milligrams();
			fluoride += food.get_fluoride_in_micrograms();
			iron += food.get_iron_in_milligrams();
			magnesium += food.get_magnesium_in_milligrams();
			manganese += food.get_manganese_in_milligrams();
			phosphorus += food.get_phosphorus_in_milligrams();
			potassium += food.get_potassium_in_milligrams();
			selenium += food.get_selenium_in_micrograms();
			sodium += food.get_sodium_in_milligrams();
			zinc += food.get_zinc_in_milligrams();
			folate += food.get_folate_in_micrograms();
			niacin += food.get_niacin_in_milligrams();
			pantothenic_acid += food.get_pantothenic_acid_in_milligrams();
			riboflavin += food.get_riboflavin_in_milligrams();
			thiamin += food.get_thiamin_in_milligrams();
			vitamin_a += food.get_vitamin_a_in_micrograms();
			vitamin_b12 += food.get_vitamin_b12_in_micrograms();
			vitamin_b6 += food.get_vitamin_b6_in_milligrams();
			vitamin_c += food.get_vitamin_c_in_milligrams();
			vitamin_d += food.get_vitamin_d_in_micrograms();
			vitamin_e += food.get_vitamin_e_in_milligrams();
			vitamin_k += food.get_vitamin_k_in_micrograms();
			choline += food.get_choline_in_milligrams();
			alphalinolenic_acid += food.get_alpha_linolenic_acid_in_grams();
			linoleic_acid += food.get_linoleic_acid_in_grams();
			dha += food.get_dha_in_grams();
			epa += food.get_epa_in_grams();
			water += food.get_water_in_grams();
			cost += food.get_cost_in_dollars();
			energy_alcohol += food.get_alcohol_in_grams();
			energy_digestible_carbohydrate += food.get_energy_digestible_carbohydrate_in_kilocalories();
			energy_digestible += food.get_energy_digestible_in_kilocalories();
			energy_fat += food.get_energy_fat_in_kilocalories();
			energy_protein += food.get_energy_protein_in_kilocalories();
		}
		mutable.set_food_name(name);
		mutable.set_food_label(name);
		mutable.set_weight_in_grams(weight);
		mutable.set_energy_gross_in_kilocalories(energy_gross);
		mutable.set_protein_in_grams(protein);
		mutable.set_carbohydrate_by_difference_in_grams(carbohydrate_by_difference);
		mutable.set_fiber_in_grams(fiber);
		mutable.set_fat_in_grams(fat);
		mutable.set_alcohol_in_grams(alcohol);
		mutable.set_cholesterol_in_milligrams(cholesterol);
		mutable.set_monounsaturated_fat_in_grams(monounsaturated_fat);
		mutable.set_polyunsaturated_fat_in_grams(polyunsaturated_fat);
		mutable.set_saturated_fat_in_grams(saturated_fat);
		mutable.set_complete_protein_in_grams(complete_protein);
		mutable.set_calcium_in_milligrams(calcium);
		mutable.set_copper_in_milligrams(copper);
		mutable.set_fluoride_in_micrograms(fluoride);
		mutable.set_iron_in_milligrams(iron);
		mutable.set_magnesium_in_milligrams(magnesium);
		mutable.set_manganese_in_milligrams(manganese);
		mutable.set_phosphorus_in_milligrams(phosphorus);
		mutable.set_potassium_in_milligrams(potassium);
		mutable.set_selenium_in_micrograms(selenium);
		mutable.set_sodium_in_milligrams(sodium);
		mutable.set_zinc_in_milligrams(zinc);
		mutable.set_folate_in_micrograms(folate);
		mutable.set_niacin_in_milligrams(niacin);
		mutable.set_pantothenic_acid_in_milligrams(pantothenic_acid);
		mutable.set_riboflavin_in_milligrams(riboflavin);
		mutable.set_thiamin_in_milligrams(thiamin);
		mutable.set_vitamin_a_in_micrograms(vitamin_a);
		mutable.set_vitamin_b12_in_micrograms(vitamin_b12);
		mutable.set_vitamin_b6_in_milligrams(vitamin_b6);
		mutable.set_vitamin_c_in_milligrams(vitamin_c);
		mutable.set_vitamin_d_in_micrograms(vitamin_d);
		mutable.set_vitamin_e_in_milligrams(vitamin_e);
		mutable.set_vitamin_k_in_micrograms(vitamin_k);
		mutable.set_choline_in_milligrams(choline);
		mutable.set_glycemic_index(get_meal_glycemic_index());
		mutable.set_alpha_linolenic_acid_in_grams(alphalinolenic_acid);
		mutable.set_linoleic_acid_in_grams(linoleic_acid);
		mutable.set_dha_in_grams(dha);
		mutable.set_epa_in_grams(epa);
		mutable.set_water_in_grams(water);
		mutable.set_cost_in_dollars(cost);
		mutable.set_energy_alcohol_in_kilocalories(energy_alcohol);
		mutable.set_energy_digestible_carbohydrate_in_kilocalories(energy_digestible_carbohydrate);
		mutable.set_energy_digestible_in_kilocalories(energy_digestible);
		mutable.set_energy_fat_in_kilocalories(energy_fat);
		mutable.set_energy_protein_in_kilocalories(energy_protein);
		Interface_food happy_meal = mutable;
		return happy_meal;
	}

	private Double get_meal_glycemic_index() {
		Double total_digestible_carbohydrate = 0.0;
		Double meal_gi = 0.0;
		for (Interface_food food : list) {
			total_digestible_carbohydrate += food.get_digestible_carbohydrate_in_grams();
		}
		for (Interface_food food : list) {
			if (total_digestible_carbohydrate > 0) {
				meal_gi += (food.get_digestible_carbohydrate_in_grams() / total_digestible_carbohydrate)
						* food.get_glycemic_index();
			}
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
		final Food_summator other = (Food_summator) obj;
		if (!Objects.equals(this.get_food_label(), other.get_food_label())) {
			return false;
		}
		if (!Objects.equals(this.get_food_name(), other.get_food_name())) {
			return false;
		}
		if (!Objects.equals(this.get_alcohol_in_grams(), other.get_alcohol_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_alpha_linolenic_acid_in_grams(), other.get_alpha_linolenic_acid_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_calcium_in_milligrams(), other.get_calcium_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_carbohydrate_by_difference_in_grams(),
				other.get_carbohydrate_by_difference_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_cholesterol_in_milligrams(), other.get_cholesterol_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_choline_in_milligrams(), other.get_choline_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_complete_protein_in_grams(), other.get_complete_protein_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_copper_in_milligrams(), other.get_copper_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_cost_in_dollars(), other.get_cost_in_dollars())) {
			return false;
		}
		if (!Objects.equals(this.get_dha_in_grams(), other.get_dha_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_digestible_carbohydrate_in_grams(),
				other.get_digestible_carbohydrate_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_energy_alcohol_in_kilocalories(), other.get_energy_alcohol_in_kilocalories())) {
			return false;
		}
		if (!Objects.equals(this.get_energy_digestible_in_kilocalories(),
				other.get_energy_digestible_in_kilocalories())) {
			return false;
		}
		if (!Objects.equals(this.get_energy_digestible_carbohydrate_in_kilocalories(),
				other.get_energy_digestible_carbohydrate_in_kilocalories())) {
			return false;
		}
		if (!Objects.equals(this.get_energy_fat_in_kilocalories(), other.get_energy_fat_in_kilocalories())) {
			return false;
		}
		if (!Objects.equals(this.get_energy_gross_in_kilocalories(), other.get_energy_gross_in_kilocalories())) {
			return false;
		}
		if (!Objects.equals(this.get_energy_protein_in_kilocalories(), other.get_energy_protein_in_kilocalories())) {
			return false;
		}
		if (!Objects.equals(this.get_epa_in_grams(), other.get_epa_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_fat_in_grams(), other.get_fat_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_fiber_in_grams(), other.get_fiber_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_fluoride_in_micrograms(), other.get_fluoride_in_micrograms())) {
			return false;
		}
		if (!Objects.equals(this.get_folate_in_micrograms(), other.get_folate_in_micrograms())) {
			return false;
		}
		if (!Objects.equals(this.get_iron_in_milligrams(), other.get_iron_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_linoleic_acid_in_grams(), other.get_linoleic_acid_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_magnesium_in_milligrams(), other.get_magnesium_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_manganese_in_milligrams(), other.get_manganese_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_monounsaturated_fat_in_grams(), other.get_monounsaturated_fat_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_niacin_in_milligrams(), other.get_niacin_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_pantothenic_acid_in_milligrams(), other.get_pantothenic_acid_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_phosphorus_in_milligrams(), other.get_phosphorus_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_polyunsaturated_fat_in_grams(), other.get_polyunsaturated_fat_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_potassium_in_milligrams(), other.get_potassium_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_protein_in_grams(), other.get_protein_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_riboflavin_in_milligrams(), other.get_riboflavin_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_saturated_fat_in_grams(), other.get_saturated_fat_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_selenium_in_micrograms(), other.get_selenium_in_micrograms())) {
			return false;
		}
		if (!Objects.equals(this.get_sodium_in_milligrams(), other.get_sodium_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_thiamin_in_milligrams(), other.get_thiamin_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_vitamin_a_in_micrograms(), other.get_vitamin_a_in_micrograms())) {
			return false;
		}
		if (!Objects.equals(this.get_vitamin_b6_in_milligrams(), other.get_vitamin_b6_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_vitamin_b12_in_micrograms(), other.get_vitamin_b12_in_micrograms())) {
			return false;
		}
		if (!Objects.equals(this.get_vitamin_c_in_milligrams(), other.get_vitamin_c_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_vitamin_d_in_micrograms(), other.get_vitamin_d_in_micrograms())) {
			return false;
		}
		if (!Objects.equals(this.get_vitamin_e_in_milligrams(), other.get_vitamin_e_in_milligrams())) {
			return false;
		}
		if (!Objects.equals(this.get_vitamin_k_in_micrograms(), other.get_vitamin_k_in_micrograms())) {
			return false;
		}
		if (!Objects.equals(this.get_water_in_grams(), other.get_water_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_weight_in_grams(), other.get_weight_in_grams())) {
			return false;
		}
		if (!Objects.equals(this.get_zinc_in_milligrams(), other.get_zinc_in_milligrams())) {
			return false;
		}
		return true;
	}
}
