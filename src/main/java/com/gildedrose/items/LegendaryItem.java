package com.gildedrose.items;

import com.gildedrose.core.Item;

public class LegendaryItem extends Item {

    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {}
    @Override
    public void updateSellInValue() {}
}
