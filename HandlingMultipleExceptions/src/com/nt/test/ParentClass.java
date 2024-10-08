package com.nt.test;

public class ParentClass 
{
    public void loadingClass(String className) throws ClassNotFoundException
    {
        Class.forName(className); 
    }
}
