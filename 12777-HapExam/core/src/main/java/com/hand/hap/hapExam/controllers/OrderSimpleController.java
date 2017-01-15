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
import java.util.*;


@Controller
@RequestMapping("/order")
public class OrderSimpleController extends BaseController {
    @Autowired
    private IOrderSimpleService iOrderSimpleService;

    public OrderSimpleController() {
    }

    @RequestMapping(value = "/queryOrderMsg" ,method = RequestMethod.POST)
    @ResponseBody
    public ResponseData query(HttpServletRequest request,@RequestBody List<Hap_om_order_headers> hap_om_order_headers,@RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize){
        IRequest iRequest = this.createRequestContext(request);
        List<Hap_om_order_headers> hap_om_order_headerss=this.iOrderSimpleService.orderQueryMsg(iRequest,hap_om_order_headers,page,pageSize);
        return  new ResponseData(hap_om_order_headerss);

    }


}
