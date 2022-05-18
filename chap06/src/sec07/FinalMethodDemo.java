package sec07;

public class FinalMethodDemo {
    public static void main(String[] args) {
        WorldChess w = new WorldChess();
        w.getFirstPlayer();
    }
}
class Chess{
    enum ChessPlayer{
        WHITE,BLACK;
    }

    final ChessPlayer getFirstPlayer(){
        return ChessPlayer.WHITE;
    }
}

class WorldChess extends Chess{

//    final ChessPlayer getFirstPlayer(){
//        return ChessPlayer.WHITE;
//   }
}