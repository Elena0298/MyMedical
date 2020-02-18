import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import javax.xml.namespace.QName;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        showMenu();

        /*Doctor myDoctor = new Doctor("Elena", "Neuro");
        myDoctor.addAvailableAppoiment(new Date(), "4pm");
        myDoctor.addAvailableAppoiment(new Date(), "6pm");
        System.out.println(myDoctor);

        for (Doctor.AvailableAppoiment availableAppoiment: myDoctor.getAvailableAppoiments()){
            System.out.println(availableAppoiment.getDate() + " " + availableAppoiment.getTime());
        }

        User user = new Doctor("Christian", "christian@hotmail.com");
        User userPa = new Patient("Salem", "salemn@hotmail.com");
        user.showDataUser();
        userPa.showDataUser();

        User user1 = new User("Elena", "ele@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("\n Doctor");
                System.out.println("Departamento: Gereatría");
            }
        };

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedulable(Date date, String time) {

            }
        };
        /*Patient patient = new Patient("Salem", "Salemcito@hotmailcom");
        patient.setHeigth(43);
        System.out.println(patient.getHeigth());
        System.out.println(patient.toString());*/



        /*model.Doctor myDoctor = new model.Doctor();
        myDoctor.name = "Elena";
        myDoctor.showName();
        myDoctor.showId();

        model.Doctor myDoctorDian = new model.Doctor();
        myDoctorDian.name = "Diana";
        myDoctorDian.showName();
        myDoctorDian.showId();

        myDoctor = myDoctorDian;
        System.out.println(myDoctor);
        System.out.println(myDoctorDian);*/

    }
}
