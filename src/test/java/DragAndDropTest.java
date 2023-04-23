import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import pages.DragAndDropPage;



public class DragAndDropTest extends TestBaseDrop{

    @Test(timeOut = 5000)
    public void dragAndDropAtoB() {

        DragAndDropPage.moveBallToGoal();

        assertTrue(DragAndDropPage.isGoalPink());
    }
}
