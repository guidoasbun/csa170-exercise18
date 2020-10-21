import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //inits both arrays
        //inits tries allowed to check
        String[] usernames = {"Matt","Mark","Luke","John","Paul"};
        String[] passwords = {"king","slave","human","divine","church"};
        String name, pass;
        int tries = 0;
        boolean access = false;

        //used do loop because I want the operations to run at least once
        do{
            //reads user input and assigns to String variables
            System.out.print("Enter username: ");
            name = in.next();
            System.out.print("Enter password: ");
            pass = in.next();

            //checks trough the usernames array 1st, then checks passwords array if match
            //assigns true to access if both are equals
            for(int i = 0; i < usernames.length; i++){
                if(name.equals(usernames[i])){
                    if(pass.equals(passwords[i])){
                        access = true;
                    }
                }
            }

            //prints depending on what the status if access is
            if (access){
                System.out.println("Access Granted!");
            }else{
                System.out.println("Sorry, your username/password does not match our" +
                        "database. Contact the administrator");
            }

            tries++;
        }while(tries < 2 && !access);
    }
}
