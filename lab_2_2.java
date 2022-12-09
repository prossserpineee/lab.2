import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lab_2_2 {
    public static void main(String[] args) {
        System.out.println("Введите пароль");
        Scanner pas = new Scanner(System.in);
        while(true){
        String password = pas.nextLine();
        Pattern password_pt1 = Pattern.compile("^[a-zA-Z_0-9]{8,}$");
        Matcher password_mt1 = password_pt1.matcher(password);
        Pattern password_pt2 = Pattern.compile("[a-z]");
        Matcher password_mt2 = password_pt2.matcher(password);
        Pattern password_pt3 = Pattern.compile("[A-Z]");
        Matcher password_mt3 = password_pt3.matcher(password);
        Pattern password_pt4 = Pattern.compile("[0-9]");
        Matcher password_mt4 = password_pt4.matcher(password);
        if (password_mt1.find() && password_mt2.find() && password_mt3.find() && password_mt4.find()){
            System.out.println("Пароль надежен");
            System.exit(0);
            pas.close();
        }
        else System.out.println("Пароль ненадежен, повторите попытку ввода");
        }
    }
}
