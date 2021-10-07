// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/1.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#include <iostream>
#include "Menu.h"

using namespace std;


int main() {
	Menu menu;
	menu.addCustomer("Mary Poon", "31411516");
	menu.addCustomer("Jimmy Yip", "61126616");
	menu.addCustomer("Sam Wong", "34151561");
	menu.addItem(1, "Lone Echo", "VR game", 320, 320);
	menu.addItem(2, "Solar Panel", "Power recharging", 2090, 1320);
	menu.addItem(3, "Power Station", "Portable power source", 4390, 6000);
	menu.addItem(4, "Oculus", "VR headest", 3130, 920);
	menu.addItem(5, "Rode desktop microphone", "PC accessory", 690, 720);
	menu.addItem(6, "Gaming keyboard", "PC accessory", 1100, 910);
	menu.addItem(7, "WIFI station", "Network equipment", 390, 520);
	menu.run();
	return 0;
}
