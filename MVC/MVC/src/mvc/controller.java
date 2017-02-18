package mvc;


	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
			private double op1;
			private double op2;
			boolean isString=false;
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
				try{
					this.op1=Double.parseDouble(v.getnum1().trim());
					this.op2=Double.parseDouble(v.getnum2().trim());
					//JOptionPane.showMessageDialog(null, op1+"***"+op2+"***"+operation);
					m.calculate(op1,op2,operation);
					if(m.isString==true){
						v.setresult(-1,true);
					}
					else{  v.setresult(m.getresult(),false);}
					
				}
				catch(Exception ex){
					 v.setresult(-1,true);
				}
				
			
			}
		}
		


	}


