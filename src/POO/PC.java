package POO;

/**
 *
 * @author Ezequiel Henrique
 */
public class PC {
    String cpu, placamae, placadevideo; 
    int gbRam, fonte;
    
    void impC(){
        System.out.println("Cpu: "+cpu);
        System.out.println("Placa-mãe: "+placamae);
        System.out.println("Placa de vídeo: "+placadevideo);
        System.out.println("Gb's de Ram: "+gbRam);
        System.out.println("Watts da fonte: "+fonte);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getPlacamae() {
        return placamae;
    }

    public void setPlacamae(String placamae) {
        this.placamae = placamae;
    }

    public String getPlacadevideo() {
        return placadevideo;
    }

    public void setPlacadevideo(String placadevideo) {
        this.placadevideo = placadevideo;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        this.gbRam = gbRam;
    }

    public int getFonte() {
        return fonte;
    }

    public void setFonte(int fonte) {
        this.fonte = fonte;
    }
}
