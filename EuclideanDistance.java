

import java.lang.Math;
public class EuclideanDistance {
   static int x=2;
   static int y=2;

    public static void main(String[] args)
    {

     System.out.println(euclidean(x,y));
    }


    public static double euclidean(int...args){




        double d = (int) Math.pow(x, 2) + (int) Math.pow(y, 2);
        double h= Math.sqrt(d);



        return h;
    }
}



