import java.util.Random;
public class Temp {

    Random rand = new Random();
    private int degree;
    public Temp()
    {
        degree = rand.nextInt(64, 91);
        
    }

    public int getTemp()
    {
        return degree;
    }
}
