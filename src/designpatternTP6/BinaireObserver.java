package designpatternTP6;

public class BinaireObserver implements Observer{

	 

	@Override
	public void update(Integer entiers) {
		int i = 127;
		System.out.println("First state change:" + i);
	    System.out.println("Binary String:" + Integer.toBinaryString(i)); 
	}

     
     
}
