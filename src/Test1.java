
public class Test1 {
	
	Test1()
	{
		System.out.println("0-args constructor");
	}
	
	Test1(int a)
	{
		System.out.println("1-args constructor");
	}
	
	Test1(int a, int b)
	{
		System.out.println("2-args constructor");
	}
	
	
	{
		System.out.println("Instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test1();
		new Test1(2);
		new Test1(2,4);
	}

}

/* constructor block login depends on objects like if three contrustor then it required 3 different objects to execute
 * Instance block is common for every objects. */
