package com.hand.hap.hapExam.mapper;

import com.hand.hap.hapExam.dto.Hap_om_order_lines;

public interface Hap_om_order_linesMapper {
    int insertLines(Hap_om_order_lines lines);

    int deleteLineByLineId(Long id);

    int deleteLineByHeaderId(Long id);

    int updateLine(Hap_om_order_lines lines);

}