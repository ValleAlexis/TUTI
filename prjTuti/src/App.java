public class App {
    public static void main(String[] args) throws Exception {
        Persona oP = new Persona();
        Persona oP2 = new Persona(null,null,null);
        //Supervisor oS = new Supervisor();

        oP.setNombre("Pepe");
        oP.setCedula("12345671");
        oP.setApellido("Lopez");

        System.out.println(oP.getApellido().toUpperCase());
        System.out.println(oP.getCedula());
        System.out.println(oP.getNombre());

        System.out.println();
        
        System.out.println(oP2.getApellido());
        System.out.println(oP2.getCedula());
        System.out.println(oP2.getNombre());
    }
}
