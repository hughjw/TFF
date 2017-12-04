package com.yakesoft.tff.service.TFFServiceImpl;
import com.yakesoft.tff.dao.TffDao;
import com.yakesoft.tff.entity.Tffvchrpurchase;
import com.yakesoft.tff.service.TFFService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TFFServiceimpl  implements TFFService {
    private TffDao  tffDao;
    public List<Tffvchrpurchase> qryAll() {
        return tffDao.qryAll();
    }
}
