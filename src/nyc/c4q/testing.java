package nyc.c4q;
/**
 * Created by c4q-joshelynvivas on 4/16/15.
 */
public class testing
{
    public static boolean isOdd(int n)
    {
        int i = 0;
        boolean odd = false;

        while (i != n) {
            odd = !odd;
            i = i + 1;
        }

        System.out.println(odd);               //if you don't put system.out.print, then the human will not see true or false

        return odd;
    }

    public static void main (String[] args){
        boolean n = isOdd(6);
        boolean n1 = isOdd(7);

    }

}
