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
 * This is a read only dietary reference intake object implementation example
 */
public class Dri_impl implements Dri {

    private final Dri_mutable_impl dri;

    /**
     * Constructs a dri item
     */
    public Dri_impl() {
        dri = new Dri_mutable_impl();
    }

    @Override
    public Integer get_lifestage_id() {
        return dri.get_lifestage_id();
    }

    @Override
    public String get_lifestage_label() {
        return dri.get_lifestage_label();
    }

    @Override
    public Double get_calcium_lower() {
        return dri.get_calcium_lower();
    }

    @Override
    public Double get_choline_lower() {
        return dri.get_choline_lower();
    }

    @Override
    public Double get_copper_lower() {
        return dri.get_copper_lower();
    }

    @Override
    public Double get_fluoride_lower() {
        return dri.get_fluoride_lower();
    }

    @Override
    public Double get_folate_lower() {
        return dri.get_folate_lower();
    }

    @Override
    public Double get_iron_lower() {
        return dri.get_iron_lower();
    }

    @Override
    public Double get_magnesium_lower() {
        return dri.get_magnesium_lower();
    }

    @Override
    public Double get_manganese_lower() {
        return dri.get_manganese_lower();
    }

    @Override
    public Double get_niacin_lower() {
        return dri.get_niacin_lower();
    }

    @Override
    public Double get_pantothenic_acid_lower() {
        return dri.get_pantothenic_acid_lower();
    }

    @Override
    public Double get_phosphorus_lower() {
        return dri.get_phosphorus_lower();
    }

    @Override
    public Double get_potassium_lower() {
        return dri.get_potassium_lower();
    }

    @Override
    public Double get_riboflavin_lower() {
        return dri.get_riboflavin_lower();
    }

    @Override
    public Double get_selenium_lower() {
        return dri.get_selenium_lower();
    }

    @Override
    public Double get_sodium_lower() {
        return dri.get_sodium_lower();
    }

    @Override
    public Double get_thiamin_lower() {
        return dri.get_thiamin_lower();
    }

    @Override
    public Double get_vitamin_a_lower() {
        return dri.get_vitamin_a_lower();
    }

    @Override
    public Double get_vitamin_b12_lower() {
        return dri.get_vitamin_b12_lower();
    }

    @Override
    public Double get_vitamin_b6_lower() {
        return dri.get_vitamin_b6_lower();
    }

    @Override
    public Double get_vitamin_c_lower() {
        return dri.get_vitamin_c_lower();
    }

    @Override
    public Double get_vitamin_d_lower() {
        return dri.get_vitamin_d_lower();
    }

    @Override
    public Double get_vitamin_e_lower() {
        return dri.get_vitamin_e_lower();
    }

    @Override
    public Double get_vitamin_k_lower() {
        return dri.get_vitamin_k_lower();
    }

    @Override
    public Double get_zinc_lower() {
        return dri.get_zinc_lower();
    }

    @Override
    public Double get_calcium_upper() {
        return dri.get_calcium_upper();
    }

    @Override
    public Double get_choline_upper() {
        return dri.get_choline_upper();
    }

    @Override
    public Double get_copper_upper() {
        return dri.get_copper_upper();
    }

    @Override
    public Double get_fluoride_upper() {
        return dri.get_fluoride_upper();
    }

    @Override
    public Double get_folate_upper() {
        return dri.get_folate_upper();
    }

    @Override
    public Double get_iron_upper() {
        return dri.get_iron_upper();
    }

    @Override
    public Double get_magnesium_upper() {
        return dri.get_magnesium_upper();
    }

    @Override
    public Double get_manganese_upper() {
        return dri.get_manganese_upper();
    }

    @Override
    public Double get_niacin_upper() {
        return dri.get_niacin_upper();
    }

    @Override
    public Double get_pantothenic_acid_upper() {
        return dri.get_pantothenic_acid_upper();
    }

    @Override
    public Double get_phosphorus_upper() {
        return dri.get_phosphorus_upper();
    }

    @Override
    public Double get_potassium_upper() {
        return dri.get_potassium_upper();
    }

    @Override
    public Double get_riboflavin_upper() {
        return dri.get_riboflavin_upper();
    }

    @Override
    public Double get_selenium_upper() {
        return dri.get_selenium_upper();
    }

    @Override
    public Double get_sodium_upper() {
        return dri.get_sodium_upper();
    }

    @Override
    public Double get_thiamin_upper() {
        return dri.get_thiamin_upper();
    }

    @Override
    public Double get_vitamin_a_upper() {
        return dri.get_vitamin_a_upper();
    }

    @Override
    public Double get_vitamin_b12_upper() {
        return dri.get_vitamin_b12_upper();
    }

