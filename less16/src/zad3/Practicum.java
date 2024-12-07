package zad3;

public class Practicum {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, раз, раз", "раз");
        System.out.println(count); // Выводит: 3

        count = check.numberOfRepeats("раз два три, раз два три", "раз");
        System.out.println(count); // Выводит: 2

        count = check.numberOfRepeats("Hello, world!", "goodbye");
        System.out.println(count); // Выводит: 0
    }
}
