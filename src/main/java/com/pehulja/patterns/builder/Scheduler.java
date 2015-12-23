package com.pehulja.patterns.builder;

import java.util.Date;

public class Scheduler {
    public Appointment createAppontement(AppointmentBuilder builder, Date startDate, Date endDate, String description) throws Exception {
	if(builder == null){
	    builder = new AppointmentBuilder();
	}
	builder.buildAppointment();
	builder.buildDates(startDate, endDate);
	builder.buildDescription(description);
	
	return builder.getAppontment();
    }
}
