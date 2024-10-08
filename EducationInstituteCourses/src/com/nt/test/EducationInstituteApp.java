package com.nt.test;
public class EducationInstituteApp
{
    public static void main(String[] args)
    {
    	Course[] courses = new Course[] 
    	        {
    	            new Course(1, "Mathematics", 1000.0),
    	            new Course(2, "Science", 1200.0),
    	            new Course(3, "English", 900.0)
    	        };
    	Offer[] offers = new Offer[] 
    	        {
    	            new Offer("Special discount: Get 20% off on all courses!"),
    	            new Offer("Limited time offer: Enroll in any two courses and get one course free!")
    	        };
    	
        EducationInstitute institute = new EducationInstitute(courses, offers);

        
        Student virat = new Student("Virat", institute);
        Student dhoni = new Student("Dhoni", institute);

        
        Thread thread1 = new Thread(() -> 
        {
            virat.viewCoursesAndFees();
            virat.viewOffers();
            virat.enrollInCourse(1); 
        });

        Thread thread2 = new Thread(() -> 
        {
            dhoni.viewCoursesAndFees();
            dhoni.viewOffers();
            dhoni.enrollInCourse(2); 
        });

       
        thread1.start();
        try 
        {
            thread1.join();
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        thread2.start();

        
    }
}