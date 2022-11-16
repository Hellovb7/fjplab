Exp no 01
Factorial
Input:-

public class Factorial {
public static void main(String[] args) {
int fact=1;
int num=5;
for(int i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial of "+ fact +" is "+ fact);
}
}

Output:-
Factorial of 5 is 120


Prime number
Input:-

public class prime {
public static void main(String[] args) {
// TODO Auto-generated method stub
int ct=0,n=0,i=1,j=1;
while(n<50){
j=1;ct=0;
while(j<=i){
if(i%j==0)
ct++;
j++;
}
if(ct==2){
System.out.printf("%d\n",i);
n++;
}
i++;
}
}
}

Output:-
2 3 5 7 11 13 17 19 23 29 31 37 41
43 47 53 59 61 67 71 73 79 83 89 97
101 103 107 109 113 127 131 137 139 149 151 157
163 167 173 179 181 191 193 197 199 211 223 227
229


SumAvg
INPUT:-

import java.util.Scanner;
public class sumavg {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner S = new Scanner (System.in);
System.out.println("Enter the value of n");
int n =S.nextInt();
int arr[]=new int[n];
System.out.println("Enter"+n+"numbers");
for(int i=0;i<n;i++)
{
arr[i]=S.nextInt();
}
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+arr[i];
}
System.out.println("Sum of n numbers is="+sum);
float avg=(float)sum/n;
System.out.println("Avg of n numbers is="+avg);
}
}

OUTPUT:-
Enter the value of n
3
Enter3numbers
23
34
43
Sum of n numbers is=100
Avg of n numbers is=33.333332

Exp no.2
Calculator
INPUT:-

import java.util.Scanner;
public class MAIN {
public static void main(String[] args) {
char operator;
Double number1, number2, result;
Scanner input = new Scanner(System.in);
System.out.println("Choose an operator: +, -, *, or /");
operator = input.next().charAt(0);
System.out.println("Enter first number");
number1 = input.nextDouble();
System.out.println("Enter second number");
number2 = input.nextDouble();
switch (operator) {
case '+':
result = number1 + number2;
System.out.println(number1 + " + " + number2 + " = " + result);
break;
case '-':
result = number1 - number2;
System.out.println(number1 + " - " + number2 + " = " + result);
break;
case '*':
result = number1 * number2;
System.out.println(number1 + " * " + number2 + " = " + result);
break;
case '/':
result = number1 / number2;
System.out.println(number1 + " / " + number2 + " = " + result);
break;
default:
System.out.println("Invalid operator!");
break;
}
input.close();
}
}

OUTPUT:-
Choose an operator: +, -, *, or /
+
Enter first number
45
Enter second number
544
45.0 + 544.0 = 589.0


Exp no 03
ComparingOfTwoRect
INPUT:-

import java.util.Scanner;
class rect{
double width;
double length,area;
String color;
Scanner sc = new Scanner(System.in);
rect(){
System.out.println("enter the length");
length=sc. nextDouble();
System.out.println("enter the width");
width=sc.nextDouble();
System.out.println("enter the colour");
color=sc.next();
area=length*width;
System.out.println("area of rectangle:"+area);
}
}
public class arearectangle {
public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("first rectangle");
rect r1=new rect();
System.out.println("second rectangle");
rect r2=new rect();
if(r1.area==r2.area && r1.color.equals(r2.color))
System.out.println("matching rectangle");
else
System.out.println("non matching rectangle");
}
}

OUTPUT:-
first rectangle
enter the length
21
enter the width
21
enter the colour
RED
area of rectangle:441.0
second rectangle
enter the length
32
enter the width
43
enter the colour
RED
area of rectangle:1376.0
non matching rectangle

Exp no 04
Constructor overloading
Input:- 

class Student
{
    int roll;
    String name;
    double marks;
    Student(int R,String N,double M)
    {
        roll=R;
        name=N;
        marks=M;
    }
    Student(String N,double M,int R)
    {
        roll=R;
        name=N;
        marks=M;
    }
    void display()
    {
        System.out.println("\n\t"+roll+"\t"+name+"\t"+marks);
    }
}
public class fjp {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Student s1=new Student(1,"Vikas",100);
        Student s2=new Student(2,"Sachin",97);
        System.out.println("\n\troll\tname\tmarks\n");
        s1.display();
        s2.display();
    }
}

