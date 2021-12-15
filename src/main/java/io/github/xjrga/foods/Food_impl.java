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
 * This is a food implementation example. Weight and nutrient amounts are
 * directly proportional. If weight changes, nutrient amounts must change
 * proportionally.
 */
public class Food_impl extends Abstract_food {

    /**
     * Constructs a food item
     */
    public Food_impl() {
        set_food_name("");
        set_food_label("");
        //Weight (g)
        set_weight(0.0);
        //Energy, gross (Kcal)
        set_gross_energy(0.0);
        //Protein (g)
        set_protein(0.0);
        //Carbohydrate, by difference (g)
        set_carbohydrate_by_difference(0.0);
        //Fiber, total dietary (g)
        set_fiber(0.0);
        //Total lipid (Fat) (g)
        set_fat(0.0);
        //Alcohol, ethyl (g)
        set_alcohol(0.0);
        //Cholesterol (mg)
        set_cholesterol(0.0);
        //Fatty acids, total monounsaturated (g)
        set_monounsaturated_fat(0.0);
        //Fatty acids, total polyunsaturated (g)
        set_polyunsaturated_fat(0.0);
        //Fatty acids, total saturated (g)
        set_saturated_fat(0.0);
        //Complete Protein (g)
        set_complete_protein(0.0);
        //Calcium, Ca (mg)
        set_calcium(0.0);
        //Copper, Cu (mg)
        set_copper(0.0);
        //Fluoride, F (µg)
        set_fluoride(0.0);
        //Iron, Fe (mg)
        set_iron(0.0);
        //Magnesium, Mg (mg)
        set_magnesium(0.0);
        //Manganese, Mn (mg)
        set_manganese(0.0);
        //Phosphorus, P (mg)
        set_phosphorus(0.0);
        //Potassium, K (mg)
        set_potassium(0.0);
        //Selenium, Se (µg)
        set_selenium(0.0);
        //Sodium, Na (mg)
        set_sodium(0.0);
        //Zinc, Zn (mg)
        set_zinc(0.0);
        //Folate, DFE (µg)
        set_folate(0.0);
        //Niacin (mg)
        set_niacin(0.0);
        //Pantothenic acid (mg)
        set_pantothenic_acid(0.0);
        //Riboflavin (mg)
        set_riboflavin(0.0);
        //Thiamin (mg)
        set_thiamin(0.0);
        //Vitamin A, RAE (µg)
        set_vitamin_a(0.0);
        //Vitamin B-12 (µg)
        set_vitamin_b12(0.0);
        //Vitamin B-6 (mg)
        set_vitamin_b6(0.0);
        //Vitamin C, total (Ascorbic Acid) (mg)
        set_vitamin_c(0.0);
        //Vitamin D (D2 + D3) (µg)
        set_vitamin_d(0.0);
        //Vitamin E (Alpha-Tocopherol) (mg)
        set_vitamin_e(0.0);
        //Vitamin K (Phylloquinone) (µg)
        set_vitamin_k(0.0);
        //Choline, total (mg)
        set_choline(0.0);
        //-
        set_glycemic_index(0.0);
        //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
        set_alpha_linolenic_acid(0.0);
        //18:2 n-6 c,c (Linoleic) (g)
        set_linoleic_acid(0.0);
        //22:6 n-3 (DHA) (g)
        set_dha(0.0);
        //20:5 n-3 (EPA) (g)
        set_epa(0.0);
        //Water (g)
        set_water(0.0);
        //$
        set_cost(0.0);
    }

}
