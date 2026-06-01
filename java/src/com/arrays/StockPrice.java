package com.arrays;

public class StockPrice {

	public static void main(String[] args) {

		int[] stockPrice = { 120, 125, 118, 130, 128, 135, 132 };
		int maxStock = stockPrice[0];
		int minStock = stockPrice[0];
		int totalStocks = 0;
		int count = 0;
		int temp;

		for (int i = 0; i < stockPrice.length - 1; i++) {

			for (int j = 0; j < stockPrice.length - 1; j++) {
//				count++;

				if (stockPrice[j] > maxStock) {
					maxStock = stockPrice[j];
				} else if (stockPrice[j] < minStock) {
					minStock = stockPrice[j];
				}

			}
			totalStocks += stockPrice[i];
			if (stockPrice[i] > stockPrice[i + 1]) {
				count++;
			}

		}
		System.out.println("Max Stock price : " + maxStock);
		System.out.println("Min stock Price : " + minStock);
		System.out.println("Average Stock Price " + totalStocks / stockPrice.length);
		System.out.println("Stock increased based on previous day: " + count);
	}

}
