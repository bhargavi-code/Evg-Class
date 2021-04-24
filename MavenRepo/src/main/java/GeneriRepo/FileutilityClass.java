package GeneriRepo;

import java.io.FileInputStream;
import java.util.Properties;

public class FileutilityClass 
{
	public String getdataproperty(String key) throws Exception
	{
		FileInputStream fis = new FileInputStream(Bhavi.propath);
		Properties po = new Properties();
		po.load(fis);
		return po.getProperty(key);
		
	}
}
