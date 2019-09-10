public class ControleRemoto {
    private Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public Televisao getTv() {
        return tv;
    }

    public void setTv(Televisao tv) {
        this.tv = tv;
    }

    public void aumentaVolume() {
        tv.aumentaVolume();
    }

    public void diminuiVolume() {
        tv.diminuiVolume();
    }

    public void aumentaCanal() {
        tv.aumentaCanal();
    }

    public void diminuiCanal() {
        tv.diminuiCanal();
    }

    public void ligaTv() {
        tv.liga();
    }
    public void setCanal(int canal)
    {
        tv.setCanal(canal);
    }
    public void getCanal()
    {
        tv.getCanal();
    }

    public void desligaTv() {
        tv.desliga();
    }
}
