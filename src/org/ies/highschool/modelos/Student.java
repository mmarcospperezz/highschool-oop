package org.ies.highschool.modelos;
import java.util.Objects;

    public class Student {
        private String nombre;
        private String apellidos;
        private String direccion;

        public Student(String nombre, String apellidos, String direccion) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.direccion = direccion;
        }

        public void showinfo(){
            System.out.println("Nombre:" + nombre + " Apellidos:" + apellidos + " Direccion:" + direccion);
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(nombre, student.nombre) && Objects.equals(apellidos, student.apellidos) && Objects.equals(direccion, student.direccion);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nombre, apellidos, direccion);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "nombre='" + nombre + '\'' +
                    ", apellidos='" + apellidos + '\'' +
                    ", direccion='" + direccion + '\'' +
                    '}';
        }
    }

