import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mainZadachi {
//    private static final Scanner scanner = new Scanner(System.in);

    public mainZadachi() {
    }

    public static void main(String[] args) {

        // Время переделать:
//        Scanner scanner = new Scanner(System.in);
//        String input= scanner.nextLine();
//        Pattern pattern = Pattern.compile("0[0-9]:[0-5][0-9]:[0-5][0-9]1[0-9]2[0-3]");
//        Matcher matcher = pattern.matcher(input);
//
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
//
//        LocalTime localTime;
//        while (matcher.find()){
//            System.out.println(matcher);
//            localTime = LocalTime.parse(matcher.group());
//            System.out.println(" . Second pause -" + localTime.toSecondOfDay());
//        }


//        int[] arr = {1, 54, 14, 3};
//        String strArr = arrToStr(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(strArr);
//    }
//    public static String arrToStr(int[]arr){
//        for (int i = 0; i < arr.length; i++) {
//            strArr.append(";");
//
//            if(i+1 ! = arr.length){
//                strArr.append(";");
//
//            }
//
//        }
//
//        return arrToStr.toString();
//
//    }
//    public static int[] strToArr(String strArr);
//    String[] strings=str.split("");
//    int[]ints=new int[strings.length];
//    for( inti=0; i<ints.length; i++){


        // выводит (надо разобраться)
//        String input = scanner.nextLine();
//
//        Scanner scanner = new Scanner(System.in);
//        Pattern pattern = Pattern.compile("(0[0-9]|1[0-9]|2[0-3]): ([0-5][0-9]): ([0-5][0-9])");
//        Matcher matcher = pattern.matcher(input);
//
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

//        String input = scanner.nextLine();
////
//        Scanner scanner = new Scanner(System.in);
//        Pattern pattern = Pattern.compile("(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])");
//        Matcher matcher = pattern.matcher(input);
//
//        LocalTime localTime;
//        while (matcher.find()) {
//            System.out.println(matcher.group() + "\t");
//            localTime=LocalTime.parse(matcher.group());
//            System.out.println(". Seconds passed - " +localTime.toSecondOfDay());
//        }


//        int[] arr = {12, 44, 894, 1658, 3554, 56};
//        System.out.println(secondMax(arr));
//
//    }
//    public static int secondMax(int[] arr){
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int tmp = arr[arr.length -1];
//        int repeatConter =0;
//        for (int i = 0; i < arr.length; i++) {
//            if (tmp ==arr[i]){
//                    repeatConter ++;
//            }
//
//        }
//        return arr[arr.length-repeatConter - 1];


        //NumTelefona;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter telephone number");
//        String input = scanner.nextLine();
//        Pattern pattern = Pattern.compile("(\\+375|80)(29|33|44|17|25)(\\d{7})");
//        Matcher matcher = pattern.matcher(input);
//
//        while (matcher.find()) {
//            System.out.println("Telephone: " + matcher.group());
//            System.out.println("Operator: " + defineOperator(matcher));
//
//        }
//        scanner.close();
//
//    }
//
//    public static String defineOperator(Matcher matcher) {
//        String tmp = matcher.group(2);
//        if (tmp.contains("17")) return "Beltelecom";
//        else if (tmp.contains("44"))  return "A1";
//        else if (tmp.contains("25")) return "Live";
//        else if (tmp.contains("33")) return "mts";
//        else if (tmp.contains("29")) {
//            if (matcher.group(3).charAt(0) - 0 % 3 == 0) {
//                return "velcom";
//            } else {
//                if (matcher.group(3).charAt(0) - '0' != 4) {
//                    return "mts";
//                }
//            }
//        }
//        return "Uncnow";




//    }

//    public static void rrr(int[] inputArray, int inputNumber){
//        System.out.println("Element and the sum :  ");
//        for (int i = 0; i <inputArray.length ; i++) {
//            for (int j = 0; j < inputArray.length; j++) {
//                if (inputArray[i] + inputArray[j]==inputNumber){
//                    System.out.println(inputArray[i] + "+" +inputArray[j]+ "="+inputNumber);
//                }

//            }

//        }
    }


}
