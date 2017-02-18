package mvc;

import static org.junit.Assert.*;

import org.junit.Test;

public class modelTest {

	@Test
	public void test() {
		
		 model obj =new model();
			obj.calculate(4.0, 3.0,'+');
			    assertTrue(obj.getresult() == 7.0);
			    
		    model obj1 =new model();
			obj1.calculate(4.0, 4.0,'x');
			    assertTrue(obj1.getresult() == 16.0);
			    
			    
			    
			  
		    
	}

}
