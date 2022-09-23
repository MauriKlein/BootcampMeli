package java2Pratica2.exercicio02.entity;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if(this.diasParaVencer<4){
            return super.calcular(quantidadeDeProdutos)/(5-diasParaVencer);
        }
        return super.calcular(quantidadeDeProdutos);
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }
}
