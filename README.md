# Spring-Boot-Spring-Data-JPA-

[https://youtu.be/5rNk7m_zlAg](https://www.youtube.com/watch?v=5rNk7m_zlAg&list=WL&index=2)

<img width="619" alt="image" src="https://github.com/user-attachments/assets/dac26849-628e-408b-abf4-7fda2b34593f" />


@Component mark as Spring Component
Constructor-dependency injection is done using @Autowired(optional when only one constructor)


<img width="706" alt="image" src="https://github.com/user-attachments/assets/bfcef3ae-550a-4d85-9cf3-3e2113af3a73" />

<img width="926" alt="image" src="https://github.com/user-attachments/assets/dbfcee3b-09cc-4b20-8632-d46a1017150f" />

## In Constructor injection we can use @Qualifer to select which one will be injected
@Qulaifer("primary") @Qualifer("secondary") 
@Primary directly set priority

## Use constructors for mandatory dependencies and setter methods or configuration methods for optional dependencies.

# Bean Scope
<img width="877" alt="image" src="https://github.com/user-attachments/assets/8db99746-e022-4cf3-93f2-ce8d4933c660" />
<img width="593" alt="image" src="https://github.com/user-attachments/assets/70963c06-29f5-4fd4-a150-d2bcb1029b09" />

# Intelij

# Spring gives you dependency injection
normal : make class > make method > call the class on main script > call the method

## You need to utilize the benefit of boot ( Dependency Injection)
Make Constructor on main script with @Bean > declare the new class with getBean();
<img width="606" alt="image" src="https://github.com/user-attachments/assets/56e574ba-5d87-44c7-8ee6-0bd283aa164a" />

# @Component
when you add this tag on class spring boot scan the file and recognize that class as spring bean automatically

## We can use @Repository, @Service > in document @Component is already used in @Service

# @Configuration spring boot scan up when start up the app

# Dependency using Constructor
@Autowired let spring boot knows where to inject dependencies


"Injecting the dependency" means providing the necessary objects (or services) that a class needs to function, without the class having to create or manage those objects itself.

### @Autowired link automatically if it has one bean
### Use @Qualifer if you have multiple bean
@Qualifer("name") can use inside of constructor attribute

## you can set @Primary to give bean priority

## when we don't give bean name method will be bean name

# when @Autowired comes > spring boot tries to use that without class

### we also has setter injections but the Most used one is Constructor Injection

## @PropertySource
when inject source from outside of application.properties

for one : use @PropertySource 

for multiple : use @PropertySources({   @PropertySource....   })
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-file-2.properties")
})

### $ in @Value > refer to external configuration file
