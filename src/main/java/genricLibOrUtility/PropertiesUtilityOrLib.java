package genricLibOrUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtilityOrLib {

	public String getDataFromProperties(String data) throws Exception
	{
		FileInputStream fis =new FileInputStream(IconstantUtitlity.propertiesPath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String info =pobj.getProperty(data);
		return info;
	}

}
