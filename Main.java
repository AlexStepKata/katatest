import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        String[] words = in.split(" ");
        String s = words[1];
        //String s1 = words[3];
        if ((Objects.equals(words[0], "I") || Objects.equals(words[0], "II")
                || Objects.equals(words[0], "III")|| Objects.equals(words[0], "IV")
                || Objects.equals(words[0], "V")|| Objects.equals(words[0], "VI")
                || Objects.equals(words[0], "VII")|| Objects.equals(words[0], "VIII")
                || Objects.equals(words[0], "IX")|| Objects.equals(words[0], "X"))
                & (Objects.equals(words[2], "I") || Objects.equals(words[2], "II")
                || Objects.equals(words[2], "III")|| Objects.equals(words[2], "IV")
                || Objects.equals(words[2], "V")|| Objects.equals(words[2], "VI")
                || Objects.equals(words[2], "VII")|| Objects.equals(words[2], "VIII")
                || Objects.equals(words[2], "IX")|| Objects.equals(words[2], "X"))

        ) {
            switch (words[0]) {
                case "I" -> words[0] = "1";
                case "II" -> words[0] = "2";
                case "III" -> words[0] = "3";
                case "IV" -> words[0] = "4";
                case "V" -> words[0] = "5";
                case "VI" -> words[0] = "6";
                case "VII" -> words[0] = "7";
                case "VIII" -> words[0] = "8";
                case "IX" -> words[0] = "9";
                case "X" -> words[0] = "10";

            }
            int a = Integer.parseInt(words[0]);
            switch (words[2]) {
                    case "I" -> words[2] = "1";
                    case "II" -> words[2] = "2";
                    case "III" -> words[2] = "3";
                    case "IV" -> words[2] = "4";
                    case "V" -> words[2] = "5";
                    case "VI" -> words[2] = "6";
                    case "VII" -> words[2] = "7";
                    case "VIII" -> words[2] = "8";
                    case "IX" -> words[2] = "9";
                    case "X" -> words[2] = "10";
                }
            int b = Integer.parseInt(words[2]);
                    if (a > 10 || b > 10 || a < 1 || b < 1) {
                        throw new Exception("Используйте только числа от 1 до 10");
                    } else if (Objects.equals(s, "+")) {
                                int r = a + b;
                                String r1 = Integer.toString(r);
                                Arab arab2 = Arab.values()[r-1];
                                System.out.println(arab2);
                    } else if (Objects.equals(s, "/")) {
                                int r = a / b;
                                String r1 = Integer.toString(r);
                                Arab arab2 = Arab.values()[r-1];
                                System.out.println(arab2);
                    } else if (Objects.equals(s, "*")) {
                                int r = a * b+1;
                                String r1 = Integer.toString(r);
                                Arab arab2 = Arab.values()[r-1];
                                System.out.println(arab2);
                    } else if (Objects.equals(s, "-")) {
                                int r = a - b;
                                String r1 = Integer.toString(r);
                                Arab arab2 = Arab.values()[r-1];
                                System.out.println(arab2);
                    } else throw new Exception("Можно использовать только +,-,/,*");
        }

        else {
            int a = Integer.parseInt(words[0]);
            int b = Integer.parseInt(words[2]);
            if (a > 10 || b > 10 || a < 1 || b < 1) {
                throw new Exception("Используйте только числа от 1 до 10");
            } else if (words.length>3){
                throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } else if (Objects.equals(s, "+")) {
            int r = a + b;
            System.out.println(r);
            } else if (Objects.equals(s, "/")) {
            int r = a / b;
            System.out.println(r);
            } else if (Objects.equals(s, "*")) {
            int r = a * b;
            System.out.println(r);
            } else if (Objects.equals(s, "-")) {
            int r = a - b;
            System.out.println(r);
            }
            else throw new Exception("Можно использовать только +,-,/,*");
        }

    }
}