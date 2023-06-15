
public class Test2 {
	
	Test2()
	{
		this(10);
		System.out.println("0-args constructor");
	}
	
	Test2(int a)
	{
		System.out.println("1-args constructor");
	}
	
	
	{
		System.out.println("Instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test2();
	}

}

/* constructor block login depends on objects like if three contrustor then it required 3 different objects to execute
 * Instance block is common for every objects. */
