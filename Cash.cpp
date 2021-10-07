// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#include "Cash.h"

void Cash::printPaymentTerms(double amt) const
{
	cout << "Pay $"<< amt <<" in cash" << endl;
}

int Cash::getType()
{
	return 1;
}

Cash::~Cash()
{
}
