public class Quadrado {

    private float tamanho_lado;

    public Quadrado(float tamanho_lado) {
        this.tamanho_lado = tamanho_lado;
    }

    public void mudar_lado(float novo_lado){
        this.tamanho_lado = novo_lado;
    }

    public float retornar_lado(){
        return this.tamanho_lado;
    }

    public float calcular_area(){
        return (float) Math.pow(this.tamanho_lado, 2);
    }

}
