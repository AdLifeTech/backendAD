package adlifetech.utils;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Constants {

    public  static  final  String passwordRegex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
    public static final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
}
