package Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		
BufferedReader bf=new BufferedReader(new FileReader("E:\\TeZ\\E1\\Json\\UserData.json"));
String temp;
while((temp=bf.readLine())!=null)
{
System.out.println(temp);	
}
		
	}

}
