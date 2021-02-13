package util.tests;

//import org.testng.annotations.*;

public class DataProvider extends BaseMobileTest{

    @org.testng.annotations.DataProvider
    public Object[][] getPrivacyPolicyExpectedText(){
        Object[][] data = new Object[1][4];
        // only one row
        data[0][0] = "Privacidad de datos";
        data[0][1] = "Creemos que mereces la mejor experiencia posible cuando usas trivago.";
        data[0][2] = "Por ello, nosotros y los sitios web de nuestros socios externos compartimos y recopilamos datos, y usamos cookies y otras tecnologías para funcionamiento del sitio, seguimiento, análisis y publicidad personalizada dentro y fuera de trivago.";
        data[0][3] = "Si estás de acuerdo, confirma tu consentimiento haciendo clic en “Aceptar todo” o personaliza tus preferencias en la configuración de privacidad de tus datos.";
        return data;
    }

    @org.testng.annotations.DataProvider
    public Object[][] getDataForHotelSearchTest(){
        Object[][] data = new Object[1][2];
        // only one row
        data[0][0] = "Cartagena";
        data[0][1] = "1 de nov. - 5 de nov.";
        return data;
    }

}

