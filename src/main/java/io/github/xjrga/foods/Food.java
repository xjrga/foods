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
 * This interface defines a food item
 *
 */
public interface Food {

    /**
     * Set food name
     *
     * @param name The name of food
     */
    void set_food_name(String name);

    /**
     * Get food name
     *
     * @return Double String
     */
    String get_food_name();

    /**
     * Set food label
     *
     * @param label The food name which uses these characters A-Z, a-z 0-9, _
     * only
     */
    void set_food_label(String label);

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
    Double get_weight();

    /**
     * Set serving size weight (g)
     *
     * @param quantity
     */
    void set_weight(Double quantity);

    /**
     * Get gross energy (Kcal)
     *
     * @return Double
     */
    Double get_energy_gross();

    /**
     * Get gross energy coefficent (Kcal / g of food)
     *
     * @return Double
     */
    Double get_energy_gross_coefficient();

    /**
     * Set gross energy (Kcal)
     *
     * @param quantity
     */
    void set_gross_energy(Double quantity);

    //Macronutrients
    /**
     * Get protein, includes both incomplete and complete (g)
     *
     * @return Double
     */
    Double get_protein();

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
     * Set protein, includes both incomplete and complete (g)
     *
     * @param quantity
     */
    void set_protein(Double quantity);

    /**
     * Set protein atwater factor (Kcal / g of protein)
     *
     * @param quantity
     */
    void set_protein_atwater_factor(Double quantity);

    /**
     * Get carbohydrate by difference, includes digestible carbohydrate plus
     * fiber (g)
     *
     * @return Double
     */
    Double get_carbohydrate_by_difference();

    /**
     * Get carbohydrate by difference coefficient (g of carbohydrate by
     * difference / g of food)
     *
     * @return Double
     */
    Double get_carbohydrate_by_difference_coefficient();

    /**
     * Get carbohydrate by difference atwater factor (Kcal / g of carbohydrate
     * by difference)
     *
     * @return Double
     */
    Double get_carbohydrate_by_difference_atwater_factor();

    /**
     * Set carbohydrate by difference, includes digestible carbohydrate plus
     * fiber (g)
     *
     * @param quantity
     */
    void set_carbohydrate_by_difference(Double quantity);

    /**
     * Set carbohydrate by difference atwater factor (Kcal / g of carbohydrate
     * by difference)
     *
     * @param quantity
     */
    void set_carbohydrate_by_difference_atwater_factor(Double quantity);

    /**
     * Get fiber (g)
     *
     * @return Double
     */
    Double get_fiber();

    /**
     * Get fiber coefficient (g of fiber / g of food)
     *
     * @return Double
     */
    Double get_fiber_coefficient();

    /**
     * Set fiber (g)
     *
     * @param quantity
     */
    void set_fiber(Double quantity);

    //Calculate digestible carbs from carbohydrate_by_difference and fiber
    /**
     * Get total fat, includes saturated, polyunsaturated and monounsaturated
     * (g)
     *
     * @return Double
     */
    Double get_fat();

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
     * Set total fat, includes saturated, polyunsaturated and monounsaturated
     * (g)
     *
     * @param quantity
     */
    void set_fat(Double quantity);

    /**
     * Set fat atwater factor (Kcal / g of fat)
     *
     * @param quantity
     */
    void set_fat_atwater_factor(Double quantity);

    /**
     * Get ethyl alcohol (g)
     *
     * @return Double
     */
    Double get_alcohol();

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

    /**
     * Set ethyl alcohol (g)
     *
     * @param quantity
     */
    void set_alcohol(Double quantity);

    /**
     * Set ethyl alcohol atwater factor (Kcal / g of alcohol)
     *
     * @param quantity
     */
    void set_alcohol_atwater_factor(Double quantity);

    //calculated carbs
    /**
     * Get digestible carbohydrate (g)
     *
     * @return Double
     */
    Double get_digestible_carbohydrate();

