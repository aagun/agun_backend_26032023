package com.padepokan.dao;

import com.padepokan.model.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author agun
 */
@Repository
public interface NasabahDao extends JpaRepository<Nasabah, Long> {
    
}
