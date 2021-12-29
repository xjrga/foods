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
 * Finfish and shellfish products food subset from USDA National Nutrient
 * Database for Standard Reference, Release 28
 *
 */
public enum Finfish_and_shellfish_products implements Interface_food {

    //15023
    Fish_mahimahi_raw("Fish, mahimahi, raw", 100.0, 18.5, 0.0, 0.0, 18.5, 0.7, 0.0, 85.0, 0.0, 77.55, 0.0, 15.0, 1.13, 30.0, 143.0, 416.0, 88.0, 0.46, 0.04, 0.0, 0.01, 36.5, 54.0, 0.0, 0.0, 0.0, 0.02, 0.07, 6.1, 0.75, 0.4, 0.6, 0.0, 0.0, 5.0, 73.0, 0.18, 0.08, 0.02, 0.12, 0.16, 0.0, 0.0),
    //15076
    Fish_salmon_Atlantic_wild_raw("Fish, salmon, Atlantic, wild, raw", 100.0, 19.84, 0.0, 0.0, 19.84, 6.34, 0.0, 142.0, 0.0, 68.5, 0.0, 12.0, 0.8, 29.0, 200.0, 490.0, 44.0, 0.64, 0.25, 0.0, 0.01, 36.5, 12.0, 0.0, 0.0, 0.0, 0.22, 0.38, 7.86, 1.66, 0.81, 3.18, 0.0, 0.0, 25.0, 55.0, 0.98, 1.11, 0.32, 2.1, 2.53, 0.0, 0.0),
    //15083
    Fish_salmon_pink_raw("Fish, salmon, pink, raw", 100.0, 20.5, 0.0, 0.0, 20.5, 4.4, 0.0, 127.0, 0.0, 75.52, 0.0, 7.0, 0.38, 27.0, 261.0, 366.0, 75.0, 0.39, 0.06, 0.0, 0.01, 31.4, 35.0, 0.4, 10.9, 0.0, 0.08, 0.1, 7.99, 1.03, 0.61, 4.15, 94.6, 0.4, 4.0, 46.0, 0.81, 0.33, 0.18, 1.34, 0.81, 0.05, 0.04),
    //15088
    Fish_sardine_Atlantic_canned_in_oil_drained_solids_with_bone("Fish, sardine, Atlantic, canned in oil, drained solids with bone", 100.0, 24.62, 0.0, 0.0, 24.62, 11.45, 0.0, 208.0, 0.0, 59.61, 0.0, 382.0, 2.92, 39.0, 490.0, 397.0, 307.0, 1.31, 0.18, 0.0, 0.1, 52.7, 32.0, 2.04, 4.8, 0.0, 0.08, 0.22, 5.24, 0.64, 0.16, 8.94, 75.0, 2.6, 10.0, 142.0, 1.52, 0.5, 0.47, 3.86, 5.14, 0.0, 0.0),
    //15089
    Fish_sardine_Pacific_canned_in_tomato_sauce_drained_solids_with_bone("Fish, sardine, Pacific, canned in tomato sauce, drained solids with bone", 100.0, 20.86, 0.0, 0.0, 20.86, 10.45, 0.54, 185.0, 0.0, 66.86, 0.1, 240.0, 2.3, 34.0, 366.0, 341.0, 414.0, 1.4, 0.27, 0.0, 0.2, 40.6, 34.0, 1.38, 4.8, 1.0, 0.04, 0.23, 4.2, 0.73, 0.12, 9.0, 76.0, 0.4, 24.0, 61.0, 2.68, 0.86, 0.53, 4.81, 2.11, 0.0, 0.0),
    //15119
    Fish_tuna_light_canned_in_oil_drained_solids("Fish, tuna, light, canned in oil, drained solids", 100.0, 29.13, 0.0, 0.0, 29.13, 8.21, 0.0, 198.0, 0.0, 59.83, 0.0, 13.0, 1.39, 31.0, 311.0, 207.0, 416.0, 0.9, 0.07, 31.0, 0.01, 76.0, 23.0, 0.87, 6.7, 0.0, 0.03, 0.12, 12.4, 0.37, 0.11, 2.2, 29.3, 44.0, 5.0, 18.0, 1.53, 0.1, 0.02, 2.94, 2.88, 0.0, 0.0),
    //15121
    Fish_tuna_light_canned_in_water_drained_solids("Fish, tuna, light, canned in water, drained solids", 100.0, 19.44, 0.0, 0.0, 19.44, 0.96, 0.0, 86.0, 0.0, 78.14, 0.0, 17.0, 1.63, 23.0, 139.0, 179.0, 247.0, 0.69, 0.05, 18.6, 0.01, 70.6, 17.0, 0.33, 1.2, 0.0, 0.03, 0.08, 10.13, 0.14, 0.31, 2.55, 29.3, 0.2, 4.0, 36.0, 0.21, 0.19, 0.02, 0.1, 0.27, 0.01, 0.002),
    //15124
    Fish_tuna_white_canned_in_oil_drained_solids("Fish, tuna, white, canned in oil, drained solids", 100.0, 26.53, 0.0, 0.0, 26.53, 8.08, 0.0, 186.0, 0.0, 64.02, 0.0, 4.0, 0.65, 34.0, 267.0, 333.0, 396.0, 0.47, 0.13, 31.0, 0.01, 60.1, 5.0, 2.3, 0.0, 0.0, 0.01, 0.07, 11.69, 0.37, 0.43, 2.2, 0.0, 6.9, 5.0, 31.0, 1.28, 0.17, 0.06, 3.26, 2.97, 0.0, 0.0),
    //15126
    Fish_tuna_white_canned_in_water_drained_solids("Fish, tuna, white, canned in water, drained solids", 100.0, 23.62, 0.0, 0.0, 23.62, 2.97, 0.0, 128.0, 0.0, 73.19, 0.0, 14.0, 0.97, 33.0, 217.0, 237.0, 377.0, 0.48, 0.03, 0.0, 0.01, 65.7, 6.0, 0.85, 2.0, 0.0, 0.008, 0.04, 5.79, 0.12, 0.21, 1.17, 29.3, 2.5, 2.0, 42.0, 0.79, 0.62, 0.23, 0.78, 1.1, 0.0, 0.0),
    //15194
    Fish_mahimahi_cooked_dry_heat("Fish, mahimahi, cooked, dry heat", 100.0, 23.72, 0.0, 0.0, 23.72, 0.9, 0.0, 109.0, 0.0, 71.22, 0.0, 19.0, 1.45, 38.0, 183.0, 533.0, 113.0, 0.59, 0.05, 0.0, 0.01, 46.8, 62.0, 0.0, 0.0, 0.0, 0.02, 0.08, 7.42, 0.86, 0.46, 0.69, 0.0, 0.0, 6.0, 94.0, 0.24, 0.11, 0.02, 0.15, 0.21, 0.0, 0.0),
    //15209
    Fish_salmon_Atlantic_wild_cooked_dry_heat("Fish, salmon, Atlantic, wild, cooked, dry heat", 100.0, 25.44, 0.0, 0.0, 25.44, 8.13, 0.0, 182.0, 0.0, 59.62, 0.0, 15.0, 1.03, 37.0, 256.0, 628.0, 56.0, 0.82, 0.32, 0.0, 0.02, 46.8, 13.0, 0.0, 0.0, 0.0, 0.27, 0.48, 10.07, 1.92, 0.94, 3.05, 0.0, 0.0, 29.0, 71.0, 1.25, 1.42, 0.41, 2.69, 3.25, 0.0, 0.0),
    //15212
    Fish_salmon_pink_cooked_dry_heat("Fish, salmon, pink, cooked, dry heat", 100.0, 24.58, 0.0, 0.0, 24.58, 5.28, 0.0, 153.0, 0.0, 70.65, 0.0, 8.0, 0.45, 32.0, 313.0, 439.0, 90.0, 0.46, 0.07, 0.0, 0.01, 37.6, 42.0, 0.48, 13.0, 0.0, 0.09, 0.12, 9.58, 1.23, 0.69, 4.73, 113.4, 0.5, 5.0, 55.0, 0.97, 0.39, 0.21, 1.61, 0.97, 0.0, 0.0),
    //15236
    Fish_salmon_Atlantic_farmed_raw("Fish, salmon, Atlantic, farmed, raw", 100.0, 20.42, 0.0, 0.0, 20.42, 13.42, 0.0, 208.0, 0.0, 64.89, 0.0, 9.0, 0.34, 27.0, 240.0, 363.0, 59.0, 0.36, 0.04, 0.0, 0.01, 24.0, 58.0, 3.55, 11.0, 3.9, 0.2, 0.15, 8.67, 1.54, 0.63, 3.23, 78.5, 0.5, 26.0, 55.0, 3.05, 1.1, 0.86, 3.77, 3.88, 0.0, 0.14),
    //15237
    Fish_salmon_Atlantic_farmed_cooked_dry_heat("Fish, salmon, Atlantic, farmed, cooked, dry heat", 100.0, 22.1, 0.0, 0.0, 22.1, 12.35, 0.0, 206.0, 0.0, 64.75, 0.0, 15.0, 0.34, 30.0, 252.0, 384.0, 61.0, 0.43, 0.04, 0.0, 0.01, 41.4, 69.0, 1.14, 13.1, 3.7, 0.34, 0.13, 8.04, 1.47, 0.64, 2.8, 90.5, 0.1, 34.0, 63.0, 2.39, 1.45, 0.69, 4.18, 4.55, 0.0, 0.0),
    //15261
    Fish_tilapia_raw("Fish, tilapia, raw", 100.0, 20.08, 0.0, 0.0, 20.08, 1.7, 0.0, 96.0, 0.0, 78.08, 0.0, 10.0, 0.56, 27.0, 170.0, 302.0, 52.0, 0.33, 0.07, 0.0, 0.03, 41.8, 0.0, 0.4, 3.1, 0.0, 0.04, 0.06, 3.9, 0.48, 0.16, 1.58, 42.5, 1.4, 24.0, 50.0, 0.58, 0.08, 0.005, 0.49, 0.36, 0.0, 0.03),
    //15262
    Fish_tilapia_cooked_dry_heat("Fish, tilapia, cooked, dry heat", 100.0, 26.15, 0.0, 0.0, 26.15, 2.65, 0.0, 128.0, 0.0, 71.59, 0.0, 14.0, 0.69, 34.0, 204.0, 380.0, 56.0, 0.41, 0.07, 0.0, 0.03, 54.4, 0.0, 0.79, 3.7, 0.0, 0.09, 0.07, 4.74, 0.66, 0.12, 1.86, 51.3, 0.9, 6.0, 57.0, 0.94, 0.13, 0.005, 0.95, 0.6, 0.0, 0.04),
    //15270
    Crustaceans_shrimp_raw_not_previously_frozen_("Crustaceans, shrimp, raw (not previously frozen)", 100.0, 20.1, 0.0, 0.0, 20.1, 0.51, 0.0, 85.0, 0.0, 78.45, 0.0, 64.0, 0.52, 35.0, 214.0, 264.0, 119.0, 1.34, 0.39, 0.0, 0.03, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 161.0, 0.1, 0.03, 0.03, 0.08, 0.15, 0.03, 0.002);

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

    Finfish_and_shellfish_products(
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
        return "Finfish and shellfish products";
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
