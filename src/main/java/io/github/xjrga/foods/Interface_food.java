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

/**
 * This interface is used to get food nutrition facts data
 */
public interface Interface_food {

	/**
	 * Get food id
	 *
	 * @return String
	 */
	String get_food_id();

	/**
	 * Get food name
	 *
	 * @return Double String
	 */
	String get_food_name();

	/**
	 * Get food label
	 *
	 * @return Double String
	 */
	String get_food_label();

	/**
	 * Get serving size weight (g)
	 *
	 * @return Double
	 */
	Double get_weight_in_grams();

	/**
	 * Get gross energy (Kcal)
	 *
	 * @return Double
	 */
	Double get_energy_gross_in_kilocalories();

	/**
	 * Get gross energy coefficent (Kcal / g of food)
	 *
	 * @return Double
	 */
	Double get_energy_gross_in_kilocalories_coefficient();

	// Macronutrients
	/**
	 * Get protein, includes both incomplete and complete (g)
	 *
	 * @return Double
	 */
	Double get_protein_in_grams();

	/**
	 * Get protein coefficient (g of protein / g of food)
	 *
	 * @return Double
	 */
	Double get_protein_coefficient();

	/**
	 * Get protein atwater factor (Kcal / g of protein)
	 *
	 * @return Double
	 */
	Double get_protein_atwater_factor();

	/**
	 * Get carbohydrate by difference, includes digestible carbohydrate plus fiber
	 * (g)
	 *
	 * @return Double
	 */
	Double get_carbohydrate_by_difference_in_grams();

	/**
	 * Get carbohydrate by difference coefficient (g of carbohydrate by difference /
	 * g of food)
	 *
	 * @return Double
	 */
	Double get_carbohydrate_by_difference_coefficient();

	/**
	 * Get carbohydrate by difference atwater factor (Kcal / g of carbohydrate by
	 * difference)
	 *
	 * @return Double
	 */
	Double get_carbohydrate_by_difference_atwater_factor();

	/**
	 * Get fiber (g)
	 *
	 * @return Double
	 */
	Double get_fiber_in_grams();

	/**
	 * Get fiber coefficient (g of fiber / g of food)
	 *
	 * @return Double
	 */
	Double get_fiber_coefficient();

	// Calculate digestible carbs from carbohydrate_by_difference and fiber
	/**
	 * Get total fat, includes saturated, polyunsaturated and monounsaturated (g)
	 *
	 * @return Double
	 */
	Double get_fat_in_grams();

	/**
	 * Get total fat coefficient (g of fat / g of food)
	 *
	 * @return Double
	 */
	Double get_fat_coefficient();

	/**
	 * Get fat atwater factor (Kcal / g of fat)
	 *
	 * @return Double
	 */
	Double get_fat_atwater_factor();

	/**
	 * Get ethyl alcohol (g)
	 *
	 * @return Double
	 */
	Double get_alcohol_in_grams();

	/**
	 * Get ethyl alcohol coefficient (g of alcohol / g of food)
	 *
	 * @return Double
	 */
	Double get_alcohol_coefficient();

	/**
	 * Get ethyl alcohol atwater factor (Kcal / g of alcohol)
	 *
	 * @return Double
	 */
	Double get_alcohol_atwater_factor();

	// calculated carbs
	/**
	 * Get digestible carbohydrate (g)
	 *
	 * @return Double
	 */
	Double get_digestible_carbohydrate_in_grams();

	/**
	 * Get digestible carbohydrate coefficient (g)
	 *
	 * @return Double
	 */
	Double get_digestible_carbohydrate_coefficient();

	// Fats
	/**
	 * Get cholesterol (mg)
	 *
	 * @return Double
	 */
	Double get_cholesterol_in_milligrams();

	/**
	 * Get cholesterol coefficient (mg of cholesterol / g of food)
	 *
	 * @return Double
	 */
	Double get_cholesterol_coefficient();

	/**
	 * Get monounsaturated fat (g)
	 *
	 * @return Double
	 */
	Double get_monounsaturated_fat_in_grams();

	/**
	 * Get monounsaturated fat coefficient (g of fat / g of food)
	 *
	 * @return Double
	 */
	Double get_monounsaturated_fat_coefficient();

	/**
	 * Get polyunsaturated fat (g)
	 *
	 * @return Double
	 */
	Double get_polyunsaturated_fat_in_grams();

	/**
	 * Get polyunsaturated fat coefficient (g of fat / g of food)
	 *
	 * @return Double
	 */
	Double get_polyunsaturated_fat_coefficient();

	/**
	 * Get saturated fat (g)
	 *
	 * @return Double
	 */
	Double get_saturated_fat_in_grams();

	/**
	 * Get saturated fat coefficient (g of fat / g of food)
	 *
	 * @return Double
	 */
	Double get_saturated_fat_coefficient();

