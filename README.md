#### Production Readiness:
1. Functional requirements
1. NFR (Non-functional requirements)

#### Functional Requirements:
1. Functional requirements are satisfied and tested well
1. Testing: 
    1. TDD: write test and function skeletons -> create the tests first before implementing the code -> make the tests pass
    1. BDD: create sentences -> testers can easily write tests
    1. Spring Integration tests
    1. TestNG/jUnit/Mocked Unit Tests

#### NFR:
1. Security:
    1. apps are in private subnet e.g.: Private SN, Routing Tables, Security Groups
    1. role/scope based authorization e.g.: JWT tokens, LDAP
    1. using hardened images e.g.: docker images
    1. secrets/passwords should be stored in Key Management stores e.g.: GitLab Secret Variables, SSM, KSM
1. HA (High Availability)/Reliability: 
    1. auto-scaling up/down based on the usage e.g.: CPU/Memory metrics
    1. running apps in more availability zone e.g.: Private SN-1/SN-2
    1. Service Discovery is a SPOF e.g.: Eureka, Netflix Zuul
1. Fault tolerant: 
    1. load balancing on client(e.g.: Spring Eureka-aware load balanced templates)/server side(e.g.: docker load balancer)
    1. using patterns e.g.: Circuit Breaker (Netflix Hystrix in Spring)
1. Monitoring: 
    1. real-time monitoring/heartbeat e.g.: micrometer, Spring Actuator
    1. using monitoring webapps e.g.: Grafana
1. Backup and Restore:
    1. e.g.: AWS Lambda based auto backup triggered by CloudWatch
