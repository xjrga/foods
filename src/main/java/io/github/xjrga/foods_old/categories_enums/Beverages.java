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
 * Beverages food subset from USDA National Nutrient Database for Standard
 * Reference, Release 28
 *
 */
public enum Beverages implements Interface_food {

    //123456753
    Water("Water", 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //14003
    Alcoholic_beverage_beer_regular_all("Alcoholic beverage, beer, regular, all", 100.0, 0.0, 0.0, 0.0, 0.46, 0.0, 3.55, 43.0, 3.9, 91.96, 0.0, 4.0, 0.02, 6.0, 14.0, 27.0, 4.0, 0.01, 0.005, 44.2, 0.008, 0.6, 0.0, 0.0, 0.0, 0.0, 0.005, 0.02, 0.51, 0.04, 0.04, 0.02, 10.1, 0.0, 6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //14006
    Alcoholic_beverage_beer_light("Alcoholic beverage, beer, light", 100.0, 0.0, 0.0, 0.0, 0.24, 0.0, 1.64, 29.0, 3.1, 94.88, 0.0, 4.0, 0.03, 5.0, 12.0, 21.0, 4.0, 0.01, 0.006, 45.3, 0.006, 0.4, 0.0, 0.0, 0.0, 0.0, 0.005, 0.01, 0.39, 0.03, 0.03, 0.02, 8.8, 0.0, 6.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //14096
    Alcoholic_beverage_wine_table_red("Alcoholic beverage, wine, table, red", 100.0, 0.0, 0.0, 0.0, 0.07, 0.0, 2.61, 85.0, 10.6, 86.49, 0.0, 8.0, 0.46, 12.0, 23.0, 127.0, 4.0, 0.14, 0.01, 104.6, 0.13, 0.2, 0.0, 0.0, 0.0, 0.0, 0.005, 0.03, 0.22, 0.03, 0.05, 0.0, 5.7, 0.4, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //14106
    Alcoholic_beverage_wine_table_white("Alcoholic beverage, wine, table, white", 100.0, 0.0, 0.0, 0.0, 0.07, 0.0, 2.6, 82.0, 10.3, 86.86, 0.0, 9.0, 0.27, 10.0, 18.0, 71.0, 5.0, 0.12, 0.004, 202.0, 0.11, 0.1, 0.0, 0.0, 0.0, 0.0, 0.005, 0.01, 0.1, 0.04, 0.05, 0.0, 4.3, 0.4, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //14145
    Beverages_Carbonated_beverage_SPRITE_lemon_lime_without_caffeine("Beverages, Carbonated beverage, SPRITE, lemon-lime, without caffeine", 100.0, 0.0, 0.0, 0.0, 0.05, 0.02, 10.14, 40.0, 0.0, 89.78, 0.0, 2.0, 0.11, 1.0, 0.0, 1.0, 9.0, 0.04, 0.001, 55.9, 0.002, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.0, 0.0, 0.4, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //14185
    Beverages_tea_Oolong_brewed("Beverages, tea, Oolong, brewed", 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.15, 1.0, 0.0, 99.84, 0.0, 1.0, 0.0, 1.0, 1.0, 12.0, 3.0, 0.01, 0.0, 0.0, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.06, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //14209
    Coffee_brewed_prepared_with_tap_water("Coffee, brewed, prepared with tap water", 100.0, 0.0, 0.0, 0.0, 0.12, 0.02, 0.0, 1.0, 0.0, 99.39, 0.0, 2.0, 0.01, 3.0, 3.0, 49.0, 2.0, 0.02, 0.002, 90.7, 0.02, 0.0, 0.0, 0.01, 0.0, 0.0, 0.01, 0.07, 0.19, 0.25, 0.001, 0.0, 2.6, 0.1, 2.0, 0.0, 0.002, 0.0, 0.0, 0.01, 0.001, 0.0, 0.0),
    //14278
    Beverages_tea_green_brewed_regular("Beverages, tea, green, brewed, regular", 100.0, 0.0, 0.0, 0.0, 0.22, 0.0, 0.0, 1.0, 0.0, 99.93, 0.0, 0.0, 0.02, 1.0, 0.0, 8.0, 1.0, 0.01, 0.004, 0.0, 0.18, 0.0, 0.0, 0.0, 0.0, 0.3, 0.007, 0.05, 0.03, 0.0, 0.005, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0),
    //14355
    Beverages_tea_black_brewed_prepared_with_tap_water("Beverages, tea, black, brewed, prepared with tap water", 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.3, 1.0, 0.0, 99.7, 0.0, 0.0, 0.02, 3.0, 1.0, 37.0, 3.0, 0.02, 0.01, 372.9, 0.21, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.01, 0.0, 0.01, 0.0, 0.0, 0.4, 0.0, 5.0, 0.0, 0.002, 0.0, 0.0, 0.001, 0.004, 0.0, 0.0),
    //14414
    Alcoholic_beverage_liqueur_coffee_53_proof("Alcoholic beverage, liqueur, coffee, 53 proof", 100.0, 0.0, 0.0, 0.0, 0.1, 0.3, 46.8, 336.0, 21.7, 31.0, 0.0, 1.0, 0.06, 3.0, 6.0, 30.0, 8.0, 0.03, 0.04, 0.0, 0.01, 0.4, 0.0, 0.0, 0.0, 0.0, 0.004, 0.01, 0.14, 0.0, 0.0, 0.0, 0.8, 0.0, 0.0, 0.0, 0.1, 0.0, 0.0, 0.02, 0.1, 0.0, 0.0),
    //14475
    Beverages_ARIZONA_tea_ready_to_drink_lemon("Beverages, ARIZONA, tea, ready-to-drink, lemon", 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 9.77, 39.0, 0.0, 90.15, 0.0, 3.0, 0.0, 1.0, 1.0, 10.0, 4.0, 0.01, 0.005, 123.0, 0.16, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

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
    private final Double water;
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

    Beverages(
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
        this.water = Water;
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
        return water;
    }

    @Override
    public Double get_water_coefficient() {
        return water / Weight;
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
        return "Beverages";
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
