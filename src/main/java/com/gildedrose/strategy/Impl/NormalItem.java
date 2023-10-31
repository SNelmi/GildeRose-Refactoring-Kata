package com.gildedrose.strategy.Impl;

import com.gildedrose.Item;
import com.gildedrose.strategy.ItemStrategy;

public class NormalItem extends Item implements ItemStrategy {

    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void update() {
        sellIn-=1;
        if(quality>0){
            quality-=1;
            if(sellIn<0){
                quality-=1;
            }
            quality = ItemStrategy.updateQualityToMinValue(quality);
        }
    }
}
