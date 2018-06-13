/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
impo java.Jrame ;

package ejemplorunnable;

/**
 *
 * @author Sascom
 */
public class Tablero {

    public int tam = 0;
    public JPanel fonde = null;
    public Personaje per;

    public int[] vecL;
    public JLavel[] vecG;
    public int tambloquex = 0;

    public Tablero(int tam, JPanel Fondo) {
        this.tam = tam;
        this.fondo = Fondo;
        llenar(tam);

    }

    public void llenar(int tam) {
        tambloquex = 800 / tam;
        vecL = new intp[tam];
        vecG = new JLabel[tam];
        //1 persona 0 vacios

        vecL[0] = 1;
        this.p
        for (int i = 1; i < tam; i++) {
            vecL[i] = 0;

        }
        repintar();

    }

    public void repintar() {
        for (int i = 0; i < tam; i++) {
            Label tablero;
            if (vecL[i] == 0) {
                tablero = new JLabel();
                tablero.setOpaque(false);
                tablero.setBounds(i * tambloquex, 0,)
            }
        }
    }

    private static class Personaje {

        public Personaje() {
        }
    }

}
