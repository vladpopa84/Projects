package lab4.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {

        Animal Tom = new Animal();
        Tom.setName("Tomy");
        System.out.println(Tom.getName());

        Tom.setAge(3);
        System.out.println(Tom.getAge());

        Adopter BugsBunny = new Adopter();
        BugsBunny.setName("Mickey Mouse");
        System.out.println(BugsBunny.getName());

        Food Whiskas = new Food();
        Whiskas.setName("Purina");
        System.out.println(Whiskas.getName());

        Activity Chasingmice = new Activity();
        Chasingmice.setRecreationActivity("Running");
        System.out.println(Chasingmice.getRecreationActivity());

        Vet DoctorHouse = new Vet();
        DoctorHouse.setName("Doctor Alban");
        System.out.println(DoctorHouse.getName());


    }






    }

