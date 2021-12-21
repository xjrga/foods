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
import java.util.ArrayList;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
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
    public static void setUpClass() {
        coefficients = instantiate_coefficient_food();
    }

    private static Coefficient_food instantiate_coefficient_food() {
        ArrayList<Food> list = new ArrayList();
        Chef chef = new Chef();
        Honey honey = chef.get_glycemic_index_test_set().get_honey();
        Yogurt_greek_plain_nonfat yogurt_greek_plain_nonfat = chef.get_glycemic_index_test_set().get_yogurt_greek_plain_nonfat();
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
        assertEquals(expResult, coefficients.toString());
    }

}
