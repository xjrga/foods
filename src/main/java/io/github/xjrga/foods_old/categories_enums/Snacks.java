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
 * Snacks food subset from USDA National Nutrient Database for Standard
 * Reference, Release 28
 *
 */
public enum Snacks implements Interface_food {

    //19047
    Snacks_pretzels_hard_plain_salted("Snacks, pretzels, hard, plain, salted", 100.0, 0.0, 0.0, 63.90169999999999, 10.04, 2.93, 80.39, 384.0, 0.0, 3.13, 3.4, 27.0, 4.58, 29.0, 128.0, 223.0, 1240.0, 1.04, 0.15, 0.0, 1.01, 4.4, 0.0, 0.47, 0.0, 2.1, 0.42, 0.33, 5.27, 0.32, 0.07, 0.0, 29.5, 2.8, 166.0, 0.0, 0.39, 0.0, 0.0, 0.72, 1.29, 1.22, 0.06),
    //19059
    Snacks_trail_mix_regular("Snacks, trail mix, regular", 100.0, 0.0, 0.0, 0.0, 13.8, 29.4, 44.9, 462.0, 0.0, 9.2, 0.0, 78.0, 3.05, 158.0, 345.0, 685.0, 229.0, 3.22, 0.98, 0.0, 1.03, 0.0, 1.0, 0.0, 0.0, 1.4, 0.46, 0.19, 4.71, 0.89, 0.29, 0.0, 0.0, 0.0, 71.0, 0.0, 5.55, 0.0, 0.0, 12.53, 9.65, 0.0, 0.0),
    //19806
    Snacks_popcorn_air_popped_Unsalted_("Snacks, popcorn, air-popped (Unsalted)", 100.0, 0.0, 0.0, 45.216, 12.0, 4.2, 77.9, 382.0, 0.0, 4.1, 15.1, 10.0, 2.66, 131.0, 300.0, 301.0, 4.0, 3.44, 0.42, 0.0, 0.94, 9.9, 1.0, 0.0, 0.0, 0.0, 0.2, 0.28, 1.94, 0.42, 0.24, 0.0, 0.0, 0.0, 23.0, 0.0, 0.57, 0.0, 0.0, 1.1, 1.9, 0.0, 0.0),
    //19816
    Snacks_rice_cakes_brown_rice_plain_unsalted("Snacks, rice cakes, brown rice, plain, unsalted", 100.0, 0.0, 0.0, 0.0, 8.2, 2.8, 81.5, 387.0, 0.0, 5.8, 4.2, 11.0, 1.49, 131.0, 360.0, 290.0, 26.0, 3.0, 0.44, 0.0, 3.73, 24.6, 0.0, 1.24, 0.0, 0.0, 0.06, 0.16, 7.8, 1.0, 0.15, 0.0, 31.6, 1.9, 21.0, 0.0, 0.57, 0.0, 0.0, 1.03, 0.99, 0.0, 0.0),
    //19818
    Snacks_rice_cakes_brown_rice_multigrain_unsalted("Snacks, rice cakes, brown rice, multigrain, unsalted", 100.0, 0.0, 0.0, 0.0, 8.5, 3.5, 80.1, 387.0, 0.0, 6.3, 0.0, 21.0, 1.96, 137.0, 370.0, 294.0, 4.0, 2.53, 0.42, 0.0, 5.22, 20.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.18, 6.6, 1.0, 0.13, 0.0, 0.0, 0.0, 20.0, 0.0, 0.56, 0.0, 0.0, 1.16, 1.44, 0.0, 0.0),
    //19821
    Snacks_trail_mix_regular_unsalted("Snacks, trail mix, regular, unsalted", 100.0, 0.0, 0.0, 0.0, 13.8, 29.4, 44.9, 462.0, 0.0, 9.2, 0.0, 78.0, 3.05, 158.0, 345.0, 685.0, 10.0, 3.22, 0.98, 0.0, 1.03, 0.0, 1.0, 0.0, 0.0, 1.4, 0.46, 0.19, 4.71, 0.89, 0.29, 0.0, 0.0, 0.0, 71.0, 0.0, 5.55, 0.0, 0.0, 12.53, 9.65, 0.0, 0.0),
    //19833
    Snacks_tortilla_chips_low_fat_unsalted("Snacks, tortilla chips, low fat, unsalted", 100.0, 0.0, 0.0, 47.123999999999995, 11.0, 5.7, 80.1, 416.0, 0.0, 1.7, 5.3, 159.0, 1.6, 97.0, 318.0, 272.0, 15.0, 1.15, 0.11, 0.0, 0.0, 15.7, 4.0, 3.53, 0.0, 0.2, 0.22, 0.28, 0.42, 0.0, 0.18, 0.0, 23.4, 20.9, 16.0, 0.0, 0.85, 0.0, 0.0, 1.66, 2.87, 0.0, 0.0),
    //25000
    Snacks_popcorn_microwave_94_fat_free("Snacks, popcorn, microwave, 94% fat free", 100.0, 0.0, 0.0, 0.0, 10.72, 6.1, 76.04, 402.0, 0.0, 4.22, 13.6, 14.0, 2.87, 124.0, 304.0, 284.0, 571.0, 2.8, 0.26, 0.0, 1.08, 6.9, 13.0, 0.41, 0.0, 0.0, 0.07, 0.15, 2.09, 0.0, 0.21, 0.0, 13.0, 1.1, 18.0, 0.0, 1.18, 0.0, 0.0, 2.76, 2.21, 2.09, 0.05),
    //25012
    Snacks_sweet_potato_chips_unsalted("Snacks, sweet potato chips, unsalted", 100.0, 0.0, 0.0, 0.0, 2.94, 32.35, 56.82, 532.0, 0.0, 4.51, 8.8, 59.0, 2.12, 65.0, 145.0, 925.0, 35.0, 0.53, 0.41, 0.0, 1.34, 2.1, 1184.0, 9.82, 0.0, 0.0, 0.08, 0.16, 2.08, 1.55, 0.53, 0.0, 36.6, 24.5, 37.0, 0.0, 2.94, 0.0, 0.0, 9.15, 12.22, 0.0, 0.0),
    //25024
    Pretzels_soft_unsalted("Pretzels, soft, unsalted", 100.0, 0.0, 0.0, 57.5522, 8.2, 3.1, 71.04, 345.0, 0.0, 15.0, 1.7, 23.0, 3.92, 21.0, 79.0, 88.0, 252.0, 0.94, 0.12, 0.0, 0.0, 17.2, 0.0, 0.54, 0.0, 0.0, 0.41, 0.29, 4.27, 0.0, 0.02, 0.0, 17.7, 2.7, 24.0, 0.0, 0.69, 0.0, 0.0, 1.07, 0.94, 0.0, 0.0),
    //25037
    Snacks_pita_chips_salted("Snacks, pita chips, salted", 100.0, 0.0, 0.0, 0.0, 11.79, 15.2, 68.26, 457.0, 0.0, 2.0, 3.8, 17.0, 4.59, 37.0, 124.0, 129.0, 854.0, 0.96, 0.14, 0.1, 0.65, 33.1, 0.0, 6.93, 0.0, 0.0, 0.56, 0.3, 7.04, 0.5, 0.1, 0.0, 9.1, 1.2, 215.0, 0.0, 1.34, 0.0, 0.001, 10.84, 2.13, 2.0, 0.09),
    //43364
    Snacks_tortilla_chips_unsalted_white_corn("Snacks, tortilla chips, unsalted, white corn", 100.0, 0.0, 0.0, 37.812599999999996, 7.79, 23.36, 65.32, 503.0, 0.0, 2.09, 5.3, 174.0, 2.32, 146.0, 200.0, 215.0, 15.0, 2.46, 0.52, 0.0, 0.0, 6.7, 4.0, 3.53, 0.0, 0.0, 0.01, 0.1, 1.26, 1.18, 0.21, 0.36, 18.1, 0.7, 10.0, 0.0, 2.45, 0.0, 0.0, 9.52, 9.95, 0.0, 0.0),
    //43566
    Snacks_tortilla_chips_light_baked_with_less_oil_("Snacks, tortilla chips, light (baked with less oil)", 100.0, 0.0, 0.0, 42.651, 8.7, 15.2, 73.4, 465.0, 0.0, 1.3, 5.7, 159.0, 1.63, 97.0, 318.0, 272.0, 564.0, 1.15, 0.11, 0.0, 0.0, 15.7, 4.0, 3.53, 0.0, 0.2, 0.22, 0.28, 0.42, 0.0, 0.18, 0.06, 23.4, 0.7, 16.0, 0.0, 2.83, 0.0, 0.0, 6.34, 5.02, 0.0, 0.0);

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

    Snacks(
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
        return "Snacks";
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
