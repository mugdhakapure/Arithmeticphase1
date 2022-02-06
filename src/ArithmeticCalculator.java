//As a developer, write a program to create an arithmetic calculator.
import java.util.Scanner;
import javax.swing.text.html.HTMLDocument.RunElement;

class Calculator
{
    int a,b;
    Calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int add()
    {
        return a+b;
    }
    int sub()
    {
      return a-b;
    }
    int mul()
    {
        return a*b;
    }
    int div()
    {
        return a/b;
    }

}

public class ArithmeticCalculator {
public static void main(String[] args) 
{
    Scanner sr = new Scanner(System.in);
    
    System.out.print("Ente a: ");
    int a=sr.nextInt();
    
    System.out.print("Enter b: ");
    int b=sr.nextInt();

    System.out.print("Enter the operation(+,-,*,/) :");
    String op=sr.next();

    int c=0;
    Calculator obj=new Calculator(a, b);
    switch(op)
    {
        case "+": c=obj.add();
        break;

        case "-": c=obj.sub();
        break;
        
        case "*": c=obj.mul();
        break;
        
        case "/": c=obj.div();
        break; 

        default: System.out.println("Invalid operation cade!!!");
    }
    System.out.println(a + op + b + "=" + c);
}
    
}
