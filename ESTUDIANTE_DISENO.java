package practica_estructuras;

public class ESTUDIANTE_DISENO {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String ModalidadDeEstudio;
    private int CantidadDeAsignaturasQueEstaViendo;
    private int Serial;
    
    public ESTUDIANTE_DISENO(String cedula, String nombre, String apellido, String telefono, String modalidadDeEstudio,
            int cantidadDeAsignaturasQueEstaViendo, int serial) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        ModalidadDeEstudio = modalidadDeEstudio;
        CantidadDeAsignaturasQueEstaViendo = cantidadDeAsignaturasQueEstaViendo;
        Serial = serial;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getModalidadDeEstudio() {
        return ModalidadDeEstudio;
    }

    public void setModalidadDeEstudio(String modalidadDeEstudio) {
        ModalidadDeEstudio = modalidadDeEstudio;
    }

    public int getCantidadDeAsignaturasQueEstaViendo() {
        return CantidadDeAsignaturasQueEstaViendo;
    }

    public void setCantidadDeAsignaturasQueEstaViendo(int cantidadDeAsignaturasQueEstaViendo) {
        CantidadDeAsignaturasQueEstaViendo = cantidadDeAsignaturasQueEstaViendo;
    }

    public int getSerial() {
        return Serial;
    }

    public void setSerial(int serial) {
        Serial = serial;
    }
}
