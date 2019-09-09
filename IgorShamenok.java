package QA_test;

import java.util.Scanner;

public class IgorShamenok {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printHello();
        printHelloVyacheslav();
        int intArray[] = {4, 2, 6, 0, 8, 9, 3, 19, 18};
        printMultipleOfThree(intArray);
    }

    private static void printHello(){
        System.out.println("Введите число");
        if (scanner.nextInt() > 7){
            System.out.println("Привет");
        }
    }

    private static void printHelloVyacheslav(){
        System.out.println("Введите имя");
        switch (scanner.next()) {
            case "Вячеслав":
                System.out.println("Привет,Вячеслав");
                break;
            default:
                System.out.println("Нет такого имени");
                break;
        }
    }

    private static void printMultipleOfThree(int[] array){
        System.out.println("Числа кратные \"3\":");
        for (int value : array) {
            if (value == 0){
                continue;
            }else if (value % 3 == 0){
                System.out.println(value);
            }
        }
    }
}

//  4. [((())()(())]] данная последовательность не правильная, поскольку одна квадратная
//  скобка не закрыта. Первую "(" необходимо поменять на "[", чтобы последовательность
//  была правильной.