/*
 * Copyright (C) 2022 Jorge R Garcia de Alba &lt;jorge.r.garciadealba@gmail.com&gt;
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
package io.github.xjrga.foods.data;

/**
 * Dietary Reference Intake
 *
 */
public enum Dietary_reference_intake {

    Infants_0to6_mo_lower("Infants (0to6 mo)", 200.0, 0.3, 30.0, 100.0, 400.0, 110.0, 2.0, 0.2, 10.0, 0.0, 15.0, 400.0, 4.0, 10.0, 40.0, 0.2, 0.3, 2.0, 1.7, 0.1, 0.4, 125.0, 2.0, 65.0),
    Infants_6to12_mo_lower("Infants (6to12 mo", 260.0, 11.0, 75.0, 275.0, 860.0, 370.0, 3.0, 0.2, 500.0, 0.6, 20.0, 500.0, 5.0, 10.0, 50.0, 0.3, 0.4, 4.0, 1.8, 0.3, 0.5, 150.0, 2.5, 80.0),
    Children_1to3_y_lower("Children (1to3 y)", 700.0, 7.0, 80.0, 460.0, 2000.0, 800.0, 3.0, 0.3, 700.0, 1.2, 20.0, 300.0, 6.0, 15.0, 15.0, 0.5, 0.5, 6.0, 2.0, 0.5, 0.9, 200.0, 30.0, 150.0),
    Children_4to8_y_lower("Children (4to8 y)", 1000.0, 10.0, 130.0, 500.0, 2300.0, 1000.0, 5.0, 0.4, 1000.0, 1.5, 30.0, 400.0, 7.0, 15.0, 25.0, 0.6, 0.6, 8.0, 3.0, 0.6, 1.2, 250.0, 55.0, 200.0),
    Children_9to13_y_lower("Children (9to13 y)", 1300.0, 8.0, 240.0, 1250.0, 2500.0, 1200.0, 8.0, 0.7, 2000.0, 1.9, 40.0, 600.0, 11.0, 15.0, 45.0, 0.9, 0.9, 12.0, 4.0, 1.0, 1.8, 375.0, 60.0, 300.0),
    Males_14to18_y_lower("Males (14to18 y)", 1300.0, 11.0, 410.0, 1250.0, 3000.0, 1500.0, 11.0, 0.9, 3000.0, 2.2, 55.0, 900.0, 15.0, 15.0, 75.0, 1.2, 1.3, 16.0, 5.0, 1.3, 2.4, 550.0, 75.0, 400.0),
    Males_19to30_y_lower("Males (19to30 y)", 1000.0, 8.0, 400.0, 700.0, 3400.0, 1500.0, 11.0, 0.9, 4000.0, 2.3, 55.0, 900.0, 15.0, 15.0, 90.0, 1.2, 1.3, 16.0, 5.0, 1.3, 2.4, 550.0, 120.0, 400.0),
    Males_31to50_y_lower("Males (31to50 y)", 1000.0, 8.0, 420.0, 700.0, 3400.0, 1500.0, 11.0, 0.9, 4000.0, 2.3, 55.0, 900.0, 15.0, 15.0, 90.0, 1.2, 1.3, 16.0, 5.0, 1.3, 2.4, 550.0, 120.0, 400.0),
    Males_51to70_y_lower("Males (51to70 y)", 1000.0, 8.0, 420.0, 700.0, 3400.0, 1500.0, 11.0, 0.9, 4000.0, 2.3, 55.0, 900.0, 15.0, 15.0, 90.0, 1.2, 1.3, 16.0, 5.0, 1.7, 2.4, 550.0, 120.0, 400.0),
    Males_gt_70_y_lower("Males (> 70 y)", 1200.0, 8.0, 420.0, 700.0, 3400.0, 1500.0, 11.0, 0.9, 4000.0, 2.3, 55.0, 900.0, 15.0, 20.0, 90.0, 1.2, 1.3, 16.0, 5.0, 1.7, 2.4, 550.0, 120.0, 400.0),
    Females_9to13_y_lower("Females (9to13 y)", 1300.0, 8.0, 240.0, 1250.0, 2300.0, 1200.0, 8.0, 0.7, 2000.0, 1.6, 40.0, 600.0, 11.0, 15.0, 45.0, 0.9, 0.9, 12.0, 4.0, 1.0, 1.8, 375.0, 60.0, 300.0),
    Females_14to18_y_lower("Females (14to18 y)", 1300.0, 15.0, 360.0, 1250.0, 2300.0, 1500.0, 9.0, 0.9, 3000.0, 1.6, 55.0, 700.0, 15.0, 15.0, 65.0, 1.0, 1.0, 14.0, 5.0, 1.2, 2.4, 400.0, 75.0, 400.0),
    Females_19to30_y_lower("Females (19to30 y)", 1000.0, 18.0, 310.0, 700.0, 2600.0, 1500.0, 8.0, 0.9, 3000.0, 1.8, 55.0, 700.0, 15.0, 15.0, 75.0, 1.1, 1.1, 14.0, 5.0, 1.3, 2.4, 425.0, 90.0, 400.0),
    Females_31to50_y_lower("Females (31to50 y)", 1000.0, 18.0, 320.0, 700.0, 2600.0, 1500.0, 8.0, 0.9, 3000.0, 1.8, 55.0, 700.0, 15.0, 15.0, 75.0, 1.1, 1.1, 14.0, 5.0, 1.3, 2.4, 425.0, 90.0, 400.0),
    Females_51to70_y_lower("Females (51to70 y)", 1200.0, 8.0, 320.0, 700.0, 2600.0, 1500.0, 8.0, 0.9, 3000.0, 1.8, 55.0, 700.0, 15.0, 15.0, 75.0, 1.1, 1.1, 14.0, 5.0, 1.5, 2.4, 425.0, 90.0, 400.0),
    Females_gt_70_y_lower("Females (> 70 y)", 1200.0, 8.0, 320.0, 700.0, 2600.0, 1500.0, 8.0, 0.9, 3000.0, 1.8, 55.0, 700.0, 15.0, 20.0, 75.0, 1.1, 1.1, 14.0, 5.0, 1.5, 2.4, 425.0, 90.0, 400.0),
    Pregnancy_14to18_y_lower("Pregnancy (14to18 y)", 1300.0, 27.0, 400.0, 1250.0, 2600.0, 1500.0, 12.0, 1.0, 3000.0, 2.0, 60.0, 750.0, 15.0, 15.0, 80.0, 1.4, 1.4, 18.0, 6.0, 1.9, 2.6, 450.0, 75.0, 600.0),
    Pregnancy_19to30_y_lower("Pregnancy (19to30 y)", 1000.0, 27.0, 350.0, 700.0, 2900.0, 1500.0, 11.0, 1.0, 3000.0, 2.0, 60.0, 770.0, 15.0, 15.0, 85.0, 1.4, 1.4, 18.0, 6.0, 1.9, 2.6, 450.0, 90.0, 600.0),
    Pregnancy_31to50_y_lower("Pregnancy (31to50 y)", 1000.0, 27.0, 360.0, 700.0, 2900.0, 1500.0, 11.0, 1.0, 3000.0, 2.0, 60.0, 770.0, 15.0, 15.0, 85.0, 1.4, 1.4, 18.0, 6.0, 1.9, 2.6, 450.0, 90.0, 600.0),
    Lactation_14to18_y_lower("Lactation (14to18 y)", 1300.0, 10.0, 360.0, 1250.0, 2500.0, 1500.0, 13.0, 1.3, 3000.0, 2.6, 70.0, 1200.0, 19.0, 15.0, 115.0, 1.4, 1.6, 17.0, 7.0, 2.0, 2.8, 550.0, 75.0, 500.0),
    Lactation_19to30_y_lower("Lactation (19to30 y)", 1000.0, 9.0, 310.0, 700.0, 2800.0, 1500.0, 12.0, 1.3, 3000.0, 2.6, 70.0, 1300.0, 19.0, 15.0, 120.0, 1.4, 1.6, 17.0, 7.0, 2.0, 2.8, 550.0, 90.0, 500.0),
    Lactation_31to50_y_lower("Lactation (31to50 y)", 1000.0, 9.0, 320.0, 700.0, 2800.0, 1500.0, 12.0, 1.3, 3000.0, 2.6, 70.0, 1300.0, 19.0, 15.0, 120.0, 1.4, 1.6, 17.0, 7.0, 2.0, 2.8, 550.0, 90.0, 500.0),
    Infants_0to6_mo_upper("Infants (0to6 mo)", 1000.0, 40.0, 0.0, 0.0, 0.0, 0.0, 4.0, 0.0, 700.0, 0.0, 45.0, 600.0, 0.0, 25.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    Infants_6to12_mo_upper("Infants (6to12 mo", 1500.0, 40.0, 0.0, 0.0, 0.0, 0.0, 5.0, 0.0, 900.0, 0.0, 60.0, 600.0, 0.0, 38.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    Children_1to3_y_upper("Children (1to3 y)", 2500.0, 40.0, 65.0, 3000.0, 0.0, 0.0, 7.0, 1.0, 1300.0, 2.0, 90.0, 600.0, 200.0, 63.0, 400.0, 0.0, 0.0, 10.0, 0.0, 30.0, 0.0, 1000.0, 0.0, 300.0),
    Children_4to8_y_upper("Children (4to8 y)", 2500.0, 40.0, 110.0, 3000.0, 0.0, 0.0, 12.0, 3.0, 2200.0, 3.0, 150.0, 900.0, 300.0, 75.0, 650.0, 0.0, 0.0, 15.0, 0.0, 40.0, 0.0, 1000.0, 0.0, 400.0),
    Children_9to13_y_upper("Children (9to13 y)", 3000.0, 40.0, 350.0, 4000.0, 0.0, 0.0, 23.0, 5.0, 10000.0, 6.0, 280.0, 1700.0, 600.0, 100.0, 1200.0, 0.0, 0.0, 20.0, 0.0, 60.0, 0.0, 2000.0, 0.0, 600.0),
    Males_14to18_y_upper("Males (14to18 y)", 3000.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 34.0, 8.0, 10000.0, 9.0, 400.0, 2800.0, 800.0, 100.0, 1800.0, 0.0, 0.0, 30.0, 0.0, 80.0, 0.0, 3000.0, 0.0, 800.0),
    Males_19to30_y_upper("Males (19to30 y)", 2500.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Males_31to50_y_upper("Males (31to50 y)", 2500.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Males_51to70_y_upper("Males (51to70 y)", 2000.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Males_gt_70_y_upper("Males (> 70 y)", 2000.0, 45.0, 350.0, 3000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Females_9to13_y_upper("Females (9to13 y)", 3000.0, 40.0, 350.0, 4000.0, 0.0, 0.0, 23.0, 5.0, 10000.0, 6.0, 280.0, 1700.0, 600.0, 100.0, 1200.0, 0.0, 0.0, 20.0, 0.0, 60.0, 0.0, 2000.0, 0.0, 600.0),
    Females_14to18_y_upper("Females (14to18 y)", 3000.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 34.0, 8.0, 10000.0, 9.0, 400.0, 2800.0, 800.0, 100.0, 1800.0, 0.0, 0.0, 30.0, 0.0, 80.0, 0.0, 3000.0, 0.0, 800.0),
    Females_19to30_y_upper("Females (19to30 y)", 2500.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Females_31to50_y_upper("Females (31to50 y)", 2500.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Females_51to70_y_upper("Females (51to70 y)", 2000.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Females_gt_70_y_upper("Females (> 70 y)", 2000.0, 45.0, 350.0, 3000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Pregnancy_14to18_y_upper("Pregnancy (14to18 y)", 3000.0, 45.0, 350.0, 3500.0, 0.0, 0.0, 34.0, 8.0, 10000.0, 9.0, 400.0, 2800.0, 800.0, 100.0, 1800.0, 0.0, 0.0, 30.0, 0.0, 80.0, 0.0, 3000.0, 0.0, 800.0),
    Pregnancy_19to30_y_upper("Pregnancy (19to30 y)", 2500.0, 45.0, 350.0, 3500.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Pregnancy_31to50_y_upper("Pregnancy (31to50 y)", 2500.0, 45.0, 350.0, 3500.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Lactation_14to18_y_upper("Lactation (14to18 y)", 3000.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 34.0, 8.0, 10000.0, 9.0, 400.0, 2800.0, 800.0, 100.0, 1800.0, 0.0, 0.0, 30.0, 0.0, 80.0, 0.0, 3000.0, 0.0, 800.0),
    Lactation_19to30_y_upper("Lactation (19to30 y)", 2500.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0),
    Lactation_31to50_y_upper("Lactation (31to50 y)", 2500.0, 45.0, 350.0, 4000.0, 0.0, 0.0, 40.0, 10.0, 10000.0, 11.0, 400.0, 3000.0, 1000.0, 100.0, 2000.0, 0.0, 0.0, 35.0, 0.0, 100.0, 0.0, 3500.0, 0.0, 1000.0);

    private final String Name;
    private final Double Calcium;
    private final Double Iron;
    private final Double Magnesium;
    private final Double Phosphorus;
    private final Double Potassium;
    private final Double Sodium;
    private final Double Zinc;
    private final Double Copper;
    private final Double Fluoride;
    private final Double Manganese;
    private final Double Selenium;
    private final Double VitaminA;
    private final Double VitaminE;
    private final Double VitaminD;
    private final Double VitaminC;
    private final Double Thiamin;
    private final Double Riboflavin;
    private final Double Niacin;
    private final Double Pantothenic;
    private final Double VitaminB6;
    private final Double VitaminB12;
    private final Double Choline;
    private final Double VitaminK;
    private final Double Folate;

    Dietary_reference_intake(
            String Name,
            Double Calcium,
            Double Iron,
            Double Magnesium,
            Double Phosphorus,
            Double Potassium,
            Double Sodium,
            Double Zinc,
            Double Copper,
            Double Fluoride,
            Double Manganese,
            Double Selenium,
            Double VitaminA,
            Double VitaminE,
            Double VitaminD,
            Double VitaminC,
            Double Thiamin,
            Double Riboflavin,
            Double Niacin,
            Double Pantothenic,
            Double VitaminB6,
            Double VitaminB12,
            Double Choline,
            Double VitaminK,
            Double Folate
    ) {
        this.Name = Name;
        this.Calcium = Calcium;
        this.Iron = Iron;
        this.Magnesium = Magnesium;
        this.Phosphorus = Phosphorus;
        this.Potassium = Potassium;
        this.Sodium = Sodium;
        this.Zinc = Zinc;
        this.Copper = Copper;
        this.Fluoride = Fluoride;
        this.Manganese = Manganese;
        this.Selenium = Selenium;
        this.VitaminA = VitaminA;
        this.VitaminE = VitaminE;
        this.VitaminD = VitaminD;
        this.VitaminC = VitaminC;
        this.Thiamin = Thiamin;
        this.Riboflavin = Riboflavin;
        this.Niacin = Niacin;
        this.Pantothenic = Pantothenic;
        this.VitaminB6 = VitaminB6;
        this.VitaminB12 = VitaminB12;
        this.Choline = Choline;
        this.VitaminK = VitaminK;
        this.Folate = Folate;
    }

    public String get_food_label() {
        return this.name();
    }

    public String get_food_name() {
        return Name;
    }

    public Double get_calcium() {
        return Calcium;
    }

    public Double get_iron() {
        return Iron;
    }

    public Double get_magnesium() {
        return Magnesium;
    }

    public Double get_phosphorus() {
        return Phosphorus;
    }

    public Double get_potassium() {
        return Potassium;
    }

    public Double get_sodium() {
        return Sodium;
    }

    public Double get_zinc() {
        return Zinc;
    }

    public Double get_copper() {
        return Copper;
    }

    public Double get_fluoride() {
        return Fluoride;
    }

    public Double get_manganese() {
        return Manganese;
    }

    public Double get_selenium() {
        return Selenium;
    }

    public Double get_vitamin_a() {
        return VitaminA;
    }

    public Double get_vitamin_e() {
        return VitaminE;
    }

    public Double get_vitamin_d() {
        return VitaminD;
    }

    public Double get_vitamin_c() {
        return VitaminC;
    }

    public Double get_thiamin() {
        return Thiamin;
    }

    public Double get_riboflavin() {
        return Riboflavin;
    }

    public Double get_niacin() {
        return Niacin;
    }

    public Double get_pantothenic_acid() {
        return Pantothenic;
    }

    public Double get_vitamin_b6() {
        return VitaminB6;
    }

    public Double get_vitamin_b12() {
        return VitaminB12;
    }

    public Double get_choline() {
        return Choline;
    }

    public Double get_vitamin_k() {
        return VitaminK;
    }

    public Double get_folate() {
        return Folate;
    }

    public static String get_category_name() {
        return "DailyValue";
    }

    @Override
    public String toString() {
        return get_food_name();
    }
}
