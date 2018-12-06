package CalendarMain;

import Login.UserLogin;
import MonthlyCalendarPackage.NewEvent;

public class Event extends UserLogin 
{   
    /**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	private String months;
    private String days; 
    private String time1,time2;
    private String name;
    private String desc;
    private Boolean am1, am2,pm1, pm2;
    
    
    
    //Default member constructor
    public Event(){
        super(null, null);
        this.setMonths(null);
        this.setDays(null);
        this.setTime1(null);
        this.setTime2(null);
        this.setName(null);
        this.setDesc(null);
        this.setAM1(false);
        this.setAM2(false);
        this.setPM1(false);
        this.setPM2(false);
      
 
    }
    //Constructor used by memberList
    public Event(String months, String days, String time1,String time2, String name, String desc, Boolean am1,Boolean am2, Boolean pm1,Boolean pm2){
    	super(null, null); 
    	this.setMonths(months);
         this.setDays(days);
         this.setTime1(time1);
         this.setTime2(time2);
         this.setName(name);
         this.setDesc(desc);
         this.setAM1(am1);
         this.setAM2(am2);
         this.setPM1(pm1);
         this.setPM2(pm2);
       
    }
    
    //Set variable functions
    public void setMonths(String months){
    	this.months = months;
    }
    public void setDays(String days){
    	 this.days = days;
    }
    public void setTime1(String time1){
    	this.time1 = time1;
    }
    public void setTime2(String time2){
    	this.time2 = time2;
    }
    public void setName(String name){
    	this.name = name;
    }
    
    public void setDesc(String desc){ 
    	this.desc = desc;
    }
    public void setAM1(Boolean am1){ 
    	this.am1 = am1;
    }
    public void setAM2(Boolean am2){ 
    	this.am2 = am2;
    }
    public void setPM1(Boolean pm1){ 
    	this.pm1 = pm1;
    }
    public void setPM2(Boolean pm2){ 
    	this.pm2 = pm2;
    }
     
    //Get variable functions 
    public String getMonths(){
        return months;
    }
    public String getDays(){ 
     return days;
    }
    public String getTime1(){
        return time1;
    }
    public String getTime2(){
        return time2;
    }
    public String getName(){
        return name;
    }
   
    public String getDesc(){
        return desc;
    }
    public Boolean getAM1(){
        return am1;
    }
    public Boolean getAM2(){
        return am2;
    }
    public Boolean getPM1(){
        return pm1;
    }
    public Boolean getPM2(){
        return pm2;
    }
    //Function used to register new members to the system and sends it to be written to the data file 
    public boolean createEvent(EventList eventList){ 
        
    	//user input of all member information
    		String months = NewEvent.months;
    	
            this.setMonths(months); 

            String days = NewEvent.days;
            this.setDays(days);
            
            String time1 = NewEvent.eventTime1;
            this.setTime1(time1);
            
            String time2 = NewEvent.eventTime2;
            this.setTime2(time2);
            
            String name = NewEvent.name;
            this.setName(name);            
            
            String desc = NewEvent.desc;
            this.setDesc(desc);

            Boolean am1 = NewEvent.am1; 
            this.setAM1(am1); 
            
            Boolean am2 = NewEvent.am2; 
            this.setAM2(am2); 

            Boolean pm1 = NewEvent.pm1;
            this.setPM1(pm1);
            
            Boolean pm2 = NewEvent.pm2;
            this.setPM2(pm2);

            return true;
        }
        
       
    }
    
