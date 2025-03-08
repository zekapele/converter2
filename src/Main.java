public class Main {  // Оголошуємо клас Main
    // Функція для конвертації з Фаренгейтів в Цельсії
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        // Викликаємо функцію та виводимо результат
        System.out.println("100°F = " + fahrenheitToCelsius(100) + "°C");
    }
}
