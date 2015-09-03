import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by charliehe on 9/2/2015.
 */
public class AnagramTestGenerator {

    private static Random random = new Random();

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException();
        }
        int num;
        try {
            num = 2 * Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
        List<String> lines = new ArrayList<>();
        lines.add(Integer.toString(num));
        for (int i = 0; i < num; i++) {
            lines.add(generate(true, 10));
            lines.add(generate(false, 10));
        }
        try {
            Files.write(Paths.get("src/test.txt"), lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private static String generate(boolean isPalindrome, int length) {
        Chars chars = new Chars(length);
        if (isPalindrome) {
            int half = length / 2;
            for (int i = 0; i < half; i++) {
                char c = randomChar();
                chars.add(c);
                chars.add(c);
            }
            if (length % 2 != 0) {
                chars.add(randomChar());
            }
            chars.shuffle(random);
            return chars.toString();
        } else {
            char c1, c2;
            do {
                c1 = randomChar();
                c2 = randomChar();
            } while (c1 == c2);
            chars.add(c1);
            for (int i = 0; i < 3; i++) {
                chars.add(c2);
            }
            for (int i = 0; i < (length - 4); i++) {
                chars.add(randomChar());
            }
            chars.shuffle(random);
            return chars.toString();
        }
    }

    private static char randomChar() {
        return (char) (random.nextInt(26) + 'a');
    }

    private static class Chars {

        char[] charArr;
        int counter;

        public Chars(int length) {
            charArr = new char[length];
            counter = 0;
        }

        public boolean add(char c) {
            if (counter < charArr.length) {
                charArr[counter] = c;
                counter++;
                return true;
            } else {
                return false;
            }
        }

        public int size() {
            return counter;
        }

        public boolean set(int pos, char c) {
            if (pos < charArr.length) {
                charArr[pos] = c;
                return true;
            } else return false;
        }

        public void shuffle(Random random) {
            for (int i = 0; i < charArr.length; i++) {
                swap(random.nextInt(i + 1), i);
            }
        }

        public void swap(int a, int b) {
            char temp = charArr[a];
            charArr[a] = charArr[b];
            charArr[b] = temp;
        }

        @Override
        public String toString() {
            return new String(charArr);
        }
    }
}
