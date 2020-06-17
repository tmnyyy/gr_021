/*
 * @created 17/06/2020 - 19:43
 * @project IntelliJ IDEA
 * @author Temnyakov Nikolay
 */
// Класс - это тип данных определяемый пользователем.

// Тип - это имя используемое для обозначения интерфейса.

import java.util.Scanner;

// Тип - это всего лишь способ группировки данных, для выделения определенного функционала и предметной области.
public class SomeClass {

    // psvm - shortcut (шаблон кода)
    public static void main(String[] args) {

        // Консоль - это экран и клавиатура
        // выводим на консоль
        System.out.println("Hello World!"); //\n - символ переноса строки

        Scanner scanner = new Scanner(System.in);

//        int year = scanner.nextInt();
//        System.out.println(year);

        int i = 12;
        i = ++i + i++ + i++ + i++ + ++i; // 13 + 13 + 14

        //Префексный инкремент ++i => i = i + 1 работаем с переменной i
        // Постфиксный инкремент i++ => работаем с переменной i
        // i = i +1
        System.out.println(i);

        boolean flag1 = 1 > 0;
        boolean flag2 = true;

        if(flag1 && flag2) {
            System.out.println(flag1 + " is true");
        } else {
            System.out.println(flag1 + " is false");
        }

        short index = 256;  // 0000 0001 0000 0000 operadn1
        short mask = 1;     // 0000 0000 0000 0001 operadn2

                            // result 0000 0001 0000 0001 (&(*) или |(+))

        //short result = (short)(index | mask);

        //short result = (short)(index & mask);

        /*
        Логические
        boolean => true, false;
        && - и (коньюнкция) - умножение(*)

        true(1) && true(1) => true(1)
        true(1) && false(0) => false(0)
        false(0) && true(1) => false(0)
        false(0) && false(0) => false(0)

        boolean value1 = 1 > 0; (true)
        boolean value2 = -1 > 0; (false)

        Пример:
        if (value1 == true) {
        }

        || - или (дизъюнкция) - сложение(+)

        true(1) || true(1) => true(1)
        true(1) || false(0) => true(1)
        false(0) || true(1) => true(1)
        false(0) || false(0) => false(0)


        ^ - исключающее или

        true(1) ^ true(1) => false(0)
        true(1) ^ false(0) =>  true(1)
        false(0) ^ true(1) => true(1)
        false(0) ^ false(0) => false(0)

        ! - отрицание (унарная операция)

        true => !true => false
        false => !false => true



         */





        /*
            ДЗ
            1) задачи по системам счисления (3,5)
            2) Выписать порядок (10, 16, 2)
            3) задачи и вопросы
         */



    }

}
