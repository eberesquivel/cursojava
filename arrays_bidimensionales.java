public class arrays_bidimensionales {
    public static void main(String[] args) {
        int [][] matrix ={{15,16,18,21,34},
                          {12,32,41,23,43},
                          {14,34,54,31,1},
                        {9,23,76,6,3}};
      // se utiliza for each para imprimir los valores de la matriz bidimensional
        for(int[]fila:matrix){
            System.out.println();
            for(int z: fila){
                System.out.println(z+" ");
            }
        }
    }
}