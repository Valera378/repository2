package org.itstep;

import org.itstep.command.*;

import java.util.Scanner;

/*
* Практика на работу с интерфейсами
Создать приложение, которое использует паттерн Команда

Команда — это поведенческий паттерн проектирования, который превращает запросы в объекты, позволяя передавать их как аргументы при вызове методов, ставить запросы в очередь, логировать их, а также поддерживать отмену операций.

Реализуйте интерфейс Command:

public interface Command {
 void execute(String... args);
}
для поддержки следующих команд:

help

Выводит на сообщение Help executed

echo <text>

Выводит на консоль строку

Например:

echo Hello World

выведет:

Hello World

now

Выводит на экран текущую дату в миллисекундах начиная с 1 января 1970 года.
* Для получения времени используйте метод System.currentTimeMillis()

exit

Выводит на экран строку Goodbye! и завершает работу программы. Для завершения программы используйте метод System.exit(0).

Каждая реализация - это отдельный класс реализующий интерфейс Command.

Рекомендуется создать отдельный пакет org.itstep.command в который поместить классы и интерфейс Command.

Команды вводятся с клавиатуры после запуска программы.

В случае если команда неизвестна, то необходимо вывести на экран сообщение Error.

Пример работы программы:

>>> help
Help executed
>>> now
1604586299340
>>> echo Hello World
Hello World
>>> exit
Goodbye!
* */
public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Пишите ваш код здесь

        while (true) {
            System.out.print(">>>");
            String str = scanner.next();

                switch (str) {
                    case "help": {
                        new HelpCommand().execute();
                        System.out.println();
                        break;
                    }
                    case "now": {
                        new NowCommand().execute();
                        break;
                    }
                    case "echo": {
                        String text = scanner.nextLine();
                        new EchoCommand().execute(text);
                        System.out.println();
                        break;
                    }
                    case "exit":
                        new ExitCommand().execute();
                        System.out.println();
                        break;
                    default:
                        System.out.println("Error");;
                }

        }
    }

}