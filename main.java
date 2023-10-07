import java.util.Scanner;
import java.io.*;

class Student {
    private String name;
    private String fatherName;
    private String studentId;
    private String age;
    private String mobileNo;
    private String fatherMobileNo;

    public Student() {
        System.out.println("Enter Student Data\n");
    }

    public void setData(String name, String fatherName, String studentId, String age, String mobileNo,
            String fatherMobileNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.studentId = studentId;
        this.age = age;
        this.mobileNo = mobileNo;
        this.fatherMobileNo = fatherMobileNo;
    }

    public void display() {
        System.out.println("Name of Student: " + name);
        System.out.println("Name of Student Father: " + fatherName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Age: " + age);
        System.out.println("Student Mobile No: " + mobileNo);
        System.out.println("Student Father Mobile No: " + fatherMobileNo + "\n");
    }
}

class Employee extends Student {
    private String employeeName;
    private String maritalStatus;
    private String employeeNo;
    private String employeeAge;
    private String cnic;

    public Employee() {
        super();
        System.out.println("Enter Employee Data\n");
    }

    public void setEmployeeData(String employeeName, String maritalStatus, String employeeNo, String employeeAge,
            String cnic) {
        this.employeeName = employeeName;
        this.maritalStatus = maritalStatus;
        this.employeeNo = employeeNo;
        this.employeeAge = employeeAge;
        this.cnic = cnic;
    }

    public void display() {
        System.out.println("Name Of Employee: " + employeeName);
        System.out.println("Employee Mobile No: " + employeeNo);
        System.out.println("Teacher Father Mobile No: " + employeeNo);
        System.out.println("Age of Employee: " + employeeAge);
        System.out.println("CNIC of Employee: " + cnic);
        System.out.println("Martial Status of Employee: " + maritalStatus + "\n");
    }
}

class Teacher extends Student {
    private String teacherName;
    private String fatherName;
    private String maritalStatus;
    private String fatherMobileNo;
    private String mobileNo;
    private String age;
    private String degree;
    private String experience;
    private String cnic;

    public Teacher() {
        super();
        System.out.println("Enter Teacher Data\n");
    }

    public void setTeacherData(String teacherName, String fatherName, String maritalStatus, String fatherMobileNo,
            String mobileNo, String age, String degree, String experience, String cnic) {
        this.teacherName = teacherName;
        this.fatherName = fatherName;
        this.maritalStatus = maritalStatus;
        this.fatherMobileNo = fatherMobileNo;
        this.mobileNo = mobileNo;
        this.age = age;
        this.degree = degree;
        this.experience = experience;
        this.cnic = cnic;
    }

