package dietelChap14;

import java.math.BigInteger;

public class LengthOfString {
    private static final BigInteger TWO = BigInteger.valueOf(2);
    public static void main(String[] args) {
        System.out.println(stringLength("354jhgfdstyhkoliuyhtrewsdfghjiuytrgbvcnmmhgdffs1ert4"));
        System.out.println(TWO);
    }
    public static int stringLength(String string){
        return string.length();
    }
}
