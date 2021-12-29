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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summator implements Interface_food {

    private final ArrayList<Interface_food> list;
    private final String name;
    private final Interface_food meal;

    public Food_summator(ArrayList<Interface_food> food_list, String name) {
        this.list = food_list;
        this.name = name;
        meal = get_total();
    }

    @Override
    public final String get_food_name() {
        return meal.get_food_name();
    }

    @Override
    public final String get_food_label() {
        return meal.get_food_label();
    }

    @Override
    public final Double get_weight() {
        return meal.get_weight();
    }

    @Override
    public final Double get_energy_gross() {
        return meal.get_energy_gross();
    }

    @Override
    public final Double get_energy_gross_coefficient() {
        return meal.get_energy_gross_coefficient();
    }

    @Override
    public final Double get_protein() {
        return meal.get_protein();
    }

    @Override
    public final Double get_protein_coefficient() {
        return meal.get_protein_coefficient();
    }

    @Override
    public final Double get_protein_atwater_factor() {
        return meal.get_protein_atwater_factor();
    }

    @Override
    public final Double get_carbohydrate_by_difference() {
        return meal.get_carbohydrate_by_difference();
    }

    @Override
    public final Double get_carbohydrate_by_difference_coefficient() {
        return meal.get_carbohydrate_by_difference_coefficient();
    }

    @Override
    public final Double get_carbohydrate_by_difference_atwater_factor() {
        return meal.get_carbohydrate_by_difference_atwater_factor();
    }

    @Override
    public final Double get_fiber() {
        return meal.get_fiber();
    }

    @Override
    public final Double get_fiber_coefficient() {
        return meal.get_fiber_coefficient();
    }

    @Override
    public final Double get_fat() {
        return meal.get_fat();
    }

    @Override
    public final Double get_fat_coefficient() {
        return meal.get_fat_coefficient();
    }

    @Override
    public final Double get_fat_atwater_factor() {
        return meal.get_fat_atwater_factor();
    }

    @Override
    public final Double get_alcohol() {
        return meal.get_alcohol();
    }

    @Override
    public final Double get_alcohol_coefficient() {
        return meal.get_alcohol_coefficient();
    }

    @Override
    public final Double get_alcohol_atwater_factor() {
        return meal.get_alcohol_atwater_factor();
    }

    @Override
    public final Double get_digestible_carbohydrate() {
        return meal.get_digestible_carbohydrate();
    }

    @Override
    public final Double get_digestible_carbohydrate_coefficient() {
        return meal.get_digestible_carbohydrate_coefficient();
    }

    @Override
    public final Double get_cholesterol() {
        return meal.get_cholesterol();
    }

    @Override
    public final Double get_cholesterol_coefficient() {
        return meal.get_cholesterol_coefficient();
    }

    @Override
    public final Double get_monounsaturated_fat() {
        return meal.get_monounsaturated_fat();
    }

    @Override
    public final Double get_monounsaturated_fat_coefficient() {
        return meal.get_monounsaturated_fat_coefficient();
    }

    @Override
    public final Double get_polyunsaturated_fat() {
        return meal.get_polyunsaturated_fat();
    }

    @Override
    public final Double get_polyunsaturated_fat_coefficient() {
        return meal.get_polyunsaturated_fat_coefficient();
    }

    @Override
    public final Double get_saturated_fat() {
        return meal.get_saturated_fat();
    }

    @Override
    public final Double get_saturated_fat_coefficient() {
        return meal.get_saturated_fat_coefficient();
    }

    @Override
    public final Double get_complete_protein() {
        return meal.get_complete_protein();
    }

    @Override
    public final Double get_complete_protein_coefficient() {
        return meal.get_complete_protein_coefficient();
    }

    @Override
    public final Double get_calcium() {
        return meal.get_calcium();
    }

    @Override
    public final Double get_calcium_coefficient() {
        return meal.get_calcium_coefficient();
    }

    @Override
    public final Double get_copper() {
        return meal.get_copper();
    }

    @Override
    public final Double get_copper_coefficient() {
        return meal.get_copper_coefficient();
    }

    @Override
    public final Double get_fluoride() {
        return meal.get_fluoride();
    }

    @Override
    public final Double get_fluoride_coefficient() {
        return meal.get_fluoride_coefficient();
    }

    @Override
    public final Double get_iron() {
        return meal.get_iron();
    }

    @Override
    public final Double get_iron_coefficient() {
        return meal.get_iron_coefficient();
    }

    @Override
    public final Double get_magnesium() {
        return meal.get_magnesium();
    }

    @Override
    public final Double get_magnesium_coefficient() {
        return meal.get_magnesium_coefficient();
    }

    @Override
    public final Double get_manganese() {
        return meal.get_manganese();
    }

    @Override
    public final Double get_manganese_coefficient() {
        return meal.get_manganese_coefficient();
    }

    @Override
    public final Double get_phosphorus() {
        return meal.get_phosphorus();
    }

    @Override
    public final Double get_phosphorus_coefficient() {
        return meal.get_phosphorus_coefficient();
    }

    @Override
    public final Double get_potassium() {
        return meal.get_potassium();
    }

    @Override
    public final Double get_potassium_coefficient() {
        return meal.get_potassium_coefficient();
    }

    @Override
    public final Double get_selenium() {
        return meal.get_selenium();
    }

    @Override
    public final Double get_selenium_coefficient() {
        return meal.get_selenium_coefficient();
    }

    @Override
    public final Double get_sodium() {
        return meal.get_sodium();
    }

    @Override
    public final Double get_sodium_coefficient() {
        return meal.get_sodium_coefficient();
    }

    @Override
    public final Double get_zinc() {
        return meal.get_zinc();
    }

    @Override
    public final Double get_zinc_coefficient() {
        return meal.get_zinc_coefficient();
    }

    @Override
    public final Double get_folate() {
        return meal.get_folate();
    }

    @Override
    public final Double get_folate_coefficient() {
        return meal.get_folate_coefficient();
    }

    @Override
    public final Double get_niacin() {
        return meal.get_niacin();
    }

    @Override
    public final Double get_niacin_coefficient() {
        return meal.get_niacin_coefficient();
    }

    @Override
    public final Double get_pantothenic_acid() {
        return meal.get_pantothenic_acid();
    }

    @Override
    public final Double get_pantothenic_acid_coefficient() {
        return meal.get_pantothenic_acid_coefficient();
    }

    @Override
    public final Double get_riboflavin() {
        return meal.get_riboflavin();
    }

    @Override
    public final Double get_riboflavin_coefficient() {
        return meal.get_riboflavin_coefficient();
    }

    @Override
    public final Double get_thiamin() {
        return meal.get_thiamin();
    }

    @Override
    public final Double get_thiamin_coefficient() {
        return meal.get_thiamin_coefficient();
    }

    @Override
    public final Double get_vitamin_a() {
        return meal.get_vitamin_a();
    }

    @Override
    public final Double get_vitamin_a_coefficient() {
        return meal.get_vitamin_a_coefficient();
    }

    @Override
    public final Double get_vitamin_b12() {
        return meal.get_vitamin_b12();
    }

    @Override
    public final Double get_vitamin_b12_coefficient() {
        return meal.get_vitamin_b12_coefficient();
    }

    @Override
    public final Double get_vitamin_b6() {
        return meal.get_vitamin_b6();
    }

    @Override
    public final Double get_vitamin_b6_coefficient() {
        return meal.get_vitamin_b6_coefficient();
    }

    @Override
    public final Double get_vitamin_c() {
        return meal.get_vitamin_c();
    }

    @Override
    public final Double get_vitamin_c_coefficient() {
        return meal.get_vitamin_c_coefficient();
    }

    @Override
    public final Double get_vitamin_d() {
        return meal.get_vitamin_d();
    }

    @Override
    public final Double get_vitamin_d_coefficient() {
        return meal.get_vitamin_d_coefficient();
    }

    @Override
    public final Double get_vitamin_e() {
        return meal.get_vitamin_e();
    }

    @Override
    public final Double get_vitamin_e_coefficient() {
        return meal.get_vitamin_e_coefficient();
    }

    @Override
    public final Double get_vitamin_k() {
        return meal.get_vitamin_k();
    }

    @Override
    public final Double get_vitamin_k_coefficient() {
        return meal.get_vitamin_k_coefficient();
    }

    @Override
    public final Double get_choline() {
        return meal.get_choline();
    }

    @Override
    public final Double get_choline_coefficient() {
        return meal.get_choline_coefficient();
    }

    @Override
    public final Double get_glycemic_index() {
        return meal.get_glycemic_index();
    }

    @Override
    public final Double get_glycemic_load() {
        return meal.get_glycemic_load();
    }

    @Override
    public final Double get_glycemic_load_coefficient() {
        return meal.get_glycemic_load_coefficient();
    }

    @Override
    public final Double get_alpha_linolenic_acid() {
        return meal.get_alpha_linolenic_acid();
    }

    @Override
    public final Double get_alpha_linolenic_acid_coefficient() {
        return meal.get_alpha_linolenic_acid_coefficient();
    }

    @Override
    public final Double get_linoleic_acid() {
        return meal.get_linoleic_acid();
    }

    @Override
    public final Double get_linoleic_acid_coefficient() {
        return meal.get_linoleic_acid_coefficient();
    }

    @Override
    public final Double get_dha() {
        return meal.get_dha();
    }

    @Override
    public final Double get_dha_coefficient() {
        return meal.get_dha_coefficient();
    }

    @Override
    public final Double get_epa() {
        return meal.get_epa();
    }

    @Override
    public final Double get_epa_coefficient() {
        return meal.get_epa_coefficient();
    }

    @Override
    public final Double get_water() {
        return meal.get_water();
    }

    @Override
    public final Double get_water_coefficient() {
        return meal.get_water_coefficient();
    }

    @Override
    public final Double get_cost() {
        return meal.get_cost();
    }

    @Override
    public final Double get_cost_coefficient() {
        return meal.get_cost_coefficient();
    }

    @Override
    public final Double get_energy_alcohol() {
        return meal.get_energy_alcohol();
    }

    @Override
    public final Double get_energy_alcohol_coefficient() {
        return meal.get_energy_alcohol_coefficient();
    }

    @Override
    public final Double get_energy_digestible_carbohydrate() {
        return meal.get_energy_digestible_carbohydrate();
    }

    @Override
    public final Double get_energy_digestible_carbohydrate_coefficient() {
        return meal.get_energy_digestible_carbohydrate_coefficient();
    }

    @Override
    public final Double get_energy_digestible() {
        return meal.get_energy_digestible();
    }

    @Override
    public final Double get_energy_digestible_coefficient() {
        return meal.get_energy_digestible_coefficient();
    }

    @Override
    public final Double get_energy_fat() {
        return meal.get_energy_fat();
    }

    @Override
    public final Double get_energy_fat_coefficient() {
        return meal.get_energy_fat_coefficient();
    }

    @Override
    public final Double get_energy_protein() {
        return meal.get_energy_protein();
    }

    @Override
    public final Double get_energy_protein_coefficient() {
        return meal.get_energy_protein_coefficient();
    }

    @Override
    public final Double get_food_quotient() {
        return meal.get_food_quotient();
    }

    private Interface_food get_total() {
        Iterator it = list.iterator();
        Food_mutable mutable = new Food_mutable();
        Double weight = 0.0;
        Double energy_gross = 0.0;
        Double protein = 0.0;
        Double carbohydrate_by_difference = 0.0;
        Double fiber = 0.0;
        Double fat = 0.0;
        Double alcohol = 0.0;
        Double cholesterol = 0.0;
        Double monounsaturated_fat = 0.0;
        Double polyunsaturated_fat = 0.0;
        Double saturated_fat = 0.0;
        Double complete_protein = 0.0;
        Double calcium = 0.0;
        Double copper = 0.0;
        Double fluoride = 0.0;
        Double iron = 0.0;
        Double magnesium = 0.0;
        Double manganese = 0.0;
        Double phosphorus = 0.0;
        Double potassium = 0.0;
        Double selenium = 0.0;
        Double sodium = 0.0;
        Double zinc = 0.0;
        Double folate = 0.0;
        Double niacin = 0.0;
        Double pantothenic_acid = 0.0;
        Double riboflavin = 0.0;
        Double thiamin = 0.0;
        Double vitamin_a = 0.0;
        Double vitamin_b12 = 0.0;
        Double vitamin_b6 = 0.0;
        Double vitamin_c = 0.0;
        Double vitamin_d = 0.0;
        Double vitamin_e = 0.0;
        Double vitamin_k = 0.0;
        Double choline = 0.0;
        Double alphalinolenic_acid = 0.0;
        Double linoleic_acid = 0.0;
        Double dha = 0.0;
        Double epa = 0.0;
        Double water = 0.0;
        Double cost = 0.0;
        Double energy_alcohol = 0.0;
        Double energy_digestible_carbohydrate = 0.0;
        Double energy_digestible = 0.0;
        Double energy_fat = 0.0;
        Double energy_protein = 0.0;
        while (it.hasNext()) {
            Interface_food food = (Interface_food) it.next();
            weight += food.get_weight();
            energy_gross += food.get_energy_gross();
            protein += food.get_protein();
            carbohydrate_by_difference += food.get_carbohydrate_by_difference();
            fiber += food.get_fiber();
            fat += food.get_fat();
            alcohol += food.get_alcohol();
            cholesterol += food.get_cholesterol();
            monounsaturated_fat += food.get_monounsaturated_fat();
            polyunsaturated_fat += food.get_polyunsaturated_fat();
            saturated_fat += food.get_saturated_fat();
            complete_protein += food.get_complete_protein();
            calcium += food.get_calcium();
            copper += food.get_copper();
            fluoride += food.get_fluoride();
            iron += food.get_iron();
            magnesium += food.get_magnesium();
            manganese += food.get_manganese();
            phosphorus += food.get_phosphorus();
            potassium += food.get_potassium();
            selenium += food.get_selenium();
            sodium += food.get_sodium();
            zinc += food.get_zinc();
            folate += food.get_folate();
            niacin += food.get_niacin();
            pantothenic_acid += food.get_pantothenic_acid();
            riboflavin += food.get_riboflavin();
            thiamin += food.get_thiamin();
            vitamin_a += food.get_vitamin_a();
            vitamin_b12 += food.get_vitamin_b12();
            vitamin_b6 += food.get_vitamin_b6();
            vitamin_c += food.get_vitamin_c();
            vitamin_d += food.get_vitamin_d();
            vitamin_e += food.get_vitamin_e();
            vitamin_k += food.get_vitamin_k();
            choline += food.get_choline();
            alphalinolenic_acid += food.get_alpha_linolenic_acid();
            linoleic_acid += food.get_linoleic_acid();
            dha += food.get_dha();
            epa += food.get_epa();
            water += food.get_water();
            cost += food.get_cost();
            energy_alcohol += food.get_alcohol();
            energy_digestible_carbohydrate += food.get_energy_digestible_carbohydrate();
            energy_digestible += food.get_energy_digestible();
            energy_fat += food.get_energy_fat();
            energy_protein += food.get_energy_protein();
        }
        mutable.set_food_name(name);
        mutable.set_food_label(name);
        mutable.set_weight(weight);
        mutable.set_energy_gross(energy_gross);
        mutable.set_protein(protein);
        mutable.set_carbohydrate_by_difference(carbohydrate_by_difference);
        mutable.set_fiber(fiber);
        mutable.set_fat(fat);
        mutable.set_alcohol(alcohol);
        mutable.set_cholesterol(cholesterol);
        mutable.set_monounsaturated_fat(monounsaturated_fat);
        mutable.set_polyunsaturated_fat(polyunsaturated_fat);
        mutable.set_saturated_fat(saturated_fat);
        mutable.set_complete_protein(complete_protein);
        mutable.set_calcium(calcium);
        mutable.set_copper(copper);
        mutable.set_fluoride(fluoride);
        mutable.set_iron(iron);
        mutable.set_magnesium(magnesium);
        mutable.set_manganese(manganese);
        mutable.set_phosphorus(phosphorus);
        mutable.set_potassium(potassium);
        mutable.set_selenium(selenium);
        mutable.set_sodium(sodium);
        mutable.set_zinc(zinc);
        mutable.set_folate(folate);
        mutable.set_niacin(niacin);
        mutable.set_pantothenic_acid(pantothenic_acid);
        mutable.set_riboflavin(riboflavin);
        mutable.set_thiamin(thiamin);
        mutable.set_vitamin_a(vitamin_a);
        mutable.set_vitamin_b12(vitamin_b12);
        mutable.set_vitamin_b6(vitamin_b6);
        mutable.set_vitamin_c(vitamin_c);
        mutable.set_vitamin_d(vitamin_d);
        mutable.set_vitamin_e(vitamin_e);
        mutable.set_vitamin_k(vitamin_k);
        mutable.set_choline(choline);
        mutable.set_glycemic_index(get_meal_glycemic_index());
        mutable.set_alpha_linolenic_acid(alphalinolenic_acid);
        mutable.set_linoleic_acid(linoleic_acid);
        mutable.set_dha(dha);
        mutable.set_epa(epa);
        mutable.set_water(water);
        mutable.set_cost(cost);
        mutable.set_energy_alcohol(energy_alcohol);
        mutable.set_energy_digestible_carbohydrate(energy_digestible_carbohydrate);
        mutable.set_energy_digestible(energy_digestible);
        mutable.set_energy_fat(energy_fat);
        mutable.set_energy_protein(energy_protein);
        Interface_food happy_meal = mutable;
        return happy_meal;
    }

    private Double get_meal_glycemic_index() {
        Double total_digestible_carbohydrate = 0.0;
        Double meal_gi = 0.0;
        for (Interface_food food : list) {
            total_digestible_carbohydrate += food.get_digestible_carbohydrate();
        }
        for (Interface_food food : list) {
            meal_gi += (food.get_digestible_carbohydrate() / total_digestible_carbohydrate) * food.get_glycemic_index();
        }
        return meal_gi;
    }

    @Override
    public final String toString() {
        return name;
    }

    @Override
    public final int hashCode() {
        return name.hashCode();
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
        final Food_summator other = (Food_summator) obj;
        if (!Objects.equals(this.get_food_label(), other.get_food_label())) {
            return false;
        }
        if (!Objects.equals(this.get_food_name(), other.get_food_name())) {
            return false;
        }
        if (!Objects.equals(this.get_alcohol(), other.get_alcohol())) {
            return false;
        }
        if (!Objects.equals(this.get_alpha_linolenic_acid(), other.get_alpha_linolenic_acid())) {
            return false;
        }
        if (!Objects.equals(this.get_calcium(), other.get_calcium())) {
            return false;
        }
        if (!Objects.equals(this.get_carbohydrate_by_difference(), other.get_carbohydrate_by_difference())) {
            return false;
        }
        if (!Objects.equals(this.get_cholesterol(), other.get_cholesterol())) {
            return false;
        }
        if (!Objects.equals(this.get_choline(), other.get_choline())) {
            return false;
        }
        if (!Objects.equals(this.get_complete_protein(), other.get_complete_protein())) {
            return false;
        }
        if (!Objects.equals(this.get_copper(), other.get_copper())) {
            return false;
        }
        if (!Objects.equals(this.get_cost(), other.get_cost())) {
            return false;
        }
        if (!Objects.equals(this.get_dha(), other.get_dha())) {
            return false;
        }
        if (!Objects.equals(this.get_digestible_carbohydrate(), other.get_digestible_carbohydrate())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_alcohol(), other.get_energy_alcohol())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_digestible(), other.get_energy_digestible())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_digestible_carbohydrate(), other.get_energy_digestible_carbohydrate())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_fat(), other.get_energy_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_gross(), other.get_energy_gross())) {
            return false;
        }
        if (!Objects.equals(this.get_energy_protein(), other.get_energy_protein())) {
            return false;
        }
        if (!Objects.equals(this.get_epa(), other.get_epa())) {
            return false;
        }
        if (!Objects.equals(this.get_fat(), other.get_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_fiber(), other.get_fiber())) {
            return false;
        }
        if (!Objects.equals(this.get_fluoride(), other.get_fluoride())) {
            return false;
        }
        if (!Objects.equals(this.get_folate(), other.get_folate())) {
            return false;
        }
        if (!Objects.equals(this.get_iron(), other.get_iron())) {
            return false;
        }
        if (!Objects.equals(this.get_linoleic_acid(), other.get_linoleic_acid())) {
            return false;
        }
        if (!Objects.equals(this.get_magnesium(), other.get_magnesium())) {
            return false;
        }
        if (!Objects.equals(this.get_manganese(), other.get_manganese())) {
            return false;
        }
        if (!Objects.equals(this.get_monounsaturated_fat(), other.get_monounsaturated_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_niacin(), other.get_niacin())) {
            return false;
        }
        if (!Objects.equals(this.get_pantothenic_acid(), other.get_pantothenic_acid())) {
            return false;
        }
        if (!Objects.equals(this.get_phosphorus(), other.get_phosphorus())) {
            return false;
        }
        if (!Objects.equals(this.get_polyunsaturated_fat(), other.get_polyunsaturated_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_potassium(), other.get_potassium())) {
            return false;
        }
        if (!Objects.equals(this.get_protein(), other.get_protein())) {
            return false;
        }
        if (!Objects.equals(this.get_riboflavin(), other.get_riboflavin())) {
            return false;
        }
        if (!Objects.equals(this.get_saturated_fat(), other.get_saturated_fat())) {
            return false;
        }
        if (!Objects.equals(this.get_selenium(), other.get_selenium())) {
            return false;
        }
        if (!Objects.equals(this.get_sodium(), other.get_sodium())) {
            return false;
        }
        if (!Objects.equals(this.get_thiamin(), other.get_thiamin())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_a(), other.get_vitamin_a())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_b6(), other.get_vitamin_b6())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_b12(), other.get_vitamin_b12())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_c(), other.get_vitamin_c())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_d(), other.get_vitamin_d())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_e(), other.get_vitamin_e())) {
            return false;
        }
        if (!Objects.equals(this.get_vitamin_k(), other.get_vitamin_k())) {
            return false;
        }
        if (!Objects.equals(this.get_water(), other.get_water())) {
            return false;
        }
        if (!Objects.equals(this.get_weight(), other.get_weight())) {
            return false;
        }
        if (!Objects.equals(this.get_zinc(), other.get_zinc())) {
            return false;
        }
        return true;
    }
}
