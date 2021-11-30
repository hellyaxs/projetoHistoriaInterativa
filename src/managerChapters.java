import java.util.ArrayList;
import java.util.Random;

public class managerChapters extends dateChapters {// esta class deve receber todos os capitulos e gerencia-los para o jogador
   private ArrayList<Chapters> chapters;
   private Player jogador;
   private Random random;
   private String[][] matriz;
   private ArrayList<Player> inimigos;

    managerChapters(Player jogador){

        this.chapters = getdateChapters();
        this.jogador = jogador;
        this.random = new Random();
        this.matriz = new String[10][10];
        this.inimigos = jogador.getInimigos();

  for(int i = 0 ;i<this.matriz.length;i++)
  {
      for(int j = 0;j<this.matriz.length;j++)
      {
           matriz[i][j] = " _ ";   
      }
  }
  
   for(Player inimigos: this.inimigos)
 {
  this.matriz[random.nextInt(9)][random.nextInt(9)] = " "+inimigos.getName().substring(0,1).toUpperCase()+" ";
 }
        
    }
  public void randomChapters(){//este metodo deve navegar pelos capitulos dependendo da vida do jogador
        
    for(int i = 0;i<this.chapters.size();i++){
      
          jogador.setEnergy(chapters.get(i).escolher());
          jogador.energy =  jogador.getEnergy();
          System.out.println("depois desta escolha voce recebeu mais "+ jogador.life + " de energia");
          System.out.println(jogador.getLife());

        if(this.jogador.getLife()<=25)
        {//dependendo da vida,o jogador irá para capitulos diferentes
          // this.chapters.get(random.nextInt(5)).escolher();
          System.out.println("aqui o jogador tem 25 pontos de vida");

          this.printMap(jogador.getLinha()+1,jogador.getColuna()+1);
          jogador.setLinha(jogador.getLinha()+1);
          jogador.setColuna(jogador.getColuna()+1);
        }
        else if(this.jogador.getLife()<=50 && this.jogador.getLife()>=25)
        {
          //this.chapters.get(random.nextInt(5)+10).escolher();
          System.out.println("aqui o jogador tem 50 pontos de vida");
          this.printMap(jogador.getLinha()+1,jogador.getColuna()+1);
          jogador.setLinha(jogador.getLinha()+1);
          jogador.setColuna(jogador.getColuna()+1);
        }
        else if(this.jogador.getLife()<=75 && this.jogador.getLife()>=50)
        {
          //this.chapters.get(random.nextInt(5)+10).escolher();
          System.out.println("aqui o jogador tem 75 pontos de vida");
          this.printMap(jogador.getLinha()+1,jogador.getColuna()+1);
          jogador.setLinha(jogador.getLinha()+1);
          jogador.setColuna(jogador.getColuna()+1);
        }
        else if(this.jogador.getLife()<=100 && this.jogador.getLife()>=75)
        {
          //this.chapters.get(random.nextInt(5)+10).escolher();
          System.out.println("aqui o jogador tem 100 pontos de vida");
          this.printMap(jogador.getLinha(),jogador.getColuna()+1);
          jogador.setLinha(jogador.getLinha()+1);
          jogador.setColuna(jogador.getColuna()+1);
        }
        else if(this.jogador.getLife()==0)
        {   
          System.out.println("--------GAME OVER--------");
        }
    } 
 }
 /*public void interagir(Player jogador){
  if(matriz[i][j])
    if (addAllies.contais(jogador)){
      jogador.life = jogador.life + (5);
      System.out.println("depois da interação, seu HP é de: ");
      System.out.println(jogador.life);

    }
    else if (addEnemy.contains(Player jogador)){
      jogador.life = jogador.life - (10);
        System.out.println("depois da interação, seu HP é de: ");
      System.out.println(jogador.life)
    }
    else{
      System.out.println("seu HP nao mudou");
    
    }
  }*/
    public void printMap(int linha,int coluna){
   /*Cada jogador, inclusive o principal, terá uma posição 2D representada em um minimapa. A cada novo
capítulo o minimapa deve ser mostrado novamente, posicionando todos os personagens mostrando somente
a primeira letra de cada. O mapa deverá ser sempre centralizado no jogador principal. Interações entre
personagens só serão permitidas caso estejam em posições adjacentes. */

 this.matriz[linha][coluna] = " "+jogador.getName().substring(0,1).toUpperCase()+" ";
 
 
  for(int i = 0 ;i<this.matriz.length;i++)
  {
        for(int j = 0;j<this.matriz.length;j++)
      {
          System.out.print(matriz[i][j]);
      }
   System.out.println("");
  }

  this.matriz[linha][coluna] = " _ ";

}
}
