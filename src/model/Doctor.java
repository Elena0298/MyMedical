package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //atributos
    private String speciality;
    private ArrayList<AvailableAppoiment> availableAppoiments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name, email);
        /*System.out.println("El nombre del doctor es: " + name);
        this.speciality = speciality;*/
    }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void addAvailableAppoiment(String date, String time){
        availableAppoiments.add(new Doctor.AvailableAppoiment(date, time));
    }

    public ArrayList<AvailableAppoiment> getAvailableAppoiments(){
        return availableAppoiments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppoiments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Pediatría");
    }

    public static class AvailableAppoiment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppoiment(String date, String time){
            try{
                this.date = format.parse(date);
            }catch (ParseException e){
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appoiments \nDate: " + date + "\nTime: " + time;
        }
    }
}
