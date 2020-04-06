public class Usuario {
    private String nombre;
    private int cedula;
    private String contrase�a;
    private int edad;
    private int cantidadHijos;
    private int saldo;
	
    public Usuario(){
        nombre = "";
        cedula= 0;
        contrase�a = "";
        edad= 0;
        cantidadHijos = 0;
        saldo = 0;
    }
    public Usuario(String unNombre, int ci, String unaContrase�a, int unaEdad, int numeroHijos, int salario){
        nombre = unNombre;
        cedula= ci;
        contrase�a = unaContrase�a;
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

    public String getContrase�a() {
        return contrase�a;
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

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
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