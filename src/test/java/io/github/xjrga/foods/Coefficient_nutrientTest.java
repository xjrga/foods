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
public class Coefficient_nutrientTest {

    private static Coefficient_nutrient coefficients;

    public Coefficient_nutrientTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        coefficients = instantiate_coefficient_nutrient();
    }

    private static Coefficient_nutrient instantiate_coefficient_nutrient() {
        //meal 01
        ArrayList<Food> list = new ArrayList();
        Chef chef = new Chef();
        Honey honey = chef.get_glycemic_index_test_set().get_honey();
        Yogurt_greek_plain_nonfat yogurt_greek_plain_nonfat = chef.get_glycemic_index_test_set().get_yogurt_greek_plain_nonfat();
        list.add(honey);
        list.add(yogurt_greek_plain_nonfat);
        Coefficient_nutrient o = new Coefficient_nutrient(list);
        return o;
    }

    /**
     * Test of get_energy_gross_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_energy_gross_coefficients() {
        double[] expResult = new double[]{3.04, 0.59};
        double[] result = coefficients.get_energy_gross_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_protein_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_protein_coefficients() {
        double[] expResult = new double[]{0.003, 0.10189};
        double[] result = coefficients.get_protein_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_carbohydrate_by_difference_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_carbohydrate_by_difference_coefficients() {
        double[] expResult = new double[]{0.824, 0.036};
        double[] result = coefficients.get_carbohydrate_by_difference_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_fiber_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_fiber_coefficients() {
        double[] expResult = new double[]{0.002, 0.0};
        double[] result = coefficients.get_fiber_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_fat_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_fat_coefficients() {
        double[] expResult = new double[]{0.0, 0.0039000000000000003};
        double[] result = coefficients.get_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_alcohol_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_alcohol_coefficients() {
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = coefficients.get_alcohol_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_digestible_carbohydrate_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_digestible_carbohydrate_coefficients() {
        double[] expResult = new double[]{0.8220000000000001, 0.036000000000000004};
        double[] result = coefficients.get_digestible_carbohydrate_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_cholesterol_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_cholesterol_coefficients() {
        double[] expResult = new double[]{0.0, 0.05};
        double[] result = coefficients.get_cholesterol_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_monounsaturated_fat_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_monounsaturated_fat_coefficients() {
        double[] expResult = new double[]{0.0, 5.0E-4};
        double[] result = coefficients.get_monounsaturated_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_polyunsaturated_fat_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_polyunsaturated_fat_coefficients() {
        double[] expResult = new double[]{0.0, 1.0E-4};
        double[] result = coefficients.get_polyunsaturated_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_saturated_fat_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_saturated_fat_coefficients() {
        double[] expResult = new double[]{0.0, 0.0011};
        double[] result = coefficients.get_saturated_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_complete_protein_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_complete_protein_coefficients() {
        double[] expResult = new double[]{0.0, 0.10189999999999999};
        double[] result = coefficients.get_complete_protein_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_calcium_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_calcium_coefficients() {
        double[] expResult = new double[]{0.06, 1.1};
        double[] result = coefficients.get_calcium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_copper_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_copper_coefficients() {
        double[] expResult = new double[]{3.0E-4, 1.0E-4};
        double[] result = coefficients.get_copper_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_fluoride_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_fluoride_coefficients() {
        double[] expResult = new double[]{0.07, 0.0};
        double[] result = coefficients.get_fluoride_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_iron_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_iron_coefficients() {
        double[] expResult = new double[]{0.0042, 7.000000000000001E-4};
        double[] result = coefficients.get_iron_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_magnesium_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_magnesium_coefficients() {
        double[] expResult = new double[]{0.02, 0.11};
        double[] result = coefficients.get_magnesium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_manganese_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_manganese_coefficients() {
        double[] expResult = new double[]{8.0E-4, 8.999999999999999E-5};
        double[] result = coefficients.get_manganese_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_phosphorus_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_phosphorus_coefficients() {
        double[] expResult = new double[]{0.04, 1.35};
        double[] result = coefficients.get_phosphorus_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_potassium_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_potassium_coefficients() {
        double[] expResult = new double[]{0.52, 1.41};
        double[] result = coefficients.get_potassium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_selenium_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_selenium_coefficients() {
        double[] expResult = new double[]{0.008, 0.09699999999999999};
        double[] result = coefficients.get_selenium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_sodium_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_sodium_coefficients() {
        double[] expResult = new double[]{0.04, 0.36};
        double[] result = coefficients.get_sodium_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_zinc_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_zinc_coefficients() {
        double[] expResult = new double[]{0.0022, 0.0052};
        double[] result = coefficients.get_zinc_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_folate_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_folate_coefficients() {
        double[] expResult = new double[]{0.02, 0.07};
        double[] result = coefficients.get_folate_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_niacin_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_niacin_coefficients() {
        double[] expResult = new double[]{0.0012, 0.002};
        double[] result = coefficients.get_niacin_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_pantothenic_acid_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_pantothenic_acid_coefficients() {
        double[] expResult = new double[]{6.0E-4, 0.0033};
        double[] result = coefficients.get_pantothenic_acid_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_riboflavin_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_riboflavin_coefficients() {
        double[] expResult = new double[]{3.0E-4, 0.0027};
        double[] result = coefficients.get_riboflavin_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_thiamin_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_thiamin_coefficients() {
        double[] expResult = new double[]{0.0, 2.0E-4};
        double[] result = coefficients.get_thiamin_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_a_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_vitamin_a_coefficients() {
        double[] expResult = new double[]{0.0, 0.01};
        double[] result = coefficients.get_vitamin_a_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_b12_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_vitamin_b12_coefficients() {
        double[] expResult = new double[]{0.0, 0.0075};
        double[] result = coefficients.get_vitamin_b12_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_b6_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_vitamin_b6_coefficients() {
        double[] expResult = new double[]{2.0E-4, 6.0E-4};
        double[] result = coefficients.get_vitamin_b6_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_c_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_vitamin_c_coefficients() {
        double[] expResult = new double[]{0.005, 0.0};
        double[] result = coefficients.get_vitamin_c_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_d_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_vitamin_d_coefficients() {
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = coefficients.get_vitamin_d_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_e_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_vitamin_e_coefficients() {
        double[] expResult = new double[]{0.0, 1.0E-4};
        double[] result = coefficients.get_vitamin_e_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_vitamin_k_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_vitamin_k_coefficients() {
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = coefficients.get_vitamin_k_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_choline_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_choline_coefficients() {
        double[] expResult = new double[]{0.022000000000000002, 0.151};
        double[] result = coefficients.get_choline_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_glycemic_load_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_glycemic_load_coefficients() {
        double[] expResult = new double[]{0.45210000000000006, 0.005040000000000001};
        double[] result = coefficients.get_glycemic_load_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_alphalinolenic_acid_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_alphalinolenic_acid_coefficients() {
        double[] expResult = new double[]{0.0, 1.0E-5};
        double[] result = coefficients.get_alphalinolenic_acid_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_linoleic_acid_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_linoleic_acid_coefficients() {
        double[] expResult = new double[]{0.0, 1.0E-4};
        double[] result = coefficients.get_linoleic_acid_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_dha_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_dha_coefficients() {
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = coefficients.get_dha_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_epa_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_epa_coefficients() {
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = coefficients.get_epa_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_water_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_water_coefficients() {
        double[] expResult = new double[]{0.171, 0.851};
        double[] result = coefficients.get_water_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_cost_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_cost_coefficients() {
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = coefficients.get_cost_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_alcohol_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_energy_alcohol_coefficients() {
        double[] expResult = new double[]{0.0, 0.0};
        double[] result = coefficients.get_energy_alcohol_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_digestible_carbohydrate_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_energy_digestible_carbohydrate_coefficients() {
        double[] expResult = new double[]{3.2880000000000003, 0.14400000000000002};
        double[] result = coefficients.get_energy_digestible_carbohydrate_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_digestible_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_energy_digestible_coefficients() {
        double[] expResult = new double[]{3.3, 0.5867};
        double[] result = coefficients.get_energy_digestible_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_fat_coefficients method, of class Food_coefficients.
     */
    @Test
    public void testGet_energy_fat_coefficients() {
        double[] expResult = new double[]{0.0, 0.0351};
        double[] result = coefficients.get_energy_fat_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_no_protein_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_energy_no_protein_coefficients() {
        double[] expResult = new double[]{3.2880000000000003, 0.1791};
        double[] result = coefficients.get_energy_no_protein_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of get_energy_protein_coefficients method, of class
     * Food_coefficients.
     */
    @Test
    public void testGet_energy_protein_coefficients() {
        double[] expResult = new double[]{0.012, 0.40759999999999996};
        double[] result = coefficients.get_energy_protein_coefficients();
        Assert.assertArrayEquals(expResult, result, 0.00001);
    }

    /**
     * Test of toString method, of class Food_coefficients.
     */
    @Test
    public void testToString() {
        String expResult = "Foods:[Honey|Yogurt, Greek, plain, nonfat]\n"
                + "Alcohol:[0.0,0.0]\n"
                + "Alphalinolenic_acid:[0.0,1.0E-5]\n"
                + "Calcium:[0.06,1.1]\n"
                + "Carbohydrate_by_difference:[0.8240000000000001,0.036000000000000004]\n"
                + "Cholesterol:[0.0,0.05]\n"
                + "Choline:[0.022000000000000002,0.151]\n"
                + "Complete_protein:[0.0,0.10189999999999999]\n"
                + "Copper:[3.0E-4,1.0E-4]\n"
                + "Cost:[0.0,0.0]\n"
                + "Dha:[0.0,0.0]\n"
                + "Digestible_carbohydrate:[0.8220000000000001,0.036000000000000004]\n"
                + "Energy_alcohol:[0.0,0.0]\n"
                + "Energy_digestible_carbohydrate:[3.2880000000000003,0.14400000000000002]\n"
                + "Energy_digestible:[3.3,0.5867]\n"
                + "Energy_fat:[0.0,0.0351]\n"
                + "Energy_no_protein:[3.2880000000000003,0.1791]\n"
                + "Energy_protein:[0.012,0.40759999999999996]\n"
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
                + "Monounsaturated_fat:[0.0,5.0E-4]\n"
                + "Niacin:[0.0012,0.002]\n"
                + "Pantothenic_acid:[6.0E-4,0.0033]\n"
                + "Phosphorus:[0.04,1.35]\n"
                + "Polyunsaturated_fat:[0.0,1.0E-4]\n"
                + "Potassium:[0.52,1.41]\n"
                + "Protein:[0.003,0.10189999999999999]\n"
                + "Riboflavin:[3.0E-4,0.0027]\n"
                + "Saturated_fat:[0.0,0.0011]\n"
                + "Selenium:[0.008,0.09699999999999999]\n"
                + "Sodium:[0.04,0.36]\n"
                + "Thiamin:[0.0,2.0E-4]\n"
                + "Vitamin_a:[0.0,0.01]\n"
                + "Vitamin_b12:[0.0,0.0075]\n"
                + "Vitamin_b6:[2.0E-4,6.0E-4]\n"
                + "Vitamin_c:[0.005,0.0]\n"
                + "Vitamin_d:[0.0,0.0]\n"
                + "Vitamin_e:[0.0,1.0E-4]\n"
                + "Vitamin_k:[0.0,0.0]\n"
                + "Water:[0.171,0.851]\n"
                + "Zinc:[0.0022,0.0052]";
        String result = coefficients.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Food_coefficients.
     */
    @Test
    public void testHashCode() {
        int expResult = 522868384;
        int result = coefficients.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Food_coefficients.
     */
    @Test
    public void testEquals() {
        Coefficient_nutrient expResult = instantiate_coefficient_nutrient();
        assertEquals(expResult, coefficients.toString());
    }

}
