package basics;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String text =
            "Peter Piper picked a peck of pickled peppers\n" +
            "A peck of pickled peppers Peter Piper picked\n" +
            "If Peter Piper picked a peck of pickled peppers\n" +
            "Where's the peck of pickled peppers Peter Piper picked?";

        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write(text);
            fw.close();

            int pe = 0, pi = 0;
            int ch;
            StringBuilder content = new StringBuilder();

            FileReader fr = new FileReader("sample.txt");

            while ((ch = fr.read()) != -1) {
                content.append((char) ch);
            }
            fr.close();

            String s = content.toString().toLowerCase();

            for (int i = 0; i < s.length() - 1; i++) {
                String pair = s.substring(i, i + 2);

                if (pair.equals("pe"))
                    pe++;
                if (pair.equals("pi"))
                    pi++;
            }

            System.out.println("'pe' - no of occurrences - " + pe);
            System.out.println("'pi' - no of occurrences - " + pi);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
