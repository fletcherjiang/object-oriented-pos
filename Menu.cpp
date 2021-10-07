// JIANG Yiyang(70001118)
// Created by Fletcher JIANG on 2021/4/10.
// Copyright © 2021 Fletcher JIANG. All rights reserved.
#include "Menu.h"

int Menu::showMainMenu()
{
    //use a char data to save the choose information
    char choose;
    cout << "Welcome to POS system!" << endl;
    cout << "Please choose your identity." << endl;
    cout << "* * * * * * * * * * * * * *" << endl;
    cout << "*                         *" << endl;
    cout << "*      1.Manager          *" << endl;
    cout << "*      2.Customer         *" << endl;
    cout << "*      0.Quit             *"<< endl;
    cout << "*                         *" << endl;
    cout << "* * * * * * * * * * * * * *" << endl;
    cin >> choose;
    //sue swicth to get choice,and if get a wrong choose will return -1
    switch (choose) {
    case '1': {
        return 1;
    }
    case '2': {
        return 2;
    }
    case '0': {
        return 0;
    }
    default: {
        return -1;
    }
    }
}

int Menu::showManagerMenu()
{
    //use a char data to save the choose information
    char choose;
    cout << "Hello! Manager!" << endl;
    cout << "Please choose the function you want" << endl;
    cout << "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" << endl;
    cout << "*                                                         *" << endl;
    cout << "*  1.Print all orders                                     *" << endl;
    cout << "*  2.Print all customer informations and purchase history *" << endl;
    cout << "*  3.Add new item                                         *" << endl;
    cout << "*  0.Quit                                                 *" << endl;
    cout << "*                                                         *" << endl;
    cout << "* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" << endl;
    cin >> choose;
    //sue swicth to get choice,and if get a wrong choose will return -1
    switch (choose) {
    case '1': {
        return 1;
    }
    case '2': {
        return 2;
    }
    case '3': {
        return 3;
    }
    case '0': {
        return 0;
    }
    default: {
        return -1;
    }
    }
}

void Menu::printAllOrders()
{
    int all_income = 0;
    cout << "*****************************************************" << endl;
    for (unsigned int i = 0; i < orderData.size(); i++) {
        cout << "Order number " << i + 1 << ":" << endl;
        orderData[i].PrintOrderedItem();
        double mid_data = orderData[i].getNetPurchaseAmt() + orderData[i].getDeliveryCharge();
        all_income += mid_data;
    }
    cout << "All income: $" << all_income << endl;
    cout << "*****************************************************" << endl;
}

void Menu::printCustomerInfoAndHis()

{   cout << "All Customers information:" << endl;
    cout << "**********************************************************" << endl;
    for (unsigned int i = 0; i < customerData.size(); i++) {
        cout << endl;
        customerData[i].printCustomerDetails();
        cout << "Orders history:" << endl;
        customerData[i].printCustomerOrder();
    }
    cout << "**********************************************************" << endl;
}

void Menu::managerFunction()
{
    while (1) {
        //show meun and get the choice
        int choose_1 = showManagerMenu();
        //use a switch
        switch (choose_1) {
        //Print all orders 
        case 1: {
            printAllOrders();
            break;
        }
        //Print all customer informations and purchase history
        case 2: {
            printCustomerInfoAndHis();
            break;
        }
        //Add new item 
        case 3: {
            allNewItem();
            break;
        }
        //Quit
        case 0: {

            break;
        }
        case -1: {
            cout << "Pleass input the right choose" << endl;
            break;
        }
        }
        //break the function
        if (choose_1 == 0) {
            break;
        }
    }
}

void Menu::allNewItem()
{
    int itemCode;
    string itemName;
    string itemDesc;
    double weight;
    double price;
    cout << "Please input item code: ";
    cin >> itemCode;
    if (findIfItemDataExist(itemCode) != -1) {
        cout << "add fail the item code is exist" << endl;
        return;
    }
    cout << "Please input item name: ";
    cin >> itemName;
    cout << "Please input item description: ";
    cin >> itemDesc;
    cout << "Please input item weight: ";
    cin >> weight;
    cout << "Please input item price: ";
    cin >> price;
    itemData.push_back(Item(itemCode, itemName, itemDesc, weight, price));
}

int Menu::showCustomerMenu()
{
    //use a char data to save the choose information
    char choose;
    cout << "Customer" << endl;
    cout << "Please log in or register" << endl;
    cout << "* * * * * * * * * * * * * *" << endl;
    cout << "*                         *" << endl;
    cout << "*        1.Sign in        *" << endl;
    cout << "*        2.Log in         *" << endl;
    cout << "*        0.Quit           *" << endl;
    cout << "*                         *" << endl;
    cout << "* * * * * * * * * * * * * *" << endl;
    cin >> choose;
    //sue swicth to get choice,and if get a wrong choose will return -1
    switch (choose) {
    case '1': {

        return 1;
    }
    case '2': {

        return 2;
    }
    case '0': {

        return 0;
    }
    default: {
        return -1;
    }
    }
}

