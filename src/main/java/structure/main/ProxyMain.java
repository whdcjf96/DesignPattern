package structure.main;

import structure.proxy.Image;
import structure.proxy.ProxImage;

/**
 * packageName : structure.main
 * fileName : ProxyMain
 * author : jc
 * date : 2022-05-10
 * description : RealImage를 호출하지 않고 ProxyImage가 대신해서 displayImage() 메소드를 호출
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-10         jc          최초 생성
 */
public class ProxyMain {
    public static void main(String[] args) {
        Image image1 = new ProxImage("test1.jpg");
        Image image2 = new ProxImage("test2.jpg");

        image1.displayImage();
        image2.displayImage();
    }
}
