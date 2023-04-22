import org.testng.annotations.Test;

import static helpers.WebBrowser.webBrowser;
import static org.testng.Assert.assertTrue;

import pages.DragAndDropPage;
import pages.MainPage;


public class DragAndDropTest extends TestBaseDrop{

    @Test(timeOut = 10000)
    public void dragAndDropAtoB() {

        DragAndDropPage.moveBalltoGoal();

        assertTrue(DragAndDropPage.isAonB());
    }
}
