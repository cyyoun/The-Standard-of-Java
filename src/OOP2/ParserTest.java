package OOP2;

import javax.management.modelmbean.XMLParseException;

interface Parseable{
    public abstract void parse(String fileName);
}
class ParserManager{

    //리턴타입이 Parseable 인터페이스임;
    public static Parseable getParser(String type){
        if(type.equals("XML")){
            return new XMLParser();

        } else{
            Parseable p = new HTMLParser();
            return p;
        }
    }
}

class XMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName+"- XML");
    }
}

class HTMLParser implements Parseable{
    public void parse(String fileName){
        System.out.println(fileName +"- HTML");
    }
}

public class ParserTest {
    public static void main(String[] args){
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("docu.xml");
    }
}
