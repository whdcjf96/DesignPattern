package structure.adaptor;

/**
 * packageName : structure.adaptor
 * fileName : TurkeyAdaptor
 * author : jc
 * date : 2022-05-10
 * description : 오리를 통해서 칠면조의 기능을 사용하고 싶을 때
 *               어뎁터를 사용함
 *               껍데기 : 오리
 *               알멩이 : 칠면조
 *               클라이언트는 무조건 오리의 메소드이름만 사용해야함(변경불가)
 *               어뎁터를 통해 칠면조의 기능을 사용할 수 있음
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         jc          최초 생성
 */
public class TurkeyAdaptor implements Duck{
//    칠면조를 사용
    Turkey turkey;

//    오리 메소드
//    칠면조 메소드 호출
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0; i<5; i++){
            turkey.fly();
        }
    }

    //    생성자 매개변수1개 (DI(Dependancy Injection) : 의존성 주입(매개변수로 전달))
    public TurkeyAdaptor(Turkey turkey) {
        this.turkey = turkey;
    }
}
