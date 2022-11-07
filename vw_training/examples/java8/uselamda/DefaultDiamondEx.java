package uselamda;

interface Drivable { 
	String getBrand(); 
	String speedUp(); 
	String slowDown(); 		
	default String turnAlarmOn() { return "Turning the vehicle alarm on."; } 
	default String turnAlarmOff() { return "Turning the vehicle alarm off."; }
 }

interface Alarm {

    default String turnAlarmOn() {
        return "Turning the alarm on.";
    }
    
    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }
}
class Car implements Drivable, Alarm {
    private String brand;
    //... 
    
    @Override
    public String turnAlarmOn() {
        return Drivable.super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return Drivable.super.turnAlarmOff();
    }
    
    // constructors/getters
    
    @Override
    public String getBrand() {
        return brand;
    }
    
    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }
    
    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }  
    
    
    /*
    // we can have the class use the default methods defined within the Alarm interface:
 
    @Override
    public String turnAlarmOn() {
        return Alarm.super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return Alarm.super.turnAlarmOff();
    }
   
   //It's even possible to make the Car class use both sets of default methods:
   
    @Override
    public String turnAlarmOn() {
        return Drivable.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
    }
        
    @Override
    public String turnAlarmOff() {
        return Drivable.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
    }
    */
}

public class DefaultDiamondEx {

}
