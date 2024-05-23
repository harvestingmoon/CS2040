import java.util.*;

class apaxia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String newString = "";
        char prev = 0;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c != prev) {
                newString += c;
                prev = c;
            }
        }

        System.out.println(newString);

    }
}