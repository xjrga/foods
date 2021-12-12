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
 * This interface defines a dietary reference intake
 *
 */
public interface Dri {

    /**
     * Get life stage identification number
     *
     * @return Double Integer
     */
    Integer get_lifestage_id();

    /**
     * Set life stage identification number
     *
     * @param lifestage_id The life stage identification number
     */
    void set_lifestage_id(Integer lifestage_id);

    /**
     * Get life stage label
     *
     * @return Double String
     */
    String get_lifestage_label();

    /**
     * Set life stage label
     *
     * @param lifestage_label The life stage name which uses these characters
     * A-Z, a-z 0-9, _ only
     */
    void set_lifestage_label(String lifestage_label);

    /**
     * Get calcium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_calcium_lower();

    /**
     * Set calcium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_calcium_lower(Double quantity);

    /**
     * Get choline's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_choline_lower();

    /**
     * Set choline's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_choline_lower(Double quantity);

    /**
     * Get copper's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_copper_lower();

    /**
     * Set copper's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_copper_lower(Double quantity);

    /**
     * Get fluoride's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_fluoride_lower();

    /**
     * Set fluoride's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_fluoride_lower(Double quantity);

    /**
     * Get folate's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_folate_lower();

    /**
     * Set folate's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_folate_lower(Double quantity);

    /**
     * Get iron's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_iron_lower();

    /**
     * Set iron's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_iron_lower(Double quantity);

    /**
     * Get magnesium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_magnesium_lower();

    /**
     * Set magnesium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_magnesium_lower(Double quantity);

    /**
     * Get magnanese's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_manganese_lower();

    /**
     * Set magnanese's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_manganese_lower(Double quantity);

    /**
     * Get niacin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_niacin_lower();

    /**
     * Set niacin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_niacin_lower(Double quantity);

    /**
     * Get pantothenic acid's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_pantothenic_acid_lower();

    /**
     * Set pantothenic acid's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_pantothenic_acid_lower(Double quantity);

    /**
     * Get phosphorus's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_phosphorus_lower();

    /**
     * Set phosphorus's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_phosphorus_lower(Double quantity);

    /**
     * Get potassium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_potassium_lower();

    /**
     * Set potassium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_potassium_lower(Double quantity);

    /**
     * Get riboflavin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_riboflavin_lower();

    /**
     * Set riboflavin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_riboflavin_lower(Double quantity);

    /**
     * Get selenium's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_selenium_lower();

    /**
     * Set selenium's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_selenium_lower(Double quantity);

    /**
     * Get sodium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_sodium_lower();

    /**
     * Set sodium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_sodium_lower(Double quantity);

    /**
     * Get thiamin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_thiamin_lower();

    /**
     * Set thiamin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_thiamin_lower(Double quantity);

    /**
     * Get vitamin a's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_a_lower();

    /**
     * Set vitamin a's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_a_lower(Double quantity);

    /**
     * Get vitamin b12's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_b12_lower();

    /**
     * Set vitamin b12's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_b12_lower(Double quantity);

    /**
     * Get vitamin b6's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_b6_lower();

    /**
     * Get vitamin b6's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_b6_lower(Double quantity);

    /**
     * Get vitamin c's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_c_lower();

    /**
     * Set vitamin c's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_c_lower(Double quantity);

    /**
     * Get vitamin d's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_d_lower();

    /**
     * Set vitamin d's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_d_lower(Double quantity);

    /**
     * Get vitamin e's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_e_lower();

    /**
     * Set vitamin e's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_e_lower(Double quantity);

    /**
     * Get vitamin k's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_k_lower();

    /**
     * Set vitamin k's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_k_lower(Double quantity);

    /**
     * Get zinc's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_zinc_lower();

    /**
     * Get zinc's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_zinc_lower(Double quantity);

    /**
     * Get calcium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_calcium_upper();

    /**
     * Set calcium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_calcium_upper(Double quantity);

    /**
     * Get choline's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_choline_upper();

    /**
     * Set choline's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_choline_upper(Double quantity);

    /**
     * Get copper's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_copper_upper();

    /**
     * Set copper's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_copper_upper(Double quantity);

    /**
     * Get flouride's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_fluoride_upper();

    /**
     * Set flouride's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_fluoride_upper(Double quantity);

    /**
     * Get folate's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_folate_upper();

    /**
     * Set folate's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_folate_upper(Double quantity);

    /**
     * Get iron's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_iron_upper();

    /**
     * Set iron's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_iron_upper(Double quantity);

    /**
     * Get magnesium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_magnesium_upper();

    /**
     * Set magnesium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_magnesium_upper(Double quantity);

    /**
     * Get manganese's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_manganese_upper();

    /**
     * Set manganese's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_manganese_upper(Double quantity);

    /**
     * Set niacin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_niacin_upper();

    /**
     * Get niacin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_niacin_upper(Double quantity);

    /**
     * Get pantothenic acid's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_pantothenic_acid_upper();

    /**
     * Set pantothenic acid's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_pantothenic_acid_upper(Double quantity);

    /**
     * Get phosphorus's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_phosphorus_upper();

    /**
     * Set phosphorus's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_phosphorus_upper(Double quantity);

    /**
     * Get potassium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_potassium_upper();

    /**
     * Set potassium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_potassium_upper(Double quantity);

    /**
     * Get riboflavin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_riboflavin_upper();

    /**
     * Set riboflavin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_riboflavin_upper(Double quantity);

    /**
     * Get selenium's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_selenium_upper();

    /**
     * Set selenium's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_selenium_upper(Double quantity);

    /**
     * Get sodium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_sodium_upper();

    /**
     * Set sodium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_sodium_upper(Double quantity);

    /**
     * Get thiamin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_thiamin_upper();

    /**
     * Set thiamin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_thiamin_upper(Double quantity);

    /**
     * Get vitamin a's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_a_upper();

    /**
     * Set vitamin a's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_a_upper(Double quantity);

    /**
     * Get vitamin b12's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_b12_upper();

    /**
     * Set vitamin b12's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_b12_upper(Double quantity);

    /**
     * Get vitamin b6's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_b6_upper();

    /**
     * Set vitamin b6's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_b6_upper(Double quantity);

    /**
     * Get vitamin c's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_c_upper();

    /**
     * Set vitamin c's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_c_upper(Double quantity);

    /**
     * Get vitamin d's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_d_upper();

    /**
     * Set vitamin d's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_d_upper(Double quantity);

    /**
     * Get vitamin e's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_e_upper();

    /**
     * Set vitamin e's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_e_upper(Double quantity);

    /**
     * Get vitamin k's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_k_upper();

    /**
     * Set vitamin k's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_k_upper(Double quantity);

    /**
     * Get zinc's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_zinc_upper();

    /**
     * Set zinc's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_zinc_upper(Double quantity);

}

//Dietary Reference Intakes - Summary Tables
//https://www.ncbi.nlm.nih.gov/books/NBK56068/