	// protein
	/**
	 * Get complete protein (g)
	 *
	 * @return Double
	 */
	Double get_complete_protein_in_grams();

	/**
	 * Get complete protein coefficient (g of protein / g of food)
	 *
	 * @return Double
	 */
	Double get_complete_protein_coefficient();

	// minerals
	/**
	 * Get calcium (mg)
	 *
	 * @return Double
	 */
	Double get_calcium_in_milligrams();

	/**
	 * Get calcium coefficient (mg of calcium / g of food)
	 *
	 * @return Double
	 */
	Double get_calcium_coefficient();

	/**
	 * Get copper (mg)
	 *
	 * @return Double
	 */
	Double get_copper_in_milligrams();

	/**
	 * Get copper coefficient (mg of copper / g of food)
	 *
	 * @return Double
	 */
	Double get_copper_coefficient();

	/**
	 * Set flouride (µg)
	 *
	 * @return Double
	 */
	Double get_fluoride_in_micrograms();

	/**
	 * Get flouride coefficient (µg of flouride / g of food)
	 *
	 * @return Double
	 */
	Double get_fluoride_coefficient();

	/**
	 * Get iron (mg)
	 *
	 * @return Double
	 */
	Double get_iron_in_milligrams();

	/**
	 * Get iron coefficient (mg of iron / g of food)
	 *
	 * @return Double
	 */
	Double get_iron_coefficient();

	/**
	 * Set magnesium (mg)
	 *
	 * @return Double
	 */
	Double get_magnesium_in_milligrams();

	/**
	 * Get magnesium coefficient (mg of magnesium / g of food)
	 *
	 * @return Double
	 */
	Double get_magnesium_coefficient();

	/**
	 * Get manganese (mg)
	 *
	 * @return Double
	 */
	Double get_manganese_in_milligrams();

	/**
	 * Get manganese coefficient (mg of manganese / g of food)
	 *
	 * @return Double
	 */
	Double get_manganese_coefficient();

	/**
	 * Get phosphorus (mg)
	 *
	 * @return Double
	 */
	Double get_phosphorus_in_milligrams();

	/**
	 * Get phosphorus coefficient (mg of phosphorus / g of food)
	 *
	 * @return Double
	 */
	Double get_phosphorus_coefficient();

	/**
	 * Get potassium (mg)
	 *
	 * @return Double
	 */
	Double get_potassium_in_milligrams();

	/**
	 * Get potassium coefficient (mg of potassium / g of food)
	 *
	 * @return Double
	 */
	Double get_potassium_coefficient();

	/**
	 * Get selenium (µg)
	 *
	 * @return Double
	 */
	Double get_selenium_in_micrograms();

	/**
	 * Get selenium coefficient (µg of selenium / g of food)
	 *
	 * @return Double
	 */
	Double get_selenium_coefficient();

	/**
	 * Get sodium (mg)
	 *
	 * @return Double
	 */
	Double get_sodium_in_milligrams();

	/**
	 * Get sodium coefficient (mg of sodium / g of food)
	 *
	 * @return Double
	 */
	Double get_sodium_coefficient();

	/**
	 * Get zinc (mg)
	 *
	 * @return Double
	 */
	Double get_zinc_in_milligrams();

	/**
	 * Get zinc coefficient (mg of zinc / g of food)
	 *
	 * @return Double
	 */
	Double get_zinc_coefficient();

	// vitamins
	/**
	 * Get folate (µg)
	 *
	 * @return Double
	 */
	Double get_folate_in_micrograms();

	/**
	 * Get folate coefficient (µg of folate / g of food)
	 *
	 * @return Double
	 */
	Double get_folate_coefficient();

	/**
	 * Get niacin (mg)
	 *
	 * @return Double
	 */
	Double get_niacin_in_milligrams();

	/**
	 * Get niacin coefficient (mg of niacin / g of food)
	 *
	 * @return Double
	 */
	Double get_niacin_coefficient();

	/**
	 * Get pantothenic acid (mg)
	 *
	 * @return Double
	 */
	Double get_pantothenic_acid_in_milligrams();

	/**
	 * Get pantothenic acid coefficient (mg of pantothenic acid / g of food)
	 *
	 * @return Double
	 */
	Double get_pantothenic_acid_coefficient();

	/**
	 * Get riboflavin (mg)
	 *
	 * @return Double
	 */
	Double get_riboflavin_in_milligrams();

	/**
	 * Get riboflavin coefficient (mg of riboflavin / g of food)
	 *
	 * @return Double
	 */
	Double get_riboflavin_coefficient();

	/**
	 * Get thiamin (mg)
	 *
	 * @return Double
	 */
	Double get_thiamin_in_milligrams();

