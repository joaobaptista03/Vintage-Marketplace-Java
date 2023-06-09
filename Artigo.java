import java.util.Objects;

public abstract class Artigo {
    public enum Condicao {novo, usado}

    private int codUtilizador;
    private Condicao condicao;
    private float estado;
    private int donos;
    private String descricao;
    private String marca;
    private String cod;
    private float precoBase;
    private float correcaoPreco;
    private String transportadora;

    public Artigo() {
        this.codUtilizador = 0;
        this.condicao = Condicao.novo;
        this.estado = 0;
        this.donos = 0;
        this.descricao = "";
        this.marca = "";
        this.cod = "";
        this.precoBase = 0;
        this.correcaoPreco = 0;
        this.transportadora = "";
    }

    public Artigo(Integer codUtilizador, Condicao condicao, float estado, int donos, String descricao, String marca, String cod, float precoBase, float correcaoPreco, String transportadora) {
        this.codUtilizador = codUtilizador;
        this.condicao = condicao;
        this.estado = estado;
        this.donos = donos;
        this.descricao = descricao;
        this.marca = marca;
        this.cod = cod;
        this.precoBase = precoBase;
        this.correcaoPreco = correcaoPreco;
        this.transportadora = transportadora;
    }

    public Artigo(Artigo a) {
        this.codUtilizador = a.getCodUtilizador();
        this.condicao = a.getCondicao();
        this.estado = a.getEstado();
        this.donos = a.getDonos();
        this.descricao = a.getDescricao();
        this.marca = a.getMarca();
        this.cod = a.getCod();
        this.precoBase = a.getPrecoBase();
        this.correcaoPreco = a.getCorrecaoPreco();
        this.transportadora = a.getTransportadora();
    }

    public int getCodUtilizador() {
        return codUtilizador;
    }

    public void setCodUtilizador(int codUtilizador) {
        this.codUtilizador = codUtilizador;
    }

    public float getEstado() {
        return estado;
    }

    public void setEstado(float estado) {
        this.estado = estado;
    }

    public int getDonos() {
        return donos;
    }

    public void setDonos(int donos) {
        this.donos = donos;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public float getCorrecaoPreco() {
        return correcaoPreco;
    }

    public void setCorrecaoPreco(float correcaoPreco) {
        this.correcaoPreco = correcaoPreco;
    }

    public String getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(String transportadora) {
        this.transportadora = transportadora;
    }

    public abstract float getPrecoTotal();

    public abstract Artigo clone();

    public String toString() {
        return codUtilizador + ";" + condicao + ";" + estado + ";" + donos + ";" + descricao + ";" + marca + ";" + cod + ";" + precoBase + ";" + correcaoPreco + ";" + transportadora;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artigo artigo = (Artigo) o;
        return codUtilizador == artigo.codUtilizador && donos == artigo.donos && Float.compare(artigo.precoBase, precoBase) == 0 && Float.compare(artigo.correcaoPreco, correcaoPreco) == 0 && condicao == artigo.condicao && Objects.equals(estado, artigo.estado) && Objects.equals(descricao, artigo.descricao) && Objects.equals(marca, artigo.marca) && Objects.equals(cod, artigo.cod) && Objects.equals(transportadora, artigo.transportadora);
    }

}
