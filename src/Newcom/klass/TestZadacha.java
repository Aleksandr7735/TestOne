package Newcom.klass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestZadacha {
    public static void main(String[] args) {
//        System.out.println(srr("Hello world"));
//    }
//    public static String srr (String str){
//        String regex = "[eo]";
//        return  str.toLowerCase().replaceAll(regex, "");


//
//    }
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("((0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))\\.){3}(0|1\\d{0,2}|2([0-4][0-9]|5[0-5]))");

        scanner.close();

    }
}
