/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Danhsach {

    List<Task> list = new ArrayList<>();
    vailidation v = new vailidation();

    public void addTask() {
        int ID;

        if (list.isEmpty()) {
            ID = 1;
        } else {
            ID = list.get(list.size() - 1).getID() + 1;
        }

        String requireName = v.checkInputString("Requirement Name: ");
        int taskType = v.checkInputInt("TaskType: ", 1, 4);
        String date = v.checkInputDate("Date: ");
        double planFrom = v.checkInputDouble("From: ", 8, 17.5);
        double planTo = v.checkInputDouble("To: ", 8.5, 17.5);
        String assignee = v.checkInputString("Asignee: ");
        String reviewer = v.checkInputString("Reviewer: ");
        Task t = new Task(ID, taskType, requireName, date, planFrom, planTo, assignee, reviewer);
        list.add(t);
        System.out.println("Add successfully");
    }

    public void deleteTask() {
        int ID = v.checkInputInt("Enter ID need to delete: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        for (Task task : list) {
            if (task.getID() == ID) {
                list.remove(task);
                System.out.println("Delete successfully");
                return;
            } else {
                System.out.println("ID does not exist");
            }
        }
    }

    public void display() {
        System.out.println(String.format("%-4s%-15s%-15s%-15s%-10s%-10s%-15s", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer"));
        for (Task e : list) {
            System.out.println(e);
        }
    }

}
