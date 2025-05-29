import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Print the string: ");
        String str1 = scanner.nextLine();
        String[] words = str1.split(" ");
        for (String word : words) {
            if (word.length() > 0) {
                String c = word.substring(0, 1).toUpperCase() +
                        word.substring(1).toLowerCase();
                list.add(c);
            }
        }
        String result = String.join(" ", list);
        System.out.println("capital letters: " + result);
    }
}
