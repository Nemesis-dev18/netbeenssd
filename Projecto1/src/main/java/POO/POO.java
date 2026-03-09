package POO;

public class POO {
    private  String nombre;
    private int edad; 
    public POO (String nombre , int edad){//constructor
        this.edad = edad;
        this.nombre = nombre;
    }
    public void mostrar_persona () {
        System.out.println(" mi nombre es : "+ nombre);
        System.out.println("mi edad es : "+ edad );
        
    }
            
}
