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
 * This is a read only food object implementation example
 */
public class Food_impl implements Food {

    private final Food_mutable_impl food;

    public Food_impl() {
        food = new Food_mutable_impl();
    }

    @Override
    public String get_food_name() {
        return food.get_food_name();
    }

    @Override
    public String get_food_label() {
        return food.get_food_label();
    }

    @Override
    public Double get_weight() {
        return food.get_weight();
    }

    @Override
    public Double get_energy_gross() {
        return food.get_energy_gross();
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return food.get_energy_gross_coefficient();
    }

    @Override
    public Double get_protein() {
        return food.get_protein();
    }

    @Override
    public Double get_protein_coefficient() {
        return food.get_protein_coefficient();
    }

    @Override
    public Double get_protein_atwater_factor() {
        return food.get_protein_atwater_factor();
    }

    @Override
    public Double get_carbohydrate_by_difference() {
        return food.get_carbohydrate_by_difference();
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return food.get_carbohydrate_by_difference_coefficient();
    }

    @Override
    public Double get_carbohydrate_by_difference_atwater_factor() {
        return food.get_carbohydrate_by_difference_atwater_factor();
    }

    @Override
    public Double get_fiber() {
        return food.get_fiber();
    }

    @Override
    public Double get_fiber_coefficient() {
        return food.get_fiber_coefficient();
    }

    @Override
    public Double get_fat() {
        return food.get_fat();
    }

    @Override
    public Double get_fat_coefficient() {
        return food.get_fat_coefficient();
    }

    @Override
    public Double get_fat_atwater_factor() {
        return food.get_fat_atwater_factor();
    }

    @Override
    public Double get_alcohol() {
        return food.get_alcohol();
    }

    @Override
    public Double get_alcohol_coefficient() {
        return food.get_alcohol_coefficient();
    }

    @Override
    public Double get_alcohol_atwater_factor() {
        return food.get_alcohol_atwater_factor();
    }

    @Override
    public Double get_digestible_carbohydrate() {
        return food.get_digestible_carbohydrate();
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return food.get_digestible_carbohydrate_coefficient();
    }

    @Override
    public Double get_cholesterol() {
        return food.get_cholesterol();
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return food.get_cholesterol_coefficient();
    }

    @Override
    public Double get_monounsaturated_fat() {
        return food.get_monounsaturated_fat();
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return food.get_monounsaturated_fat_coefficient();
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return food.get_polyunsaturated_fat();
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return food.get_polyunsaturated_fat_coefficient();
    }

    @Override
    public Double get_saturated_fat() {
        return food.get_saturated_fat();
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return food.get_saturated_fat_coefficient();
    }

    @Override
    public Double get_complete_protein() {
        return food.get_complete_protein();
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return food.get_complete_protein_coefficient();
    }

    @Override
    public Double get_calcium() {
        return food.get_calcium();
    }

    @Override
    public Double get_calcium_coefficient() {
        return food.get_calcium_coefficient();
    }

    @Override
    public Double get_copper() {
        return food.get_copper();
    }

    @Override
    public Double get_copper_coefficient() {
        return food.get_copper_coefficient();
    }

    @Override
    public Double get_fluoride() {
        return food.get_fluoride();
    }

    @Override
    public Double get_fluoride_coefficient() {
        return food.get_fluoride_coefficient();
    }

    @Override
    public Double get_iron() {
        return food.get_iron();
    }

    @Override
    public Double get_iron_coefficient() {
        return food.get_iron_coefficient();
    }

    @Override
    public Double get_magnesium() {
        return food.get_magnesium();
    }

    @Override
    public Double get_magnesium_coefficient() {
        return food.get_magnesium_coefficient();
    }

    @Override
    public Double get_manganese() {
        return food.get_manganese();
    }

    @Override
    public Double get_manganese_coefficient() {
        return food.get_manganese_coefficient();
    }

    @Override
    public Double get_phosphorus() {
        return food.get_phosphorus();
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return food.get_phosphorus_coefficient();
    }

    @Override
    public Double get_potassium() {
        return food.get_potassium();
    }

    @Override
    public Double get_potassium_coefficient() {
        return food.get_potassium_coefficient();
    }

    @Override
    public Double get_selenium() {
        return food.get_selenium();
    }

    @Override
    public Double get_selenium_coefficient() {
        return food.get_selenium_coefficient();
    }

    @Override
    public Double get_sodium() {
        return food.get_sodium();
    }

    @Override
    public Double get_sodium_coefficient() {
        return food.get_sodium_coefficient();
    }