    public void display() {
        System.out.println("Name Of Teacher: " + teacherName);
        System.out.println("Name of Teacher Father: " + fatherName);
        System.out.println("Teacher Mobile No: " + mobileNo);
        System.out.println("Teacher Father Mobile No: " + fatherMobileNo);
        System.out.println("Age of Teacher: " + age);
        System.out.println("Degree Of Teacher: " + degree);
        System.out.println("Experience of Teacher: " + experience);
        System.out.println("CNIC of Teacher: " + cnic);
        System.out.println("Martial Status: " + maritalStatus + "\n");
    }
}

public class main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        welcomeScreen();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("||1-Enter New Student Data||");
        System.out.println("||2-Enter New Teacher Data||");
        System.out.println("||3-Enter New Employee Data||");
        System.out.println("||4-See Data From File||");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        choice();
    }

    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                enterStudentData();
            } else if (choice.equals("2")) {
                enterTeacherData();
            } else if (choice.equals("3")) {
                enterEmployeeData();
            } else if (choice.equals("4")) {
                manager();
            } else {
                System.out.println("Wrong Input. Try Again.");
            }
        }
    }

    public static void welcomeScreen() {
        System.out.println("\n");
        System.out.println("  0     0   000000   0        000000  000000  00   00  000000");
        System.out.println("  0     0   0        0        0       0    0  0 0 0 0  0     ");
        System.out.println("  0  0  0   000000   0        0       0    0  0  0  0  000000");
        System.out.println("  0 0 0 0   0        0        0       0    0  0     0  0     ");
        System.out.println("  00   00   000000   000000   000000  000000  0     0  000000");
        System.out.println("\n");
        System.out.println("--------------------------------------------------------------");
        System.out.println("PIR MEHR ALI SHAH ARID AGRICULTURAL UNIVERSITY DATABASE SYSTEM");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Group Members:\n");
        System.out.println("|FAISAL KHAN AKA LHF||\n\n");
    }

    public static void enterStudentData() {
        Student studentData = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Father Name: ");
        String fatherName = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        String age = scanner.nextLine();
        System.out.print("Enter Student Mobile No: ");
        String mobileNo = scanner.nextLine();
        System.out.print("Enter Student Father Mobile No: ");
        String fatherMobileNo = scanner.nextLine();

        studentData.setData(name, fatherName, studentId, age, mobileNo, fatherMobileNo);

        try (PrintWriter writer = new PrintWriter(new FileWriter("Student Data.txt", true))) {
            writer.println("Name Of Student: " + name);
            writer.println("Name Of Father: " + fatherName);
            writer.println("Name Of Student ID: " + studentId);
            writer.println("Name Of Student Age: " + age);
            writer.println("Name Of Student Mobile No.: " + mobileNo);
            writer.println("Name Of Father Mobile No.: " + fatherMobileNo + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nThanks For The Data\n");
        studentData.display();
    }

    public static void enterEmployeeData() {
        Employee employeeData = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter Employee Martial Status: ");
        String maritalStatus = scanner.nextLine();
        System.out.print("Enter Employee Mobile No: ");
        String employeeNo = scanner.nextLine();
        System.out.print("Enter Employee Age: ");
        String employeeAge = scanner.nextLine();
        System.out.print("Enter CNIC of Employee: ");
        String cnic = scanner.nextLine();

        employeeData.setEmployeeData(employeeName, maritalStatus, employeeNo, employeeAge, cnic);

        try (PrintWriter writer = new PrintWriter(new FileWriter("Employee Data.txt", true))) {
            writer.println("Name Of Employee: " + employeeName);
            writer.println("Employee Mobile No.: " + employeeNo);
            writer.println("Employee Age: " + employeeAge);
            writer.println("Employee Martial Status: " + maritalStatus + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nThanks For The Data\n");
        employeeData.display();
    }

    public static void enterTeacherData() {
        Teacher teacherData = new Teacher();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Teacher Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Enter Teacher Father Name: ");
        String fatherName = scanner.nextLine();
        System.out.print("Enter Teacher Martial Status: ");
        String maritalStatus = scanner.nextLine();
        System.out.print("Enter Teacher Father Mobile No: ");
        String fatherMobileNo = scanner.nextLine();
        System.out.print("Enter Teacher Mobile No: ");
        String mobileNo = scanner.nextLine();
        System.out.print("Enter Age of Teacher: ");
        String age = scanner.nextLine();
        System.out.print("Enter Degree Of Teacher: ");
        String degree = scanner.nextLine();
        System.out.print("Enter Experience of Teacher: ");
        String experience = scanner.nextLine();
        System.out.print("Enter CNIC of Teacher: ");
        String cnic = scanner.nextLine();

        teacherData.setTeacherData(teacherName, fatherName, maritalStatus, fatherMobileNo, mobileNo, age, degree,
                experience, cnic);

        try (PrintWriter writer = new PrintWriter(new FileWriter("Teacher Data.txt", true))) {
            writer.println("Name Of Teacher: " + teacherName);
            writer.println("Name of Teacher Father: " + fatherName);
            writer.println("Teacher Mobile No: " + mobileNo);
            writer.println("Teacher Father Mobile No: " + fatherMobileNo);
            writer.println("Age of Teacher: " + age);
            writer.println("Degree Of Teacher: " + degree);
            writer.println("Experience of Teacher: " + experience);
            writer.println("CNIC of Teacher: " + cnic);
            writer.println("Martial Status: " + maritalStatus + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nThanks For The Data\n");
        teacherData.display();
    }

    public static void manager() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1) See Student Data");
            System.out.println("2) See Teacher Data");
            System.out.println("3) See Employee Data");
            System.out.println("4) Go Back To Main Menu");
            String option = scanner.nextLine();
            if (option.equals("1")) {
                students();
            } else if (option.equals("2")) {
                teachers();
            } else if (option.equals("3")) {
                employees();
            } else if (option.equals("4")) {
                menu();
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void students() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1) List of All Students");
            System.out.println("2) Go to Menu");
            String option = scanner.nextLine();
            if (option.equals("1")) {
                try (BufferedReader reader = new BufferedReader(new FileReader("Student Data.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("\nPress Enter to go to the menu...");
                scanner.nextLine();
                menu();
            } else if (option.equals("2")) {
                menu();
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void employees() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1) List of All Employees");
            System.out.println("2) Go to Menu");
            String option = scanner.nextLine();
            if (option.equals("1")) {
                try (BufferedReader reader = new BufferedReader(new FileReader("Employee Data.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("\nPress Enter to go to the menu...");
                scanner.nextLine();
                menu();
            } else if (option.equals("2")) {
                menu();
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    public static void teachers() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1) List of All Teachers");
            System.out.println("2) Go to Menu");
            String option = scanner.nextLine();
            if (option.equals("1")) {
                try (BufferedReader reader = new BufferedReader(new FileReader("Teacher Data.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("\nPress Enter to go to the menu...");
                scanner.nextLine();
                menu();
            } else if (option.equals("2")) {
                menu();
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }
}
