package module2;

public class SuperStudy 
{
	public void X()
	{ System.out.println("I am in SuperStudy.X()"); }

	public static void main(String[] args) 
	{ 
		SuperStudyChild ssc = new SuperStudyChild();
		ssc.X(); 
	}
}

class SuperStudyChild extends SuperStudy
{
	public void X()
	{ 
		super.X();
		System.out.println("I am in SuperStudyChild.X()"); 
	}
}

/**
 *i. What is the problem ?
 *Ans : Here in SuperStudyChild the X method is calling itself again and again that's why it is showing StackOverflow error.
 *
 *ii. How can we rectify the problem ?
 *Ans : We just have to call the superclass method instead of present class method.
 */

