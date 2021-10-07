// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/10.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#pragma once

#include <iostream>
#include <vector>

#include "Cash.h"
#include "CreditCard.h"
#include "Customer.h"
#include "Item.h"
#include "Order.h"
#include "Payment.h"

class Menu
{
private:
	vector<Customer> customerData; //save all customer informations
	vector<Item> itemData; //save all item data
	vector<Order> orderData; //save all order data
public:
	int showMainMenu(); //the main menu

	int showManagerMenu(); //the Manager menu
	void printAllOrders();  //show all orders
	void printCustomerInfoAndHis(); //Print all customer informations and purchase history"
	void managerFunction(); //Manager's function
	void allNewItem(); //Add new item 

	int showCustomerMenu(); //the Customer menu
	void customerFunction(); //customer's function
	int findIfCustomerExist(string mobileNum); //if the customer is exist
	int findIfItemDataExist(int code); //if the Item is exist
	void buyFunction(int position);
	void run(); //run the menu

	void addItem(int code, string itemName, string itemDesc, double weight, double price); //add item
	void addCustomer(string name, string mobileNum); //add customer

};

