package sec04;

public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;

        if(gender == Gender.MALE)
            System.out.println(gender + "은 병역 의무가 있다");
        else
            System.out.println(gender+"은 병역 의무가 없다.");
        for(Gender g: Gender.values())
            System.out.println(g.name());

        System.out.println(Gender.valueOf("MALE"));

        String s = switch (gender){
            case MALE -> "은 병역 의무가 있다";
            case FEMALE -> "은 병역 의무가 없다";

        };

        System.out.println(gender+s);

    }
}

enum Direction{EAST,WEST,SOUTH,NORTH}
enum Gender{
    MALE("남성"), FEMALE("여성");
   private String s;

    Gender(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}

