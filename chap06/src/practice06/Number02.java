package practice06;

public class Number02 {
    public static void main(String[] args) {
        Person[] people ={new Person("길동이",22),new Student("황진이",23,100),
                new ForeignStudent("Amy",30,200,"U.S.A")};

        for(Person p: people)
            p.show();

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = null;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void show(){
        System.out.println("사람[이름 : "+name+", 나이 : "+age+"]");
    }
}

class Student extends Person{
    int number;

    public Student(String name, int age, int number) {
        super(name, age);
        this.number = number;
    }

    public Student() {
        this.name = null;
        this.age = 0;
        this.number=0;
    }

    public int getNumber() {
        return number;
    }

    void show(){
        System.out.println("학생[이름 : "+name+", 나이 : "+age+", 학번 : "+number+"]");
    }
}

class ForeignStudent extends Student{
    String nation;

    public ForeignStudent(String name, int age, int number, String nation) {
        super(name, age, number);
        this.nation = nation;
    }

    public String getNation() {
        return nation;
    }
    void show(){
        System.out.println("학생[이름 : "+name+", 나이 : "+age+", 학번 : "+number+", 국적 : "+nation+"]");
    }

}