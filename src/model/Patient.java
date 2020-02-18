package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    private String birthday;
    private double weigth;
    private double heigth;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppoimenteNurse> appoimenteNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedulable(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppoimenteNurse> getAppoimenteNurses() {
        return appoimenteNurses;
    }

    public void setAppoimenteNurses(ArrayList<AppoimenteNurse> appoimenteNurses) {
        this.appoimenteNurses = appoimenteNurses;
    }

    public Patient(String name, String email){
        super(name, email);
    }

    public void setWeigth(double weigth){
        this.weigth = weigth;
    }

    public String getWeigth(){
        return this.weigth + " Kg.";
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeigth() {
        return this.heigth + " Mtrs.";
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + "\nBirthday: " + birthday + "\n Weigth: " +getWeigth() + "\n Heigth: " + getHeigth() + "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde el nacimiento");
    }
}
