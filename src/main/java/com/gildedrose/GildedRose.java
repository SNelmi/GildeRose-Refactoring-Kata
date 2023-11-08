package com.gildedrose;

import com.gildedrose.strategy.Impl.AgedBrieItem;
import com.gildedrose.strategy.Impl.BackstageItem;
import com.gildedrose.strategy.Impl.ConjuredItem;
import com.gildedrose.strategy.Impl.SulfurasItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        //Arrays.stream(items).forEach(ItemStrategy::update);
        for(Item i : items){
            if (i instanceof AgedBrieItem){
                ((AgedBrieItem) i).update();
            }else if (i instanceof BackstageItem){
                ((BackstageItem) i).update();
            }else if (i instanceof ConjuredItem){
                ((ConjuredItem) i).update();
            }else if (i instanceof SulfurasItem){
                ((SulfurasItem) i).update();
            }
        }
    }
}
