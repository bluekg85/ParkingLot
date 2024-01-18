package edu.du.ict4305;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
//RegisterCarCommand "implements" the Command interface
public class RegisterCar implements Command {
    private Office office;
    public RegisterCar(Office office){this.office = office;}
    private void checkParameters(Properties properties){
        List<String> requiredProperties = Arrays.asList(
                "firstname",
                "last name",
                "phone number",
                "car type",
                "street address",
                "street address2",
                "city",
                "state",
                "zip code",
                "email");
    }

    public void execute() { office.registercar();}

}