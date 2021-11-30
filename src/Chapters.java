import java.util.Scanner;
import java.util.ArrayList;
//aqui e classe responsavel por cada capitulo!!
public class Chapters {

  private String text;
  private ArrayList<Option> options;
  private Scanner scanner;
  private Energy alteracaoEnegia;

  public Chapters(String text, ArrayList<Option> options) {
      this.options = new ArrayList<Option>();
      this.text = text;
      scanner = new Scanner(System.in);
      alteracaoEnegia = new Energy();

      for (Option preencher : options)
      {
        this.options.add(preencher);
      }
  } 
   
   /*public Chapters(String texto){
   ArrayList<Option> optionsVazio = new ArrayList<Option>();
    this.options = new ArrayList<Option>();
      this.text = text;
      scanner = new Scanner(System.in);
      alteracaoEnegia = new Energy();

      for (Option preencher : optionsVazio)
      {
        this.options.add(preencher);
      }
   }
   */

  public void printAsk() {
    System.out.println(this.text);

  }

  // este metodo e responval pelas escolhas do jogador
  public Energy escolher() {

    int life;
    int energy;
    String escolher;
    boolean loop = true;
    
    System.out.println(this.text);

    while (loop)//enquato ele nao escrever a palavra correta loop
    {
       // printa as opcoes na tela
          for (Option path : this.options)
            {
              System.out.println("["+path.getKeyWord()+"] "+path.getText());
            }
          
            escolher = scanner.nextLine();

          for (Option options : this.options)
            {
                if (escolher.equals(options.getKeyWord()))
                { //verifica de o valor digitado e igual ao solicitado
                  alteracaoEnegia.setLife(options.getAbilityDamage());
                   alteracaoEnegia.setEnergy(options.getEnergyDamage());
                  loop = false;
                }
            }

          if (loop)
            {
              System.out.println("escolha uma opção valida!!!");
              this.printAsk();
            }
    }

    return alteracaoEnegia;
  }
}
