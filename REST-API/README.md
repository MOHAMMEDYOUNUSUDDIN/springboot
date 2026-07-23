Chapter 1: REST API Kya Hai?

Sabse pehle REST API samajhne se pehle ek question.

Jab tum Swiggy ya Zomato open karte ho...

Tumne "Burger" search kiya.

Ab kya hua?

Mobile App
|
| "Burger do"
|
Internet
|
Server
|
Database

Server database se burger ki list laata hai aur phone pe bhej deta hai.

Ye jo request bhejna aur response lena hota hai...

Isi communication ko hum API bolte hain.

API Kya Hai?

API = Application Programming Interface

Simple language me

API do applications ke beech ka waiter hai.

Restaurant example.

Customer
|
| Order
|
Waiter(API)
|
Kitchen(Server)

Customer kitchen me nahi jaata.

Waiter order leta hai.

Kitchen food banata hai.

Waiter food laata hai.

Exactly waise hi.

Frontend
|
|
REST API
|
Backend(Spring Boot)
|
Database

Frontend kabhi database se direct baat nahi karta.

API ke through karta hai.

REST Kya Hai?

REST ka full form

Representational State Transfer

Naam bada hai.

Kaam bahut simple hai.

REST bas ek rule book hai.

Ye batata hai ki API kaise design karni hai.

Jaise traffic rules.

Car chalana alag cheez hai.

Rules follow karna alag.

REST bhi sirf rules hai.

Real Life Example

Tumhare college ka portal.

Student Login karta hai.

Student
|
Login
|
Spring Boot
|
Database

Student bolta hai

Mujhe mera profile do

Backend bolta hai

Ye lo profile

Ye REST API hai.

REST API ka Data Format

Mostly

JSON

Example

{
"id":1,
"name":"Younus",
"branch":"CSE"
}

Frontend isi format me data receive karta hai.

Spring Boot REST API

Spring Boot me REST API banana bahut easy hai.

Bas Controller bana dete hain.

Controller requests handle karta hai.

Controller Kya Hai?

Imagine

College Office

Bahut log aaye.

Koi TC ke liye.

Koi Bonafide ke liye.

Koi Fee Receipt ke liye.

Office ka employee sabki request sunta hai.

Controller bhi wahi karta hai.

Frontend
|
Request
|
Controller
|
Service
|
Repository
|
Database

Controller request receive karta hai.

REST API ka Flow

Ye bahut important hai.

React

↓

HTTP Request

↓

Controller

↓

Service

↓

Repository

↓

Database

↓

Repository

↓

Service

↓

Controller

↓

JSON Response

↓

React

Ye pura flow yaad rakhna.

HTTP Kya Hai?

HTTP internet ki language hai.

Frontend aur Backend isi language me baat karte hain.

Example

React

Give me all students

Spring Boot

Okay.

HTTP ke through communication hota hai.

HTTP Methods

Sabse important topic.

Har method ka alag kaam hota hai.

GET

Kaam

Data lena.

Example

Show all students

Restaurant

Menu dikhao.

Sirf dekhna hai.

Kuch change nahi karna.

POST

Kaam

Naya data add karna.

Example

Add Student

Restaurant

1 Pizza Order karo.

Naya order create hua.

PUT

Kaam

Existing data update karna.

Example

Change Student Name

Restaurant

Cold drink ki jagah Juice kar do.
DELETE

Kaam

Data delete karna.

Example

Delete Student

Restaurant

Order cancel.
Easy Trick
Method	Meaning
GET	Read
POST	Create
PUT	Update
DELETE	Delete

Shortcut

CRUD

Create

Read

Update

Delete
URL Kya Hai?

Har API ka ek address hota hai.

Example

/students

Ya

/employees

Ya

/products

Jaise ghar ka address hota hai.

API ka bhi hota hai.

Example APIs
Get All Students
GET

/students

Response

[
{
"id":1,
"name":"Younus"
},
{
"id":2,
"name":"Rahul"
}
]
Get One Student
GET

/students/1

Response

{
"id":1,
"name":"Younus"
}
Add Student
POST

/students

Body

{
"name":"Younus"
}
Update Student
PUT

/students/1

Body

{
"name":"Mohammed Younus"
}
Delete Student
DELETE

/students/1

Student delete.

Spring Boot Annotations

Ye annotations REST API banane me use hote hain.

@RestController

Matlab

Ye class REST API banayegi.

@GetMapping

GET request handle karega.

GET /students
@PostMapping

POST request handle karega.

POST /students
@PutMapping

PUT request handle karega.

@DeleteMapping

DELETE request handle karega.

@RequestBody

Frontend jo JSON bhejta hai usko Java Object me convert karta hai.

Example

Frontend

{
"name":"Younus"
}

↓

Java Object

Student
@PathVariable

URL se value lena.

Example

/students/10

Yahan

10

Path Variable hai.

Real Project Example

College Management System

Student Login
POST

/login
Student Details
GET

/student/1
Add Student
POST

/student
Update Student
PUT

/student/1
Delete Student
DELETE

/student/1

Ye sab REST APIs hain.

Complete Flow
React

↓

GET /students

↓

Controller

↓

Service

↓

Repository

↓

MySQL

↓

Repository

↓

Service

↓

Controller

↓

JSON

↓

React
Interview Questions
REST API kya hoti hai?

REST API ek standard way hai jisse frontend aur backend HTTP ke through communicate karte hain. Data aam taur par JSON format me exchange hota hai.

Controller ka kaam?

Controller client se request receive karta hai, usse service layer ko bhejta hai, aur response wapas client ko return karta hai.

GET aur POST me difference?
GET: Data ko fetch (read) karne ke liye.
POST: Naya data create (add) karne ke liye.
CRUD ka full form?
C = Create
R = Read
U = Update
D = Delete
Ek Chhota Real-Life Analogy

Socho tum library gaye ho:

GET → "Mujhe Java ki book dikhao." (Sirf dekhna/leni hai)
POST → "Main ye nayi book library me donate karna chahta hoon." (Nayi entry)
PUT → "Is book ka title galat hai, ise update karo." (Update)
DELETE → "Ye purani damaged book hata do." (Delete)

Librarian ko tumhari request milti hai, woh records check karta hai aur answer deta hai. Spring Boot me Controller us librarian ki tarah kaam karta hai.

📌 Summary (Ye yaad rakhna)
REST = API banane ke rules

API = Frontend aur Backend ke beech communication

HTTP = Communication protocol

JSON = Data bhejne ka format

Controller = Request receive karta hai

Service = Business logic

Repository = Database se baat karta hai

GET = Read

POST = Create

PUT = Update

DELETE = Delete

Learning order (recommended):

REST API concept ✔️
HTTP methods (GET, POST, PUT, DELETE) ✔️
JSON ✔️
@RestController
@GetMapping, @PostMapping, @PutMapping, @DeleteMapping
@PathVariable & @RequestBody
Controller → Service → Repository flow
Database integration (MySQL/JPA)
Build a complete CRUD REST API project

Agar ye concepts clear ho gaye, to Spring Boot ka 50% backend development samajhna bahut aasaan ho jata hai.