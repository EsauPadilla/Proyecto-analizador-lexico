
package analizador.lexico;

public class AnalizadorLexico {

    public static void main(String[] args) {
        Archivo a = new Archivo();
        String s1 = a.leerTxt("C:\\Users\\padil\\Documents\\NetBeansProjects\\Analizador Lexico\\ArchivoTxt\\CodigoFuente.txt");
        
        System.out.println(s1);
    }
    
}
