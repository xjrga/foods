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

import io.github.xjrga.foods.glycemic_index_test_set.Honey;
import io.github.xjrga.foods.glycemic_index_test_set.Yogurt_greek_plain_nonfat;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summatorNGTest_02 {

    private static Food_summator summator;
    private static Food food;

    public Food_summatorNGTest_02() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        summator = new Food_summator();
        Chef chef = new Chef();
        Honey honey = chef.get_glycemic_index_test_set().get_honey();
        Yogurt_greek_plain_nonfat yogurt_greek_plain_nonfat = chef.get_glycemic_index_test_set().get_yogurt_greek_plain_nonfat();
        Food_multiplier honey_multiplier = new Food_multiplier(honey);
        honey_multiplier.set_food_quantity(1000.0);
        Food_multiplier yogurt_multiplier = new Food_multiplier(yogurt_greek_plain_nonfat);
        yogurt_multiplier.set_food_quantity(1000.0);
        summator.set_name("Total");
        summator.add(honey_multiplier);
        summator.add(yogurt_multiplier);
        food = summator.get_total();
    }

    //food_name
    @Test(enabled = true)
    public void test_food_name() {
        assertEquals(food.get_food_name(), "Total");
    }

    //food_label
    @Test(enabled = true)
    public void test_food_label() {
        assertEquals(food.get_food_label(), "total");
    }

    //Alcohol, ethyl (g)
    @Test(enabled = true)
    public void test_alcohol() {
        assertEquals(food.get_alcohol(), 0.0, 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test(enabled = true)
    public void test_alpha_linolenic_acid() {
        assertEquals(food.get_alpha_linolenic_acid(), 0.01, 0.00001);
    }

    //calcium
    @Test(enabled = true)
    public void test_calcium() {
        assertEquals(food.get_calcium(), 1160.0, 0.00001);
    }

    //carbohydrate_by_difference
    @Test(enabled = true)
    public void test_carbohydrate_by_difference() {
        assertEquals(food.get_carbohydrate_by_difference(), 860.0, 0.00001);
    }

    //cholesterol
    @Test(enabled = true)
    public void test_cholesterol() {
        assertEquals(food.get_cholesterol(), 50.0, 0.00001);
    }

    //choline
    @Test(enabled = true)
    public void test_choline() {
        assertEquals(food.get_choline(), 173.0, 0.00001);
    }

    //complete_protein
    @Test(enabled = true)
    public void test_complete_protein() {
        assertEquals(food.get_complete_protein(), 101.9, 0.00001);
    }

    //copper
    @Test(enabled = true)
    public void test_copper() {
        assertEquals(food.get_copper(), 0.4, 0.00001);
    }

    //cost
    @Test(enabled = true)
    public void test_cost() {
        assertEquals(food.get_cost(), 0.0, 0.00001);
    }

    //dha
    @Test(enabled = true)
    public void test_dha() {
        assertEquals(food.get_dha(), 0.0, 0.00001);
    }

    //epa
    @Test(enabled = true)
    public void test_epa() {
        assertEquals(food.get_epa(), 0.0, 0.00001);
    }

    //fat
    @Test(enabled = true)
    public void test_fat() {
        assertEquals(food.get_fat(), 3.9, 0.00001);
    }

    //fiber
    @Test(enabled = true)
    public void test_fiber() {
        assertEquals(food.get_fiber(), 2.0, 0.00001);
    }

    //fluoride
    @Test(enabled = true)
    public void test_fluoride() {
        assertEquals(food.get_fluoride(), 70.0, 0.00001);
    }

    //folate
    @Test(enabled = true)
    public void test_folate() {
        assertEquals(food.get_folate(), 90.0, 0.00001);
    }

    //glycemic_index
    @Test(enabled = true)
    public void test_glycemic_index() {
        assertEquals(food.get_glycemic_index(), 53.27972, 0.00001);
    }

    //energy_gross
    @Test(enabled = true)
    public void test_energy_gross() {
        assertEquals(food.get_energy_gross(), 3630.0, 0.00001);
    }

    //iron
    @Test(enabled = true)
    public void test_iron() {
        assertEquals(food.get_iron(), 4.9, 0.00001);
    }

    //linoleic_acid
    @Test(enabled = true)
    public void test_linoleic_acid() {
        assertEquals(food.get_linoleic_acid(), 0.1, 0.00001);
    }

    //magnesium
    @Test(enabled = true)
    public void test_magnesium() {
        assertEquals(food.get_magnesium(), 130.0, 0.00001);
    }

    //manganese
    @Test(enabled = true)
    public void test_manganese() {
        assertEquals(food.get_manganese(), 0.89, 0.00001);
    }

    //monounsaturated_fat
    @Test(enabled = true)
    public void test_monounsaturated_fat() {
        assertEquals(food.get_monounsaturated_fat(), 0.5, 0.00001);
    }

    //niacin
    @Test(enabled = true)
    public void test_niacin() {
        assertEquals(food.get_niacin(), 3.2, 0.00001);
    }

    //pantothenic_acid
    @Test(enabled = true)
    public void test_pantothenic_acid() {
        assertEquals(food.get_pantothenic_acid(), 3.9, 0.00001);
    }

    //phosphorus
    @Test(enabled = true)
    public void test_phosphorus() {
        assertEquals(food.get_phosphorus(), 1390.0, 0.00001);
    }

    //polyunsaturated_fat
    @Test(enabled = true)
    public void test_polyunsaturated_fat() {
        assertEquals(food.get_polyunsaturated_fat(), 0.1, 0.00001);
    }

    //potassium
    @Test(enabled = true)
    public void test_potassium() {
        assertEquals(food.get_potassium(), 1930.0, 0.00001);
    }

    //protein
    @Test(enabled = true)
    public void test_protein() {
        assertEquals(food.get_protein(), 104.9, 0.00001);
    }

    //riboflavin
    @Test(enabled = true)
    public void test_riboflavin() {
        assertEquals(food.get_riboflavin(), 3.0, 0.00001);
    }

    //saturated_fat
    @Test(enabled = true)
    public void test_saturated_fat() {
        assertEquals(food.get_saturated_fat(), 1.1, 0.00001);
    }

    //selenium
    @Test(enabled = true)
    public void test_selenium() {
        assertEquals(food.get_selenium(), 105.0, 0.00001);
    }

    //sodium
    @Test(enabled = true)
    public void test_sodium() {
        assertEquals(food.get_sodium(), 400.0, 0.00001);
    }

    //thiamin
    @Test(enabled = true)
    public void test_thiamin() {
        assertEquals(food.get_thiamin(), 0.2, 0.00001);
    }

    //vitamin_a
    @Test(enabled = true)
    public void test_vitamin_a() {
        assertEquals(food.get_vitamin_a(), 10.0, 0.00001);
    }

    //vitamin_b12
    @Test(enabled = true)
    public void test_vitamin_b12() {
        assertEquals(food.get_vitamin_b12(), 7.5, 0.00001);
    }

    //vitamin_b6
    @Test(enabled = true)
    public void test_vitamin_b6() {
        assertEquals(food.get_vitamin_b6(), 0.8, 0.00001);
    }

    //vitamin_c
    @Test(enabled = true)
    public void test_vitamin_c() {
        assertEquals(food.get_vitamin_c(), 5.0, 0.00001);
    }

    //vitamin_d
    @Test(enabled = true)
    public void test_vitamin_d() {
        assertEquals(food.get_vitamin_d(), 0.0, 0.00001);
    }

    //vitamin_e
    @Test(enabled = true)
    public void test_vitamin_e() {
        assertEquals(food.get_vitamin_e(), 0.1, 0.00001);
    }

    //vitamin_k
    @Test(enabled = true)
    public void test_vitamin_k() {
        assertEquals(food.get_vitamin_k(), 0.0, 0.00001);
    }

    //water
    @Test(enabled = true)
    public void test_water() {
        assertEquals(food.get_water(), 1022.0, 0.00001);
    }

    //weight
    @Test(enabled = true)
    public void test_weight() {
        assertEquals(food.get_weight(), 2000.0, 0.00001);
    }

    //zinc
    @Test(enabled = true)
    public void test_zinc() {
        assertEquals(food.get_zinc(), 7.4, 0.00001);
    }

    //glycemic load
    @Test(enabled = true)
    public void test_glycemic_load() {
        assertEquals(food.get_glycemic_load(), 457.14, 0.00001);
    }

    //energy_alcohol
    @Test(enabled = true)
    public void test_energy_alcohol() {
        assertEquals(food.get_energy_alcohol(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test(enabled = true)
    public void test_energy_digestible_carbohydrate() {
        assertEquals(food.get_energy_digestible_carbohydrate(), 3432.0, 0.00001);
    }

    //energy_digestible
    @Test(enabled = true)
    public void test_energy_digestible() {
        assertEquals(food.get_energy_digestible(), 3886.7, 0.00001);
    }

    //energy_fat
    @Test(enabled = true)
    public void test_energy_fat() {
        assertEquals(food.get_energy_fat(), 35.1, 0.00001);
    }

    //energy_no_protein
    @Test(enabled = true)
    public void test_energy_no_protein() {
        assertEquals(food.get_energy_no_protein(), 3467.1, 0.00001);
    }

    //energy_protein
    @Test(enabled = true)
    public void test_energy_protein() {
        assertEquals(food.get_energy_protein(), 419.6, 0.00001);
    }

    //digestible_carbohydrate
    @Test(enabled = true)
    public void test_digestible_carbohydrate() {
        assertEquals(food.get_digestible_carbohydrate(), 858.0, 0.00001);
    }

}
