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
 * Food interface
 *
 */
public interface Food {

    //id
    void set_food_name(String name);

    String get_food_name();

    void set_food_label(String label);

    String get_food_label();

    //weight
    Double get_weight();

    void set_weight(Double quantity);

    //energy
    Double get_energy_gross();

    Double get_energy_gross_coefficient();

    void set_gross_energy(Double quantity);

    //Macronutrients
    Double get_protein();

    Double get_protein_coefficient();

    Double get_protein_atwater_factor();

    void set_protein(Double quantity);

    void set_protein_atwater_factor(Double quantity);

    Double get_carbohydrate_by_difference();

    Double get_carbohydrate_by_difference_coefficient();

    Double get_carbohydrate_by_difference_atwater_factor();

    void set_carbohydrate_by_difference(Double quantity);

    void set_carbohydrate_by_difference_atwater_factor(Double quantity);

    Double get_fiber();

    Double get_fiber_coefficient();

    void set_fiber(Double quantity);

    //Calculate digestible carbs from carbohydrate_by_difference and fiber
    Double get_fat();

    Double get_fat_coefficient();

    Double get_fat_atwater_factor();

    void set_fat(Double quantity);

    void set_fat_atwater_factor(Double quantity);

    Double get_alcohol();

    Double get_alcohol_coefficient();

    Double get_alcohol_atwater_factor();

    void set_alcohol(Double quantity);

    void set_alcohol_atwater_factor(Double quantity);

    //calculated carbs
    Double get_digestible_carbohydrate();

    Double get_digestible_carbs_coefficient();

    //Fats
    Double get_cholesterol();

    Double get_cholesterol_coefficient();

    void set_cholesterol(Double quantity);

    Double get_monounsaturated_fat();

    Double get_monounsaturated_fat_coefficient();

    void set_monounsaturated_fat(Double quantity);

    Double get_polyunsaturated_fat();

    Double get_polyunsaturated_fat_coefficient();

    void set_polyunsaturated_fat(Double quantity);

    Double get_saturated_fat();

    Double get_saturated_fat_coefficient();

    void set_saturated_fat(Double quantity);

    //protein
    Double get_complete_protein();

    Double get_complete_protein_coefficient();

    void set_complete_protein(Double quantity);

    //minerals
    Double get_calcium();

    Double get_calcium_coefficient();

    void set_calcium(Double quantity);

    Double get_copper();

    Double get_copper_coefficient();

    void set_copper(Double quantity);

    Double get_fluoride();

    Double get_fluoride_coefficient();

    void set_fluoride(Double quantity);

    Double get_iron();

    Double get_iron_coefficient();

    void set_iron(Double quantity);

    Double get_magnesium();

    Double get_magnesium_coefficient();

    void set_magnesium(Double quantity);

    Double get_manganese();

    Double get_manganese_coefficient();

    void set_manganese(Double quantity);

    Double get_phosphorus();

    Double get_phosphorus_coefficient();

    void set_phosphorus(Double quantity);

    Double get_potassium();

    Double get_potassium_coefficient();

    void set_potassium(Double quantity);

    Double get_selenium();

    Double get_selenium_coefficient();

    void set_selenium(Double quantity);

    Double get_sodium();

    Double get_sodium_coefficient();

    void set_sodium(Double quantity);

    Double get_zinc();

    Double get_zinc_coefficient();

    void set_zinc(Double quantity);

    //vitamins
    Double get_folate();

    Double get_folate_coefficient();

    void set_folate(Double quantity);

    Double get_niacin();

    Double get_niacin_coefficient();

    void set_niacin(Double quantity);

    Double get_pantothenic_acid();

    Double get_pantothenic_acid_coefficient();

    void set_pantothenic_acid(Double quantity);

    Double get_riboflavin();

    Double get_riboflavin_coefficient();

    void set_riboflavin(Double quantity);

    Double get_thiamin();

    Double get_thiamin_coefficient();

    void set_thiamin(Double quantity);

    Double get_vitamin_a();

    Double get_vitamin_a_coefficient();

    void set_vitamin_a(Double quantity);

    Double get_vitamin_b12();

    Double get_vitamin_b12_coefficient();

    void set_vitamin_b12(Double quantity);

    Double get_vitamin_b6();

    Double get_vitamin_b6_coefficient();

    void set_vitamin_b6(Double quantity);

    Double get_vitamin_c();

    Double get_vitamin_c_coefficient();

    void set_vitamin_c(Double quantity);

    Double get_vitamin_d();

    Double get_vitamin_d_coefficient();

    void set_vitamin_d(Double quantity);

    Double get_vitamin_e();

    Double get_vitamin_e_coefficient();

    void set_vitamin_e(Double quantity);

    Double get_vitamin_k();

    Double get_vitamin_k_coefficient();

    void set_vitamin_k(Double quantity);

    Double get_choline();

    Double get_choline_coefficient();

    void set_choline(Double quantity);

    //glycemic
    Double get_glycemic_index();

    void set_glycemic_index(Double quantity);

    Double get_glycemic_load();

    Double get_glycemic_load_coefficient();

    //omega-3
    Double get_alpha_linolenic_acid();

    Double get_alphalinolenic_acid_coefficient();

    void set_alpha_linolenic_acid(Double quantity);

    Double get_linoleic_acid();

    Double get_linoleic_acid_coefficient();

    void set_linoleic_acid(Double quantity);

    Double get_dha();

    Double get_dha_coefficient();

    void set_dha(Double quantity);

    Double get_epa();

    Double get_epa_coefficient();

    void set_epa(Double quantity);

    //water
    Double get_water();

    Double get_water_coefficient();

    void set_water(Double quantity);

    //cost
    Double get_cost();

    Double get_cost_coefficient();

    void set_cost(Double quantity);

    //calculated energy
    Double get_energy_alcohol();

    Double get_energy_alcohol_coefficient();

    Double get_energy_digestible_carbohydrate();

    Double get_energy_digestible_carbohydrate_coefficient();

    Double get_energy_digestible();

    Double get_energy_digestible_coefficient();

    Double get_energy_fat();

    Double get_energy_fat_coefficient();

    Double get_energy_no_protein();

    Double get_energy_no_protein_coefficient();

    Double get_energy_protein();

    Double get_energy_protein_coefficient();

}

//https://www.fao.org/3/y5022e/y5022e04.htm
//https://www.ars.usda.gov/ARSUserFiles/80400525/Data/Classics/ah74.pdf
//https://en.wikipedia.org/wiki/Atwater_system
//https://academic.oup.com/ajcn/article/86/6/1649/4649752
//https://en.wikipedia.org/wiki/Glycemic_index
