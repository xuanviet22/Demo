/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class vailidation {

    public Scanner sc = new Scanner(System.in);

    public int checkInputInt(String mess, int min, int max) {
        System.out.print(mess);
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    System.out.print("please input between " + min + "-" + max + ": ");
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.err.println("Please enter a valid integer.");
                System.out.print("Enter again: ");
            }
        }
    }

    public double checkInputDouble(String mess, double min, double max) {
        System.out.print(mess);
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result < min || result > max) {
                    System.out.print("please input between " + min + "-" + max + ": ");
                    continue;
                }
                return result;
            } catch (Exception e) {
                System.err.println("Please enter a valid integer.");
                System.out.print("Enter again: ");
            }
        }
    }

    public String checkInputString(String mess) {
        String regex = "[A-Za-z0-9\\s]+";
        System.out.print(mess);
        while (true) {
            String input = sc.nextLine();
            if (!input.matches(regex)) {
                System.out.println("Please input match regex: " + regex);
                continue;
            }
            if (input.trim().isEmpty()) {
                System.out.print("Please input a non-empty String: ");
                continue;
            }
            return input;
        }
    }

    public String checkInputDate(String mess) {
        System.out.print(mess);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        dateformat.setLenient(false);
        while (true) {
            try {
                Date d = dateformat.parse(sc.nextLine().trim());
                Date current = Calendar.getInstance().getTime();
                if (current.compareTo(d) < 0) {
                    System.out.print("Please input date that before current date:");
                    continue;
                }
//                dateformat = new SimpleDateFormat("dd-MM-yyyy");
                return dateformat.format(d);
            } catch (Exception e) {
                System.out.println("Please input valid date (dd-MM-yyyy): ");
            }
        }
    }

}
