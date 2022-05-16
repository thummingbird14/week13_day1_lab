import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> walletContents;

    public Wallet(String name) {
        this.name = name;
        this.walletContents = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.walletContents.size();
    }

    public void addItem(IScan item){
        this.walletContents.add(item);
        }

}
