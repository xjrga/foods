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
package io.github.xjrga.foods_old.categories;

import io.github.xjrga.foods_old.Abstract_category;
import io.github.xjrga.foods_old.Food;
import io.github.xjrga.foods_old.Food_mutable;
import io.github.xjrga.foods_old.Interface_food;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Omega3 extends Abstract_category {

    public Omega3() {
        add(get_fish_oil_cod_liver());
        add(get_fish_oil_herring());
        add(get_fish_oil_menhaden());
        add(get_fish_oil_salmon());
        add(get_fish_oil_sardine());
        add(get_oil_flaxseed_cold_pressed());
        add(get_seeds_flaxseed_efas());
        set_name("Omega3");
    }

    public Interface_food get_fish_oil_cod_liver() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Fish oil, cod liver");
        mutable.set_food_label("fish_oil_cod_liver");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(0.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(570.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(10.96000);
        mutable.set_epa(6.89000);
        mutable.set_fat(100.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(902.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(0.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(46.71000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(0.00000);
        mutable.set_polyunsaturated_fat(22.54000);
        mutable.set_potassium(0.00000);
        mutable.set_protein(0.00000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(22.60000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(0.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(30000.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(250.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(0.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.00000);
        return new Food(mutable);
    }

    public Interface_food get_fish_oil_herring() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Fish oil, herring");
        mutable.set_food_label("fish_oil_herring");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(0.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(766.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(4.20000);
        mutable.set_epa(6.27000);
        mutable.set_fat(100.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(902.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(0.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(56.56000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(0.00000);
        mutable.set_polyunsaturated_fat(15.60000);
        mutable.set_potassium(0.00000);
        mutable.set_protein(0.00000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(21.29000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(0.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(0.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.00000);
        return new Food(mutable);
    }

    public Interface_food get_fish_oil_menhaden() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Fish oil, menhaden");
        mutable.set_food_label("fish_oil_menhaden");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(0.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(521.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(8.56000);
        mutable.set_epa(13.16000);
        mutable.set_fat(100.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(902.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(0.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(26.69000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(0.00000);
        mutable.set_polyunsaturated_fat(34.19000);
        mutable.set_potassium(0.00000);
        mutable.set_protein(0.00000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(30.42000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(0.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(0.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.00000);
        return new Food(mutable);
    }

    public Interface_food get_fish_oil_salmon() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Fish oil, salmon");
        mutable.set_food_label("fish_oil_salmon");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(0.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(485.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(18.23000);
        mutable.set_epa(13.02000);
        mutable.set_fat(100.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(902.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(0.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(29.03000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(0.00000);
        mutable.set_polyunsaturated_fat(40.32000);
        mutable.set_potassium(0.00000);
        mutable.set_protein(0.00000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(19.87000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(0.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(0.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.00000);
        return new Food(mutable);
    }

    public Interface_food get_fish_oil_sardine() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Fish oil, sardine");
        mutable.set_food_label("fish_oil_sardine");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(0.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(710.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(10.65000);
        mutable.set_epa(10.13000);
        mutable.set_fat(100.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(902.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(0.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(33.84000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(0.00000);
        mutable.set_polyunsaturated_fat(31.86000);
        mutable.set_potassium(0.00000);
        mutable.set_protein(0.00000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(29.89000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(0.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(8.30000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(0.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.00000);
        return new Food(mutable);
    }

    public Interface_food get_oil_flaxseed_cold_pressed() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Oil, flaxseed, cold pressed");
        mutable.set_food_label("oil_flaxseed_cold_pressed");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(53.36000);
        mutable.set_calcium(1.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(0.20000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(99.98000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(884.00000);
        mutable.set_iron(0.00000);
        mutable.set_linoleic_acid(14.24000);
        mutable.set_magnesium(0.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(18.43000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(1.00000);
        mutable.set_polyunsaturated_fat(67.84000);
        mutable.set_potassium(0.00000);
        mutable.set_protein(0.11000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(8.97000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(0.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.47000);
        mutable.set_vitamin_k(9.30000);
        mutable.set_water(0.12000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.07000);
        return new Food(mutable);
    }

    public Interface_food get_seeds_flaxseed_efas() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Seeds, flaxseed (EFAs)");
        mutable.set_food_label("seeds_flaxseed_efas");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(24.45280);
        mutable.set_calcium(255.00000);
        mutable.set_carbohydrate_by_difference(28.88000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(78.70000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(1.22000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(42.16000);
        mutable.set_fiber(27.30000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(87.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(534.00000);
        mutable.set_iron(5.73000);
        mutable.set_linoleic_acid(6.02888);
        mutable.set_magnesium(392.00000);
        mutable.set_manganese(2.48000);
        mutable.set_monounsaturated_fat(7.52000);
        mutable.set_niacin(3.08000);
        mutable.set_pantothenic_acid(0.98000);
        mutable.set_phosphorus(642.00000);
        mutable.set_polyunsaturated_fat(28.73000);
        mutable.set_potassium(813.00000);
        mutable.set_protein(18.29000);
        mutable.set_riboflavin(0.16000);
        mutable.set_saturated_fat(3.66000);
        mutable.set_selenium(25.40000);
        mutable.set_sodium(30.00000);
        mutable.set_thiamin(1.64000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.47000);
        mutable.set_vitamin_c(0.60000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.31000);
        mutable.set_vitamin_k(4.30000);
        mutable.set_water(6.96000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(4.34000);
        return new Food(mutable);
    }
}
