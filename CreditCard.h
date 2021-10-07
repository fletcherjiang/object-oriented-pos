// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#pragma once
#include <iostream>
#include "Payment.h"

using namespace std;

class CreditCard :public Payment {
private:

public:
	void printPaymentTerms(double amt) const;
	int getType();
	~CreditCard();
};
