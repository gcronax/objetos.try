//PRUEBA DE FORK



import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Coche c1,c2,c3,c4;
        c1 =new Coche(100,"red");
        System.out.println("se acelero a "+100+" color: "+"red");
        System.out.print("dame cuanto tiempo va a estar conduciendo el ");
        Coche.muestraCoche();
        int reco=scan.nextInt();
        c1.setRecorre(reco);
        System.out.println(c1.getAceleracion()+ "km/s velocidad y distancia km"+c1.getDistancia());
        System.out.println("se decelera 20 km/h y se conduce durante una hora");
        c1.setAceleracion(-20);
        c1.setRecorre(1);
        System.out.println(c1.getAceleracion()+ "km/s velocidad y distancia km"+c1.getDistancia());
    }
}