	/**
	 * Get thiamin coefficient (mg of thiamin / g of food)
	 *
	 * @return Double
	 */
	Double get_thiamin_coefficient();

	/**
	 * Get vitamin a (µg)
	 *
	 * @return Double
	 */
	Double get_vitamin_a_in_micrograms();

	/**
	 * Get vitamin a coefficient (µg of vitamin a / g of food)
	 *
	 * @return Double
	 */
	Double get_vitamin_a_coefficient();

	/**
	 * Get vitamin b12 (µg)
	 *
	 * @return Double
	 */
	Double get_vitamin_b12_in_micrograms();

	/**
	 * Get vitamin b12 coefficient (µg of vitamin b12 / g of food)
	 *
	 * @return Double
	 */
	Double get_vitamin_b12_coefficient();

	/**
	 * Get vitamin b6 (mg)
	 *
	 * @return Double
	 */
	Double get_vitamin_b6_in_milligrams();

	/**
	 * Get vitamin b6 coefficient (mg of vitamin b6 / g of food)
	 *
	 * @return Double
	 */
	Double get_vitamin_b6_coefficient();

	/**
	 * Get vitamin c (mg)
	 *
	 * @return Double
	 */
	Double get_vitamin_c_in_milligrams();

	/**
	 * Get vitamin c coefficient (mg of vitamin c / g of food)
	 *
	 * @return Double
	 */
	Double get_vitamin_c_coefficient();

	/**
	 * Get vitamin d (µg)
	 *
	 * @return Double
	 */
	Double get_vitamin_d_in_micrograms();

	/**
	 * Get vitamin d coefficient (µg of vitamin d / g of food)
	 *
	 * @return Double
	 */
	Double get_vitamin_d_coefficient();

	/**
	 * Get vitamin e (mg)
	 *
	 * @return Double
	 */
	Double get_vitamin_e_in_milligrams();

	/**
	 * Get vitamin e coefficient (mg of vitamin e / g of food)
	 *
	 * @return Double
	 */
	Double get_vitamin_e_coefficient();

	/**
	 * Get vitamin k (µg)
	 *
	 * @return Double
	 */
	Double get_vitamin_k_in_micrograms();

	/**
	 * Get vitamin k coefficient (µg of vitamin k / g of food)
	 *
	 * @return Double
	 */
	Double get_vitamin_k_coefficient();

	/**
	 * Get choline (mg)
	 *
	 * @return Double
	 */
	Double get_choline_in_milligrams();

	/**
	 * Get choline coefficient (mg of choline / g of food)
	 *
	 * @return Double
	 */
	Double get_choline_coefficient();

	// glycemic
	/**
	 * Get glycemic index (0-100)
	 * <p>
	 * Glycemic index is total glucose exposure delivered by test food (in two
	 * hours) divided by total glucose exposure delivered by standard food (in two
	 * hours) multiplied by 100. Either 50 g of glucose or white bread are used as
	 * the standard. It is a percentage of standard.
	 *
	 * @return Double
	 */
	Double get_glycemic_index();

	/**
	 * Get glycemic load (g of digestible carbohydrate)
	 * <p>
	 * It is glycemic index divided by 100 multiplied by digestible carbohydrate
	 * quantity
	 *
	 * @return Double
	 */
	Double get_glycemic_load();

	/**
	 * Get glycemic load coefficient (g of digestible carbohydrate / g of food)
	 *
	 * @return Double
	 */
	Double get_glycemic_load_coefficient();

	// omega-3
	/**
	 * Get alpha-linolenic acid (g)
	 *
	 * @return Double
	 */
	Double get_alpha_linolenic_acid_in_grams();

	/**
	 * Get alpha-linolenic acid coefficient (g of alpha-linolenic acid / g of food)
	 *
	 * @return Double
	 */
	Double get_alpha_linolenic_acid_coefficient();

	/**
	 * Get linoleic acid (g)
	 *
	 * @return Double
	 */
	Double get_linoleic_acid_in_grams();

	/**
	 * Get linoleic acid coefficient (g of linoleic acid / g of food)
	 *
	 * @return Double
	 */
	Double get_linoleic_acid_coefficient();

	/**
	 * Get docosahexaenoic acid "dha" (g)
	 *
	 * @return Double
	 */
	Double get_dha_in_grams();

	/**
	 * Get docosahexaenoic acid "dha" coefficient (g of dha / g of food)
	 *
	 * @return Double
	 */
	Double get_dha_coefficient();

	/**
	 * Get eicosapentaenoic acid "epa" (g)
	 *
	 * @return Double
	 */
	Double get_epa_in_grams();

	/**
	 * Get eicosapentaenoic acid "epa" coefficient (g of epa / g of food)
	 *
	 * @return Double
	 */
	Double get_epa_coefficient();

