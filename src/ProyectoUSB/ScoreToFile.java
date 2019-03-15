/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoUSB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Laura M
 */
public class ScoreToFile {
    
    private String ruta;

    public ScoreToFile(String ruta) {
        this.ruta=ruta;
    }
    
    public void guardar() throws IOException{
        File archivo =  new File(this.ruta);
        if(!archivo.exists()){
            archivo.createNewFile();
        }
        PrintStream output=new PrintStream(archivo);
        output.print(Singleton.getSingleton().getScore());
        
        output.close();
        output.flush();
    }
    
    public int getLastSaved() throws FileNotFoundException, IOException{
        File archivo =  new File(this.ruta);
        if(!archivo.exists()){
            archivo.createNewFile();
        }
        Scanner scanner=new Scanner(archivo);
        
        
        int retorno=0;
        if(scanner.hasNextInt()){
        retorno=scanner.nextInt();
        }
        return retorno;
    }
    
}
