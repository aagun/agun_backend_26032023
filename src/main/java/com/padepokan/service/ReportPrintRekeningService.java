package com.padepokan.service;

import com.padepokan.dto.DtoReportPrintRekening;
import com.padepokan.dto.DtoResponse;
import java.text.ParseException;

/**
 *
 * @author agun
 */
public interface ReportPrintRekeningService {

    DtoResponse getReport(DtoReportPrintRekening req) throws ParseException;

}
