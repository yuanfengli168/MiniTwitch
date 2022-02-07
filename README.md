# MiniTwitch
- Start date: 02042022
- Author: Yuanfeng Li

## Final Product Showcase:
1. YouTube link full video: https://youtu.be/WpMmNps2_uQ
2. YouTube link for Registration and Login: https://youtu.be/PqwwdydQoxo

**Tech Stacks**:
- Frontend:
*HTML, JavaScript, React, Ant Design, REST API*
- Backend:
*Java, Spring MVC, Tomcat, MySQL*
- Deployment on AWS:
*EC2 (instance hold Tomcat server), RDS (MySQL database implement data tier)*

**Project process (using Spring MVC)**:
![Spring MVC process for the project](./SpringMVC.PNG)
## Steps in history: 
1. set up - 02042022
2. prototype deployed on AWS, showcases recorded - 02052022
3. game controller implementation: 02062022
4. 02072022 - Spring MVC:


## Concepts Explain
1. Spring MVC:
    - Objectives: 1) Understand the concept of MVC; 2) What is Spring MVC framework used for; 
    3)How to use Spring MVC to build REST API;
    - Annotations: 
      1) @Controller; @Configuration;
      2) @RequestParam; @PathVariable;
      3) @Autowired -> field or constructor method level;
      4) @Component -> class level;
    - IOC:
      - Inversion of Control, (singleton)
      - PROs: 1) prevent massive code change; 2) No 'new' keyword; 3)
      - CONs:
      - Two main methods: 1) Constructor injection; 2) Field injection