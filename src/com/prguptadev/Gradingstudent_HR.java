package com.prguptadev;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
Examples

 round to  (85 - 84 is less than 3)
 do not round (result is less than 40)
 do not round (60 - 57 is 3 or higher)
Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

Function Description

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

int grades[n]: the grades before rounding
Returns

int[n]: the grades after rounding as appropriate
Input Format

The first line contains a single integer, , the number of students.
Each line  of the  subsequent lines contains a single integer, .

Constraints

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
Explanation 0

image

Student  received a , and the next multiple of  from  is . Since , the student's grade is rounded to .
Student  received a , and the next multiple of  from  is . Since , the grade will not be modified and the student's final grade is .
Student  received a , and the next multiple of  from  is . Since , the student's grade will be rounded to .
Student  received a grade below , so the grade will not be modified and the student's final grade is .*/
public class Gradingstudent_HR {


    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream()
                .map( x -> x<38 ? x:(((x%10) - 5)<0  ?
                        (Math.abs((x%10) - 5)< 3 ? x+Math.abs((x%10) - 5):x) :
                        (Math.abs((x%10) - 10)<3 ? x+Math.abs((x%10) - 10):x ) )
                ).collect(Collectors.toList());
    }

  /*  public static int multipleoffive(int x ){
        int y= x;
        if(x % 5 != 0){
            int t = ((x%10) - 5) ;
            if(t <0){
                y = x+(Math.abs(t));

            }
            else{
                y = x+ Math.abs(t-5);
            }
            if((y-x)< 3) return y;
            else return x;
        }

        return x;
    }*/


    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(34);
        arr.add(67);
        arr.add(74);
        arr.add(98);
        arr.add(100);

      System.out.println(gradingStudents(arr));
    }
}

