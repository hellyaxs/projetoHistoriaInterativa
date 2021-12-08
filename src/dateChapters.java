import java.util.ArrayList;

abstract class dateChapters extends Texts{
 
  protected ArrayList<Chapters> chapters;
  protected ArrayList<String> textos;

     public ArrayList<Chapters> getdateChapters() {

        this.textos = new ArrayList<String>();
        this.textos = getTexto();
        this.chapters = new ArrayList<Chapters>();
        //capitulo 1
        ArrayList<Option> escolhas = new ArrayList<Option>();
        escolhas.add(new Option("dormir", 12, "dormir"));
        escolhas.add(new Option("pegar a bicicleta e ir embora", -12,"bicicleta"));
        chapters.add(new Chapters(this.textos.get(0), escolhas));
      
        //capitulo 2
        ArrayList<Option> escolha = new ArrayList<Option>();
        escolha.add(new Option("deseja voltar pra casa", 12,"sim"));
        escolha.add(new Option("voce esta progredindo", 12,"obrigado"));
        
        chapters.add(new Chapters(this.textos.get(1), escolha));

       return chapters;
    }
}