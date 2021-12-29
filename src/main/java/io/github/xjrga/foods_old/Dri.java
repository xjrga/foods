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
package io.github.xjrga.foods_old;

/**
 * This is a read only dietary reference intake object implementation example
 */
public class Dri implements Interface_dri {

    private final Dri_mutable dri;

    /**
     * Constructs a dri item
     */
    public Dri(Dri_mutable dri) {
        this.dri = dri;
    }

    @Override
    public final Integer get_lifestage_id() {
        return dri.get_lifestage_id();
    }

    @Override
    public final String get_lifestage_label() {
        return dri.get_lifestage_label();
    }

    @Override
    public final Double get_calcium_lower() {
        return dri.get_calcium_lower();
    }

    @Override
    public final Double get_choline_lower() {
        return dri.get_choline_lower();
    }

    @Override
    public final Double get_copper_lower() {
        return dri.get_copper_lower();
    }

    @Override
    public final Double get_fluoride_lower() {
        return dri.get_fluoride_lower();
    }

    @Override
    public final Double get_folate_lower() {
        return dri.get_folate_lower();
    }

    @Override
    public final Double get_iron_lower() {
        return dri.get_iron_lower();
    }

    @Override
    public final Double get_magnesium_lower() {
        return dri.get_magnesium_lower();
    }

    @Override
    public final Double get_manganese_lower() {
        return dri.get_manganese_lower();
    }

    @Override
    public final Double get_niacin_lower() {
        return dri.get_niacin_lower();
    }

    @Override
    public final Double get_pantothenic_acid_lower() {
        return dri.get_pantothenic_acid_lower();
    }

    @Override
    public final Double get_phosphorus_lower() {
        return dri.get_phosphorus_lower();
    }

    @Override
    public final Double get_potassium_lower() {
        return dri.get_potassium_lower();
    }

    @Override
    public final Double get_riboflavin_lower() {
        return dri.get_riboflavin_lower();
    }

    @Override
    public final Double get_selenium_lower() {
        return dri.get_selenium_lower();
    }

    @Override
    public final Double get_sodium_lower() {
        return dri.get_sodium_lower();
    }

    @Override
    public final Double get_thiamin_lower() {
        return dri.get_thiamin_lower();
    }

    @Override
    public final Double get_vitamin_a_lower() {
        return dri.get_vitamin_a_lower();
    }

    @Override
    public final Double get_vitamin_b12_lower() {
        return dri.get_vitamin_b12_lower();
    }

    @Override
    public final Double get_vitamin_b6_lower() {
        return dri.get_vitamin_b6_lower();
    }

    @Override
    public final Double get_vitamin_c_lower() {
        return dri.get_vitamin_c_lower();
    }

    @Override
    public final Double get_vitamin_d_lower() {
        return dri.get_vitamin_d_lower();
    }

    @Override
    public final Double get_vitamin_e_lower() {
        return dri.get_vitamin_e_lower();
    }

    @Override
    public final Double get_vitamin_k_lower() {
        return dri.get_vitamin_k_lower();
    }

    @Override
    public final Double get_zinc_lower() {
        return dri.get_zinc_lower();
    }

    @Override
    public final Double get_calcium_upper() {
        return dri.get_calcium_upper();
    }

    @Override
    public final Double get_choline_upper() {
        return dri.get_choline_upper();
    }

    @Override
    public final Double get_copper_upper() {
        return dri.get_copper_upper();
    }

    @Override
    public final Double get_fluoride_upper() {
        return dri.get_fluoride_upper();
    }

    @Override
    public final Double get_folate_upper() {
        return dri.get_folate_upper();
    }

    @Override
    public final Double get_iron_upper() {
        return dri.get_iron_upper();
    }

    @Override
    public final Double get_magnesium_upper() {
        return dri.get_magnesium_upper();
    }

    @Override
    public final Double get_manganese_upper() {
        return dri.get_manganese_upper();
    }

    @Override
    public final Double get_niacin_upper() {
        return dri.get_niacin_upper();
    }

    @Override
    public final Double get_pantothenic_acid_upper() {
        return dri.get_pantothenic_acid_upper();
    }

    @Override
    public final Double get_phosphorus_upper() {
        return dri.get_phosphorus_upper();
    }

    @Override
    public final Double get_potassium_upper() {
        return dri.get_potassium_upper();
    }

    @Override
    public final Double get_riboflavin_upper() {
        return dri.get_riboflavin_upper();
    }

    @Override
    public final Double get_selenium_upper() {
        return dri.get_selenium_upper();
    }

    @Override
    public final Double get_sodium_upper() {
        return dri.get_sodium_upper();
    }

    @Override
    public final Double get_thiamin_upper() {
        return dri.get_thiamin_upper();
    }

    @Override
    public final Double get_vitamin_a_upper() {
        return dri.get_vitamin_a_upper();
    }

    @Override
    public final Double get_vitamin_b12_upper() {
        return dri.get_vitamin_b12_upper();
    }

    @Override
    public final Double get_vitamin_b6_upper() {
        return dri.get_vitamin_b6_upper();
    }

    @Override
    public final Double get_vitamin_c_upper() {
        return dri.get_vitamin_c_upper();
    }

    @Override
    public final Double get_vitamin_d_upper() {
        return dri.get_vitamin_d_upper();
    }

    @Override
    public final Double get_vitamin_e_upper() {
        return dri.get_vitamin_e_upper();
    }

    @Override
    public final Double get_vitamin_k_upper() {
        return dri.get_vitamin_k_upper();
    }

    @Override
    public final Double get_zinc_upper() {
        return dri.get_zinc_upper();
    }
}
