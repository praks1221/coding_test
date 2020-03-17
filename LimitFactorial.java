/**
 * Given a positive integer "num" and number "limit"
 * find factorial for the total given "limit"
 * eg. num = 7, limit = 2 => 42 (7*6)
 *  num = 11, limit = 3 => 990 (11*10*9)
 *  num = 4, limit = 1 => 4 (4)
 *  num = 9, limit = 5 => 15120 (9*8*7*6*5)
 *  num = 21, limit = 4 => 143640 (9*8*7*6*5)
 */

package prakriti;
public class LimitFactorial {
    public static void main(String[] args) {
//        System.out.println(LimitFactorial(21,4));
    }
    public static long LimitFactorial(int num, int limit) {
        long p=1;
        for(long i=num; i>num-limit; i--){
            p*=i;

        }
        return p;
    }

}
