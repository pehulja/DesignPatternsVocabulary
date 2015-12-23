package com.pehulja.patterns.builder;

import java.util.Date;

public class AppointmentBuilder {
    public static final int START_DATE_REQUIRED = 1;
    public static final int END_DATE_REQUIRED = 2;
    public static final int DESCRIPTION_REQUIRED = 4;
    public static final int ATTENDEE_REQUIRED = 8;
    public static final int LOCATION_REQUIRED = 16;
    
    protected Appointment appointment;
    protected int requiredElements;
    
    public void buildAppointment(){
	this.appointment = new Appointment();
    }

    public void buildDates(Date start, Date end){
	Date current = new Date();
	
	if(start != null && start.after(current)){
	    this.appointment.setStartDate(start);
	}
	
	if(end != null && end.after(start)){
	    this.appointment.setEndDate(start);
	}
    }
    
    public void buildDescription(String description){
	this.appointment.setDescription(description);
    }
    
    public Appointment getAppontment() throws Exception{
	requiredElements = 0;
	
	if(appointment.getStartDate() == null){
	    requiredElements += START_DATE_REQUIRED;
	}
	
	if(requiredElements > 0){
	    throw new Exception("Rwquired information missing exception");
	}
	
	return this.appointment;
    }
}
