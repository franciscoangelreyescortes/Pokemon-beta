
public class Main {
    public static void main(String[] args) {
        // Encabezado
        System.out.println("==============================================");
        System.out.println("   PRÁCTICA POO - REYES CORTES FRANCISCO ANGEL");
        System.out.println("==============================================\n");

        // INSTANCIACIÓN
        // Objeto con constructor vacío
        Pokemon poke1 = new Pokemon();
        
        // Objeto con constructor parametrizado
        Pokemon poke2 = new Pokemon("Lucario", "Lucha/Acero", 45, 150);

        // IMPRESIÓN (Llamada automática a toString)
        System.out.println(poke1);
        System.out.println(poke2);
        System.out.println();

        // EJECUCIÓN DE COMPORTAMIENTOS
        System.out.println("--- Acciones del segundo Pokémon ---");
        poke2.atacar();
        poke2.defender();
        poke2.subirNivel();
        poke2.descansar();
        
        System.out.println("\n==============================================");
    }
}
