package Array;

public class PrintingMultiArray {
    public static void main(String[] args) {
        int a[][]=new int [2][3];
        int b[][]={{1,3,5},{2,4,6}};
        a[0][0]=2;
        a[0][1]=3;
        a[0][2]=6;
        a[1][0]=8;
        a[1][1]=9;
        a[1][2]=3;

        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<b.length;j++)
            {
                System.out.print(a[i][j]+ " ");

                System.out.print(b[i][j]+ " ");
            }
            System.out.println("\n");
        }

    }
}
