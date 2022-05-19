package structure.proxy;

/**
 * packageName : structure.proxy
 * fileName : RealImage
 * author : jc
 * date : 2022-05-10
 * description : 실제 이미지 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         jc          최초 생성
 */
public class RealImage implements Image{
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

//    구현중인 메소드
    public void loadFromDisk(String filename){
//        미완
    }

    @Override
    public void displayImage() {
        System.out.println("보여주기 : "+filename);
    }
}
