import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
//aqui e classe responsavel por cada capitulo!!
public class Chapters {

  private String text;
  private ArrayList<Option> options;
  private Scanner scanner;
  private Energy changeEnergy;
  private Random random;

  //construtor dos capitulos e opcoes
  public Chapters(String text, ArrayList<Option> options) {
      this.options = new ArrayList<Option>();
      this.text = text;
      scanner = new Scanner(System.in);
      changeEnergy = new Energy();
      this.random = new Random();

      for (Option preencher : options)
      {
        this.options.add(preencher);
      }
  } 
   

  //imprime o texto do capitulo e as opcoes
  public void printAsk() {
    System.out.println(this.text+":\n");
  }

  // este metodo e responsavel pelas escolhas do jogador
  public Energy escolher() {
    
    String escolher;
    boolean loop = true;
    
    printAsk();

    while (loop)//enquato ele nao escrever a palavra correta loop
    {
       //printa as opcoes na tela
          for (Option path : this.options)
            {
              System.out.println("["+path.getKeyWord()+"] - "+path.getText());
            }
            //input para entrada da escolha
            escolher = scanner.nextLine();

          for (Option options : this.options)
            {
                if (escolher.equals(options.getKeyWord()))
                { //verifica de o valor digitado e igual ao solicitado
                  changeEnergy.setLife(options.getAbilityDamage());
                  changeEnergy.setEnergy(options.getEnergyDamage());
                  changeEnergy.setPosition(random.nextInt(2),random.nextInt(2));
                  
                  
                  loop = false;
                }
            }
          if (loop)
            {
              
              System.out.println("\n!!OPÇÃO INVALIDA!!\n");
              printAsk();
          
            }
    }
    return changeEnergy;
  }
}
