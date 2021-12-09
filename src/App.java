public class App {
    public static void main(String[] args) throws Exception {
    
   
   // objeto avatar da classe Player
   Player avatar = new Player(100,100,"ARTHUR");
   // objeto inimiho da classe Player
    Player inimigo = new Player(20,20,"UBUNTU"); 
    Player inimigo2 = new Player(20,20,"MAC"); 
 
   avatar.addEnemy(inimigo);
   avatar.addEnemy(inimigo2);
   avatar.addAllies(avatar);

   managerChapters manager = new managerChapters(avatar);
   manager.randomChapters();
  
          
    }
}
