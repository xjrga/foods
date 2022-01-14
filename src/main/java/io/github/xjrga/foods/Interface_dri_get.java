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
 * This interface is used to get dietary reference intake data
 */
public interface Interface_dri_get {

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
    Double get_calcium_rda_in_milligrams();

    /**
     * Get choline's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_choline_rda_in_milligrams();

    /**
     * Get copper's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_copper_rda_in_milligrams();

    /**
     * Get fluoride's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_fluoride_rda_in_micrograms();

    /**
     * Get folate's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_folate_rda_in_micrograms();

    /**
     * Get iron's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_iron_rda_in_milligrams();

    /**
     * Get magnesium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_magnesium_rda_in_milligrams();

    /**
     * Get magnanese's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_manganese_rda_in_milligrams();

    /**
     * Get niacin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_niacin_rda_in_milligrams();

    /**
     * Get pantothenic acid's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_pantothenic_acid_rda_in_milligrams();

    /**
     * Get phosphorus's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_phosphorus_rda_in_milligrams();

    /**
     * Get potassium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_potassium_rda_in_milligrams();

    /**
     * Get riboflavin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_riboflavin_rda_in_milligrams();

    /**
     * Get selenium's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_selenium_rda_in_micrograms();

    /**
     * Get sodium's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_sodium_rda_in_milligrams();

    /**
     * Get thiamin's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_thiamin_rda_in_milligrams();

    /**
     * Get vitamin a's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_a_rda_in_micrograms();

    /**
     * Get vitamin b12's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_b12_rda_in_micrograms();

    /**
     * Get vitamin b6's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_b6_rda_in_milligrams();

    /**
     * Get vitamin c's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_c_rda_in_milligrams();

    /**
     * Get vitamin d's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_d_rda_in_micrograms();

    /**
     * Get vitamin e's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_e_rda_in_milligrams();

    /**
     * Get vitamin k's dietary reference intake lower limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_k_rda_in_micrograms();

    /**
     * Get zinc's dietary reference intake lower limit (mg)
     *
     * @return Double
     */
    Double get_zinc_rda_in_milligrams();

    /**
     * Get calcium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_calcium_tolerable_limit_in_milligrams();

    /**
     * Get choline's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_choline_tolerable_limit_in_milligrams();

    /**
     * Get copper's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_copper_tolerable_limit_in_milligrams();

    /**
     * Get flouride's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_fluoride_tolerable_limit_in_micrograms();

    /**
     * Get folate's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_folate_tolerable_limit_in_micrograms();

    /**
     * Get iron's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_iron_tolerable_limit_in_milligrams();

    /**
     * Get magnesium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_magnesium_tolerable_limit_in_milligrams();

    /**
     * Get manganese's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_manganese_tolerable_limit_in_milligrams();

    /**
     * Set niacin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_niacin_tolerable_limit_in_milligrams();

    /**
     * Get pantothenic acid's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_pantothenic_acid_tolerable_limit_in_milligrams();

    /**
     * Get phosphorus's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_phosphorus_tolerable_limit_in_milligrams();

    /**
     * Get potassium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_potassium_tolerable_limit_in_milligrams();

    /**
     * Get riboflavin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_riboflavin_tolerable_limit_in_milligrams();

    /**
     * Get selenium's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_selenium_tolerable_limit_in_micrograms();

    /**
     * Get sodium's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_sodium_tolerable_limit_in_milligrams();

    /**
     * Get thiamin's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_thiamin_tolerable_limit_in_milligrams();

    /**
     * Get vitamin a's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_a_tolerable_limit_in_micrograms();

    /**
     * Get vitamin b12's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_b12_tolerable_limit_in_micrograms();

    /**
     * Get vitamin b6's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_b6_tolerable_limit_in_milligrams();

    /**
     * Get vitamin c's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_c_tolerable_limit_in_milligrams();

    /**
     * Get vitamin d's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_d_tolerable_limit_in_micrograms();

    /**
     * Get vitamin e's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_vitamin_e_tolerable_limit_in_milligrams();

    /**
     * Get vitamin k's dietary reference intake upper limit (µg)
     *
     * @return Double
     */
    Double get_vitamin_k_tolerable_limit_in_micrograms();

    /**
     * Get zinc's dietary reference intake upper limit (mg)
     *
     * @return Double
     */
    Double get_zinc_tolerable_limit_in_milligrams();

}

//Appendix J - Dietary Reference Intakes Summary Tables
//https://www.ncbi.nlm.nih.gov/books/NBK545442/
//Dietary Reference Intakes (DRIs): Recommended Dietary Allowances and Adequate Intakes, Vitamins
//https://www.ncbi.nlm.nih.gov/books/NBK545442/table/appJ_tab2/?report=objectonly
//Dietary Reference Intakes (DRIs): Recommended Dietary Allowances and Adequate Intakes, Elements
//https://www.ncbi.nlm.nih.gov/books/NBK545442/table/appJ_tab3/?report=objectonly
//Dietary Reference Intakes (DRIs): Tolerable Upper Intake Levels, Vitamins
//https://www.ncbi.nlm.nih.gov/books/NBK545442/table/appJ_tab8/?report=objectonly
//Dietary Reference Intakes (DRIs): Tolerable Upper Intake Levels, Elements
//https://www.ncbi.nlm.nih.gov/books/NBK545442/table/appJ_tab9/?report=objectonly

