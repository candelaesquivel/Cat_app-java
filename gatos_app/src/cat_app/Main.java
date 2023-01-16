/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat_app;


import java.io.IOException;
import javax.swing.JOptionPane;
import model.Cat;
import service.CatService;



/**
 *
 * @author Candela
 */
public class Main {
    public static void main(String[] args) throws IOException{
        int menuOption = -1;
        String[] buttoms = {" 1. ver gatos", "2. ver favoritos", "3. salir"};

        do{
            String option = (String) JOptionPane.showInputDialog(null, "Gatitos java", "Menu principal", JOptionPane.INFORMATION_MESSAGE, null, buttoms,buttoms[0]);

            for(int i=0;i<buttoms.length;i++){
                if(option.equals(buttoms[i])){
                    menuOption = i;
                }
            }

            switch(menuOption){
                case 0:
                    CatService.seeRandomCats();
                    break;
                case 1:
                    Cat cat = new Cat();
                    CatService.seeFavoriteCats(cat.getApikey());
                default:
                    break;
            }
        }while(menuOption != 2);
    }
    
}
