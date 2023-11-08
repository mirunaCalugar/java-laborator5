package exercitiul2;

public class PerecheNumere {
    private int numar1;
    private int numar2;

    public PerecheNumere(int numar1, int numar2) {
        this.numar1 = numar1;
        this.numar2 = numar2;
    }

    public PerecheNumere() {
    }

    public int getNumar1() {
        return numar1;
    }

    public void setNumar1(int numar1) {
        this.numar1 = numar1;
    }

    public int getNumar2() {
        return numar2;
    }

    public void setNumar2(int numar2) {
        this.numar2 = numar2;
    }

    @Override
    public String toString() {
        return "PerecheNumere{" +
                "numar1=" + numar1 +
                ", numar2=" + numar2 +
                '}';
    }

    public  boolean isFibonacci() {

        if (numar1<= 0 &&numar2 <= 0) {
            return false;
        }
        int fib1 = 0;
        int fib2 = 1;
        while (fib1 <= numar2) {
            if (fib1 == numar1 && fib2 == numar2)
                return true;
            int fibNext = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibNext;
        }
        return false;

    }
    public  int cmmdc() {
        int a=numar1;
        int b=numar2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int cmmc() {
        int a=numar1;
        int b=numar2;
        if (a == 0 || b == 0) {
            return 0; // CMCM nu este definit pentru zero
        }
        return (a * b) / cmmdc();
    }

}