public class InnerForloopConcept {
    public static void main(String[] args) {

        for(int i=0;i<=5;i++)
        {

            for(int j=1;j<=i;j++)//2<5
            {

                System.out.print(j);
                System.out.print("\t");

           }
            System.out.println(" ");
        }
    }
}
