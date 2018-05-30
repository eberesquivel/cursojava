public class array_bidimensional {
    public static void main(String[] args) {
        int [][] matrix = new int[4][5];

        matrix[0][0]=3;
        matrix[0][1]=12;
        matrix[0][2]=43;
        matrix[0][3]=6;
        matrix[0][4]=7;

        matrix[1][0]=33;
        matrix[1][1]=132;
        matrix[1][2]=463;
        matrix[1][3]=62;
        matrix[1][4]=79;

        matrix[2][0]=33;
        matrix[2][1]=124;
        matrix[2][2]=41;
        matrix[2][3]=75;
        matrix[2][4]=73;

        matrix[3][0]=38;
        matrix[3][1]=123;
        matrix[3][2]=423;
        matrix[3][3]=64;
        matrix[3][4]=71;
       for (int i=0; i<4;i++){
           System.out.println();
           for(int j=0; j<5; j++){
               System.out.println(matrix[i] [j]);
           }
       }
    }
    
} 