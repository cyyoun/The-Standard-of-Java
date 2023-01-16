package LangPackage;

public class StringEx {
    public static void main(String args[]){
        int iVal = 100;
        String strVal = String.valueOf(iVal);

        double dVal = 200.0;
        String strVal2 = dVal + "";

        double sum = Integer.parseInt("+" + strVal)
                + Double.parseDouble(strVal2);
        System.out.println(sum);
    }
}
