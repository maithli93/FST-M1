package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    class Plane {

	private List<String> Passengers;
	private int maxPassengers;
	private Date lastTimeLanded;
	private Date lastTookOff;
	
	public Plane(int maxPassengers){
		this.maxPassengers=maxPassengers;
		this.Passengers=new ArrayList<>();
	}
	
	public void onboard(String passengers)
	{
		this.Passengers.add(passengers);
	}
	public Date takeOff() {
		this.lastTookOff=new Date();
		return lastTookOff;
	}
	
	public void land()
	{
		this.lastTimeLanded=new Date();
		 this.Passengers.clear();
	}
	
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	 
	public List<String> getPassesngers(){
		return Passengers;
	}
	
    }
    


public class Activity6 {

	public static void main(String[] args) throws Throwable {
		Plane plane=new Plane(10);
		plane.onboard("Annie");
		plane.onboard("Max");
		plane.onboard("John");
		
		System.out.println("Plane is taking off at :" +plane.takeOff());
		System.out.println("Passengers on the plane :" +plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane is Landing at:" +plane.getLastTimeLanded());
		
		
    
	
}

}
