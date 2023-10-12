package navegador;

import java.util.ArrayList;
import java.util.List;

public class Internet {
    boolean navegacao = false;
    int numeroAbas = 1;
    List<String> abrirAbas = new ArrayList<>();
   public void abrirUmaNovaAba(String url){
        abrirAbas.add(url);
        System.out.println("Nova aba adicionada" + url);
        numeroAbas++;
   }
   public void exibirPagina(String string){
        if(navegacao){
            System.out.println("Encaminhado página para ser Exibida");
        }else{
            for(String url : abrirAbas){
                System.out.println("Exibindo página:"+url);

            }
        }
    
    }
    public void atualizarPagina(String url){
        if(navegacao){
            System.out.println("Atualizando a página para :" + url);
        }else{
            System.out.println("Não foi possivel atualizar a página");

        } 
    }
    public void iniciarNavegacao(){
        navegacao = true;
        System.out.println("Inciando navegção");
    }
    public void encerrandoNavegacao(){
        navegacao = false;
        System.out.println("Encerrando navegação");
        
    }
    public static void main(String[] args) {
        Internet navegador  = new Internet();
        // abrindo abas 
        navegador.abrirUmaNovaAba("https://www.google.com");
        navegador.abrirUmaNovaAba("https://www.openai.com");

        // exibir paginas abertas 
        navegador.exibirPagina("https://www.openai.com");

        // atualizar
        navegador.atualizarPagina("pagina atualizada com sucessso");
        // encerrar
        navegador.encerrandoNavegacao();
    }
    }
   
  




