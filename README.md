# Principle Of Database Management 
## Topic: E-commerce Platform For Internet Banking Transactions 

[I. Introduction ☀️](#Intro)
- [1. Background](#background)
  
  - Nowadays, selling and buying products on Internet-based platforms is becoming more
and more prevalent. This development has brought a wealth of data ready to retrieve,
access, and query. Besides that, e-commerce platforms benefit both parties that take part
in.
A. Company: The host company can manage this enormous amount of data in
a more effective way compared to traditional data management methods.
B. User/ Customer: Customers are allowed to purchase products at their own
houses with no difficulties regarding payment or shipping
- [2. Requirements](#requirements)
  
  **Users must be able to:**
- Create an account with their name, user bank name, and bank account number, and set up a password.
- Search for their required products, purchase one or more products, and check out on the payment page.
- Receive the expected time of product arrival via email and have it displayed on the order page once payment is successful.

  **Admin must be able to:**
- Create User IDs and Customer IDs.
- Add a customer to the customer list.
- Check the product list to see if the customers can purchase a product.


- [3. Goals🎯](#goal)
  - This project aims to create an e-commerce platform in which customers can purchase
one, or more products from the sellers. The result of this project can display the total of
purchased products, the date of expected delivery, and the form of payment.
- [4. Installation ](#install)
- Please kindly clone this git https://github.com/CeciliaDinh/Principle-Of-Database-Management.git to your computer and then run it as usual
  
[II. Methodology](#Method)
- Tools: SQL, Java, JDBC Connection
- I used SQL to create a database and insert into it with of course, random values
- JDBC Connection to connect my database with the user interface I built by Java

[III. ERD Design](#erd)

1. **User entity**:
   - CID (Customer ID)
   - UID (User ID)
   - Bname (Business name)
   - Baccount (Business account)
   - Phone
   - CPassWord (Customer password)
   - Address
2. **Admins entity**:
   - AID (Admin ID)
   - Aname (Admin name)
   - Email
   - PassWord (Admin password)
3. **Product1 entity**:
   - PID (Product ID)
   - Pname (Product name)
   - Price
   - Quantity
4. **OrderItems entity**:
   - Subtotal
   - Quantity
   - ItemNo
5. **Orders entity**:
   - OID (Order ID)
   - TransactionDate
   - Total
   - DeliveryFee
[IV. Normalization ](#normalization)

