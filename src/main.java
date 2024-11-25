public class main {
    public static void main(String[] args) {
        Coche c1,c2,c3,c4;
        c1 =new Coche(100,"red");

        Coche.muestraCoche();
        System.out.println("se acelera 100 km/h y se conduce durante 20 min");

        c1.setRecorre(0.333);
        System.out.println(c1.getAceleracion()+ "km/s velocidad y distancia km"+c1.getDistancia());
        System.out.println("se decelera 20 km/h y se conduce durante una hora");
        c1.setAceleracion(-20);
        c1.setRecorre(1);
        System.out.println(c1.getAceleracion()+ "km/s velocidad y distancia km"+c1.getDistancia());
    }
}
