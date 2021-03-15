package designpatternTP6;

public class HexadecimalObserver implements Observer {

	@Override
	public void update(Integer entiers) {
		// TODO Auto-generated method stub

        int i = 15;

        System.out.println("First state change:" + i);
        System.out.println("Hex String:" + Integer.toHexString(i));   
	}

	
}
