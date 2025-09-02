public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica ();

        minhaMusica.titulo = "I dknow";
        minhaMusica.artista = "dont care";
        minhaMusica.anoLancamento = 1992;

        minhaMusica.exibirFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.5);
        minhaMusica.avalia(2.7);

        double mediaAvaliacoes = minhaMusica.pegamedia();
        System.out.println("Media das avaliacoes: "+mediaAvaliacoes);
    }
}
