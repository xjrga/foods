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

import io.github.xjrga.foods_old.The_list;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public class Food_categoriesTest {

    public Food_categoriesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Ignore
    public void testSomeMethod() {
        for (The_list.BAKED_PRODUCTS food : The_list.BAKED_PRODUCTS.values()) {
            System.out.println(food.get_name());
        }
        Assert.assertTrue(true);
    }

    @Ignore
    public void testSomeMethod_02() {
        for (The_list.CATEGORIES category : The_list.CATEGORIES.values()) {
            //System.out.println(category.get_name());
        }
        Assert.assertTrue(true);
    }
}
