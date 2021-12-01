import java.util.ArrayList;

abstract class dateChapters extends Texts{
 
  protected ArrayList<Chapters> chapters;
  protected ArrayList<String> textos;

     public ArrayList<Chapters> getdateChapters() {
 
        this.textos = new ArrayList<String>();
        this.textos = getTexto();
        this.chapters = new ArrayList<Chapters>();
        //capitulo 2
        ArrayList<Option> escolhas = new ArrayList<Option>();
        escolhas.add(new Option("bom dia, qual das escolhas voce deseja realizar?", 12, true, "oi"));
        escolhas.add(new Option("escolha 2", -12, true, "fala"));
        
        chapters.add(new Chapters(this.textos.get(0), escolhas));
        
        //capitulo 2
        ArrayList<Option> escolha = new ArrayList<Option>();
        escolha.add(new Option("deseja voltar pra casa", 12, true, "sim"));
        escolha.add(new Option("voce esta progredindo", 12, true, "obrigado"));chapters.add(new Chapters("voce mudou??", escolha));
        chapters.add(new Chapters(this.textos.get(1), escolha));
       
       return chapters;
    }
          
     

}
