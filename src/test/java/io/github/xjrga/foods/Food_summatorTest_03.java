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
import io.github.xjrga.foods.glycemic_index_test_set.Honey;
import io.github.xjrga.foods.glycemic_index_test_set.Yogurt_greek_plain_nonfat;
import io.github.xjrga.foods.vegetables_and_vegetable_products.Tomato_products_canned_puree_without_salt_added;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_summatorTest_03 {

    private static Food_summator summator_03;

    public Food_summatorTest_03() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        //meal 01
        ArrayList<Food> list_01 = new ArrayList();
        Chef chef = new Chef();
        Honey honey = chef.get_glycemic_index_test_set().get_honey();
        Yogurt_greek_plain_nonfat yogurt_greek_plain_nonfat = chef.get_glycemic_index_test_set().get_yogurt_greek_plain_nonfat();
        Food_multiplier honey_multiplier = new Food_multiplier(honey, 1000.0);
        Food_multiplier yogurt_multiplier = new Food_multiplier(yogurt_greek_plain_nonfat, 1000.0);
        list_01.add(honey_multiplier);
        list_01.add(yogurt_multiplier);
        Food_summator summator_01 = new Food_summator(list_01, "Meal_01");
        //meal 02
        ArrayList<Food> list_02 = new ArrayList();
        Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        Food_multiplier sardine_multiplier = new Food_multiplier(sardine, 1000.0);
        Tomato_products_canned_puree_without_salt_added tomato = new Tomato_products_canned_puree_without_salt_added();
        Food_multiplier tomato_multiplier = new Food_multiplier(tomato, 1000.0);
        list_02.add(sardine_multiplier);
        list_02.add(tomato_multiplier);
        Food_summator summator_02 = new Food_summator(list_02, "Meal_02");
        //total
        ArrayList<Food> list_03 = new ArrayList();
        list_03.add(summator_01);
        list_03.add(summator_02);
        summator_03 = new Food_summator(list_03, "Total");
    }

    //food_name
    @Test
    public void test_food_name() {
        assertEquals(summator_03.get_food_name(), "Total");
    }

    //food_label
    @Test
    public void test_food_label() {
        assertEquals(summator_03.get_food_label(), "Total");
    }

    //Alcohol, ethyl (g)
    @Test
    public void test_alcohol() {
        assertEquals(summator_03.get_alcohol(), 0.0, 0.00001);
    }

    //18:3 n-3 c,c,c (Alpha-Linolenic) (g)
    @Test
    public void test_alpha_linolenic_acid() {
        assertEquals(summator_03.get_alpha_linolenic_acid(), 0.01, 0.00001);
    }

    //calcium
    @Test
    public void test_calcium() {
        assertEquals(summator_03.get_calcium(), 5160.0, 0.00001);
    }

    //carbohydrate_by_difference
    @Test
    public void test_carbohydrate_by_difference() {
        assertEquals(summator_03.get_carbohydrate_by_difference(), 949.8, 0.00001);
    }

    //cholesterol
    @Test
    public void test_cholesterol() {
        assertEquals(summator_03.get_cholesterol(), 1470.0, 0.00001);
    }

    //choline
    @Test
    public void test_choline() {
        assertEquals(summator_03.get_choline(), 1099.0, 0.00001);
    }

    //complete_protein
    @Test
    public void test_complete_protein() {
        assertEquals(summator_03.get_complete_protein(), 348.09999, 0.00001);
    }

    //copper
    @Test
    public void test_copper() {
        assertEquals(summator_03.get_copper(), 5.00000, 0.00001);
    }

    //cost
    @Test
    public void test_cost() {
        assertEquals(summator_03.get_cost(), 0.0, 0.00001);
    }

    //dha
    @Test
    public void test_dha() {
        assertEquals(summator_03.get_dha(), 5.0, 0.00001);
    }

    //epa
    @Test
    public void test_epa() {
        assertEquals(summator_03.get_epa(), 4.69999, 0.00001);
    }

    //fat
    @Test
    public void test_fat() {
        assertEquals(summator_03.get_fat(), 120.49999, 0.00001);
    }

    //fiber
    @Test
    public void test_fiber() {
        assertEquals(summator_03.get_fiber(), 21.0, 0.00001);
    }

    //fluoride
    @Test
    public void test_fluoride() {
        assertEquals(summator_03.get_fluoride(), 70.0, 0.00001);
    }

    //folate
    @Test
    public void test_folate() {
        assertEquals(summator_03.get_folate(), 300.0, 0.00001);
    }

    //glycemic_index
    @Test
    public void test_glycemic_index() {
        assertEquals(summator_03.get_glycemic_index(), 49.21834, 0.00001);
    }

    //energy_gross
    @Test
    public void test_energy_gross() {
        assertEquals(summator_03.get_energy_gross(), 6090.0, 0.00001);
    }

    //iron
    @Test
    public void test_iron() {
        assertEquals(summator_03.get_iron(), 51.9, 0.00001);
    }

    //linoleic_acid
    @Test
    public void test_linoleic_acid() {
        assertEquals(summator_03.get_linoleic_acid(), 0.1, 0.00001);
    }

    //magnesium
    @Test
    public void test_magnesium() {
        assertEquals(summator_03.get_magnesium(), 750.0, 0.00001);
    }

    //manganese
    @Test
    public void test_manganese() {
        assertEquals(summator_03.get_manganese(), 3.49, 0.00001);
    }

    //monounsaturated_fat
    @Test
    public void test_monounsaturated_fat() {
        assertEquals(summator_03.get_monounsaturated_fat(), 39.39999, 0.00001);
    }

    //niacin
    @Test
    public void test_niacin() {
        assertEquals(summator_03.get_niacin(), 70.2, 0.00001);
    }

    //pantothenic_acid
    @Test
    public void test_pantothenic_acid() {
        assertEquals(summator_03.get_pantothenic_acid(), 14.70, 0.00001);
    }

    //phosphorus
    @Test
    public void test_phosphorus() {
        assertEquals(summator_03.get_phosphorus(), 6690.0, 0.00001);
    }

    //polyunsaturated_fat
    @Test
    public void test_polyunsaturated_fat() {
        assertEquals(summator_03.get_polyunsaturated_fat(), 52.29999, 0.00001);
    }

    //potassium
    @Test
    public void test_potassium() {
        assertEquals(summator_03.get_potassium(), 10290.0, 0.00001);
    }

    //protein
    @Test
    public void test_protein() {
        assertEquals(summator_03.get_protein(), 367.59999, 0.00001);
    }

    //riboflavin
    @Test
    public void test_riboflavin() {
        assertEquals(summator_03.get_riboflavin(), 6.0, 0.00001);
    }

    //saturated_fat
    @Test
    public void test_saturated_fat() {
        assertEquals(summator_03.get_saturated_fat(), 16.5, 0.00001);
    }

    //selenium
    @Test
    public void test_selenium() {
        assertEquals(summator_03.get_selenium(), 639.0, 0.00001);
    }

    //sodium
    @Test
    public void test_sodium() {
        assertEquals(summator_03.get_sodium(), 3750.0, 0.00001);
    }

    //thiamin
    @Test
    public void test_thiamin() {
        assertEquals(summator_03.get_thiamin(), 1.2, 0.00001);
    }

    //vitamin_a
    @Test
    public void test_vitamin_a() {
        assertEquals(summator_03.get_vitamin_a(), 590.0, 0.00001);
    }

    //vitamin_b12
    @Test
    public void test_vitamin_b12() {
        assertEquals(summator_03.get_vitamin_b12(), 96.89999, 0.00001);
    }

    //vitamin_b6
    @Test
    public void test_vitamin_b6() {
        assertEquals(summator_03.get_vitamin_b6(), 3.59999, 0.00001);
    }

    //vitamin_c
    @Test
    public void test_vitamin_c() {
        assertEquals(summator_03.get_vitamin_c(), 111.0, 0.00001);
    }

    //vitamin_d
    @Test
    public void test_vitamin_d() {
        assertEquals(summator_03.get_vitamin_d(), 48.0, 0.00001);
    }

    //vitamin_e
    @Test
    public void test_vitamin_e() {
        assertEquals(summator_03.get_vitamin_e(), 40.2, 0.00001);
    }

    //vitamin_k
    @Test
    public void test_vitamin_k() {
        assertEquals(summator_03.get_vitamin_k(), 60.0, 0.00001);
    }

    //water
    @Test
    public void test_water() {
        assertEquals(summator_03.get_water(), 2496.89999, 0.00001);
    }

    //weight
    @Test
    public void test_weight() {
        assertEquals(summator_03.get_weight(), 4000.0, 0.00001);
    }

    //zinc
    @Test
    public void test_zinc() {
        assertEquals(summator_03.get_zinc(), 24.1, 0.00001);
    }

    //glycemic load
    @Test
    public void test_glycemic_load() {
        assertEquals(summator_03.get_glycemic_load(), 457.14, 0.00001);
    }

    //energy_alcohol
    @Test
    public void test_energy_alcohol() {
        assertEquals(summator_03.get_energy_alcohol(), 0.0, 0.00001);
    }

    //energy_digestible_carbohydrate
    @Test
    public void test_energy_digestible_carbohydrate() {
        assertEquals(summator_03.get_energy_digestible_carbohydrate(), 3715.2, 0.00001);
    }

    //energy_digestible
    @Test
    public void test_energy_digestible() {
        assertEquals(summator_03.get_energy_digestible(), 6270.1, 0.00001);
    }

    //energy_fat
    @Test
    public void test_energy_fat() {
        assertEquals(summator_03.get_energy_fat(), 1084.49999, 0.00001);
    }

    //energy_no_protein
    @Test
    public void test_energy_no_protein() {
        assertEquals(summator_03.get_energy_no_protein(), 4799.7, 0.00001);
    }

    //energy_protein
    @Test
    public void test_energy_protein() {
        assertEquals(summator_03.get_energy_protein(), 1470.39999, 0.00001);
    }

    //digestible_carbohydrate
    @Test
    public void test_digestible_carbohydrate() {
        assertEquals(summator_03.get_digestible_carbohydrate(), 928.8, 0.00001);
    }

}