    @Override
    public Double get_zinc() {
        return food.get_zinc();
    }

    @Override
    public Double get_zinc_coefficient() {
        return food.get_zinc_coefficient();
    }

    @Override
    public Double get_folate() {
        return food.get_folate();
    }

    @Override
    public Double get_folate_coefficient() {
        return food.get_folate_coefficient();
    }

    @Override
    public Double get_niacin() {
        return food.get_niacin();
    }

    @Override
    public Double get_niacin_coefficient() {
        return food.get_niacin_coefficient();
    }

    @Override
    public Double get_pantothenic_acid() {
        return food.get_pantothenic_acid();
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return food.get_pantothenic_acid_coefficient();
    }

    @Override
    public Double get_riboflavin() {
        return food.get_riboflavin();
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return food.get_riboflavin_coefficient();
    }

    @Override
    public Double get_thiamin() {
        return food.get_thiamin();
    }

    @Override
    public Double get_thiamin_coefficient() {
        return food.get_thiamin_coefficient();
    }

    @Override
    public Double get_vitamin_a() {
        return food.get_vitamin_a();
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return food.get_vitamin_a_coefficient();
    }

    @Override
    public Double get_vitamin_b12() {
        return food.get_vitamin_b12();
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return food.get_vitamin_b12_coefficient();
    }

    @Override
    public Double get_vitamin_b6() {
        return food.get_vitamin_b6();
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return food.get_vitamin_b6_coefficient();
    }

    @Override
    public Double get_vitamin_c() {
        return food.get_vitamin_c();
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return food.get_vitamin_c_coefficient();
    }

    @Override
    public Double get_vitamin_d() {
        return food.get_vitamin_d();
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return food.get_vitamin_d_coefficient();
    }

    @Override
    public Double get_vitamin_e() {
        return food.get_vitamin_e();
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return food.get_vitamin_e_coefficient();
    }

    @Override
    public Double get_vitamin_k() {
        return food.get_vitamin_k();
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return food.get_vitamin_k_coefficient();
    }

    @Override
    public Double get_choline() {
        return food.get_choline();
    }

    @Override
    public Double get_choline_coefficient() {
        return food.get_choline_coefficient();
    }

    @Override
    public Double get_glycemic_index() {
        return food.get_glycemic_index();
    }

    @Override
    public Double get_glycemic_load() {
        return food.get_glycemic_load();
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return food.get_glycemic_load_coefficient();
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return food.get_alpha_linolenic_acid();
    }

    @Override
    public Double get_alphalinolenic_acid_coefficient() {
        return food.get_alphalinolenic_acid_coefficient();
    }

    @Override
    public Double get_linoleic_acid() {
        return food.get_linoleic_acid();
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return food.get_linoleic_acid_coefficient();
    }

    @Override
    public Double get_dha() {
        return food.get_dha();
    }

    @Override
    public Double get_dha_coefficient() {
        return food.get_dha_coefficient();
    }

    @Override
    public Double get_epa() {
        return food.get_epa();
    }

    @Override
    public Double get_epa_coefficient() {
        return food.get_epa_coefficient();
    }

    @Override
    public Double get_water() {
        return food.get_water();
    }

    @Override
    public Double get_water_coefficient() {
        return food.get_water_coefficient();
    }

    @Override
    public Double get_cost() {
        return food.get_cost();
    }

    @Override
    public Double get_cost_coefficient() {
        return food.get_cost_coefficient();
    }

    @Override
    public Double get_energy_alcohol() {
        return food.get_energy_alcohol();
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return food.get_energy_alcohol_coefficient();
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return food.get_energy_digestible_carbohydrate();
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return food.get_energy_digestible_carbohydrate_coefficient();
    }

    @Override
    public Double get_energy_digestible() {
        return food.get_energy_digestible();
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return food.get_energy_digestible_coefficient();
    }

    @Override
    public Double get_energy_fat() {
        return food.get_energy_fat();
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return food.get_energy_fat_coefficient();
    }

    @Override
    public Double get_energy_no_protein() {
        return food.get_energy_no_protein();
    }

    @Override
    public Double get_energy_no_protein_coefficient() {
        return food.get_energy_no_protein_coefficient();
    }

    @Override
    public Double get_energy_protein() {
        return food.get_energy_protein();
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return food.get_energy_protein_coefficient();
    }

    @Override
    public Double get_food_quotient() {
        return food.get_food_quotient();
    }

    private class Food_mutable_impl extends Food_abstract {

        /**
         * Constructs a food item
         */
        public Food_mutable_impl() {
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

}
