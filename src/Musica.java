public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacao;
    int numAvaliacao;


    void exibirFichaTecnica() {
        System.out.println("Este e o titulo da musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);


    }

    void avalia(double nota) {
        somaDasAvaliacao += nota;
        numAvaliacao++;
    }

    double pegamedia() {
        return somaDasAvaliacao / numAvaliacao;
    }
}
