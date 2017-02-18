package mvc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class view extends JFrame {
	
	//public boolean isString=false;
	private JTextField num1=new JTextField("0",10);
	private JTextField num2=new JTextField("0",10);
	private JTextField result=new JTextField(10);
	private BorderLayout layout=new BorderLayout();
	private JButton add=new JButton("+");
	private JButton sub=new JButton("-");
	private JButton div=new JButton("%");
	private JButton mul=new JButton("x");
	private JPanel p1= new JPanel();
	private JPanel p2= new JPanel();
	private JPanel p3= new JPanel();
	
    public view()
	{

		setVisible(true);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(layout);
		p1.add(num1);p1.add(num2);p2.add(result);
		result.setEditable(false);
		p3.add(add);p3.add(sub);
		p3.add(div);p3.add(mul);
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
		this.add(p3,BorderLayout.SOUTH);
		
		
	}
	public String getnum1()
	{
		
		return num1.getText();
		
	}
	public String getnum2()
	{
		
		return num2.getText();
		
	}
	
	public void setresult(double d,boolean b)
	{
		if(b==true){
			result.setText("syntax error");
		}
		else{result.setText(""+d);}
		
	
	}
    
	void setoperationListener(ActionListener mal) {
        mul.addActionListener(mal);
        add.addActionListener(mal);
        div.addActionListener(mal);
        sub.addActionListener(mal);
    }
	
	
	
}

