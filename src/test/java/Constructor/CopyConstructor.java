package Constructor;

public class CopyConstructor {
    String name;
    int id;
    public CopyConstructor(String name,int id)
    {
        this.name=name;
        this.id=id;
        System.out.println("My name is "+name);
        System.out.println("My id is"+id);
    }
    public CopyConstructor(CopyConstructor cc1)
    {
        this.name=cc1.name;
        this.id=cc1.id;
        System.out.println("My name is "+name);
        System.out.println("My id is"+id);
    }

    public static void main(String[] args) {
        CopyConstructor cc=new CopyConstructor("lulu",101);
        CopyConstructor cc1=new CopyConstructor("sdfsd",102);
    }
}
