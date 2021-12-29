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

/**
 *
 * @author Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
 */
public enum Dri_list {

    children_1_3_y("Children (1–3 y)"),
    children_4_8_y("Children (4–8 y)"),
    children_9_13_y("Children (9–13 y)"),
    daily_value("Daily Value"),
    females_14_18_y("Females (14–18 y)"),
    females_19_30_y("Females (19–30 y)"),
    females_31_50_y("Females (31–50 y)"),
    females_51_70_y("Females (51–70 y)"),
    females_70_y("Females (> 70 y)"),
    females_9_13_y("Females (9–13 y)"),
    infants_0_6_mo("Infants (0–6 mo)"),
    infants_6_12_mo("Infants (6–12 mo"),
    lactation_14_18_y("Lactation (14–18 y)"),
    lactation_19_30_y("Lactation (19–30 y)"),
    lactation_31_50_y("Lactation (31–50 y)"),
    males_14_18_y("Males (14–18 y)"),
    males_19_30_y("Males (19–30 y)"),
    males_31_50_y("Males (31–50 y)"),
    males_51_70_y("Males (51–70 y)"),
    males_70_y("Males (> 70 y)"),
    pregnancy_14_18_y("Pregnancy (14–18 y)"),
    pregnancy_19_30_y("Pregnancy (19–30 y)"),
    pregnancy_31_50_y("Pregnancy (31–50 y)"),;

    private final String name;

    Dri_list(String label
    ) {
        this.name = label;
    }

    public String get_name() {
        return name;
    }

}