Output:-
roll	name	marks

	1	Vikas	100.0

	2	Sachin	97.0
  
  
Exp no:- 05
SortingNumber
INPUT:-

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class sortinginteger {
public static void main(String[] args) {
// TODO Auto-generated method stub
List<Integer>list=Arrays.asList(15,1,-18,35,5,-19,0);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
}
}

OUTPUT:
[35, 15, 5, 1, 0, -18, -19]


SortingName
import java.util.*;
public class fjp {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        int n=4;
        String Names[]= {"Vikas","Sachin","Bhiaravnath","Akash"};
        Arrays.sort(Names);
        System.out.println("The names in alphabetical order are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(Names[i]);
        }
    }
}

Output:-
The names in alphabetical order are:
Akash
Bhiaravnath
Sachin
Vikas


Exp no 06
Add Matrices
Input:- 

import java.util.Scanner;
public class add_Matrix{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int column = sc.nextInt();

        int mat1[][] = new int [row][column];
        int mat2[][] = new int [row][column];
        int result[][] = new int [row][column];

        System.out.println("Enter the element of mat1: ");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                mat1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the element of mat2: ");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                mat2[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Your result as follows: ");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("Sum of matrices");
        }
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.println(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

Output:- 
Enter the number of rows: 
2
Enter the number of column: 
2
Enter the element of mat1: 
1
1

2
2

Enter the element of mat2: 
1
1

2
2

Your result as follows: 
Sum of matrices
Sum of matrices
2	
2	

4	
4


Exp no 07
Inheritance of player
Input:-

class Player {
    String name;
    int age, ranking;
    Player(String n, int a, int r) {
        name = n;
        age = a;
        ranking = r;
    }
    void display() {
        System.out.println("Player name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ranking: " + ranking);
    }
}
class cricket_player extends Player {
    String game;
    String role;
    cricket_player(String n, String g, String w, int a, int r) {
        super(n, a, r);
        game = g;
        role = w;
    }
    public void display() {
        super.display();
        System.out.println("Player game: " + game);
        System.out.println("Player role: " + role);
        System.out.println();
    }
}
class football_player extends Player {
    String game;
    String role;
    football_player(String n, String g, String w, int a, int r) {
        super(n, a, r);
        game = g;
        role = w;
    }
    public void display() {
        super.display();
        System.out.println("Player game: " + game);
        System.out.println("Player role: " + role);
        System.out.println();
    }
}
class hockey_player extends Player {
    String game;
    String role;
    hockey_player(String n, String g, String w, int a, int r) {
        super(n, a, r);
        game = g;
        role = w;
    }
    public void display() {
        super.display();
        System.out.println("Player game: " + game);
        System.out.println("Player role: " + role);
        System.out.println();
    }
}
class fjp {
    public static void main(String args[])
    {
        cricket_player c = new cricket_player("Vikas", "Cricket", "Batsman", 20,2);
        football_player f = new football_player("Sachin", "Football", "Striker", 21,3);
        hockey_player h = new hockey_player("Suraj", "Hockey", "Goalkeeper", 22,1);
        c.display();
        f.display();
        h.display();
    }
}

Output:-
Player name: Vikas
Age: 20
Ranking: 2
Player game: Cricket
Player role: Batsman

Player name: Sachin
Age: 21
Ranking: 3
Player game: Football
Player role: Striker

Player name: Suraj
Age: 22
Ranking: 1
Player game: Hockey
Player role: Goalkeeper


Exp no:-08
Interface implement
Input:-

interface Shape {
void input();
void area();
void perimeter();
}
class Circle implements Shape {
int r = 0;
double pi = 3.14, ar = 0, pr = 0;
@Override
public void input() {
r = 5;
}
@Override
public void area() {
ar = pi * r * r;
System.out.println("Area of circle :" + ar);
}
@Override
public void perimeter() {
pr = 2 * pi * r;
System.out.println("Perimeter of circle : " + pr);
}
}
class Rectangle extends Circle {
int l = 0, b = 0;
double ar, pr;
public void input() {
super.input();
l = 6;
b = 4;
}
public void area() {
super.area();
ar = l * b;
System.out.println("Area of rectangle :" + ar);
}
public void perimeter() {
super.perimeter();
pr = 2 * (l + b);
System.out.println("Perimeter of rectangle :" + pr);
}
}
class Ellipse extends Rectangle {
int a = 0, b = 0;
double ar, pr;
public void input() {
super.input();
a = 5;// length of semi major axis
b = 8;// length of semi minor axis
}
public void area() {
super.area();
ar = pi * a * b;
System.out.println("Area of Ellipse: " + ar);
System.out.println();
}
public void perimeter() {
super.perimeter();
pr = pi* Math.sqrt(2*(a*a)+(b*b));
System.out.println("Perimeter of Ellipse :" + pr);
}
}
public class exp08 {
public static void main(String[] args) {
Ellipse obj = new Ellipse();
obj.input();
obj.area();
obj.perimeter();
}
}

Output:-
Area of circle :78.5
Area of rectangle :24.0
Area of Ellipse: 125.60000000000001
Perimeter of circle: 31.400000000000002
Perimeter of rectangle :20.0
Perimeter of Ellipse :33.52602571137832


Exp no:-09
Exception handling
Input:-

public class fjp {
    public static void main(String args[]) {
        int num1 = 15, num2 = 0;
        int result = 0;
        try {
            result = num1 / num2;
            System.out.println("The result is" + result);
            String[] arr = { "Vikas", "Sachin", "Suraj", "Ade" };
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Error. Array is out of Bounds" + a);
        } catch (ArithmeticException d) {
            System.out.println("Can't be divided by Zero" + d);
        }
        finally {
            System.out.println("Finally Block Executed");
        }
        Thread.dumpStack();
    }
}

Output:-
Can't be divided by Zerojava.lang.ArithmeticException: / by zero
Finally Block Executed
java.lang.Exception: Stack trace
at java.base/java.lang.Thread.dumpStack(Thread.java:1380)
at exp09.main(exp09.java:25)


Exp no 10
Applet
Input:-

import java.applet.*;
import java.awt.*;
public class fjp extends Applet {
    public void paint(Graphics g){
        g.drawOval(0, 20, 100, 200);
        g.fillOval(120, 20, 100, 200);
        g.drawRect(240, 20, 100, 200);
        g.fillRect(360, 20, 100, 200);
        g.drawOval(480, 20, 200, 200);
        g.fillOval(700, 20, 200, 200);
        g.drawLine(920, 40, 100, 200);
        g.drawArc(900, 20, 200, 200, -90, 120);
        g.drawString("Applet Program", 600, 400);
    }
}


Exp no 11
Write the file from another file line by line
Input:-

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class exp11 {
public static void main(String[] args) throws IOException {
// Instantiating a file class
File file = new File("C:\\Users\\91814\\Downloads\\sampleData.txt");
// Instantiate an FileInputStream class
FileInputStream inputStream = new FileInputStream(file);
// Instantiating the Scanner class
Scanner sc = new Scanner(inputStream);
// StringBuffer to store the contents
StringBuffer buffer = new StringBuffer();
// Appending each line to the buffer
while (sc.hasNext()) {
buffer.append(" " + sc.nextLine());
}
System.out.println("Contents of the file: " + buffer);
// Creating a File object to hold the destination file
File dest = new File("C:\\Users\\91814\\Downloads\\outputFile.txt");
// Instantiating an FileWriter object
FileWriter writer = new FileWriter(dest);
// Writing content to the destination
writer.write(buffer.toString());
writer.flush();
System.out.println("File copied successfully.......");
}
}


Output:
Contents of the file: "This book is sold subject to the condition that it shall not, by the way of trade
or otherwise, be lent, resold, hired out, or otherwise circulated without the publisher’s prior written
consent in any form of binding or cover other than which it is published and without similar
condition including this condition being imposed on the subsequent purchaser and without limiting
the rights under copyright reserved above. "
File copied successfully.......

Exp no 12
Multi-threading 
Input:- 

class MyData implements Runnable {
    public void run() {
        try {
            for (int i = 1; i<=7; i++) {
                System.out.print("\t"+i);
            }
            System.out.println();
            for (char ch = 'A'; ch <= 'G'; ch++) {
                System.out.print("\t"+ch);
            }
        } finally {}
    }
}
class fjp{
    public static void main(String[] args) {
        MyData m1 = new MyData();
        Thread thread = new Thread(m1);
        thread.start();
    }
}

Output:-
1	2	3	4	5	6	7
A	B	C	D	E	F	G
