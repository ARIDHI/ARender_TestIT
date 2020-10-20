/**
 * 
 */
package pageObject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * @author ARIDHI HICHEM
 *
 */
public class MyRetry implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  private static final int maxRetryCount = 2;
	 
	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
	    return false;
	  }
	}
