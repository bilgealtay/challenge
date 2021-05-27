package com.example.test.hackerrank.entity;

import java.io.Serializable;

/**
 * Created by bilga on 13-11-2020
 */
public class SparseArraysRequest implements Serializable {

    private String[] strings;
    private String[] queries;

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public String[] getQueries() {
        return queries;
    }

    public void setQueries(String[] queries) {
        this.queries = queries;
    }
}
