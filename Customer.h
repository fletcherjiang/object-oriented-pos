// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#pragma once
#include<iostream>
#include<vector>
#include<string>
#include "Order.h"

using namespace std;

//Customer class
class Customer {
private:
	string mobileNum;
	string customerName;
	vector<Order> orders;
public:
	Customer(string name, string mobileNum);
	~Customer();
	const string getName();
	void setName(string name);
	const string getMobileNum();
	void setMobileNum(string mobile);
	const void printCustomerDetails();
	const void printCustomerOrder();
	vector<Order> getOrders();
	void addOrder(Order order);
};


