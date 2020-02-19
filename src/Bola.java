public class Bola {
    private String cor, material;
    private float circunferencia;

    public Bola(String cor, String material, float circunferencia) {
        this.cor = cor;
        this.material = material;
        this.circunferencia = circunferencia;
    }

    public void troca_cor(String nova_cor){
        this.cor = nova_cor;
    }

    public void mostra_cor(){
        System.out.println(this.cor);
    }

}
