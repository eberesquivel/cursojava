import javax.swing.JOptionPane;

public class valida_Mail {
    public static void main(String[] args) {
        
        //El código comentado evalua si existe una '@' dentro de la cadena introducida arrojando en consola un correcto en caso de ser verdadero
        /*boolean arroba = false;
        String mail= JOptionPane.showInputDialog("Intruduce mail");

        for (int i=0; i<mail.length();i++){
            if(mail.charAt(i)=='@'){
                arroba= true;
            }
        }
        if(arroba==true){
            System.out.println("Es correcto");
        }else {
            System.out.println("no es correcto");
        }*/
        int arroba= 0;
        boolean punto = false;
        String mail= JOptionPane.showInputDialog("Intruduce mail");

        for (int i=0; i<mail.length();i++){
            if(mail.charAt(i)=='@'){
                arroba++;
            }
            if(mail.charAt(i)=='.'){
                punto=true;
            }
        }
        if(arroba==1 && punto==true){
            System.out.println("Es correcto");
        }else {
            System.out.println("no es correcto");
        }

    }
}