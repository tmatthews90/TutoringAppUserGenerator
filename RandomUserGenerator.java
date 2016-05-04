/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tmatthews
 */
public class RandomUserGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> emailList = new ArrayList<>();
        
        String firstName[] = {"John", "Travis", "Gabino", "Austin", "Ryan", "Goku", "Tin", "Vegeta", "Bruce", "Michael", "Jane", "Gabina", "Beth", "Sue", "Sarah", "Jessica", "Yugi", "Bill", "Hank", "Walter", "Emmanuel", "Jake", "Jason", "David", "Alex", "Aaron", "Alec", "Clark", "Connie", "Chelsea", "Brittany", "Candi", "Dallas", "Devin", "Natalie", "Amber", "Cinnimon", "Maria", "Emily", "Gayle", "Rose", "Ron", "Jarvis", "Dirk", "Amanda", "Brenda", "Charles", "Elvis", "Frank", "Garth", "Hilary", "Ivan", "Joe", "Karla", "Lewis", "Marvin", "Nick", "Oscar", "Peter", "Quinn", "Rodger", "Sommer", "Tiffany", "Ursala", "Valerie", "Wendy", "Xavier", "Zach"};
        String lastName[] = {"Smith", "Owens", "Matthews", "Luna", "Coleman", "Atwell", "Jones", "Williams", "Patricks", "Weems", "Khalili", "Baracsh", "Becker", "Stephan", "Morgan", "Clifford", "Sanchez", "Brazeal", "Nguyen", "White", "Black", "Green", "Red", "Orange", "Apple", "Beach", "Cooke", "Dennis", "Everest", "Focal", "Gandolf", "Hernandez", "Indigo", "Jameson", "Krypton", "Love", "Mayweather", "Nabisco", "Overton", "Pinkerton", "Quill", "Ramirez", "Stevens", "Trout", "Universe", "Viole", "Wilson", "Xilophone", "Young", "Zeta" };
        String domain[] = {"gmail.com", "yahoo.com", "me.net", "uta.mavs.edu", "uta.edu", "hotmail.com", "ymail.com", "live.com", "sbcglobal.net", "aol.com", "charter.net"};
        String subjects[] = {"true:false:false:false:false:false", "false:true:false:false:false:false", "false:false:true:false:false:false", "false:false:false:true:false:false", "false:false:false:false:true:false", "false:false:false:false:false:true"};
        int areaCodes[] = {972, 817, 214, 682, 469};
        
        Random r = new Random();
        int flag;

        
        for (int i = 0; i < 500; i++){
            flag = 0;
            int randomFirst = r.nextInt(firstName.length);
            int randomLast = r.nextInt(lastName.length);
            int randomDomain = r.nextInt(domain.length);
            double randomPhone = r.nextInt(8999999) + 1000000;
            int random3Digit = r.nextInt(899) + 100;
            int random4Digit = r.nextInt(9999) + 1000;
            int randomZip = r.nextInt(19) + 76001;  
            String phoneNumber = "(" + areaCodes[r.nextInt(5)] + ") " + random3Digit + "-" + random4Digit;
            
            String email = firstName[randomFirst].toLowerCase() + "." + lastName[randomLast].toLowerCase() + "@" + domain[randomDomain];
                        
            for (String element : emailList) {
                if (element.equals(email)){
                    flag = 1;
                }
            }
              
            emailList.add(email);
            
            if (flag == 0){
                System.out.printf("%s:%s:%d:%s:%s:%s:%s:%d:%s:%s:%s:%s:%s:%s:%s:%d:%.2f\n", firstName[randomFirst], lastName[randomLast], randomZip, phoneNumber, 
                        r.nextInt(2), email, "password", 0, r.nextBoolean(), r.nextBoolean(), r.nextBoolean(), r.nextBoolean(), r.nextBoolean(), r.nextBoolean(), subjects[r.nextInt(6)], 
                        r.nextInt(3) + 1, r.nextFloat() + r.nextInt(4) + 1);
            }
        }
        
    }
    
}
