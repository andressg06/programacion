package Proyecto_Ingenieria_Inversa;

//Clase Libro
public class Libro {
 private String titulo;
 private String autor;
 private boolean disponible;
 
 public Libro(String titulo, String autor) {
     this.titulo = titulo;
     this.autor = autor;
     this.disponible = true;
 }
 
 public String getTitulo() {
     return titulo;
 }
 public String getAutor() {
     return autor;
 }
 public boolean isDisponible() {
     return disponible;
 }
 public void setDisponible(boolean disponible) {
     this.disponible = disponible;
 }
}

//Clase Usuario
class Usuario {
 private String nombre;
 private String dni;
 
 public Usuario(String nombre, String dni) {
     this.nombre = nombre;
     this.dni = dni;
 }
 
 public String getNombre() {
     return nombre;
 }
 public String getDni() {
     return dni;
 }
}

//Clase Prestamo
class Prestamo {
 private Libro libro;
 private Usuario usuario;
 
 public Prestamo(Libro libro, Usuario usuario) {
     this.libro = libro;
     this.usuario = usuario;
     libro.setDisponible(false);
 }
 
 public void devolver() {
     libro.setDisponible(true);
 }
}

//Clase Principal
class Biblioteca {
 public static void main(String[] args) {
     Libro libro = new Libro("1984", "George Orwell");
     Usuario usuario = new Usuario("Ana Pérez", "12345678A");
     Prestamo prestamo = new Prestamo(libro, usuario);
     prestamo.devolver();
 }
}
