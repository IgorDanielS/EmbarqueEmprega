import java.util.Scanner;
import java.util.ArrayList;
public class ListaTransmissao {
         int id;
    private String nome;
    private ArrayList<Evento> eventos;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String geNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public ListaTransmissao()
    {
        nome = "ListaTransmissao";
        id = 001;
        eventos = new ArrayList<>();
    }

    public void editarEvento(Evento evento)
    {
        Scanner input = new Scanner(System.in);
        String opcao;
        String nome;
        String tipo;
        String data;
        String palestrante;
        String local;
        String descricao;
        System.out.println("Deseja mudar o nome, tipo, data, palestrante, local ou descricao do evento? ");
        opcao = input.next();
        switch (opcao) {
            case "nome": 
                System.out.println("Alterar nome para: ");    
                nome = input.next();
                evento.setNome(nome);
                break;
            case "tipo": 
                System.out.println("Alterar tipo para");    
                tipo = input.next();
                evento.setTipo(tipo);
                break;
            case "data": 
                System.out.println("Alterar data para: ");    
                data = input.next();
                evento.setData(data);
                break;
            case "palestrante": 
                System.out.println("Alterar palestrante para: ");    
                palestrante = input.next();
                evento.setPalestrante(palestrante);
                break;
            case "local": 
                System.out.println("Alterar local para: ");    
                local = input.next();
                evento.setLocal(local);
                break;
            case "descricao": 
                System.out.println("Alterar descrição para: ");    
                descricao = input.next();
                evento.setDescricao(descricao);
                break;
        
            default:
                System.out.println("Escreva a mudança necessária em minusculo!");
                break;
        }
    }
    void adicionarEvento(Evento evento)
    {
        eventos.add(evento);
    }

    void exibirEventos()
    {
        for(int i = 0; i < eventos.size(); i++)
        {
            eventos.get(i).exibirEvento();
        }
    }
//    String nome;
//    String tipo;
//    String data;
//    String palestrante;
//    String local;
//    String descricao;
}
