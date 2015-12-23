package com.pehulja.patterns.abstractFactory.common;

public abstract class Phone {
    private String value;

    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    public abstract String getFormat();
}
