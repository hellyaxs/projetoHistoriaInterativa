import java.util.ArrayList;
import java.util.Random;

public class Player extends playerAbtract{
    
    private Random random;

    public Player(int life, int energy,String name) 
    {
        this.life = life;
        this.energy = energy;
        this.name = name;
        this.allies = new ArrayList<Player>();
        this.inimigos = new ArrayList<Player>();
        this.positionplay = new Position();
        this.random = new Random();
    }

    // metodo para adicionar aliados
    public void addAllies(Player personagem)
    {
        this.allies.add(personagem);
        personagem.allies.add(this);     
    }

    // metodo para adicionar inimigos
    public void addEnemy(Player personagem) 
    {  
        this.inimigos.add(personagem);     
    }
  
    public Position movePosition(Position p)
    {
        if(p.x<5 && p.y<5){
            return positionplay.somar(p);
        }else{
            return positionplay.substrair(p);
        }
        
    }

    public int getPositionX()
    {
        return positionplay.x;
    }
    
    public int getPositionY()
    {
        return positionplay.y;
    }

    public void lucky(int i)
    {
        int luck = random.nextInt(5);
          switch(luck){
            case 0:
            this.energy -= 10;
            inimigos.get(i).setEnergyjust(10);
            break;
      
            case 1:
            this.energy  -= 11;
            inimigos.get(i).setEnergyjust(10);
            break;
      
            case 2:
            this.energy -= 12;
            inimigos.get(i).setEnergyjust(10);
            break;
      
            case 3:
            this.energy += 13;
            inimigos.get(i).setEnergyjust(-10);
            break;
      
            case 4:
            this.energy += 14;
            inimigos.get(i).setEnergyjust(-10);
            break;
            
            case 5:
            this.energy += 15;
            inimigos.get(i).setEnergyjust(-10);
            break;
            
          }
        }
  

}
