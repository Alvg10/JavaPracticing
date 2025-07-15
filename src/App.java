

public class App {
    
    public static void main(String[] args) throws Exception {
       
        Animal ani = new Animal () {

            @Override
            void hacerSonido() {
                System.out.println("El animal hace un sonido");
            }
        };

        ani.hacerSonido();


    }

}