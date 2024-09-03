import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    
    public static ArrayList<String> readInput() {
        final var lines = new ArrayList<String>();
        try (var scanner = new Scanner(System.in)) {
            scanner.nextLine(); // ignore first line, with count
            while (scanner.hasNextLine()) {
                var line = scanner.nextLine();
                lines.add(line);
            }
        }
        return lines;
    }

    public static void main(String[] args) {
        final var inputLines = readInput();
        // Custom comparator: convert strings to BigDecimal and order descending
        inputLines.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                final var b1 = new BigDecimal(s1);
                final var b2 = new BigDecimal(s2);
                // sort descending
                return -b1.compareTo(b2);
            }
        });
        for (final var n : inputLines) {
            System.out.println(n);
        }
    }
}