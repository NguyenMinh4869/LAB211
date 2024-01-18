
package view;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    // nhan opt cua ng dung theo kieu hoac theo doi tuong (menu dang. hchung)
      private static final Scanner sc = new Scanner(System.in);
      
    public int getIntChoice(ArrayList list){
        for(int i = 0 ;i< list.size(); i++){
            System.out.println((i+1)+ ")" + list.get(i));
        }
        System.out.println("----------------------");
        System.out.println("\nChoose 1..."+ list.size()+ ":");
        return Integer.parseInt(sc.nextLine()); 
    }
}
