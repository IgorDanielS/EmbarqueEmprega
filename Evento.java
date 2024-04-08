public class Evento {
    private int id;
    private String nome;
    private String tipo;
    private String data;
    private String palestrante;
    private String local;
    private String descricao;

    

    public Evento(String nome, String tipo, String data, String palestrante, String local, String descricao)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
        this.palestrante = palestrante;
        this.local = local;
        this.descricao = descricao;
    }

    void exibirEvento()
    {
        System.out.println("Nome : " +  nome +
                "  (" + tipo + ")" +
                "\nData: " + data +
                "\nPalestrante: " + palestrante +
                "\nLocal: " + local +
                "\nDescrição: " + descricao
                );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
