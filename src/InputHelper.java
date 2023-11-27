import java.util.Scanner;
public class InputHelper {
    public static void main(String[] args) {
    //Test Method
        Scanner scan = new Scanner(System.in);
        String dob = getRegExString(scan, "Enter Your shit man", "\\d{2}.\\d{2}.\\d{4}");
        System.out.println("Your SSN: " + dob);
    }

    //This method loops until a valid integer input is received. Returns int value.
    public static int getInt(Scanner in, String prompt){
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                done = true;
            }
            else {
                System.out.println("HOLY FUCKKKKKK!");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }



    public static int getRangedInt(Scanner in, String prompt, int min, int max){
        boolean done = false;
        int x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                //check to see if value is in the range
                if (x <= max && x >= min) {
                    done = true;
                }
                else {
                    System.out.println("WHORE???");
                }

            }
            else {
                System.out.println("HOLY FUCKKKKKK!");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }

public static double getDouble(Scanner in, String prompt){
        boolean done = false;
        double x = 0;
    System.out.println(prompt);
    do {
        if (in.hasNextDouble()) {
            x = in.nextDouble();
            done = true;
        }
        else {
            System.out.println("YOU HAVE ENTERED AN INVALID VALUE!!!!!!");
        }
        in.nextLine();
    } while (!done);
    return x;
}

    public static double getRangedDouble(Scanner in, String prompt, double min, double max){
        boolean done = false;
        double x = 0;
        System.out.println(prompt);
        do {
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                //check to see if value is in the range
                if (x <= max && x >= min) {
                    done = true;
                }
                else {
                    System.out.println("WRONG INPUT");
                }

            }
            else {
                System.out.println("WRONG INPUT");
            }
            in.nextLine(); //clear buffer
        } while (!done);
        return x;
    }
    public static int getPositiveNonZeroInt (Scanner in, String prompt){
        boolean done = false;
        int x = 0;

        System.out.println(prompt);
        do {
            if (in.hasNextInt()) {
                x = in.nextInt();
                if (x > 0) {
                    done = true;
                } else {
                    System.out.println("YOU ENTERED A NEGATIVEE");
                }
            } else {
                System.out.println("THATS WRONGGGGG!!!!");
            }
            in.nextLine();
        } while (!done);
        return x;
    }
    public static String getRegExString(Scanner in, String prompt, String regEx){
        boolean done = false;
        String input;
        System.out.println(prompt);
        do {
          input = in.nextLine();
            if (input.matches(regEx)) {
                done = true;
            }
            else {
                System.out.println("FUCK YOU ASSHOLE");
            }
        } while (!done);
        return input;
    }
    public static String getYNConfirm(Scanner in, String prompt){
        boolean done = false;
        String input;
        do {
            System.out.println(prompt);

        } while (!done);
        return input;
    }



















}

