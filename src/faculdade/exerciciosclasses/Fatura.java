package faculdade.exerciciosclasses;

public class Fatura {
    private int id_item;
    private String descricao_item;
    private int quant_item;
    private double valor_item;

    public Fatura(int id_item, String descricao_item, int quant_item, double valor_item) {
        this.id_item = id_item;
        this.descricao_item = descricao_item;
        this.quant_item = quant_item;
        this.valor_item = valor_item;
    }

    public void imprime(){
        System.out.println("Id: "+ this.id_item);
        System.out.println("Descricao: "+ this.descricao_item);
        System.out.println("Quantidade: "+ this.quant_item);
        System.out.printf("Valor: R$%.2f", this.valor_item);
    }
    public int verificarQuan(int quant_item){
        if(quant_item<0){
            quant_item=0;
        }
        return(quant_item);
    }
    public double verificarValor(double valor_item){
        if(valor_item<0){
            valor_item=0;
        }
        return(valor_item);
    }
    public double calcularValor(int quant_item, double valor_item){
        quant_item= verificarQuan(quant_item);
        valor_item= verificarValor(valor_item);
        return(quant_item*valor_item);
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public String getDescricao_item() {
        return descricao_item;
    }

    public void setDescricao_item(String descricao_item) {
        this.descricao_item = descricao_item;
    }

    public int getQuant_item() {
        return quant_item;
    }

    public void setQuant_item(int quant_item) {
        this.quant_item = quant_item;
    }

    public double getValor_item() {
        return valor_item;
    }

    public void setValor_item(double valor_item) {
        this.valor_item = valor_item;
    }
}

