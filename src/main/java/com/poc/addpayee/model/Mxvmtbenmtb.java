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
@Table(name = "mxvmtbenmtb")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mxvmtbenmtb {

	public Mxvmtbenmtb() {

	}

	@Column(name = "feba_id")
	private String feba_id = "Feba_VCC";

	@Column(name = "bank_id")
	private Integer bank_id = 003;

	@Column(name = "bay_user_id")
	private String bay_user_id = "Bay_0003";

	@Column(name = "db_ts")
	private Timestamp db_ts = new Timestamp(System.currentTimeMillis());

	@Id
	@Column(name = "bene_id")
	private Integer bene_id = 100;

	@Column(name = "reg_mobile_no")
	private String reg_mobile_no = "558899665";

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
	private char is_del_flag ='N';

	@Column(name = "mod_by")
	private String mod_by = "User1";

	@Column(name = "mod_on")
	private Date mod_on = new Date(System.currentTimeMillis());

	@Column(name = "created_by")
	private String created_by = "User4";

	@Column(name = "created_on")
	private Date created_on =new Date(System.currentTimeMillis());

	@Column(name = "bene_status")
	private String bene_status = "Active";

	@Column(name = "bene_visacard_name")
	private String bene_visacard_name = "Abc";

	@Column(name = "bene_visacard_no")
	private String bene_visacard_no;

	@Column(name = "customer_id")
	private String customer_id = "2342";

	@Column(name = "bene_detl_updated_on")
	private Date bene_detl_updated_on = new Date(System.currentTimeMillis());

	@Column(name = "group_id")
	private String group_id = "NA";

	@Column(name = "channel_id")
	private String channel_id = "AOC";

	@Column(name = "device_detail")
	private String device_detail = "sd";

	@Column(name = "ip_address")
	private String ip_address ="12.21.323.23";

	@Column(name = "lang_code")
	private String lang_code= "ENG";

	@Column(name = "device_os_type")
	private String device_os_type="AND";

	@Column(name = "device")
	private String device="s4";

	@Column(name = "app_version")
	private String app_version ="25";

	@Column(name = "bene_mobile_no")
	private String bene_mobile_no = "65984111616";

	@Column(name = "bene_bank_dtl")
	private String bene_bank_dtl = "fadfasd";

	@Column(name = "cooling_period")
	private Integer cooling_period=0;

	@Column(name = "bene_payee_type")
	private String bene_payee_type= "Card";

	@Column(name = "bene_visacard_nickname")
	private String bene_visacard_nickname = "card name";

	@Column(name = "bene_vcc_deletion_on")
	private Date bene_vcc_deletion_on = new Date(System.currentTimeMillis());

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

	public char getFree_flg1() {
		return free_flg1;
	}

	public void setFree_flg1(char free_flg1) {
		this.free_flg1 = free_flg1;
	}

	public char getFree_flg2() {
		return free_flg2;
	}

	public void setFree_flg2(char free_flg2) {
		this.free_flg2 = free_flg2;
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

	public String getBene_status() {
		return bene_status;
	}

	public void setBene_status(String bene_status) {
		this.bene_status = bene_status;
	}

	public String getBene_visacard_name() {
		return bene_visacard_name;
	}

	public void setBene_visacard_name(String bene_visacard_name) {
		this.bene_visacard_name = bene_visacard_name;
	}

	public String getBene_visacard_no() {
		return bene_visacard_no;
	}

	public void setBene_visacard_no(String bene_visacard_no) {
		this.bene_visacard_no = bene_visacard_no;
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

	public String getBene_mobile_no() {
		return bene_mobile_no;
	}

	public void setBene_mobile_no(String bene_mobile_no) {
		this.bene_mobile_no = bene_mobile_no;
	}

	public String getBene_bank_dtl() {
		return bene_bank_dtl;
	}

	public void setBene_bank_dtl(String bene_bank_dtl) {
		this.bene_bank_dtl = bene_bank_dtl;
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

	public String getBene_visacard_nickname() {
		return bene_visacard_nickname;
	}

	public void setBene_visacard_nickname(String bene_visacard_nickname) {
		this.bene_visacard_nickname = bene_visacard_nickname;
	}

	public Date getBene_vcc_deletion_on() {
		return bene_vcc_deletion_on;
	}

	public void setBene_vcc_deletion_on(Date bene_vcc_deletion_on) {
		this.bene_vcc_deletion_on = bene_vcc_deletion_on;
	}

}
