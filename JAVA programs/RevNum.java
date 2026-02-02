import java.util.*;
public class RevNum {
    public static void main(String[] args) {
        int n = 171206;
        for( int i = 1 ; i <=6 ;i++){
            int ld = n % 10;
            System.out.print(ld + " ");
            n/=10;
        }
    }
}
