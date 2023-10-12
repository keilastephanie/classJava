package telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Telefone {
        boolean ligando = false;
        int telefone = 123;
        boolean correioDeVoz = false;
        List<String> mensagensDecorreioDeVoz = new ArrayList<>();
      
  
    public void discar( int numero){
         telefone = numero;
  }
  public void ligarParaAlguem(){
        if(correioDeVoz){
            System.out.println("Chamanda encaminha  para o correio de voz");
            gravaMensaagemCorreioDeVoz(" Mensagem do correio de voz");
            
        }else{
             int tentativasRealizadas =1;
             boolean continuarTentando = true;
             boolean atendeu =false;
            do{
                atendeu = atender();
                continuarTentando =!atendeu;
             if(continuarTentando)
                tentativasRealizadas++;
             else
              System.out.println("CONTATO RELALIZADO" );
            } while(continuarTentando && tentativasRealizadas <3);
        }
    
    }

    public void ativarCorreioDeVoz(){
        correioDeVoz = true;
        System.out.println("correio ativado");
    }

    public void desativarCorreioDeVoz(){
        correioDeVoz =false;
        System.out.println("correio desativado");
    }
    
  private void gravaMensaagemCorreioDeVoz(String mensagem) {
    if(correioDeVoz){
            mensagensDecorreioDeVoz.add( mensagem);
            System.out.println("Mensagem para correio de voz gravada ");

    }else{
        System.out.println("correio de voz não esra ativado");
    }


}
static boolean atender() {
    return new Random().nextInt(3)==1;
}

public static void main(String[] args) {
    Telefone  telefone =new Telefone();
        // testando as funciionalidade do telefone
       telefone.discar(123);
       telefone.ligarParaAlguem();
       telefone.ativarCorreioDeVoz();
       telefone.ligarParaAlguem();
       telefone.gravaMensaagemCorreioDeVoz("esta é uma mensagem do correio de voz");
       telefone.desativarCorreioDeVoz();
       telefone.ligarParaAlguem();
}



    
}
