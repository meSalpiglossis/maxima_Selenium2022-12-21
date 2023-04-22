import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import pages.DragAndDropPage;



public class DragAndDropTest extends TestBaseDrop{

    @Test(timeOut = 10000)
    public void dragAndDropAtoB() {

        DragAndDropPage.moveBalltoGoal();

        assertTrue(DragAndDropPage.isAonB());
    }
}
