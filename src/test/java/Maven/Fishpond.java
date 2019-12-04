package Maven;

import org.openqa.selenium.By;

public class Fishpond extends BaseClass {
public static void main(String[] args) throws InterruptedException {
launch("https://www.fishpond.com/logoff?done");
PojoClass1 pg=new PojoClass1();
Thread.sleep(5000);
button(pg.getSign());
write(pg.getText(),"vignesh A");
write(pg.getPasw(),"sivaamuthan");
write(pg.getSearch(),"books");
button(pg.getIcon());
Thread.sleep(4000);
button(pg.getSelect());
button(pg.getCart());
button(pg.getChck());
Thread.sleep(5000);
button(pg.getBack());
write(pg.getSearch(),"watches");
button(pg.getIcon());
button(pg.getWatch());
button(pg.getCart());
button(pg.getChck());
}
}
