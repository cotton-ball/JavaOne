public class SwitchDemo {
    public static void main(String[] args) {
        WhoIsIt("호랑이");
        WhoIsIt("참새");
        WhoIsIt("고등어");
        WhoIsIt("곰팡이");

    }

    static void WhoIsIt(String bio){
        String kind = "";
        switch (bio){
            
            case "호랑이":
            case "사자":
                kind = "포유류";
                break;
            case "독수리":
            case "참새":
                kind = "조류";
                break;
            case "고등어":
            case "연어":
                kind = "어류";
                break;
            default:
                System.out.print("어이쿠! ");
                kind = "...";
        }
        System.out.printf("%s는 %s 이다. \n",bio,kind);
    }
}
