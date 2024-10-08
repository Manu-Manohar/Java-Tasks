package com.nt.test;

public class Student 
{
    private String name;
    private EducationInstitute institute;

    public Student(String name, EducationInstitute institute)
    {
        this.name = name;
        this.institute = institute;
    }

   
    public void viewCoursesAndFees()
    {
        System.out.println("Available Courses:");
        for (Course course : institute.getCourses()) 
        {
            System.out.println(course.getCourseId() + ". " + course);
        }
    }
    
    public void viewOffers()
    {
        System.out.println("Ongoing Offers:");
        for (Offer offer : institute.getOffers()) 
        {
            System.out.println(offer.getOfferText());
        }
    }

   
    public void enrollInCourse(int courseId)
    {
        institute.enrollStudentInCourse(courseId, name);
    }
}
