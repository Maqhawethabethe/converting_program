
package decimal_hexadecimal;



import java.io.IOException;
import java.util.Scanner;

public class Decimal_Hexadecimal{
    public static void main(String args[])throws IOException
    {
      Scanner input = new Scanner( System.in );
      System.out.print("Enter a decimal number : ");
      int decimal =input.nextInt();
        
      // calling method toHexString()
      String str = Integer.toHexString(decimal);
      System.out.println(decimal+" In Decimal = "+str+" in Hexadecimal");
      
      
      //converting Base10-Binary 2nd
      Scanner user_Value = new Scanner( System.in );
      System.out.print("Enter a base 10 number : ");
      int num =user_Value.nextInt();
    // convert decimal to binary
       String binary = Integer.toBinaryString(num);
       System.out.println(num + " in decimal = " + binary + " in binary.");
       
       //converting Binary 2nd-Base10
       Scanner input_val = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       String binaryString =input_val.nextLine();
       System.out.println("Decimal = "+Integer.parseInt(binaryString,2));
}
}