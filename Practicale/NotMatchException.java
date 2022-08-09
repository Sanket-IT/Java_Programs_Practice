/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp26_27;

/**
 *
 * @author student
 */import java.util.Scanner;
class NotMatchExceptions extends Exception
{
    public NotMatchExceptions()
    {
        System.out.println("Invalid String");
    }
}
public class NotMatchException {
    public static void main(String[] args) {
          try{
            String pass;
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter String");
            pass=sc.nextLine();
            if (pass. equals("India"))
                   System.out.println("valid String");
                    
            else
                throw new NotMatchExceptions();
        }
        catch (NotMatchExceptions e)
                {
                    System.out.println(e);
                
                    
                    
        }
    }
    
}
