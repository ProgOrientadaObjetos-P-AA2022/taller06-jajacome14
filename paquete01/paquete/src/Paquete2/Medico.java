
package Paquete2;

public class Medico {
        private String []nombreDoc;
        private String []especialidadDoc;
        private double []sueldoMensual;

    public Medico(String []a, String []b, double []c) {
        nombreDoc = a;
        especialidadDoc = b;
        sueldoMensual = c;
    }

        
    public void establecerNombreDoc(String []a) {
        nombreDoc = a;
    }

    public void establecerEspecialidadDoc(String []a) {
        especialidadDoc = a;
    }

    public void establecerSueldoMensual(double []a) {
        sueldoMensual = a;
    }

    public String []obtenerNombreDoc() {
        return nombreDoc;
    }

    public String [] obtenerEspecialidadDoc() {
        return especialidadDoc;
    }

    public double []obtenerSueldoMensual() {
        return sueldoMensual;
    }
        
        
    
}
