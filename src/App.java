public class App {

    public static void main(String[] args) throws Exception {
    
   Player avatar = new Player(1,20,"avatar",5,5);
   Player inimigo = new Player(20,20,"ultimo dominador de ar",0,9);
   Player inimigo2 = new Player(20,20,"pltimo dominador de ar",9,7);
 
   avatar.addEnemy(inimigo);
   avatar.addAllies(avatar);
   avatar.addEnemy(inimigo2);
  // avatar.interagir(inimigo);
   managerChapters manager = new managerChapters(avatar);
   manager.randomChapters();
  
  
            
    }
}
