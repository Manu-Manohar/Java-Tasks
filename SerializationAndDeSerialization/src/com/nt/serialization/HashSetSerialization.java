package com.nt.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
@SuppressWarnings("serial")
class Students implements Serializable
{
	private String studentId,StudentName;

	public Students(String studentId, String studentName) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(StudentName, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(StudentName, other.StudentName) && Objects.equals(studentId, other.studentId);
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", StudentName=" + StudentName + "]";
	}
} 

public class HashSetSerialization 
{
	public static void main(String[] args) throws IOException
	{
		HashSet<Students> hs = new HashSet<Students>();
		hs.add(new Students("1001", "Manohar"));
		hs.add(new Students("1002", "Mani"));
		hs.add(new Students("1003", "ManU"));
		hs.add(new Students("1004", "May"));
		hs.add(new Students("1005", "March"));
		
		var fos= new FileOutputStream("D:\\Manu\\New folder\\Serialization\\students.txt");
		var oos = new ObjectOutputStream(fos);
		
		try(fos;oos)
		{
			oos.writeObject(hs);
			System.err.println("Successfully completed....");
		}
		
		var fis = new FileInputStream("D:\\Manu\\New folder\\Serialization\\students.txt");
		var ois = new ObjectInputStream(fis);
		try(fis;ois)
		{
			
			  @SuppressWarnings("unchecked")
			HashSet<Students> hs1= (HashSet<Students>) ois.readObject();
			  for (Students str : hs1)
			  {
				  System.out.println(str.toString());
			  }
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
	}
}
