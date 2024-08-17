import java.util.Scanner;

class patients{
    String patientName;
    String issue;
    String date;
    public patients(String patientName,String issue, String date){
        this.patientName = patientName;
        this.issue = issue;
        this.date = date;
    }
    void showDetails(){
        System.out.println("Patient Name is: "+patientName);
        System.out.println("Patient issue is: "+issue);
        System.out.println("Date of entry is: "+date);
    }
}

class Records{
    int addCounter = 0;
    void addPatients(patients patients){
        addCounter++;
        System.out.println("Patient added successfully.");
        patients.showDetails();
        System.out.println("Total patient in the Hospital are "+addCounter);
    }
    void removePatients(){
        if(addCounter>0){
            addCounter--;
            System.out.println("Patient is removed successfully.");
        }
        else {
            System.out.println("No patient to remove.");
        }
        System.out.println("Total patient in the Hospital are "+addCounter);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Records records = new Records();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of patients:");
        int t = scanner.nextInt();
        scanner.nextLine();

        while(t>0){
            System.out.println("Enter the patient name:");
            String patientName = scanner.nextLine();
            System.out.println("Enter the patient issue:");
            String issue = scanner.nextLine();
            System.out.println("Enter the date of entry:");
            String date = scanner.nextLine();
            patients patients = new patients(patientName,issue,date);
            records.addPatients(patients);
            t--;
        }
        System.out.println("Removing a patient from hospital...");
        records.removePatients();
    }
}
