import java.util.Scanner;
public class Ternary
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("Enter the no:");
int num=reader.nextInt();
String ternary=(num%2!=0)?"Odd":"Even";
System.out.println(num+"  is  "+ternary);

}
}