	// water
	/**
	 * Get water (g)
	 *
	 * @return Double
	 */
	Double get_water_in_grams();

	/**
	 * Get water coefficient (g of water / g of food)
	 *
	 * @return Double
	 */
	Double get_water_coefficient();

	// cost
	/**
	 * Get cost ($)
	 *
	 * @return Double
	 */
	Double get_cost_in_dollars();

	/**
	 * Get cost coefficient ($ / g of food)
	 *
	 * @return Double
	 */
	Double get_cost_coefficient();

	// calculated energy
	/**
	 * Get energy provided by alcohol (Kcal)
	 *
	 * @return Double
	 */
	Double get_energy_alcohol_in_kilocalories();

	/**
	 * Get energy provided by alcohol coefficient (Kcal / g of food)
	 *
	 * @return Double
	 */
	Double get_energy_alcohol_coefficient();

	/**
	 * Get energy provided by digestible carbohydrates (Kcal)
	 *
	 * @return Double
	 */
	Double get_energy_digestible_carbohydrate_in_kilocalories();

	/**
	 * Get energy provided by digestible carbohydrates coefficient (Kcal / g of
	 * food)
	 *
	 * @return Double
	 */
	Double get_energy_digestible_carbohydrate_coefficient();

	/**
	 * Get gross energy minus fiber energy (Kcal)
	 *
	 * @return Double
	 */
	Double get_energy_digestible_in_kilocalories();

	/**
	 * Get gross energy minus fiber energy coefficient (Kcal / g of food)
	 *
	 * @return Double
	 */
	Double get_energy_digestible_coefficient();

	/**
	 * Get energy provided by total fat (Kcal)
	 *
	 * @return Double
	 */
	Double get_energy_fat_in_kilocalories();

	/**
	 * Get energy provided by total fat coefficient (Kcal / g of food)
	 *
	 * @return Double
	 */
	Double get_energy_fat_coefficient();

	/**
	 * Get energy provided by protein (Kcal)
	 *
	 * @return Double
	 */
	Double get_energy_protein_in_kilocalories();

	/**
	 * Get energy provide by protein coefficient (Kcal / g of food)
	 *
	 * @return Double
	 */
	Double get_energy_protein_coefficient();

	/**
	 * Food Quotient (FQ) expresses dietary macronutrient composition and is a value
	 * between 0.70 and 1.00. It is the theoretical Respiratory Quotient (RQ)
	 * produced by the diet.
	 *
	 * @return Double
	 */
	Double get_food_quotient();

}

//https://www.fao.org/3/y5022e/y5022e04.htm
//https://www.ars.usda.gov/ARSUserFiles/80400525/Data/Classics/ah74.pdf
//https://en.wikipedia.org/wiki/Atwater_system
//https://academic.oup.com/ajcn/article/86/6/1649/4649752
//https://en.wikipedia.org/wiki/Glycemic_index
//
///Protein (g)
//Total lipid (Fat) (g)
//Carbohydrate, by difference (g)
//Energy, gross (Kcal)
//Alcohol, ethyl (g)
//Water (g)
//Fiber, total dietary (g)
//Calcium, Ca (mg)
//Iron, Fe (mg)
//Magnesium, Mg (mg)
//Phosphorus, P (mg)
//Potassium, K (mg)
//Sodium, Na (mg)
//Zinc, Zn (mg)
//Copper, Cu (mg)
//Fluoride, F (µg)
//Manganese, Mn (mg)
//Selenium, Se (µg)
//Vitamin A, RAE (µg)
//Vitamin E (Alpha-Tocopherol) (mg)
//Vitamin D (D2 + D3) (µg)
//Vitamin C, total (Ascorbic Acid) (mg)
//Thiamin (mg)
//Riboflavin (mg)
//Niacin (mg)
//Pantothenic acid (mg)
//Vitamin B-6 (mg)
//Vitamin B-12 (µg)
//Choline, total (mg)
//Vitamin K (Phylloquinone) (µg)
//Folate, DFE (µg)
//Cholesterol (mg)
//Fatty acids, total saturated (g)
//22:6 n-3 (DHA) (g)
//20:5 n-3 (EPA) (g)
//Fatty acids, total monounsaturated (g)
//Fatty acids, total polyunsaturated (g)
//18:2 n-6 c,c (Linoleic) (g)
//18:3 n-3 c,c,c (Alpha-Linolenic) (g)
//Weight (g)
//Complete Protein  (g)
//Digestible Carbs (g)
//Cost  ($)
//Energy, digestible (Kcal)
//Energy, no protein (Kcal)
//Energy, carbohydrate (Kcal)
//Energy, protein (Kcal)
//Energy, fat (Kcal)
//Energy, alcohol (Kcal);
//Food quotient
