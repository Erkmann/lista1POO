public class Pessoa {

    private String nome;
    private int idade;
    private float peso, altura;

    public Pessoa(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(){
        this.idade += 1;
        if (this.idade < 21){
            this.altura += (float)0.05;
        }
    }

    public void engordar(float peso_a_mais){
        this.peso += peso_a_mais;
    }

    public void emagrecer(float peso_a_menos){
        this.peso -= peso_a_menos;
    }

    public void crescer(float altura_a_mais){
        this.altura += altura_a_mais;
    }

}
