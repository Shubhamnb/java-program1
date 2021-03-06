package com.bridge.LinkedListComDataPro;

public class CompanyStock {
	public String SharePrice;
	public String StockName;
	public String StockSymbol;
	public String NoOfShare;
	

	
	
	public CompanyStock() {
	}

	public CompanyStock(String stockName, String stockSymbol, String noOFShare, String sharePrice) {
		this.StockName = stockName;
		this.StockSymbol = stockSymbol;
		this.NoOfShare = noOFShare;
		this.SharePrice = sharePrice;
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		this.StockName = stockName;
	}

	public String getStockSymbol() {
		return StockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.StockSymbol = stockSymbol;
	}

	public String getNoOFShare() {
		return NoOfShare;
	}

	public void setNoOFShare(String noOFShare) {
		this.NoOfShare = noOFShare;
	}

	public String getSharePrice() {
		return SharePrice;
	}

	public void setSharePrice(String sharePrice) {
		this.SharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "CompanyStock [stockName=" + StockName + ", stockSymbol=" + StockSymbol + ", noOFShare=" + NoOfShare
				+ ", sharePrice=" + SharePrice + "]";
	}

	
	
}
