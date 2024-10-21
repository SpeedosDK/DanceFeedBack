import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dancer[] dancers = {new Breakdancer(), new ElectricBoogieDancer()};

        for (Dancer dancer : dancers) {
            dancer.dance();
        }

        ArrayList<Dancer> dancerArrayList = new ArrayList<>();
        dancerArrayList.add(new Breakdancer());
        dancerArrayList.add(new ElectricBoogieDancer());

        for (Dancer dancer : dancerArrayList) {
            dancer.dance();
        }
    Dancer newDancer = new Breakdancer();
        if (newDancer instanceof Breakdancer) {
            newDancer.dance();
        }
        Dancer newDancer2 = new ElectricBoogieDancer();
        if (newDancer2 instanceof ElectricBoogieDancer) {
            newDancer2.dance();
    }

    }
}