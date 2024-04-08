import java.util.ArrayList;

public class Empresa {
    private int id;
    private String nome;
    private String cnpj;
    private float avaliacao;
    private String descricao;
    private String area;
    private ArrayList<Vaga> vagas;

    //TODO: Incrementar um contabilizador/gerador de id's  

    public Empresa(String nome, String cnpj, float avaliacao, String descricao, String area) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        this.area = area;
        vagas = new ArrayList<>();
    }

    void criarVaga(Empresa empresa, String tipo, double salario, String descricao)
    {
        Vaga v1 = new Vaga(empresa,tipo,salario,descricao);
    }
    void colocarNoFeed(Feed feed)
    {
        for(int i = 0; i < vagas.size(); i++)
        {
            feed.adicionaVaga(vagas.get(i));
        }
    }
    void adicionarVaga(Vaga vaga)
    {
        vagas.add(vaga);
    }
    void removerVaga(Vaga vaga)
    {
        vagas.remove(vaga);
    }
    void divulgarVagas()
    {
        for(int i = 0; i < vagas.size(); i++)
        {
            vagas.get(i).exibirVaga();
        }
    }
    public int getId () {
        return id;
    }

        public void setId ( int id){
        this.id = id;
    }

        public String getNome () {
        return nome;
    }

        public void setNome (String nome){
        this.nome = nome;
    }

        public String getCnpj () {
        return cnpj;
    }

        public void setCnpj (String cnpj){
        this.cnpj = cnpj;
    }

        public float getAvaliacao () {
        return avaliacao;
    }

        public void setAvaliacao ( float avaliacao){
        this.avaliacao = avaliacao;
    }

        public String getDescricao () {
        return descricao;
    }

        public void setDescricao (String descricao){
        this.descricao = descricao;
    }

        public String getArea () {
        return area;
    }

        public void setArea (String area){
        this.area = area;
    }




}
