package com.yakesoft.tff.dao;

import com.yakesoft.tff.entity.Tffvchrpurchase;

import java.util.List;

public interface TffDao {
    /**
     * 查詢
     * @return
     */
    List<Tffvchrpurchase>  qryAll();
}
