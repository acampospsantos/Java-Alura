package TerceiroCurso.Screenmatch.modelos;

public class Serie extends Titulo {
   // Atributos - (ENCAPSULAMENTO)
   private int temporadas;
   private boolean ativa;
   private int episodiosPorTemporada;
   private int minutosPorEpisodio;

   // Método CONSTRUTOR
   public Serie(String nome, int anoDeLancamento) {
      super(nome, anoDeLancamento);
   }

   // Métodos Acessores e Modificadores
   public void setTemporadas(int temporadas) {
      this.temporadas = temporadas;
   }

   public int getTemporadas() {
      return this.temporadas;
   }

   public void setAtiva(boolean ativa) {
      this.ativa = ativa;
   }

   public boolean getAtiva() {
      return this.ativa;
   }

   public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
      this.episodiosPorTemporada = episodiosPorTemporada;
   }

   public int getEpisodiosPorTemporada() {
      return this.episodiosPorTemporada;
   }

   public void setMinutosPorEpisodio(int minutosPorEpisodio) {
      this.minutosPorEpisodio = minutosPorEpisodio;
   }

   public int getMinutosPorEpisodio() {
      return this.minutosPorEpisodio;
   }

   // Métodos da classe
   @Override
   public int getDuracao() { // Sobrescrevi método da classe mãe(Título)
      return temporadas * episodiosPorTemporada * minutosPorEpisodio;
   }

   @Override
   public String toString() {
      return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
   }
}
