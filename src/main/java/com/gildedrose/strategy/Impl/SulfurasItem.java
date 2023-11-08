package com.gildedrose.strategy.Impl;

import com.gildedrose.Item;

public class SulfurasItem extends Item implements ItemStrategy {

    public SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update() {
        // No changes
    }
}
