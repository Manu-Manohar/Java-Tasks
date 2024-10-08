package com.nt.test;

import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the size:");
        int n = Integer.parseInt(sc.nextLine());        
        for(int i=0;i<n;i++)
        {
            list.add(Integer.parseInt(sc.nextLine()));
        }
        
        System.out.println("Enter the a number");
        int n2 = Integer.parseInt(sc.nextLine());
        for(int j=0;j<n2;j++)
        {
        	System.out.println("Enter the insert/delete");
            String str = sc.nextLine();
                      
            if(str.equals("insert"))
            {
            	int x = Integer.parseInt(sc.nextLine());
                int y = Integer.parseInt(sc.nextLine());
                list.add(x,y);
            }
            else
            {
            	int x = Integer.parseInt(sc.nextLine());
                list.remove(x);
            }
        }
        
        System.out.println(list);
        sc.close();
    }
}