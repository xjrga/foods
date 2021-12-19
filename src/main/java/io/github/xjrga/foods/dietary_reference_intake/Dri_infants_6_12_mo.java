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
package io.github.xjrga.foods.dietary_reference_intake;

import io.github.xjrga.foods.Dri_abstract;
import io.github.xjrga.foods.Dri;

/**
 * Dietary reference intake for Infants (6–12 mo
 */
public class Dri_infants_6_12_mo implements Dri {

    private final Dri_infants_6_12_mo_mutable dri;

    /**
     * Constructs a dri item
     */
    public Dri_infants_6_12_mo() {
        dri = new Dri_infants_6_12_mo_mutable();
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

    @Override
    public String toString() {
        return dri.get_lifestage_label();
    }

    @Override
    public int hashCode() {
        return dri.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return equals(obj);
    }

    private class Dri_infants_6_12_mo_mutable extends Dri_abstract {

        /**
         * Constructs a dri item
         */
        public Dri_infants_6_12_mo_mutable() {
            set_calcium_lower(260.00000);
            set_calcium_upper(1500.00000);
            set_choline_lower(150.00000);
            set_choline_upper(0.00000);
            set_copper_lower(0.22000);
            set_copper_upper(0.00000);
            set_fluoride_lower(500.00000);
            set_fluoride_upper(900.00000);
            set_folate_lower(80.00000);
            set_folate_upper(0.00000);
            set_iron_lower(11.00000);
            set_iron_upper(40.00000);
            set_magnesium_lower(75.00000);
            set_magnesium_upper(0.00000);
            set_manganese_lower(0.60000);
            set_manganese_upper(0.00000);
            set_niacin_lower(4.00000);
            set_niacin_upper(0.00000);
            set_pantothenic_acid_lower(1.80000);
            set_pantothenic_acid_upper(0.00000);
            set_phosphorus_lower(275.00000);
            set_phosphorus_upper(0.00000);
            set_potassium_lower(860.00000);
            set_potassium_upper(0.00000);
            set_riboflavin_lower(0.40000);
            set_riboflavin_upper(0.00000);
            set_selenium_lower(20.00000);
            set_selenium_upper(60.00000);
            set_sodium_lower(370.00000);
            set_sodium_upper(0.00000);
            set_thiamin_lower(0.30000);
            set_thiamin_upper(0.00000);
            set_vitamin_a_lower(500.00000);
            set_vitamin_a_upper(600.00000);
            set_vitamin_b12_lower(0.50000);
            set_vitamin_b12_upper(0.00000);
            set_vitamin_b6_lower(0.30000);
            set_vitamin_b6_upper(0.00000);
            set_vitamin_c_lower(50.00000);
            set_vitamin_c_upper(0.00000);
            set_vitamin_d_lower(10.00000);
            set_vitamin_d_upper(38.00000);
            set_vitamin_e_lower(5.00000);
            set_vitamin_e_upper(0.00000);
            set_vitamin_k_lower(2.50000);
            set_vitamin_k_upper(0.00000);
            set_zinc_lower(3.00000);
            set_zinc_upper(5.00000);

        }

    }
}