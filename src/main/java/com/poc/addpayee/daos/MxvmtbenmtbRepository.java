package com.poc.addpayee.daos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poc.addpayee.model.Mxotherbankbenemtb;
import com.poc.addpayee.model.Mxvmtbenmtb;



public interface MxvmtbenmtbRepository extends JpaRepository<Mxvmtbenmtb,Integer> {
	@Query(value="SELECT axis FROM Mxvmtbenmtb axis WHERE axis.customer_id = ?1")
	public ArrayList<Mxvmtbenmtb> searchRecipientCustId(String ownCust_Id);

}
