import java.util.ArrayList;
public class Estudante {
    private int id;
    private int idade;
    private String nome;
    private String github;
    private String linkedin;
    private ArrayList<Curso> curso;
    private ArrayList<Projeto> projetos;
    private ArrayList<String> competencias;
    private ArrayList<Certificados> certificado;

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
