public class PassByValue {
    public static void main(String[] args){
        Person person = new Person();
        person.changeName("Juan");
        System.out.println("Name value" + person.getName());
        modifyPerson(person);

        //To lose the reference of a value just assign it to null or
        //Re assign it
        System.out.println("Value name modified" + person.getName());
    }

    private static void modifyPerson(Person arg) {
        arg.changeName("Alex");
    }
}
