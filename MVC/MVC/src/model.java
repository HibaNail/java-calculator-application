
public class model {
	private int result=0;
	public model(){}
	public void calculate(int x,int y,char operation){
	
		if(operation=='+')
		{
			
			result=x+y;
		}
		else if(operation=='-')
		{
			result=x-y;
		}
		else if(operation=='x')
		{
			result=x*y;
		}
		else if(operation=='%')
		{
			result=x/y;
		}
		
	}
	public int getresult()
	{
		return result;
	
	}
	

}
