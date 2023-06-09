public class TShirt extends Artigo {
    public enum Tamanho {S, M, L, XL}
    public enum Padrao {liso, riscas, palmeiras}

    private Tamanho tamanho;
    private Padrao padrao;

    public TShirt() {
        super();
        this.tamanho = Tamanho.S;
        this.padrao = Padrao.liso;
    }

    public TShirt(int fiscalUtilizador, Condicao condicao, float estado, int donos, String descricao, String marca, String cod, float precoBase, float correcaoPreco, String transportadora, Tamanho tamanho, Padrao padrao) {
        super(fiscalUtilizador, condicao, estado, donos, descricao, marca, cod, precoBase, correcaoPreco, transportadora);
        this.tamanho = tamanho;
        this.padrao = padrao;
    }

    public TShirt(TShirt t) {
        super(t);
        this.tamanho = t.getTamanho();
        this.padrao = t.getPadrao();
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Padrao getPadrao() {
        return padrao;
    }

    public void setPadrao(Padrao padrao) {
        this.padrao = padrao;
    }

    public float getPrecoTotal() { return this.getPrecoBase() - this.getCorrecaoPreco(); }

    public TShirt clone() {
        return new TShirt(this);
    }

    public String toString() {
        return "TShirt;" + super.toString() + ";" + tamanho + ";" + padrao;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TShirt tShirt = (TShirt) o;
        return tamanho == tShirt.tamanho && padrao == tShirt.padrao;
    }

}
