package validateInput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //name
//        System.out.println("Enter your name");
//        String name = scanner.nextLine();
//
//        Pattern pattern = Pattern.compile( "[a-zA-Z]{3,10}|\\s");
//        Matcher matcher = pattern.matcher(name);
//        boolean found = matcher.find();
//
//
//        if(found){
//            System.out.println("match found " + found);
//        } else {
//            System.out.println("not found a match");
//        }


        //email address

//        System.out.println("Enter your email address");
//        String email = scanner.nextLine();
//
//
//        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@gmail\\.com$");
//        Matcher matcher = pattern.matcher(email);
//        boolean found = matcher.matches();
//
//
//        if(found){
//            System.out.println("match found " + found);
//        } else {
//            System.out.println("not found a match");
//        }


        //Phone number
        System.out.println("Enter your phone number below");
        String number = scanner.nextLine();

        Pattern pattern = Pattern.compile( "^(07|\\+254|254|01)[0-9]{7,10}");
        Matcher matcher = pattern.matcher(number);
        boolean found = matcher.find();


        if(found){
            System.out.println("match found " + found);
        } else {
            System.out.println("not found a match");
        }

    }
}


