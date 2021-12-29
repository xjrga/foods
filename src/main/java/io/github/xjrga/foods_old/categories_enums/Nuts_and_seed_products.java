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
package io.github.xjrga.foods_old.categories_enums;

import io.github.xjrga.foods_old.Interface_food;

/**
 * Nuts and seed products food subset from USDA National Nutrient Database for
 * Standard Reference, Release 28
 *
 */
public enum Nuts_and_seed_products implements Interface_food {

    //12037
    Seeds_sunflower_seed_kernels_dry_roasted_without_salt("Seeds, sunflower seed kernels, dry roasted, without salt", 100.0, 0.0, 0.0, 0.0, 19.33, 49.8, 24.07, 582.0, 0.0, 1.2, 11.1, 70.0, 3.8, 129.0, 1155.0, 850.0, 3.0, 5.29, 1.83, 0.0, 2.11, 79.3, 0.0, 26.1, 0.0, 1.4, 0.1, 0.24, 7.04, 7.04, 0.8, 0.0, 55.1, 2.7, 237.0, 0.0, 5.21, 0.0, 0.0, 9.5, 32.88, 0.0, 0.0),
    //12039
    Seeds_sunflower_seed_kernels_toasted_without_salt("Seeds, sunflower seed kernels, toasted, without salt", 100.0, 0.0, 0.0, 0.0, 17.21, 56.8, 20.59, 619.0, 0.0, 1.0, 11.5, 57.0, 6.81, 129.0, 1158.0, 491.0, 3.0, 5.3, 1.83, 0.0, 2.11, 0.0, 0.0, 0.0, 0.0, 1.4, 0.32, 0.28, 4.19, 7.05, 0.8, 0.0, 0.0, 0.0, 238.0, 0.0, 5.95, 0.0, 0.0, 10.84, 37.5, 0.0, 0.0),
    //12061
    Nuts_almonds("Nuts, almonds", 100.0, 0.0, 0.0, 0.0, 21.15, 49.93, 21.55, 579.0, 0.0, 4.41, 12.5, 269.0, 3.71, 270.0, 481.0, 733.0, 1.0, 3.12, 1.03, 0.0, 2.17, 4.1, 0.0, 25.63, 0.0, 0.0, 0.2, 1.13, 3.61, 0.47, 0.13, 0.0, 52.1, 0.0, 44.0, 0.0, 3.8, 0.0, 0.0, 31.55, 12.32, 12.32, 0.003),
    //12063
    Nuts_almonds_dry_roasted_without_salt_added("Nuts, almonds, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 20.96, 52.54, 21.01, 598.0, 0.0, 2.41, 10.9, 268.0, 3.73, 279.0, 471.0, 713.0, 3.0, 3.31, 1.09, 0.0, 2.23, 2.0, 0.0, 23.9, 0.0, 0.0, 0.07, 1.19, 3.63, 0.32, 0.13, 0.0, 52.1, 0.0, 55.0, 0.0, 4.09, 0.0, 0.0, 33.07, 12.95, 12.94, 0.006),
    //12085
    Nuts_cashew_nuts_dry_roasted_without_salt_added("Nuts, cashew nuts, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 15.31, 46.35, 32.69, 574.0, 0.0, 1.7, 3.0, 45.0, 6.0, 260.0, 490.0, 565.0, 16.0, 5.6, 2.22, 0.0, 0.82, 11.7, 0.0, 0.92, 0.0, 0.0, 0.2, 0.2, 1.4, 1.21, 0.25, 0.0, 61.0, 34.7, 69.0, 0.0, 9.15, 0.0, 0.0, 27.31, 7.83, 0.0, 0.0),
    //12087
    Nuts_cashew_nuts_raw("Nuts, cashew nuts, raw", 100.0, 0.0, 0.0, 0.0, 18.22, 43.85, 30.19, 553.0, 0.0, 5.2, 3.3, 37.0, 6.68, 292.0, 593.0, 660.0, 12.0, 5.78, 2.19, 0.0, 1.65, 19.9, 0.0, 0.9, 0.0, 0.5, 0.42, 0.05, 1.06, 0.86, 0.41, 0.0, 0.0, 34.1, 25.0, 0.0, 7.78, 0.0, 0.0, 23.79, 7.84, 0.0, 0.0),
    //12088
    Nuts_cashew_butter_plain_without_salt_added("Nuts, cashew butter, plain, without salt added", 100.0, 0.0, 0.0, 0.0, 17.56, 49.41, 27.57, 587.0, 0.0, 2.96, 2.0, 43.0, 5.03, 258.0, 457.0, 546.0, 15.0, 5.16, 2.19, 0.0, 0.81, 11.5, 0.0, 0.0, 0.0, 0.0, 0.31, 0.18, 1.59, 1.2, 0.25, 0.0, 0.0, 0.0, 68.0, 0.0, 9.76, 0.0, 0.0, 29.12, 8.35, 0.0, 0.0),
    //12122
    Nuts_hazelnuts_or_filberts_dry_roasted_without_salt_added("Nuts, hazelnuts or filberts, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 15.03, 62.4, 17.6, 646.0, 0.0, 2.52, 9.4, 123.0, 4.38, 173.0, 310.0, 755.0, 0.0, 2.5, 1.75, 0.0, 5.55, 4.1, 3.0, 15.28, 0.0, 3.8, 0.33, 0.12, 2.05, 0.92, 0.62, 0.0, 0.0, 0.0, 88.0, 0.0, 4.51, 0.0, 0.0, 46.6, 8.46, 0.0, 0.0),
    //12131
    Nuts_macadamia_nuts_raw("Nuts, macadamia nuts, raw", 100.0, 0.0, 0.0, 0.0, 7.91, 75.77, 13.82, 718.0, 0.0, 1.36, 8.6, 85.0, 3.69, 130.0, 188.0, 368.0, 5.0, 1.3, 0.75, 0.0, 4.13, 3.6, 0.0, 0.54, 0.0, 1.2, 1.19, 0.16, 2.47, 0.75, 0.27, 0.0, 0.0, 0.0, 11.0, 0.0, 12.06, 0.0, 0.0, 58.87, 1.5, 0.0, 0.0),
    //12132
    Nuts_macadamia_nuts_dry_roasted_without_salt_added("Nuts, macadamia nuts, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 7.79, 76.08, 13.38, 718.0, 0.0, 1.61, 8.0, 70.0, 2.65, 118.0, 198.0, 363.0, 4.0, 1.29, 0.57, 0.0, 3.03, 11.7, 0.0, 0.57, 0.0, 0.7, 0.71, 0.08, 2.27, 0.6, 0.35, 0.0, 44.6, 0.0, 10.0, 0.0, 11.94, 0.0, 0.0, 59.27, 1.49, 0.0, 0.0),
    //12135
    Nuts_mixed_nuts_dry_roasted_with_peanuts_without_salt_added("Nuts, mixed nuts, dry roasted, with peanuts, without salt added", 100.0, 0.0, 0.0, 0.0, 19.5, 53.5, 22.42, 607.0, 0.0, 2.13, 6.4, 87.0, 3.73, 227.0, 438.0, 643.0, 4.0, 4.06, 1.52, 0.0, 2.61, 9.3, 0.0, 6.13, 0.0, 0.8, 0.3, 0.4, 6.22, 0.0, 0.36, 0.0, 59.2, 12.0, 60.0, 0.0, 8.01, 0.0, 0.009, 34.53, 9.85, 9.74, 0.08),
    //12136
    Nuts_mixed_nuts_dry_roasted_with_peanuts_salt_added_PLANTERS_pistachio_blend("Nuts, mixed nuts, dry roasted, with peanuts, salt added, PLANTERS pistachio blend", 100.0, 0.0, 0.0, 0.0, 21.95, 49.3, 22.51, 580.0, 0.0, 2.91, 8.1, 129.0, 3.43, 209.0, 493.0, 758.0, 232.0, 3.42, 1.0, 0.0, 1.77, 11.0, 4.0, 5.65, 0.0, 0.0, 0.35, 0.57, 4.51, 0.0, 0.49, 0.0, 0.0, 0.0, 0.0, 0.0, 6.71, 0.0, 0.01, 27.61, 11.65, 11.53, 0.08),
    //12142
    Nuts_pecans("Nuts, pecans", 100.0, 0.0, 0.0, 0.0, 9.17, 71.97, 13.86, 691.0, 0.0, 3.52, 9.6, 70.0, 2.53, 121.0, 277.0, 410.0, 0.0, 4.53, 1.2, 10.0, 4.5, 3.8, 3.0, 1.4, 0.0, 1.1, 0.66, 0.13, 1.16, 0.86, 0.21, 0.0, 40.5, 3.5, 22.0, 0.0, 6.18, 0.0, 0.0, 40.8, 21.61, 0.0, 0.0),
    //12143
    Nuts_pecans_dry_roasted_without_salt_added("Nuts, pecans, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 9.5, 74.27, 13.55, 710.0, 0.0, 1.12, 9.4, 72.0, 2.8, 132.0, 293.0, 424.0, 1.0, 5.07, 1.16, 0.0, 3.93, 4.0, 7.0, 1.3, 0.0, 0.7, 0.45, 0.1, 1.16, 0.7, 0.18, 0.0, 0.0, 0.0, 16.0, 0.0, 6.28, 0.0, 0.0, 43.95, 20.57, 0.0, 0.0),
    //12151
    Nuts_pistachio_nuts_raw("Nuts, pistachio nuts, raw", 100.0, 0.0, 0.0, 0.0, 20.16, 45.32, 27.17, 560.0, 0.0, 4.37, 10.6, 105.0, 3.92, 121.0, 490.0, 1025.0, 1.0, 2.2, 1.3, 3.4, 1.2, 7.0, 26.0, 2.86, 0.0, 5.6, 0.87, 0.16, 1.3, 0.52, 1.7, 0.0, 0.0, 0.0, 51.0, 0.0, 5.9, 0.0, 0.0, 23.25, 14.38, 14.09, 0.0),
    //12152
    Nuts_pistachio_nuts_dry_roasted_without_salt_added("Nuts, pistachio nuts, dry roasted, without salt added", 100.0, 0.0, 0.0, 0.0, 21.05, 45.82, 28.28, 572.0, 0.0, 1.85, 10.3, 107.0, 4.03, 109.0, 469.0, 1007.0, 6.0, 2.34, 1.29, 0.0, 1.24, 10.0, 13.0, 2.17, 0.0, 3.0, 0.69, 0.23, 1.37, 0.51, 1.12, 0.0, 71.4, 13.2, 51.0, 0.0, 5.64, 0.0, 0.0, 24.53, 13.34, 13.12, 0.21),
    //12155
    Nuts_walnuts_english("Nuts, walnuts, english", 100.0, 0.0, 0.0, 0.0, 15.23, 65.21, 13.71, 654.0, 0.0, 4.07, 6.7, 98.0, 2.91, 158.0, 346.0, 441.0, 2.0, 3.09, 1.58, 0.0, 3.41, 4.9, 1.0, 0.7, 0.0, 1.3, 0.34, 0.15, 1.12, 0.57, 0.53, 0.0, 39.2, 2.7, 98.0, 0.0, 6.12, 0.0, 0.0, 8.93, 47.17, 0.0, 0.0),
    //12157
    Nuts_walnuts_dry_roasted_with_salt_added("Nuts, walnuts, dry roasted, with salt added", 100.0, 0.0, 0.0, 0.0, 14.29, 60.71, 17.86, 643.0, 0.0, 4.39, 7.1, 71.0, 2.57, 151.0, 329.0, 459.0, 643.0, 2.98, 1.48, 0.0, 0.0, 5.0, 1.0, 0.9, 0.0, 1.4, 0.52, 0.29, 2.21, 0.0, 0.52, 0.0, 38.0, 3.3, 91.0, 0.0, 5.35, 0.0, 0.0, 8.37, 44.18, 0.0, 0.0),
    //12206
    Nuts_almonds_honey_roasted_unblanched("Nuts, almonds, honey roasted, unblanched", 100.0, 0.0, 0.0, 0.0, 18.17, 49.9, 27.9, 594.0, 0.0, 1.7, 13.7, 263.0, 2.83, 240.0, 400.0, 560.0, 130.0, 2.6, 0.97, 0.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.7, 0.11, 0.95, 2.81, 0.25, 0.08, 0.0, 0.0, 0.0, 32.0, 0.0, 4.73, 0.0, 0.0, 32.4, 10.47, 0.0, 0.0),
    //12220
    Seeds_flaxseed("Seeds, flaxseed", 100.0, 0.0, 0.0, 0.0, 18.29, 42.16, 28.88, 534.0, 0.0, 6.96, 27.3, 255.0, 5.73, 392.0, 642.0, 813.0, 30.0, 4.34, 1.22, 0.0, 2.48, 25.4, 0.0, 0.31, 0.0, 0.6, 1.64, 0.16, 3.08, 0.98, 0.47, 0.0, 78.7, 4.3, 87.0, 0.0, 3.66, 0.0, 0.0, 7.52, 28.73, 0.0, 0.0),
    //kVJIZFHV4H
    Seeds_flaxseed_EFAs_("Seeds, flaxseed (EFAs)", 100.0, 0.0, 0.0, 0.0, 18.29, 42.16, 28.88, 534.0, 0.0, 6.96, 27.3, 255.0, 5.73, 392.0, 642.0, 813.0, 30.0, 4.34, 1.22, 0.0, 2.48, 25.4, 0.0, 0.31, 0.0, 0.6, 1.64, 0.16, 3.08, 0.98, 0.47, 0.0, 78.7, 4.3, 87.0, 0.0, 3.66, 0.0, 0.0, 7.52, 28.73, 6.02888, 24.4528);

    private final String Name;
    private final Double Weight;
    private final Double CompleteProtein;
    private final Double Cost;
    private final Double GlycemicLoad;
    private final Double Protein;
    private final Double Fat;
    private final Double CarbsByDiff;
    private final Double EnergyGross;
    private final Double Alcohol;
    private final Double Water;
    private final Double Fiber;
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
    private final Double Cholesterol;
    private final Double Saturated;
    private final Double DHA;
    private final Double EPA;
    private final Double Monounsaturated;
    private final Double Polyunsaturated;
    private final Double Linoleic;
    private final Double AlphaLinolenic;

    Nuts_and_seed_products(
            String Name,
            Double Weight,
            Double CompleteProtein,
            Double Cost,
            Double GlycemicLoad,
            Double Protein,
            Double Fat,
            Double CarbsByDiff,
            Double EnergyGross,
            Double Alcohol,
            Double Water,
            Double Fiber,
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
            Double Folate,
            Double Cholesterol,
            Double Saturated,
            Double DHA,
            Double EPA,
            Double Monounsaturated,
            Double Polyunsaturated,
            Double Linoleic,
            Double AlphaLinolenic
    ) {
        this.Name = Name;
        this.Weight = Weight;
        this.CompleteProtein = CompleteProtein;
        this.Cost = Cost;
        this.GlycemicLoad = GlycemicLoad;
        this.Protein = Protein;
        this.Fat = Fat;
        this.CarbsByDiff = CarbsByDiff;
        this.EnergyGross = EnergyGross;
        this.Alcohol = Alcohol;
        this.Water = Water;
        this.Fiber = Fiber;
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
        this.Cholesterol = Cholesterol;
        this.Saturated = Saturated;
        this.DHA = DHA;
        this.EPA = EPA;
        this.Monounsaturated = Monounsaturated;
        this.Polyunsaturated = Polyunsaturated;
        this.Linoleic = Linoleic;
        this.AlphaLinolenic = AlphaLinolenic;
    }

    @Override
    public String get_food_label() {
        return this.name();
    }

    @Override
    public String get_food_name() {
        return Name;
    }

    @Override
    public Double get_weight() {
        return Weight;
    }

    public Double get_weight_coefficient() {
        return Weight / Weight;
    }

    @Override
    public Double get_complete_protein() {
        return CompleteProtein;
    }

    @Override
    public Double get_complete_protein_coefficient() {
        return CompleteProtein / Weight;
    }

    @Override
    public Double get_digestible_carbohydrate() {
        return CarbsByDiff - Fiber;
    }

    @Override
    public Double get_digestible_carbohydrate_coefficient() {
        return get_digestible_carbohydrate() / Weight;
    }

    @Override
    public Double get_cost() {
        return Cost;
    }

    @Override
    public Double get_cost_coefficient() {
        return Cost / Weight;
    }

    @Override
    public Double get_glycemic_load() {
        return GlycemicLoad;
    }

    @Override
    public Double get_glycemic_load_coefficient() {
        return GlycemicLoad / Weight;
    }

    @Override
    public Double get_energy_digestible() {
        return get_energy_protein() + get_energy_fat() + get_energy_digestible_carbohydrate() + get_energy_alcohol();
    }

    @Override
    public Double get_energy_digestible_coefficient() {
        return get_energy_digestible() / Weight;
    }

    public Double get_energy_no_protein() {
        return get_energy_fat() + get_energy_digestible_carbohydrate() + get_energy_alcohol();
    }

    public Double get_energy_no_protein_coefficient() {
        return get_energy_no_protein() / Weight;
    }

    @Override
    public Double get_energy_digestible_carbohydrate() {
        return get_digestible_carbohydrate() * 4;
    }

    @Override
    public Double get_energy_digestible_carbohydrate_coefficient() {
        return get_energy_digestible_carbohydrate() / Weight;
    }

    @Override
    public Double get_energy_protein() {
        return Protein * 4;
    }

    @Override
    public Double get_energy_protein_coefficient() {
        return get_energy_protein() / Weight;
    }

    @Override
    public Double get_energy_fat() {
        return Fat * 9;
    }

    @Override
    public Double get_energy_fat_coefficient() {
        return get_energy_fat() / Weight;
    }

    @Override
    public Double get_energy_alcohol() {
        return Alcohol * 7;
    }

    @Override
    public Double get_energy_alcohol_coefficient() {
        return get_energy_alcohol() / Weight;
    }

    @Override
    public Double get_protein() {
        return Protein;
    }

    @Override
    public Double get_protein_coefficient() {
        return Protein / Weight;
    }

    @Override
    public Double get_fat() {
        return Fat;
    }

    @Override
    public Double get_fat_coefficient() {
        return Fat / Weight;
    }

    @Override
    public Double get_carbohydrate_by_difference() {
        return CarbsByDiff;
    }

    @Override
    public Double get_carbohydrate_by_difference_coefficient() {
        return CarbsByDiff / Weight;
    }

    @Override
    public Double get_energy_gross() {
        return EnergyGross;
    }

    @Override
    public Double get_energy_gross_coefficient() {
        return EnergyGross / Weight;
    }

    @Override
    public Double get_alcohol() {
        return Alcohol;
    }

    @Override
    public Double get_alcohol_coefficient() {
        return Alcohol / Weight;
    }

    @Override
    public Double get_water() {
        return Water;
    }

    @Override
    public Double get_water_coefficient() {
        return Water / Weight;
    }

    @Override
    public Double get_fiber() {
        return Fiber;
    }

    @Override
    public Double get_fiber_coefficient() {
        return Fiber / Weight;
    }

    @Override
    public Double get_calcium() {
        return Calcium;
    }

    @Override
    public Double get_calcium_coefficient() {
        return Calcium / Weight;
    }

    @Override
    public Double get_iron() {
        return Iron;
    }

    @Override
    public Double get_iron_coefficient() {
        return Iron / Weight;
    }

    @Override
    public Double get_magnesium() {
        return Magnesium;
    }

    @Override
    public Double get_magnesium_coefficient() {
        return Magnesium / Weight;
    }

    @Override
    public Double get_phosphorus() {
        return Phosphorus;
    }

    @Override
    public Double get_phosphorus_coefficient() {
        return Phosphorus / Weight;
    }

    @Override
    public Double get_potassium() {
        return Potassium;
    }

    @Override
    public Double get_potassium_coefficient() {
        return Potassium / Weight;
    }

    @Override
    public Double get_sodium() {
        return Sodium;
    }

    @Override
    public Double get_sodium_coefficient() {
        return Sodium / Weight;
    }

    @Override
    public Double get_zinc() {
        return Zinc;
    }

    @Override
    public Double get_zinc_coefficient() {
        return Zinc / Weight;
    }

    @Override
    public Double get_copper() {
        return Copper;
    }

    @Override
    public Double get_copper_coefficient() {
        return Copper / Weight;
    }

    @Override
    public Double get_fluoride() {
        return Fluoride;
    }

    @Override
    public Double get_fluoride_coefficient() {
        return Fluoride / Weight;
    }

    @Override
    public Double get_manganese() {
        return Manganese;
    }

    @Override
    public Double get_manganese_coefficient() {
        return Manganese / Weight;
    }

    @Override
    public Double get_selenium() {
        return Selenium;
    }

    @Override
    public Double get_selenium_coefficient() {
        return Selenium / Weight;
    }

    @Override
    public Double get_vitamin_a() {
        return VitaminA;
    }

    @Override
    public Double get_vitamin_a_coefficient() {
        return VitaminA / Weight;
    }

    @Override
    public Double get_vitamin_e() {
        return VitaminE;
    }

    @Override
    public Double get_vitamin_e_coefficient() {
        return VitaminE / Weight;
    }

    @Override
    public Double get_vitamin_d() {
        return VitaminD;
    }

    @Override
    public Double get_vitamin_d_coefficient() {
        return VitaminD / Weight;
    }

    @Override
    public Double get_vitamin_c() {
        return VitaminC;
    }

    @Override
    public Double get_vitamin_c_coefficient() {
        return VitaminC / Weight;
    }

    @Override
    public Double get_thiamin() {
        return Thiamin;
    }

    @Override
    public Double get_thiamin_coefficient() {
        return Thiamin / Weight;
    }

    @Override
    public Double get_riboflavin() {
        return Riboflavin;
    }

    @Override
    public Double get_riboflavin_coefficient() {
        return Riboflavin / Weight;
    }

    @Override
    public Double get_niacin() {
        return Niacin;
    }

    @Override
    public Double get_niacin_coefficient() {
        return Niacin / Weight;
    }

    @Override
    public Double get_pantothenic_acid() {
        return Pantothenic;
    }

    @Override
    public Double get_pantothenic_acid_coefficient() {
        return Pantothenic / Weight;
    }

    @Override
    public Double get_vitamin_b6() {
        return VitaminB6;
    }

    @Override
    public Double get_vitamin_b6_coefficient() {
        return VitaminB6 / Weight;
    }

    @Override
    public Double get_vitamin_b12() {
        return VitaminB12;
    }

    @Override
    public Double get_vitamin_b12_coefficient() {
        return VitaminB12 / Weight;
    }

    @Override
    public Double get_choline() {
        return Choline;
    }

    @Override
    public Double get_choline_coefficient() {
        return Choline / Weight;
    }

    @Override
    public Double get_vitamin_k() {
        return VitaminK;
    }

    @Override
    public Double get_vitamin_k_coefficient() {
        return VitaminK / Weight;
    }

    @Override
    public Double get_folate() {
        return Folate;
    }

    @Override
    public Double get_folate_coefficient() {
        return Folate / Weight;
    }

    @Override
    public Double get_cholesterol() {
        return Cholesterol;
    }

    @Override
    public Double get_cholesterol_coefficient() {
        return Cholesterol / Weight;
    }

    @Override
    public Double get_saturated_fat() {
        return Saturated;
    }

    @Override
    public Double get_saturated_fat_coefficient() {
        return Saturated / Weight;
    }

    @Override
    public Double get_dha() {
        return DHA;
    }

    @Override
    public Double get_dha_coefficient() {
        return DHA / Weight;
    }

    @Override
    public Double get_epa() {
        return EPA;
    }

    @Override
    public Double get_epa_coefficient() {
        return EPA / Weight;
    }

    @Override
    public Double get_monounsaturated_fat() {
        return Monounsaturated;
    }

    @Override
    public Double get_monounsaturated_fat_coefficient() {
        return Monounsaturated / Weight;
    }

    @Override
    public Double get_polyunsaturated_fat() {
        return Polyunsaturated;
    }

    @Override
    public Double get_polyunsaturated_fat_coefficient() {
        return Polyunsaturated / Weight;
    }

    @Override
    public Double get_linoleic_acid() {
        return Linoleic;
    }

    @Override
    public Double get_linoleic_acid_coefficient() {
        return Linoleic / Weight;
    }

    @Override
    public Double get_alpha_linolenic_acid() {
        return AlphaLinolenic;
    }

    @Override
    public Double get_alpha_linolenic_acid_coefficient() {
        return AlphaLinolenic / Weight;
    }

    public static String get_category_name() {
        return "Nuts and seed products";
    }

    @Override
    public String toString() {
        return get_food_name();
    }

    @Override
    public Double get_protein_atwater_factor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_carbohydrate_by_difference_atwater_factor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_fat_atwater_factor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_alcohol_atwater_factor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_glycemic_index() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double get_food_quotient() {
        Double fq = get_energy_digestible_carbohydrate() / get_energy_digestible() * 1.00
                + get_energy_fat() / get_energy_digestible() * 0.71
                + get_energy_protein() / get_energy_digestible() * 0.81
                + get_energy_alcohol() / get_energy_digestible() * 0.667;
        return fq;
    }
}
