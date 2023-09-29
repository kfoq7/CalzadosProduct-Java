package models;

public class Empleado {

    private String codigo;
    private String nombre;
    private String apellido;
    private int estadoCivil; // CASADO - SOLTERO - DIVORCIADO - VIUDO
    private int numeroHijos;
    private float sueldo;
    private float sueldoNeto;

    public Empleado() {
    }

    public Empleado(String codigo, String nombre, String apellido, int estadoCivil, int numeroHijos, float sueldo, float sueldoNeto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.numeroHijos = numeroHijos;
        this.sueldo = sueldo;
        this.sueldoNeto = sueldoNeto;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public float getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(float sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

}
