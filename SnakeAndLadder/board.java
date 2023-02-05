import java.util.*;

public class board {
    int bsize;
    Queue<player> p;
    Dice d;
    HashMap<Integer, Integer> snkldr;

    board(int bsize, Queue<player> p, Dice d, HashMap<Integer, Integer> snkldr) {
        this.bsize = bsize;
        this.p = p;
        this.dyc = dyc;
        this.snkldr = snkldr;
    }
