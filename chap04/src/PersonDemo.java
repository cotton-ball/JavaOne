public class PersonDemo { //연속 호출
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("공나연").setAge(26).show();
    }
}

class Person{
    private String name;
    private int age;

    Person setName(String name){
        this.name = name;
        return this;
    }

    Person setAge(int age){
        this.age = age;
        return this;
    }

    void show(){
        System.out.println("나는 "+age+"살인 "+name+"입니다.");
    }
}