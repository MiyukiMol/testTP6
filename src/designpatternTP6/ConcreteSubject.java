package designpatternTP6;

public class ConcreteSubject extends Subject {

  private int number;
  
  public ConcreteSubject(int number) {
	    this.setNumber(number);
	  }

  public int getNumber() {
	return number;
  }

  public void setNumber(int number) {
	this.number = number;
	System.out.println(this.number);
    this.notifyObservers();
  }

public void addObserver(OctalObserver octalObserver) {
	// TODO Auto-generated method stub
	
}

public void execute() {
	// TODO Auto-generated method stub
	
}
}