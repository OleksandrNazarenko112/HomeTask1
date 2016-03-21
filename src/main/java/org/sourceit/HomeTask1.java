package org.sourceit;

public class HomeTask1 {

    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {
        return (number % 2) == 0;

    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(double a, double b) {

        double c = Math.sqrt((a * a) + (b * b));
        if (a * b != 0) {
            return c;
        } else {
            return 0;
        }
    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c) {
        double p = (a + b + c);
        return p;
    }

    /**
     * Метод находит площадь треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b) {

        double c = Math.sqrt((a * a) + (b * b));
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if (a * b != 0) {
            return area;
        } else {
            return 0;
        }
    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max) {
        return min + (int) (Math.random() * (max - min)) + 1;
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number) {
        if (number != 0) {
            return number % 10 + calculateSum(number / 10);
        } else {
            return 0;
        }
    }


    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till) {

        if (till <= 0) {
            return 1;
        }
        if (till <= 2)
            return 1;
        else
            return fibonacci(till - 1) + fibonacci(till - 2);
    }


    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket) {
        boolean a = true;
        boolean b = false;


            Long i1 = ticket % 10;
            Long i2 = (ticket / 10) % 10;
            Long i3 = (ticket / 100) % 10;
            Long i4 = (ticket / 1000) % 10;
            long i5 = (ticket / 10000) % 10;
            long i6 = ticket/100000;
            if ((i1 + i2 + i3) == (i4 + i5 + i6))return a;

        return b;
    }

        public static void main (String[]args){

            if (isEven(11)) {
                System.out.println("Четное");
            } else {
                System.out.println("Не четное");
            }
            System.out.println("Гипотенуза равна "
                    + findHypotenuse(8, 5));
            System.out.println("Периметр треугольника " + perimeter(1, 2, 3));
            System.out.println("Площадь треугольника " + area(5, 2));
            System.out.println("Случайное число " + generateNumberFromRange(-100, 100));
            System.out.println("Сумма чисел " + calculateSum(-111));
            System.out.println("элемент последовательности Фибоначи: " + fibonacci(0));
            System.out.println(isHappy(600006));

        }
        }

