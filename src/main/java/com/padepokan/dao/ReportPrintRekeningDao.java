package com.padepokan.dao;

import com.padepokan.model.ReportPrintRekening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author agun
 */

@Repository
public interface ReportPrintRekeningDao 
        extends JpaRepository<ReportPrintRekening, Long> {
    
}
