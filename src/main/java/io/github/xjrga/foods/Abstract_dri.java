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
 * This is an abstract dri to extend from
 */
public class Abstract_dri implements Dri {

    private Integer lifestage_id;
    private String lifestage_label;
    private Double calcium_lower;
    private Double choline_lower;
    private Double copper_lower;
    private Double fluoride_lower;
    private Double folate_lower;
    private Double iron_lower;
    private Double magnesium_lower;
    private Double manganese_lower;
    private Double niacin_lower;
    private Double pantothenic_acid_lower;
    private Double phosphorus_lower;
    private Double potassium_lower;
    private Double riboflavin_lower;
    private Double selenium_lower;
    private Double sodium_lower;
    private Double thiamin_lower;
    private Double vitamin_a_lower;
    private Double vitamin_b12_lower;
    private Double vitamin_b6_lower;
    private Double vitamin_c_lower;
    private Double vitamin_d_lower;
    private Double vitamin_e_lower;
    private Double vitamin_k_lower;
    private Double zinc_lower;
    private Double calcium_upper;
    private Double choline_upper;
    private Double copper_upper;
    private Double fluoride_upper;
    private Double folate_upper;
    private Double iron_upper;
    private Double magnesium_upper;
    private Double manganese_upper;
    private Double niacin_upper;
    private Double pantothenic_acid_upper;
    private Double phosphorus_upper;
    private Double potassium_upper;
    private Double riboflavin_upper;
    private Double selenium_upper;
    private Double sodium_upper;
    private Double thiamin_upper;
    private Double vitamin_a_upper;
    private Double vitamin_b12_upper;
    private Double vitamin_b6_upper;
    private Double vitamin_c_upper;
    private Double vitamin_d_upper;
    private Double vitamin_e_upper;
    private Double vitamin_k_upper;
    private Double zinc_upper;

    /**
     *
     * @return
     */
    @Override
    public final Integer get_lifestage_id() {
        return lifestage_id;
    }

    /**
     *
     * @param lifestage_id
     */
    @Override
    public final void set_lifestage_id(Integer lifestage_id) {
        this.lifestage_id = lifestage_id;
    }

    /**
     *
     * @return
     */
    @Override
    public final String get_lifestage_label() {
        return lifestage_label;
    }

    /**
     *
     * @param lifestage_label
     */
    @Override
    public final void set_lifestage_label(String lifestage_label) {
        this.lifestage_label = lifestage_label;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_calcium_lower() {
        return calcium_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_calcium_lower(Double quantity) {
        this.calcium_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_choline_lower() {
        return choline_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_choline_lower(Double quantity) {
        this.choline_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_copper_lower() {
        return copper_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_copper_lower(Double quantity) {
        this.copper_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fluoride_lower() {
        return fluoride_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fluoride_lower(Double quantity) {
        this.fluoride_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_folate_lower() {
        return folate_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_folate_lower(Double quantity) {
        this.folate_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_iron_lower() {
        return iron_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_iron_lower(Double quantity) {
        this.iron_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_magnesium_lower() {
        return magnesium_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_magnesium_lower(Double quantity) {
        this.magnesium_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_manganese_lower() {
        return manganese_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_manganese_lower(Double quantity) {
        this.manganese_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_niacin_lower() {
        return niacin_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_niacin_lower(Double quantity) {
        this.niacin_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_pantothenic_acid_lower() {
        return pantothenic_acid_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_pantothenic_acid_lower(Double quantity) {
        this.pantothenic_acid_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_phosphorus_lower() {
        return phosphorus_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_phosphorus_lower(Double quantity) {
        this.phosphorus_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_potassium_lower() {
        return potassium_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_potassium_lower(Double quantity) {
        this.potassium_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_riboflavin_lower() {
        return riboflavin_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_riboflavin_lower(Double quantity) {
        this.riboflavin_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_selenium_lower() {
        return selenium_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_selenium_lower(Double quantity) {
        this.selenium_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_sodium_lower() {
        return sodium_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_sodium_lower(Double quantity) {
        this.sodium_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_thiamin_lower() {
        return thiamin_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_thiamin_lower(Double quantity) {
        this.thiamin_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_a_lower() {
        return vitamin_a_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_a_lower(Double quantity) {
        this.vitamin_a_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b12_lower() {
        return vitamin_b12_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b12_lower(Double quantity) {
        this.vitamin_b12_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b6_lower() {
        return vitamin_b6_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b6_lower(Double quantity) {
        this.vitamin_b6_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_c_lower() {
        return vitamin_c_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_c_lower(Double quantity) {
        this.vitamin_c_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_d_lower() {
        return vitamin_d_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_d_lower(Double quantity) {
        this.vitamin_d_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_e_lower() {
        return vitamin_e_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_e_lower(Double quantity) {
        this.vitamin_e_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_k_lower() {
        return vitamin_k_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_k_lower(Double quantity) {
        this.vitamin_k_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_zinc_lower() {
        return zinc_lower;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_zinc_lower(Double quantity) {
        this.zinc_lower = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_calcium_upper() {
        return calcium_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_calcium_upper(Double quantity) {
        this.calcium_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_choline_upper() {
        return choline_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_choline_upper(Double quantity) {
        this.choline_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_copper_upper() {
        return copper_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_copper_upper(Double quantity) {
        this.copper_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fluoride_upper() {
        return fluoride_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fluoride_upper(Double quantity) {
        this.fluoride_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_folate_upper() {
        return folate_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_folate_upper(Double quantity) {
        this.folate_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_iron_upper() {
        return iron_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_iron_upper(Double quantity) {
        this.iron_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_magnesium_upper() {
        return magnesium_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_magnesium_upper(Double quantity) {
        this.magnesium_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_manganese_upper() {
        return manganese_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_manganese_upper(Double quantity) {
        this.manganese_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_niacin_upper() {
        return niacin_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_niacin_upper(Double quantity) {
        this.niacin_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_pantothenic_acid_upper() {
        return pantothenic_acid_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_pantothenic_acid_upper(Double quantity) {
        this.pantothenic_acid_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_phosphorus_upper() {
        return phosphorus_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_phosphorus_upper(Double quantity) {
        this.phosphorus_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_potassium_upper() {
        return potassium_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_potassium_upper(Double quantity) {
        this.potassium_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_riboflavin_upper() {
        return riboflavin_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_riboflavin_upper(Double quantity) {
        this.riboflavin_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_selenium_upper() {
        return selenium_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_selenium_upper(Double quantity) {
        this.selenium_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_sodium_upper() {
        return sodium_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_sodium_upper(Double quantity) {
        this.sodium_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_thiamin_upper() {
        return thiamin_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_thiamin_upper(Double quantity) {
        this.thiamin_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_a_upper() {
        return vitamin_a_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_a_upper(Double quantity) {
        this.vitamin_a_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b12_upper() {
        return vitamin_b12_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b12_upper(Double quantity) {
        this.vitamin_b12_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b6_upper() {
        return vitamin_b6_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b6_upper(Double quantity) {
        this.vitamin_b6_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_c_upper() {
        return vitamin_c_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_c_upper(Double quantity) {
        this.vitamin_c_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_d_upper() {
        return vitamin_d_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_d_upper(Double quantity) {
        this.vitamin_d_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_e_upper() {
        return vitamin_e_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_e_upper(Double quantity) {
        this.vitamin_e_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_k_upper() {
        return vitamin_k_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_k_upper(Double quantity) {
        this.vitamin_k_upper = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_zinc_upper() {
        return zinc_upper;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_zinc_upper(Double quantity) {
        this.zinc_upper = quantity;
    }

}
