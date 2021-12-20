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
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summatorTest_01 {

    private static Food_summator summator;

    public Food_summatorTest_01() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ArrayList<Food> list = new ArrayList();
        Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        Food_multiplier sardine_multiplier = new Food_multiplier(sardine, 1000.0);
        Tomato_products_canned_puree_without_salt_added tomato = new Tomato_products_canned_puree_without_salt_added();
        Food_multiplier tomato_multiplier = new Food_multiplier(tomato, 1000.0);
        list.add(sardine_multiplier);
        list.add(tomato_multiplier);
        summator = new Food_summator(list, "Meal_01");
    }

    //food_name
    @Test
    public void test_food_name() {
        assertEquals(summator.get_food_name(), "Meal_01");
    }

    //food_label
    @Test
    public void test_food_label() {
        assertEquals(summator.get_food_label(), "Meal_01");
    }

    //Alcohol, ethyl (g)
    @Test
    public void test_alcohol() {
        assertEquals(summator.get_alcohol(), 0.0, 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test
    public void test_alpha_linolenic_acid() {
        assertEquals(summator.get_alpha_linolenic_acid(), 0.0, 0.00001);
    }

    //calcium
    @Test
    public void test_calcium() {
        assertEquals(summator.get_calcium(), 4000.0, 0.00001);
    }

    //carbohydrate_by_difference
    @Test
    public void test_carbohydrate_by_difference() {
        assertEquals(summator.get_carbohydrate_by_difference(), 89.8, 0.00001);
    }

    //cholesterol
    @Test
    public void test_cholesterol() {
        assertEquals(summator.get_cholesterol(), 1420.0, 0.00001);
    }

    //choline
    @Test
    public void test_choline() {
        assertEquals(summator.get_choline(), 926.0, 0.00001);
    }

    //complete_protein
    @Test
    public void test_complete_protein() {
        assertEquals(summator.get_complete_protein(), 246.2, 0.00001);
    }

    //copper
    @Test
    public void test_copper() {
        assertEquals(summator.get_copper(), 4.6, 0.00001);
    }

    //cost
    @Test
    public void test_cost() {
        assertEquals(summator.get_cost(), 0.0, 0.00001);
    }

    //dha
    @Test
    public void test_dha() {
        assertEquals(summator.get_dha(), 5.0, 0.00001);
    }

    //epa
    @Test
    public void test_epa() {
        assertEquals(summator.get_epa(), 4.7, 0.00001);
    }

    //fat
    @Test
    public void test_fat() {
        assertEquals(summator.get_fat(), 116.6, 0.00001);
    }

    //fiber
    @Test
    public void test_fiber() {
        assertEquals(summator.get_fiber(), 19.0, 0.00001);
    }

    //fluoride
    @Test
    public void test_fluoride() {
        assertEquals(summator.get_fluoride(), 0.0, 0.00001);
    }

    //folate
    @Test
    public void test_folate() {
        assertEquals(summator.get_folate(), 210.0, 0.00001);
    }

    //glycemic_index
    @Test
    public void test_glycemic_index() {
        assertEquals(summator.get_glycemic_index(), 0.0, 0.00001);
    }

    //energy_gross
    @Test
    public void test_energy_gross() {
        assertEquals(summator.get_energy_gross(), 2460.0, 0.00001);
    }

    //iron
    @Test
    public void test_iron() {
        assertEquals(summator.get_iron(), 47.0, 0.00001);
    }

    //linoleic_acid
    @Test
    public void test_linoleic_acid() {
        assertEquals(summator.get_linoleic_acid(), 0.0, 0.00001);
    }

    //magnesium
    @Test
    public void test_magnesium() {
        assertEquals(summator.get_magnesium(), 620.0, 0.00001);
    }

    //manganese
    @Test
    public void test_manganese() {
        assertEquals(summator.get_manganese(), 2.6, 0.00001);
    }

    //monounsaturated_fat
    @Test
    public void test_monounsaturated_fat() {
        assertEquals(summator.get_monounsaturated_fat(), 38.9, 0.00001);
    }

    //niacin
    @Test
    public void test_niacin() {
        assertEquals(summator.get_niacin(), 67.0, 0.00001);
    }

    //pantothenic_acid
    @Test
    public void test_pantothenic_acid() {
        assertEquals(summator.get_pantothenic_acid(), 10.8, 0.00001);
    }

    //phosphorus
    @Test
    public void test_phosphorus() {
        assertEquals(summator.get_phosphorus(), 5300.0, 0.00001);
    }

    //polyunsaturated_fat
    @Test
    public void test_polyunsaturated_fat() {
        assertEquals(summator.get_polyunsaturated_fat(), 52.2, 0.00001);
    }

    //potassium
    @Test
    public void test_potassium() {
        assertEquals(summator.get_potassium(), 8360.0, 0.00001);
    }

    //protein
    @Test
    public void test_protein() {
        assertEquals(summator.get_protein(), 262.7, 0.00001);
    }

    //riboflavin
    @Test
    public void test_riboflavin() {
        assertEquals(summator.get_riboflavin(), 3.0, 0.00001);
    }

    //saturated_fat
    @Test
    public void test_saturated_fat() {
        assertEquals(summator.get_saturated_fat(), 15.4, 0.00001);
    }

    //selenium
    @Test
    public void test_selenium() {
        assertEquals(summator.get_selenium(), 534.0, 0.00001);
    }

    //sodium
    @Test
    public void test_sodium() {
        assertEquals(summator.get_sodium(), 3350.0, 0.00001);
    }

    //thiamin
    @Test
    public void test_thiamin() {
        assertEquals(summator.get_thiamin(), 1.0, 0.00001);
    }

    //vitamin_a
    @Test
    public void test_vitamin_a() {
        assertEquals(summator.get_vitamin_a(), 580.0, 0.00001);
    }

    //vitamin_b12
    @Test
    public void test_vitamin_b12() {
        assertEquals(summator.get_vitamin_b12(), 89.4, 0.00001);
    }

    //vitamin_b6
    @Test
    public void test_vitamin_b6() {
        assertEquals(summator.get_vitamin_b6(), 2.8, 0.00001);
    }

    //vitamin_c
    @Test
    public void test_vitamin_c() {
        assertEquals(summator.get_vitamin_c(), 106.0, 0.00001);
    }

    //vitamin_d
    @Test
    public void test_vitamin_d() {
        assertEquals(summator.get_vitamin_d(), 48.0, 0.00001);
    }

    //vitamin_e
    @Test
    public void test_vitamin_e() {
        assertEquals(summator.get_vitamin_e(), 40.1, 0.00001);
    }

    //vitamin_k
    @Test
    public void test_vitamin_k() {
        assertEquals(summator.get_vitamin_k(), 60.0, 0.00001);
    }

    //water
    @Test
    public void test_water() {
        assertEquals(summator.get_water(), 1474.9, 0.00001);
    }

    //weight
    @Test
    public void test_weight() {
        assertEquals(summator.get_weight(), 2000.0, 0.00001);
    }

    //zinc
    @Test
    public void test_zinc() {
        assertEquals(summator.get_zinc(), 16.7, 0.00001);
    }

    //glycemic load
    @Test
    public void test_glycemic_load() {
        assertEquals(summator.get_glycemic_load(), 0.0, 0.00001);
    }

    //energy_alcohol
    @Test
    public void test_energy_alcohol() {
        assertEquals(summator.get_energy_alcohol(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test
    public void test_energy_digestible_carbohydrate() {
        assertEquals(summator.get_energy_digestible_carbohydrate(), 283.2, 0.00001);
    }

    //energy_digestible
    @Test
    public void test_energy_digestible() {
        assertEquals(summator.get_energy_digestible(), 2383.4, 0.00001);
    }

    //energy_fat
    @Test
    public void test_energy_fat() {
        assertEquals(summator.get_energy_fat(), 1049.4, 0.00001);
    }

    //energy_no_protein
    @Test
    public void test_energy_no_protein() {
        assertEquals(summator.get_energy_no_protein(), 1332.6, 0.00001);
    }

    //energy_protein
    @Test
    public void test_energy_protein() {
        assertEquals(summator.get_energy_protein(), 1050.8, 0.00001);
    }

    //digestible_carbohydrate
    @Test
    public void test_digestible_carbohydrate() {
        assertEquals(summator.get_digestible_carbohydrate(), 70.8, 0.00001);
    }

}
