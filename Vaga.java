public class Vaga {
    private int id;
    private Empresa empresa;
    private String tipo;
    private double salario;
    private String descricao;

    //TODO: implementar um sistema de ID automático a cada adição de objeto;

    public Vaga(Empresa empresa, String tipo, double salario, String descricao)
    {
        this.descricao = descricao;
        this.tipo = tipo;
        this.salario = salario;
        this.empresa = empresa;
    }
    void exibirVaga()
    {
        System.out.println("Empresa: " + empresa +
                            "\nTipo: " + tipo +
                            "\nDescrição: " + descricao +
                            "\nSalário: " + salario);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
