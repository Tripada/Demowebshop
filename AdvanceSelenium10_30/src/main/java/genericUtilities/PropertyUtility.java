package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author whosc
 *
 */
public class PropertyUtility implements IAutoConstants {
	/**
	 * This method is to read the data from property File
	 * This method accept key of the parameter you want to fetch
	 * @param key
	 * @return value of the key
	 */
	public String getDataFromPropertyFile(String key ) {
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream(PROPERTY_FILE_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(key);
	
	}

}
