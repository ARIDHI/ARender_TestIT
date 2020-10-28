/**
 * 
 */
package End_To_End____Test;

import java.lang.reflect.Method;

import FullActionpage.rotationFonction;
import Locators.FactoryLocator;
import Locators.FileFactoryLocator;

/**
 * @author ARIDHI Hichem
 *
 */
public class RotationTest extends pageObject.TestBase implements FactoryLocator, FileFactoryLocator {
	 
	
	  public void leftRotation(Method method) throws InterruptedException {
		  //TODO
		  try {
		   page.getInstance(rotationFonction.class).getLeftRotate();   
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
	  
	  public void rightRotation(Method method) throws InterruptedException {
		  //TODO
		  try {   
	       page.getInstance(rotationFonction.class).getRightRotate();
		  }
		  catch(Exception e) {
	  		  e.printStackTrace();
	  	   }
	  }
}
