package com.example.test.hackerrank.entity;

import java.io.Serializable;

/**
 * Created by bilga on 15-11-2020
 */
public class DivideRequest implements Serializable {
    private String s;
    private String t;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }
}
