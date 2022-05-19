package structure.proxy;

/**
 * packageName : structure.proxy
 * fileName : ProxImage
 * author : jc
 * date : 2022-05-10
 * description : RealImage 클래스를 대신하는 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         jc          최초 생성
 */
public class ProxImage implements Image{
    private String fileName;
    private  Image image = null;

    @Override
    public void displayImage() {
        if(image==null){
//            현재 image 객체가 없으면 실제 RealImage 객체를 생성
            image = new RealImage(fileName);
        }
//        현재 이미지 객체가 있으면 이밎 이름 정보 출력
        image.displayImage();
    }

    public ProxImage(String fileName) {
        this.fileName = fileName;
    }
}
