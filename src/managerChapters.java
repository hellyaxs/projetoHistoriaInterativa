import java.util.ArrayList;
import java.util.Random;

public class managerChapters extends dateChapters {// esta class deve receber todos os capitulos e gerencia-los para o jogador
    
  private ArrayList<Chapters> chapters;
  private Player jogador;
  private Random random;
  private String[][] matriz;
  private ArrayList<Player> inimigos;
  private Position auxiliar;

  managerChapters(Player jogador) {

    this.chapters = getdateChapters();
    this.jogador = jogador;
    this.random = new Random();
    this.matriz = new String[11][11];
    this.inimigos = jogador.getInimigos();
  

    zeraMatriz();

    for (var list : inimigos) {
     
      list.setPositionXY(random.nextInt(11),random.nextInt(11));
    }

  }

  public void zeraMatriz() {

    for (int i = 0; i < this.matriz.length; i++) {
      for (int j = 0; j < this.matriz.length; j++) {
        matriz[i][j] = " _ ";
      }
    }
    this.matriz[5][5] = " " + jogador.getName().substring(0, 1).toUpperCase() + " ";
  }

  public void randomChapters() {// este metodo deve navegar pelos capitulos dependendo da vida do jogador

    for (int i = 0; i < this.chapters.size(); i++) {

      jogador.setEnergy(chapters.get(i).escolher());

      if (this.jogador.getLife() <= 0) {
        System.out.println("--------GAME OVER--------");
        break;
      } else {
        this.printMap();
      }
    }
  }

  public void printMap() {

     this.auxiliar = new Position();
    for (int i = 0; i < inimigos.size(); i++) 
    {
      auxiliar.setPositionAbsolute(move(i));
      if(auxiliar.PositionY()<=10 && auxiliar.PositionY()>=0 && auxiliar.PositionX()<=10 && auxiliar.PositionX()>=0)
      {
        if(auxiliar.PositionY()==5 && auxiliar.PositionX()==5)
        {
          jogador.lucky(i);
        }
        else
        {
          this.matriz[auxiliar.PositionY()][auxiliar.PositionX()] = " " + inimigos.get(i).getName().substring(0, 1).toUpperCase() + " ";
        }
      }
      
    }

    printStatus();
    zeraMatriz();
  }

  public Position move(int i)
  {
    return inimigos.get(i).movePosition(jogador.getPosition());
  }

  public void printStatus() 
  {
        System.out.println("");
        for (int i = 0; i < this.matriz.length; i++)
         {
            for (int j = 0; j < this.matriz.length; j++) 
            {
              System.out.print(matriz[i][j]);
            }
            System.out.println("");
         }

      System.out.println("\n-----------------------------------");
      System.out.println("YOU: A   \tXP: " + jogador.life + " pontos \tEnergy: " + jogador.energy + " pontos\n");

      for (Player list : inimigos)
      {
        System.out.println("ENEMIES: " + list.getName().substring(0, 1).toUpperCase() + "\t\tXP: " + list.life + " pontos");
      }
      System.out.println("-----------------------------------\n");
  }

}
