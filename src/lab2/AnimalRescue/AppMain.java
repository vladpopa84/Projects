package lab2.AnimalRescue;

import com.sun.tools.attach.AgentInitializationException;

import java.security.spec.PSSParameterSpec;

public class AppMain {
    public static void main(String[] args) {

        Animal Tom = new Animal();
        Tom.name = "Tomy";
        System.out.println(Tom.name);

        Tom.age = 3;
        System.out.println(Tom.age);

        Adopter BugsBunny = new Adopter();
        BugsBunny.name = "Mickey Mouse";
        System.out.println(BugsBunny.name);

        Food Whiskas = new Food();
        Whiskas.name = "Purina";
        System.out.println(Whiskas.name);

        Activity Chasingmice = new Activity();
        Chasingmice.recreationActivity = "running";
        System.out.println(Chasingmice.recreationActivity);

        Vet DoctorHouse = new Vet();
        DoctorHouse.name = "Doctor Alban";
        System.out.println(DoctorHouse.name);


    }






    }

