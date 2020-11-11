package com.example.test.codility.entity;

import java.io.Serializable;

/**
 * Created by bilga on 08-11-2020
 */
public class CyclicRotationRequest implements Serializable {
    private int[] array;
    private int index;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
