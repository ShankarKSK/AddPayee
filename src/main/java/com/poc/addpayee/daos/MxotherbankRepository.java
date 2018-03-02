package com.poc.addpayee.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.poc.addpayee.model.Mxotherbankbenemtb;




public interface  MxotherbankRepository extends JpaRepository<Mxotherbankbenemtb,Integer> {
	/*List<?> findById(@Param("acc_num") String acc_num );*/
}
