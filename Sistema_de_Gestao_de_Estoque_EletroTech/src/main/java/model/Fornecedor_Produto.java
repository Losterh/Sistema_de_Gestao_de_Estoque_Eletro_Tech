package model;

public class Fornecedor_Produto {
    private int id;
    private int fk_id_produto;
    private int fk_id_fornecedor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFk_id_produto() {
        return fk_id_produto;
    }

    public void setFk_id_produto(int fk_id_produto) {
        this.fk_id_produto = fk_id_produto;
    }

    public int getFk_id_fornecedor() {
        return fk_id_fornecedor;
    }

    public void setFk_id_fornecedor(int fk_id_fornecedor) {
        this.fk_id_fornecedor = fk_id_fornecedor;
    }


}
