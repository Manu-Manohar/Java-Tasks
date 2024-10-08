package com.nt.test;
class ChildClass extends ParentClass 
{
    @Override
    public void loadingClass(String className)
    {
        if (className.isEmpty()) {
            throw new IllegalArgumentException("Class name cannot be empty");
        }
        try
        {
            super.loadingClass(className); // Call superclass method
            System.out.println("Class loaded successfully: " + className);
        } 
        catch (ClassNotFoundException e) 
        {
            throw new RuntimeException("Unchecked Exception: RuntimeException from ChildClass", e);
        }
    }
}
