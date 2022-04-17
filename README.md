# ecandy

## How to Run?
## MIX applications -1 
### service-discovery
  * eureka.client.service-url.defaultZone=http://localhost:8666/eureka

### employee
   * server.port = 8668
   * DB: In-Memory
   * http://localhost:8668/Employees
   
### product
   * server.port = 8667
   * DB: Mariadb, MyBatis
   * http://localhost:8667/Products
   * http://localhost:8667/Products/employees

## MIX applications -2 --not work?@judy

### eureka-server
* eureka:
    client: 
      serviceUrl:
        defaultZone: http://localhost:8100/eureka

### api-gateway
  * server.port = 17900

### sales-order
  * server.port = 9001

### user
  * server.port = 9999
