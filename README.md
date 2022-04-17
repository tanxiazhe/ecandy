# ecandy

## How to Run?

## service-discovery
  eureka.client.service-url.defaultZone=http://localhost:8666/eureka

## employee
   * server.port = 8668
   * DB: In-Memory
   * http://localhost:8668/Employees
   
## product
   * server.port = 8667
   * DB: Mariadb, MyBatis
   * http://localhost:8667/Products
   * http://localhost:8667/Products/employees