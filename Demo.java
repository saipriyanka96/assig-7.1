package diff;
//we use different package because we call the protected method
//of class inside another class of different package
import java.io.IOException;
import different.Method;
public class Demo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Method m=new Method();//taking an object
	
		m.accept();
		
	//here it is accepting the object class 
	}

}

