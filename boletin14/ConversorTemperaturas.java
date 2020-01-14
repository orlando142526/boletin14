
package boletin14;


public class ConversorTemperaturas {
    
 static final float temperaturaCelsius =80;
    
    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados>temperaturaCelsius){
        throw new TemperaturaErradaExcepcion("A temperatura non pode ser maior que "+temperaturaCelsius+"ºC");
        }
        float Fharenheit=(float) (9/5* centigrados +32.4);
        System.out.println(Fharenheit);
        return Fharenheit;
    }
    public void centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
        if (centigrados<temperaturaCelsius){
        throw new TemperaturaErradaExcepcion("A temperatura non pode ser maior que "+temperaturaCelsius+"ºC");
        }
        float Reamur=(float) (4/5 * centigrados);
        System.out.println(Reamur);
    }
}


