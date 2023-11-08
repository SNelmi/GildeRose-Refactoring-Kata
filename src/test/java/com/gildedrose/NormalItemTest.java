package com.gildedrose;

import com.gildedrose.strategy.Impl.NormalItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NormalItemTest {

    private Item[] items;

    private GildedRose app;

    @BeforeEach
    void testUp(){
        items = new Item[] {
           new NormalItem("Normal Item", 10, 15),
            new  NormalItem("Normal Item", 5, 0),
            new  NormalItem("Normal Item", -1, 0),
        };
    }
    @Test
    void testUpdateQualityForNormalItemWithQualityInMedium(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(14, ((NormalItem)app.items[0]).quality);
    }

    @Test
    void testUpdateQualityForNormalItemWithQualityInTerminals(){
        app = new GildedRose(items);
        app.updateQuality();
        assertNotEquals(-1, ((NormalItem)app.items[1]).quality);
        assertEquals(0, ((NormalItem)app.items[2]).quality);
    }
}
