import java.util.Scanner;

public class Passwords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] usernames = {"Matt","Mark","Luke","John","Paul"};
        String[] passwords = {"king","slave","human","divine","church"};
        String name, pass;
        int tries = 0;
        boolean access = false;

        do{
            System.out.print("Enter username: ");
            name = in.next();
            System.out.print("Enter password: ");
            pass = in.next();

            for(int i = 0; i < usernames.length; i++){
                if(name.equals(usernames[i])){
                    if(pass.equals(passwords[i])){
                        access = true;
                    }
                }
            }

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
