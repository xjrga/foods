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
import io.github.xjrga.foods_old.The_list;
import io.github.xjrga.foods_old.Chef;
import io.github.xjrga.foods_old.Coefficient_food;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Coefficient_foodTest {

    private static Coefficient_food coefficients;

    public Coefficient_foodTest() {
    }

    @BeforeClass
    public static void one_time_setup() {
        coefficients = instantiate_coefficient_food();
    }

    private static Coefficient_food instantiate_coefficient_food() {
        ArrayList<Interface_food> list = new ArrayList();
        Chef chef = new Chef();
        String food_name_01 = The_list.SWEETS.Honey.get_name();
        Interface_food honey = chef.find_food(food_name_01);
        String food_name_02 = The_list.DAIRY_AND_EGG_PRODUCTS.Yogurt_Greek_plain_nonfat.get_name();
        Interface_food yogurt_greek_plain_nonfat = chef.find_food(food_name_02);
        list.add(honey);
        list.add(yogurt_greek_plain_nonfat);
        Coefficient_food o = new Coefficient_food(list, honey);
        return o;
    }

    /**
     * Test of get_coefficients method, of class Food_coefficients_02.
     */
    @Test
    public void testGet_coefficients() {
        double[] expResult = new double[]{1, 0};
        double[] result = coefficients.get_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);

    }

    /**
     * Test of toString method, of class Food_coefficients_02.
     */
    @Test
    public void testToString() {
        String expResult = "Foods:[Honey|Yogurt, Greek, plain, nonfat]\n"
                + "Food:[1.0,0.0]";
        String result = coefficients.toString();
        Assert.assertEquals(expResult, result);

    }

    /**
     * Test of hashCode method, of class Food_coefficients_02.
     */
    @Test
    public void testHashCode() {
        int expResult = 1493821687;
        int result = coefficients.hashCode();
        Assert.assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Food_coefficients_02.
     */
    @Test
    public void testEquals() {
        Coefficient_food expResult = instantiate_coefficient_food();
        Assert.assertEquals(expResult, coefficients);
    }

}
