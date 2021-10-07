// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#pragma once
#include <string>
#include <iostream>

using namespace std;

class Item {
private:
	int itemCode;
	string itemName;
	string itemDesc;
	double weight;
	double price;
public:
	Item(int code, string itemName, string itemDesc, double weight, double price);
	~Item();
	int getItemCode() const;
	void setItemCode(int code);
	string getItemName() const;
	void setItemName(string name);
	string getItemDesc();
	void setItemDesc(string itemDesc);
	double getItemWeight();
	void setItemWeight(double weight);
	double getItemPrice();
	void setItemPrice(double price);
	void printItemDetails() const;
};

