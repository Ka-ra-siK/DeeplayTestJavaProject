package com;

public class Test {


    public static void testingProgram() {
        int successCompletedTests = 0;
        int count = 1;
        int numOfTest = 6;
        int result;
        int expectResult;


        /*
        * Тест 1
        * */
        result = Solution.getResult("STWSWTPPTPTTPWPP", "Human");
        expectResult = 10;
        if (result == expectResult) {
            successCompletedTests++;
            System.out.println("Тест " + count + " прошел успешно!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        } else {
            System.out.println("Тест " + count + " прошел с ошибкой!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        }
        count++;

        /*
         * Тест 2
         * */
        result = Solution.getResult("STWSWTPPTPTTPWPP", "Swamper");
        expectResult = 15;
        if (result == expectResult) {
            successCompletedTests++;
            System.out.println("Тест " + count + " прошел успешно!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        } else {
            System.out.println("Тест " + count + " прошел с ошибкой!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        }
        count++;

        /*
         * Тест 3
         * */
        result = Solution.getResult("STWSWTPPTPTTPWPP", "Woodman");
        expectResult = 12;
        if (result == expectResult) {
            successCompletedTests++;
            System.out.println("Тест " + count + " прошел успешно!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        } else {
            System.out.println("Тест " + count + " прошел с ошибкой!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        }
        count++;

        /*
         * Тест 4
         * */
        result = Solution.getResult("STWSTTPPTPTTPWWW", "Human");
        expectResult = 12;
        if (result == expectResult) {
            successCompletedTests++;
            System.out.println("Тест " + count + " прошел успешно!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        } else {
            System.out.println("Тест " + count + " прошел с ошибкой!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        }
        count++;

        /*
         * Тест 5
         * */
        result = Solution.getResult("STWSTTPPTPTTPWWW", "Swamper");
        expectResult = 18;
        if (result == expectResult) {
            successCompletedTests++;
            System.out.println("Тест " + count + " прошел успешно!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        } else {
            System.out.println("Тест " + count + " прошел с ошибкой!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        }
        count++;

        /*
         * Тест 6
         * */
        result = Solution.getResult("STWSTTPPTPTTPWWW", "Woodman");
        expectResult = 13;
        if (result == expectResult) {
            successCompletedTests++;
            System.out.println("Тест " + count + " прошел успешно!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        } else {
            System.out.println("Тест " + count + " прошел с ошибкой!");
            System.out.println("Ожидаемо: " + expectResult);
            System.out.println("Получено: " + result + "\n");
        }

        System.out.println("Всего тестов: " + numOfTest);
        System.out.println("Завершено успешно: " + successCompletedTests);
        System.out.println("Закончено с ошибками: " + (numOfTest - successCompletedTests));
    }
}
