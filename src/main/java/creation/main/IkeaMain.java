package creation.main;

import creation.factorymethod.IkeaFactory;

/**
 * packageName : creation.main
 * fileName : IkeaMain
 * author : jc
 * date : 2022-05-09
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         jc          최초 생성
 */
public class IkeaMain {
    public static void main(String[] args) {
        //공장 생성(객체 생성은 공장에서 함)
        IkeaFactory ikeaFactory = new IkeaFactory();

        System.out.println("order 1 : desk");
        ikeaFactory.order("desk").make(); // 책상을 만듬

        System.out.println("order 2 : chair");
        ikeaFactory.order("chair").make();

        System.out.println("research : Bed");
        ikeaFactory.order("bed").newDesign();

    }
}
