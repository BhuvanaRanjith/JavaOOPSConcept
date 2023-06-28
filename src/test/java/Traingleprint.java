public class Traingleprint {
    public static void main(String[] args) {
        int a = 1;
        for (int b = 1; b < 5; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print(a);
                System.out.print("\t");
                a++;
            }
            System.out.println(" ");
        }

    }
}
