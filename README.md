In this project I have learnt some topics like:-
1. Thymeleaf
2. Spring MVC
3. Model
4. Spring MVC Form Data Binding.
5. Spring MVC Form Validation.
   
Used some Annotations :-
1. HttpServletRequest:-  The HttpServletRequest interface extends the ServletRequest interface. It provides request information for HTTP servlets. When a client (e.g., a web browser) sends an HTTP request to your 
                         Spring Boot application, the servlet container creates an HttpServletRequest object and passes it as an argument to the servlet’s service methods (such as doGet, doPost, etc.).
                         Why Do We Use HttpServletRequest?: - Accessing Request Parameters: You can use HttpServletRequest to retrieve query parameters, form data, and other request parameters sent by the client. 
                         Reading Request Body:-The HttpServletRequest exposes the getInputStream() method to read the request body. You can use it to process the content sent by the client (e.g., JSON, XML, or 
                         plain text).
                         Handling Headers and Cookies:- Extract information from request headers (e.g., user agent, content type).
                         Access cookies sent by the client.
                         Retrieve the requested URL, context path, and path info.
                         Security and Authentication:- Check authentication details, user roles, and security-related information.
                         While HttpServletRequest provides powerful capabilities, consider using higher-level abstractions (such as Spring’s @RequestParam or @RequestBody) whenever possible.
                         These abstractions simplify request handling and integrate well with Spring Boot features.
                         In summary, HttpServletRequest allows you to interact with incoming HTTP requests, extract data, and manage session-related information in your Spring Boot application.
3. @RequestParam
4. @ModelAttribute
5. @Value
