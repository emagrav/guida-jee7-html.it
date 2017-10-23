package it.html.progetto1.ejb31;
 
import javax.ejb.Stateless;
 
/**
 * Session Bean implementation class ConverterBean
 */
@Stateless(name = "ConverterBean31", mappedName = "ConverterBean31")
public class ConverterBean {
 
    /**
     * Default constructor. 
     */
    public ConverterBean() {
        // TODO Auto-generated constructor stub
    }
 
    public float celsiusToFahrenheit(float temperature) {
        return temperature * 1.8f + 32;
    }
 
    public float fahrenheitToCelsius(float temperature) {
        return (temperature - 32) / 1.8f;
    }
}