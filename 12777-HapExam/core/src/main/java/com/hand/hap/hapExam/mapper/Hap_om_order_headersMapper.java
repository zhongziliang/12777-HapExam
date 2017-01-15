package com.hand.hap.hapExam.mapper;

import com.hand.hap.core.IRequest;
import com.hand.hap.hapExam.dto.Hap_om_order_headers;
import net.sf.json.JSON;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface Hap_om_order_headersMapper {
    //获取简单的order的数据
    List<Hap_om_order_headers>  selectOrderSimpleMsg(Hap_om_order_headers hap_om_order_headers);
   //通过order头和order的number
    List<Hap_om_order_headers> queryOrderMsg(IRequest IRequest,List<Hap_om_order_headers> hap_om_order_headers);
    List<Hap_om_order_headers> selectById(Long headerId);
    int deleteHeaders(Long headerId);
    int insertHeaders(Hap_om_order_headers headers);
    int updateMsg(Hap_om_order_headers headers);
    int updateHeaders(Hap_om_order_headers headers);

}