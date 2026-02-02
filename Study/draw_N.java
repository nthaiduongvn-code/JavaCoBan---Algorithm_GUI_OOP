package Study;

public class draw_N {
    public static void main() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == j)
//                  System.out.print(i + "" + j + "\t");  //(dòng này sẽ in ra tọa độ s của chữ N)
                    System.out.print("#" + "\t");
                else
                    System.out.print("\t");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i >= j )
                    System.out.print("#" + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("");

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i <= j)
                    System.out.print("#" + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i + j == 5)
                    System.out.print("#" + "\t");
                else
                    System.out.print("\t");
            }
                System.out.println("");



        }
    }
}
