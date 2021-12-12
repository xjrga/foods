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
 * This interface defines a dietary reference intakes
 *
 */
public interface Dri {

    /**
     *
     * @return
     */
    Integer get_lifestage_id();

    /**
     *
     * @param lifestage_id
     */
    void set_lifestage_id(Integer lifestage_id);

    /**
     *
     * @return
     */
    String get_lifestage_label();

    /**
     *
     * @param lifestage_label
     */
    void set_lifestage_label(String lifestage_label);

    /**
     *
     * @return
     */
    Double get_calcium_lower();

    /**
     *
     * @param quantity
     */
    void set_calcium_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_choline_lower();

    /**
     *
     * @param quantity
     */
    void set_choline_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_copper_lower();

    /**
     *
     * @param quantity
     */
    void set_copper_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_fluoride_lower();

    /**
     *
     * @param quantity
     */
    void set_fluoride_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_folate_lower();

    /**
     *
     * @param quantity
     */
    void set_folate_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_iron_lower();

    /**
     *
     * @param quantity
     */
    void set_iron_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_magnesium_lower();

    /**
     *
     * @param quantity
     */
    void set_magnesium_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_manganese_lower();

    /**
     *
     * @param quantity
     */
    void set_manganese_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_niacin_lower();

    /**
     *
     * @param quantity
     */
    void set_niacin_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_pantothenic_acid_lower();

    /**
     *
     * @param quantity
     */
    void set_pantothenic_acid_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_phosphorus_lower();

    /**
     *
     * @param quantity
     */
    void set_phosphorus_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_potassium_lower();

    /**
     *
     * @param quantity
     */
    void set_potassium_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_riboflavin_lower();

    /**
     *
     * @param quantity
     */
    void set_riboflavin_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_selenium_lower();

    /**
     *
     * @param quantity
     */
    void set_selenium_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_sodium_lower();

    /**
     *
     * @param quantity
     */
    void set_sodium_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_thiamin_lower();

    /**
     *
     * @param quantity
     */
    void set_thiamin_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_a_lower();

    /**
     *
     * @param quantity
     */
    void set_vitamin_a_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_b12_lower();

    /**
     *
     * @param quantity
     */
    void set_vitamin_b12_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_b6_lower();

    /**
     *
     * @param quantity
     */
    void set_vitamin_b6_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_c_lower();

    /**
     *
     * @param quantity
     */
    void set_vitamin_c_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_d_lower();

    /**
     *
     * @param quantity
     */
    void set_vitamin_d_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_e_lower();

    /**
     *
     * @param quantity
     */
    void set_vitamin_e_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_k_lower();

    /**
     *
     * @param quantity
     */
    void set_vitamin_k_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_zinc_lower();

    /**
     *
     * @param quantity
     */
    void set_zinc_lower(Double quantity);

    /**
     *
     * @return
     */
    Double get_calcium_upper();

    /**
     *
     * @param quantity
     */
    void set_calcium_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_choline_upper();

    /**
     *
     * @param quantity
     */
    void set_choline_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_copper_upper();

    /**
     *
     * @param quantity
     */
    void set_copper_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_fluoride_upper();

    /**
     *
     * @param quantity
     */
    void set_fluoride_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_folate_upper();

    /**
     *
     * @param quantity
     */
    void set_folate_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_iron_upper();

    /**
     *
     * @param quantity
     */
    void set_iron_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_magnesium_upper();

    /**
     *
     * @param quantity
     */
    void set_magnesium_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_manganese_upper();

    /**
     *
     * @param quantity
     */
    void set_manganese_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_niacin_upper();

    /**
     *
     * @param quantity
     */
    void set_niacin_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_pantothenic_acid_upper();

    /**
     *
     * @param quantity
     */
    void set_pantothenic_acid_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_phosphorus_upper();

    /**
     *
     * @param quantity
     */
    void set_phosphorus_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_potassium_upper();

    /**
     *
     * @param quantity
     */
    void set_potassium_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_riboflavin_upper();

    /**
     *
     * @param quantity
     */
    void set_riboflavin_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_selenium_upper();

    /**
     *
     * @param quantity
     */
    void set_selenium_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_sodium_upper();

    /**
     *
     * @param quantity
     */
    void set_sodium_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_thiamin_upper();

    /**
     *
     * @param quantity
     */
    void set_thiamin_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_a_upper();

    /**
     *
     * @param quantity
     */
    void set_vitamin_a_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_b12_upper();

    /**
     *
     * @param quantity
     */
    void set_vitamin_b12_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_b6_upper();

    /**
     *
     * @param quantity
     */
    void set_vitamin_b6_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_c_upper();

    /**
     *
     * @param quantity
     */
    void set_vitamin_c_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_d_upper();

    /**
     *
     * @param quantity
     */
    void set_vitamin_d_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_e_upper();

    /**
     *
     * @param quantity
     */
    void set_vitamin_e_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_vitamin_k_upper();

    /**
     *
     * @param quantity
     */
    void set_vitamin_k_upper(Double quantity);

    /**
     *
     * @return
     */
    Double get_zinc_upper();

    /**
     *
     * @param quantity
     */
    void set_zinc_upper(Double quantity);

}

//Dietary Reference Intakes - Summary Tables
//https://www.ncbi.nlm.nih.gov/books/NBK56068/
