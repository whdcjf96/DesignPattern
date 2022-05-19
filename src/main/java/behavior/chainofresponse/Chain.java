package behavior.chainofresponse;

/**
 * packageName : behavior.chainofresponse
 * fileName : Chain
 * author : jc
 * date : 2022-05-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         jc          최초 생성
 */
public interface Chain {
//    다음 객체로 이동
    public void setNext(Chain nextInChain);
//    조건에 따른 정확한 숫자인지 판단하는 메소드
    public void process(Number request);
}
