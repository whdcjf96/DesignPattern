package structure.adaptor;

/**
 * packageName : structure.adaptor
 * fileName : MallarDuck
 * author : jc
 * date : 2022-05-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         jc          최초 생성
 */
public class MallarDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("꽥꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("오리는 멀리 날 수 있음");
    }
}
