package cap_01_funciones_objetos;

public class SetYget {
    public static void main(String[] args) {
        tiempo objeto = new tiempo(4,5,6);
        System.out.printf("%s",objeto.dameHora());
    }
}


class tiempo {

    int hora, minuto, segundo;

    public tiempo(int h, int m, int s) {
        setTiempo(h, m, s);
    }

    public void setTiempo(int h, int m, int s) {
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }

    public void setHora(int h) {
        hora = h;
    }

    public void setMinuto(int m) {
        minuto = m;
    }

    public void setSegundo(int s) {
        segundo = s;
    }
    
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String dameHora() {
        return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
    }

}
