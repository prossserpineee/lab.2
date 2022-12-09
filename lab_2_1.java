import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lab_2_1 {
    public static void main(String[] args) {
        System.out.println("Введите строку с датой");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        in.close();
        Pattern pt = Pattern.compile("\\d{2}\\W\\d{2}\\W\\d{4}");
        Matcher mt = pt.matcher(date);
        Pattern slash = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher slash_mt = slash.matcher(date);
        if (!slash_mt.matches()) {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy ");
            System.exit(0);
        }
        if (mt.matches()) {
                Pattern year = Pattern.compile("\\d{2}/\\d{2}/([1-2](0|9)[0-9][0-9])|[3-9][0-9]{3}");
                Matcher year_mt = year.matcher(date);
            if (year_mt.matches()) {
                    Pattern month_31 = Pattern.compile("\\d{2}/(01|03|05|07|08|10|12)/\\d{4}");
                    Pattern month_30 = Pattern.compile("\\d{2}/(04|06|09|11)/\\d{4}");
                    Pattern month_29 = Pattern.compile("\\d{2}/02/\\d{4}");
                    Matcher month_31mt = month_31.matcher(date);
                    Matcher month_30mt = month_30.matcher(date);
                    Matcher month_29mt = month_29.matcher(date);
                    if (month_31mt.matches()) {
                        Pattern day31 = Pattern.compile("([1-2][0-9]|30|31|0[1-9])/\\d{2}/\\d{4}");
                        Matcher day31_mt = day31.matcher(date);
                        if (day31_mt.matches()) System.out.println("Введенное выражение является датой");
                        else System.out.println("Введенное выражение не является датой");
                    }
                        else {
                            if (month_30mt.matches()) {
                                Pattern day30 = Pattern.compile("([1-2][0-9]|30|0[1-9])/\\d{2}/\\d{4}");
                                Matcher day30_mt = day30.matcher(date);
                                if (day30_mt.matches()) System.out.println("Введенное выражение является датой");
                                else System.out.println("Введенное выражение не является датой");
                            }
                                else{
                                    if (month_29mt.matches()) {
                                        Pattern day29 = Pattern.compile("([1-2][0-9]|0[1-9])/\\d{2}/\\d{4}");
                                        Matcher day29_mt = day29.matcher(date);
                                        if (day29_mt.matches()) System.out.println("Введенное выражение является датой");
                                        else System.out.println("Введенное выражение не является датой");
                                    }
                                }


                        }



                }
                else System.out.println("Введенное выражение не является датой");

            }
        else System.out.println("Введенное выражение не является датой ");

        }

    }
