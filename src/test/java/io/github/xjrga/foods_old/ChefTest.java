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
package io.github.xjrga.foods_old;

import io.github.xjrga.foods_old.Interface_food;
import io.github.xjrga.foods_old.Food;
import io.github.xjrga.foods_old.Interface_category;
import io.github.xjrga.foods_old.Food_mutable;
import io.github.xjrga.foods_old.The_list;
import io.github.xjrga.foods_old.Chef;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class ChefTest {

    public ChefTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of find_food method, of class Chef.
     */
    @Test
    public void testFind_food() {
        Chef instance = new Chef();
        String food_name_01 = The_list.FINFISH_AND_SHELLFISH_PRODUCTS.Fish_sardine_Atlantic_canned_in_oil_drained_solids_with_bone.get_name();
        Food_mutable mutable = new Food_mutable();
        mutable.set_food_name("Fish, sardine, Atlantic, canned in oil, drained solids with bone");
        mutable.set_food_label("fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone");
        mutable.set_alcohol(0.00000);
        mutable.set_alpha_linolenic_acid(0.00000);
        mutable.set_calcium(382.00000);
        mutable.set_carbohydrate_by_difference(0.00000);
        mutable.set_cholesterol(142.00000);
        mutable.set_choline(75.00000);
        mutable.set_complete_protein(24.62000);
        mutable.set_copper(0.18000);
        mutable.set_cost(0.00000);
        mutable.set_dha(0.50000);
        mutable.set_epa(0.47000);
        mutable.set_fat(11.45000);
        mutable.set_fiber(0.00000);
        mutable.set_fluoride(0.00000);
        mutable.set_folate(10.00000);
        mutable.set_glycemic_index(0.00000);
        mutable.set_energy_gross(208.00000);
        mutable.set_iron(2.92000);
        mutable.set_linoleic_acid(0.00000);
        mutable.set_magnesium(39.00000);
        mutable.set_manganese(0.10000);
        mutable.set_monounsaturated_fat(3.86000);
        mutable.set_niacin(5.24000);
        mutable.set_pantothenic_acid(0.64000);
        mutable.set_phosphorus(490.00000);
        mutable.set_polyunsaturated_fat(5.14000);
        mutable.set_potassium(397.00000);
        mutable.set_protein(24.62000);
        mutable.set_riboflavin(0.22000);
        mutable.set_saturated_fat(1.52000);
        mutable.set_selenium(52.70000);
        mutable.set_sodium(307.00000);
        mutable.set_thiamin(0.08000);
        mutable.set_vitamin_a(32.00000);
        mutable.set_vitamin_b12(8.94000);
        mutable.set_vitamin_b6(0.16000);
        mutable.set_vitamin_c(0.00000);
        mutable.set_vitamin_d(4.80000);
        mutable.set_vitamin_e(2.04000);
        mutable.set_vitamin_k(2.60000);
        mutable.set_water(59.61000);
        mutable.set_weight(100.00000);
        mutable.set_zinc(1.31000);
        Interface_food expResult = new Food(mutable);
        Interface_food result = instance.find_food(food_name_01);
        assertEquals(expResult, result);
    }

    /**
     * Test of get_food_list method, of class Chef.
     */
    @Ignore
    public void testGet_food_list() {
        String category_name = The_list.CATEGORIES.dairy_and_egg_products.get_name();
        Chef instance = new Chef();
        String expResult = "Dairy and Egg Products";
        String result = instance.get_food_list(category_name).get_name();
        assertEquals(expResult, result);
    }

    @Test
    public void test_get_categories_and_foods() {
        Chef instance = new Chef();
        for (The_list.CATEGORIES category : The_list.CATEGORIES.values()) {
            String category_name = category.get_name();
            Interface_category food_list = instance.get_food_list(category_name);
            System.out.println("\n" + "Category: " + food_list.toString());
            Iterator it = food_list.get_iterator();
            while (it.hasNext()) {
                Interface_food food = (Interface_food) it.next();
                System.out.println(food.toString());
            }
        }
        assertTrue(true);
    }
}
