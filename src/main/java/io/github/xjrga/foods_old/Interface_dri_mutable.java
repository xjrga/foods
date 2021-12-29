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
package io.github.xjrga.foods_old;

/**
 * This interface is used to set dietary reference intake data
 */
public interface Interface_dri_mutable extends Interface_dri {

    /**
     * Set life stage identification number
     *
     * @param lifestage_id The life stage identification number
     */
    void set_lifestage_id(Integer lifestage_id);

    /**
     * Set life stage label
     *
     * @param lifestage_label The life stage name which uses these characters
     * A-Z, a-z 0-9, _ only
     */
    void set_lifestage_label(String lifestage_label);

    /**
     * Set calcium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_calcium_lower(Double quantity);

    /**
     * Set choline's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_choline_lower(Double quantity);

    /**
     * Set copper's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_copper_lower(Double quantity);

    /**
     * Set fluoride's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_fluoride_lower(Double quantity);

    /**
     * Set folate's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_folate_lower(Double quantity);

    /**
     * Set iron's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_iron_lower(Double quantity);

    /**
     * Set magnesium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_magnesium_lower(Double quantity);

    /**
     * Set magnanese's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_manganese_lower(Double quantity);

    /**
     * Set niacin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_niacin_lower(Double quantity);

    /**
     * Set pantothenic acid's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_pantothenic_acid_lower(Double quantity);

    /**
     * Set phosphorus's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_phosphorus_lower(Double quantity);

    /**
     * Set potassium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_potassium_lower(Double quantity);

    /**
     * Set riboflavin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_riboflavin_lower(Double quantity);

    /**
     * Set selenium's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_selenium_lower(Double quantity);

    /**
     * Set sodium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_sodium_lower(Double quantity);

    /**
     * Set thiamin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_thiamin_lower(Double quantity);

    /**
     * Set vitamin a's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_a_lower(Double quantity);

    /**
     * Set vitamin b12's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_b12_lower(Double quantity);

    /**
     * Get vitamin b6's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_b6_lower(Double quantity);

    /**
     * Set vitamin c's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_c_lower(Double quantity);

    /**
     * Set vitamin d's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_d_lower(Double quantity);

    /**
     * Set vitamin e's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_e_lower(Double quantity);

    /**
     * Set vitamin k's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_k_lower(Double quantity);

    /**
     * Get zinc's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_zinc_lower(Double quantity);

    /**
     * Set calcium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_calcium_upper(Double quantity);

    /**
     * Set choline's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_choline_upper(Double quantity);

    /**
     * Set copper's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_copper_upper(Double quantity);

    /**
     * Set flouride's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_fluoride_upper(Double quantity);

    /**
     * Set folate's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_folate_upper(Double quantity);

    /**
     * Set iron's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_iron_upper(Double quantity);

    /**
     * Set magnesium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_magnesium_upper(Double quantity);

    /**
     * Set manganese's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_manganese_upper(Double quantity);

    /**
     * Get niacin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_niacin_upper(Double quantity);

    /**
     * Set pantothenic acid's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_pantothenic_acid_upper(Double quantity);

    /**
     * Set phosphorus's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_phosphorus_upper(Double quantity);

    /**
     * Set potassium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_potassium_upper(Double quantity);

    /**
     * Set riboflavin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_riboflavin_upper(Double quantity);

    /**
     * Set selenium's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_selenium_upper(Double quantity);

    /**
     * Set sodium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_sodium_upper(Double quantity);

    /**
     * Set thiamin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_thiamin_upper(Double quantity);

    /**
     * Set vitamin a's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_a_upper(Double quantity);

    /**
     * Set vitamin b12's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_b12_upper(Double quantity);

    /**
     * Set vitamin b6's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_b6_upper(Double quantity);

    /**
     * Set vitamin c's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_c_upper(Double quantity);

    /**
     * Set vitamin d's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_d_upper(Double quantity);

    /**
     * Set vitamin e's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_e_upper(Double quantity);

    /**
     * Set vitamin k's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_k_upper(Double quantity);

    /**
     * Set zinc's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_zinc_upper(Double quantity);

}

//Dietary Reference Intakes - Summary Tables
//https://www.ncbi.nlm.nih.gov/books/NBK56068/
