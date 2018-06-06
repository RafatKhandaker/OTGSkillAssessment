
/* Write a SQL Query that returns the following information	*/


 
# a) The total number of orders made by each customer 


SELECT C.name, COUNT(O.id) AS 'Total Orders'
FROM Orders As O 
JOIN Customers AS C ON (C.id = O.customer_id)
GROUP BY C.name

# b) List of Customers with 3 or more orders

SELECT C.name, COUNT(O.id) AS 'Total Orders'
FROM Orders As O 
JOIN Customers AS C ON (C.id = O.customer_id)
HAVING COUNT(O.id) > 3
GROUP BY C.name

# c) List of all customers who have ordered the item "test item"

SELECT Distinct C.name
FROM Orders As O 
JOIN Customers AS C ON (C.id = O.customer_id)
WHERE O.item_name = 'test item'


# d) List of all customers who have ordered the item "test item"

SELECT Distinct C.name
FROM Orders As O 
JOIN Customers AS C ON (C.id = O.customer_id)
WHERE O.item_name <> 'test item'