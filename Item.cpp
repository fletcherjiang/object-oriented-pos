// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#include "Item.h"
#include <iomanip>

Item::Item(int code, string itemName, string itemDesc, double weight, double price)
	:itemCode(code), itemName(itemName), itemDesc(itemDesc), weight(weight), price(price)
{
}

Item::~Item()
{
}

int Item::getItemCode() const
{
	return itemCode;
}

void Item::setItemCode(int code)
{
	this->itemCode = code;
}

string Item::getItemName() const
{
	return itemName;
}

void Item::setItemName(string name)
{
	this->itemName = name;
}

string Item::getItemDesc()
{
	return itemDesc;
}

void Item::setItemDesc(string itemDesc)
{
	this->itemDesc = itemDesc;
}

double Item::getItemWeight()
{
	return weight;
}

void Item::setItemWeight(double weight)
{
	this->weight = weight;
}

double Item::getItemPrice()
{
	return price;
}

void Item::setItemPrice(double price)
{
	this->price = price;
}

void Item::printItemDetails() const
{
    cout << "ID: "<< left<<setw(2)<<itemCode;
    cout << " Name: " <<left<<setw(25)<< itemName;
    cout << " Description: " <<left<<setw(23)<< itemDesc;
    cout << " Weight: " <<left<<setw(5)<< weight;
    cout << " Price: $" <<left<<setw(5)<< price << endl;
}
