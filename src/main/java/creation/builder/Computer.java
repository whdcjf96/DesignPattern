package creation.builder;

/**
 * packageName : creation.builder
 * fileName : Computer
 * author : jc
 * date : 2022-05-09
 * description : 부품(cpu,ram,graphics) 조립할 컴퓨터 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         jc          최초 생성
 */
public class Computer {
    private Cpu cpu;
    private Ram ram;
    private Graphics graphics;

//    기본 생성자
    public Computer() {
    }
//    매개변수 3개 생성자
    public Computer(Cpu cpu, Ram ram, Graphics graphics) {
        this.cpu = cpu;
        this.ram = ram;
        this.graphics = graphics;
    }
//    컴퓨터 부품 정보 출력 메소드
    public void coumputerInfo(){
        String cpuInfo = (cpu == null ? "cpu없음" : cpu.getInfo());
        String ramInfo = (ram == null ? "ram없음" : ram.getInfo());
        String graphicsInfo = (graphics == null ? "내장형그래픽" : graphics.getInfo());

//        화면 출력
        System.out.println("컴퓨터 정보 출력 : "+ "cpu: "+cpuInfo+"ram: "+ramInfo+"graphics : "+graphicsInfo);

    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
}
