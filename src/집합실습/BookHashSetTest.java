package 집합실습;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BookHashSetTest {
    public static void main(String[] args) {
        Set<Book> set = new HashSet<>();

        set.add(new Book(101, "자바의 정석", "남궁성"));
        set.add(new Book(102, "클린코드", "로버트 마틴"));
        set.add(new Book(103, "운영체제", "공룡책"));
        set.add(new Book(103, "리팩터링", "마틴 파울러"));

        for (Book book : set) {
            book.showBook();
            System.out.println("----------------------------");
        }

        // 합집합 : 모든 요소가 포함 됨, 단 중복은 제거 됨
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        // set1.addAll(set2);  // 합집합
        // set1.retainAll(set2);  // 교집합 : 양쪽에 모두 존재하는 것만 남음
        set1.removeAll(set2);  // 차집합 : 앞에서 뒤를 빼서 남는 앞의 요소 출력
        System.out.println(set1);
    }

}
