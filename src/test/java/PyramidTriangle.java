public class PyramidTriangle {
    public static void main(String[] args) {
        int k=10;
        for (int i = 0; i <=4 ; i++) {
           System.out.print("\n");
            for (int j = 1; j<=4-i; j++) {
                System.out.print(k +" ");
                k--;
            }

        }


    }

}

