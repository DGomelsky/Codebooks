package cz.csas.colmanbatch.csv2xml;

public class CBCOL_BankCode_List implements Comparable<CBCOL_BankCode_List> {
    private final String id;
    private final String bankName;
    private final int entryOrder;
    private final String cluid;

    CBCOL_BankCode_List(String var1, String var2, int var3, String var4) {
        this.id = var1;
        this.bankName = var2;
        this.entryOrder = var3;
        this.cluid = var4;
    }

    String getBankName() {
        return this.bankName;
    }

    String getId() {
        return this.id;
    }

    int getEntryOrder() {
        return this.entryOrder;
    }

    String getCluid() {
        return this.cluid;
    }



    public int compareTo(CBCOL_BankCode_List var1) {
        int var2 = var1.getEntryOrder();
        return this.entryOrder - var2;
    }

    public String toString() {
        return " " + this.id + " " + this.entryOrder + " " + this.bankName;
    }
}
