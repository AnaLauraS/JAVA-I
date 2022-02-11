public abstract class Habilidad {
        private String nombre;
        private String descripcion;

        // constructores
        public Habilidad(String nombre, String descripcion) {
            this.nombre = nombre;
            this.descripcion = descripcion;
        }
        public Habilidad() {
        }

        // getters and setters
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getDescripcion() {
            return descripcion;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        // método que debe definir como aplicar cada clase
        public abstract double calcularPuntaje();
    }
