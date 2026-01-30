import java.util.Scanner;
public class Area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        Double area = rad * rad * 3.14;
        System.out.println(area);


    }
}
