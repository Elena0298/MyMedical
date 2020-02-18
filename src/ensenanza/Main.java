package ensenanza;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.setNombreAlumno("Salem");
        alumno1.setEdad(14);

        Alumno alumno2 = new Alumno();
        alumno2.setNombreAlumno("Kenji");
        alumno2.setEdad(28);

        Alumno alumno3 = new Alumno();
        alumno3.setNombreAlumno("Christian");
        alumno2.setEdad(50);

        Grupo grupo1 = new Grupo();
        grupo1.setNombreGrupo("Música");
        grupo1.setGrado("Primero");

        List<Alumno> grupoMusica = new LinkedList<Alumno>();
        grupoMusica.add(alumno1);
        grupoMusica.add(alumno3);

        grupo1.setAlumnos(grupoMusica);

        Grupo grupo2 = new Grupo();
        grupo2.setNombreGrupo("Danza");
        grupo2.setGrado("Primero");

        List<Alumno> danza = new LinkedList<Alumno>();
        danza.add(alumno2);
        danza.add(alumno3);

        grupo2.setAlumnos(danza);

        Grupo grupo3 = new Grupo();
        grupo3.setNombreGrupo("Español");
        grupo3.setGrado("Primero");

        List<Alumno> espanol = new LinkedList<Alumno>();
        espanol.add(alumno1);
        espanol.add(alumno2);

        grupo3.setAlumnos(espanol);

        Maestro maestro1 = new Maestro();
        maestro1.setNombreMaestro("Darvelio");

        List<Grupo> gruposDarvelio = new LinkedList<Grupo>();
        gruposDarvelio.add(grupo3);
        gruposDarvelio.add(grupo1);

        maestro1.setGrupos(gruposDarvelio);

        List<String> nombres = new LinkedList<String>();
        for (int i = 0; i < maestro1.getGrupos().size(); i++) {
            for (int j = 0; j < maestro1.getGrupos().get(i).getAlumnos().size(); j++) {
                if (nombres.size() > 1){
                    if (!nombres.contains(maestro1.getGrupos().get(i).getAlumnos().get(j).getNombreAlumno())){
                        nombres.add(maestro1.getGrupos().get(i).getAlumnos().get(j).getNombreAlumno());
                    }
                }else{
                    nombres.add(maestro1.getGrupos().get(i).getAlumnos().get(j).getNombreAlumno());
                }
            }
        }

        nombres.stream().forEach(System.out::println);
    }
}
