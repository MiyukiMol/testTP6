package designpatternTP6;

import designpatternTP6.HexadecimalObserver;
import designpatternTP6.OctalObserver;
import designpatternTP6.BinaireObserver;
import designpatternTP6.ConcreteSubject;
import designpatternTP6.Observer;

/**
*
* @author tactfactory
*
* - Le programme doit utiliser un design pattern "Observer" afin d'avoir les éléments suivant :
*   - 1 : Un Subject sera observé par 3 observer
*   - 2 : Le Subject possédera un state de type int
*   - 3 : Lors de la modification du state du Subject les observers attachés seront appelé avec :
*       - 1 : Un observer affichera l'entier en hexadécimal
*       - 2 : Un observer affichera l'entier en octal
*       - 3 : Un observer affichera l'entier en binaire
*   - 3 : Le lancement de l'application doit afficher les éléments suivant :
*
*       First state change: 15
*       Hex String: F
*       Octal String: 17
*       Binary String: 1111
*       Second state change: 10
*       Hex String: A
*       Octal String: 12
*       Binary String: 1010
*/
public class ObserverTp6 {
  public static void main(String[] args) {

	  ConcreteSubject s1 = new ConcreteSubject(15);
	  ConcreteSubject s2 = new ConcreteSubject(10);
	  
	  Observer o1 = new OctalObserver();
	  
	  s1.attach(o1);
	  
	  s1.addObserver(new OctalObserver());
	  
	  s1.execute();
	 
  }
}
