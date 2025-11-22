package comOrangeHrmUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readconfigration {

	Properties pro;
	
	public readconfigration()
	{
		String path ="E:\\testing revision data\\program\\PracticeAutomation\\src\\test\\java\\config\\configproperties";
		try 
		{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
			
	}
	public String getApplicationUrl()
	{
		String url = pro.getProperty("url");
		return url;
	}
	public String getusername()
	{
		return pro.getProperty("username");
		
	}
	public String getpassword()
	{
		return  pro.getProperty("password");
		
	}
	
		}
		
	
