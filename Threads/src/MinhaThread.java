
import java.util.logging.Level;
import java.util.logging.Logger;



public class MinhaThread extends Thread{
    String nome;

    @Override
    public void run() {
        
        
        System.out.println(Thread.currentThread().getState());
        for (int i = 0; i < 30; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println(this.nome);
            
        
        }
    
    }
    
    
    
    public MinhaThread(String n){
        this.nome = n;
    }
    
}
