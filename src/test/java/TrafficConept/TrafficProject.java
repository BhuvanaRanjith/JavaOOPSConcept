package TrafficConept;

public class TrafficProject implements CentralTraffic,ContinentalTraffic{
    public static void main(String[] args) {
        TrafficProject t=new TrafficProject();
        t.greenGo();
        t.flashYellow();
        t.redStop();
        t.trainSymbols();
    }




    @Override
    public void greenGo() {
        System.out.println("GreenGo implementation");
    }

    @Override
    public void redStop() {
        System.out.println("redStop implementation");

    }

    @Override
    public void flashYellow() {
        System.out.println("Yellow implementation");

    }

    @Override
    public void trainSymbols() {
        System.out.println("Train symbols Loaded");
    }
}


