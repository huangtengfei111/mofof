package com.mofof.entity.finance;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLDeleteAll;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;

/**
 * Created by chenerliang on 2017/8/23.
 */
@Entity
@SQLDelete(sql = "update standard_profit_loss_item_relation set del = 1 where id = ?")
@SQLDeleteAll(sql = "update standard_profit_loss_item_relation set del = 1 where id = ?")
@Where(clause = "del = 0")
public class StandardProfitLossItemRelation extends BaseStandardItemRelation<StandardProfitLossItem> {

}
