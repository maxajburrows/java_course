package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {

        //Person person = new Person();
        //Employee employee = new Employee();
        Mother mom = new Mother();
        mom.setName("Lisa");

        System.out.println(mom.getName() + " is a " + mom.getGender());



    }
}
