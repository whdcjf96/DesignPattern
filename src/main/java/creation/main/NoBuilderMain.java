package creation.main;

import creation.builder.Computer;
import creation.builder.Cpu;
import creation.builder.Graphics;
import creation.builder.Ram;

/**
 * packageName : creation.main
 * fileName : NoBuilderMain
 * author : jc
 * date : 2022-05-09
 * description : 기본 생성자와 매개변수 생성자를 이용해 값 초기화
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         jc          최초 생성
 */
public class NoBuilderMain {
    public static void main(String[] args) {
//        프리미엄 컴퓨터
        Cpu cpu=new Cpu("intel core i7");
        Ram ram=new Ram("16GB");
        Graphics graphic=new Graphics("rtx3090");

        Computer premiumPC = new Computer(cpu,ram,graphic);

        premiumPC.coumputerInfo();

        Cpu cpu2=new Cpu("intel core i7");
        Ram ram2=new Ram("8GB");
        Graphics graphic2=new Graphics("rtx3060");

        System.out.println("저가형");
        Computer middlePC = new Computer(cpu2,null,graphic2);

        middlePC.coumputerInfo();

        System.out.println("초저가형");
        Computer rowPC = new Computer(cpu2,null,null);
        rowPC.coumputerInfo();
    }
}
