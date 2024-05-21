public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;

    //construxtor de la clase perosna
    public Persona() {
        cedula = "";
        nombre = "";
        apellido = "";
        }

    public Persona(String cedula, String nombre, String apellido){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        if(cedula ==  null || cedula.length() != 10)
            this.cedula = "noValido";
        else
            this.cedula = cedula;
        /*if(cedula != null)
            if(cedula.length()==10){
                this.cedula = cedula;
            } else
                this.cedula= "noValido";
        else
            this.cedula= "noValido";*/
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if( nombre != null)
            this.nombre = nombre;
        else
            this.nombre = "";
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if( apellido != null)
            this.apellido = apellido;
        else
            this.apellido = "";
    }
    

}
