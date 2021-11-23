import java.util.ArrayList;

public class Player{
  private int life;
  private int energy;
  ArrayList<ChooseWay> player = new ArrayList<ChooseWay>();
  ArrayList<Player> allies = new ArrayList<Player>();
  ArrayList<Player> inimigos = new ArrayList<Player>();
  
  public Player(int life, int energy){
    this.life = life;
    this.energy = energy;
  }

  // metodo para adicionar aliados
  public void addAllies(Player personagem){
    if(allies.contains(personagem)==false && inimigos.contains(personagem)== false)
     {
    this.allies.add(personagem);
    personagem.allies.add(this);
     }
    if(allies.contains(personagem)==true)
     {
      System.out.println("Eles já são da mesma equipe");    
     }
    if(inimigos.contains(personagem)==true)
     {
      System.out.println("Eles já se odeiam");       
     }
  }

  // metodo para adicionar inimigos
  public void addEnemy (Player personagem)
  {
    if(inimigos.contains(personagem)==false && allies.contains(personagem)==false)
     {
    this.inimigos.add(personagem);
     }
    if(allies.contains(personagem) == true)
     {
      System.out.println("Eles já são da mesma equipe");
     }
    if(inimigos.contains(personagem)==true)
     {
      System.out.println("Eles já se odeiam");       
     }
  }

  public void startChapters(){
    ArrayList<Option> escolhas = new ArrayList<Option>();
    escolhas.add(new Option("escolha 1",12,true));
   

    player.add(new ChooseWay("voce testou antes??",escolhas));
    player.get(0).printAsk();
    player.get(0).escolher();
  }

 
}
