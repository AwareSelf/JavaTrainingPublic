package datetimenumber;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeZoneBased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   ZonedDateTime currentZone = ZonedDateTime.now();
		   System.out.println("date time for current zone: "+ currentZone.getZone()+" is:"+currentZone);
		 
		    ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		    
		   ZonedDateTime tz =  ZonedDateTime.of(LocalDateTime.now(), tokyo);
		   
		    System.out.println("date time for zone: "+ tz.getZone()+" is:"+tz);

		    //Europe/Paris
		    
		    
		    ZoneId europe = ZoneId.of("Europe/Paris");
		    
			   ZonedDateTime tz1 =  ZonedDateTime.of(LocalDateTime.now(), europe);
			   
			    System.out.println("date time for zone: "+ tz1.getZone()+" is:"+tz1);
	}

}
