import java.util.*;

public class peasoup {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
         // Consume the newline character

        while (n > 0) {
            int menu = sc.nextInt();// Consume the newline character
            sc.nextLine();
            String name =  sc.nextLine();
            boolean ps = false;
            boolean pa = false;

            while (menu > 0  && !(pa && ps)) {
                String food = sc.nextLine().trim().toLowerCase();
                if (food.equals("pancakes")) {
                    pa = true;
                } else if (food.equals("pea soup")) {
                    ps = true;
                }
                menu--;
            }

            if (pa && ps) {
                System.out.println(name);
                return;  // Exit the program if a restaurant is found
            }
            
            n--;
        }
        sc.close();

        System.out.println("Anywhere is fine I guess");
    }
}
