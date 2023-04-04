package day27.Selnium.Basic;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertyFile {

	public static void main(String[] args) throws IOException  {
		
		//File name and location - Absolute path
		String filePath1="F:\\Eclipse_Programs\\JavaPrograms\\TestData.properties";
				//or relative path
		String filePath2=".\\TestData.properties";
				//or
		String filePath3=System.getProperty("user.dir")+"\\TestData.properties";
		//Create an instance of FileInputStream class by passing file location to its constructor
		//Attach a file to a FileInputStream as this will enable us to read data from the file as shown below as follows:
		FileInputStream fis=new FileInputStream(filePath3);
		System.out.println(fis.read());
		//Create an instance of Properties class 
		Properties prop=new Properties();
		//with the help of Properties class ref call load() and pass FileInputStream ref as a parameter
		prop.load(fis);
		//in order to read data from property file use getProperty(String key) of Properties class
		System.out.println("Application URL: "+prop.getProperty("appUrl"));
		System.out.println("Username: "+prop.getProperty("username"));
		System.out.println("Password: "+prop.getProperty("password"));
		System.out.println("confirmPassword: "+prop.getProperty("confirmPassword"));
		System.out.println("firstName: "+prop.getProperty("firstName"));
		System.out.println("lastName: "+prop.getProperty("lastName"));
		System.out.println("contactNumber: "+prop.getProperty("contactNumber"));
		System.out.println("emailId: "+prop.getProperty("emailId"));
	}

}