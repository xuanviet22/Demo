/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

/**
 *
 * @author admin
 */
public class J1SP0071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vailidation c = new vailidation();
        Danhsach e = new Danhsach();
        int choice;
        do {
            System.out.println(" ===========================");
            System.out.println("1.Add task");
            System.out.println("2.Delete task ");
            System.out.println("3.Display Task");
            System.out.println("4. exit");
            choice = c.checkInputInt("your choice: ", 1, 4);

            switch (choice) {
                case 1:
                    e.addTask();

                    break;
                case 2:
                    e.deleteTask();
                    break;
                case 3:
                    e.display();
                    break;
                case 4:
                    System.exit(0);

            }
        } while (choice != 4);
    }

}
