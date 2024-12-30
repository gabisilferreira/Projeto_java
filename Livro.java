
public class Livro{
    String nome;
    String autor;
    double preco;
    int qtdEstoque;

    public Livro (String nome, String autor, double preco, int qtdEstoque){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco>=0){
            this.preco= preco;
        } else{
            System.out.println("Preço inválido");
        }
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque>=0){
             this.qtdEstoque = qtdEstoque;
        }else{
            System.out.println("Quantidade inválida");
        }

       
    }

    public void exibirDetalhes(){
        System.out.println("O livro "+ nome+ ", do autor "+ autor+". Custa R$"+ preco+ " e  possui " + qtdEstoque+ " livros em estoque.");
    }



    
}