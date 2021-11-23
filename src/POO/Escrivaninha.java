package POO;

/**
 *
 * @author Ezequiel Henrique
 */
public class Escrivaninha {
    String cor, material;
    int numGavetas, largura, altura;
    
    void impE(){
        System.out.println("Cor: "+cor);
        System.out.println("Material: "+material);
        System.out.println("Número de gavetas: "+numGavetas);
        System.out.println("Largura da mesa: "+largura);
        System.out.println("Altura da mesa: "+altura);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumGavetas() {
        return numGavetas;
    }

    public void setNumGavetas(int numGavetas) {
        this.numGavetas = numGavetas;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
