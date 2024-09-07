package com.company.lesson5;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void run() {
        byte secretNumber = (byte) (new Random().nextInt(100) + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Компьютер загадал число от 1 до 100. Попробуй его угадать");
        while (true) {
            System.out.println("Введите число от 1 до 100");
            String userInput = scanner.nextLine();
            // Проверка, является ли ввод числом
            if (!userInput.matches("-?\\d+")) {
                System.out.println("Ошибка ввода. Попробуйте еще раз: число от 1 до 100");
                continue;
            }


            // Преобразование строки в число
            try {
                byte userNumber = Byte.parseByte(userInput);
                if (secretNumber == userNumber) {
                    System.out.println("Вы угадали");
                    break;
                } else if (secretNumber > userNumber) {
                    System.out.println("Ваше число меньше");
                } else {
                    System.out.println("Ваше число больше");

                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Попробуйте еще раз: число от 1 до 100");
            }
        }

}
}
