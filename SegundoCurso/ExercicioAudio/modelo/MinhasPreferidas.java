package SegundoCurso.ExercicioAudio.modelo;

public class MinhasPreferidas {
    
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado um sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo() + " - Excelente opção para ver depois!");
        }
    }
}
