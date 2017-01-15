package com.hand.hap.hapExam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.hapExam.dto.Hap_om_order_headers;
import com.hand.hap.hapExam.service.IOrderSimpleService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.Console;
import java.text.ParseException;
import java.util.List;


@Controller
@RequestMapping("/order")
public class OrderMsgQueryController extends BaseController {
    @Autowired
    private IOrderSimpleService iOrderSimpleService;

    public OrderMsgQueryController() {

    }

    @RequestMapping(value ="/querySimpleOrder" ,method = RequestMethod.POST)
    @ResponseBody
    public ResponseData query(HttpServletRequest request, @RequestBody Hap_om_order_headers hap_om_order_headers){
        IRequest iRequest = this.createRequestContext(request);
        return  new ResponseData(this.iOrderSimpleService.querySimpleOrder(iRequest,hap_om_order_headers,hap_om_order_headers.getPage(),hap_om_order_headers.getPagesize()));
    }

    @RequestMapping(value = "/query/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData findById(HttpServletRequest request, @PathVariable Long id) {
        IRequest iRequest = createRequestContext(request);
        List<Hap_om_order_headers> headersList  = this.iOrderSimpleService.selectById(id);
        return new ResponseData(headersList);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteHeader(HttpServletRequest request, @PathVariable Long id) {
        IRequest iRequest = createRequestContext(request);
        Integer sum  = this.iOrderSimpleService.deleteHeaders(id);
        return sum;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Integer insertHeader(HttpServletRequest request, @RequestBody Hap_om_order_headers headers) throws ParseException {
        IRequest iRequest = createRequestContext(request);
        int sumHeaders  = this.iOrderSimpleService.insertHeaders(headers);
        return sumHeaders;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Integer updateHeader(HttpServletRequest request, @RequestBody Hap_om_order_headers headers) throws ParseException {
        IRequest iRequest = createRequestContext(request);
        int sumHeaders  = this.iOrderSimpleService.updateHeaders(headers);
        return sumHeaders;
    }

    @RequestMapping(value = "/updateMsg",method = RequestMethod.POST)
    @ResponseBody
    public Integer updateMsg(HttpServletRequest request, @RequestBody Hap_om_order_headers headers) throws ParseException{
        IRequest iRequest = createRequestContext(request);
        int res=this.iOrderSimpleService.updateHeadersMsg(iRequest,headers);
        return res;
    }

}
