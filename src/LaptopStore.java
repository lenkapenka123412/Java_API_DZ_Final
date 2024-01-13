import java.util.*;

public class LaptopStore {
    private Set<Laptop> laptops;

    public LaptopStore() {
        laptops = new HashSet<>();
        // Добавляем ноутбуки в множество
        laptops.add(new Laptop("HP", 8, 512, "Windows", "Silver"));
        laptops.add(new Laptop("Dell", 16, 1024, "Linux", "Black"));
        laptops.add(new Laptop("Lenovo", 12, 256, "Windows", "Grey"));
    }

    public void filterLaptops(Map<String, Object> filters) {
        List<Laptop> filteredLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            boolean meetsCriteria = true;

            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String filterKey = entry.getKey();
                Object filterValue = entry.getValue();

                switch (filterKey) {
                    case "RAM":
                        meetsCriteria &= laptop.getRamSize() >= (int) filterValue;
                        break;
                    case "Storage":
                        meetsCriteria &= laptop.getStorageSize() >= (int) filterValue;
                        break;
                    case "OS":
                        meetsCriteria &= laptop.getOperatingSystem().equalsIgnoreCase((String) filterValue);
                        break;
                    case "Color":
                        meetsCriteria &= laptop.getColor().equalsIgnoreCase((String) filterValue);
                        break;
                    // Ещё критерии по необходимости
                }
            }

            if (meetsCriteria) {
                filteredLaptops.add(laptop);
            }
        }

        // Вывод отфильтрованных ноутбуков
        System.out.println("Отфильтрованные ноутбуки:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println("Бренд: " + laptop.getBrand() +
                    ", ОЗУ: " + laptop.getRamSize() +
                    ", Объем ЖД: " + laptop.getStorageSize() +
                    ", Операционная система: " + laptop.getOperatingSystem() +
                    ", Цвет: " + laptop.getColor());
        }
    }
}
