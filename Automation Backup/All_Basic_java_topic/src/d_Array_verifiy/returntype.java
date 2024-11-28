package d_Array_verifiy;

public class returntype {

	public int test1() {
	int madhur = 11;
	int shinde = 16;
	
	int result=madhur+shinde;
	return result;
	}
    public static void main(String[] args) {
    	returntype obj =new returntype();
		int done = obj.test1();
		System.out.println(done);
	}
}
