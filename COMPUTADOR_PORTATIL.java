package practica_estructuras;

public class COMPUTADOR_PORTATIL {
    private String Serial;
    private String Marca;
    private float Tamano;
    private float Precio;
    private String SistemaOperativo; //tambien puede ser int por las opciones del menu
    private String Procesador; //tambien puede ser int por las opciones del menu
    
    public COMPUTADOR_PORTATIL(String serial, String marca, float tamano, float precio, String sistemaOperativo,
            String procesador) {
        Serial = serial;
        Marca = marca;
        Tamano = tamano;
        Precio = precio;
        SistemaOperativo = sistemaOperativo;
        Procesador = procesador;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public float getTamano() {
        return Tamano;
    }

    public void setTamano(float tamano) {
        Tamano = tamano;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }
}
