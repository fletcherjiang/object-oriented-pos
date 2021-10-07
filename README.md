# Point Of Sales (POS) Programme

A class with three attributes describing a single customer. The mobile phone number of the Customer object is used as a unique identifier to identify a single Customer. Basic mutants and detection methods should be provided in the procedure.



Payment, Cash, and CreditCard 
Payment is an abstract base class which has a pure virtual function printPaymentTerms(…).  This pure virtual function needs to be substantiated by Payment’s derived classes.  The destructor should be set as virtual since Payment is expected to be a base class of Cash and CreditCard. 
