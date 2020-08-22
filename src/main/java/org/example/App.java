package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int n = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int m = scanner.nextInt();
        System.out.println("Создаём и наполняем список");
        List<Integer> list = buildRandomList(n, m);
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтр:");
        int f = scanner.nextInt();
        List<Integer> listResult = new Filter(f).filterOut(list);
        Collections.sort(listResult);
        logger.log("Выводим результат на экран:\nОтфильтрованный список: " + listResult.toString());
        logger.log("Завершаем программу");
    }

    private static List<Integer> buildRandomList(int size, int maxValue) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }
}
