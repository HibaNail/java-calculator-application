import javax.swing.JFrame;

public class main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model m=new model();
		view jf=new view();
		
		controller c=new controller(jf,m);

	}

}
