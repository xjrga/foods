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
public class Abstract_dri implements Interface_dri_mutable, Interface_dri {

    private Integer lifestage_id;
    private String lifestage_label;
    private Double calcium_rda;
    private Double choline_rda;
    private Double copper_rda;
    private Double fluoride_rda;
    private Double folate_rda;
    private Double iron_rda;
    private Double magnesium_rda;
    private Double manganese_rda;
    private Double niacin_rda;
    private Double pantothenic_acid_rda;
    private Double phosphorus_rda;
    private Double potassium_rda;
    private Double riboflavin_rda;
    private Double selenium_rda;
    private Double sodium_rda;
    private Double thiamin_rda;
    private Double vitamin_a_rda;
    private Double vitamin_b12_rda;
    private Double vitamin_b6_rda;
    private Double vitamin_c_rda;
    private Double vitamin_d_rda;
    private Double vitamin_e_rda;
    private Double vitamin_k_rda;
    private Double zinc_rda;
    private Double calcium_tolerable_limit;
    private Double choline_tolerable_limit;
    private Double copper_tolerable_limit;
    private Double fluoride_tolerable_limit;
    private Double folate_tolerable_limit;
    private Double iron_tolerable_limit;
    private Double magnesium_tolerable_limit;
    private Double manganese_tolerable_limit;
    private Double niacin_tolerable_limit;
    private Double pantothenic_acid_tolerable_limit;
    private Double phosphorus_tolerable_limit;
    private Double potassium_tolerable_limit;
    private Double riboflavin_tolerable_limit;
    private Double selenium_tolerable_limit;
    private Double sodium_tolerable_limit;
    private Double thiamin_tolerable_limit;
    private Double vitamin_a_tolerable_limit;
    private Double vitamin_b12_tolerable_limit;
    private Double vitamin_b6_tolerable_limit;
    private Double vitamin_c_tolerable_limit;
    private Double vitamin_d_tolerable_limit;
    private Double vitamin_e_tolerable_limit;
    private Double vitamin_k_tolerable_limit;
    private Double zinc_tolerable_limit;

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
    public final Double get_calcium_rda_in_milligrams() {
        return calcium_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_calcium_rda_in_milligrams(Double quantity) {
        this.calcium_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_choline_rda_in_milligrams() {
        return choline_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_choline_rda_in_milligrams(Double quantity) {
        this.choline_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_copper_rda_in_milligrams() {
        return copper_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_copper_rda_in_milligrams(Double quantity) {
        this.copper_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fluoride_rda_in_micrograms() {
        return fluoride_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fluoride_rda_in_micrograms(Double quantity) {
        this.fluoride_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_folate_rda_in_micrograms() {
        return folate_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_folate_rda_in_micrograms(Double quantity) {
        this.folate_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_iron_rda_in_milligrams() {
        return iron_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_iron_rda_in_milligrams(Double quantity) {
        this.iron_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_magnesium_rda_in_milligrams() {
        return magnesium_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_magnesium_rda_in_milligrams(Double quantity) {
        this.magnesium_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_manganese_rda_in_milligrams() {
        return manganese_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_manganese_rda_in_milligrams(Double quantity) {
        this.manganese_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_niacin_rda_in_milligrams() {
        return niacin_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_niacin_rda_in_milligrams(Double quantity) {
        this.niacin_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_pantothenic_acid_rda_in_milligrams() {
        return pantothenic_acid_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_pantothenic_acid_rda_in_milligrams(Double quantity) {
        this.pantothenic_acid_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_phosphorus_rda_in_milligrams() {
        return phosphorus_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_phosphorus_rda_in_milligrams(Double quantity) {
        this.phosphorus_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_potassium_rda_in_milligrams() {
        return potassium_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_potassium_rda_in_milligrams(Double quantity) {
        this.potassium_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_riboflavin_rda_in_milligrams() {
        return riboflavin_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_riboflavin_rda_in_milligrams(Double quantity) {
        this.riboflavin_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_selenium_rda_in_micrograms() {
        return selenium_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_selenium_rda_in_micrograms(Double quantity) {
        this.selenium_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_sodium_rda_in_milligrams() {
        return sodium_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_sodium_rda_in_milligrams(Double quantity) {
        this.sodium_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_thiamin_rda_in_milligrams() {
        return thiamin_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_thiamin_rda_in_milligrams(Double quantity) {
        this.thiamin_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_a_rda_in_micrograms() {
        return vitamin_a_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_a_rda_in_micrograms(Double quantity) {
        this.vitamin_a_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b12_rda_in_micrograms() {
        return vitamin_b12_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b12_rda_in_micrograms(Double quantity) {
        this.vitamin_b12_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b6_rda_in_milligrams() {
        return vitamin_b6_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b6_rda_in_milligrams(Double quantity) {
        this.vitamin_b6_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_c_rda_in_milligrams() {
        return vitamin_c_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_c_rda_in_milligrams(Double quantity) {
        this.vitamin_c_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_d_rda_in_micrograms() {
        return vitamin_d_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_d_rda_in_micrograms(Double quantity) {
        this.vitamin_d_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_e_rda_in_milligrams() {
        return vitamin_e_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_e_rda_in_milligrams(Double quantity) {
        this.vitamin_e_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_k_rda_in_micrograms() {
        return vitamin_k_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_k_rda_in_micrograms(Double quantity) {
        this.vitamin_k_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_zinc_rda_in_milligrams() {
        return zinc_rda;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_zinc_rda_in_milligrams(Double quantity) {
        this.zinc_rda = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_calcium_tolerable_limit_in_milligrams() {
        return calcium_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_calcium_tolerable_limit_in_milligrams(Double quantity) {
        this.calcium_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_choline_tolerable_limit_in_milligrams() {
        return choline_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_choline_tolerable_limit_in_milligrams(Double quantity) {
        this.choline_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_copper_tolerable_limit_in_milligrams() {
        return copper_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_copper_tolerable_limit_in_milligrams(Double quantity) {
        this.copper_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_fluoride_tolerable_limit_in_micrograms() {
        return fluoride_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_fluoride_tolerable_limit_in_micrograms(Double quantity) {
        this.fluoride_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_folate_tolerable_limit_in_micrograms() {
        return folate_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_folate_tolerable_limit_in_micrograms(Double quantity) {
        this.folate_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_iron_tolerable_limit_in_milligrams() {
        return iron_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_iron_tolerable_limit_in_milligrams(Double quantity) {
        this.iron_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_magnesium_tolerable_limit_in_milligrams() {
        return magnesium_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_magnesium_tolerable_limit_in_milligrams(Double quantity) {
        this.magnesium_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_manganese_tolerable_limit_in_milligrams() {
        return manganese_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_manganese_tolerable_limit_in_milligrams(Double quantity) {
        this.manganese_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_niacin_tolerable_limit_in_milligrams() {
        return niacin_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_niacin_tolerable_limit_in_milligrams(Double quantity) {
        this.niacin_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_pantothenic_acid_tolerable_limit_in_milligrams() {
        return pantothenic_acid_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_pantothenic_acid_tolerable_limit_in_milligrams(Double quantity) {
        this.pantothenic_acid_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_phosphorus_tolerable_limit_in_milligrams() {
        return phosphorus_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_phosphorus_tolerable_limit_in_milligrams(Double quantity) {
        this.phosphorus_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_potassium_tolerable_limit_in_milligrams() {
        return potassium_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_potassium_tolerable_limit_in_milligrams(Double quantity) {
        this.potassium_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_riboflavin_tolerable_limit_in_milligrams() {
        return riboflavin_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_riboflavin_tolerable_limit_in_milligrams(Double quantity) {
        this.riboflavin_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_selenium_tolerable_limit_in_micrograms() {
        return selenium_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_selenium_tolerable_limit_in_micrograms(Double quantity) {
        this.selenium_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_sodium_tolerable_limit_in_milligrams() {
        return sodium_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_sodium_tolerable_limit_in_milligrams(Double quantity) {
        this.sodium_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_thiamin_tolerable_limit_in_milligrams() {
        return thiamin_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_thiamin_tolerable_limit_in_milligrams(Double quantity) {
        this.thiamin_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_a_tolerable_limit_in_micrograms() {
        return vitamin_a_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_a_tolerable_limit_in_micrograms(Double quantity) {
        this.vitamin_a_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b12_tolerable_limit_in_micrograms() {
        return vitamin_b12_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b12_tolerable_limit_in_micrograms(Double quantity) {
        this.vitamin_b12_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_b6_tolerable_limit_in_milligrams() {
        return vitamin_b6_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_b6_tolerable_limit_in_milligrams(Double quantity) {
        this.vitamin_b6_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_c_tolerable_limit_in_milligrams() {
        return vitamin_c_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_c_tolerable_limit_in_milligrams(Double quantity) {
        this.vitamin_c_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_d_tolerable_limit_in_micrograms() {
        return vitamin_d_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_d_tolerable_limit_in_micrograms(Double quantity) {
        this.vitamin_d_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_e_tolerable_limit_in_milligrams() {
        return vitamin_e_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_e_tolerable_limit_in_milligrams(Double quantity) {
        this.vitamin_e_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_vitamin_k_tolerable_limit_in_micrograms() {
        return vitamin_k_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_vitamin_k_tolerable_limit_in_micrograms(Double quantity) {
        this.vitamin_k_tolerable_limit = quantity;
    }

    /**
     *
     * @return
     */
    @Override
    public final Double get_zinc_tolerable_limit_in_milligrams() {
        return zinc_tolerable_limit;
    }

    /**
     *
     * @param quantity
     */
    @Override
    public final void set_zinc_tolerable_limit_in_milligrams(Double quantity) {
        this.zinc_tolerable_limit = quantity;
    }

}
