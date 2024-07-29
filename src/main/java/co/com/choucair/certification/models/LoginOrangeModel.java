package co.com.choucair.certification.models;

//Clase Homemodel
public class LoginOrangeModel {
    //son los objetos que representan la informacion relevante de la aplicacion
    //ej los atributos o campos que componen un formulario de registro
   //Atributos son los campos que se necesitan para llenar datos del formulario
    private String user;
    private String password;

    //Metodos para obener los valores solicitados
       //GET obtener y SET stetar o darle el valor
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getpassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    }