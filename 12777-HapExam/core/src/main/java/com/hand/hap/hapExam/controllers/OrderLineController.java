package com.hand.hap.hapExam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.hapExam.dto.Hap_om_order_lines;
import com.hand.hap.hapExam.service.ILinesService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/lines")
public class OrderLineController extends BaseController {
    public OrderLineController() {
    }

    @Autowired
    private ILinesService linesService;

    @RequestMapping(value = "/lines/updateLines", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData updateLine(HttpServletRequest request, @RequestBody Hap_om_order_lines lines) {
        IRequest iRequest = createRequestContext(request);
        int sumLines  = linesService.updateLine(lines);
        if (sumLines>0){
            return new ResponseData(true);
        }else {
            return new ResponseData(false);
        }
    }

    @RequestMapping(value = "/deleteByHeaderId/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Integer deleteLineByHead(HttpServletRequest request, @PathVariable Long id) {
        Integer sum  = this.linesService.deleteLineByHeaderId(id);
        return sum;
    }

}
