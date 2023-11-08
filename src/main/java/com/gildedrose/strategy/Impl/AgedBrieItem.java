package com.gildedrose.strategy.Impl;

import com.gildedrose.Item;

public class AgedBrieItem extends Item implements ItemStrategy {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }


    public void update() {
        sellIn-=1;
        if(quality<50){
            quality+=1;
        }
    }
}
