package POO;

/**
 *
 * @author Ezequiel Henrique
 */
public class Main {

    public static void main(String[] args) {
        Escrivaninha escriva = new Escrivaninha();
        escriva.setCor("Preta");
        escriva.setMaterial("Madeira");
        escriva.setNumGavetas(2);
        escriva.setAltura(1);
        escriva.setLargura(1);
        
        escriva.impE();
        
        System.out.println("-----------------------------------");
        
        PC comp = new PC();
        comp.setCpu("Intel Core 2 Duo");
        comp.setPlacamae("XM-23985");
        comp.setPlacadevideo("GE Force 860");
        comp.setGbRam(8);
        comp.setFonte(1000);
        
        comp.impC();
    }

}
