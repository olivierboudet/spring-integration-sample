package org.boudet.spring.integration.sample.model;

import java.util.Date;

public class Metric {
    public Date datetime;
    public int value;

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Metric{" +
                "datetime=" + datetime +
                ", value=" + value +
                '}';
    }
}
