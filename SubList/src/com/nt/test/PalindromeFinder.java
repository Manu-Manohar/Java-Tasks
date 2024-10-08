package com.nt.test;
import java.util.HashSet;
import java.util.Set;

public class PalindromeFinder
{
    public static boolean isPalindrome(String str) 
    {
        int left = 0;
        int right = str.length() - 1;  //String

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static Set<String> findPalindromes(String s) 
    {
        Set<String> palindromes = new HashSet<>(); 
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i + 1; j <= s.length(); j++)
            {
                String substring = s.substring(i, j);
                if (isPalindrome(substring)) 
                {
                    palindromes.add(substring);
                }
            }
        }

        return palindromes;
    }

    public static void main(String[] args) 
    {
        String input = "MadaM";
        Set<String> result = findPalindromes(input);

        System.out.println("Palindrome substrings: " + result);
    }
}
