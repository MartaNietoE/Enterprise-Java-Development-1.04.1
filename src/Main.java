import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int x=2;
        int y=7;
        System.out.println(resolverEcuacion(x,y));
        System.out.println(resolverEcuacion(3,9));
    }
    public static double resolverEcuacion(double x, double y){
        return Math.pow(x,2) + Math.pow(4*y/5-x, 2);

    }
}
