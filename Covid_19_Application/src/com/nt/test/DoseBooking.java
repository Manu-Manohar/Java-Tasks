package com.nt.test;

public class DoseBooking
{
    private boolean booked = false;
    
    public synchronized void bookDose() 
    {
        if (booked)
        {
            throw new RuntimeException("Dose already booked.");
        }
        booked = true;
    }

    public boolean isDoseBooked()
    {
        return booked;
    }
}