    /**
     * Get digestible carbohydrate coefficient (g)
     *
     * @return Double
     */
    Double get_digestible_carbohydrate_coefficient();

    //Fats
    /**
     * Get cholesterol (mg)
     *
     * @return Double
     */
    Double get_cholesterol();

    /**
     * Get cholesterol coefficient (mg of cholesterol / g of food)
     *
     * @return Double
     */
    Double get_cholesterol_coefficient();

    /**
     * Set cholesterol coefficient (mg of cholesterol / g of food)
     *
     * @param quantity
     */
    void set_cholesterol(Double quantity);

    /**
     * Get monounsaturated fat (g)
     *
     * @return Double
     */
    Double get_monounsaturated_fat();

    /**
     * Get monounsaturated fat coefficient (g of fat / g of food)
     *
     * @return Double
     */
    Double get_monounsaturated_fat_coefficient();

    /**
     * Set monounsaturated fat (g)
     *
     * @param quantity
     */
    void set_monounsaturated_fat(Double quantity);

    /**
     * Get polyunsaturated fat (g)
     *
     * @return Double
     */
    Double get_polyunsaturated_fat();

    /**
     * Get polyunsaturated fat coefficient (g of fat / g of food)
     *
     * @return Double
     */
    Double get_polyunsaturated_fat_coefficient();

    /**
     * Set polyunsaturated fat (g)
     *
     * @param quantity
     */
    void set_polyunsaturated_fat(Double quantity);

    /**
     * Get saturated fat (g)
     *
     * @return Double
     */
    Double get_saturated_fat();

    /**
     * Get saturated fat coefficient (g of fat / g of food)
     *
     * @return Double
     */
    Double get_saturated_fat_coefficient();

    /**
     * Set saturated fat (g)
     *
     * @param quantity
     */
    void set_saturated_fat(Double quantity);

    //protein
    /**
     * Get complete protein (g)
     *
     * @return Double
     */
    Double get_complete_protein();

    /**
     * Get complete protein coefficient (g of protein / g of food)
     *
     * @return Double
     */
    Double get_complete_protein_coefficient();

    /**
     * Set complete protein (g)
     *
     * @param quantity
     */
    void set_complete_protein(Double quantity);

    //minerals
    /**
     * Get calcium (mg)
     *
     * @return Double
     */
    Double get_calcium();

    /**
     * Get calcium coefficient (mg of calcium / g of food)
     *
     * @return Double
     */
    Double get_calcium_coefficient();

    /**
     * Set calcium (mg)
     *
     * @param quantity
     */
    void set_calcium(Double quantity);

    /**
     * Get copper (mg)
     *
     * @return Double
     */
    Double get_copper();

    /**
     * Get copper coefficient (mg of copper / g of food)
     *
     * @return Double
     */
    Double get_copper_coefficient();

    /**
     * Set copper (mg)
     *
     * @param quantity
     */
    void set_copper(Double quantity);

    /**
     * Set flouride (µg)
     *
     * @return Double
     */
    Double get_fluoride();

    /**
     * Get flouride coefficient (µg of flouride / g of food)
     *
     * @return Double
     */
    Double get_fluoride_coefficient();

    /**
     * Set flouride (µg)
     *
     * @param quantity
     */
    void set_fluoride(Double quantity);

    /**
     * Get iron (mg)
     *
     * @return Double
     */
    Double get_iron();

    /**
     * Get iron coefficient (mg of iron / g of food)
     *
     * @return Double
     */
    Double get_iron_coefficient();

    /**
     * Set iron (mg)
     *
     * @param quantity
     */
    void set_iron(Double quantity);

    /**
     * Set magnesium (mg)
     *
     * @return Double
     */
    Double get_magnesium();

    /**
     * Get magnesium coefficient (mg of magnesium / g of food)
     *
     * @return Double
     */
    Double get_magnesium_coefficient();

