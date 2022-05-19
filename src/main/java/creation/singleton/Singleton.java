package creation.singleton;

/**
 * packageName : creation.singleton
 * fileName : Singleton
 * author : jc
 * date : 2022-05-09
 * description : 공유 객체 (Singleton)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         jc          최초 생성
 */
public class Singleton {
    private static Singleton singleton = null;

    // 생성자를 다른 클래스에서 호출하지 못하게 막음
    private Singleton() {
        System.out.println("instance creation complete");
    }

    // singleton 만드는데 이미 만들어져 있으면 객체 생성하지 않음
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
