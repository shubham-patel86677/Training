//Task-5: Two-sum Problem

//a) Given an array of integers, write a program that finds if there are two numbers that add up to a specific target. You may assume that each input would have exactly one solution, and you may not use the same element twice. Optimize the solution for time complexity.
 

import java.util.*;
public class SumTarget{

    public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
          int target=sc.nextInt();
          for(int i=0;i<n;i++)
          {
             for(int j=1;j<n;j++)
             {
               if(a[i]+a[j]==target)
                  System.out.println(a[i]+" "+a[j]);
              }
           }
     }
}
