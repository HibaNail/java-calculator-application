import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
	private char operation;
	private view v;
	private model m;
	public controller(view x,model y)
	{
		 v=x;
		 m=y;
		 v.setoperationListener(new operationListener());
		 
	}
	
	class operationListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand()=="+")
			{
				
				operation='+';
				
			}
			else if(e.getActionCommand()=="-")
			{
				operation='-';
			}
			else if(e.getActionCommand()=="x")
			{
				operation='x';
			}
			else if(e.getActionCommand()=="%")
			{
				operation='%';
			}
			m.calculate(v.getnum1(), v.getnum2(),operation);
			 v.setresult(m.getresult());
		}
	}
	


}