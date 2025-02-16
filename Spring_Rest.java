#REST : Representational State Transfer

stateless : server do not save the previous request so every request is independent 

client and server is also independent so we need to make request between these

## @RestController // @RequestMapping
These two are the most use annotation
<img width="955" alt="image" src="https://github.com/user-attachments/assets/1cfa3cbf-1ff3-4afa-95a5-329a263302db" />


## Process

1. make "FirstController" Class > add RestController annotation
2. makae method with @GetMapping("/url")
3. @RestStatus used for exception control

if you don't use @RestStauts server return automatically 

### Post
we use @Requestbody in request method 

# We need to set Getter and Setter > this called Accessor to transfer data and serialize the object

## When you use @JsonProperty on value you need to fit the name with JSON data and your fields

# Record
after java 14 Spring boot can make "Record"
<img width="327" alt="image" src="https://github.com/user-attachments/assets/f6eeede9-85b0-43c9-95c1-7a374ab124fb" />
it looks like this and 
## You don't need Accessor

# PathVariable

<img width="452" alt="image" src="https://github.com/user-attachments/assets/8985e117-e243-4e56-9dd3-d22dbf7dcc9e" />

@GetMapping and @PathVariable communicate by same url path-name

and we just get the value as how we type in

<img width="616" alt="image" src="https://github.com/user-attachments/assets/9c3ecf2e-3ce5-4b3c-ba73-bda25257eb60" />

>> (we use "/hello" but it makes spring boot confuse. even u use different method need to use unique mapping)

by the way if you want to get multiple value u can use @RequestParam

if url and parameter is match > return value you wants

? : starts to input the value 

& : move to next value 

# Spring find the annotations and annotation gives teach how to work @RestController is like center instructor and Mapping is for each page

## mapping makes specific method works

<img width="1238" alt="image" src="https://github.com/user-attachments/assets/854a91b3-0b26-4317-8dfc-d911ee09cc4d" />
