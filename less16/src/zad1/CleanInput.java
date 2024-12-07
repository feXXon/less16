package zad1;

public class CleanInput {

    public String fixString(String str) {
        String trimmedStr = str.trim();
        if (trimmedStr.isEmpty()) {
            return "Вы ничего не ввели!";
        } else {
            return trimmedStr;
        }
    }
    public static void main(String[] args) {
        CleanInput cleanInput = new CleanInput();

        // Примеры использования
        System.out.println(cleanInput.fixString("   ")); // Выводит: Вы ничего не ввели!
        System.out.println(cleanInput.fixString("   Hello, World!   ")); // Выводит: Hello, World!
        System.out.println(cleanInput.fixString("")); // Выводит: Вы ничего не ввели!
        System.out.println(cleanInput.fixString("   Java   ")); // Выводит: Java
    }
}

