
public class Test3 {
	
	int eid;
	
	{ //instance block initializing value to variable during object creation
		eid = 111;
	}
	
	void disp()
	{
		System.out.println(eid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test3().disp();
	}

}
