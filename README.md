# employeeDetails
Spring boot MS-
employeeDetails service as three end-points

###Create a /employee/place/{place}/salary/{percentage} PUT endpoint that will update each record by increasing their salary by percentage(percentage path param) 
for employees that have place matching with place path param.(Use java 8 for transformation). Make sure increase percentage cannot be more than 55%.

1)sample Request:
http://localhost:8080/employee/place/hyderabad/salary/54  ---> PUT method


Response: 
[
    {
        "employeeId": 1,
        "employeeName": "anu",
        "title": "SE",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 100,
        "competency": 10,
        "salary": 154000
    },
    {
        "employeeId": 3,
        "employeeName": "cnu",
        "title": "ASE",
        "businessUnit": "admin",
        "place": "hyderabad",
        "supervisorId": 300,
        "competency": 30,
        "salary": 770000
    },
    {
        "employeeId": 6,
        "employeeName": "firdoz",
        "title": "HR",
        "businessUnit": "recruitment",
        "place": "hyderabad",
        "supervisorId": 100,
        "competency": 10,
        "salary": 154000
    },
    {
        "employeeId": 8,
        "employeeName": "bindu",
        "title": "DTL",
        "businessUnit": "hardware",
        "place": "hyderabad",
        "supervisorId": 100,
        "competency": 10,
        "salary": 154000
    },
    {
        "employeeId": 9,
        "employeeName": "sandhya",
        "title": "SE",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 300,
        "competency": 30,
        "salary": 693000
    },
    {
        "employeeId": 10,
        "employeeName": "hari",
        "title": "SEA",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 100,
        "competency": 10,
        "salary": 184800
    },
    {
        "employeeId": 12,
        "employeeName": "prakash",
        "title": "SA",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 300,
        "competency": 30,
        "salary": 723800
    },
    {
        "employeeId": 13,
        "employeeName": "srikanth",
        "title": "SE",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 100,
        "competency": 10,
        "salary": 215600
    },
    {
        "employeeId": 15,
        "employeeName": "laxmi",
        "title": "SSE",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 200,
        "competency": 20,
        "salary": 338800
    },
    {
        "employeeId": 18,
        "employeeName": "mokshu",
        "title": "SE",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 200,
        "competency": 20,
        "salary": 385000
    },
    {
        "employeeId": 19,
        "employeeName": "purvik",
        "title": "SSE",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 100,
        "competency": 10,
        "salary": 154000
    },
    {
        "employeeId": 20,
        "employeeName": "vamshi",
        "title": "SE",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 400,
        "competency": 40,
        "salary": 924000
    },
    {
        "employeeId": 22,
        "employeeName": "shiva",
        "title": "SA",
        "businessUnit": "software",
        "place": "hyderabad",
        "supervisorId": 400,
        "competency": 40,
        "salary": 1001000
    }
]


###Create an endpoint to return the list of employees for a given place from the DB in a page size of 5. 

2) http://localhost:8080/getEmployeesByPlace/hyderabad?page=1&size=5
{
    "totalItems": 13,
    "currentPage index": 1,
    "totalPages": 3,
    "employees": [
        {
            "employeeId": 10,
            "employeeName": "hari",
            "title": "SEA",
            "businessUnit": "software",
            "place": "hyderabad",
            "supervisorId": 100,
            "competency": 10,
            "salary": 120000
        },
        {
            "employeeId": 12,
            "employeeName": "prakash",
            "title": "SA",
            "businessUnit": "software",
            "place": "hyderabad",
            "supervisorId": 300,
            "competency": 30,
            "salary": 470000
        },
        {
            "employeeId": 13,
            "employeeName": "srikanth",
            "title": "SE",
            "businessUnit": "software",
            "place": "hyderabad",
            "supervisorId": 100,
            "competency": 10,
            "salary": 140000
        },
        {
            "employeeId": 15,
            "employeeName": "laxmi",
            "title": "SSE",
            "businessUnit": "software",
            "place": "hyderabad",
            "supervisorId": 200,
            "competency": 20,
            "salary": 220000
        },
        {
            "employeeId": 18,
            "employeeName": "mokshu",
            "title": "SE",
            "businessUnit": "software",
            "place": "hyderabad",
            "supervisorId": 200,
            "competency": 20,
            "salary": 250000
        }
    ]
}




### Create an endpoint to return the range of salaries for a given Competency.
SampleRequest:

3) http://localhost:8080/fetchRangeOfSalariesForGivenCompetency/10
Sample Response:
{
    "range": "100000-400000"
}


Swagger API Details:
http://localhost:8080/swagger-ui.html

http://localhost:8080/swagger-ui.html#!/employee45controller45impl/updateEmployeeUsingPUT
