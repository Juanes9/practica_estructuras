package practica_estructuras;

class ESTUDIANTE_INGENIERIA {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private int	NumeroSemestreactualmentecursado;
    private float PromedioAcumulado;
    private String Serial;

    public ESTUDIANTE_INGENIERIA(String cedula, String nombre, String apellido, String telefono,
            int numeroSemestreactualmentecursado, float promedioAcumulado, String serial) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        NumeroSemestreactualmentecursado = numeroSemestreactualmentecursado;
        PromedioAcumulado = promedioAcumulado;
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

    public int getNumeroSemestreactualmentecursado() {
        return NumeroSemestreactualmentecursado;
    }

    public void setNumeroSemestreactualmentecursado(int numeroSemestreactualmentecursado) {
        NumeroSemestreactualmentecursado = numeroSemestreactualmentecursado;
    }

    public float getPromedioAcumulado() {
        return PromedioAcumulado;
    }

    public void setPromedioAcumulado(float promedioAcumulado) {
        PromedioAcumulado = promedioAcumulado;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }
}

