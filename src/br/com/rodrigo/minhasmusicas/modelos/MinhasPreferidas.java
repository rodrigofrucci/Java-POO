package br.com.rodrigo.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9 ) {
            System.out.println(audio.getTitulo() + " é considerado um extremo sucesso!" );
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que está nos ouvidos do povo!");
        }

    }


}
