
package teste;

import br.com.GoodRestHotel.model.Produto;


public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setQtd(10);
        p.setId(1);
        p.setPreco(3.0);
        p.setNome("oie");
        
        System.out.println(p.toString());
        
        p.comprarProduto(9);
        
        System.out.println(p.getQtd());
        
    }
}
