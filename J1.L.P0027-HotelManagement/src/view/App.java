
package view;
//tao ra menu chuan

import java.util.ArrayList;

public class App {
    
    public void excute(){
        Menu menu = new Menu();
        ArrayList<String> hotelMenu = new ArrayList<>();
        hotelMenu.add("Adding new Hotel");
        hotelMenu.add("Checking exits hotel");
        hotelMenu.add("checking exits hotel");
        hotelMenu.add("Delete hotel");
        hotelMenu.add("Search hotel");
        hotelMenu.add("displaying a hotel list");
        hotelMenu.add("other Quit");
        
        while(true){
            int choice = menu.getIntChoice(hotelMenu);
            switch(choice){
                case 1: 
                    
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
                case 7: 
                    System.out.println("-----Quit------");
                    return;                 
            }
        }
    }
}
