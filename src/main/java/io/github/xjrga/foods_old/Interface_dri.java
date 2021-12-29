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
 * This interface is used to get dietary reference intake data
 */
public interface Interface_dri {

    /**
     * Get life stage identification number
     *
     * @return Double Integer
     */
    Integer get_lifestage_id();

    /**
     * Get life stage label
     *
     * @return Double String
     */
    String get_lifestage_label();

    /**
     * Get calcium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_calcium_lower();

    /**
     * Get choline's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_choline_lower();

    /**
     * Get copper's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_copper_lower();

    /**
     * Get fluoride's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_fluoride_lower();

    /**
     * Get folate's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_folate_lower();

    /**
     * Get iron's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_iron_lower();

    /**
     * Get magnesium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_magnesium_lower();

    /**
     * Get magnanese's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_manganese_lower();

    /**
     * Get niacin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_niacin_lower();

    /**
     * Get pantothenic acid's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_pantothenic_acid_lower();

    /**
     * Get phosphorus's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_phosphorus_lower();

    /**
     * Get potassium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_potassium_lower();

    /**
     * Get riboflavin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_riboflavin_lower();

    /**
     * Get selenium's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_selenium_lower();

    /**
     * Get sodium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_sodium_lower();

    /**
     * Get thiamin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_thiamin_lower();

    /**
     * Get vitamin a's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_a_lower();

    /**
     * Get vitamin b12's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_b12_lower();

    /**
     * Get vitamin b6's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_b6_lower();

    /**
     * Get vitamin c's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_c_lower();

    /**
     * Get vitamin d's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_d_lower();

    /**
     * Get vitamin e's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_e_lower();

    /**
     * Get vitamin k's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_k_lower();

    /**
     * Get zinc's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_zinc_lower();

    /**
     * Get calcium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_calcium_upper();

    /**
     * Get choline's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_choline_upper();

    /**
     * Get copper's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_copper_upper();

    /**
     * Get flouride's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_fluoride_upper();

    /**
     * Get folate's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_folate_upper();

    /**
     * Get iron's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_iron_upper();

    /**
     * Get magnesium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_magnesium_upper();

    /**
     * Get manganese's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_manganese_upper();

    /**
     * Set niacin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_niacin_upper();

    /**
     * Get pantothenic acid's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_pantothenic_acid_upper();

    /**
     * Get phosphorus's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_phosphorus_upper();

    /**
     * Get potassium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_potassium_upper();

    /**
     * Get riboflavin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_riboflavin_upper();

    /**
     * Get selenium's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_selenium_upper();

    /**
     * Get sodium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_sodium_upper();

    /**
     * Get thiamin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_thiamin_upper();

    /**
     * Get vitamin a's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_a_upper();

    /**
     * Get vitamin b12's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_b12_upper();

    /**
     * Get vitamin b6's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_b6_upper();

    /**
     * Get vitamin c's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_c_upper();

    /**
     * Get vitamin d's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_d_upper();

    /**
     * Get vitamin e's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_e_upper();

    /**
     * Get vitamin k's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_k_upper();

    /**
     * Get zinc's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_zinc_upper();

}

//Dietary Reference Intakes - Summary Tables
//https://www.ncbi.nlm.nih.gov/books/NBK56068/
