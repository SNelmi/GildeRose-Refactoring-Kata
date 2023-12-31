package com.gildedrose;

import com.gildedrose.strategy.Impl.AgedBrieItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AgedBrieItemTest {

    private Item[] items;

    private GildedRose app;

    @BeforeEach
    void testUp(){
        items = new Item[] {
           new AgedBrieItem("Aged Brie Item", 10, 15),
            new  AgedBrieItem("Aged Brie Item", 1, 0),
            new  AgedBrieItem("Aged Brie Item", -2, 50),
        };
    }
    @Test
    void testUpdateQualityForAgedBrieItemWithQualityInMedium(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(16, ((AgedBrieItem)app.items[0]).quality);
    }

    @Test
    void testUpdateQualityForAgedBrieItemWithQualityInTerminals(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, ((AgedBrieItem)app.items[1]).quality);
        assertEquals(50, ((AgedBrieItem)app.items[2]).quality);
    }
}
