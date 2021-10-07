// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#include "Customer.h"

Customer::Customer(string name, string mobileNum)
	:mobileNum(mobileNum), customerName(name)
{
}

Customer::~Customer()
{
}

const string Customer::getName()
{
	return customerName;
}

void Customer::setName(string name)
{
	this->customerName = name;
}

const string Customer::getMobileNum()
{
	return mobileNum;
}

void Customer::setMobileNum(string mobile)
{
	this->mobileNum = mobile;
}

const void Customer::printCustomerDetails()
{
	cout << "Customer name: " << customerName << endl;
	cout << "Mobile number: " << mobileNum << endl;
}

const void Customer::printCustomerOrder()
{
    if(orders.size()<1){
    cout<<"No purchase history found"<<endl;
    };
    
	for (unsigned int i = 0; i < orders.size(); i++) {
		
		orders[i].PrintOrderedItem();
		
	}
}

vector<Order> Customer::getOrders()
{
	return orders;
}

void Customer::addOrder(Order order)
{
	orders.push_back(order);
}
