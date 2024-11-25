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


}
