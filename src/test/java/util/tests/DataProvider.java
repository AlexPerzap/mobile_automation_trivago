package util.tests;


public class DataProvider extends BaseMobileTest{

    @org.testng.annotations.DataProvider
    public Object[][] getPrivacyPolicyExpectedText_Spanish(){
        Object[][] data = new Object[1][5];
        // only one row
        data[0][0] = "Privacidad de datos";
        data[0][1] = "Creemos que mereces la mejor experiencia posible cuando usas trivago.";
        data[0][2] = "Por ello, nosotros y los sitios web de nuestros socios externos compartimos y recopilamos datos, y usamos cookies y otras tecnologías para funcionamiento del sitio, seguimiento, análisis y publicidad personalizada dentro y fuera de trivago.";
        data[0][3] = "Si estás de acuerdo, confirma tu consentimiento haciendo clic en “Aceptar todo” o personaliza tus preferencias en la configuración de privacidad de tus datos.";
        data[0][4] = "Colombia";
        return data;
    }

    @org.testng.annotations.DataProvider
    public static Object[][] getDataPrivacySettingsExpectedText_Spanish() {

        Object[][] data = new Object[1][8];

        data[0][0] = "Configurar privacidad de datos";
        data[0][1] = "Tú tienes el control de tu experiencia trivago. Puedes inhabilitar determinados tipos de procesamiento de tus datos personales si utilizas el siguiente formulario.";
        data[0][2] = "AppsFlyer";
        data[0][3] = "GTM + Firebase";
        data[0][4] = "Facebook";
        data[0][5] = "Para obtener más información sobre tu derecho de oposición, consulta nuestra política de privacidad y nuestra política de cookies.";
        data[0][6] = "Guardar";
        data[0][7] = "Colombia";
        return data;
    }

    @org.testng.annotations.DataProvider
    public Object[][] getPrivacyManagementExpectedText_Spanish(){
        Object[][] data = new Object[1][3];
        // only one row
        data[0][0] = "Tú tienes el control de tu experiencia trivago. Puedes inhabilitar determinados tipos de procesamiento de tus datos personales si utilizas el siguiente formulario.";
        data[0][1] = "Para obtener más información sobre tu derecho de oposición, consulta nuestra política de privacidad y nuestra política de cookies.";
        data[0][2] = "Colombia";
        return data;
    }

}

