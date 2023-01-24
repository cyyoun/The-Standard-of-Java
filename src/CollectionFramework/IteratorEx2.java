package CollectionFramework;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args){
        ArrayList ori = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for(int i=0; i<10; i++)
            ori.add(i + "");

        Iterator it = ori.iterator();

        while (it.hasNext())
            copy1.add(it.next());

        System.out.println("= ori에서 copy1 으로 복사");
        System.out.println("ori : " + ori);
        System.out.println("copy1 : " + copy1);
        System.out.println();

        it = ori.iterator(); //Iterator는 재사용이 안되므로, 다시 얻어와야 함
        while (it.hasNext()) {
            copy2.add(it.next());
            it.remove();
        }
        System.out.println("= ori에서 copy2 으로 복사");
        System.out.println("ori : " + ori);
        System.out.println("copy2 : " + copy2);

    }
}
