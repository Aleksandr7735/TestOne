import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
//        int n0 = 0;
//        int n1 = 1;
//        int res;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter amaut in elements in the serias ");
//        int numElems = scanner.nextInt();
//        System.out.println("1st elems= " + n0);
//        System.out.println("2nd elems =" + n0);
//        for (int i = 2; i < numElems; i++) {
//            res = n0 + n1;
//            System.out.println((i + 1) + "nd eltm = " + res);
//            n0 = n1;
//            n1 = res;
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the amount of money"); // количество денег
//        double s = scanner.nextDouble();
//        System.out.println("Enter rate"); //процентная ставка
//        double x = scanner.nextDouble();
//        System.out.println("Enter number years"); // Сколько лет
//        int n = scanner.nextInt();
//
//                double afterYears = s;
//        for (int i =0; i<n; i++){
//            afterYears = afterYears * (1 + x/100);
//            System.out.printf("After %d years" +"%.2f dollars", i+1, afterYears);
//
//        }
//
//
//        int N;
//        int prod = 1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите фибоначи  число"); // "Фибоначи" последовательность сложений
//        N = scanner.nextInt();
//        for (int i = 1; i<N+1; i++){
//            prod=prod*i;
//
//        }
//        System.out.println(prod);


//        Scanner scanner = new Scanner(System.in);      // Рисуем звездочки
//        System.out.println("Enter amaut of stairs");
//        int numofLayers;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter");
        int numOfLayers = scanner.nextInt();
        for (int LayerIndex = 0; LayerIndex < numOfLayers; LayerIndex++) {
            for (int j = 0; j < numOfLayers - LayerIndex; j++) {
                System.out.println("");
            }
            for (int k = 0; k < 2 * LayerIndex - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
//            }
//        }


//        for (int i = 1; i < 5; i++)
//            if (i == 3) {
//                System.out.println("continue"); // не получилось
//                continue;
//            }
//         System.out.println("i = " + i);


//        System.out.println("Enter a namber:");   //составное число или не составное
//        Scanner scanner = new Scanner(System.in);
//        int imput = scanner.nextInt();
//        boolean iscompasit = false;
//        for (int i = 2; i<Math.sqrt(imput); i++ ) {
//            if (imput % i ==0){
//                System.out.println("The number is composit");
//                iscompasit = true;
//                break;
//            }
//        }
//        if (!iscompasit) {
//            System.out.println("The namber is simpal");
//        }


//        int N;
//        int prod = 1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите факториал  число"); // "переделать под дроби" последовательность сложений
//        N = scanner.nextInt();
//        for (int i = 1; i<N+1; i++){
//            prod=prod*i;
//        }


//        System.out.println("Enter a namber:");   // Задача 9
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//        boolean iscompasit = false;
//
//        for (int j = 3; i<40; i/=j ) {
//            if (j % i ==1){
//                System.out.println("conekt");
//                iscompasit = true;
//                break;
//            }
//        }
//        if ("i") {
//            System.out.println("the end");
//        }




    }
}