public class cadenas2 {
    public static void main(String[] args) {
        String frase = "Hoy es un estupendo día para aprender Java";
        String frase_resumen= frase.substring(10,20)
        + frase.substring(21,40);

        System.out.println(frase_resumen);
    }
}