public class App {

    public static void main(String[] args) throws Exception {
    
   Player avatar = new Player(1,20,"avatar");
   Player inimigo = new Player(20,20,"ultimo dominador de ar");
 
   avatar.addEnemy(inimigo);
   avatar.addAllies(avatar);
  // avatar.interagir(inimigo);
   managerChapters manager = new managerChapters(avatar);
   manager.randomChapters();
  
  
            
    }
}
