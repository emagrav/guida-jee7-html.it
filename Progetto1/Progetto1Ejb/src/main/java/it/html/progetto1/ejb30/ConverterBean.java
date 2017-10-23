package it.html.progetto1.ejb30;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class ConverterBean
 */
@Stateless(name="ConverterBean", mappedName = "ConverterBean")
public class ConverterBean implements ConverterBeanRemote, ConverterBeanLocal {

    /**
     * Default constructor. 
     */
    public ConverterBean() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public float celsiusToFahrenheit(float temperature) {
		return temperature * 1.8f + 32;
    }

	@Override
    public float fahrenheitToCelsius(float temperature) {
		return (temperature - 32) / 1.8f;
    }
}
