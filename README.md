## Intro

Eureka defined in eureka-server and runs in port `8000`

Gateway runs defined in `gateway` and runs in port `10010` The gateway means all the request can be access in the port of gateway, e.g. `http://localhost:10010/api/hello/abc`

The rest are all Eureka client with different functionality and can be seen from there name.

The DB connection is only implemnted in user-service by means of `MyBatis-plus` (I think this is the fastest way to finish this task), and in `user-service` the `lombok` is enabled. If u want to change the DB connection to your lcoal DB, please refre `application-bryan.yml` to configure jdbc url.

![image](https://github.com/DEAN-Cherry/Spring-Cloud-Demo/assets/76607677/96bf3b4e-78d1-452b-8279-25e7c45515bf)

`UserMapper` here is the interface that access the DB.

If u want to use `gateway`, please refer `applicaiotn.yml` in it. This is the place defines where and what kind request should be send to.
![image](https://github.com/DEAN-Cherry/Spring-Cloud-Demo/assets/76607677/f6bcdf5b-32ad-4a33-b6b2-fb169f18b9bf)
lb here refers to Load Balance.

## Load Balacne Feature

In case u figured out how to run mutiple Application ![image](https://github.com/DEAN-Cherry/Spring-Cloud-Demo/assets/76607677/29b62035-3377-483f-9cf2-25bf5f943a8e)

u can try to access `localhost://10010/api/hello/abc` and refresh it. This method implements Load Balance by the `gateway`.
There is another url u can try, which is `localhost://10010/api/user/hello/abc`. This method implements Load Balance by `Feign` and it is a request from one sevice(user-service) to another service(hello-service).
And this kind of manipulation is largely dependent on `HelloClient` defined in `user-service`. 


## Connection with db
![image](https://github.com/DEAN-Cherry/Spring-Cloud-Demo/assets/76607677/6b9201b4-5d4d-49d3-b6af-dd85c5996a7f)

![image](https://github.com/DEAN-Cherry/Spring-Cloud-Demo/assets/76607677/cd180197-e5ff-47c5-99b6-62e18d000a2f)


