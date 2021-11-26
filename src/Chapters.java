import java.util.Scanner;
import java.util.ArrayList;

public class Chapters extends dateChapters {

  private String text;
  private ArrayList<Option> options;
  private Chapters choice;
  private Scanner scanner;

  public Chapters(String text, ArrayList<Option> options) {
    this.options = new ArrayList<Option>();
    this.text = text;
    scanner = new Scanner(System.in);

    for (int i = 0; i < options.size(); i++) {
      this.options.add(options.get(i));
    }
  }

  public void printAsk() {
    System.out.println(this.text);

  }

  // metodo para as escolhas de rotas
  public void escolher() {

    int life;
    int energy;
    String escolher;
    boolean loop = true;
    // printa as opcoes na tela
    System.out.println(this.text);

    while (loop) {

      for (Option path : this.options) {
        System.out.println("["+path.getKeyWord()+"] "+path.getText());

      }
      escolher = scanner.nextLine();

      for (Option options : this.options) {

        if (escolher.equals(options.getKeyWord())){ //verifica de o valor digitado e igual ao solicitado

          life = options.getAbilityDamage();
          energy = options.getEnergyDamage();
          loop = false;
        }
      }

      if (loop) {
        System.out.println("escolha uma opção valida!!!");
      }

    }

  }
}
