package com.gildedrose;

import com.gildedrose.strategy.Impl.BackstageItem;
import com.gildedrose.strategy.Impl.ConjuredItem;
import com.gildedrose.strategy.ItemStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BackStageItemTest {

    private ItemStrategy[] items;

    private GildedRose app;

    @BeforeEach
    void testUp(){
        items = new ItemStrategy[] {
           new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 15, 15),
            new  BackstageItem("Backstage passes to a TAFKAL80ETC concert", 3, 48),
            new  BackstageItem("Backstage passes to a TAFKAL80ETC concert", 8, 45),
        };
    }
    @Test
    void testUpdateQualityForBackStageItemWithQualityInMedium(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(16, ((BackstageItem)app.items[0]).quality);
    }

    @Test
    void testUpdateQualityForBackstageWhenThere_are_less_than_five_days(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, ((BackstageItem)app.items[1]).quality);
    }

    @Test
    void testUpdateQualityForBackstageWhenThere_are_less_than_ten_days(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(47,((BackstageItem)app.items[2]).quality);
    }
}