    /**
     * Set magnesium (mg)
     *
     * @param quantity
     */
    void set_magnesium(Double quantity);

    /**
     * Get manganese (mg)
     *
     * @return Double
     */
    Double get_manganese();

    /**
     * Get manganese coefficient (mg of manganese / g of food)
     *
     * @return Double
     */
    Double get_manganese_coefficient();

    /**
     * Set manganese (mg)
     *
     * @param quantity
     */
    void set_manganese(Double quantity);

    /**
     * Get phosphorus (mg)
     *
     * @return Double
     */
    Double get_phosphorus();

    /**
     * Get phosphorus coefficient (mg of phosphorus / g of food)
     *
     * @return Double
     */
    Double get_phosphorus_coefficient();

    /**
     * Set phosphorus (mg)
     *
     * @param quantity
     */
    void set_phosphorus(Double quantity);

    /**
     * Get potassium (mg)
     *
     * @return Double
     */
    Double get_potassium();

    /**
     * Get potassium coefficient (mg of potassium / g of food)
     *
     * @return Double
     */
    Double get_potassium_coefficient();

    /**
     * Set potassium (mg)
     *
     * @param quantity
     */
    void set_potassium(Double quantity);

    /**
     * Get selenium (µg)
     *
     * @return Double
     */
    Double get_selenium();

    /**
     * Get selenium coefficient (µg of selenium / g of food)
     *
     * @return Double
     */
    Double get_selenium_coefficient();

    /**
     * Set selenium (µg)
     *
     * @param quantity
     */
    void set_selenium(Double quantity);

    /**
     * Get sodium (mg)
     *
     * @return Double
     */
    Double get_sodium();

    /**
     * Get sodium coefficient (mg of sodium / g of food)
     *
     * @return Double
     */
    Double get_sodium_coefficient();

    /**
     * Set sodium (mg)
     *
     * @param quantity
     */
    void set_sodium(Double quantity);

    /**
     * Get zinc (mg)
     *
     * @return Double
     */
    Double get_zinc();

    /**
     * Get zinc coefficient (mg of zinc / g of food)
     *
     * @return Double
     */
    Double get_zinc_coefficient();

    /**
     * Set zinc (mg)
     *
     * @param quantity
     */
    void set_zinc(Double quantity);

    //vitamins
    /**
     * Get folate (µg)
     *
     * @return Double
     */
    Double get_folate();

    /**
     * Get folate coefficient (µg of folate / g of food)
     *
     * @return Double
     */
    Double get_folate_coefficient();

    /**
     * Set folate (µg)
     *
     * @param quantity
     */
    void set_folate(Double quantity);

    /**
     * Get niacin (mg)
     *
     * @return Double
     */
    Double get_niacin();

    /**
     * Get niacin coefficient (mg of niacin / g of food)
     *
     * @return Double
     */
    Double get_niacin_coefficient();

    /**
     * Set niacin (mg)
     *
     * @param quantity
     */
    void set_niacin(Double quantity);

    /**
     * Get pantothenic acid (mg)
     *
     * @return Double
     */
    Double get_pantothenic_acid();

    /**
     * Get pantothenic acid coefficient (mg of pantothenic acid / g of food)
     *
     * @return Double
     */
    Double get_pantothenic_acid_coefficient();

    /**
     * Set pantothenic acid (mg)
     *
     * @param quantity
     */
    void set_pantothenic_acid(Double quantity);

    /**
     * Get riboflavin (mg)
     *
     * @return Double
     */
    Double get_riboflavin();

    /**
     * Get riboflavin coefficient (mg of riboflavin / g of food)
     *
     * @return Double
     */
    Double get_riboflavin_coefficient();

    /**
     * Set riboflavin (mg)
     *
     * @param quantity
     */
    void set_riboflavin(Double quantity);

