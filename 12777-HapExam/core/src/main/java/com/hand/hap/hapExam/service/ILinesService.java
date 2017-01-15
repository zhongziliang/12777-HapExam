package com.hand.hap.hapExam.service;

import com.hand.hap.hapExam.dto.Hap_om_order_lines;



public interface ILinesService{

    int deleteLineByHeaderId(Long id);

    int updateLine(Hap_om_order_lines lines);

}
