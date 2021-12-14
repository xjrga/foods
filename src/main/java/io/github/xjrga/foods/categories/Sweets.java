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
package io.github.xjrga.foods.categories;

import io.github.xjrga.foods.*;
import io.github.xjrga.foods.sweets.*;

/**
 * This is sweets category
 */
public class Sweets extends Abstract_category {

    private final Cocoa_dry_powder_unsweetened cocoa_dry_powder_unsweetened;
    private final Cocoa_dry_powder_unsweetened_processed_with_alkali cocoa_dry_powder_unsweetened_processed_with_alkali;
    private final Cocoa_dry_powder_unsweetened_hersheys_european_style_cocoa cocoa_dry_powder_unsweetened_hersheys_european_style_cocoa;
    private final Honey honey;
    private final Sugars_granulated sugars_granulated;
    private final Sweeteners_tabletop_aspartame_equal_packets sweeteners_tabletop_aspartame_equal_packets;
    private final Sweeteners_tabletop_sucralose_splenda_packets sweeteners_tabletop_sucralose_splenda_packets;
    private final Chocolate_dark_45_59_cacao_solids chocolate_dark_45_59_cacao_solids;
    private final Chocolate_dark_60_69_cacao_solids chocolate_dark_60_69_cacao_solids;
    private final Chocolate_dark_70_85_cacao_solids chocolate_dark_70_85_cacao_solids;
    private final Sweetener_herbal_extract_powder_from_stevia_leaf sweetener_herbal_extract_powder_from_stevia_leaf;
    private final Syrups_sugar_free syrups_sugar_free;
    private final Chewing_gum_sugarless chewing_gum_sugarless;
    private final Sweeteners_tabletop_saccharin_sodium_saccharin sweeteners_tabletop_saccharin_sodium_saccharin;

    /**
     * Constructs sweets category
     */
    public Sweets() {
        set_name("Sweets");
        cocoa_dry_powder_unsweetened = new Cocoa_dry_powder_unsweetened();
        cocoa_dry_powder_unsweetened_processed_with_alkali = new Cocoa_dry_powder_unsweetened_processed_with_alkali();
        cocoa_dry_powder_unsweetened_hersheys_european_style_cocoa = new Cocoa_dry_powder_unsweetened_hersheys_european_style_cocoa();
        honey = new Honey();
        sugars_granulated = new Sugars_granulated();
        sweeteners_tabletop_aspartame_equal_packets = new Sweeteners_tabletop_aspartame_equal_packets();
        sweeteners_tabletop_sucralose_splenda_packets = new Sweeteners_tabletop_sucralose_splenda_packets();
        chocolate_dark_45_59_cacao_solids = new Chocolate_dark_45_59_cacao_solids();
        chocolate_dark_60_69_cacao_solids = new Chocolate_dark_60_69_cacao_solids();
        chocolate_dark_70_85_cacao_solids = new Chocolate_dark_70_85_cacao_solids();
        sweetener_herbal_extract_powder_from_stevia_leaf = new Sweetener_herbal_extract_powder_from_stevia_leaf();
        syrups_sugar_free = new Syrups_sugar_free();
        chewing_gum_sugarless = new Chewing_gum_sugarless();
        sweeteners_tabletop_saccharin_sodium_saccharin = new Sweeteners_tabletop_saccharin_sodium_saccharin();
        add(cocoa_dry_powder_unsweetened);
        add(cocoa_dry_powder_unsweetened_processed_with_alkali);
        add(cocoa_dry_powder_unsweetened_hersheys_european_style_cocoa);
        add(honey);
        add(sugars_granulated);
        add(sweeteners_tabletop_aspartame_equal_packets);
        add(sweeteners_tabletop_sucralose_splenda_packets);
        add(chocolate_dark_45_59_cacao_solids);
        add(chocolate_dark_60_69_cacao_solids);
        add(chocolate_dark_70_85_cacao_solids);
        add(sweetener_herbal_extract_powder_from_stevia_leaf);
        add(syrups_sugar_free);
        add(chewing_gum_sugarless);
        add(sweeteners_tabletop_saccharin_sodium_saccharin);
    }

    public Cocoa_dry_powder_unsweetened get_cocoa_dry_powder_unsweetened() {
        return cocoa_dry_powder_unsweetened;
    }

    public Cocoa_dry_powder_unsweetened_processed_with_alkali get_cocoa_dry_powder_unsweetened_processed_with_alkali() {
        return cocoa_dry_powder_unsweetened_processed_with_alkali;
    }

    public Cocoa_dry_powder_unsweetened_hersheys_european_style_cocoa get_cocoa_dry_powder_unsweetened_hershey_s_european_style_cocoa() {
        return cocoa_dry_powder_unsweetened_hersheys_european_style_cocoa;
    }

    public Honey get_honey() {
        return honey;
    }

    public Sugars_granulated get_sugars_granulated() {
        return sugars_granulated;
    }

    public Sweeteners_tabletop_aspartame_equal_packets get_sweeteners_tabletop_aspartame_equal_packets() {
        return sweeteners_tabletop_aspartame_equal_packets;
    }

    public Sweeteners_tabletop_sucralose_splenda_packets get_sweeteners_tabletop_sucralose_splenda_packets() {
        return sweeteners_tabletop_sucralose_splenda_packets;
    }

    public Chocolate_dark_45_59_cacao_solids get_chocolate_dark_45_59_cacao_solids() {
        return chocolate_dark_45_59_cacao_solids;
    }

    public Chocolate_dark_60_69_cacao_solids get_chocolate_dark_60_69_cacao_solids() {
        return chocolate_dark_60_69_cacao_solids;
    }

    public Chocolate_dark_70_85_cacao_solids get_chocolate_dark_70_85_cacao_solids() {
        return chocolate_dark_70_85_cacao_solids;
    }

    public Sweetener_herbal_extract_powder_from_stevia_leaf get_sweetener_herbal_extract_powder_from_stevia_leaf() {
        return sweetener_herbal_extract_powder_from_stevia_leaf;
    }

    public Syrups_sugar_free get_syrups_sugar_free() {
        return syrups_sugar_free;
    }

    public Chewing_gum_sugarless get_chewing_gum_sugarless() {
        return chewing_gum_sugarless;
    }

    public Sweeteners_tabletop_saccharin_sodium_saccharin get_sweeteners_tabletop_saccharin_sodium_saccharin() {
        return sweeteners_tabletop_saccharin_sodium_saccharin;
    }

}
