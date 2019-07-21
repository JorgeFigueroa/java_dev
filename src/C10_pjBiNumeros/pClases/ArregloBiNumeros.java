package C10_pjBiNumeros.pClases;
public class ArregloBiNumeros {
    private int f,c;
    private int n[][];

    //1
    public ArregloBiNumeros(int f, int c){
        this.f=f;
        this.c=c;
        n=new int[f][c];
        generar();
    }

    //2
    public int getFilas(){
        return f;
    }
    public int getColumnas(){
        return c;
    }

    //3
    public int obtener(int posF, int posC){
        return n[posF][posC];
    }

    //4
    private void generar(){
        for(int i=0;i<f;i++)
            for(int j=0;j<c;j++)
                n[i][j]=(int)((99-10+1)*Math.random()+10);
    }

    //5
    public int sumaFila(int f){
        int s=0;
        int i=f-1;
            for(int j=0;j<c;j++)
                s+=n[i][j];
        return s;
    }

    //6
    public int sumaColumna(int c){
        int s=0;
        int j=c-1;
            for(int i=0;i<f;i++)
                s+=n[i][j];
        return s;
    }
}
