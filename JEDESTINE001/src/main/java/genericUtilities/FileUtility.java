package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * it is contains External File specific libraries
 * @author SAGAR NAYAK
 *
 */

public class FileUtility {
	/**
	 * its used return the value from the property file based on key
	 * @return
	 * @throws Throwable 
	 */
	
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src\\test\\resources\\CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(key);
	}

}