    /**
     * Get thiamin (mg)
     *
     * @return Double
     */
    Double get_thiamin();

    /**
     * Get thiamin coefficient (mg of thiamin / g of food)
     *
     * @return Double
     */
    Double get_thiamin_coefficient();

    /**
     * Set thiamin (mg)
     *
     * @param quantity
     */
    void set_thiamin(Double quantity);

    /**
     * Get vitamin a (µg)
     *
     * @return Double
     */
    Double get_vitamin_a();

    /**
     * Get vitamin a coefficient (µg of vitamin a / g of food)
     *
     * @return Double
     */
    Double get_vitamin_a_coefficient();

    /**
     * Set vitamin a (µg)
     *
     * @param quantity
     */
    void set_vitamin_a(Double quantity);

    /**
     * Get vitamin b12 (µg)
     *
     * @return Double
     */
    Double get_vitamin_b12();

    /**
     * Get vitamin b12 coefficient (µg of vitamin b12 / g of food)
     *
     * @return Double
     */
    Double get_vitamin_b12_coefficient();

    /**
     * Set vitaming b12 (µg)
     *
     * @param quantity
     */
    void set_vitamin_b12(Double quantity);

    /**
     * Get vitamin b6 (mg)
     *
     * @return Double
     */
    Double get_vitamin_b6();

    /**
     * Get vitamin b6 coefficient (mg of vitamin b6 / g of food)
     *
     * @return Double
     */
    Double get_vitamin_b6_coefficient();

    /**
     * Set vitamin b6 (mg)
     *
     * @param quantity
     */
    void set_vitamin_b6(Double quantity);

    /**
     * Get vitamin c (mg)
     *
     * @return Double
     */
    Double get_vitamin_c();

    /**
     * Get vitamin c coefficient (mg of vitamin c / g of food)
     *
     * @return Double
     */
    Double get_vitamin_c_coefficient();

    /**
     * Set vitamin c (mg)
     *
     * @param quantity
     */
    void set_vitamin_c(Double quantity);

    /**
     * Get vitamin d (µg)
     *
     * @return Double
     */
    Double get_vitamin_d();

    /**
     * Get vitamin d coefficient (µg of vitamin d / g of food)
     *
     * @return Double
     */
    Double get_vitamin_d_coefficient();

    /**
     * Set vitamin d (µg)
     *
     * @param quantity
     */
    void set_vitamin_d(Double quantity);

    /**
     * Get vitamin e (mg)
     *
     * @return Double
     */
    Double get_vitamin_e();

    /**
     * Get vitamin e coefficient (mg of vitamin e / g of food)
     *
     * @return Double
     */
    Double get_vitamin_e_coefficient();

    /**
     * Set vitamin e (mg)
     *
     * @param quantity
     */
    void set_vitamin_e(Double quantity);

    /**
     * Get vitamin k (µg)
     *
     * @return Double
     */
    Double get_vitamin_k();

    /**
     * Get vitamin k coefficient (µg of vitamin k / g of food)
     *
     * @return Double
     */
    Double get_vitamin_k_coefficient();

    /**
     * Set vitamin k (µg)
     *
     * @param quantity
     */
    void set_vitamin_k(Double quantity);

    /**
     * Get choline (mg)
     *
     * @return Double
     */
    Double get_choline();

    /**
     * Get choline coefficient (mg of choline / g of food)
     *
     * @return Double
     */
    Double get_choline_coefficient();

    /**
     * Set choline (mg)
     *
     * @param quantity
     */
    void set_choline(Double quantity);

    //glycemic
    /**
     * Get glycemic index (0-100)
     * <p>
     * Glycemic index is total glucose exposure delivered by test food (in two
     * hours) divided by total glucose exposure delivered by standard food (in
     * two hours) multiplied by 100. Either 50 g of glucose or white bread are
     * used as the standard. It is a percentage of standard.
     *
     * @return Double
     */
    Double get_glycemic_index();

