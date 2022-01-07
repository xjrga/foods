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

import io.github.xjrga.foods.data.finfish_and_shellfish_products.Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone;
import io.github.xjrga.foods.data.glycemic_index_test_set.Honey;
import io.github.xjrga.foods.data.glycemic_index_test_set.Yogurt_greek_plain_nonfat;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Coefficient_food_Test {

    public Coefficient_food_Test() {
    }

    @BeforeClass
    public static void one_time_setup() {

    }

    @Test
    public void test_coefficients_01() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        Interface_food sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        list.add(honey);
        list.add(yogurt);
        list.add(sardine);
        Coefficient_food o = new Coefficient_food(list, honey);
        double[] expResult = new double[]{1, 0, 0};
        double[] result = o.get_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    @Test
    public void test_toString_01() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        Interface_food sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        list.add(honey);
        list.add(yogurt);
        list.add(sardine);
        Coefficient_food o = new Coefficient_food(list, honey);
        String expResult = "[Honey|Yogurt, Greek, plain, nonfat|Fish, sardine, Atlantic, canned in oil, drained solids with bone]\n"
                + "[1.0,0.0,0.0]";
        String result = o.toString();
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void test_coefficients_02() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        Interface_food sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        list.add(honey);
        list.add(yogurt);
        list.add(sardine);
        Coefficient_food o = new Coefficient_food(list, yogurt);
        double[] expResult = new double[]{0, 1, 0};
        double[] result = o.get_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    @Test
    public void test_toString_02() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        Interface_food sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        list.add(honey);
        list.add(yogurt);
        list.add(sardine);
        Coefficient_food o = new Coefficient_food(list, yogurt);
        String expResult = "[Honey|Yogurt, Greek, plain, nonfat|Fish, sardine, Atlantic, canned in oil, drained solids with bone]\n"
                + "[0.0,1.0,0.0]";
        String result = o.toString();
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void test_coefficients_03() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        Interface_food sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        list.add(honey);
        list.add(yogurt);
        list.add(sardine);
        Coefficient_food o = new Coefficient_food(list, sardine);
        double[] expResult = new double[]{0, 0, 1};
        double[] result = o.get_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    @Test
    public void test_toString_03() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        Interface_food sardine = new Fish_sardine_atlantic_canned_in_oil_drained_solids_with_bone();
        list.add(honey);
        list.add(yogurt);
        list.add(sardine);
        Coefficient_food o = new Coefficient_food(list, sardine);
        String expResult = "[Honey|Yogurt, Greek, plain, nonfat|Fish, sardine, Atlantic, canned in oil, drained solids with bone]\n"
                + "[0.0,0.0,1.0]";
        String result = o.toString();
        Assert.assertEquals(expResult, result);
    }
}
