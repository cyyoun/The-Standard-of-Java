package CollectionFramework;

import java.beans.Expression;

public class ExpValidCheck {
    public static void main(String[] args){
        if(args.length!=1){
            System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
            System.exit(0);
        }
        String expression = args[0];
        System.out.println("expression : "+expression);
    }
}
