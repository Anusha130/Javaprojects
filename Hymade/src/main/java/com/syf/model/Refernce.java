package com.syf.model;

public class Refernce {

	
	private String branch;
	private String dealer;
	private String promocode;
	private boolean isBranchdealers;
	private boolean isProgramcode;
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDealer() {
		return dealer;
	}
	public void setDealer(String dealer) {
		this.dealer = dealer;
	}
	public String getPromocode() {
		return promocode;
	}
	public void setPromocode(String promocode) {
		this.promocode = promocode;
	}
	public boolean isBranchdealers() {
		return isBranchdealers;
	}
	public void setBranchdealer(boolean isBranchdealers) {
		this.isBranchdealers = isBranchdealers;
	}
	public boolean isProgramcode() {
		return isProgramcode;
	}
	public void setProgramcode(boolean isProgramcode) {
		this.isProgramcode = isProgramcode;
	}
	public Refernce(String branch, String dealer, String promocode, boolean isBranchdealers, boolean isProgramcode) {
		super();
		this.branch = branch;
		this.dealer = dealer;
		this.promocode = promocode;
		this.isBranchdealers = isBranchdealers;
		this.isProgramcode = isProgramcode;
	}
	public Refernce() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Refernce [branch=" + branch + ", dealer=" + dealer + ", promocode=" + promocode + ", isBranchdealers="
				+ isBranchdealers + ", isProgramcode=" + isProgramcode + "]";
	}
	
}