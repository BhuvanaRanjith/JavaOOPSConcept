package Constructor;

public class thisDemo {
    int a=20;


    public void getData()
    {
        int a=30;

        System.out.println(a);
        System.out.println(this.a);
        int b=this.a+a;
        System.out.println(b);

    }

    public static void main(String[] args) {
        thisDemo thisDemo=new thisDemo();
        thisDemo.getData();

    }
}
