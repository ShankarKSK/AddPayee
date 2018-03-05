package com.poc.addpayee.daos;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poc.addpayee.model.Mxaxisbankbenemtb;
import com.poc.addpayee.model.Mxotherbankbenemtb;




public interface MxaxisbankbenemtbRepository extends JpaRepository<Mxaxisbankbenemtb, Integer> {
	
	
	@Query(value="SELECT axis FROM Mxaxisbankbenemtb axis WHERE axis.customer_id = ?1")
	public ArrayList<Mxaxisbankbenemtb> searchRecipientCustId(String ownCust_Id);
	
	@Query(value="SELECT axis FROM Mxaxisbankbenemtb axis WHERE axis.bene_acc_no = ?1")
	public ArrayList<Mxaxisbankbenemtb> searchRecipientAccNum(String acc_num);
}
