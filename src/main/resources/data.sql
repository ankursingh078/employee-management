DROP TABLE IF EXISTS employee;

CREATE TABLE employee(
    employeeId INT AUTO_INCREMENT PRIMARY KEY,
    empName VARCHAR(100) NOT NULL,
    designation VARCHAR(100) NOT NULL,
    joiningDate VARCHAR(40) NOT NULL,
    salary DECIMAL NOT NULL
);

INSERT INTO employee(employeeId,empName,designation,joiningDate,salary)
VALUES(1,'ANKUR SINGH','DEVELOPER','2019-09-03 04:24 PM',25000.00);