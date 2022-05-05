public class ProdutoPerecivel extends Produto{
    int validade;
    
    ProdutoPerecivel(String nome, int quantidade, double preco, int validade){
        super(nome, quantidade, preco);
        this.validade = validade;
    }
    
    public void retiraEstoque(int qtde, int validade){
        if (validade<2)
            quantidade = 0;
        else
            super.retiraEstoque(qtde);
    }
    
    public void entraEstoque(int qtde){
      if(quantidade == 0)
          super.entraEstoque(qtde);
    }    
    
    public String toString(){
        return super.toString() + "\nValidade: " + validade + " Mês(es)";
    }
}
