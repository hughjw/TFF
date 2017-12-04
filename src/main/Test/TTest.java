import com.yakesoft.tff.dao.TffDao;
import com.yakesoft.tff.entity.Tffvchrpurchase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TTest {
    @Autowired
    TffDao  tffDao;
    @Test
    public void qryAll(){
           List<Tffvchrpurchase> ll =  tffDao.qryAll();
           for(Tffvchrpurchase  t : ll){
               System.out.println(t);
           }
    }
}
