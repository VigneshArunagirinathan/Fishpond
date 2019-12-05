package Maven;

import org.openqa.selenium.By;

public class Fishpond extends BaseClass {
public static void main(String[] args) throws Throwable {
launch("https://www.fishpond.com/logoff?done");
PojoClass1 pg=new PojoClass1();
Thread.sleep(5000);
button(pg.getSign());
BaseClass b=new BaseClass();
write(pg.getText(),getdata(0,2));
write(pg.getPasw(),getdata(1,2));
write(pg.getSearch(),getdata(2,1));
button(pg.getIcon());
Thread.sleep(4000);
button(pg.getSelect());
button(pg.getCart());
button(pg.getChck());
Thread.sleep(5000);
button(pg.getBack());
write(pg.getSearch(),BaseClass.getdata(1, 1));
button(pg.getIcon());
button(pg.getWatch());
button(pg.getCart());
button(pg.getChck());
}
}
