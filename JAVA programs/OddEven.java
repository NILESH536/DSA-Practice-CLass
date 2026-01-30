import java.util.*;

class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("It's a even number");
        }
        else{
            System.out.println("It's a odd number");
        }
    }
}