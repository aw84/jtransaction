package pl.aw84;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private Date date;
	private BigDecimal amount;
	private BigDecimal saldoAfter;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getSaldoAfter() {
		return saldoAfter;
	}

	public void setSaldoAfter(BigDecimal saldoAfter) {
		this.saldoAfter = saldoAfter;
	}
}