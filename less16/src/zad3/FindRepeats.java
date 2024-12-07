package zad3;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;

        if (substring == null || substring.isEmpty()) {
            return count;
        }

        while (text.contains(substring)) {
            count++;
            text = text.substring(text.indexOf(substring) + substring.length());
        }

        return count;
    }
}
