package com.ai.cloud.skywalking.protocol;

/**
 * Created by wusheng on 16/7/4.
 */
public class NullClass implements NullableClass {
    @Override
    public boolean isNull() {
        return true;
    }
}
