# qantas-challenge
This repository has code for qantas technical test.
1. The API contract definitions has been done in RAML. The contract has api's for creating, updating, deleting and geeting a customer.
2. Code for the API has been done in Spring boot assuming that it will be connecting CRM systems using rest api.
3. Basic spring security has been impleted using using username/ password.
4. High level integration design has been done for create customer. 
 
Design Considerations

I have assumed that all fields in customer class and will map directly to customer object in CRM system amd contact address will be treated as a list where the type (Residential/ Office) field will tell us address type.
