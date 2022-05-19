package creation.factorymethod;

/**
 * packageName : creation.factorymethod
 * fileName : IkeaFactory
 * author : jc
 * date : 2022-05-09
 * description : Ikea 공장 메소드 (object Creation)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-05-09         jc          최초 생성
 */
public class IkeaFactory {
    public Furniture order(String type){
        if(type=="bed"){
            return new BedMaker();
        }else if (type=="chair"){
            return new ChairMaker();
        }else if(type == "desk"){
            return new DeskMaker();
        }
        return null;
    }
}
