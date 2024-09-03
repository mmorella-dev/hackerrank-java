import java.io.*;
import java.math.*;

public class PrimalityTest {

    public static String getInput() throws IOException {
        try (
                var inputStreamReader = new InputStreamReader(System.in);
                var bufferedReader = new BufferedReader(inputStreamReader)) {
            return bufferedReader.readLine();
        }
    }

    public static boolean isProbablePrime(String n) {
        var bigInteger = new BigInteger(n);
        return bigInteger.isProbablePrime(3);
    }

    public static void main(String[] args) throws IOException {
        String n = getInput();
        var output = isProbablePrime(n) ? "prime" : "not prime";
        System.out.println(output);
    }
}
