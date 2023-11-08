package com.gildedrose;

import com.gildedrose.strategy.Impl.ConjuredItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ConjuredItemTest {

    private Item[] items;

    private GildedRose app;

    @BeforeEach
    void testUp(){
        items = new Item[] {
           new  ConjuredItem("Conjured Item", 10, 15),
            new  ConjuredItem("Conjured Item", 1, 1),
            new  ConjuredItem("Conjured Item", 1, 50),
        };
    }
    @Test
    void testUpdateQualityForConjuredItemWithQualityInMedium(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(13, ((ConjuredItem)app.items[0]).quality);
    }

    @Test
    void testUpdateQualityForConjuredItemWithQualityInTerminals(){
        app = new GildedRose(items);
        app.updateQuality();
        assertNotEquals(-1, ((ConjuredItem)app.items[1]).quality);
        assertEquals(48, ((ConjuredItem)app.items[2]).quality);
    }
}
