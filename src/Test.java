public class Test {
    public static void main(String[] args) {
        Person person=new Person("Natalia","Doroż",26, "Kraków");
        Person person1=new Person("Grzesiek", "Doroż", 28,"Kraków");

        TimeMachine timeMachine=new TimeMachine();

        System.out.println(person.toString());

        timeMachine.backInTime(person);
        System.out.println(person.toString());

        timeMachine.timeTravel(person,5);
        System.out.println(person.toString());

        timeMachine.timeTravel(person,-20);
        System.out.println(person.toString());

        timeMachine.timeTravel(person1,10);
        System.out.println(person1.toString());

        timeMachine.backInTime(person1);
        System.out.println(person1.toString());
    }
}
