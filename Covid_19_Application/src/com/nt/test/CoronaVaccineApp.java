package com.nt.test;
public class CoronaVaccineApp 
{
    public static void main(String[] args)
    {
        User user1 = new User("Ramesh",new VaccineEligibility(25, false),new DoseBooking());
        User user2 = new User("Suresh", new VaccineEligibility(17, true), new DoseBooking());

        Thread thread1 = new Thread(() -> 
        {
            try 
            {
                user1.bookDose();
            } 
            catch (RuntimeException e)
            {
                System.out.println(e.getMessage());
            }
        });

        Thread thread2 = new Thread(() -> 
        {
            try
            {
                user2.bookDose();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        });

        thread1.start();
        thread2.start();
    }
}