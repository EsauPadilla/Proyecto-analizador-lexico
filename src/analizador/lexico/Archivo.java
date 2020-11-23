
package analizador.lexico;

import java.io.BufferedReader;
import java.io.FileReader;

public class Archivo {
        
    public String leerTxt(String direccion){ //direccion del archivo
        String texto = ""; 
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            texto = temp;  
            bf.close();
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return texto;
    }
    
    
}
