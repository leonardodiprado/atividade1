package Atividade;

public class Carro extends Veiculo {
    private int numeroPortas;
    private boolean tipoTransmissao;
    private double quilometragem;

    public Carro() {
        System.out.println("Construtor vazio de Carro ativado.");
    }

    public Carro(String marca, String modelo, int ano, String cor, int numeroPortas, boolean tipoTransmissao, double quilometragem) {
        super(marca, modelo, ano, cor);
        this.numeroPortas = numeroPortas;
        this.tipoTransmissao = tipoTransmissao;
        this.quilometragem = quilometragem;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(boolean tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("Transmissão: " + (tipoTransmissao ? "Automática" : "Manual"));
        System.out.println("Quilometragem: " + quilometragem + " km");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void estacionar() {
        System.out.println("O carro está estacioando.");
    }

}