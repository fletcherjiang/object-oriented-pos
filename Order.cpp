// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#include "Order.h"

Order::Order()
{
	customerContact = "";
	deliveryZone == 0;
	paymentMethod = nullptr;
	netPurchaseAmt = 0;
	deliveryCharge = 0;
	totalWeight = 0;
}

Order::Order(string customerContact, int deliveryZone, vector<Item> v,
	Payment* paymentMethod, double netPurchaseAmt, double deliveryCharge, double totalWeight)
	:customerContact(customerContact), deliveryZone(deliveryZone), order(v), netPurchaseAmt(netPurchaseAmt), deliveryCharge(deliveryCharge), totalWeight(totalWeight)
{
	if (paymentMethod->getType() == 1) {
		this->paymentMethod = new Cash;
	}
	else {
		this->paymentMethod = new CreditCard;
	}
	deliveryCharge = 0;
}

Order::Order(const Order& copy_order)
{
	this->customerContact = copy_order.customerContact;
	this->deliveryZone = copy_order.deliveryZone;
	this->order = copy_order.order;
	if (copy_order.paymentMethod->getType() == 1) {
		this->paymentMethod = new Cash;
	}
	else {
		this->paymentMethod = new CreditCard;
	}
	this->netPurchaseAmt = copy_order.netPurchaseAmt;
	this->deliveryCharge = copy_order.deliveryCharge;
	this->totalWeight = copy_order.totalWeight;
}

Order::~Order()
{
	if (paymentMethod != nullptr) {
		delete paymentMethod;
	}
}

void Order::PrintOrderedItem() const
{
	for (unsigned int i = 0; i < order.size(); i++) {
		order[i].printItemDetails();
	}
}

int Order::getDeliveryZone() const
{
	return deliveryZone;
}

string Order::getCustomerContact() const
{
	return customerContact;
}

vector<Item> Order::getItemList() const
{
	return order;
}

Payment* Order::getPaymentMethod() const
{
	return paymentMethod;
}

double Order::getNetPurchaseAmt() const
{
	return netPurchaseAmt;
}

double Order::getDeliveryCharge() const
{
	return deliveryCharge;
}

double Order::getTotalWeight() const
{
	return totalWeight;
}
