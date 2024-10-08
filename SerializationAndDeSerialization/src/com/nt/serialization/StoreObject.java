package com.nt.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StoreObject 
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Student> list = new ArrayList<>();
        
        for(int i = 0; i < 3; i++) 
        {
            Student studentObject = Student.getStudentObject();
            list.add(studentObject);
        }
        var fos = new FileOutputStream("D:\\Manu\\New folder\\Serialization\\student.txt");
        var oos = new ObjectOutputStream(fos);

        try (fos;oos) 
        {
            oos.writeObject(list);
            System.out.println("Student objects stored in the file successfully.");
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
