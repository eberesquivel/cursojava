public class prueba {
    public static void main(String[] args) {
        prueba probador = new prueba();

        OperacionMate suma = (int a, int b) -> a+b;
        System.out.println("7+7 =  " +probador.opera(10,5,suma));
    }

    interface OperacionMate {
        int operacion(int a, int b);
     }

    private int opera(int a, int b, OperacionMate operacionm) {
        return operacionm.operacion(a, b);
     }
}

