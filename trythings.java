
import java.util.Random;
import java.util.HashMap;

public class trythings
{
    public static void main(){
    Random rand = new Random();
    HashMap<Integer, Integer> coordinates = new HashMap<Integer, Integer>();
    for(int i = 1; i<=4; i++){
    int def  = rand.nextInt(6);
    while(true)
    {
        if(coordinates.containsValue(def))
        {
            def = rand.nextInt(6);
        }else
        {
            break;
        }
    }
    coordinates.put(i, def);
    System.out.println(def);
    
    }
    }
}
