package designpatternTP6;

public class OctalObserver implements Observer {

	@Override
	public void update(Integer entiers) {
		// TODO Auto-generated method stub
		
        

        
        System.out.println("First state change:" + entiers);
        System.out.println("Octal String:" + Integer.toOctalString(entiers));   
	}

}
