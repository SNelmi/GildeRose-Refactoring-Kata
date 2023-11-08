package com.gildedrose.strategy.Impl;

import com.gildedrose.Item;

import static com.gildedrose.Utils.Constants.MIN_QUALITY_VALUE;

public class ConjuredItem extends Item implements ItemStrategy {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update() {
        sellIn-=1;
        if(quality> MIN_QUALITY_VALUE){
            quality-=2;
            if(sellIn<0){
                quality-=2;
            }
            quality = ItemStrategy.updateQualityToMinValue(quality);
        }
    }
}
