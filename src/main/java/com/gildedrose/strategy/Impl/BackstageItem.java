package com.gildedrose.strategy.Impl;

import com.gildedrose.Item;
import com.gildedrose.strategy.ItemStrategy;

import static com.gildedrose.Utils.Constants.MAX_QUALITY_VALUE;

public class BackstageItem extends Item implements ItemStrategy {

    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update() {
        sellIn-=1;
        if(sellIn < 0) {
            quality = 0;
            return;
        }else if(quality< MAX_QUALITY_VALUE) {
            if (sellIn <= 5) {
                quality += 3;
            } else if (sellIn <= 10) {
                quality += 2;
            } else {
                quality += 1;
            }
        }
        quality = ItemStrategy.updateQualityToMaxValue(quality);
    }
}
