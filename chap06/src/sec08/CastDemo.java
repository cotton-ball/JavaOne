package sec08;

public class CastDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Person p = new Person();
        //Student s1 = p;

        p = s; //p가 가리키는 실제 객체는 s 인데 person이 표햔할 수 있는 두가지 멤버만 볼 수 있다.
        Student s1 = (Student) p; //타입캐스팅

        System.out.println(s instanceof Person);
        System.out.println(s instanceof  Student);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student);

        downcast(s);
        downcast(p);
    }

    static void downcast(Person person){
        if(person instanceof Student){
            Student s = (Student) person;
            System.out.println(s);
        }else
            System.out.println(person);

    }
}
