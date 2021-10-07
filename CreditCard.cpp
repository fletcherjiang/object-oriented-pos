// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#include "CreditCard.h"

void CreditCard::printPaymentTerms(double amt) const
{
	cout << "Pay $" << amt << " in credit card" << endl;
}

int CreditCard::getType()
{
	return 2;
}

CreditCard::~CreditCard()
{
}
