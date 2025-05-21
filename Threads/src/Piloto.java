
import java.util.logging.Level;
import java.util.logging.Logger;

public class Piloto extends Thread{
   String nome;

    @Override
    public void run() {
        
        
        System.out.println(Thread.currentThread().getState());
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Piloto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println(this.nome);
            
        
        }
    
    }
    
    
    
    public Piloto(String n){
        this.nome = n;
    }
    
}
