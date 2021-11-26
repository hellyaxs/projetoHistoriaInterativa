import java.util.ArrayList;

public class dateChapters {

   
     public ArrayList<Chapters> getdateChapters() {
        ArrayList<Chapters> chapters = new ArrayList<Chapters>();

        ArrayList<Option> escolhas = new ArrayList<Option>();
        escolhas.add(new Option("escolha 1", 12, true, "oi"));
        escolhas.add(new Option("escolha 2", 12, true, "fala"));
        chapters.add(new Chapters("voce testou antes??", escolhas));
        
        //capitulo 2
        ArrayList<Option> escolha = new ArrayList<Option>();
        escolha.add(new Option("deseja voltar pra casa", 12, true, "sim"));
        escolha.add(new Option("voce esta progredindo", 12, true, "obrigado"));

        chapters.add(new Chapters("voce mudou??", escolha));
       
       return chapters;
    }
          
     

}
