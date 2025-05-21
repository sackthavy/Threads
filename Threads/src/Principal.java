public class Principal {
    
    public void teste(){
        
    }
    
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        
        MinhaThread piloto1 = new MinhaThread("Max Verstappen");
        MinhaThread piloto2 = new MinhaThread("Lewis Hamilton");
        MinhaThread piloto3 = new MinhaThread("Charles Leclerc");
        MinhaThread piloto4 = new MinhaThread("George Russell");
        MinhaThread piloto5 = new MinhaThread("Lando Norris");
        
        
        System.out.println(piloto1.getName());
        System.out.println(piloto1.getState());

        piloto1.start();
        piloto2.start();
        piloto3.start();
        piloto4.start();
        piloto5.start();
        
    }
    
}

