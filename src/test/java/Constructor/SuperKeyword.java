package Constructor;

public class SuperKeyword extends ParentSuper {
    String name="Viewers kitchen";
    public void getStringData()
    {
        System.out.println(name);
        System.out.println(super.name);


    }

    public SuperKeyword()
    {
        System.out.println("I am child constructor");
    }

    public void getData()
    {
        super.getData();
        System.out.println("I am in childsuper class");
    }


    public static void main(String[] args) {
        SuperKeyword sk=new SuperKeyword();
        sk.getStringData();

        sk.getData();

    }
}
