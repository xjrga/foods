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
 * This interface is used to set dietary reference intake data
 */
public interface Interface_dri_mutable {

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
    void set_calcium_rda_in_milligrams(Double quantity);

    /**
     * Set choline's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_choline_rda_in_milligrams(Double quantity);

    /**
     * Set copper's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_copper_rda_in_milligrams(Double quantity);

    /**
     * Set fluoride's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_fluoride_rda_in_micrograms(Double quantity);

    /**
     * Set folate's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_folate_rda_in_micrograms(Double quantity);

    /**
     * Set iron's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_iron_rda_in_milligrams(Double quantity);

    /**
     * Set magnesium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_magnesium_rda_in_milligrams(Double quantity);

    /**
     * Set magnanese's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_manganese_rda_in_milligrams(Double quantity);

    /**
     * Set niacin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_niacin_rda_in_milligrams(Double quantity);

    /**
     * Set pantothenic acid's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_pantothenic_acid_rda_in_milligrams(Double quantity);

    /**
     * Set phosphorus's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_phosphorus_rda_in_milligrams(Double quantity);

    /**
     * Set potassium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_potassium_rda_in_milligrams(Double quantity);

    /**
     * Set riboflavin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_riboflavin_rda_in_milligrams(Double quantity);

    /**
     * Set selenium's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_selenium_rda_in_micrograms(Double quantity);

    /**
     * Set sodium's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_sodium_rda_in_milligrams(Double quantity);

    /**
     * Set thiamin's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_thiamin_rda_in_milligrams(Double quantity);

    /**
     * Set vitamin a's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_a_rda_in_micrograms(Double quantity);

    /**
     * Set vitamin b12's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_b12_rda_in_micrograms(Double quantity);

    /**
     * Get vitamin b6's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_b6_rda_in_milligrams(Double quantity);

    /**
     * Set vitamin c's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_c_rda_in_milligrams(Double quantity);

    /**
     * Set vitamin d's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_d_rda_in_micrograms(Double quantity);

    /**
     * Set vitamin e's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_e_rda_in_milligrams(Double quantity);

    /**
     * Set vitamin k's dietary reference intake lower limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_k_rda_in_micrograms(Double quantity);

    /**
     * Get zinc's dietary reference intake lower limit (mg)
     *
     * @param quantity
     */
    void set_zinc_rda_in_milligrams(Double quantity);

    /**
     * Set calcium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_calcium_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set choline's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_choline_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set copper's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_copper_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set flouride's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_fluoride_tolerable_limit_in_micrograms(Double quantity);

    /**
     * Set folate's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_folate_tolerable_limit_in_micrograms(Double quantity);

    /**
     * Set iron's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_iron_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set magnesium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_magnesium_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set manganese's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_manganese_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Get niacin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_niacin_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set pantothenic acid's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_pantothenic_acid_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set phosphorus's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_phosphorus_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set potassium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_potassium_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set riboflavin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_riboflavin_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set selenium's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_selenium_tolerable_limit_in_micrograms(Double quantity);

    /**
     * Set sodium's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_sodium_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set thiamin's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_thiamin_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set vitamin a's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_a_tolerable_limit_in_micrograms(Double quantity);

    /**
     * Set vitamin b12's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_b12_tolerable_limit_in_micrograms(Double quantity);

    /**
     * Set vitamin b6's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_b6_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set vitamin c's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_c_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set vitamin d's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_d_tolerable_limit_in_micrograms(Double quantity);

    /**
     * Set vitamin e's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_vitamin_e_tolerable_limit_in_milligrams(Double quantity);

    /**
     * Set vitamin k's dietary reference intake upper limit (µg)
     *
     * @param quantity
     */
    void set_vitamin_k_tolerable_limit_in_micrograms(Double quantity);

    /**
     * Set zinc's dietary reference intake upper limit (mg)
     *
     * @param quantity
     */
    void set_zinc_tolerable_limit_in_milligrams(Double quantity);

}
