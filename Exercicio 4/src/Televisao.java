public class Televisao {
    private int volume;
    private int canal;
    private boolean ligada;

    public Televisao() {
        volume = 0;
        canal = 0;
        ligada = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void aumentaVolume() {
        volume++;
    }

    public void diminuiVolume() {
        volume--;
    }

    public void aumentaCanal() {
        canal++;
    }

    public void diminuiCanal() {
        canal--;
    }

    public void liga() {
        ligada = true;
    }

    public void desliga() {
        ligada = false;
    }
}
