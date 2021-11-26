import java.util.ArrayList;
import java.util.Random;

public class managerChapters {// esta class deve receber todos os capitulos e gerencia-los para o personagem
   private ArrayList<Chapters> chapters;
   private Player jogador;
   private Random random;


    managerChapters(ArrayList<Chapters> chapters,Player jogador){
        this.chapters = chapters;
        this.jogador = jogador;
        this.random = new Random();
        
    }
    public void randomChapters(){//este metodo deve navegar pelos capitulos dependendo da vida do personagem
        switch(this.jogador.getLife()){

            case 25:
                this.chapters.get(random.nextInt(5)).escolher();
            break;
            case 50:
               this.chapters.get(random.nextInt(5)+10).escolher();
            break;
        } 

    }
}
