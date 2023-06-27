public class PrintingNumbers {
    public static void main(String[] args)
    {
        //print 1 to 10

        int i=0;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }

        //printing reverse numbers 10-1
        int j=10;
        while (j>0)//(10>0)
        {
            System.out.println(j);//10
            j--;//9
        }

        //do while concept. It will run one time must before the conditions

        int k=20;
        do {
            k++;
            System.out.println(k);

        }while (k<30);


    }

}
