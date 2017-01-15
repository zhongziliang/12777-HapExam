package com.hand.hap.hapExam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.hapExam.dto.Hap_om_order_headers;
import com.hand.hap.hapExam.mapper.Hap_om_order_headersMapper;
import com.hand.hap.hapExam.service.IOrderSimpleService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class OrderSimpleServiceImpl  implements IOrderSimpleService{
    @Autowired
    private Hap_om_order_headersMapper hap_om_order_headersMapper;

    @Override
    public List<Hap_om_order_headers> querySimpleOrder(IRequest requestContext,Hap_om_order_headers hap_om_order_headers,int page,int pageSize) {
        PageHelper.startPage(page, pageSize);
        return  this.hap_om_order_headersMapper.selectOrderSimpleMsg(hap_om_order_headers);
    }

    @Override
    public List<Hap_om_order_headers> orderQueryMsg(IRequest request, List<Hap_om_order_headers> var2, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return  this.hap_om_order_headersMapper.queryOrderMsg(request,var2);

    }

    @Override
    public List<Hap_om_order_headers> selectById(Long headerId) {
        return this.hap_om_order_headersMapper.selectById(headerId);
    }

    @Override
    public int deleteHeaders(Long headerId) {
        return this.hap_om_order_headersMapper.deleteHeaders(headerId);
    }

    @Override
    public int insertHeaders(Hap_om_order_headers headers) {
        return this.hap_om_order_headersMapper.insertHeaders(headers);
    }

    @Override
    public int updateHeadersMsg(IRequest requestContext,Hap_om_order_headers headers) {
        return this.hap_om_order_headersMapper.updateMsg(headers);
    }

    @Override
    public int updateHeaders(Hap_om_order_headers headers) {
        return this.hap_om_order_headersMapper.updateHeaders(headers);
    }
}
