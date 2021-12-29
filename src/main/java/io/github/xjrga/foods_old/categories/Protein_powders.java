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
public class Protein_powders extends Abstract_category {

    public Protein_powders() {
        add(get_egg_white_dried());
        add(get_whey_protein_concentrate());
        add(get_soy_protein_isolate());
        set_name("Protein Powders");
    }

    public Interface_food get_egg_white_dried() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Egg, white, dried");
        mutable.set_food_label("egg_white_dried");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(62.00000);
        mutable.set_carbohydrate_by_difference(7.80000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(8.40000);
        mutable.set_complete_protein(81.10000);
        mutable.set_copper(0.11000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(0.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(18.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(382.00000);
        mutable.set_iron(0.15000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(88.00000);
        mutable.set_manganese(0.00700);
        mutable.set_monounsaturated_fat(0.00000);
        mutable.set_niacin(0.86000);
        mutable.set_pantothenic_acid(0.77000);
        mutable.set_phosphorus(111.00000);
        mutable.set_polyunsaturated_fat(0.00000);
        mutable.set_potassium(1125.00000);
        mutable.set_protein(81.10000);
        mutable.set_riboflavin(2.53000);
        mutable.set_saturated_fat(0.00000);
        mutable.set_selenium(125.10000);
        mutable.set_sodium(1280.00000);
        mutable.set_thiamin(0.00500);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.18000);
        mutable.set_vitamin_b6(0.03000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(5.80000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.10000);
        return new Food(mutable);
    }

    public Interface_food get_whey_protein_concentrate() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Whey Protein Concentrate");
        mutable.set_food_label("whey_protein_concentrate");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(550.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(215.00000);
        mutable.set_choline(0.00000);
        mutable.set_complete_protein(80.00000);
        mutable.set_copper(0.00000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(6.00000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(0.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(385.00000);
        mutable.set_iron(0.70000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(60.00000);
        mutable.set_manganese(0.00000);
        mutable.set_monounsaturated_fat(1.10000);
        mutable.set_niacin(0.00000);
        mutable.set_pantothenic_acid(0.00000);
        mutable.set_phosphorus(350.00000);
        mutable.set_polyunsaturated_fat(0.70000);
        mutable.set_potassium(530.00000);
        mutable.set_protein(80.00000);
        mutable.set_riboflavin(0.00000);
        mutable.set_saturated_fat(2.10000);
        mutable.set_selenium(0.00000);
        mutable.set_sodium(175.00000);
        mutable.set_thiamin(0.00000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.00000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(5.00000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(0.00000);
        return new Food(mutable);
    }

    public Interface_food get_soy_protein_isolate() {
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Soy protein isolate");
        mutable.set_food_label("soy_protein_isolate");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(178.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(0.00000);
        mutable.set_choline(190.90000);
        mutable.set_complete_protein(0.00000);
        mutable.set_copper(1.59000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.00000);
        mutable.set_epa(0.00000);
        mutable.set_fat(3.39000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(176.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(335.00000);
        mutable.set_iron(14.50000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(39.00000);
        mutable.set_manganese(1.49000);
        mutable.set_monounsaturated_fat(0.64000);
        mutable.set_niacin(1.43000);
        mutable.set_pantothenic_acid(0.06000);
        mutable.set_phosphorus(776.00000);
        mutable.set_polyunsaturated_fat(1.64000);
        mutable.set_potassium(81.00000);
        mutable.set_protein(88.32000);
        mutable.set_riboflavin(0.10000);
        mutable.set_saturated_fat(0.42000);
        mutable.set_selenium(0.80000);
        mutable.set_sodium(1005.00000);
        mutable.set_thiamin(0.17000);
        mutable.set_vitamin_a(0.00000);
        mutable.set_vitamin_b12(0.00000);
        mutable.set_vitamin_b6(0.10000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(0.00000);
        mutable.set_vitamin_e(0.00000);
        mutable.set_vitamin_k(0.00000);
        mutable.set_water(4.98000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(4.03000);
        return new Food(mutable);
    }
}
