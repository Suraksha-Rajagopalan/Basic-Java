# Basic-Java

```Class``` = A blueprint used to create objects and define its data type and methods.

```Object``` = basic blocks of code

<h3>Containers:</h3>
Interference between the component and the low level.
Example: int, String, float, double, Boolean, etc.



<h3>Rules used for naming variables:</h3>

<li>The name can contain numbers, characters, dollar sign and underscore.</li>
<li>The name of the variable can start with a dollar sign or an underscore sign.</li>
<li>Java is a case sensitive language and hence, name is different from Name which is different from nAme, etc.</li>
<li>Cannot use reserved words for variable naming.</li>

<h3>Primitive and Non-Primitive data types :</h3>

```Primitive data types``` : Pre defined by java, example, int (4 bytes), long (8 bytes), short (2 bytes), byte (1 byte), float (4 bytes), double (8 bytes) etc.

```Non Primitive data types``` : They are not created by Java except Strings.
They usually have more than one data type.

<h3>Operators in Java:</h3>
<li>Arithmetic operators</li>
<li>Comparison operators</li>
<li>Logical operators</li>
<li>Bitwise operators</li>
<li>Assignment operators</li>
<li>Unary operators</li>
<li>Ternary operators</li>
<li>Shift operators</li>

<h3>Taking Input in JAVA</h3>
Scanner is the function needs to be used for inputting values from user.

```java
import java.util.Scanner;
public class InputValues {
    public static void main(String[] args) {
        System.out.println("Enter:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("The input string is :"+input);
    }
}
```
![image](https://user-images.githubusercontent.com/91787553/183653284-4667f657-22ad-4021-bdff-14800e0ed5b8.png)


<h3>String Methods in JAVA:</h3>


```java
public class StringMethods {
    public static void main(String[] args)
    {
        String a = "Hello";
        String b = "Welcome";
        String c = "Goodbye";
        System.out.println(a+b+c);
        System.out.println(a.charAt(3));
        System.out.println(a.contains("He"));
        System.out.println(b.contains("ne"));
        System.out.println(c.endsWith("ye"));
        System.out.println(c.endsWith("bb"));
        System.out.println(a.length());
        System.out.println(b.toLowerCase());
        System.out.println(c.toUpperCase());
        System.out.println(a.indexOf("l"));
        System.out.println(b.indexOf("ee"));
    }
    
}
```


<h3>Math in JAVA</h3>

```java


public class MathJava {
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 7;
        System.out.println(Math.min(num1,num2));
        System.out.println(Math.max(num1,num2));
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.random());
        System.out.println(Math.abs(num1));
        System.out.println(Math.pow(num1,num2));

    }
    
}
```

Output:

![image](https://user-images.githubusercontent.com/91787553/183676044-034dbf05-920c-4825-8e61-c7dfd44dbba1.png)


<h3>Switch Cases</h3>
Switch statement is used to select when one of many code blocks have to be executed.

```syntax
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
```

<h3>if-else</h3>

```syntax
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```

<h3>LOOPS in JAVA</h3>
<li>while</li>
The while loop loops through a block of code as long as a specified condition is true.

```syntax
while (condition) {
  // code block to be executed
}
```

<li>do while</li>
The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

```syntax
do {
  // code block to be executed
}
while (condition);
```

<li>for loop</li>
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop.

```syntax
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```
<h3>break and continue</h3>

```break``` : Used when one wants to terminate a loop program unconditionally.

```continue``` :Used when one wants to skip one step in the loop.

<h3>Arrays</h3>
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

To declare an array, define the variable type with square brackets.

```java
int[] num = {1,2,3};
```
In oder to assess each element in an array we have for-each loop

```syntax
for (type variable : arrayname) {
  ...
}
```

Declaration of a multidimensional array:

```java
int[][] Numbers = {{1,2,3},{6,7,8}};
```

<h3>Try-Catch</h3>

The try statement allows you to define a block of code to be tested for errors while it is being executed. The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
The try and catch keywords come in pairs:

```syntax
try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
```

<h3>Methods</h3>
A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.

```syntax
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```
