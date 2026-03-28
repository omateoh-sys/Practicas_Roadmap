package Practicas_Roadmap;

public class Main {

    public static void main(String[] args) {
        ejercicioEnum();
        ejercicioInitializerBlock();
    }

    private static void ejercicioEnum() {
        Dias dia = Dias.LUNES;

        if (dia == Dias.SABADO || dia == Dias.DOMINGO) {
            System.out.println("Hoy " + dia + " es dia de descanso.");
        } else {
            System.out.println("Hoy " + dia + " es dia de hacer tareas.");
        }
    }

    private static void ejercicioInitializerBlock() {
        Estudiante estudiante1 = new Estudiante("Alexis",    "Mateo",     26);
        estudiante1.asignarMaterias("Fisica 1", "Progra 1", "Ingles Principiante", "Calculo 1");

        Estudiante estudiante2 = new Estudiante("Jose ",   "Roberto",    24);
        estudiante2.asignarMaterias("Espanol", "Historia", "Matematicas", "Quimica 1");

        Estudiante estudiante3 = new Estudiante("Alex",     "Velasquez", 20);
        estudiante3.asignarMaterias("Derecho", "Espanol", "Historia", "Sociales");

        Estudiante estudiante4 = new Estudiante("Veronica", "Ruano",    23);
        estudiante4.asignarMaterias("Fisica", "Programacion", "Ingles", "Estadistica");

        estudiante1.mostrar();
        estudiante2.mostrar();
        estudiante3.mostrar();
        estudiante4.mostrar();
    }
}