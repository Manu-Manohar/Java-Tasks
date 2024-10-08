package com.nt.test;
public class ArrayStoreExample 
{
    public static void storeObjects() 
    {
        Object[] strings = new String[5];

        try
        {
           
            strings[0] = "Hello";   
            strings[1] = "World";   
            strings[2] = "Java";   
            System.out.println("Objects stored successfully.");
            
            
            strings[2] = 123;    
        } 
        catch (ArrayStoreException e)
        {
            throw e;
        }
    }
}
