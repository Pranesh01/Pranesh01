/*
  Program Written by :  Pranesh Chowdhury
  Date               :  20/09/2021
  Program            :  Login into Profile.
 */
package IDCode;
import java.util.Scanner;

public class Password {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);

        System.out.println(" -------------- Login -------------");
        System.out.printf(" Username: ");
        String name = in.nextLine();

        System.out.printf(" Password: ");
        String pass = in.nextLine();

        Password obj = new Password();
        obj.passM (pass,name);

    }
    // Method for Username and Password.
    private void passM (String pass, String name){
        if (pass.equals("Pranesh34") && name.equals("Pranesh")){
            System.out.println(" ---------- Profile -----------");
            System.out.println(" Username: Pranesh Chowdhury\n" +
                    " ID: 20319919\n" +
                    " Country: Bangladesh\n");
        }
        else {
            System.out.printf(" Login Error !! ");
        }
    }
}
