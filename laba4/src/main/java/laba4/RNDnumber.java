package laba4;

public class RNDnumber {
    public  int rnd() {
        int min = 20;
        int max = 70;
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
