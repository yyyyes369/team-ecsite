package jp.co.internous.sunflower.model.domain;

import java.sql.Timestamp;

import jp.co.internous.sunflower.model.form.UserForm;

/**
 * mst_userのドメイン
 * @author インターノウス
 *
 */
public class MstUser {

	//mst_userテーブルのカラム列の作成
	private int id;
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private int gender;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	/**
	 * コンストラクタ
	 */
	public MstUser() {}
	
	/**
	 * コンストラクタ
	 * @param f ユーザーフォーム
	 */
	public MstUser(UserForm f) {
		userName = f.getUserName();
		password = f.getPassword();
		familyName = f.getFamilyName();
		firstName = f.getFirstName();
		familyNameKana = f.getFamilyNameKana();
		firstNameKana = f.getFirstNameKana();
		gender = f.getGender();
	}


	//idの設定と取得
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	//userNameの設定と取得
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	//passwordの設定と取得
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//familyNameの設定と取得
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	//firstNameの設定と取得
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//familyNameKanaの設定と取得
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	//first_name_kanaの設定と取得
	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	//genderの設定と取得
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

	//createdAtの設定と取得
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	//updatedAtの設定と取得
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	

}
