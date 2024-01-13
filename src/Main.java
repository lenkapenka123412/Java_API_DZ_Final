import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopStore laptopStore = new LaptopStore();
        Scanner scanner = new Scanner(System.in);

        // Запрос критериев фильтрации
        Map<String, Object> filters = new HashMap<>();
        System.out.println("Выберите критерии фильтрации:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Введите минимальный объем ОЗУ: ");
                filters.put("RAM", scanner.nextInt());
                break;
            case 2:
                System.out.print("Введите минимальный объем ЖД: ");
                filters.put("Storage", scanner.nextInt());
                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                filters.put("OS", scanner.next());
                break;
            case 4:
                System.out.print("Введите цвет: ");
                filters.put("Color", scanner.next());
                break;
            // Дополнительные критерии по необходимости
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        // Фильтрация и вывод результатов
        laptopStore.filterLaptops(filters);
    }
}
