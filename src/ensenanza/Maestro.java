package ensenanza;

import java.util.LinkedList;
import java.util.List;

public class Maestro {
    String nombreMaestro;
    List<Grupo> grupos = new LinkedList<Grupo>();

    public String getNombreMaestro() {
        return nombreMaestro;
    }

    public void setNombreMaestro(String nombreMaestro) {
        this.nombreMaestro = nombreMaestro;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }
}
