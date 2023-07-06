package Constructor;

public class DefaultConstructor {
    public DefaultConstructor()
    {
        int a,b,c;
        a=10;b=20;
        c=a+b;
        System.out.println(c);
    }
    public DefaultConstructor(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args) {
        DefaultConstructor dc=new DefaultConstructor();
        DefaultConstructor pc=new DefaultConstructor("Hello");


    }
}
