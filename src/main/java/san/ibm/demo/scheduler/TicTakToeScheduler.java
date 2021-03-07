package san.ibm.demo.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import san.ibm.demo.handler.HandlerTicTakToe;

@Component
public class TicTakToeScheduler {
    Logger log = LoggerFactory.getLogger(TicTakToeScheduler.class);

    @Autowired
    private HandlerTicTakToe handler;

    @Scheduled(fixedDelay = 10000)
    public void MasterScheduler(){
        try {
            handler.processTicTakToeGame();
        }catch(Exception e){
        log.info("Exception Occurred - {}",e.getMessage());
        }
    }
}
