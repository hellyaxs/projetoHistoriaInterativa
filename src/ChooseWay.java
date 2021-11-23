import java.util.Scanner;
import java.util.ArrayList;

public class ChooseWay{
  
  private String text;
  private ArrayList<Option> options;
  private ChooseWay choice;
  private Scanner scanner;

public ChooseWay(String text,ArrayList<Option> options){
  this.options = new ArrayList<Option>();
  this.text = text;
  scanner = new Scanner(System.in);

  for(int i  = 0;i<options.size();i++){
     this.options.add(options.get(i));
  }
}
public void printAsk(){
  System.out.println(this.text);

}

//metodo para as escolhas de rotas
public void escolher(){
  
    int life;
    int energy;
    
//printa as opcoes na tela
   for(Option path: this.options){
    System.out.println(path.getText());
  }
String escolher = scanner.nextLine();

//le o valor de entrada e define o status de vida e energia do personagem após a escolha
for(int i = 0 ;i < options.size();i++){

    if(escolher.equals(this.options.get(i).getKeyWord())){
     
       life = options.get(i).getAbilityDamage();
       energy = options.get(i).getEnergyDamage();
  }else{
    System.out.println("escolha uma opção valida!!!");
  }
}

}
}
