package com.gildedrose.strategy;

import static com.gildedrose.Utils.Constants.MAX_QUALITY_VALUE;
import static com.gildedrose.Utils.Constants.MIN_QUALITY_VALUE;

public interface ItemStrategy {
    void update();

    static int updateQualityToMinValue(int quality){
        return Math.max(quality, MIN_QUALITY_VALUE);
    }

    static int updateQualityToMaxValue(int quality){
        return Math.min(quality, MAX_QUALITY_VALUE);
    }
}
