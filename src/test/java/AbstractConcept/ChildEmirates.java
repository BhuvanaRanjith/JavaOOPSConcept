package AbstractConcept;

public class ChildEmirates extends PaentAirCraft {
    public static void main(String[] args) {

        ChildEmirates c=new ChildEmirates();
        c.Engine();
        c.safetyGuidlines();
        c.bodyColor();
        c.logo();
    }
    @Override
    public void bodyColor() {

        System.out.println("Red color in the body");

    }
    public void logo()
    {
        System.out.println("Logo printed");
    }
}
