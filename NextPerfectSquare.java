/**
 * Given a number, find if it's perfect square, if not perfect return -1
 * if perfect find the next perfect square
 *
 * eg. 16 -> 25, 23 -> -1
 *
 */

package prakriti;
public class NextPerfectSquare {

    public static void main(String[] args) {

        System.out.println(get(36));

    }
    public static int get(int num) {

        for(int i=1;i<num/2;i++){
            if(i==num/i){
                return (i+1)*(i+1);
            }
        }
        return -1;
    }
}

