import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
        this.matriz = new String[11][11];
        this.inimigos = jogador.getInimigos();
        Scanner input = new Scanner(System.in);
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
         

        if(this.jogador.getLife()<=25)
        {//dependendo da vida,o jogador irá para capitulos diferentes
          System.out.println("aqui o jogador tem 25 pontos de vida");

          this.printMap();
        }
        else if(this.jogador.getLife()<=50 && this.jogador.getLife()>=25)
        {
         
          System.out.println("aqui o jogador tem 50 pontos de vida");
          this.printMap();
        }
        else if(this.jogador.getLife()<=75 && this.jogador.getLife()>=50)
        {
        
          System.out.println("aqui o jogador tem 75 pontos de vida");
          this.printMap();
       
        }
        else if(this.jogador.getLife()<=100 && this.jogador.getLife()>=75)
        {
          System.out.println("aqui o jogador tem 100 pontos de vida");
          this.printMap();
        }
        else if(this.jogador.getLife()==0)
        {   
          System.out.println("--------GAME OVER--------");
        }
    } 
 }
 /*public void interagir(Player jogador){
  "O mapa deverá ser sempre centralizado no jogador principal. Interações entre
personagens só serão permitidas caso estejam em posições adjacentes."
  if(matriz[jogador.getLinha()][jogador.getColuna()+1]!="_") {

  } 
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
    public void printMap(){
   /*Cada jogador, inclusive o principal, terá uma posição 2D representada em um minimapa. A cada novo
capítulo o minimapa deve ser mostrado novamente, posicionando todos os personagens mostrando somente
a primeira letra de cada. O mapa deverá ser sempre centralizado no jogador principal. Interações entre
personagens só serão permitidas caso estejam em posições adjacentes. */

 this.matriz[5][5] = " "+jogador.getName().substring(0,1).toUpperCase()+" ";
 
  for(int i = 0 ;i<this.matriz.length;i++)
  {
        for(int j = 0;j<this.matriz.length;j++)
      {
        System.out.print(matriz[i][j]);
      }
   System.out.println("");
  }

}
 /*Cada jogador, inclusive o principal, terá uma posição 2D representada em um minimapa. A cada novo
capítulo o minimapa deve ser mostrado novamente, posicionando todos os personagens mostrando somente
a primeira letra de cada. O mapa deverá ser sempre centralizado no jogador principal. Interações entre
personagens só serão permitidas caso estejam em posições adjacentes. */
  public void walk(){

// falta colocar as condicoes para mudar de posição
    while(matriz[inimigos.getLinha()][inimigos.getColuna()] != matriz[5-1][5]&& matriz[5][5-4] && matriz[5+1][5] && matriz[5][5+1]) {
      
      System.out.println("Agora eu tenho que decidir que caminho devo seguir...");
      System.out.println("\n[DIREITA][CIMA][ESQUERDA][BAIXO]");
      String directionWalk = scanner.nextLine().toUppercase();
      switch(directionWalk){
        case "DIREITA": matriz[inimigos.getLinha()][inimigos.coluna()] = " ";

        case 
      }
    }
  }  
}
