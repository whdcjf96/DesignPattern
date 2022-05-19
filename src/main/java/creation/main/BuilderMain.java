package creation.main;

import creation.builder.*;

/**
 * packageName : creation.main
 * fileName : BuilderMain
 * author : jc
 * date : 2022-05-09
 * description : 빌더를 이용해 필요한것만 사용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         jc          최초 생성
 */
public class BuilderMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("intel core i7");
        Ram ram = new Ram("16GB");
        Graphics graphics = new Graphics("RTX-3090");
//        빌더를 이용해서 원하는 구성으로 컴퓨터를 조립
//        컴퓨터가 생성됨
        Builder builder = new Builder();
        Computer premiumPC = builder.setCpu(cpu)
                .setRam(ram)
                .setGraphic(graphics)
                .build();
        premiumPC.coumputerInfo();
    }
}
