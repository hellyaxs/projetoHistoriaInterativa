import java.util.ArrayList;

public class Player extends playerAbtract{
    
    public Player(int life, int energy,String name,int linha,int coluna) 
    {
        this.life = life;
        this.energy = energy;
        this.name = name;
        this.allies = new ArrayList<Player>();
        this.inimigos = new ArrayList<Player>();
        this.positionplay = new Position(linha,coluna);
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

  

}
