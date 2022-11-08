import java.util.ArrayList;

public class Fibonachi {
    int range;
    ArrayList<Integer> numsFibonachi = new ArrayList<Integer>(range);

    public Fibonachi(int range) {
        this.range = range;

    }
    public void findFibonachi(){
        int n0 = 1;
        int n1 = 1;
        int numFib;
        numsFibonachi.add(n0);
        numsFibonachi.add(n1);
        for(int i = 3; i <= this.range; i++){
            numFib=n0+n1;
            n0=n1;
            n1=numFib;
            numsFibonachi.add(numFib);
        }
        System.out.println(numsFibonachi);
    }
}