package arquivopropriedades;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ArquivoPropriedades {

    public static void main(String[] args) {
        
        
        Properties propL = new Properties();
        Properties propE = new Properties();
        
        
        try {
            
            OutputStream outp = 
              new FileOutputStream("configs.prop");          
                    
            propE.setProperty("sgbd", "mysql");
            propE.setProperty("usuario", "root");
            propE.setProperty("senha", "root");
            
            propE.store(outp, null);
            
            outp.close();
            
            InputStream inpt = 
              new FileInputStream("configs.prop");

            propL.load(inpt);
            
            System.out.println("sgbd> "
                    +propL.getProperty("sgbd"));
            
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
