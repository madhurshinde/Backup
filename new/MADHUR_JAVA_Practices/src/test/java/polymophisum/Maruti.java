package polymophisum;

public class Maruti extends car {
	
	public void thefsefty() {
		System.out.println("Maruti Theftself");
	}	
	public void start() {
		System.out.println(" child Car Start");
	}
	public void stop() {
		System.out.println("child Car stop");
	}
	public void refuel() {
		System.out.println("child Car refuel");
	}
	public static void resale() {
		System.out.println("Static resale child car");
	}
	
	public static void main(String[] args) {
		car cr=new car();
		cr.start();				// car Start
		cr.stop();				//car Stop
		cr.refuel();			//car refuel
		cr.demo();				//demo car
		cr.demo(3);				//demo car int
		cr.resale();			//Static resale car	
		System.out.println("               ");
		Maruti mar=new Maruti();
		mar.start();			//child Car Start
		mar.stop();				//child Car Start
		mar.refuel();			//child Car refuel
		mar.thefsefty();		// Maruti Theftself
		mar.resale();			// Static resale child car
		System.out.println("               ");
		car cam=new Maruti();
		cam.start();			// child Car Start
		cam.stop();				//child Car stop
		cam.refuel();			//child Car stop
		cam.resale();			//Static resale car			   //method hiding 
		cam.demo();				//demo Car 
		cam.demo(4);			//demo Car int
	}
}
