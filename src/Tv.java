public class Tv {

    private int canal, volume;

    public Tv(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void mudar_canal(int novo_canal){
        if (novo_canal > 0 && novo_canal <= 180){
            this.canal = novo_canal;
        }
    }

    public void aumentar_volume(){
        int volume_mais = this.volume + 1;
        if (volume_mais >= 0 && volume_mais <= 100) {
            this.volume = volume_mais;
        }
    }

    public void diminuir_volume(){
        int volume_menos = this.volume - 1;
        if (volume_menos >= 0 && volume_menos <= 100){
            this.volume = volume_menos;
        }
    }

}
