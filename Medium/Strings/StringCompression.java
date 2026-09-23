import java.util.*;
//443. String Compression
public class StringCompression {

    public static int stringCompression(char[] chars) {

        int write = 0;

        for (int i = 0; i < chars.length; i++) {

            int count = 1;

            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {

                count++;
                i++;
            }

            chars[write] = chars[i];
            write++;

            if (count > 1) {

                String num = String.valueOf(count);

                for (char ch : num.toCharArray()) {

                    chars[write] = ch;
                    write++;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] chars = new char[n];

        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        System.out.println(stringCompression(chars));
    }
}