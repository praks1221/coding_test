package prakriti;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.println("Enter a string");
        String name = in.nextLine();

        int len= name.length();
        String reverse="";
        int i;
        for(i=len-1; i>=0; i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.print("the reverse of given string is:" +reverse );
    }

}

