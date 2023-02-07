package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();
        intStream.forEach(System.out::print); //forEach 최종연산

        //stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫히므로 재사용 시 생성 필요
        intStream = list.stream(); //list로부터 stream 생성
        intStream.forEach(System.out::print); //forEach 최종연산

    }
}
