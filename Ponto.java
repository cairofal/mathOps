
package distanciaPontos;

/*
 Implementação para mediar a distancia entre dois pontos aleatórios.
 @author Cairo Faleiros RA580171
 Date: out/2015
 */

public class Ponto {
    //declaracao dos atributos da classe
    protected int x, y;//atributo da classe referente a posicao dos pontos x e y

   //declaracao do construtor da classe e inicializacao dos atributos
    public Ponto(int pX, int pY){
        this.x = pX;
        this.y = pY;
    }

   //declaracao do metodo da classe
    public double distancia(Ponto d){
        return (Math.sqrt(((this.x-d.x)*(this.x-d.x)) + ((this.y-d.y)*(this.y-d.y))));
    }

}

//Exemplo de teste da classe ponto

public static void main(String[] args) {

        System.out.println("Teste da classe Ponto");
        Ponto a = new Ponto(30,55);
        Ponto b = new Ponto(6,18);
        System.out.println("A distancia D(A,B) = "+ a.distancia(b));
        System.out.println("");

}
