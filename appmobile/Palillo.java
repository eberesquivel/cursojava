public class Palillo {
    public static void main(String[] args) {
         String wort = "ana";
         char[] warray = wort.toCharArray(); 
         System.out.println(istPalindrom(warray));       
    }

    public static boolean istPalindrom(char[] wort){
        if(wort.length%2 == 0){
            for(int i = 0; i < wort.length/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }
            }
        }else{
            for(int i = 0; i < (wort.length-1)/2-1; i++){
                if(wort[i] != wort[wort.length-i-1]){
                    return false;
                }
            }
        }
        return true;
    }
}