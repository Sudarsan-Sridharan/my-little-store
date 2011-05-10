package mx.com.juca.store.persistence.domain;

// Generated Feb 9, 2011 9:17:03 PM by Hibernate Tools 3.2.2.GA

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "ORDERS")
public class Order implements java.io.Serializable {

	private static final long serialVersionUID = -8660925066165262599L;
	private Integer idOrder;
	private Customer customer;
	private BigDecimal tax;
	private BigDecimal totalSale;
	private Date creationTs;
	private Date modificationTs;
	private Set<ProductOrder> productOrders = new HashSet<ProductOrder>(0);

	public Order() {
	}

	public Order(Customer customer, BigDecimal tax, BigDecimal totalSale) {
		this.customer = customer;
		this.tax = tax;
		this.totalSale = totalSale;
	}

	public Order(Customer customer, BigDecimal tax, BigDecimal totalSale,
			Date creationTs, Set<ProductOrder> productOrders) {
		this.customer = customer;
		this.tax = tax;
		this.totalSale = totalSale;
		this.creationTs = creationTs;
		this.productOrders = productOrders;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_order", unique = true, nullable = false)
	public Integer getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_customer", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "tax", nullable = false, precision = 6)
	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	@Column(name = "total_sale", nullable = false, precision = 6)
	public BigDecimal getTotalSale() {
		return this.totalSale;
	}

	public void setTotalSale(BigDecimal totalSale) {
		this.totalSale = totalSale;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	public Set<ProductOrder> getProductOrders() {
		return this.productOrders;
	}

	public void setProductOrders(Set<ProductOrder> productOrders) {
		this.productOrders = productOrders;
	}

	@Override
	public String toString() {
		return "Order [idOrder=" + idOrder + ", customer=" + customer
				+ ", tax=" + tax + ", totalSale=" + totalSale + ", creationTs="
				+ creationTs  + ", modificationTs="+modificationTs+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idOrder == null) ? 0 : idOrder.hashCode());
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
		Order other = (Order) obj;
		if (idOrder == null) {
			if (other.idOrder != null)
				return false;
		} else if (!idOrder.equals(other.idOrder))
			return false;
		return true;
	}

}
