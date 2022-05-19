package creation.factorymethod;

/**
 * packageName : creation.factorymethod
 * fileName : DeskMaker
 * author : jc
 * date : 2022-05-09
 * description : Desk maker Class
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         jc          최초 생성
 */
public class DeskMaker implements Furniture{
    @Override
    public void make() {
        System.out.println("Desk Maker");
    }

    @Override
    public void newDesign() {
        System.out.println("Reasearch New Design");
    }

    public DeskMaker() {
        System.out.println("Desk Maker Wating");
    }
}
