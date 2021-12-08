import java.util.ArrayList;

abstract class Texts{
  protected ArrayList<String> texto;

public void printarTexto(){
  System.out.println(texto);
}

public ArrayList<String> getTexto(){

  this.texto = new ArrayList<String>();
  this.texto.add("\t\t\t\t\tOlá aventureiro! \n\nBem vindo ao mundo de Azeroth, território de vastas terras prosperas e aventuras épicas para aqueles que buscam pela gloria. \n\nVocê é um jovem e promissor aventureiro que está prestes a sair de casa atras da adrenalina e emoção em aventuras alucinantes pelo mundo. \n\nAntes de sair definitivamente, você decide");
 
  this.texto.add("voce esta disposto a entrar nesse mundo des aventuras");
  this.texto.add("escolha sua arma");

  return texto;
}

}