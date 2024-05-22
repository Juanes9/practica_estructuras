package practica_estructuras;

import javax.swing.JOptionPane;
import java.util.LinkedList;

public class RegistroEstudiante {
    JOptionPane jp = new JOptionPane();

    public LinkedList<ESTUDIANTE_INGENIERIA> registroEstudiante (LinkedList<ESTUDIANTE_INGENIERIA> listaEI){
        int cantidad = Integer.parseInt(jp.showInputDialog(null, "Ingrese la cantidad de Estudiantes de Ingenieria: "));
        for (int i = 0; i < cantidad; i++) {
            ESTUDIANTE_INGENIERIA ei = new ESTUDIANTE_INGENIERIA(null, null, null, null, cantidad, i, null);
            ei.setCedula(jp.showInputDialog(null, "Ingrese la cedula: "));
            ei.setNombre(jp.showInputDialog(null, "Ingrese el nombre: "));
            ei.setApellido(jp.showInputDialog(null, "Ingrese el apellido: "));
            ei.setTelefono(jp.showInputDialog(null, "Ingrese el telefono: "));
            ei.setNumeroSemestreactualmentecursado(Integer.parseInt(jp.showInputDialog(null, "Ingrese el numero actual del semestre que esta cursando: ")));
            ei.setPromedioAcumulado(Float.parseFloat(jp.showInputDialog(null,"Ingrese el promedio acumulado: ")));
            ei.setSerial(jp.showInputDialog(null,"Ingrese el serial: "));
            listaEI.add(ei);
        }

        //String builder para el mostrado de los datos

        StringBuilder sb = new StringBuilder(); 
        for (ESTUDIANTE_INGENIERIA estudiante : listaEI) {
        sb.append("Cédula: ").append(estudiante.getCedula()).append("\n");
        sb.append("Nombre: ").append(estudiante.getNombre()).append("\n");
        sb.append("Apellido: ").append(estudiante.getApellido()).append("\n");
        sb.append("Teléfono: ").append(estudiante.getTelefono()).append("\n");
        sb.append("Semestre actual: ").append(estudiante.getNumeroSemestreactualmentecursado()).append("\n");
        sb.append("Promedio acumulado: ").append(estudiante.getPromedioAcumulado()).append("\n");
        sb.append("Serial: ").append(estudiante.getSerial()).append("\n\n");
    }

        jp.showMessageDialog(null, sb.toString(), "Datos de los estudiantes", JOptionPane.INFORMATION_MESSAGE);
        return listaEI;
    }
}
