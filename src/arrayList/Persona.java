package arrayList;

public class Persona {

        public String nombre, apellidos;

        public Persona(String nombre, String apellidos) {
            this.nombre = nombre;
            this.apellidos = apellidos;
        }

        @Override
        public String toString() {
            return String.format("Persona: %s %s", nombre, apellidos);
        }

}
