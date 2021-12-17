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
public class Food_summator {

    private final ArrayList list;
    private String name;

    public Food_summator() {
        list = new ArrayList();
    }

    public final void set_name(String name) {
        this.name = name;
    }

    public final String get_name() {
        return name;
    }

    public void add(Food food) {
        list.add(food);
    }

    public void remove(Food food) {
        list.remove(food);
    }

    public final boolean contains(Food food) {
        return list.contains(food);
    }

    public final Iterator<Food> iterator() {
        return list.iterator();
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Abstract_category other = (Abstract_category) obj;
        return Objects.equals(this.name, other.get_name());
    }

    public Food get_total() {
        Iterator it = list.iterator();
        Abstract_food foods = new Food_impl_mutable();
        Double weight = 0.0;
        Double gross_energy = 0.0;
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
        while (it.hasNext()) {
            Food food = (Food) it.next();
            weight += food.get_weight();
            gross_energy += food.get_energy_gross();
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
        }
        foods.set_food_name("Total");
        foods.set_food_label("total");
        foods.set_weight(weight);
        foods.set_gross_energy(gross_energy);
        foods.set_protein(protein);
        foods.set_carbohydrate_by_difference(carbohydrate_by_difference);
        foods.set_fiber(fiber);
        foods.set_fat(fat);
        foods.set_alcohol(alcohol);
        foods.set_cholesterol(cholesterol);
        foods.set_monounsaturated_fat(monounsaturated_fat);
        foods.set_polyunsaturated_fat(polyunsaturated_fat);
        foods.set_saturated_fat(saturated_fat);
        foods.set_complete_protein(complete_protein);
        foods.set_calcium(calcium);
        foods.set_copper(copper);
        foods.set_fluoride(fluoride);
        foods.set_iron(iron);
        foods.set_magnesium(magnesium);
        foods.set_manganese(manganese);
        foods.set_phosphorus(phosphorus);
        foods.set_potassium(potassium);
        foods.set_selenium(selenium);
        foods.set_sodium(sodium);
        foods.set_zinc(zinc);
        foods.set_folate(folate);
        foods.set_niacin(niacin);
        foods.set_pantothenic_acid(pantothenic_acid);
        foods.set_riboflavin(riboflavin);
        foods.set_thiamin(thiamin);
        foods.set_vitamin_a(vitamin_a);
        foods.set_vitamin_b12(vitamin_b12);
        foods.set_vitamin_b6(vitamin_b6);
        foods.set_vitamin_c(vitamin_c);
        foods.set_vitamin_d(vitamin_d);
        foods.set_vitamin_e(vitamin_e);
        foods.set_vitamin_k(vitamin_k);
        foods.set_choline(choline);
        foods.set_glycemic_index(get_adjusted_glycemic_index());
        foods.set_alpha_linolenic_acid(alphalinolenic_acid);
        foods.set_linoleic_acid(linoleic_acid);
        foods.set_dha(dha);
        foods.set_epa(epa);
        foods.set_water(water);
        foods.set_cost(cost);
        return foods;
    }

    private Double get_adjusted_glycemic_index() {
        Iterator it = list.iterator();
        Double total_digestible_carbohydrate = 0.0;
        Double adjusted_gi = 0.0;
        while (it.hasNext()) {
            Food food = (Food) it.next();
            total_digestible_carbohydrate += food.get_digestible_carbohydrate();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Food food = (Food) it2.next();
            adjusted_gi += (food.get_digestible_carbohydrate() / total_digestible_carbohydrate) * food.get_glycemic_index();
        }
        return adjusted_gi;
    }

}
