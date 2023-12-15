package model;

import java.time.LocalDate;

public class Movimentacao_Estoque {
    private int id;
    private int fk_id_fornecedor_produto;
    private LocalDate data;
    private double quantidade;
    private String tipo_movimentacao;
    private double custo;
    private int lote;
    private LocalDate validade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_id_fornecedor_produto() {
        return fk_id_fornecedor_produto;
    }

    public void setFk_id_fornecedor_produto(int fk_id_fornecedor_produto) {
        this.fk_id_fornecedor_produto = fk_id_fornecedor_produto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo_movimentacao() {
        return tipo_movimentacao;
    }

    public void setTipo_movimentacao(String tipo_movimentacao) {
        this.tipo_movimentacao = tipo_movimentacao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Movimentacao_Estoque{" +
                "id=" + id +
                ", fk_id_fornecedor_produto=" + fk_id_fornecedor_produto +
                ", data=" + data +
                ", quantidade=" + quantidade +
                ", tipo_movimentacao='" + tipo_movimentacao + '\'' +
                ", custo=" + custo +
                ", lote=" + lote +
                ", validade=" + validade +
                '}';
    }
}
