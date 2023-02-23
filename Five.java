import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Five
{
public static void main(String arg[])
{
String email="test01*gmail.com";

boolean isValid = isValidEmail(email);
if(isValid){
System.out.println("valid email Id");
}
else{
System.out.println("Invalid email Id");
}
}

public static boolean isValidEmail(String email[])
{
String emailRegex ;
Pattern pattern = pattern.compile(emailRegex);
Matcher matcher=pattern.matcher(email);
return matcher.matches();
}
}