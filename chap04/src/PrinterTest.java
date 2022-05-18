public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer(100,false);
        printer.print(70);
        System.out.println(printer.getNumOfPapers());

        Printer p = new Printer(10,false);
        p.print(2);
        p.print(20);
        p.print(10);

        Printer p2 = new Printer(20,true);
        p2.print(25);
        p2.setDuplex(false);
        p2.print(10);

    }
}

class Printer{
    private int numOfPapers;
    private boolean duplex;

    public Printer(){ this.numOfPapers=0; }

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public int getNumOfPapers() {
        return numOfPapers;
    }

    public void setNumOfPapers(int numOfPapers) {
        this.numOfPapers = numOfPapers;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public void print(int amount){
        if(numOfPapers == 0) System.out.println("용지가 없습니다.");
        else if(this.duplex == true){
            int dupCount = (amount%2)==0 ? amount/2 : amount/2+1;
            if(dupCount <= numOfPapers) {
                this.numOfPapers = this.numOfPapers - dupCount;
                System.out.println("양면으로 "+dupCount + "장 출력했습니다. 현재 " + numOfPapers + "장 남았습니다.");
            }
            else if(numOfPapers < dupCount){
                System.out.println("양면우로 모두 출력하려면 용지가 " + (dupCount-numOfPapers) +"장 부목합니다."+numOfPapers+"장만 출력합니다.");
                this.numOfPapers = 0;
            }
        }
        else{
            if(amount <= numOfPapers) {
                System.out.println("단면으로 "+amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남았습니다.");
                this.numOfPapers = this.numOfPapers - amount;
            }
            else if(numOfPapers<amount){
                System.out.println("단면으로 모두 출력하려면 용지가 " + (amount-numOfPapers) +"장 부족합니다."+numOfPapers+"장만 출력합니다.");
                this.numOfPapers = 0;
            }
        }

    }
}