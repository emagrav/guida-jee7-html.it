//package it.html.progetto1.test;
// 
//import java.util.Properties;
// 
//import javax.naming.*;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;
// 
//import it.html.progetto1.ejb30.ConverterBeanRemote;
//import junit.framework.TestCase;
// 
//public class ConverterIntegrationTestCase {
//     
//    private static Context namingContext;
//    private static ConverterBeanRemote ejb30Remote; 
//    private static final String REMOTE_JNDI_NAME="/Progetto1Ear/Progetto1Ejb/ConverterBean!it.html.progetto1.ejb30.ConverterBeanRemote";
//     
//    @BeforeClass
//    public static void obtainProxyReferences() throws NamingException{
//        Properties jndiProperties = new Properties();
//        jndiProperties.put("jboss.naming.client.ejb.context", true);
//        jndiProperties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
//        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
//        namingContext = new InitialContext(jndiProperties);
//    }
//     
//    @Test
//    public void testConverter() throws NamingException{
//        ejb30Remote = (ConverterBeanRemote)namingContext.lookup(REMOTE_JNDI_NAME);
//        TestCase.assertEquals(ejb30Remote.celsiusToFahrenheit(30.0f), 86.0f);
//        TestCase.assertEquals(ejb30Remote.fahrenheitToCelsius(86.0f), 30.0f);
//    }
//     
//    @AfterClass
//    public static void tearDownClass() throws NamingException {
//        namingContext.close();        
//    }
//}