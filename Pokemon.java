
public class Pokemon {
    // 1. ATRIBUTOS (Estado) - Encapsulamiento
    private String nombre;
    private String tipo;
    private int nivel;         
    private int puntosSalud;   

    // 2. CONSTRUCTORES (Sobrecarga)
    //
    // Constructor sin parámetros
    public Pokemon() {
        this.nombre = "Desconocido";
        this.tipo = "Normal";
        this.nivel = 1;
        this.puntosSalud = 10;
    }

    // Constructor con parámetros
    public Pokemon(String nombre, String tipo, int nivel, int puntosSalud) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
    }

    
    public void atacar() {
        System.out.println("-> " + nombre + " está lanzando un ataque.");
    }

    public void defender() {
        System.out.println("-> " + nombre + " se defiende con éxito.");
    }

    public void subirNivel() {
        this.nivel++;
        System.out.println("-> [LEVEL UP] " + nombre + " subió al nivel " + nivel);
    }

    public void descansar() {
        this.puntosSalud += 20;
        System.out.println("-> " + nombre + " recuperó salud. HP actual: " + puntosSalud);
    }

    // 4. SOBRESCRITURA toString()
    @Override
    public String toString() {
        return "Hola Yo soy Reyes Cortes Francisco Angel y mi pokemon instanciado es " + nombre + 
               ", de tipo " + tipo + ", con el identificador (Nivel: " + nivel + ")" +
               ", y puedo hacer estas cosas: atacar y defender.";
  
       }
    public String getNombre() { return nombre;
    }
}

