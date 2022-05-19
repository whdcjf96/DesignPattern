package structure.main;

import structure.adaptor.Turkey;
import structure.adaptor.TurkeyAdaptor;
import structure.adaptor.WildTurkey;

/**
 * packageName : structure.main
 * fileName : AdaptorMain
 * author : jc
 * date : 2022-05-10
 * description : 칠면조 어뎁터 테스트
 * 테스트케이스 1 : 오리메소드를 호출하면 칠면조 소리가 나는가?
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         jc          최초 생성
 */
public class AdaptorMain {
    public static void main(String[] args) {
//        칠면조 객체 생성
//        다형성 : 느슨한 결합
//        부모 Turkey 인터페이스, 클래스 = new 생성자(자식)
//        비교) 단형성 :
//        부모 클래스 = new 부모 생성자()
//        자식 클래스 = new 자식 생성자()
        Turkey turkey = new WildTurkey();

//        칠면조 어댑터 만들기 :
//        why? 오리 메소드를 통해 칠면조 소리를 내게하기 위해서
        TurkeyAdaptor turkeyAdaptor = new TurkeyAdaptor(turkey);
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
    }

}
