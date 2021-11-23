public class App {
    public static void main(String[] args) throws Exception {
        Player avatar = new Player(100,100);
   Player inimigo = new Player(100,100);
   avatar.addEnemy(inimigo);
   avatar.addAllies(avatar);
   avatar.startChapters();
            
    }
}
