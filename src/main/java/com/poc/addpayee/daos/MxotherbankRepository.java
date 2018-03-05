package com.poc.addpayee.daos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poc.addpayee.model.Mxotherbankbenemtb;






public interface  MxotherbankRepository extends JpaRepository<Mxotherbankbenemtb,Integer> {
	/*List<?> findById(@Param("acc_num") String acc_num );*/
	@Query(value="SELECT axis FROM Mxotherbankbenemtb axis WHERE axis.customer_id = ?1")
	public ArrayList<Mxotherbankbenemtb> searchRecipientCustId(String ownCust_Id);
}
