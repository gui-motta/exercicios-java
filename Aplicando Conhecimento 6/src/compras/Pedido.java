package compras;

public class Pedido {
    int numero;
    Produto item;
    int quantidade;
    double valor = 0.0;
    
    Pedido(int numero, Produto produto, int quantidade){
        this.numero = numero;
        this.item = item;
        this.quantidade = quantidade;
    }
    
    void calculaPedido(){
        valor = item.preco*quantidade;
    }
    
    public String toString(){
        
       String obj;
       
       obj = "Número do pedido: " + numero + "\n";
       obj += "Código do produto: " + item.cod + "\n";
       obj += "Descrição: " + item.descricao + "\n";
       obj += "Preço do produto: " + item.preco + "\n";
       obj += "Quantidade: " + quantidade + "\n";
       obj += "Valor total do pedido: " + valor + "\n";
       
       return obj;
    }
    
    
    
    
    
    
}
