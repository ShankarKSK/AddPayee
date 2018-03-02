package com.poc.addpayee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "mxaxisbankbenemtb")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mxaxisbankbenemtb {

	@Column(name = "bank_id")
	private Integer bank_id = 1;
	@Column(name = "bay_user_id")
	private String bay_user_id = "abc121";
	@Id
	@Column(name = "bene_id")
	private Integer bene_id;
	@Column(name = "reg_mobile_no")
	private String reg_mobile_no;
	@Column(name = "is_del_flag")
	private char is_del_flag = 'N';
	@Column(name = "mod_by")
	private String mod_by = "User1";
	@Column(name = "mod_on")
	private Date mod_on = new Date();
	@Column(name = "created_by")
	private String created_by = "User2";
	@Column(name = "created_on")
	private Date created_on = new Date();
	@Column(name = "consumer_code")
	private String consumer_code = "SAV";
	@Column(name = "bene_status")
	private String bene_status = "Active";
	@Column(name = "bene_nick_name")
	private String bene_nick_name;
	@Column(name = "bene_acc_name")
	private String bene_acc_name;
	@Column(name = "bene_acc_cat")
	private String bene_acc_cat = "Savings";
	@Column(name = "bene_acc_type")
	private String bene_acc_type = "Savings";
	@Column(name = "bene_acc_currency")
	private String bene_acc_currency = "INR";
	@Column(name = "bene_acc_no")
	private String bene_acc_no;
	@Column(name = "bene_branch_id")
	private String bene_branch_id = "AXIS0004";
	@Column(name = "customer_id")
	private String customer_id;
	@Column(name = "channel_id")
	private String channel_id = "AOC";
	@Column(name = "ip_address")
	private String ip_address = "192.135.154.25";
	@Column(name = "bene_ifsc_code")
	private String bene_ifsc_code;
	@Column(name = "cooling_period")
	private Integer cooling_period = 2;
	@Column(name = "bene_payee_type")
	private String bene_payee_type = "Direct";

	public Integer getBank_id() {
		return bank_id;
	}

	public void setBank_id(Integer bank_id) {
		this.bank_id = bank_id;
	}

	public String getBay_user_id() {
		return bay_user_id;
	}

	public void setBay_user_id(String bay_user_id) {
		this.bay_user_id = bay_user_id;
	}

	public Integer getBene_id() {
		return bene_id;
	}

	public void setBene_id(Integer bene_id) {
		this.bene_id = bene_id;
	}

	public String getReg_mobile_no() {
		return reg_mobile_no;
	}

	public void setReg_mobile_no(String reg_mobile_no) {
		this.reg_mobile_no = reg_mobile_no;
	}

	public char getIs_del_flag() {
		return is_del_flag;
	}

	public void setIs_del_flag(char is_del_flag) {
		this.is_del_flag = is_del_flag;
	}

	public String getMod_by() {
		return mod_by;
	}

	public void setMod_by(String mod_by) {
		this.mod_by = mod_by;
	}

	public Date getMod_on() {
		return mod_on;
	}

	public void setMod_on(Date mod_on) {
		this.mod_on = mod_on;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

	public String getConsumer_code() {
		return consumer_code;
	}

	public void setConsumer_code(String consumer_code) {
		this.consumer_code = consumer_code;
	}

	public String getBene_status() {
		return bene_status;
	}

	public void setBene_status(String bene_status) {
		this.bene_status = bene_status;
	}

	public String getBene_nick_name() {
		return bene_nick_name;
	}

	public void setBene_nick_name(String bene_nick_name) {
		this.bene_nick_name = bene_nick_name;
	}

	public String getBene_acc_name() {
		return bene_acc_name;
	}

	public void setBene_acc_name(String bene_acc_name) {
		this.bene_acc_name = bene_acc_name;
	}

	public String getBene_acc_cat() {
		return bene_acc_cat;
	}

	public void setBene_acc_cat(String bene_acc_cat) {
		this.bene_acc_cat = bene_acc_cat;
	}

	public String getBene_acc_type() {
		return bene_acc_type;
	}

	public void setBene_acc_type(String bene_acc_type) {
		this.bene_acc_type = bene_acc_type;
	}

	public String getBene_acc_currency() {
		return bene_acc_currency;
	}

	public void setBene_acc_currency(String bene_acc_currency) {
		this.bene_acc_currency = bene_acc_currency;
	}

	public String getBene_acc_no() {
		return bene_acc_no;
	}

	public void setBene_acc_no(String bene_acc_no) {
		this.bene_acc_no = bene_acc_no;
	}

	public String getBene_branch_id() {
		return bene_branch_id;
	}

	public void setBene_branch_id(String bene_branch_id) {
		this.bene_branch_id = bene_branch_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getBene_ifsc_code() {
		return bene_ifsc_code;
	}

	public void setBene_ifsc_code(String bene_ifsc_code) {
		this.bene_ifsc_code = bene_ifsc_code;
	}

	public Integer getCooling_period() {
		return cooling_period;
	}

	public void setCooling_period(Integer cooling_period) {
		this.cooling_period = cooling_period;
	}

	public String getBene_payee_type() {
		return bene_payee_type;
	}

	public void setBene_payee_type(String bene_payee_type) {
		this.bene_payee_type = bene_payee_type;
	}

}
