import java.util.ArrayList;

public class Feed {
    private ListaTransmissao listaTransmissao;
    private ArrayList<Vaga> empregabilidade = new ArrayList<>();

    void exibirEvento()
    {
        listaTransmissao.exibirEventos();
    }
    void adicionaVaga(Vaga vaga)
    {
        empregabilidade.add(vaga);
    }
    void exibirVagas()
    {
        for(int i = 0; i < empregabilidade.size(); i++)
        {
            empregabilidade.get(i).exibirVaga();
        }
    }


}
