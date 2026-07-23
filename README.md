# Creator store

- Problem statement


Just like an ecommerce shop.

- We have a store with some items.


Store owner
- Create an item
- Update an item
- Delete a item
- Read a item
- Read all items

As a Customer:
- Read all products
- Read an indv product
- Place an order
- View my history 

Product:
- Name
- Price
- Stock
- Category
- Description

Order:
- Customer name
- Customer email
- Order summary products
- Status

Relations:
- One order can contain many products - (1 to many)
- One product can appear in many order items - (1 to many)

Api needed:

Products:
- Create Post /products
- Update Put /products/{id}
- Delete Delete /products/{id}
- Read Get /products/{id}
- Read all Get /Products

Order:
- Place post/orders
- Get Get/orders/{id}
- Get all Get/orders

Major Deps using:
- Spring web - for the rest api’s/
- Postgresql - for the db drivers
- Spring Data Jpa - for the db and spring connection
- OpenApi - for the documentation 


- Make sure do some setup related db and application in the application.properties file

- Need to add annotations for the class to access the spring properties {@Entity, @setter, @Getter....}

Repository:
- Which is used to communicate with the db and data.

Queries:

- Where to use the Jsonbackreference and JsonmanagedReferences?
-     @Transactional? why it is?


