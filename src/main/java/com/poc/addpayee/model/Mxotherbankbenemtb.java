package com.poc.addpayee.model;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "mxotherbankbenemtb")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mxotherbankbenemtb {

	public Mxotherbankbenemtb() {

	}

	@Column(name = "feba_id")
	private String feba_id = "Feba1";

	@Column(name = "bank_id")
	private Integer bank_id = 00005;

	@Column(name = "bay_user_id")
	private String bay_user_id = "Bay_1";

	@Column(name = "db_ts")
	private Timestamp db_ts = new Timestamp(System.currentTimeMillis());

	@Column(name = "corporate_id")
	private String corporate_id = "C001";

	@Id
	@Column(name = "bene_id")
	private Integer bene_id;

	@Column(name = "reg_mobile_no")
	private String reg_mobile_no = "9874563210";

	@Column(name = "free_field_1")
	private String free_field_1 = "NA";

	@Column(name = "free_field_2")
	private String free_field_2 = "NA";

	@Column(name = "free_field_3")
	private String free_field_3 = "NA";

	@Column(name = "free_flg1")
	private char free_flg1 = 'N';

	@Column(name = "free_flg2")
	private char free_flg2 = 'N';

	@Column(name = "is_del_flag")
	private char is_del_flag = 'F';

	@Column(name = "mod_by")
	private String mod_by = "User3";

	@Column(name = "mod_on")
	private Date mod_on = new Date(System.currentTimeMillis());

	@Column(name = "created_by")
	private String created_by = "User4";

	@Column(name = "created_on")
	private Date created_on = new Date(System.currentTimeMillis());

	@Column(name = "consumer_code")
	private String consumer_code = "ABB";

	@Column(name = "bene_status")
	private String bene_status = "Active";

	@Column(name = "autopay_flg")
	private char autopay_flg = 'F';

	@Column(name = "autopay_amt")
	private Integer autopay_amt = 0000;

	@Column(name = "autopay_crn")
	private String autopay_crn = "INR";

	@Column(name = "autopay_acid")
	private String autopay_acid = "NA";

	@Column(name = "autopay_brch_id")
	private String autopay_brch_id = "NA";

	@Column(name = "autopay_mode")
	private char autopay_mode = 'A';

	@Column(name = "bene_nick_name")
	private String bene_nick_name;

	@Column(name = "bene_acc_name")
	private String bene_acc_name;

	@Column(name = "bene_acc_cat")
	private String bene_acc_cat = "Savings";

	@Column(name = "bene_acc_type")
	private String bene_acc_type = "Saving";

	@Column(name = "bene_acc_currency")
	private String bene_acc_currency = "INR";

	@Column(name = "bene_acc_no")
	private String bene_acc_no;

	@Column(name = "bene_branch_id")
	private String bene_branch_id = "AXIS006";

	@Column(name = "customer_id")
	private String customer_id = "12345";

	@Column(name = "bene_detl_updated_on")
	private Date bene_detl_updated_on = new Date(System.currentTimeMillis());

	@Column(name = "group_id")
	private String group_id = "NA";

	@Column(name = "channel_id")
	private String channel_id = "AOC";

	@Column(name = "device_detail")
	private String device_detail = "IOS";

	@Column(name = "ip_address")
	private String ip_address = "192.145.63.22";

	@Column(name = "lang_code")
	private String lang_code = "ENG";

	@Column(name = "device_os_type")
	private String device_os_type = "AND";

	@Column(name = "device")
	private String device = "S4";

	@Column(name = "app_version")
	private String app_version = "4.5";

	@Column(name = "bene_ifsc_code")
	private String bene_ifsc_code = "NA";

	@Column(name = "bene_mobile_no")
	private String bene_mobile_no = "1234567890";

	@Column(name = "bene_addition_dt")
	private String bene_addition_dt = String.valueOf(new Date(System
			.currentTimeMillis()));

	@Column(name = "bene_bank_name")
	private String bene_bank_name;

	@Column(name = "bene_state_name")
	private String bene_state_name = "TN";

	@Column(name = "bene_branch_dtl")
	private String bene_branch_dtl = "NA";

	@Column(name = "cooling_period")
	private Integer cooling_period = 0;

	@Column(name = "bene_payee_type")
	private String bene_payee_type = "Saving";

	@Column(name = "bene_mmid")
	private String bene_mmid = "112";

	@Column(name = "bene_country_code")
	private String bene_country_code = "IND";

	public String getBene_addition_dt() {
		return bene_addition_dt;
	}

	public void setBene_addition_dt(String bene_addition_dt) {
		this.bene_addition_dt = bene_addition_dt;
	}

	public String getBene_bank_name() {
		return bene_bank_name;
	}

	public void setBene_bank_name(String bene_bank_name) {
		this.bene_bank_name = bene_bank_name;
	}

	public String getBene_state_name() {
		return bene_state_name;
	}

	public void setBene_state_name(String bene_state_name) {
		this.bene_state_name = bene_state_name;
	}

	public String getBene_branch_dtl() {
		return bene_branch_dtl;
	}

	public void setBene_branch_dtl(String bene_branch_dtl) {
		this.bene_branch_dtl = bene_branch_dtl;
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

	public String getBene_mmid() {
		return bene_mmid;
	}

	public void setBene_mmid(String bene_mmid) {
		this.bene_mmid = bene_mmid;
	}

	public String getBene_country_code() {
		return bene_country_code;
	}

	public void setBene_country_code(String bene_country_code) {
		this.bene_country_code = bene_country_code;
	}

	public String getFeba_id() {
		return feba_id;
	}

	public void setFeba_id(String feba_id) {
		this.feba_id = feba_id;
	}

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

	public Timestamp getDb_ts() {
		return db_ts;
	}

	public void setDb_ts(Timestamp db_ts) {
		this.db_ts = db_ts;
	}

	public String getCorporate_id() {
		return corporate_id;
	}

	public void setCorporate_id(String corporate_id) {
		this.corporate_id = corporate_id;
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

	public String getFree_field_1() {
		return free_field_1;
	}

	public void setFree_field_1(String free_field_1) {
		this.free_field_1 = free_field_1;
	}

	public String getFree_field_2() {
		return free_field_2;
	}

	public void setFree_field_2(String free_field_2) {
		this.free_field_2 = free_field_2;
	}

	public String getFree_field_3() {
		return free_field_3;
	}

	public void setFree_field_3(String free_field_3) {
		this.free_field_3 = free_field_3;
	}

	public char isFree_flg1() {
		return free_flg1;
	}

	public void setFree_flg1(char free_flg1) {
		this.free_flg1 = free_flg1;
	}

	public char isFree_flg2() {
		return free_flg2;
	}

	public void setFree_flg2(char free_flg2) {
		this.free_flg2 = free_flg2;
	}

	public char isIs_del_flag() {
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

	public char isAutopay_flg() {
		return autopay_flg;
	}

	public void setAutopay_flg(char autopay_flg) {
		this.autopay_flg = autopay_flg;
	}

	public Integer getAutopay_amt() {
		return autopay_amt;
	}

	public void setAutopay_amt(Integer autopay_amt) {
		this.autopay_amt = autopay_amt;
	}

	public String getAutopay_crn() {
		return autopay_crn;
	}

	public void setAutopay_crn(String autopay_crn) {
		this.autopay_crn = autopay_crn;
	}

	public String getAutopay_acid() {
		return autopay_acid;
	}

	public void setAutopay_acid(String autopay_acid) {
		this.autopay_acid = autopay_acid;
	}

	public String getAutopay_brch_id() {
		return autopay_brch_id;
	}

	public void setAutopay_brch_id(String autopay_brch_id) {
		this.autopay_brch_id = autopay_brch_id;
	}

	public char isAutopay_mode() {
		return autopay_mode;
	}

	public void setAutopay_mode(char autopay_mode) {
		this.autopay_mode = autopay_mode;
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

	public Date getBene_detl_updated_on() {
		return bene_detl_updated_on;
	}

	public void setBene_detl_updated_on(Date bene_detl_updated_on) {
		this.bene_detl_updated_on = bene_detl_updated_on;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}

	public String getDevice_detail() {
		return device_detail;
	}

	public void setDevice_detail(String device_detail) {
		this.device_detail = device_detail;
	}

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}

	public String getLang_code() {
		return lang_code;
	}

	public void setLang_code(String lang_code) {
		this.lang_code = lang_code;
	}

	public String getDevice_os_type() {
		return device_os_type;
	}

	public void setDevice_os_type(String device_os_type) {
		this.device_os_type = device_os_type;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getApp_version() {
		return app_version;
	}

	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}

	public String getBene_ifsc_code() {
		return bene_ifsc_code;
	}

	public void setBene_ifsc_code(String bene_ifsc_code) {
		this.bene_ifsc_code = bene_ifsc_code;
	}

	public String getBene_mobile_no() {
		return bene_mobile_no;
	}

	public void setBene_mobile_no(String bene_mobile_no) {
		this.bene_mobile_no = bene_mobile_no;
	}

}