    @Override
    public Double get_vitamin_b6_upper() {
        return dri.get_vitamin_b6_upper();
    }

    @Override
    public Double get_vitamin_c_upper() {
        return dri.get_vitamin_c_upper();
    }

    @Override
    public Double get_vitamin_d_upper() {
        return dri.get_vitamin_d_upper();
    }

    @Override
    public Double get_vitamin_e_upper() {
        return dri.get_vitamin_e_upper();
    }

    @Override
    public Double get_vitamin_k_upper() {
        return dri.get_vitamin_k_upper();
    }

    @Override
    public Double get_zinc_upper() {
        return dri.get_zinc_upper();
    }

    private class Dri_mutable_impl extends Dri_abstract {

        /**
         * Constructs a dri item
         */
        public Dri_mutable_impl() {
            set_lifestage_id(0);
            set_lifestage_label("");
            //Calcium, Ca (mg)
            set_calcium_lower(0.0);
            //Choline, total (mg)
            set_choline_lower(0.0);
            //Copper, Cu (mg)
            set_copper_lower(0.0);
            //Fluoride, F (µg)
            set_fluoride_lower(0.0);
            //Folate, DFE (µg)
            set_folate_lower(0.0);
            //Iron, Fe (mg)
            set_iron_lower(0.0);
            //Magnesium, Mg (mg)
            set_magnesium_lower(0.0);
            //Manganese, Mn (mg)
            set_manganese_lower(0.0);
            //Niacin (mg)
            set_niacin_lower(0.0);
            //Pantothenic acid (mg)
            set_pantothenic_acid_lower(0.0);
            //Phosphorus, P (mg)
            set_phosphorus_lower(0.0);
            //Potassium, K (mg)
            set_potassium_lower(0.0);
            //Riboflavin (mg)
            set_riboflavin_lower(0.0);
            //Selenium, Se (µg)
            set_selenium_lower(0.0);
            //Sodium, Na (mg)
            set_sodium_lower(0.0);
            //Thiamin (mg)
            set_thiamin_lower(0.0);
            //Vitamin A, RAE (µg)
            set_vitamin_a_lower(0.0);
            //Vitamin B-12 (µg)
            set_vitamin_b12_lower(0.0);
            //Vitamin B-6 (mg)
            set_vitamin_b6_lower(0.0);
            //Vitamin C, total (Ascorbic Acid) (mg)
            set_vitamin_c_lower(0.0);
            //Vitamin D (D2 + D3) (µg)
            set_vitamin_d_lower(0.0);
            //Vitamin E (Alpha-Tocopherol) (mg)
            set_vitamin_e_lower(0.0);
            //Vitamin K (Phylloquinone) (µg)
            set_vitamin_k_lower(0.0);
            //Zinc, Zn (mg)
            set_zinc_lower(0.0);
            //Calcium, Ca (mg)
            set_calcium_upper(0.0);
            //Choline, total (mg)
            set_choline_upper(0.0);
            //Copper, Cu (mg)
            set_copper_upper(0.0);
            //Fluoride, F (µg)
            set_fluoride_upper(0.0);
            //Folate, DFE (µg)
            set_folate_upper(0.0);
            //Iron, Fe (mg)
            set_iron_upper(0.0);
            //Magnesium, Mg (mg)
            set_magnesium_upper(0.0);
            //Manganese, Mn (mg)
            set_manganese_upper(0.0);
            //Niacin (mg)
            set_niacin_upper(0.0);
            //Pantothenic acid (mg)
            set_pantothenic_acid_upper(0.0);
            //Phosphorus, P (mg)
            set_phosphorus_upper(0.0);
            //Potassium, K (mg)
            set_potassium_upper(0.0);
            //Riboflavin (mg)
            set_riboflavin_upper(0.0);
            //Selenium, Se (µg)
            set_selenium_upper(0.0);
            //Sodium, Na (mg)
            set_sodium_upper(0.0);
            //Thiamin (mg)
            set_thiamin_upper(0.0);
            //Vitamin A, RAE (µg)
            set_vitamin_a_upper(0.0);
            //Vitamin B-12 (µg)
            set_vitamin_b12_upper(0.0);
            //Vitamin B-6 (mg)
            set_vitamin_b6_upper(0.0);
            //Vitamin C, total (Ascorbic Acid) (mg)
            set_vitamin_c_upper(0.0);
            //Vitamin D (D2 + D3) (µg)
            set_vitamin_d_upper(0.0);
            //Vitamin E (Alpha-Tocopherol) (mg)
            set_vitamin_e_upper(0.0);
            //Vitamin K (Phylloquinone) (µg)
            set_vitamin_k_upper(0.0);
            //Zinc, Zn (mg)
            set_zinc_upper(0.0);
        }

    }
}
