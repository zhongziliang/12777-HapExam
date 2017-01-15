package com.hand.hap.hapExam.service.impl;

import com.hand.hap.hapExam.dto.Hap_om_order_lines;
import com.hand.hap.hapExam.mapper.Hap_om_order_linesMapper;
import com.hand.hap.hapExam.service.ILinesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class LineServiceImpl  implements ILinesService {
    @Resource
    private Hap_om_order_linesMapper hap_om_order_linesMapper;



    @Override
    public int deleteLineByHeaderId(Long id) {
        return this.hap_om_order_linesMapper.deleteLineByHeaderId(id);
    }

    @Override
    public int updateLine(Hap_om_order_lines lines) {
        return this.hap_om_order_linesMapper.updateLine(lines);
    }
}
