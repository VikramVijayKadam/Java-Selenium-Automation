package Automation_Topic;

public class EncapsulationInSelenium 
{
	private int i;
	
	public EncapsulationInSelenium(int j)
	{
		i=j;
	}
    
	public void  getValue()
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		EncapsulationInSelenium eis=new EncapsulationInSelenium(3);
		eis.getValue();

	}

}
