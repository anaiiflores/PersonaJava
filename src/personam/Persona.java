/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personam;

/**
 *
 * @author 34633
 */
public abstract class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private final String sexo = "H";
    private float peso;
    private float altura;

    
    //Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public Persona(String nombre, int edad, String dni, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    
    
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //metodos
   
    
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + 
                edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" 
                + peso + ", altura=" + altura + '}';
    }
    
    public String esMayorDeEdad(){
        if (edad >= 18){
            return "Es Mayor de edad";
        }else {
            return "No es mayor de edad";
        }
    }
    public abstract char comprobarSexo(char sexo);
    /*
    Podriamos utilizar 
    */
    
    
    
    
    
}
