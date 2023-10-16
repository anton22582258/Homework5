import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println( " Задача 1 ");
        var os = 0;
        if ( os == 0 )
            System.out.println
                    ( " Установите версию приложения для IOS по ссылке " );
        else if ( os == 1 )
            System.out.println( " Установите версию приложения для Android по ссылке " );
        else System.out.println( " Такое приложение не поддерживается ");
        // Задача 2
        System.out.println( " Задача 2 ");
        var clientDeviceYear = 2015;
        if ( os == 0 && clientDeviceYear < 2015 )
            System.out.println( " Установите облегченную версию приложения для IOS по ссылке " );
        if ( os == 0 && clientDeviceYear >= 2015 )
                System.out.println( " Установите версию приложения для IOS по ссылке ");
        if ( os == 1 && clientDeviceYear < 2015 )
            System.out.println( " Установите облегченную версию приложения для Android по ссылке " );
        if ( os == 1 && clientDeviceYear >= 2015 )
            System.out.println( " Установите версию приложения для Android по ссылке ");
        // Задача 3
        System.out.println( " Задача 3 ");
        var year = 2021;
        if (( year % 4 == 0 && year % 100 == 0 ||  year % 400 == 0 ) && year > 1584 )
        System.out.println( " Год " + year + " високосный. ");
        else System.out.println( " Год " + year + " невисокосный. ");
        // Задача 4
        System.out.println( " Задача 4 ");
        var deliveryDistance = 67;
        var deliveryDay = 1;
        if ( deliveryDistance < 20 ) {
            System.out.println( " Потребуется дней: " + deliveryDay ); }
        else if ( deliveryDistance >= 20 && deliveryDistance < 60 )
        { deliveryDay ++;
            System.out.println( " Потребуется дней: " + deliveryDay ); }
        else if ( deliveryDistance >= 60 && deliveryDistance <= 100 )
        {  deliveryDay = deliveryDay + 2;
        System.out.println( " Потребуется дней: " + deliveryDay ); }
        else
            System.out.println( " Доставки нет " );
        // Задача 5
        System.out.println( " Задача 5 ");
        var monthNumber = 3;
        switch ( monthNumber )
        {case 1: System.out.println( " Зима ");
            break;
        case 2: System.out.println( " Зима ");
        break;
        case 3: System.out.println( " Весна ");
        break;
        case 4: System.out.println( " Весна ");
        break;
        case 5: System.out.println( " Весна ");
        break;
        case 6: System.out.println( " Лето ");
        break;
        case 7: System.out.println( " Лето ");
        break;
        case 8: System.out.println( " Лето ");
        break;
        case 9: System.out.println( " Осень ");
        break;
        case 10: System.out.println( " Осень ");
        break;
        case 11: System.out.println( " Осень ");
        break;
        case 12: System.out.println( " Зима ");
        break;
            default: System.out.println( " Такого месяца нет "); } } }

