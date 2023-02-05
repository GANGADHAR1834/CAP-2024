import java.lang.*;
class Dice {
    int n;

    public Dice(int n) {
        this.n = n;
    }

    public int r() {
        return (int) (Math.random() * (6 * n - n*1)) + 1;
    }
}
