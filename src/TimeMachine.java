public class TimeMachine {
    int backInTime(Person person){
        person.age=person.age-1;
        return person.age;
    }
    int timeTravel(Person person, int number){
        person.age=person.age+number;
        return person.age;
    }
}
