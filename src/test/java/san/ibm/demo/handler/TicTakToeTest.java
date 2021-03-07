package san.ibm.demo.handler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TicTakToeTest {

    @Autowired
    private HandlerTicTakToe handler;

    @Test
    public void processTicTakToeGameTest(){
        handler.processTicTakToeGame();
    }


	
	
	

}
