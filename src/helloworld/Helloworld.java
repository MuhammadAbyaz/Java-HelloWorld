
package helloworld;

import java.util.Scanner;

public class Helloworld {
    
    public static int sum (int a, int b){
        return a+b;
    }
   
    public static void main (String[]args){
//       String name = "Abyaz" ;
//      System.out.println(name); 
//      System.out.println("Hello World");     
//       
//       int a = 10, x=20, z=25 ;
//        
//       float b = 25.5f ;
//        
//       boolean Abyaz = true ; 
//
//       System.out.println(b);
//        System.out.println(a);
//        System.out.println(x);
//       System.out.println(z);        
//       System.out.println(Abyaz);
//        /*
//        Variables:
//         Variables are container that store data
//        String,int,float,char,boolean
//        how to declare a variable 
//        syntax <data type> <var name> = <value>;        
//        */  
//        /*rules for constructing names fo variable in java 
//        1. Can contain letter,underscore,dollar,numbers
//        2. Should begin with letter, dollar, underscore
//        3. Java is case sensitive language
//        4. Should not contain  wide spaces
//        5. Cannot conatin Java reserved words
//        */
//        /*
//        Data types in  Java
//        1. primitive. byte(1 byte),long(8 byte),int(4 byte),short(2 byte),float(4 byte)
//        Double(1 byte),boolean(1 bit),char(2 byte)
//        2. non primitive or reference
//        */
//        byte u=56 ;
//        System.out.println(u);
//        double d=45.21982981829d ;
//        System.out.println(d);
//        char grade= 'A';
//        System.out.println(grade);
//        /* operators in Java
//           operand,operator,operand =result
//             4         +        7   =11
//        Types of operator in Java
//        Arithmetic Operator 
//        Assignment Operator
//        Logical Operator
//        Comparison Operator
//      */
//        int num1=4, num2=7 ;
//        //assignment operator are follwing example (=)
//        num1+=1;
//        num2-=1;
//        num1*=2;
//        num2/=3;
//        num1%=1;
//        System.out.print("the value of num1 + num2 is");
//        System.out.println(num1 + num2);
//
//        System.out.print("the value of num1 - num2 is");
//        System.out.println(num1 - num2);
//        
//        System.out.print("the value of num1 * num2 is");
//        System.out.println(num1 * num2);
//        
//        System.out.print("the value of num1 / num2 is");
//        System.out.println(num1 / num2);
//        
//        System.out.print("the value of num1 % num2 is");
//        System.out.println(num1 % num2);
//        
//        System.out.println(num1++);
//        System.out.println(num1--);
//        System.out.println(++num1);
//        System.out.println(--num1);
//        /*comparison operator
//        1. == check equality of two values
//        2. != check if two values are not equal
//        3. < 
//        4. >
//        5. <==
//        6. >==
//        */
//        /*
//        Logical operators:
//        1. && - logical and operator - returns true if both condition are true
//        2. || - logical or operator - returns true if only one condition is true
//        3. ! - logical not  - reverse the the result if true than false and vice versa
//        */
//        
//        /*
//          Taking user input:
//        syntax :
//              scan = new Scanner()
//        */
//        /*
       Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Input");
//        String input = scan.nextLine();
//        System.out.println(input);
//        */
//        String Name = "Abyaz" ;
//        String Class = "9" ;
//        
//        System.out.println(Name + "studies in class" + Class);
//        System.out.println(Name.length ());
//        System.out.println(Name.toUpperCase());
//        System.out.println(Name.toLowerCase());
//        
//        System.out.println(Name + "studies in class\\" + Class);
//        System.out.println(Name + "studies in class\" "+ Class);
//        System.out.println(Name + "studies in class\t" + Class);
//        System.out.println(Name + "studies in class\n" + Class);
//        System.out.println(Name + "studies in class\'" + Class);
//        
//        System.out.println(Name.contains("Aby"));
//        System.out.println(Name.charAt(4));
//        System.out.println(Name.endsWith("bd"));
//        System.out.prin
//              for(int value : marks){tln(Name.indexOf("ary"));
//        
//        int num4 = 5 ,num5 = 6;
//        //math class meth
//              for(int value : marks){ods
//        System.out.println(Math.max(num4,num5));
//        System.out.println(Math.min(num4,num5));
//        System.out.println(Math.sqrt(25));
//        System.out.println(Math.a
//              for(int value : marks){bs(-35));
//        System.out.println(Math.abs(35));
//        System.out.println(Math.sqrt(25));
//        System.out.println(4+(8+1)*Math.random());//different vlaues return between4+8+1  
//        System.out.println(4+(8+1)*Math.random());
//        System.out.println(4+(8+1)*Math.random());
//        System.out.println(4+(8+1)*Math.random());
//        /*
//        conditionals statment
//        */
//          System.out.println("Enter your age");
//          int age = scan.nextInt();
//
//         if(age>=100){
//             System.out.println("you are an old man");
//         }
//         else if(age>=20){
//             System.out.println("you are an adult");
//        }
//         else if(age>=5){
//             System.out.println("you are not a kid!!");
//         }
//         else{
//             System.out.println("you are a kid!!");
//         }
         //swithes statement in JAVA
//            switch(age){
//              case 20:
//                    System.out.println("you are 20 years old");
//                break;
//              case 55:
//                    System.out.println("you are 55 years old");
//                break;
//              case 10:
//                    System.out.println("you are 10 years old");
//                break;
//              default:
//                    System.out.println("YOU DIDNOT MATCH THE ANY OF THE CASE !!");
//                break;
//                
                //LOOPS
//                int i =0 ;
//                while(i<100){
//                    System.out.println(i);
//                    i+= 1;
//                }
                //do while loop
//              syntax
//              do{   
//              } while(condition)
/*
                it will run one time if condition is false    
*/
//                int f=0;
//                do{
//                     System.out.println(f);
//                     f+=1;
//                } while (f>100);
/*
for loop 
        syntax: for(st1;st2;st3){
                }
//*/             
//                for(int a=0;a<=100;a++){
//                    System.out.println(a);
//                }
                //java arrays
//              int[] marks ={5,6,2,3};
//              marks[3] = 34; //updating in arrays
//              System.out.println(marks[3]);
                //classical way to iterate an array
//              for(int j=0; j<marks.length ; j++){ 
//              System.out.println(marks[j]);
//               }
                //for each loop
//              for(int value : marks){
//              [1][4]System.out.println(value);
//              }
              //two dimensional array
//            int[][] matrix={{1,2,3},{4,5,6}} ;
//            System.out.println(matrix [1][2]);
//            System.out.println(sum (5,7));         

        }
    
                
    }   
   
    

