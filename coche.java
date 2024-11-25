class Coche {
    private int aceleracion;
    private  String color;
    private static int numCoche=0;
    private int distancia=0;
    private double recorre=0;
    static void nuevoCoche() {
        numCoche++;
    }
    public Coche( int a, String c) {
        this.color= c;
        this.aceleracion=a;
        nuevoCoche();
    }

    public void setRecorre(double recorre) {
        this.distancia = distancia+ (int) (recorre*aceleracion);

    }

    public int getDistancia() {
        return distancia;
    }

    public void setAceleracion(int a) {
        this.aceleracion=aceleracion+a;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    static void muestraCoche() {
        System.out.println("coche "+numCoche);
    }
    public static void main(String[] args) {
        Coche c1,c2,c3,c4;
        c1 =new Coche(100,"red");

        muestraCoche();
        c1.setRecorre(0.333);
        System.out.println(c1.getAceleracion()+ " "+c1.getDistancia());
        c1.setAceleracion(-20);
        c1.setRecorre(1);
        System.out.println(c1.getAceleracion()+ " "+c1.getDistancia());
    }
}
