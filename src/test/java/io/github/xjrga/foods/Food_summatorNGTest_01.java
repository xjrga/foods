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

import io.github.xjrga.foods.finfish_and_shellfish_products.Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone;
import io.github.xjrga.foods.vegetables_and_vegetable_products.Tomato_products_canned_puree_without_salt_added;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summatorNGTest_01 {

    private static Food_summator summator;
    private static Food food;

    public Food_summatorNGTest_01() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        summator = new Food_summator();
        Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        Food_multiplier sardine_multiplier = new Food_multiplier(sardine);
        sardine_multiplier.set_food_quantity(1000.0);
        Tomato_products_canned_puree_without_salt_added tomato = new Tomato_products_canned_puree_without_salt_added();
        Food_multiplier tomato_multiplier = new Food_multiplier(tomato);
        tomato_multiplier.set_food_quantity(1000.0);
        summator.set_name("Total");
        summator.add(sardine_multiplier);
        summator.add(tomato_multiplier);
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
        assertEquals(food.get_alpha_linolenic_acid(), 0.0, 0.00001);
    }

    //calcium
    @Test(enabled = true)
    public void test_calcium() {
        assertEquals(food.get_calcium(), 4000.0, 0.00001);
    }

    //carbohydrate_by_difference
    @Test(enabled = true)
    public void test_carbohydrate_by_difference() {
        assertEquals(food.get_carbohydrate_by_difference(), 89.8, 0.00001);
    }

    //cholesterol
    @Test(enabled = true)
    public void test_cholesterol() {
        assertEquals(food.get_cholesterol(), 1420.0, 0.00001);
    }

    //choline
    @Test(enabled = true)
    public void test_choline() {
        assertEquals(food.get_choline(), 926.0, 0.00001);
    }

    //complete_protein
    @Test(enabled = true)
    public void test_complete_protein() {
        assertEquals(food.get_complete_protein(), 246.2, 0.00001);
    }

    //copper
    @Test(enabled = true)
    public void test_copper() {
        assertEquals(food.get_copper(), 4.6, 0.00001);
    }

    //cost
    @Test(enabled = true)
    public void test_cost() {
        assertEquals(food.get_cost(), 0.0, 0.00001);
    }

    //dha
    @Test(enabled = true)
    public void test_dha() {
        assertEquals(food.get_dha(), 5.0, 0.00001);
    }

    //epa
    @Test(enabled = true)
    public void test_epa() {
        assertEquals(food.get_epa(), 4.7, 0.00001);
    }

    //fat
    @Test(enabled = true)
    public void test_fat() {
        assertEquals(food.get_fat(), 116.6, 0.00001);
    }

    //fiber
    @Test(enabled = true)
    public void test_fiber() {
        assertEquals(food.get_fiber(), 19.0, 0.00001);
    }

    //fluoride
    @Test(enabled = true)
    public void test_fluoride() {
        assertEquals(food.get_fluoride(), 0.0, 0.00001);
    }

    //folate
    @Test(enabled = true)
    public void test_folate() {
        assertEquals(food.get_folate(), 210.0, 0.00001);
    }

    //glycemic_index
    @Test(enabled = true)
    public void test_glycemic_index() {
        assertEquals(food.get_glycemic_index(), 0.0, 0.00001);
    }

    //energy_gross
    @Test(enabled = true)
    public void test_energy_gross() {
        assertEquals(food.get_energy_gross(), 2460.0, 0.00001);
    }

    //iron
    @Test(enabled = true)
    public void test_iron() {
        assertEquals(food.get_iron(), 47.0, 0.00001);
    }

    //linoleic_acid
    @Test(enabled = true)
    public void test_linoleic_acid() {
        assertEquals(food.get_linoleic_acid(), 0.0, 0.00001);
    }

    //magnesium
    @Test(enabled = true)
    public void test_magnesium() {
        assertEquals(food.get_magnesium(), 620.0, 0.00001);
    }

    //manganese
    @Test(enabled = true)
    public void test_manganese() {
        assertEquals(food.get_manganese(), 2.6, 0.00001);
    }

    //monounsaturated_fat
    @Test(enabled = true)
    public void test_monounsaturated_fat() {
        assertEquals(food.get_monounsaturated_fat(), 38.9, 0.00001);
    }

    //niacin
    @Test(enabled = true)
    public void test_niacin() {
        assertEquals(food.get_niacin(), 67.0, 0.00001);
    }

    //pantothenic_acid
    @Test(enabled = true)
    public void test_pantothenic_acid() {
        assertEquals(food.get_pantothenic_acid(), 10.8, 0.00001);
    }

    //phosphorus
    @Test(enabled = true)
    public void test_phosphorus() {
        assertEquals(food.get_phosphorus(), 5300.0, 0.00001);
    }

    //polyunsaturated_fat
    @Test(enabled = true)
    public void test_polyunsaturated_fat() {
        assertEquals(food.get_polyunsaturated_fat(), 52.2, 0.00001);
    }

    //potassium
    @Test(enabled = true)
    public void test_potassium() {
        assertEquals(food.get_potassium(), 8360.0, 0.00001);
    }

    //protein
    @Test(enabled = true)
    public void test_protein() {
        assertEquals(food.get_protein(), 262.7, 0.00001);
    }

    //riboflavin
    @Test(enabled = true)
    public void test_riboflavin() {
        assertEquals(food.get_riboflavin(), 3.0, 0.00001);
    }

    //saturated_fat
    @Test(enabled = true)
    public void test_saturated_fat() {
        assertEquals(food.get_saturated_fat(), 15.4, 0.00001);
    }

    //selenium
    @Test(enabled = true)
    public void test_selenium() {
        assertEquals(food.get_selenium(), 534.0, 0.00001);
    }

    //sodium
    @Test(enabled = true)
    public void test_sodium() {
        assertEquals(food.get_sodium(), 3350.0, 0.00001);
    }

    //thiamin
    @Test(enabled = true)
    public void test_thiamin() {
        assertEquals(food.get_thiamin(), 1.0, 0.00001);
    }

    //vitamin_a
    @Test(enabled = true)
    public void test_vitamin_a() {
        assertEquals(food.get_vitamin_a(), 580.0, 0.00001);
    }

    //vitamin_b12
    @Test(enabled = true)
    public void test_vitamin_b12() {
        assertEquals(food.get_vitamin_b12(), 89.4, 0.00001);
    }

    //vitamin_b6
    @Test(enabled = true)
    public void test_vitamin_b6() {
        assertEquals(food.get_vitamin_b6(), 2.8, 0.00001);
    }

    //vitamin_c
    @Test(enabled = true)
    public void test_vitamin_c() {
        assertEquals(food.get_vitamin_c(), 106.0, 0.00001);
    }

    //vitamin_d
    @Test(enabled = true)
    public void test_vitamin_d() {
        assertEquals(food.get_vitamin_d(), 48.0, 0.00001);
    }

    //vitamin_e
    @Test(enabled = true)
    public void test_vitamin_e() {
        assertEquals(food.get_vitamin_e(), 40.1, 0.00001);
    }

    //vitamin_k
    @Test(enabled = true)
    public void test_vitamin_k() {
        assertEquals(food.get_vitamin_k(), 60.0, 0.00001);
    }

    //water
    @Test(enabled = true)
    public void test_water() {
        assertEquals(food.get_water(), 1474.9, 0.00001);
    }

    //weight
    @Test(enabled = true)
    public void test_weight() {
        assertEquals(food.get_weight(), 2000.0, 0.00001);
    }

    //zinc
    @Test(enabled = true)
    public void test_zinc() {
        assertEquals(food.get_zinc(), 16.7, 0.00001);
    }

    //glycemic load
    @Test(enabled = true)
    public void test_glycemic_load() {
        assertEquals(food.get_glycemic_load(), 0.0, 0.00001);
    }

    //energy_alcohol
    @Test(enabled = true)
    public void test_energy_alcohol() {
        assertEquals(food.get_energy_alcohol(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test(enabled = true)
    public void test_energy_digestible_carbohydrate() {
        assertEquals(food.get_energy_digestible_carbohydrate(), 283.2, 0.00001);
    }

    //energy_digestible
    @Test(enabled = true)
    public void test_energy_digestible() {
        assertEquals(food.get_energy_digestible(), 2383.4, 0.00001);
    }

    //energy_fat
    @Test(enabled = true)
    public void test_energy_fat() {
        assertEquals(food.get_energy_fat(), 1049.4, 0.00001);
    }

    //energy_no_protein
    @Test(enabled = true)
    public void test_energy_no_protein() {
        assertEquals(food.get_energy_no_protein(), 1332.6, 0.00001);
    }

    //energy_protein
    @Test(enabled = true)
    public void test_energy_protein() {
        assertEquals(food.get_energy_protein(), 1050.8, 0.00001);
    }

    //digestible_carbohydrate
    @Test(enabled = true)
    public void test_digestible_carbohydrate() {
        assertEquals(food.get_digestible_carbohydrate(), 70.8, 0.00001);
    }

}
