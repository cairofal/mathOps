
package ConversorMonetario;

/*
Protótipo de classe Java para implementação de conversor monetário. 
@author Cairo Faleiros de Figueiredo RA580171
Date: out/2015
 */

public class ConversorMonetario {
  
    protected double taxaCompra, taxaVenda, quantia;//atributo da classe referente as taxas de compra e venda

    public ConversorMonetario  (double pTaxaCompra, double pTaxaVenda){ //construtor e inicializador dos atributos
        this.taxaCompra =  pTaxaCompra;
        this.taxaVenda =  pTaxaVenda;
    }

    //declaracao dos metodos da classe
    public void imprimeTaxas(){
      System.out.println("Taxa Compra: " + this.taxaCompra);
      System.out.println("Taxa Venda: " + this.taxaVenda);
      System.out.println("");
    }

    public double vendeDolar(double pQuantia){
        return (pQuantia*this.taxaVenda);
    }

    public double compraDolar(double pQuantia){
        return (pQuantia/this.taxaCompra);
    }

}
