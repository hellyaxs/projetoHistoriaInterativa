import java.util.ArrayList;

public class Player extends playerAbtract{
    
    public Player(int life, int energy,String name) {
        this.life = life;
        this.energy = energy;
        this.name = name;
        this.allies = new ArrayList<Player>();
        this.inimigos = new ArrayList<Player>();
       
    }
    public int getLife(){
        return this.life;
    }
    public String getName(){
        return this.name;
    }

    // metodo para adicionar aliados
    public void addAllies(Player personagem) {
        if (allies.contains(personagem) == false && inimigos.contains(personagem) == false) {
            this.allies.add(personagem);
            personagem.allies.add(this);
        }
        if (allies.contains(personagem) == true) {
            System.out.println("Eles já são da mesma equipe");
        }
        if (inimigos.contains(personagem) == true) {
            System.out.println("Eles já se odeiam");
        }
    }

    // metodo para adicionar inimigos
    public void addEnemy(Player personagem) {
        if (inimigos.contains(personagem) == false && allies.contains(personagem) == false) {
            this.inimigos.add(personagem);
        }
        if (allies.contains(personagem) == true) {
            System.out.println("Eles já são da mesma equipe");
        }
        if (inimigos.contains(personagem) == true) {
            System.out.println("Eles já se odeiam");
        }
    }

}
 



