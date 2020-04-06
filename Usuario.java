public class Usuario {
    private String nombre;
    private int cedula;
    private String contraseña;
    private int edad;
    private int cantidadHijos;
    private int saldo;
	
    public Usuario(){
        nombre = "";
        cedula= 0;
        contraseña = "";
        edad= 0;
        cantidadHijos = 0;
        saldo = 0;
    }
    public Usuario(String unNombre, int ci, String unaContraseña, int unaEdad, int numeroHijos, int salario){
        nombre = unNombre;
        cedula= ci;
        contraseña = unaContraseña;
        edad= unaEdad;
        cantidadHijos = numeroHijos;
        saldo = salario;
    }
    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}