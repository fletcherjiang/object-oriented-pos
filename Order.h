// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#pragma once

#include <string>
#include <vector>
#include "Item.h"
#include "Payment.h"
#include "Cash.h"
#include "CreditCard.h"
using namespace std;

class Order {
private:
	string customerContact;
	int deliveryZone;
	vector<Item> order;
	Payment* paymentMethod;
	double netPurchaseAmt;
	double deliveryCharge;
	double totalWeight;
public:
	Order();
	Order(string customerContact, int deliveryZone, vector<Item> v,
		Payment* paymentMethod, double netPurchaseAmt, double deliveryCharge, double totalWeight);
	Order(const Order& order);
	~Order();
	void PrintOrderedItem() const;
	int getDeliveryZone() const;
	string getCustomerContact() const;
	vector<Item> getItemList() const;
	Payment* getPaymentMethod() const;
	double getNetPurchaseAmt() const;
	double getDeliveryCharge() const;
	double getTotalWeight() const;
};
