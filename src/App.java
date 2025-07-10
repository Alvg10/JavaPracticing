import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    
    public static void main(String[] args) throws Exception {
       
    System.out.println("Hola");
    Map<String, Double> superHeroes = new HashMap<String, Double>();
    superHeroes.put("Banana", 5.40);        
    superHeroes.put("Durazno", 3.20);
    superHeroes.put("Manzana", 2.50);        
    superHeroes.put("pera", 4.30);        
    superHeroes.put("papaya", 6.80);        
    superHeroes.put("Granadilla", 7.20);        
    superHeroes.put("Piña", 8.76);        
    superHeroes.put("Zandialla", 9.40);        

    for ( String fruta : superHeroes.keySet()) {
        System.out.println("La fruta " + fruta + " cuesta " + superHeroes.get(fruta));
    }

    List<String> Automoviles = new ArrayList<String>();
    Automoviles.add("Toyota");
    Automoviles.add("Nissan");  
    Automoviles.add("Chevrolet");
    Automoviles.add("Kia");

for (String auto : Automoviles) {
    System.out.println("El auto " + auto + " prueba exitosa");
}

Caja<String> cajaDeTexto = new Caja<>("Hola mundo");
System.out.println("Caja contiene: " + cajaDeTexto.getContenido());

Caja<Integer> cajaDeNumero = new Caja<>(123);
System.out.println("Caja contiene: " + cajaDeNumero.getContenido());
     
Caja<String> cajaDeTexto1 = new Caja<>("hola");
cajaDeTexto1.setContenido("hola2");
System.out.println("Caja contiene: " + cajaDeTexto1.getContenido());

}}