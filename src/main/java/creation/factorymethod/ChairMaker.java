package creation.factorymethod;

/**
 * packageName : creation.factorymethod
 * fileName : ChairMaker
 * author : jc
 * date : 2022-05-09
 * description : 의자 생성
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         jc          최초 생성
 */
public class ChairMaker implements Furniture{
    public ChairMaker() {
        System.out.println("Chair Make Waiting");
    }

    @Override
    public void make() {
        System.out.println("Chair Make");
    }

    @Override
    public void newDesign() {
        System.out.println("Research new chair");
    }
}
