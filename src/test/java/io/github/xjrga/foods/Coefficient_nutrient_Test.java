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

import io.github.xjrga.foods.data.Sweets.Honey;
import io.github.xjrga.foods.data.Dairy_and_egg_products.Yogurt_greek_plain_nonfat;
import java.util.ArrayList;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Coefficient_nutrient_Test {

    public Coefficient_nutrient_Test() {
    }

    @BeforeClass
    public static void one_time_setup() {

    }

    /**
     * Test of get_energy_gross_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_energy_gross_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{3.04, 0.59,};
        double[] result = o.get_energy_gross_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_protein_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_protein_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.003, 0.10189};
        double[] result = o.get_protein_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_carbohydrate_by_difference_coefficients method, of class
     * Food_o.
     */
    @Test
    public void testGet_carbohydrate_by_difference_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.824, 0.036};
        double[] result = o.get_carbohydrate_by_difference_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_fiber_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_fiber_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.002, 0.0};
        double[] result = o.get_fiber_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_fat_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_fat_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0039000000000000003};
        double[] result = o.get_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_alcohol_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_alcohol_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = o.get_alcohol_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_digestible_carbohydrate_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_digestible_carbohydrate_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.8220000000000001, 0.036000000000000004};
        double[] result = o.get_digestible_carbohydrate_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_cholesterol_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_cholesterol_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.05};
        double[] result = o.get_cholesterol_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_monounsaturated_fat_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_monounsaturated_fat_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 5.3E-4};
        double[] result = o.get_monounsaturated_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_polyunsaturated_fat_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_polyunsaturated_fat_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 1.2E-4};
        double[] result = o.get_polyunsaturated_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_saturated_fat_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_saturated_fat_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.00117};
        double[] result = o.get_saturated_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_complete_protein_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_complete_protein_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.10189999999999999};
        double[] result = o.get_complete_protein_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_calcium_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_calcium_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.06, 1.1};
        double[] result = o.get_calcium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_copper_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_copper_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{3.59999E-4, 1.7E-4};
        double[] result = o.get_copper_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_fluoride_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_fluoride_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.07, 0.0};
        double[] result = o.get_fluoride_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_iron_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_iron_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0042, 7.000000000000001E-4};
        double[] result = o.get_iron_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_magnesium_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_magnesium_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.02, 0.11};
        double[] result = o.get_magnesium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_manganese_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_manganese_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{8.0E-4, 8.999999999999999E-5};
        double[] result = o.get_manganese_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_phosphorus_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_phosphorus_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.04, 1.35};
        double[] result = o.get_phosphorus_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_potassium_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_potassium_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.52, 1.41};
        double[] result = o.get_potassium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_selenium_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_selenium_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.008, 0.09699999999999999};
        double[] result = o.get_selenium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_sodium_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_sodium_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.04, 0.36};
        double[] result = o.get_sodium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_zinc_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_zinc_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0022, 0.0052};
        double[] result = o.get_zinc_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_folate_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_folate_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.02, 0.07};
        double[] result = o.get_folate_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_niacin_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_niacin_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.00121, 0.00208};
        double[] result = o.get_niacin_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_pantothenic_acid_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_pantothenic_acid_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{6.8E-4, 0.00331};
        double[] result = o.get_pantothenic_acid_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_riboflavin_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_riboflavin_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{3.79999E-4, 0.00278};
        double[] result = o.get_riboflavin_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_thiamin_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_thiamin_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 2.3E-4};
        double[] result = o.get_thiamin_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_a_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_vitamin_a_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.01};
        double[] result = o.get_vitamin_a_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_b12_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_vitamin_b12_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0075};
        double[] result = o.get_vitamin_b12_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_b6_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_vitamin_b6_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{2.4E-4, 6.3E-4};
        double[] result = o.get_vitamin_b6_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_c_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_vitamin_c_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.005, 0.0};
        double[] result = o.get_vitamin_c_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_d_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_vitamin_d_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = o.get_vitamin_d_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_e_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_vitamin_e_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 1.0E-4};
        double[] result = o.get_vitamin_e_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_k_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_vitamin_k_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = o.get_vitamin_k_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_choline_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_choline_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.022000000000000002, 0.151};
        double[] result = o.get_choline_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_glycemic_load_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_glycemic_load_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.45210000000000006, 0.005040000000000001};
        double[] result = o.get_glycemic_load_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_alphalinolenic_acid_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_alphalinolenic_acid_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 1.0E-5};
        double[] result = o.get_alphalinolenic_acid_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_linoleic_acid_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_linoleic_acid_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 1.0E-4};
        double[] result = o.get_linoleic_acid_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_dha_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_dha_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = o.get_dha_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_epa_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_epa_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = o.get_epa_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_water_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_water_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.171, 0.851};
        double[] result = o.get_water_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_cost_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_cost_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = o.get_cost_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_alcohol_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_energy_alcohol_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = o.get_energy_alcohol_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_digestible_carbohydrate_coefficients method, of class
     * Food_o.
     */
    @Test
    public void testGet_energy_digestible_carbohydrate_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{3.02496, 0.14400000000000002};
        double[] result = o.get_energy_digestible_carbohydrate_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_digestible_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_energy_digestible_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{3.03504, 0.5867};
        double[] result = o.get_energy_digestible_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_fat_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_energy_fat_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.0, 0.0351};
        double[] result = o.get_energy_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_protein_coefficients method, of class Food_o.
     */
    @Test
    public void testGet_energy_protein_coefficients() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        double[] expResult = new double[]{0.01008, 0.40759999999999996};
        double[] result = o.get_energy_protein_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of toString method, of class Food_o.
     */
    @Test
    public void testToString() {
        ArrayList<Interface_food> list = new ArrayList();
        Interface_food honey = new Honey();
        Interface_food yogurt = new Yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        String expResult = "Foods:[Honey|Yogurt, Greek, plain, nonfat]\n"
                + "Alcohol:[0.0,0.0]\n"
                + "Alphalinolenic_acid:[0.0,1.0E-5]\n"
                + "Calcium:[0.06,1.1]\n"
                + "Carbohydrate_by_difference:[0.8240000000000001,0.036000000000000004]\n"
                + "Cholesterol:[0.0,0.05]\n"
                + "Choline:[0.022000000000000002,0.151]\n"
                + "Complete_protein:[0.0,0.10189999999999999]\n"
                + "Copper:[3.5999999999999997E-4,1.7E-4]\n"
                + "Cost:[0.0,0.0]\n"
                + "Dha:[0.0,0.0]\n"
                + "Digestible_carbohydrate:[0.8220000000000001,0.036000000000000004]\n"
                + "Energy_alcohol:[0.0,0.0]\n"
                + "Energy_digestible_carbohydrate:[3.0249600000000005,0.14400000000000002]\n"
                + "Energy_digestible:[3.0350400000000004,0.5867]\n"
                + "Energy_fat:[0.0,0.0351]\n"
                + "Energy_protein:[0.01008,0.40759999999999996]\n"
                + "Epa:[0.0,0.0]\n"
                + "Fat:[0.0,0.0039000000000000003]\n"
                + "Fiber:[0.002,0.0]\n"
                + "Fluoride:[0.07,0.0]\n"
                + "Folate:[0.02,0.07]\n"
                + "Glycemic_load:[0.45210000000000006,0.005040000000000001]\n"
                + "Gross_energy:[3.04,0.59]\n"
                + "Iron:[0.0042,7.000000000000001E-4]\n"
                + "Linoleic_acid:[0.0,1.0E-4]\n"
                + "Magnesium:[0.02,0.11]\n"
                + "Manganese:[8.0E-4,8.999999999999999E-5]\n"
                + "Monounsaturated_fat:[0.0,5.3E-4]\n"
                + "Niacin:[0.00121,0.00208]\n"
                + "Pantothenic_acid:[6.8E-4,0.00331]\n"
                + "Phosphorus:[0.04,1.35]\n"
                + "Polyunsaturated_fat:[0.0,1.2E-4]\n"
                + "Potassium:[0.52,1.41]\n"
                + "Protein:[0.003,0.10189999999999999]\n"
                + "Riboflavin:[3.7999999999999997E-4,0.0027800000000000004]\n"
                + "Saturated_fat:[0.0,0.00117]\n"
                + "Selenium:[0.008,0.09699999999999999]\n"
                + "Sodium:[0.04,0.36]\n"
                + "Thiamin:[0.0,2.3E-4]\n"
                + "Vitamin_a:[0.0,0.01]\n"
                + "Vitamin_b12:[0.0,0.0075]\n"
                + "Vitamin_b6:[2.4E-4,6.3E-4]\n"
                + "Vitamin_c:[0.005,0.0]\n"
                + "Vitamin_d:[0.0,0.0]\n"
                + "Vitamin_e:[0.0,1.0E-4]\n"
                + "Vitamin_k:[0.0,0.0]\n"
                + "Water:[0.171,0.851]\n"
                + "Zinc:[0.0022,0.0052]";
        String result = o.toString();
        assertEquals(expResult, result);
    }

}
