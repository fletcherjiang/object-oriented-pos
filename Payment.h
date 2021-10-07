// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/14.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#pragma once

class Payment {
private:

public:
	virtual void printPaymentTerms(double amt) const  = 0;
	virtual int getType() = 0;
	virtual ~Payment();
};

