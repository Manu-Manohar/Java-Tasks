package com.nt.test;

class EducationInstitute 
{
    private Course[] courses;
    private Offer[] offers;
    
    public EducationInstitute(Course[] courses, Offer[] offers) 
    {
		super();
		this.courses = courses;
		this.offers = offers;
	}
    
    public Course[] getCourses() 
    {
        return courses;
    }

    public Offer[] getOffers() {
        return offers;
    }

    
    public void enrollStudentInCourse(int courseId, String studentName)
    {
        System.out.println(studentName + " has enrolled in the course: " + getCourseNameById(courseId));
    }
    
    private String getCourseNameById(int courseId) 
    {
        for (Course course : courses) 
        {
            if (course.getCourseId() == courseId) 
            {
                return course.getCourseName();
            }
        }
        return "Unknown Course";
    }
}