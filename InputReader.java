

import java.util.Scanner;
import java.io.*;
public class InputReader
{
    private static Scanner reader = new Scanner(System.in);

    static String s = new String();
    static byte[] b = new byte[512];
    static int bytesRead = 0;

    public static String getString(String prompt)
    {
        String inputLine = null;
        boolean isValid = false;
        
        while(!isValid)
        {
            System.out.print(prompt); 
            inputLine = reader.nextLine();
            
            if(!inputLine.isEmpty())
                isValid = true;
            else 
                System.out.println("\nYour input is empty!\n");
        }

        return inputLine;
    }
    
    public static int getInt(String prompt)
    {
        int number = 0;
        boolean isValid = false;

        while(!isValid)
        {
            System.out.print(prompt);   

            try
            {
                bytesRead = System.in.read(b);
                s = new String(b,0,bytesRead-1);
                number = Integer.parseInt(s.trim());
                isValid = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("That is not a valid integer number!");
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }

    public static double getDouble(String prompt)
    {
        double number = 0;
        boolean isValid = false;

        while(!isValid)
        {
            System.out.print(prompt);  
            
            try
            {
                bytesRead = System.in.read(b);
                s = new String(b,0,bytesRead-1);
                number = (Double.valueOf(s.trim())).doubleValue();
                isValid = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("That is not a valid double number!");
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }

}
