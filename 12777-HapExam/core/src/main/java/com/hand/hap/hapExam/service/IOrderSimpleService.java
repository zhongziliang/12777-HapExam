package com.hand.hap.hapExam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.hapExam.dto.Hap_om_order_headers;

import java.util.List;



public interface IOrderSimpleService {
    List<Hap_om_order_headers> querySimpleOrder(IRequest request,Hap_om_order_headers var2,int page,int pageSize);
    List<Hap_om_order_headers> orderQueryMsg(IRequest request,List<Hap_om_order_headers> var2,int page,int pageSize);
    List<Hap_om_order_headers> selectById(Long headerId);
    int deleteHeaders(Long headerId);
    int insertHeaders(Hap_om_order_headers headers);
    int updateHeadersMsg(IRequest requestContext,Hap_om_order_headers headers);
    int updateHeaders(Hap_om_order_headers headers);
}
