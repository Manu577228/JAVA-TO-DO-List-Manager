package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        boolean exit = false; // Flag to control loop execution

        while(!exit){
            System.out.println("\n==== To-Do List manager ====");
            System.out.println("1. Add task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addTask(); // call addTask() method
                    break;
                case 2:
                    viewTasks(); // call viewTasks() method
                    break;
                case 3:
                    removeTask(); // call removeTask(); method
                    break;
                case 4:
                    exit = true; // set the exit flag to true, exit loop
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void addTask() {
        System.out.println("enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("task added.");
    }

    private static void viewTasks() {
        System.out.println("\n==== your Tasks ====");
        for(int i = 0; i < tasks.size(); i++){
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static void removeTask() {
        System.out.println("Enter task number to remove: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine();

        if(taskNumber > 0 && taskNumber <= tasks.size()){
            String removedTask = tasks.remove(taskNumber - 1);
            System.out.println("Task \"" + removedTask + "\" removed.");
        } else {
            System.out.println("invalid task number. ");
        }
    }
}
