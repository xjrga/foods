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
package io.github.xjrga.foods.fruits_and_fruit_juices;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Bananas_rawNGTest {

    private static Bananas_raw food;

    public Bananas_rawNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        food = new Bananas_raw();
    }

    //food_name
    @Test(enabled = true)
    public void test_food_name() {
        assertEquals("Bananas, raw", food.get_food_name());
    }

    //food_label
    @Test(enabled = true)
    public void test_food_label() {
        assertEquals("Bananas_raw", food.get_food_label());
    }

    //Alcohol, ethyl (g)
    @Test(enabled = true)
    public void test_alcohol() {
        assertEquals(0.0, food.get_alcohol(), 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test(enabled = true)
    public void test_alpha_linolenic_acid() {
        assertEquals(0.0, food.get_alpha_linolenic_acid(), 0.00001);
    }

    //calcium
    @Test(enabled = true)
    public void test_calcium() {
        assertEquals(5.0, food.get_calcium(), 0.00001);
    }

    //carbohydrate_by_difference
    @Test(enabled = true)
    public void test_carbohydrate_by_difference() {
        assertEquals(22.84, food.get_carbohydrate_by_difference(), 0.00001);
    }

    //cholesterol
    @Test(enabled = true)
    public void test_cholesterol() {
        assertEquals(0.0, food.get_cholesterol(), 0.00001);
    }

    //choline
    @Test(enabled = true)
    public void test_choline() {
        assertEquals(9.8, food.get_choline(), 0.00001);
    }

    //complete_protein
    @Test(enabled = true)
    public void test_complete_protein() {
        assertEquals(0.0, food.get_complete_protein(), 0.00001);
    }

    //copper
    @Test(enabled = true)
    public void test_copper() {
        assertEquals(0.07, food.get_copper(), 0.00001);
    }

    //cost
    @Test(enabled = true)
    public void test_cost() {
        assertEquals(0.0, food.get_cost(), 0.00001);
    }

    //dha
    @Test(enabled = true)
    public void test_dha() {
        assertEquals(0.0, food.get_dha(), 0.00001);
    }

    //epa
    @Test(enabled = true)
    public void test_epa() {
        assertEquals(0.0, food.get_epa(), 0.00001);
    }

    //fat
    @Test(enabled = true)
    public void test_fat() {
        assertEquals(0.33, food.get_fat(), 0.00001);
    }

    //fiber
    @Test(enabled = true)
    public void test_fiber() {
        assertEquals(2.6, food.get_fiber(), 0.00001);
    }

    //fluoride
    @Test(enabled = true)
    public void test_fluoride() {
        assertEquals(2.2, food.get_fluoride(), 0.00001);
    }

    //folate
    @Test(enabled = true)
    public void test_folate() {
        assertEquals(20.0, food.get_folate(), 0.00001);
    }

    //glycemic_index
    @Test(enabled = true)
    public void test_glycemic_index() {
        assertEquals(52.0, food.get_glycemic_index(), 0.00001);
    }

    //gross_energy
    @Test(enabled = true)
    public void test_gross_energy() {
        assertEquals(89.0, food.get_energy_gross(), 0.00001);
    }

    //iron
    @Test(enabled = true)
    public void test_iron() {
        assertEquals(0.26, food.get_iron(), 0.00001);
    }

    //linoleic_acid
    @Test(enabled = true)
    public void test_linoleic_acid() {
        assertEquals(0.0, food.get_linoleic_acid(), 0.00001);
    }

    //magnesium
    @Test(enabled = true)
    public void test_magnesium() {
        assertEquals(27.0, food.get_magnesium(), 0.00001);
    }

    //manganese
    @Test(enabled = true)
    public void test_manganese() {
        assertEquals(0.27, food.get_manganese(), 0.00001);
    }

    //monounsaturated_fat
    @Test(enabled = true)
    public void test_monounsaturated_fat() {
        assertEquals(0.03, food.get_monounsaturated_fat(), 0.00001);
    }

    //niacin
    @Test(enabled = true)
    public void test_niacin() {
        assertEquals(0.66, food.get_niacin(), 0.00001);
    }

    //pantothenic_acid
    @Test(enabled = true)
    public void test_pantothenic_acid() {
        assertEquals(0.33, food.get_pantothenic_acid(), 0.00001);
    }

    //phosphorus
    @Test(enabled = true)
    public void test_phosphorus() {
        assertEquals(22.0, food.get_phosphorus(), 0.00001);
    }

    //polyunsaturated_fat
    @Test(enabled = true)
    public void test_polyunsaturated_fat() {
        assertEquals(0.07, food.get_polyunsaturated_fat(), 0.00001);
    }

    //potassium
    @Test(enabled = true)
    public void test_potassium() {
        assertEquals(358.0, food.get_potassium(), 0.00001);
    }

    //protein
    @Test(enabled = true)
    public void test_protein() {
        assertEquals(1.09, food.get_protein(), 0.00001);
    }

    //riboflavin
    @Test(enabled = true)
    public void test_riboflavin() {
        assertEquals(0.07, food.get_riboflavin(), 0.00001);
    }

    //saturated_fat
    @Test(enabled = true)
    public void test_saturated_fat() {
        assertEquals(0.11, food.get_saturated_fat(), 0.00001);
    }

    //selenium
    @Test(enabled = true)
    public void test_selenium() {
        assertEquals(1.0, food.get_selenium(), 0.00001);
    }

    //sodium
    @Test(enabled = true)
    public void test_sodium() {
        assertEquals(1.0, food.get_sodium(), 0.00001);
    }

    //thiamin
    @Test(enabled = true)
    public void test_thiamin() {
        assertEquals(0.03, food.get_thiamin(), 0.00001);
    }

    //vitamin_a
    @Test(enabled = true)
    public void test_vitamin_a() {
        assertEquals(3.0, food.get_vitamin_a(), 0.00001);
    }

    //vitamin_b12
    @Test(enabled = true)
    public void test_vitamin_b12() {
        assertEquals(0.0, food.get_vitamin_b12(), 0.00001);
    }

    //vitamin_b6
    @Test(enabled = true)
    public void test_vitamin_b6() {
        assertEquals(0.36, food.get_vitamin_b6(), 0.00001);
    }

    //vitamin_c
    @Test(enabled = true)
    public void test_vitamin_c() {
        assertEquals(8.7, food.get_vitamin_c(), 0.00001);
    }

    //vitamin_d
    @Test(enabled = true)
    public void test_vitamin_d() {
        assertEquals(0.0, food.get_vitamin_d(), 0.00001);
    }

    //vitamin_e
    @Test(enabled = true)
    public void test_vitamin_e() {
        assertEquals(0.1, food.get_vitamin_e(), 0.00001);
    }

    //vitamin_k
    @Test(enabled = true)
    public void test_vitamin_k() {
        assertEquals(0.5, food.get_vitamin_k(), 0.00001);
    }

    //water
    @Test(enabled = true)
    public void test_water() {
        assertEquals(74.91, food.get_water(), 0.00001);
    }

    //weight
    @Test(enabled = true)
    public void test_weight() {
        assertEquals(100.0, food.get_weight(), 0.00001);
    }

    //zinc
    @Test(enabled = true)
    public void test_zinc() {
        assertEquals(0.15, food.get_zinc(), 0.00001);
    }
}
