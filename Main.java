import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    float marks = sc.nextFloat();

                    students[count++] = new Student(id, name, marks);
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.println("\n--- Student List ---");
                    for (int i = 0; i < count; i++) {
                        if (students[i] != null) {
                            students[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (students[i] != null && students[i].id == deleteId) {
                            students[i] = null;
                            System.out.println("Deleted!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();

                    for (int i = 0; i < count; i++) {
                        if (students[i] != null && students[i].id == updateId) {
                            System.out.print("Enter new marks: ");
                            students[i].marks = sc.nextFloat();
                            System.out.println("Updated!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
