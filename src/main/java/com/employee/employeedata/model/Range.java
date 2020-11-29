package com.employee.employeedata.model;

public class Range {
    private String range;

    public Range() {
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Range{" +
                "range='" + range + '\'' +
                '}';
    }
}
