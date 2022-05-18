package sec08;

public class OverTypeDemo {
    public static void main(String[] args) {
        Person p = new Student(); //실제 객체는 학생, 참조 객체는 사람
        System.out.println(p.name); //변수는 오버라이딩이 되지 않는다 -> 사람
        p.whoami(); //메서드는 오버라이딩 가능하기 때문에 student의 메서드
        p.work(); // static은 상속 안 됨 -> person
        Person.work(); //이게 더 바람직함

        System.out.println("-------------------");
        Person[] persons = {new Person(), new Student(),new ForeignStudent()};
        for(Person person: persons)
            person.whoami();
    }
}
