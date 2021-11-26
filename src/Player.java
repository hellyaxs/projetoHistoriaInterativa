import java.util.ArrayList;

public class Player extends playerAbtract{


    ArrayList<Chapters> chapters = new ArrayList<Chapters>();
    ArrayList<Player> allies = new ArrayList<Player>();
    ArrayList<Player> inimigos = new ArrayList<Player>();

    public Player(int life, int energy) {
        this.life = life;
        this.energy = energy;
       
    }
    public int getLife(){
        return this.life;
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

    public void startChapters() {
       
        dateChapters capitulos = new dateChapters();
        chapters = capitulos.getdateChapters();

        for(Chapters chapters : chapters){
            chapters.escolher();
        }
       
    }

}
