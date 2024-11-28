package encapsulation;

public class Test2 {

	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		Test t1= new Test();
		t1.setEmPAge(5678798);
		t1.setEmPName("Shinde");
		t1.setIDNumber(6);
		
		System.out.println("empAge="+ t1.getEmPAge());
		System.out.println("emp name ="+ t1.getEmPName());
		System.out.println("Empage = "+ t1.getIDNumber());
		
	
		
		
	}
}
