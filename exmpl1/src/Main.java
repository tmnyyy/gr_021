/*
 * @created 15/06/2020 - 20:45
 * @project IntelliJ IDEA
 * @author Temnyakov Nikolay
 */

// oracle code convention
public class Main { // существительные
    /*
        1) Эккель - "Философия java"
        2) Стив Макконнел - "Совершенный код"

        3) Э.Гамма "Приемы обьектно-ориентированного программирования"
        4) Кен Бек "Рефакторинг"
     */

    /*
        Цифры
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
        (10 цифр - определяют сиситему счисления)

        123 - число

        Двоичная система счисления
        Цифры
        0
        1
        (2 цифры)

        16-я система счисления

        Цифры
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
        A (10)
        B (11)
        C (12)
        D (13)
        E (14)
        F (15)
        (16 цифр - основание нашей системы счисления)

    123(10) = 1 * 10^2 + 2*10^1+3*10^0 = 100 + 20 + 3 = 123
    1010(2) = 1* 2^3 + 0* 2^2 + 1 * 2^1+ 0 * 2^0
    087(8) - неправильно

    0xAB - 16я

    9(10)+1
    10


     */


    /**
     *
     * Примитивные типы данных
     * byte = 8 бит 0111 0001
     * short = 16 бит
     * int = 32 бит
     * long = 64 бит
     *
     * boolean - true, false (1 байт)
     * flout
     * double
     * char
     *
     * Над примитивными типами имеются обертки
     *
     *
     * 0000 0000(2) - 0 (10)
     * 0000 0001(2) - 1 (10)
     * .... .... +1
     *
     * 0111 1111 - 127 // (64 + 32 + 16 + 8 + 4+ 2(2*2^1) + 1(1*2^0))127  (+1)
     * 1000 0000
     *
     * .... ....
     *
     * 1111 1111 - -1
     *
     *
     * 3
     *
     * 0000 0011 - +3 (10) (инверт + 1) (матем. дополнение)
     * 1111 1100 - 2
     *        +1
     * 1111 1101 - -3
     *
     *
     * 1
     * 0000 0001 = 1
     * 1111 1110
     *        +1
     * 1111 1111 = -1
     * 127 + 10 =
     */



    // code convention oracle - стандарты именования
    // сигнатура медота:
    // 1) Имя метода
    // 2) Типы параметров
    // 3) Тип возвращаемого значения - !!!
    // String [] args - массив
    // стереотип - собирательное понятие чего-либо
    public static void main(String[] args) { // глаголы в инфинитиве TO(не пишем) - например : to run - run
        byte item; // инициализация // value = 0xAB
        int value;

        // литерал - это то, что можно выразить односложно
        // экземпляр класса  = объект класса
        String name = "Nikolay";


    }
}
