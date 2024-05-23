import java.util.*;
class skener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int vert = sc.nextInt();
        int horz = sc.nextInt();

        String[][] arr = new String[R][C];

        for (int i = 0; i < R; i++) {
            String string = sc.next();
            for (int j = 0; j < C; j++) {
                arr[i][j] = string.substring(j, j+1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < vert; x++) {
                for (int j = 0; j < arr[0].length; j++) {
                    for (int y = 0 ; y < horz; y++) {
                        System.out.print(arr[i][j]);
                    }
                
                }
                System.out.println();
            }
        }

        sc.close();

    }
}