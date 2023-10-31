package com.gildedrose;

import com.gildedrose.strategy.Impl.ConjuredItem;
import com.gildedrose.strategy.Impl.SulfurasItem;
import com.gildedrose.strategy.ItemStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SulfurasItemTest {

    private ItemStrategy[] items;

    private GildedRose app;

    @BeforeEach
    void testUp(){
        items = new ItemStrategy[] {
           new SulfurasItem("Sulfuras, Hand of Ragnaros", 10, 15),
            new  SulfurasItem("Sulfuras, Hand of Ragnaros", 1, 55)
        };
    }
    @Test
    void testUpdateQualityForSulfurasItemWithQualityInMedium(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(15, ((SulfurasItem)app.items[0]).quality);
    }

    @Test
    void testUpdateQualityForSulfurasItemWithQualityInTerminals(){
        app = new GildedRose(items);
        app.updateQuality();
        assertEquals(55, ((SulfurasItem)app.items[1]).quality);
    }
}
