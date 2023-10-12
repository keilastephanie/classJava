package reprodutor;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical{
    
        boolean tocando = false ;
        int volume = 25;
        List<String> listaDeMusicas = new ArrayList<>();
    public ReprodutorMusical(){
        // lista de musicas
        listaDeMusicas.add("Música 21");
        listaDeMusicas.add("Música 2");
        listaDeMusicas.add("Música 3");
    }
  public void aumentarVolume(int novoVolume){
        volume = novoVolume;
  }
  public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para :"+ volume);

 }
 public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para:" + volume);
  }
  public void tocar(){
        tocando=true;
        System.out.println("Reproduzindo a música ");

  }
  public void pausar(){
    tocando = false;
    System.out.println("Pausando a música");
  }
  public void selecionarMusica(String nomeMusica){
    System.out.println("Selecione a música desejada:"+ nomeMusica);
  }
  public static void main(String[]arg){
ReprodutorMusical reprodutor = new ReprodutorMusical();


// testando os métodos do reprodutor musical 
reprodutor.tocar();
reprodutor.aumentarVolume();
reprodutor.diminuirVolume();
reprodutor.pausar();

// testaando a seleção de música
reprodutor.selecionarMusica("Música 3");
//reprodutor.selecionarMusica("Música 2");
}
}
