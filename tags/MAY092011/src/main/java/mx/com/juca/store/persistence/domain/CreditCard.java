package mx.com.juca.store.persistence.domain;

// Generated Feb 9, 2011 9:17:03 PM by Hibernate Tools 3.2.2.GA

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CreditCard generated by hbm2java
 */
@Entity
@Table(name = "CREDIT_CARDS")
public class CreditCard implements java.io.Serializable {

	private static final long serialVersionUID = -7694817926186778793L;
	private Integer idCreditCard;
	private Customer customer;
	private String number;
	private String securityCode;
	private String type;
	private Date expirationDate;
	private Date creationTs;
	private Date modificationTs;
	

	public CreditCard() {
	}

	public CreditCard(Customer customer, String number, String securityCode,
			String type, Date expirationDate) {
		this.customer = customer;
		this.number = number;
		this.securityCode = securityCode;
		this.type = type;
		this.expirationDate = expirationDate;
	}

	public CreditCard(Customer customer, String number, String securityCode,
			String type, Date expirationDate, Date creationTs) {
		this.customer = customer;
		this.number = number;
		this.securityCode = securityCode;
		this.type = type;
		this.expirationDate = expirationDate;
		this.creationTs = creationTs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_credit_card", unique = true, nullable = false)
	public Integer getIdCreditCard() {
		return this.idCreditCard;
	}

	public void setIdCreditCard(Integer idCreditCard) {
		this.idCreditCard = idCreditCard;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_customer", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "number", nullable = false, length = 45)
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name = "security_code", nullable = false, length = 4)
	public String getSecurityCode() {
		return this.securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	@Column(name = "type", nullable = false, length = 10)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "expiration_date", nullable = false, length = 10)
	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_ts", length = 19, updatable=false, insertable=true)
	public Date getCreationTs() {
		return this.creationTs;
	}

	public void setCreationTs(Date creationTs) {
		this.creationTs = creationTs;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modification_ts", length = 19, updatable=true, insertable=true)
	public Date getModificationTs() {
		return modificationTs;
	}

	public void setModificationTs(Date modificationTs) {
		this.modificationTs = modificationTs;
	}

	@Override
	public String toString() {
		return "CreditCard [idCreditCard=" + idCreditCard + ", customer="
				+ customer + ", number=" + number + ", securityCode="
				+ securityCode + ", type=" + type + ", expirationDate="
				+ expirationDate + ", creationTs=" + creationTs  + ", modificationTs="+modificationTs+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idCreditCard == null) ? 0 : idCreditCard.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		if (idCreditCard == null) {
			if (other.idCreditCard != null)
				return false;
		} else if (!idCreditCard.equals(other.idCreditCard))
			return false;
		return true;
	}

}
