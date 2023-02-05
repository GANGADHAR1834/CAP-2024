public class player {
    String name;
    int l;

    player(String name, int l) {
        this.name = name;
        this.l = l;
    }

    public void setlocation(int newloc) {
        l = newloc;
    }

    public int getLocation() {
        return l;
    }
}
