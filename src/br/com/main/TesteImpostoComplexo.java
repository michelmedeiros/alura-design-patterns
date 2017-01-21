package br.com.main;

import br.com.dominio.Orcamento;
import br.com.templateMethod.ICPP;
import br.com.templateMethod.IHIT;
import br.com.templateMethod.IKCV;

/**
 * Created by miche on 19/01/2017.
 */
public class TesteImpostoComplexo {
    public static void main(String[] args) {
        IKCV ikcv = new IKCV(new ICPP(new IHIT()));
        double valor = ikcv.calcula(new Orcamento(100));
        System.out.println(valor);
    }
}