void Menu::customerFunction()
{
    while (1) {
        //show meun and get the choice
        int choose_1 = showCustomerMenu();
        //use a switch
        switch (choose_1) {
         //sign in
        case 1: {
            string name;
            string mobileNum;
            cout << "Please input customer mobile number: ";
            cin >> mobileNum;
            if (findIfCustomerExist(mobileNum) != -1) {
                cout << "Sign in fail, the customer is exist" << endl;
                break;
            }
            cout << "Please input customer name: ";
            cin >> name;
            customerData.push_back(Customer(name, mobileNum));
            cout << "Sign in successful" << endl;
            break;
        }
        //log in
        case 2: {
            string mobileNum;
            cout << "Please input customer mobile num: ";
            cin >> mobileNum;
            int position = findIfCustomerExist(mobileNum);
            if (position == -1) {
                cout << "Log in fail, the customer is not exist" << endl;
                break;
            }
            buyFunction(position);
            break;
        }
        //Quit
        case 0: {

            break;
        }
        case -1: {
            cout << "Pleass input the right choose" << endl;
            break;
        }
        }
        //break the function
        if (choose_1 == 0) {
            break;
        }
    }
}

int Menu::findIfCustomerExist(string mobileNum)
{
    for (int i = 0; i < customerData.size(); i++) {
        if (customerData[i].getMobileNum() == mobileNum) {
            return i;
        }
    }
    return -1;
}

int Menu::findIfItemDataExist(int code)
{
    for (int i = 0; i < itemData.size(); i++) {
        if (itemData[i].getItemCode() == code) {
            return i;
        }
    }
    return -1;
}

void Menu::buyFunction(int position)
{
    vector<int> allItems;
    while (1) {
        cout << "All items" << endl;
        for (unsigned int i = 0; i < itemData.size(); i++) {
            itemData[i].printItemDetails();
        }
        int choice;
        cout << "Please add item to your shopping trolley by item code(enter -1 to next step):";
        cin >> choice;
        cout<<endl;
        if (choice == -1) {
            break;
        }
        if (findIfItemDataExist(choice) == -1) {
            cout << "Choose fail, the item code is not exist" << endl;
            continue;
        }
        else {
            allItems.push_back(choice);
        }
    }
    cout << "******************************************************************************" << endl;
    
    while (1) {
        cout << "List:" << endl;
        for (unsigned int i = 0; i < allItems.size(); i++) {
            int item_position = findIfItemDataExist(allItems[i]);
            itemData[item_position].printItemDetails();
        }
        cout << "Please choose item that you want to delete(-1 to the next purchase): ";
        int code;
        cin >> code;
        if (code == -1) {
            break;
        }
        bool  flag = false;
        for (unsigned int i = 0; i < allItems.size(); i++) {
            if (allItems[i] == code) {
                flag = true;
                allItems.erase(allItems.begin() + i);
            }
        }
        if (flag == false) {
            cout << "Please input right code" << endl;
        }
    }
    cout << "*****************************************************" << endl;
    cout << "Please choose payment method"<<endl;
    cout << "[0]:Cash;"<<endl;
    cout << "[Other numbers]:Credit card: ";
    int payment_method;
    cin >> payment_method;
    Payment* payment;
    if (payment_method == 0) {
        payment = new Cash;
    }
    else {
        payment = new CreditCard;
    }
    cout << "*****************************************************" << endl;
    cout << "Please choose delivery area"<<endl;
    cout << "[1]:Local"<<endl;
    cout << "[2]:Asian-Pacific"<<endl;
    cout << "[Other numbers]:International:  ";
    int delivery_area;
    cin >> delivery_area;
    if ((delivery_area != 1)&&(delivery_area != 2)) {
        delivery_area = 3;
    }
    double totalPurchase = 0;
    double deliveryCharge = 0;
    double netPurchaseAmt = 0;
    double totalWeight = 0;
    cout << "*****************************************************" << endl;
    cout << "Total Purchase Information:" << endl;
    vector<Item> allitem;
    for (unsigned int i = 0; i < allItems.size(); i++) {
        int item_position = findIfItemDataExist(allItems[i]);
        double purchase = itemData[item_position].getItemPrice();
        netPurchaseAmt += purchase;
        totalWeight += itemData[item_position].getItemWeight();
        itemData[item_position].printItemDetails();
        allitem.push_back(itemData[item_position]);
    }
    deliveryCharge = 50 * (double)delivery_area + (totalWeight / 1000) * 10 * delivery_area;
    cout << "Delivery charge: $" << deliveryCharge << endl;
    totalPurchase = deliveryCharge + netPurchaseAmt;
    cout << "NetPurchaseAmt: $" << netPurchaseAmt << endl;
    cout << "TotalPurchase: $" << totalPurchase << endl;
    payment->printPaymentTerms(totalPurchase);
    Order order(customerData[position].getMobileNum(), delivery_area, allitem, payment, 
         netPurchaseAmt, deliveryCharge, totalWeight);
    orderData.push_back(order);
    customerData[position].addOrder(order);
    cout << "*****************************************************" << endl;
    delete payment;
}

void Menu::run()
{
    while (1) {
        //show meun and get the choice
        int choose = showMainMenu();
        //use a switch
        switch (choose) {
        //Manager 
        case 1: {
            cout << "Please input manager password:";
            string password;
            cin >> password;
            if (password == "admin") {
                managerFunction();
            }
            else {
                cout << "Password is incorrect" << endl;
            }
            break;
        }
        //Customer 
        case 2: {
            customerFunction();
            break;
        }
         //Quit
        case 0: {

            break;
        }
        case -1: {
            cout << "Pleass input the correct number of what you choose" << endl;
            break;
        }
        }
        //break the run function
        if (choose == 0) {
            break;
        }
    }
}

void Menu::addItem(int code, string itemName, string itemDesc, double weight, double price)
{
    itemData.push_back(Item(code, itemName, itemDesc, weight, price));
}

void Menu::addCustomer(string name, string mobileNum)
{
    customerData.push_back(Customer(name, mobileNum));
}
