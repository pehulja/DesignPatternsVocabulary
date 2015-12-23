package com.pehulja.patterns.abstractFactory.concrete;

import com.pehulja.patterns.abstractFactory.common.Phone;

public class USPhone extends Phone {
    private static final String format;

    static {
	format = "+XX-(XXX)-XXX-XX-XX";
    }

    @Override
    public String getFormat() {
	return format;
    }

}
