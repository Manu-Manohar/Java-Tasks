package com.nt.test;

public class ThreadLife implements Runnable 
{
	@Override
    public void run() 
	{
        System.out.println(Thread.currentThread().getName() + " - State: " + Thread.currentThread().getState() + " - Running");

        try
        {
            Thread.sleep(5000);  
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " - State: " + Thread.currentThread().getState() + " - Finished work");
    }

    public static void main(String[] args) 
    {
    	System.out.println("!----------Main-Thread started----------!");
        
        ThreadLife runnable = new ThreadLife();
        
       
        Thread thread = new Thread(runnable);
        thread.setName("Child-1");        
        System.out.println(thread.getName() + " - State: " + thread.getState() + " - New (not started)");

      
        thread.start();
        System.out.println(thread.getName() + " - State: " + thread.getState() + " - After start() (RUNNABLE)");

        try
        {
            Thread.sleep(200);  
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println(thread.getName() + " - State: " + thread.getState() + " - During sleep (TIMED_WAITING)");

        try 
        {
            thread.join();
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        
        System.out.println(thread.getName() + " - State: " + thread.getState() + " - After join() (TERMINATED)");
        
        System.out.println("!----------MainThread Ended----------!");
    }
}

