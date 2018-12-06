package CalendarMain;

import java.io.IOException;
import java.util.ArrayList;

import Login.FileUtility;




public class EventList {
	
	ArrayList<Event>NewEvent = new ArrayList<Event>();
	
	
	 public void updateSavedEventFile()throws IOException{
    String contents = "";
    
    for(Event current: this.NewEvent)
    {
                
        String eventdata = String.format("%s,%s,%s,%s,%s,%s,%b,%b,%b,%b\n",current.getMonths(), current.getDays(), current.getTime1(),current.getTime2(), current.getName(), current.getDesc(), current.getAM1(),current.getAM2(),current.getPM1(), current.getPM2() );
        
        contents = contents + eventdata;
    }
    
    FileUtility.writeContent(".\\txtFiles\\SavedEvents.txt", contents,true);//writes content to the members file
   
	} 
	 
	 public void populate() throws IOException {
	        ArrayList<Object> events = FileUtility.retrieveContent(".\\txtFiles\\SavedEvents.txt");
	        
	        for(Object Current: events)
	        {
	            
	            Object[] arr = ((String) Current).split(",");
	            
	            if (arr.length < 9)
	            {
	                continue;
	            }
	            
	            String months = (String) arr[0];
	            String days = (String) arr[1];
	            String time1=(String) arr[2];
	            String time2 = (String) arr[3];
	            String name = (String) arr[4];
	            String desc = (String) arr[5];
	            Boolean am1 = (Boolean) arr[6];
	            Boolean am2 = (Boolean) arr[7];
	            Boolean pm1 = (Boolean) arr[8];
	            Boolean pm2 = (Boolean) arr[9];
	            Event newEvent = new Event(months,days,time1,time2,name,desc,am1,am2,pm1,pm2);
	            this.add(newEvent); //calls to add member to the member list
	        }
	    }
	  //function to add a member to the eventlist
	    public void add(Event m)throws IOException {
	        this.NewEvent.add(m);
	    }
	    //function to delete an event from the list
	    public void remove(Event e){
	        this.NewEvent.remove(e);
	    }

}
