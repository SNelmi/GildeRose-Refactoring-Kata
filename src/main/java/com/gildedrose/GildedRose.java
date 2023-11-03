package com.gildedrose;

import com.gildedrose.strategy.ItemStrategy;

import java.util.Arrays;

class GildedRose {
    ItemStrategy[] items;

    public GildedRose(ItemStrategy[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(ItemStrategy::update);
    }
}
