package mvc;


public class model {
	public boolean isString=false;
	private double result=0.0;
	public model(){}
	public void calculate(double x,double y,char operation){
	try{ if(operation=='+')
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
		this.isString=false;
		result=x/y;
	}}
		catch(Exception ss){
			result=-1;
			
		}
		
	}
	public double getresult()
	{
		return result;
	
	}
	

}

