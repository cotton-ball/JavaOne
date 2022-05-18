package sec07;

public class FinalClassDemo {
    public static void main(String[] args) {
        new Good();
        new Better();
    }
}

class Good{

}

final class Better extends Good{

}

//class Best extends Better{}