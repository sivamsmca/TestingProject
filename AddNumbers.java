package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AddNumbers {
	
	public static int add(String numbers,String delimiter)
	{
		if(numbers.isBlank())
		return 0;
		else
		{
			
			String[] values=numbers.split(delimiter);
			
			
			Integer value1=null,value2=null;
			if(values!=null&&values.length>2)
			{
				value1=getNumberFromString(values[1]);
				value2=getNumberFromString(values[2]);
			}
				else
				{
					value1=getNumberFromString(values[0]);
					value2=getNumberFromString(values[1]);
				}
				if(value1<0 || value2<0)
					return -1;
				if(value1!=0 && value2!=0)
					return value1+value2;
				else 
					return 0;
		}
	}
	
	private static int getNumberFromString(String val) {
	 Pattern p = Pattern.compile("-?\\d+");
     Matcher m = p.matcher(val);
     int retVal=0;
     while(m.find()) {
    	 System.out.println(m.group());
         retVal=Integer.parseInt(m.group())+retVal;
     }
     return retVal;
	}

}
