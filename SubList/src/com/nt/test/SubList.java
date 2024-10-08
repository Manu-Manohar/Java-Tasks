package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class SubList
{
    public static <T> List<List<T>> findSublists(List<T> inputList)
    {
        List<List<T>> sublists = new ArrayList<>();  

       
        for (int i = 0; i < inputList.size(); i++)
        {
            for (int j = i + 1; j <= inputList.size(); j++)
            {
                List<T> sublist = inputList.subList(i, j);
                sublists.add(new ArrayList<>(sublist)); 
            }
        }

        return sublists;
    }

    public static void main(String[] args)
    {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        
        List<List<Integer>> result = findSublists(inputList);

        for (List<Integer> sublist : result) 
        {
            System.out.println(sublist);
        }
        Object[] array = inputList.toArray();
        for(int i=0;i<array.length;i++)
        {
        	System.out.println(array[i]);
        }
       
    }
}
