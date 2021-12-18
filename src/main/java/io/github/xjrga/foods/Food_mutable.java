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
 * This interface is used to set food nutrition facts data
 */
public interface Food_mutable {

    /**
     * Set food name
     *
     * @param name The name of food
     */
    void set_food_name(String name);

    /**
     * Set food label
     *
     * @param label The food name which uses these characters A-Z, a-z 0-9, _
     * only
     */
    void set_food_label(String label);

    /**
     * Set serving size weight (g)
     *
     * @param quantity
     */
    void set_weight(Double quantity);

    /**
     * Set gross energy (Kcal)
     *
     * @param quantity
     */
    void set_gross_energy(Double quantity);

    //Macronutrients
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
     * Set fiber (g)
     *
     * @param quantity
     */
    void set_fiber(Double quantity);

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

    /**
     * Set cholesterol coefficient (mg of cholesterol / g of food)
     *
     * @param quantity
     */
    void set_cholesterol(Double quantity);

    /**
     * Set monounsaturated fat (g)
     *
     * @param quantity
     */
    void set_monounsaturated_fat(Double quantity);

    /**
     * Set polyunsaturated fat (g)
     *
     * @param quantity
     */
    void set_polyunsaturated_fat(Double quantity);

    /**
     * Set saturated fat (g)
     *
     * @param quantity
     */
    void set_saturated_fat(Double quantity);

    //protein
    /**
     * Set complete protein (g)
     *
     * @param quantity
     */
    void set_complete_protein(Double quantity);

    //minerals
    /**
     * Set calcium (mg)
     *
     * @param quantity
     */
    void set_calcium(Double quantity);

    /**
     * Set copper (mg)
     *
     * @param quantity
     */
    void set_copper(Double quantity);

    /**
     * Set flouride (µg)
     *
     * @param quantity
     */
    void set_fluoride(Double quantity);

    /**
     * Set iron (mg)
     *
     * @param quantity
     */
    void set_iron(Double quantity);

    /**
     * Set magnesium (mg)
     *
     * @param quantity
     */
    void set_magnesium(Double quantity);

    /**
     * Set manganese (mg)
     *
     * @param quantity
     */
    void set_manganese(Double quantity);

    /**
     * Set phosphorus (mg)
     *
     * @param quantity
     */
    void set_phosphorus(Double quantity);

    /**
     * Set potassium (mg)
     *
     * @param quantity
     */
    void set_potassium(Double quantity);

    /**
     * Set selenium (µg)
     *
     * @param quantity
     */
    void set_selenium(Double quantity);

    /**
     * Set sodium (mg)
     *
     * @param quantity
     */
    void set_sodium(Double quantity);

    /**
     * Set zinc (mg)
     *
     * @param quantity
     */
    void set_zinc(Double quantity);

    //vitamins
    /**
     * Set folate (µg)
     *
     * @param quantity
     */
    void set_folate(Double quantity);

    /**
     * Set niacin (mg)
     *
     * @param quantity
     */
    void set_niacin(Double quantity);

    /**
     * Set pantothenic acid (mg)
     *
     * @param quantity
     */
    void set_pantothenic_acid(Double quantity);

    /**
     * Set riboflavin (mg)
     *
     * @param quantity
     */
    void set_riboflavin(Double quantity);

    /**
     * Set thiamin (mg)
     *
     * @param quantity
     */
    void set_thiamin(Double quantity);

    /**
     * Set vitamin a (µg)
     *
     * @param quantity
     */
    void set_vitamin_a(Double quantity);

    /**
     * Set vitaming b12 (µg)
     *
     * @param quantity
     */
    void set_vitamin_b12(Double quantity);

    /**
     * Set vitamin b6 (mg)
     *
     * @param quantity
     */
    void set_vitamin_b6(Double quantity);

    /**
     * Set vitamin c (mg)
     *
     * @param quantity
     */
    void set_vitamin_c(Double quantity);

    /**
     * Set vitamin d (µg)
     *
     * @param quantity
     */
    void set_vitamin_d(Double quantity);

    /**
     * Set vitamin e (mg)
     *
     * @param quantity
     */
    void set_vitamin_e(Double quantity);

    /**
     * Set vitamin k (µg)
     *
     * @param quantity
     */
    void set_vitamin_k(Double quantity);

    /**
     * Set choline (mg)
     *
     * @param quantity
     */
    void set_choline(Double quantity);

    //glycemic
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

    //omega-3
    /**
     * Set alpha-linolenic acid (g)
     *
     * @param quantity
     */
    void set_alpha_linolenic_acid(Double quantity);

    /**
     * Set linoleic acid (g)
     *
     * @param quantity
     */
    void set_linoleic_acid(Double quantity);

    /**
     * Set docosahexaenoic acid "dha" (g)
     *
     * @param quantity
     */
    void set_dha(Double quantity);

    /**
     * Set eicosapentaenoic acid "epa" (g)
     *
     * @param quantity
     */
    void set_epa(Double quantity);

    //water
    /**
     * Set water (g)
     *
     * @param quantity
     */
    void set_water(Double quantity);

    //cost
    /**
     * Set cost ($)
     *
     * @param quantity
     */
    void set_cost(Double quantity);

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
