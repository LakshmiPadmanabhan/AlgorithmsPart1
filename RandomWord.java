import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
public class RandomWord{
    public static void main(String args[]){
        String champion="";
        double i=1.0;
        while(!StdIn.isEmpty()){
            String name=StdIn.readString();
            boolean ans=StdRandom.bernoulli(1/(i));
            if(ans){
                champion=name;
            }
            i=i+1;
        }
        StdOut.println(champion);
    }
}