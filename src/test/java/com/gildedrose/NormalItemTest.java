package com.gildedrose;

import com.gildedrose.strategy.Impl.ConjuredItem;
import com.gildedrose.strategy.Impl.NormalItem;
import com.gildedrose.strategy.ItemStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NormalItemTest {

    private ItemStrategy[] items;

    private GildedRose app;

    @BeforeEach
    void testUp(){
        items = new ItemStrategy[] {
           new NormalItem("Conjured Item", 10, 15),
            new  NormalItem("Conjured Item", 5, 0),
            new  NormalItem("Conjured Item", -1, 0),
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
