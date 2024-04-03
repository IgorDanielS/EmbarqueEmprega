public class Recrutador {
    private int id;
    private String nome;
    private int idade;
    private Empresa empresa;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getnome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public Empresa getEmpresa(){
        return empresa;
    }
    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }
}