    /**
     * Set glycemic index (0-100)
     * <p>
     * Glycemic index is total glucose exposure delivered by test food (in two
     * hours) divided by total glucose exposure delivered by standard food (in
     * two hours) multiplied by 100. Either 50 g of glucose or white bread are
     * used as the standard. It is a percentage of standard.
     *
     * @param quantity
     */
    void set_glycemic_index(Double quantity);

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

    //omega-3
    /**
     * Get alpha-linolenic acid (g)
     *
     * @return Double
     */
    Double get_alpha_linolenic_acid();

    /**
     * Get alpha-linolenic acid coefficient (g of alpha-linolenic acid / g of
     * food)
     *
     * @return Double
     */
    Double get_alphalinolenic_acid_coefficient();

    /**
     * Set alpha-linolenic acid (g)
     *
     * @param quantity
     */
    void set_alpha_linolenic_acid(Double quantity);

    /**
     * Get linoleic acid (g)
     *
     * @return Double
     */
    Double get_linoleic_acid();

    /**
     * Get linoleic acid coefficient (g of linoleic acid / g of food)
     *
     * @return Double
     */
    Double get_linoleic_acid_coefficient();

    /**
     * Set linoleic acid (g)
     *
     * @param quantity
     */
    void set_linoleic_acid(Double quantity);

    /**
     * Get docosahexaenoic acid "dha" (g)
     *
     * @return Double
     */
    Double get_dha();

    /**
     * Get docosahexaenoic acid "dha" coefficient (g of dha / g of food)
     *
     * @return Double
     */
    Double get_dha_coefficient();

    /**
     * Set docosahexaenoic acid "dha" (g)
     *
     * @param quantity
     */
    void set_dha(Double quantity);

    /**
     * Get eicosapentaenoic acid "epa" (g)
     *
     * @return Double
     */
    Double get_epa();

    /**
     * Get eicosapentaenoic acid "epa" coefficient (g of epa / g of food)
     *
     * @return Double
     */
    Double get_epa_coefficient();

    /**
     * Set eicosapentaenoic acid "epa" (g)
     *
     * @param quantity
     */
    void set_epa(Double quantity);

    //water
    /**
     * Get water (g)
     *
     * @return Double
     */
    Double get_water();

    /**
     * Get water coefficient (g of water / g of food)
     *
     * @return Double
     */
    Double get_water_coefficient();

    /**
     * Set water (g)
     *
     * @param quantity
     */
    void set_water(Double quantity);

    //cost
    /**
     * Get cost ($)
     *
     * @return Double
     */
    Double get_cost();

    /**
     * Get cost coefficient ($ / g of food)
     *
     * @return Double
     */
    Double get_cost_coefficient();

    /**
     * Set cost ($)
     *
     * @param quantity
     */
    void set_cost(Double quantity);

    //calculated energy
    /**
     * Get energy provided by alcohol (Kcal)
     *
     * @return Double
     */
    Double get_energy_alcohol();

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
    Double get_energy_digestible_carbohydrate();

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
    Double get_energy_digestible();

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
    Double get_energy_fat();

    /**
     * Get energy provided by total fat coefficient (Kcal / g of food)
     *
     * @return Double
     */
    Double get_energy_fat_coefficient();

    /**
     * Get energy provided by total fat and digestible carbohydrates (Kcal)
     *
     * @return Double
     */
    Double get_energy_no_protein();

    /**
     * Get energy provided by total fat and digestible carbohydrates coefficient
     * (Kcal / g of food)
     *
     * @return Double
     */
    Double get_energy_no_protein_coefficient();

    /**
     * Get energy provided by protein (Kcal)
     *
     * @return Double
     */
    Double get_energy_protein();

    /**
     * Get energy provide by protein coefficient (Kcal / g of food)
     *
     * @return Double
     */
    Double get_energy_protein_coefficient();

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
